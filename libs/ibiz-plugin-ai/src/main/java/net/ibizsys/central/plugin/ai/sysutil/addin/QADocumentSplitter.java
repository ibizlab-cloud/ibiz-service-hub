package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.vladsch.flexmark.ext.tables.TablesExtension;
import com.vladsch.flexmark.ext.toc.TocExtension;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.MutableDataSet;
import com.vladsch.flexmark.util.misc.Extension;

import net.ibizsys.central.cloud.core.cloudutil.client.ICloudOSSClient;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ChunkType;
import net.ibizsys.central.plugin.ai.util.TextPreprocessUtils;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.domain.File;

/**
 * Q&A 文档分割器
 * 
 * @author lionlau
 *
 */
public class QADocumentSplitter extends DocumentSplitterBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(QADocumentSplitter.class);

	private static final Map<String, String> jsonContentFileExtMap = new HashMap<String, String>();
	static {
		jsonContentFileExtMap.put("csv", "");
		jsonContentFileExtMap.put("xls", "");
		jsonContentFileExtMap.put("xlsx", "");
		jsonContentFileExtMap.put("json", "");
	}

	@Override
	protected List<Chunk> doSplitText(Object documentId, String text, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		// 判断内容类型
		ObjectNode sheetArrays = null;
		try {
			sheetArrays = JsonUtils.toObjectNode(text);
		} catch (Throwable ex) {
			log.debug(String.format("解析文本JSON对象失败，使用Markdown模式"));
		}
		if (sheetArrays != null) {
			if (sheetArrays.size() == 0) {
				return Collections.EMPTY_LIST;
			}
			// 获取第一个分页
			ArrayNode rows = null;
			while (sheetArrays.fieldNames().hasNext()) {
				String name = sheetArrays.fieldNames().next();
				rows = (ArrayNode) sheetArrays.get(name);
				break;
			}
			//
			if (rows == null || rows.size() == 0) {
				return Collections.EMPTY_LIST;
			}

			List<Chunk> chunkList = new ArrayList<Chunk>();

			for (int i = 0; i < rows.size(); i++) {
				ArrayNode row = (ArrayNode) rows.get(i);
				int nMinLength = Math.min(2, row.size());
				if (nMinLength < 2)
					continue;

				String strQuestion = row.get(0).asText(null);
				if (ObjectUtils.isEmpty(strQuestion)) {
					continue;
				}

				String strAnswer = row.get(1).asText(null);
				if (ObjectUtils.isEmpty(strAnswer)) {
					continue;
				}

				String strContent = String.format("问: %1$s\n答: %2$s", strQuestion, strAnswer);

				String strText = TextPreprocessUtils.process(strContent, parserConfig);
				if (!StringUtils.hasLength(strText)) {
					continue;
				}

				Chunk chunk = new Chunk();
				chunk.setName(strQuestion);
				chunk.setContent(strText);
				chunk.setType(ChunkType.ORIGINAL.getValue());
				chunkList.add(chunk);
			}

			return chunkList;
		} else {
			List<Chunk> chunkList = new ArrayList<Chunk>();

			MutableDataSet options = new MutableDataSet();
			List<Extension> extensions = Arrays.asList(TablesExtension.create(), TocExtension.create());
			options.set(Parser.EXTENSIONS, extensions);

			// 3. 创建解析器并解析Markdown内容
			Parser parser = Parser.builder(options).build();
			Document document = parser.parse(text);

			// 4. 遍历AST并提取Q&A对
			// 遍历文档的直接子节点
			for (Node node : document.getChildren()) {
				// 判断当前节点是否为标题节点
				if (node instanceof com.vladsch.flexmark.ast.Heading) {
					// --- 提取问题 (Question) ---
					// 获取标题的文本内容
					String strQuestion = ((com.vladsch.flexmark.ast.Heading) node).getText().toString();
					// System.out.println("Q: " + question);

					// --- 提取答案 (Answer) ---
					StringBuilder answerBuilder = new StringBuilder();
					Node nextNode = node.getNext();

					// 收集当前标题之后，下一个同级标题之前的所有内容
					while (nextNode != null && !(nextNode instanceof com.vladsch.flexmark.ast.Heading)) {
						// 获取节点的文本，并去除首尾空白
						String answer = nextNode.getChars().toString().trim();
						if (!answer.isEmpty()) {
							answerBuilder.append(answer).append(" ");
						}
						nextNode = nextNode.getNext();
					}

					// 输出答案
					String strAnswer = answerBuilder.toString().trim();
					if (ObjectUtils.isEmpty(strAnswer)) {
						continue;
					}

					String strContent = String.format("问: %1$s\n答: %2$s", strQuestion, strAnswer);

					String strText = TextPreprocessUtils.process(strContent, parserConfig);
					if (!StringUtils.hasLength(strText)) {
						continue;
					}

					Chunk chunk = new Chunk();
					chunk.setName(strQuestion);
					chunk.setContent(strText);
					chunk.setType(ChunkType.ORIGINAL.getValue());
					chunkList.add(chunk);
				}
			}

			return chunkList;
		}
	}

	@Override
	protected String onGetOriginalContent(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		// 判断文件后缀
		String strName = ossFile.getFileName();
		if (StringUtils.hasLength(strName)) {
			String strExt = FilenameUtils.getExtension(strName);
			if (StringUtils.hasLength(strExt)) {
				if (jsonContentFileExtMap.containsKey(strExt.toLowerCase())) {
					if (!requestParams.containsKey(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__TYPE)) {
						requestParams.put(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__TYPE, ICloudOSSClient.DOWNLOAD_TEXT_TYPE__JSON);
					}
					return super.onGetOriginalContent(documentId, ossFile, chunkMethod, parserConfig, requestParams);
				}
			}
		}

		// 使用Markdown全文本
		if (!requestParams.containsKey(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__TYPE)) {
			requestParams.put(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__TYPE, ICloudOSSClient.DOWNLOAD_TEXT_TYPE__MD);
		}
		String strOriginalContent = this.doGetOriginalContent(documentId, ossFile, chunkMethod, parserConfig, requestParams);
		return this.getMarkdownFullText(strOriginalContent, false, requestParams);
	}
}
