package net.ibizsys.central.plugin.util.res;

import org.springframework.util.StringUtils;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;

import net.ibizsys.central.res.SysTranslatorRuntimeBase;

public class SysHtml2MDTranslatorRuntime extends SysTranslatorRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysHtml2MDTranslatorRuntime.class);

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
				return toMD(strHtml);
			}
		}
		return super.onTranslate(objValue, bIn);
	}

	public static String toMD(String strHtml) {
		return FlexmarkHtmlConverter.builder().build().convert(strHtml);
	}
}
