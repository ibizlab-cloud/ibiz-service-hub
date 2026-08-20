package net.ibizsys.central.plugin.ai.addin;

import java.util.List;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;
import net.ibizsys.runtime.plugin.IModelRTAddin2;

public interface IDocumentSplitter extends IModelRTAddin2 {

	public final static String CHUNK_METHOD__NAIVE = "NAIVE";
	public final static String CHUNK_METHOD__BOOK = "BOOK";
	public final static String CHUNK_METHOD__EMAIL = "EMAIL";
	public final static String CHUNK_METHOD__LAWS = "LAWS";
	public final static String CHUNK_METHOD__MANUAL = "MANUAL";
	public final static String CHUNK_METHOD__ONE = "ONE";
	public final static String CHUNK_METHOD__PICTURE = "PICTURE";
	public final static String CHUNK_METHOD__PRESENTATION = "PRESENTATION";
	public final static String CHUNK_METHOD__QA = "QA";
	public final static String CHUNK_METHOD__TABLE = "TABLE";
	public final static String CHUNK_METHOD__TAG = "TAG";

	
	/**
	 * 预处理规则：合并多个空格/换行为单个
	 */
	public final static String PRE_PROCESS_RULES__REMOVE_EXTRA_WHITESPACE = "remove_extra_whitespace";
	/**
	 * 预处理规则：剥离 HTML 标签（保留文本）
	 */
	public final static String PRE_PROCESS_RULES__REMOVE_HTML_TAGS = "remove_html_tags";
	/**
	 * 预处理规则：移除 <script> <style> 内容
	 */
	public final static String PRE_PROCESS_RULES__REMOVE_JS_CSS = "remove_js_css";
	/**
	 * 预处理规则：移除电子邮箱及Url
	 */
	public final static String PRE_PROCESS_RULES__REMOVE_EMAILS_URL = "remove_emails_url";
	
	/**
	 * 预处理规则：统一中英文标点（如 “” → \"\")
	 */
	public final static String PRE_PROCESS_RULES__NORMALIZE_PUNCTUATION = "normalize_punctuation";
	
	/**
	 * 预处理规则：尝试移除页眉页脚（PDF 场景）
	 */
	public final static String PRE_PROCESS_RULES__REMOVE_HEADER_FOOTER = "remove_header_footer";
	
	/**
	 * 预处理规则：启用 OCR 后处理识别水印并过滤
	 */
	public final static String PRE_PROCESS_RULES__REMOVE_WATERMARK = "remove_watermark";
	
		
	
	/**
	 * "parser_config": (Body parameter), object
		The configuration settings for the dataset parser. The attributes in this JSON object vary with the selected "chunk_method":
		
		If "chunk_method" is "naive", the "parser_config" object contains the following attributes:
		"auto_keywords": int
		Defaults to 0
		Minimum: 0
		Maximum: 32
		"auto_questions": int
		Defaults to 0
		Minimum: 0
		Maximum: 10
		"chunk_token_num": int
		Defaults to 512
		Minimum: 1
		Maximum: 2048
		"delimiter": string
		Defaults to "\n".
		"html4excel": bool Indicates whether to convert Excel documents into HTML format.
		Defaults to false
		"layout_recognize": string
		Defaults to DeepDOC
		"tag_kb_ids": array<string> refer to Use tag set
		Must include a list of dataset IDs, where each dataset is parsed using the ​​Tag Chunk Method
		"task_page_size": int For PDF only.
		Defaults to 12
		Minimum: 1
		"raptor": object RAPTOR-specific settings.
		Defaults to: {"use_raptor": false}
		"graphrag": object GRAPHRAG-specific settings.
		Defaults to: {"use_graphrag": false}
		
		If "chunk_method" is "qa", "manuel", "paper", "book", "laws", or "presentation", the "parser_config" object contains the following attribute:
		"raptor": object RAPTOR-specific settings.
		Defaults to: {"use_raptor": false}.
		
		If "chunk_method" is "table", "picture", "one", or "email", "parser_config" is an empty JSON object.
	 */
	
	/**
	 * 分割传入文本
	 * @param documentId 文档标识
	 * @param text
	 * @param setting
	 * @return
	 * @throws Throwable
	 */
	List<Chunk> split(Object documentId, String text, String chunkMethod, ParserConfig parserConfig) throws Throwable;
	
	
	/**
	 * 分割传入OSS文件
	 * @param documentId 文档标识
	 * @param ossFile
	 * @param setting
	 * @return
	 * @throws Throwable
	 */
	List<Chunk> split(Object documentId, net.ibizsys.runtime.util.domain.File ossFile, String chunkMethod, ParserConfig parserConfig) throws Throwable;
	
	
	
	/**
	 * 获取传入文件的原始内容
	 * @param documentId 文档标识
	 * @param ossFile
	 * @param setting
	 * @return
	 * @throws Throwable
	 */
	String getOriginalContent(Object documentId, net.ibizsys.runtime.util.domain.File ossFile, String chunkMethod, ParserConfig parserConfig) throws Throwable;
	
	
	
	/**
	 * 获取传入文件的原始内容
	 * @param documentId
	 * @param ossFile
	 * @param chunkMethod
	 * @param parserConfig
	 * @param type
	 * @return
	 * @throws Throwable
	 */
	String getOriginalContent(Object documentId, net.ibizsys.runtime.util.domain.File ossFile, String chunkMethod, ParserConfig parserConfig, String type, Map<String, Object> requestParams) throws Throwable;
	
	
	/**
	 * 获取传入文件的页面目录
	 * @param documentId 文档标识
	 * @param ossFile
	 * @param setting
	 * @return
	 * @throws Throwable
	 */
	String getPageIndex(Object documentId, net.ibizsys.runtime.util.domain.File ossFile, String chunkMethod, ParserConfig parserConfig) throws Throwable;
	
	
	/**
	 * 获取传入文件的页面目录
	 * @param documentId 文档标识
	 * @param ossFile
	 * @param setting
	 * @return
	 * @throws Throwable
	 */
	String getPageIndex(Object documentId, String text, String chunkMethod, ParserConfig parserConfig) throws Throwable;
	
	/**
	 * 获取传入内容的完整文本
	 * @param documentId 文档标识
	 * @param text
	 * @param setting
	 * @return
	 * @throws Throwable
	 */
	String getFullText(Object documentId, String text, String chunkMethod, ParserConfig parserConfig, Map<String, Object> params) throws Throwable;
	
	
	/**
	 * 获取传入文件的完整文本
	 * @param documentId 文档标识
	 * @param ossFile
	 * @param setting
	 * @return
	 * @throws Throwable
	 */
	String getFullText(Object documentId, net.ibizsys.runtime.util.domain.File ossFile, String chunkMethod, ParserConfig parserConfig, Map<String, Object> params) throws Throwable;
	
}
