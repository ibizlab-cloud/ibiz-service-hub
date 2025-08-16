package net.ibizsys.central.cloud.core.ai;

import java.util.Map;

import org.springframework.util.StringUtils;

public abstract class AIAgentRuntimeBaseContextBase implements IAIAgentRuntimeBaseContext {

	public AIAgentRuntimeBaseContextBase() {
		
	}

	@Override
	public String output(String strTemplateId) throws Throwable {
		return output(null, strTemplateId);
	}

	@Override
	public String output(Object data, String strTemplateId) throws Throwable {
		return output(data, strTemplateId, null);
	}

	@Override
	public String output(Object data, String strTemplateId, String strIndent) throws Throwable {
		String strContent = getContent(data, String.format("template/%1$s", strTemplateId), null, false);
		if (!StringUtils.hasLength(strContent) || !StringUtils.hasLength(strIndent)) {
			return strContent;
		}

		StringBuilder stringBuilder = new StringBuilder();
		String[] lines = strContent.replace("\r\n", "\n").replace("\r", "\n").split("\n");
		for (int i = 0; i < lines.length; i++) {
			if (i != 0) {
				stringBuilder.append("\n");
			}
			stringBuilder.append(strIndent);
			if (StringUtils.hasLength(lines[i])) {
				stringBuilder.append(lines[i]);
			}
		}
		return stringBuilder.toString();
	}
	
	
	

	@Override
	public String outputRaw(String strTemplateId) throws Throwable {
		return this.outputRaw(strTemplateId, null);
	}

	@Override
	public String outputRaw(String strTemplateId, String strIndent) throws Throwable {
		String strContent = getTemplateContent(String.format("template/%1$s", strTemplateId), false);
		if (!StringUtils.hasLength(strContent) || !StringUtils.hasLength(strIndent)) {
			return strContent;
		}

		StringBuilder stringBuilder = new StringBuilder();
		String[] lines = strContent.replace("\r\n", "\n").replace("\r", "\n").split("\n");
		for (int i = 0; i < lines.length; i++) {
			if (i != 0) {
				stringBuilder.append("\n");
			}
			stringBuilder.append(strIndent);
			if (StringUtils.hasLength(lines[i])) {
				stringBuilder.append(lines[i]);
			}
		}
		return stringBuilder.toString();
	}

	@Override
	public boolean contains(String strTemplateId) {
		try {
			return StringUtils.hasLength(getTemplateContent(String.format("template/%1$s", strTemplateId), true));
		} catch (Throwable ex) {
			return false;
		}
	}
	
	protected abstract String getContent(Object data, String strTemplateId, Map<String, Object> params, boolean bTryMode) throws Throwable;
	
	
	/**
	 * 获取模板内容
	 * @param 当前数据
	 * @param strConfigId
	 * @param bTryMode
	 * @return
	 * @throws Throwable
	 */
	protected abstract String getTemplateContent(String strConfigId, boolean bTryMode) throws Throwable;

}
