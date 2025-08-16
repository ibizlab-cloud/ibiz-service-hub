package net.ibizsys.central.plugin.extension.dataentity.util.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.dataentity.util.IDEExtensionUtilRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.plugin.extension.dataentity.util.IDEExtensionUtilRuntimeContext;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.res.IPSSysSFPlugin;
import net.ibizsys.runtime.ISystemRuntimeContext;
import net.ibizsys.runtime.plugin.IPluginRuntimeInitable;
import net.ibizsys.runtime.plugin.ModelRTAddinBase;

public abstract class DEExtensionUtilRTAddinBase extends ModelRTAddinBase implements IDEExtensionUtilRTAddin, IPluginRuntimeInitable {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DEExtensionUtilRTAddinBase.class);
	
	private IPSDataEntity iPSDataEntity = null;
	private IPSSysSFPlugin iPSSysSFPlugin = null;
	private ISystemRuntimeContext iSystemRuntimeContext = null;
	
	@Override
	public void init(IDEExtensionUtilRuntimeContext ctx, Object addinData) throws Exception {
		super.init(ctx, addinData);
	}
	
	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysSFPlugin iPSSysSFPlugin) throws Exception {
		this.iSystemRuntimeContext = iSystemRuntimeContext;
		this.iPSSysSFPlugin = iPSSysSFPlugin;
	}
	
	@Override
	protected void onInit() throws Exception {
		this.iPSDataEntity = this.getDataEntityRuntime().getPSDataEntity();
		super.onInit();
	}

	@Override
	protected IDEExtensionUtilRuntimeContext getContext() {
		return (IDEExtensionUtilRuntimeContext)super.getContext();
	}

	protected IDEExtensionUtilRuntime getDEExtensionUtilRuntime() {
		return this.getContext().getDEExtensionUtilRuntime();
	}
	
	protected IDataEntityRuntime getDataEntityRuntime() {
		return this.getDEExtensionUtilRuntime().getDataEntityRuntime();
	}
	
	protected ISystemRuntime getSystemRuntime() {
		return this.getDataEntityRuntime().getSystemRuntime();
	}
	
	protected IPSDataEntity getPSDataEntity() {
		return this.iPSDataEntity;
	}

	protected IPSSysSFPlugin getPSSysSFPlugin() {
		return this.iPSSysSFPlugin;
	}
	
	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return this.iSystemRuntimeContext;
	}
	
}
