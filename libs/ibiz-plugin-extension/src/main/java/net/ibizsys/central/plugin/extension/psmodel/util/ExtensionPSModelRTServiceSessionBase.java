package net.ibizsys.central.plugin.extension.psmodel.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudExtensionClient;
import net.ibizsys.central.cloud.core.system.IExtensionSysRefRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudExtensionUtilRuntime;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.codelist.IPSAppCodeList;
import net.ibizsys.model.app.dataentity.IPSAppDEACMode;
import net.ibizsys.model.app.dataentity.IPSAppDEAction;
import net.ibizsys.model.app.dataentity.IPSAppDEDataSet;
import net.ibizsys.model.app.dataentity.IPSAppDEField;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.app.view.IPSAppDEView;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.extend.control.form.PSDEFormDetailListTranspilerEx;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceSession;

public abstract class ExtensionPSModelRTServiceSessionBase extends PSModelRTServiceSession implements IExtensionPSModelRTServiceSession {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(ExtensionPSModelRTServiceSessionBase.class);
	
	private String strProductMarketServiceUrl = null;
	private String strProductMarketGroupId = null;
	private String strProductMarketBaseGroupId = null;
	private String strProductMarketMode = PRODUCTMARKETMODE_DEFAULT;
	private String strProductMarketProjectId = null;
	
	private ISystemRuntime iSystemRuntime = null;
//	private ICloudExtensionClient iCloudExtensionClient = null;
	private ISysCloudExtensionUtilRuntime iSysCloudExtensionUtilRuntime = null; 	
	private String strExtensionId = null;
	private IExtensionSysRefRuntime iExtensionSysRefRuntime = null;
	
	private final static Map<Class<?>, IPSModelListTranspiler> psModelListTranspilerMap = new HashMap<>();
	
	static {
		psModelListTranspilerMap.put(IPSAppDataEntity.class, new net.ibizsys.central.plugin.extension.psmodel.transpiler.app.dataentity.PSAppDataEntityListTranspilerEx());
		psModelListTranspilerMap.put(IPSAppDEField.class, new net.ibizsys.central.plugin.extension.psmodel.transpiler.app.dataentity.PSAppDEFieldListTranspilerEx());
		psModelListTranspilerMap.put(IPSAppCodeList.class, new net.ibizsys.central.plugin.extension.psmodel.transpiler.app.codelist.PSAppCodeListListTranspilerEx());
		
		psModelListTranspilerMap.put(IPSAppDEACMode.class, new net.ibizsys.central.plugin.extension.psmodel.transpiler.app.dataentity.PSAppDEACModeListTranspilerEx());
		psModelListTranspilerMap.put(IPSAppDEAction.class, new net.ibizsys.central.plugin.extension.psmodel.transpiler.app.dataentity.PSAppDEActionListTranspilerEx());
		psModelListTranspilerMap.put(IPSAppDEDataSet.class, new net.ibizsys.central.plugin.extension.psmodel.transpiler.app.dataentity.PSAppDEDataSetListTranspilerEx());
		
		psModelListTranspilerMap.put(IPSAppView.class, new net.ibizsys.central.plugin.extension.psmodel.transpiler.app.view.PSAppViewListTranspilerEx());
		psModelListTranspilerMap.put(IPSAppDEView.class, new net.ibizsys.central.plugin.extension.psmodel.transpiler.app.view.PSAppDEViewListTranspilerEx());
	}
	
//	public ExtensionPSModelRTServiceSessionBase(ISystemRuntime iSystemRuntime) {
//		this.setSystemRuntime(iSystemRuntime);
//		this.setPSSystemService(iSystemRuntime.getPSSystemService());
//		//启用表单分页部件的数据关系界面组
//		this.setParam(PSDEFormDetailListTranspilerEx.PARAM_PSDEFORMTABPANEL_ENABLEDEDR, true);
//	}
	
	public ExtensionPSModelRTServiceSessionBase() {
		//启用表单分页部件的数据关系界面组
		this.setParam(PSDEFormDetailListTranspilerEx.PARAM_PSDEFORMTABPANEL_ENABLEDEDR, true);
	}
	
	
	@Override
	public String getProductMarketServiceUrl() {
		return this.strProductMarketServiceUrl;
	}
	
	public void setProductMarketServiceUrl(String strProductMarketServiceUrl) {
		this.strProductMarketServiceUrl = strProductMarketServiceUrl;
	}

	@Override
	public String getProductMarketGroupId() {
		return this.strProductMarketGroupId;
	}
	
	public void setProductMarketGroupId(String strProductMarketGroupId) {
		this.strProductMarketGroupId = strProductMarketGroupId;
	}
	
