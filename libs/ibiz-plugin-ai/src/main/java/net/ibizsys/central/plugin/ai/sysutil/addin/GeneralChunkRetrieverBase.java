package net.ibizsys.central.plugin.ai.sysutil.addin;

import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;

public abstract class GeneralChunkRetrieverBase extends ChunkRetrieverBase {

	protected String getPageRetrieverPrompt(ParserConfig parserConfig) throws Throwable {
		return this.getSystemRuntime().getResourceContent(GeneralChunkRetrieverBase.class, "PageRetrieverPrompt.md", false);
//		return "作为助理，请根据用户提供的页面目录（JSON格式）和查询内容（文本），思考并召回相关文档的页面编号。页面目录包含文档信息（如document_id、page_range）和索引数组，索引中每个章节有标题、摘要和位置（location，指定起始和结束页码）。查询内容是用户的问题或需求。\r\n"
//				+ "\r\n"
//				+ "请按以下步骤处理：\r\n"
//				+ "1. **解析查询内容**：提取关键意图和术语。\r\n"
//				+ "2. **分析页面目录**：遍历索引数组及其子章节，比较标题、摘要与查询内容的语义相关性。基于location字段确定相关页面范围，忽略章节标识符。\r\n"
//				+ "3. **确定召回页面**：为每个高相关部分，汇总页面编号。如果页面连续，合并为一个范围；如果不连续，拆分为多个范围。确保只基于页面编号召回，不涉及章节ID或标题。\r\n"
//				+ "4. **输出JSON**：直接返回一个JSON数组，格式如下：\r\n"
//				+ "   - 每个元素代表一个召回的文档页面集合，包含：\r\n"
//				+ "     - `document_id`：字符串，文档的唯一ID。\r\n"
//				+ "     - `page_range`：对象或数组。如果页面连续，格式为`{\"start\": \"页码字符串（如P1）\", \"end\": \"页码字符串（如P3）\"}`；如果页面不连续，格式为数组，例如`[{\"start\": \"P1\", \"end\": \"P2\"}, {\"start\": \"P4\", \"end\": \"P5\"}]`。\r\n"
//				+ "     - `reason`：字符串，简要说明召回原因，基于查询内容与页面目录的匹配点（如“查询涉及系统安全性，匹配相关页面摘要”）。\r\n"
//				+ "   - 若无匹配，返回空数组`[]`。\r\n"
//				+ "\r\n"
//				+ "输出必须是最终JSON，无需额外解释。示例：对于查询“系统安全设计”，可能返回：\r\n"
//				+ "```json\r\n"
//				+ "[\r\n"
//				+ "  {\r\n"
//				+ "    \"document_id\": \"doc01\",\r\n"
//				+ "    \"page_range\": {\"start\": \"P3\", \"end\": \"P3\"},\r\n"
//				+ "    \"reason\": \"查询内容匹配安全性相关摘要，涉及页面P3。\"\r\n"
//				+ "  }\r\n"
//				+ "]\r\n"
//				+ "```";
	}
	
	
	protected String getTranslationPrompt(ParserConfig parserConfig) throws Throwable {
		return this.getSystemRuntime().getResourceContent(GeneralChunkRetrieverBase.class, "TranslationPrompt.md", false);
	}
	
	
}
