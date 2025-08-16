package net.ibizsys.central.plugin.ai.agent;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.util.IEntity;

public abstract class DefaultAIChatAgentBase extends AIChatAgentBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DefaultAIChatAgentBase.class);

	
	@Override
	protected void onInit() throws Exception {

		
		super.onInit();

	}

	@Override
	protected String getAddinData() {
		return (String) super.getAddinData();
	}

	@Override
	protected List getActiveData(Object dataOrKeys) throws Throwable {
		List<IEntity> entityList = new ArrayList<IEntity>();
		if(dataOrKeys instanceof List) {
			List list = (List)dataOrKeys;
			for(Object item : list) {
				if(item instanceof IEntity) {
					entityList.add((IEntity)item);
				}
				else {
					throw new Exception(String.format("无法识别的数据[%1$s]", item));
				}
			}
		}
		else {
			if(dataOrKeys instanceof IEntity) {
				entityList.add((IEntity)dataOrKeys);
			}
			else {
				throw new Exception(String.format("无法识别的数据[%1$s]", dataOrKeys));
			}
		}
		return entityList;
	}

	@Override
	protected List<ChatMessage> doGetHistories(List entityList, Object body, Map<String, Object> params, Map<String, Object> exTemplParams) throws Throwable {
		if(exTemplParams == null) {
			exTemplParams = new HashMap<String, Object>();
		}
		
		return super.doGetHistories(entityList, body, params, exTemplParams);
	}
	
	@Override
	protected String getHistoriesConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.xml", File.separator, getAddinData(), "history").toLowerCase();
	}
	
	@Override
	protected String getSystemMessagesConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.xml", File.separator, getAddinData(), "system").toLowerCase();
	}
	
	@Override
	protected String getToolsConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.json", File.separator, getAddinData(), "tools").toLowerCase();
	}
}
