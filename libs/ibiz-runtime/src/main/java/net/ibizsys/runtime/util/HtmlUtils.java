package net.ibizsys.runtime.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;

public class HtmlUtils {

	private static final FlexmarkHtmlConverter converter = FlexmarkHtmlConverter.builder().build();

	public static String toMarkdown(String strHtmlContent) {
		// 判断内容是否为html
		if (!isHtml(strHtmlContent)) {
			return strHtmlContent;
		}
		// 执行转换
		return converter.convert(strHtmlContent);
	}

	public static boolean isHtml(String strHtmlContent) {
		if (strHtmlContent == null || strHtmlContent.trim().isEmpty()) {
			return false;
		}
		// 使用 Jsoup 解析 HTML
		try {
			Document doc = Jsoup.parse(strHtmlContent);
			for (Element element : doc.body().children()) {
				if (!element.tagName().equals("html") && !element.tagName().equals("body")) {
					return true;
				}
			}
			return false;
		} catch (Throwable ex) {
			return false;
		}
	}

	public static String toPlainText(String strHtmlContent) {
		if (strHtmlContent == null || strHtmlContent.trim().isEmpty()) {
			return null;
		}
		// 使用JSoup，并配置其保留换行符
		Document.OutputSettings outputSettings = new Document.OutputSettings();
		outputSettings.prettyPrint(false); // 禁用美化输出，避免额外缩进
		outputSettings.charset("UTF-8");

		String plainText = Jsoup.clean(strHtmlContent, "", Safelist.none(), outputSettings);
		// 清理后，HTML的<br>和<p>标签带来的换行得以保留
		return plainText.trim();
	}
}
