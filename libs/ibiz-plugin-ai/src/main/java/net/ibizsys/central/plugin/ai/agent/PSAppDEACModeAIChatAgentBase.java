package net.ibizsys.central.plugin.ai.agent;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.app.dataentity.IPSAppDEACMode;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;

public abstract class PSAppDEACModeAIChatAgentBase extends PSModelAIChatAgentBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PSAppDEACModeAIChatAgent.class);

	private IDataEntityRuntime iDataEntityRuntime = null;
	private IPSAppDataEntity iPSAppDataEntity = null;

	public final static String TEMPLPARAM_APPDEACMODE = "appdeacmode";

	@Override
	protected void onInit() throws Exception {

		this.iPSAppDataEntity = getAddinData().getParentPSModelObject(IPSAppDataEntity.class);
		this.iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.iPSAppDataEntity.getPSDataEntityMust().getId());

		super.onInit();

	}

	@Override
	protected IPSAppDEACMode getAddinData() {
		return (IPSAppDEACMode) super.getAddinData();
	}

	protected IPSAppDataEntity getPSAppDataEntity() {
		return this.iPSAppDataEntity;
	}
	
	@Override
	protected IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}

	@Override
	protected List<ChatMessage> doGetHistories(List entityList, Object body, Map<String, Object> params, Map<String, Object> exTemplParams) throws Throwable {
		if(exTemplParams == null) {
			exTemplParams = new HashMap<String, Object>();
		}
		
		exTemplParams.put(TEMPLPARAM_APPDEACMODE, getAddinData());
		exTemplParams.put(TEMPLPARAM_APPDE, getPSAppDataEntity());
		exTemplParams.put(TEMPLPARAM_DE, this.getPSAppDataEntity().getPSDataEntityMust());
		
		return super.doGetHistories(entityList, body, params, exTemplParams);
	}
	
	@Override
	protected String getHistoriesConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.%4$s.xml", File.separator, getPSAppDataEntity().getName(), this.getAddinData().getCodeName(), "history").toLowerCase();
	}
	
	@Override
	protected String getSystemMessagesConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.%4$s.xml", File.separator, getPSAppDataEntity().getName(), this.getAddinData().getCodeName(), "system").toLowerCase();
	}
}
