package net.ibizsys.central.plugin.ai.util;

import java.util.*;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;

public class TextPreprocessUtils extends net.ibizsys.central.cloud.core.util.TextPreprocessUtils {

	public static final String REMOVE_EXTRA_WHITESPACE = "remove_extra_whitespace";

	public static final String REMOVE_JS_CSS = "remove_js_css";

	public static final String REMOVE_HTML_TAGS = "remove_html_tags";

	public static final String REMOVE_IMG_URL = "remove_img_url";

	public static final String REMOVE_EMAILS_URL = "remove_emails_url";

	public static final String NORMALIZE_PUNCTUATION = "normalize_punctuation";

	public static String process(String text, ParserConfig parserConfig) throws Exception {
		Assert.hasLength(text, "未传入预处理文本");
		Assert.notNull(parserConfig,"未传入分析器配置");
		String preProcessRules = parserConfig.getPreProcessRules();
		if (!ObjectUtils.isEmpty(preProcessRules)) {
			process(text, preProcessRules);
		}
		Object dataMaskingRules = parserConfig.get("data_masking_rules");
		if (!ObjectUtils.isEmpty(dataMaskingRules) && dataMaskingRules instanceof List) {
			List<Map<String, String>> maskingRules = (List<Map<String, String>>) dataMaskingRules;
			LinkedHashMap<String, String> rules = new LinkedHashMap<String, String>();
			for (Map<String, String> rule : maskingRules) {
				String pattern = rule.get("pattern");
				String replacement = rule.get("replacement");
				Assert.notNull(pattern, "脱敏规则必须包含pattern字段");
				Assert.notNull(replacement, "脱敏规则必须包含replacement字段");
				rules.put(pattern, replacement);
			}
			process(text, rules);
		}
		return text;
	}

	public static String process(String text, String preProcessRules) throws Exception {
		Assert.hasLength(text, "未传入预处理文本");
		Assert.hasLength(preProcessRules,"未传入预处理规则");
		Set<String> rules = new HashSet<String>(Arrays.asList(preProcessRules.split(",")));
		return process(text, rules);
	}

	public static String process(String text, Set<String> rules) throws Exception {
		Assert.hasLength(text, "未传入预处理文本");
		Assert.notNull(rules, "未传入预处理规则");
		//注意执行顺序
		if (rules.contains(REMOVE_EXTRA_WHITESPACE)){
			text = mergeSpaces(text);
		}
		if (rules.contains(REMOVE_JS_CSS)){
			text = removeScriptTags(text);
			text = removeStyleTags(text);
		}
		if (rules.contains(REMOVE_HTML_TAGS)){
			text = removeHtmlTags(text);
		}
		if (rules.contains(REMOVE_IMG_URL)){
			text = removeMarkdownImages(text);
			text = removeMarkdownLinks(text);
		}
		if (rules.contains(REMOVE_EMAILS_URL)){
			text = removeUrls(text);
			text = removeEmails(text);
		}
		if (rules.contains(NORMALIZE_PUNCTUATION)){
			text = normalizePunctuation(text);
		}
		return text;
	}

	public static String process(String text, LinkedHashMap<String, String> maskingRules) throws Exception {
		Assert.hasLength(text, "未传入预处理文本");
		Assert.notNull(maskingRules, "未传入自定义脱敏规则");
		return maskingRule(text, maskingRules);
	}

}
