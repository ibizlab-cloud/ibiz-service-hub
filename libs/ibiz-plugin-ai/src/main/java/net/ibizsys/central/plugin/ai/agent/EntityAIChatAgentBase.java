package net.ibizsys.central.plugin.ai.agent;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.central.plugin.ai.sysutil.ISysAIFactoryUtilRuntimeContext;

public abstract class EntityAIChatAgentBase extends AIChatAgentBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(EntityAIChatAgentBase.class);

	public final static String TEMPLPARAM_DE = "de";
	
	
	@Override
	public void init(ISysAIFactoryUtilRuntimeContext ctx, Object addinData, String strAgentMode) throws Exception {
		if(addinData instanceof IDEMethodDTORuntime) {
			addinData = ((IDEMethodDTORuntime)addinData).getDataEntityRuntime();
		}
		super.init(ctx, addinData, strAgentMode);
	}

	@Override
	protected void onInit() throws Exception {

		
		super.onInit();

	}

	@Override
	protected IDataEntityRuntime getAddinData() {
		return (IDataEntityRuntime) super.getAddinData();
	}

	//@Override
	protected IDataEntityRuntime getDataEntityRuntime() {
		return this.getAddinData();
	}

	@Override
	protected List<ChatMessage> doGetHistories(List entityList, Object body, Map<String, Object> params, Map<String, Object> exTemplParams) throws Throwable {
		if(exTemplParams == null) {
			exTemplParams = new HashMap<String, Object>();
		}
		
		exTemplParams.put(TEMPLPARAM_DE, getAddinData());
		
		return super.doGetHistories(entityList, body, params, exTemplParams);
	}
	
	@Override
	protected String getHistoriesConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.xml", File.separator, getDataEntityRuntime().getFullUniqueTag(), "history").toLowerCase();
	}
	
	@Override
	protected String getSystemMessagesConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.xml", File.separator, getDataEntityRuntime().getFullUniqueTag(), "system").toLowerCase();
	}
}
