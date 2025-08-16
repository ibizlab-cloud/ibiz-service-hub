package net.ibizsys.central.plugin.util.res;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.util.StringUtils;

import net.ibizsys.central.res.SysTranslatorRuntimeBase;

public class SysHtml2TextTranslatorRuntime extends SysTranslatorRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysHtml2TextTranslatorRuntime.class);

	@Override
	protected Object onTranslate(Object objValue, boolean bIn) throws Throwable {
		if (bIn && objValue != null) {
			String strHtml = null;
			if (objValue instanceof String) {
				strHtml = (String) objValue;
			}

			if (strHtml == null) {
				throw new Exception("传入值无效");
			}

			if (!StringUtils.hasLength(strHtml)) {
				return strHtml;
			} else {
				return toText(strHtml);
			}
		}
		return super.onTranslate(objValue, bIn);
	}

	public static String toText(String strHtml) {
		Document document = Jsoup.parse(strHtml);

		// 替换图像标签
		Elements images = document.select("img");
		for (Element image : images) {
			String imageUrl = image.attr("src");
			String replacementText = "图片来自[" + imageUrl + "]";
			image.replaceWith(new Element("p").text(replacementText));
		}

		// 获取替换后的 HTML
		return  document.text();
	}
}
