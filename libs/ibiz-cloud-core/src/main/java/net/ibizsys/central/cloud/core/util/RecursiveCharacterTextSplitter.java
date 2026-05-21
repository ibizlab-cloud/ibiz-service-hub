package net.ibizsys.central.cloud.core.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.springframework.util.StringUtils;

import com.knuddels.jtokkit.api.Encoding;
import com.knuddels.jtokkit.api.EncodingType;

/**
 * 基于Token的递归字符文本分割器 使用JTokkit库进行Token计数，适用于大语言模型的文本处理
 */
public class RecursiveCharacterTextSplitter {
	private int chunkSize;
	private int chunkOverlap;
	private List<String> separators;
	private Encoding encoding;
	private boolean keepSeparator;
	private int maxRecursionDepth;

	// Token计数缓存优化性能
	private final Map<String, Integer> tokenCache;
	private static final int DEFAULT_CACHE_SIZE = 1000;

	// 缓存命中率统计
	private long cacheHits = 0;
	private long cacheMisses = 0;

	// 默认分隔符（针对中文优化）
	private static final List<String> DEFAULT_SEPARATORS = Arrays.asList("\r\n", "\n", "。", "？", "！", "；", "，", ".", "?", "!", ";", ",", " ", "");

	/**
	 * 基础构造函数
	 */
	public RecursiveCharacterTextSplitter(List<String> separators, int chunkSize, int chunkOverlap) {
		this(separators, chunkSize, chunkOverlap, EncodingType.CL100K_BASE);
	}

	/**
	 * 指定编码类型的构造函数
	 */
	public RecursiveCharacterTextSplitter(List<String> separators, int chunkSize, int chunkOverlap, EncodingType encodingType) {
		this(separators, chunkSize, chunkOverlap, encodingType, false, 50, DEFAULT_CACHE_SIZE);
	}

	/**
	 * 指定模型名称的构造函数
	 */
	public RecursiveCharacterTextSplitter(List<String> separators, int chunkSize, int chunkOverlap, String modelName) {
		this(separators, chunkSize, chunkOverlap, modelName, false, 50, DEFAULT_CACHE_SIZE);
	}

