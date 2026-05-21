package net.ibizsys.central.plugin.ai.util.template;

import net.ibizsys.central.plugin.ai.util.AIChatUtils;

public class AIChatUtilsFreeMarkerObject {

	private final static AIChatUtilsFreeMarkerObject instance = new AIChatUtilsFreeMarkerObject();
	
	public static AIChatUtilsFreeMarkerObject getInstance() {
		return instance;
	}
	
	
	public String json_content(String markdownContent) {
		return AIChatUtils.getJsonContent(markdownContent);
	}
	
	
	public String html2md(String htmlContent) {
		return AIChatUtils.html2md(htmlContent);
	}
}