	@Override
	public String getProductMarketBaseGroupId() {
		return this.strProductMarketBaseGroupId;
	}
	
	public void setProductMarketBaseGroupId(String strProductMarketBaseGroupId) {
		this.strProductMarketBaseGroupId = strProductMarketBaseGroupId;
	}
	
	@Override
	public String getProductMarketMode() {
		return this.strProductMarketMode;
	}
	
	public void setProductMarketMode(String strProductMarketMode) {
		this.strProductMarketMode = strProductMarketMode;
	}
	
	@Override
	public String getProductMarketProjectId() {
		return this.strProductMarketProjectId;
	}
	
	public void setProductMarketProjectId(String strProductMarketProjectId) {
		this.strProductMarketProjectId = strProductMarketProjectId;
	}

	@Override
	public ISystemRuntime getSystemRuntime() {
		return this.iSystemRuntime;
	}
	
	public void setSystemRuntime(ISystemRuntime iSystemRuntime) {
		this.iSystemRuntime = iSystemRuntime;
	}

	@Override
	public ICloudExtensionClient getCloudExtensionClient() {
		if(getSysCloudExtensionUtilRuntime()!=null) {
			return this.getSysCloudExtensionUtilRuntime().getCloudExtensionClient();
		}
		return null;
	}
	
	@Override
	public ICloudExtensionClient getCloudExtensionClientMust() throws Exception {
		ICloudExtensionClient iCloudExtensionClient = this.getCloudExtensionClient();
		if(iCloudExtensionClient != null) {
			return iCloudExtensionClient;
		}
		throw new Exception("未指定Cloud扩展客户端对象");
	}

//	public void setCloudExtensionClient(ICloudExtensionClient iCloudExtensionClient) {
//		this.iCloudExtensionClient = iCloudExtensionClient;
//	}

	@Override
	public ISysCloudExtensionUtilRuntime getSysCloudExtensionUtilRuntime() {
		return this.iSysCloudExtensionUtilRuntime;
	}

	public void setSysCloudExtensionUtilRuntime(ISysCloudExtensionUtilRuntime iSysCloudExtensionUtilRuntime) {
		this.iSysCloudExtensionUtilRuntime = iSysCloudExtensionUtilRuntime;
	}
	
	@Override
	public ISysCloudExtensionUtilRuntime getSysCloudExtensionUtilRuntimeMust() throws Exception {
		ISysCloudExtensionUtilRuntime iSysCloudExtensionUtilRuntime = this.getSysCloudExtensionUtilRuntime();
		if(iSysCloudExtensionUtilRuntime != null) {
			return iSysCloudExtensionUtilRuntime;
		}
		
		throw new Exception("未指定系统Cloud扩展功能对象");
	}
	

	@Override
	public String getExtensionId() {
		return this.strExtensionId;
	}
	
	public void setExtensionId(String strExtensionId) {
		this.strExtensionId = strExtensionId;
	}
	
	
	@Override
	public String getExtensionIdMust() throws Exception{
		String strExtensionId = getExtensionId();
		if(StringUtils.hasLength(strExtensionId)) {
			return strExtensionId;
		}
		throw new Exception("未支持扩展");
	}
	
	
	@Override
	public IPSModelListTranspiler getPSModelListTranspiler(Class<?> cls, boolean bTryMode) throws Exception {
		IPSModelListTranspiler iPSModelListTranspiler = psModelListTranspilerMap.get(cls);
		if(iPSModelListTranspiler!=null) {
			return iPSModelListTranspiler;
		}
		return super.getPSModelListTranspiler(cls, bTryMode);
	}

	@Override
	public void setExtensionSysRefRuntime(IExtensionSysRefRuntime iExtensionSysRefRuntime) {
		this.iExtensionSysRefRuntime = iExtensionSysRefRuntime;
	}

	@Override
	public IExtensionSysRefRuntime getExtensionSysRefRuntime() {
		return this.iExtensionSysRefRuntime;
	}
	
	@Override
	public IPSSystem getPSSystem() {
		IExtensionSysRefRuntime iExtensionSysRefRuntime = this.getExtensionSysRefRuntime();
		if(iExtensionSysRefRuntime != null) {
			return iExtensionSysRefRuntime.getPSSystemService().getPSSystem();
		}
		return super.getPSSystem();
	}
	
	@Override
	public IPSApplication getPSApplicationMust() throws Exception {
		IPSApplication iPSApplication = this.getPSApplication();
		if(iPSApplication != null) {
			return iPSApplication;
		}
		throw new Exception("未指定当前应用");
	}
	
}
