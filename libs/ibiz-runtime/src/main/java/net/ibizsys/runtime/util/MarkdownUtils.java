package net.ibizsys.runtime.util;

import java.util.Arrays;

import com.vladsch.flexmark.ext.tables.TablesExtension;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.MutableDataSet;

public class MarkdownUtils {
	
	static HtmlRenderer renderer;
	static Parser parser;
	
	static {
		MutableDataSet options = new MutableDataSet();
		// 可选：在这里添加扩展配置，例如支持表格
		options.set(Parser.EXTENSIONS, Arrays.asList(TablesExtension.create()));

		MarkdownUtils.parser = Parser.builder(options).build();
		MarkdownUtils.renderer = HtmlRenderer.builder(options).build();
	}
	

	public static String toHtml(String strMarkdownContent) {
		// 判断内容是否为html
//		if (HtmlUtils.isHtml(strMarkdownContent)) {
//			return strMarkdownContent;
//		}

		Node document = parser.parse(strMarkdownContent);
		return renderer.render(document);
	}
}