	/**
	 * 完整构造函数（编码类型）
	 */
	public RecursiveCharacterTextSplitter(List<String> separators, int chunkSize, int chunkOverlap, EncodingType encodingType, boolean keepSeparator, int maxRecursionDepth, int cacheSize) {
		this.separators = separators != null ? new ArrayList<>(separators) : DEFAULT_SEPARATORS;
		this.chunkSize = chunkSize;
		this.chunkOverlap = chunkOverlap;
		this.keepSeparator = keepSeparator;
		this.maxRecursionDepth = maxRecursionDepth;
		this.encoding = JTokenKitUtils.getEncoding(encodingType);
		this.tokenCache = new LinkedHashMap<String, Integer>(cacheSize, 0.75f, true) {
			@Override
			protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
				return size() > cacheSize;
			}
		};
		validateParameters();
	}

	/**
	 * 完整构造函数（模型名称）
	 */
	public RecursiveCharacterTextSplitter(List<String> separators, int chunkSize, int chunkOverlap, String modelName, boolean keepSeparator, int maxRecursionDepth, int cacheSize) {
		this.separators = separators != null ? new ArrayList<>(separators) : DEFAULT_SEPARATORS;
		this.chunkSize = chunkSize;
		this.chunkOverlap = chunkOverlap;
		this.keepSeparator = keepSeparator;
		this.maxRecursionDepth = maxRecursionDepth;
		
		this.encoding = JTokenKitUtils.getEncodingForModel(modelName);
		this.tokenCache = new LinkedHashMap<String, Integer>(cacheSize, 0.75f, true) {
			@Override
			protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
				return size() > cacheSize;
			}
		};
		validateParameters();
	}

	/**
	 * 参数验证
	 */
	private void validateParameters() {
		if (chunkSize <= 0) {
			throw new IllegalArgumentException("chunkSize must be positive");
		}
		if (chunkOverlap < 0) {
			throw new IllegalArgumentException("chunkOverlap must be non-negative");
		}
		if (chunkOverlap >= chunkSize) {
			throw new IllegalArgumentException("chunkOverlap must be less than chunkSize");
		}
		if (maxRecursionDepth <= 0) {
			throw new IllegalArgumentException("maxRecursionDepth must be positive");
		}
	}

	/**
	 * 计算文本的Token数量（带缓存）[4](@ref)
	 */
	private int countTokens(String text) {
		if (!StringUtils.hasText(text)) {
			return 0;
		}

		// 检查缓存
		Integer cached = tokenCache.get(text);
		if (cached != null) {
			cacheHits++;
			return cached;
		}

		cacheMisses++;
		int tokenCount = encoding.encode(text).size();
		tokenCache.put(text, tokenCount);
		return tokenCount;
	}

	/**
	 * 分割文本的主方法 [1,2](@ref)
	 */
	public List<String> splitText(String text) {
		if (!StringUtils.hasText(text)) {
			return new ArrayList<>();
		}
		return splitTextRecursive(text, 0);
	}

	/**
	 * 递归分割文本 [4](@ref)
	 */
	private List<String> splitTextRecursive(String text, int depth) {
		// 检查递归深度
		if (depth > maxRecursionDepth) {
			System.err.println("Warn: Max recursion depth reached, using force split");
			return forceSplit(text);
		}

		// 如果文本本身已经小于等于chunkSize，直接返回 [1](@ref)
		int textTokenCount = countTokens(text);
		if (textTokenCount <= chunkSize) {
			return Arrays.asList(text);
		}

		// 查找最适合的分隔符 [2](@ref)
		String separator = findSeparator(text);
		List<String> splits = splitBySeparator(text, separator);

		return mergeSplitsWithRecursion(splits, separator, depth);
	}

	/**
	 * 带递归的合并分割块 [4](@ref)
	 */
	private List<String> mergeSplitsWithRecursion(List<String> splits, String separator, int depth) {
		List<String> finalChunks = new ArrayList<>();
		List<String> currentChunkParts = new ArrayList<>();
		int currentTokenCount = 0;
		int separatorTokenCount = countTokens(separator);

		for (String split : splits) {
			int splitTokenCount = countTokens(split);

			// 计算添加当前分割块后的总Token数（包括分隔符）
			int potentialTokenCount = currentTokenCount + splitTokenCount;
			if (!currentChunkParts.isEmpty()) {
				potentialTokenCount += separatorTokenCount;
			}

			if (splitTokenCount > chunkSize) {
				// 当前分割块太大，先处理之前积累的小块
				if (!currentChunkParts.isEmpty()) {
					String chunk = joinTextParts(currentChunkParts, separator);
					finalChunks.add(chunk);
					currentChunkParts.clear();
					currentTokenCount = 0;
				}

				// 递归处理大块 [4](@ref)
				List<String> subChunks = splitTextRecursive(split, depth + 1);
				finalChunks.addAll(subChunks);
			} else if (potentialTokenCount <= chunkSize) {
				// 可以添加到当前块
				currentChunkParts.add(split);
				currentTokenCount = potentialTokenCount;
			} else {
				// 当前块已满，保存并创建新块
				if (!currentChunkParts.isEmpty()) {
					String chunk = joinTextParts(currentChunkParts, separator);
					finalChunks.add(chunk);

					// 设置重叠部分 [1,4](@ref)
					if (chunkOverlap > 0) {
						currentChunkParts = calculateOverlapParts(currentChunkParts, separator);
						currentTokenCount = countTokens(joinTextParts(currentChunkParts, separator));
					} else {
						currentChunkParts.clear();
						currentTokenCount = 0;
					}
				}

				// 添加当前分割到新块
				currentChunkParts.add(split);
				currentTokenCount += splitTokenCount;
			}
		}

		// 处理最后剩余的部分
		if (!currentChunkParts.isEmpty()) {
			String chunk = joinTextParts(currentChunkParts, separator);
			finalChunks.add(chunk);
		}

		return finalChunks;
	}

	/**
	 * 计算重叠部分 [4](@ref)
	 */
	private List<String> calculateOverlapParts(List<String> currentParts, String separator) {
		int separatorTokenCount = countTokens(separator);
		List<String> overlapParts = new ArrayList<>();
		int overlapRemaining = chunkOverlap;
		int currentOverlapTokens = 0;

		// 从后往前取部分，直到满足重叠要求
		for (int i = currentParts.size() - 1; i >= 0 && overlapRemaining > 0; i--) {
			String part = currentParts.get(i);
			int partTokenCount = countTokens(part);

			if (currentOverlapTokens + partTokenCount <= chunkOverlap) {
				overlapParts.add(0, part); // 插入到开头
				currentOverlapTokens += partTokenCount;
				if (i > 0) {
					currentOverlapTokens += separatorTokenCount;
				}
			} else {
				// 部分添加以达到精确重叠
				break;
			}
			overlapRemaining = chunkOverlap - currentOverlapTokens;
		}

		return overlapParts;
	}

	/**
	 * 强制分割（递归深度超过限制时的回退策略）[4](@ref)
	 */
	private List<String> forceSplit(String text) {
		List<String> chunks = new ArrayList<>();
		int textLength = text.length();

		// 使用字符分割作为fallback，但尽量在合理边界处分割
		int start = 0;
		while (start < textLength) {
			// 估算Token长度（平均每个中文字符约1.5个token，英文字符约0.3个token）
			int estimatedChunkSizeChars = (int) (chunkSize * 0.7); // 保守估计
			int end = Math.min(start + estimatedChunkSizeChars, textLength);

			// 寻找好的分割点 [4](@ref)
			int actualEnd = findGoodSplitPoint(text, end);
			if (actualEnd <= start) {
				actualEnd = end;
			}

			String chunk = text.substring(start, actualEnd);
			chunks.add(chunk);

			// 移动起始位置，考虑重叠
			int estimatedOverlapChars = (int) (chunkOverlap * 0.7);
			start = Math.max(start + 1, actualEnd - estimatedOverlapChars);

			if (start >= actualEnd) {
				start = actualEnd;
			}
		}

		return chunks;
	}

	/**
	 * 寻找好的分割点（尽量不在单词中间分割）[4](@ref)
	 */
	private int findGoodSplitPoint(String text, int position) {
	    if (position >= text.length()) {
	        return text.length();
	    }
	    
	    // 优先在句子边界处分割
	    char[] sentenceEnders = {'.', '。', '!', '！', '?', '？', ';', '；', '…'};
	    for (int i = Math.min(position, text.length() - 1); i > Math.max(0, position - 100); i--) {
	        for (char ender : sentenceEnders) {
	            if (text.charAt(i) == ender) {
	                // 确保不是连续标点（如"!!!"）
	                if (i + 1 < text.length() && text.charAt(i + 1) != ender) {
	                    return i + 1;
	                }
	            }
	        }
	    }
	    
	    // 其次在词语边界处分割
	    for (int i = Math.min(position, text.length() - 1); i > Math.max(0, position - 50); i--) {
	        char c = text.charAt(i);
	        if (c == ' ' || c == '，' || c == '、' || c == ',' || c == '；' || c == ';' || 
	            c == '：' || c == ':' || c == '\t' || c == '\n' || c == '\r') {
	            return i + 1;
	        }
	    }
	    
	    // 最后在合适的中文字符边界分割（避免在连续中文字符中间分割）
	    for (int i = Math.min(position, text.length() - 1); i > Math.max(0, position - 20); i--) {
	        char c = text.charAt(i);
	        // 如果是标点符号、空格或换行符
	        if (Character.isWhitespace(c) || isChinesePunctuation(c)) {
	            return i + 1;
	        }
	    }
	    
	    return position;
	}

	private boolean isChinesePunctuation(char c) {
	    return c == '，' || c == '。' || c == '！' || c == '？' || c == '；' || 
	           c == '：' || c == '、' || c == '「' || c == '」' || c == '『' || 
	           c == '』' || c == '《' || c == '》' || c == '（' || c == '）';
	}

	/**
	 * 查找最适合的分隔符 [1,2](@ref)
	 */
	private String findSeparator(String text) {
		for (String separator : separators) {
			if (StringUtils.hasLength(separator) && text.contains(separator)) {
				return separator;
			}
		}
		return "";
	}

	/**
	 * 根据分隔符分割文本（修复正则转义问题）[2](@ref)
	 */
	private List<String> splitBySeparator(String text, String separator) {
		if (!StringUtils.hasLength(separator)) {
			// 按字符分割并过滤空字符串
			return text.chars().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.toList());
		}

		// 使用正则转义防止特殊字符问题 [2](@ref)
		String escapedSeparator = Pattern.quote(separator);
		String[] parts = text.split(escapedSeparator, -1);

		// 如果需要保留分隔符，将分隔符添加回分割结果 [4](@ref)
		if (keepSeparator && !separator.isEmpty()) {
			List<String> result = new ArrayList<>();
			for (int i = 0; i < parts.length; i++) {
				if (i > 0) {
					result.add(separator);
				}
				result.add(parts[i]);
			}
			return result;
		}

		return Arrays.asList(parts);
	}

	/**
	 * 连接文本部分 [5](@ref)
	 */
	private String joinTextParts(List<String> docPartsList, String separator) {
		if (docPartsList.isEmpty()) {
			return "";
		}

		if (docPartsList.size() == 1) {
			return docPartsList.get(0);
		}

		StringBuilder result = new StringBuilder(docPartsList.get(0));
		for (int i = 1; i < docPartsList.size(); i++) {
			result.append(separator).append(docPartsList.get(i));
		}
		return result.toString().trim();
	}

	// ========== 工具方法和工厂方法 ==========

	/**
	 * 获取编码器信息 [4](@ref)
	 */
	public String getEncodingInfo() {
		return encoding != null ? encoding.getName() : "Unknown";
	}

	/**
	 * 获取缓存统计信息 [4](@ref)
	 */
	public Map<String, Object> getCacheStats() {
		Map<String, Object> stats = new LinkedHashMap<>();
		stats.put("cacheSize", tokenCache.size());
		stats.put("hits", cacheHits);
		stats.put("misses", cacheMisses);
		stats.put("hitRate", calculateCacheHitRate());
		return stats;
	}

	private double calculateCacheHitRate() {
		long total = cacheHits + cacheMisses;
		return total > 0 ? (double) cacheHits / total : 0.0;
	}

	/**
	 * 清空缓存 [4](@ref)
	 */
	public void clearCache() {
		tokenCache.clear();
		cacheHits = 0;
		cacheMisses = 0;
	}

	/**
	 * 创建默认配置的分割器 [1](@ref)
	 */
	public static RecursiveCharacterTextSplitter createDefault(int chunkSize, int chunkOverlap) {
		return new RecursiveCharacterTextSplitter(DEFAULT_SEPARATORS, chunkSize, chunkOverlap, EncodingType.CL100K_BASE, false, 50, DEFAULT_CACHE_SIZE);
	}

	/**
	 * 创建针对中文优化的分割器 [2,4](@ref)
	 */
	public static RecursiveCharacterTextSplitter createChineseOptimized(int chunkSize, int chunkOverlap) {
		List<String> chineseSeparators = Arrays.asList("\r\n", "\n", "。", "？", "！", "；", "，", "、", "：", " ", "");
		return new RecursiveCharacterTextSplitter(chineseSeparators, chunkSize, chunkOverlap, EncodingType.CL100K_BASE, false, 50, DEFAULT_CACHE_SIZE);
	}

	/**
	 * 创建针对代码优化的分割器 [4](@ref)
	 */
	public static RecursiveCharacterTextSplitter createCodeOptimized(int chunkSize, int chunkOverlap) {
		List<String> codeSeparators = Arrays.asList("\r\n\r\n", "\r\n", "\n\n", "\n", " ", "");
		return new RecursiveCharacterTextSplitter(codeSeparators, chunkSize, chunkOverlap, EncodingType.CL100K_BASE, true, 100, DEFAULT_CACHE_SIZE * 2);
	}

	/**
	 * 创建针对特定模型的分割器 [4](@ref)
	 */
	public static RecursiveCharacterTextSplitter createForModel(String modelName, int chunkSize, int chunkOverlap) {
		return new RecursiveCharacterTextSplitter(DEFAULT_SEPARATORS, chunkSize, chunkOverlap, modelName, false, 50, DEFAULT_CACHE_SIZE);
	}

	// ========== Getter和Setter方法 ==========

	public int getChunkSize() {
		return chunkSize;
	}

	public void setChunkSize(int chunkSize) {
		this.chunkSize = chunkSize;
		validateParameters();
	}

	public int getChunkOverlap() {
		return chunkOverlap;
	}

	public void setChunkOverlap(int chunkOverlap) {
		this.chunkOverlap = chunkOverlap;
		validateParameters();
	}

	public List<String> getSeparators() {
		return new ArrayList<>(separators);
	}

	public void setSeparators(List<String> separators) {
		this.separators = separators != null ? new ArrayList<>(separators) : DEFAULT_SEPARATORS;
	}

	public boolean isKeepSeparator() {
		return keepSeparator;
	}

	public void setKeepSeparator(boolean keepSeparator) {
		this.keepSeparator = keepSeparator;
	}

	public int getMaxRecursionDepth() {
		return maxRecursionDepth;
	}

	public void setMaxRecursionDepth(int maxRecursionDepth) {
		this.maxRecursionDepth = maxRecursionDepth;
	}

	public Encoding getEncoding() {
		return encoding;
	}
}