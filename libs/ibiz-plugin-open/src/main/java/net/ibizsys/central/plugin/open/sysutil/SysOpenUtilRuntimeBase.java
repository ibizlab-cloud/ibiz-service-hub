package net.ibizsys.central.plugin.open.sysutil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.plugin.open.addin.IOpenCallbackHandler;
import net.ibizsys.central.plugin.open.sysutil.addin.ISysOpenUtilRTAddin;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.model.dataentity.IPSDEGroupDetail;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.IAction;

/**
 * 系统开放平台功能组件
 * 
 * @author lionlau
 *
 */
public abstract class SysOpenUtilRuntimeBase extends SysUtilRuntimeBase implements ISysOpenUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysOpenUtilRuntimeBase.class);
	
	public final static String OPENCALLBACKHANDLER_PREFIX = "OPENCALLBACKHANDLER:";
	
	public final static String DATAENTITYRUNTIME_CALLBACKHANDLER = "callbackhandler";
	
	private Map<String, IOpenCallbackHandler> openCallbackHandlerMap = null;
	
	static {
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysOpenUtilRTAddin.class, "*:OPENCALLBACKHANDLER:WXMP", "net.ibizsys.central.plugin.wechat.sysutil.addin.WXMPOpenCallbackHandler");
	}
	
	private Map<String, IDataEntityRuntime> processDataEntityRuntimeMap = new HashMap<String, IDataEntityRuntime>();
	
	@Override
	protected ISysOpenUtilRuntimeContext createModelRuntimeContext() {
		return new SysOpenUtilRuntimeContextBase<ISysOpenUtilRuntime, ISysUtilRuntimeContext>(super.createModelRuntimeContext()) {

			@Override
			public IDataEntityRuntime getProcessDataEntityRuntime(String strOpenType, String strOpenTag, boolean bTryMode) throws Exception {
				return getSelf().getProcessDataEntityRuntime(strOpenType, strOpenTag, bTryMode);
			}

		};
	}

	@Override
	protected ISysOpenUtilRuntimeContext getModelRuntimeContext() {
		return (ISysOpenUtilRuntimeContext) super.getModelRuntimeContext();
	}

	private SysOpenUtilRuntimeBase getSelf() {
		return this;
	}

	@Override
	protected void prepareAddinRepo() throws Exception {
		this.prepareAddinRepo(this.getModelRuntimeContext(), ISysOpenUtilRTAddin.class, this.getFullUniqueTag()+":");
	}

	@Override
	protected void onInit() throws Exception {

		if(this.getPSSysUtil().getPSSysDEGroup() == null) {
			throw new Exception("未指定响应处理实体组");
		}
		
		if(ObjectUtils.isEmpty(this.getPSSysUtil().getPSSysDEGroupMust().getPSDEGroupDetails())) {
			throw new Exception("响应处理实体组未包含任何实体");
		}
		
		super.onInit();
	}
	
	@Override
	protected void onInstall() throws Exception {
		
		List<IPSDEGroupDetail> list = this.getPSSysUtil().getPSSysDEGroupMust().getPSDEGroupDetails();
		for(IPSDEGroupDetail iPSDEGroupDetail : list) {
			IDataEntityRuntime processDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDEGroupDetail.getPSDataEntityMust().getId());
			if(StringUtils.hasLength(iPSDEGroupDetail.getCodeName())) {
				processDataEntityRuntimeMap.put(iPSDEGroupDetail.getCodeName().toLowerCase(), processDataEntityRuntime);
			}
			if(!processDataEntityRuntimeMap.containsKey(processDataEntityRuntime.getLowerCaseName())) {
				processDataEntityRuntimeMap.put(processDataEntityRuntime.getLowerCaseName(), processDataEntityRuntime);
			}
		}
				
		super.onInstall();
		
		
		this.openCallbackHandlerMap = this.getAddinRepo().getAddins(IOpenCallbackHandler.class, OPENCALLBACKHANDLER_PREFIX);
		if(ObjectUtils.isEmpty(this.openCallbackHandlerMap)) {
			log.warn(String.format("开放平台功能组件[%1$s]未挂接任何回调处理插件", this.getFullUniqueTag()));
		}
		else {
			for(java.util.Map.Entry<String, IOpenCallbackHandler> entry : openCallbackHandlerMap.entrySet()) {
				log.debug(String.format("开放平台功能组件[%1$s]挂接回调处理插件[%2$s][%3$s]", this.getFullUniqueTag(), entry.getKey(), entry.getValue()));
			}
		}
	}


	@Override
	public String executeCallback(String strOpenType, String strOpenTag, String strInput) {
		return this.executeAction("执行回调", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onExecuteCallback(strOpenType, strOpenTag, strInput);
			}
		}, null, String.class);
	}
	
	protected String onExecuteCallback(String strOpenType, String strOpenTag, String strInput) throws Throwable {
		IOpenCallbackHandler iOpenCallbackHandler = this.openCallbackHandlerMap.get(strOpenType.toUpperCase());
		if(iOpenCallbackHandler == null) {
			throw new Exception(String.format("无法获取指定开放平台[%1$s]回调处理对象", strOpenType));
		}
		return iOpenCallbackHandler.executeCallback(strOpenTag, strInput);
	}
	
	protected IDataEntityRuntime getProcessDataEntityRuntime(String strOpenType, String strOpenTag, boolean bTryMode) throws Exception {
		IDataEntityRuntime processDataEntityRuntime = this.processDataEntityRuntimeMap.get(DATAENTITYRUNTIME_CALLBACKHANDLER);
		if(processDataEntityRuntime != null || bTryMode) {
			return processDataEntityRuntime;
		}
		throw new Exception(String.format("开放平台处理实体[%1$s]不存在", strOpenType));
	}
	
	

}
