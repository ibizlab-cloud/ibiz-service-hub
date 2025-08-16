package net.ibizsys.central.plugin.open.sysutil.addin;

import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicRuntime;
import net.ibizsys.central.plugin.open.addin.IOpenCallbackHandler;
import net.ibizsys.runtime.plugin.ModelRTAddinException;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IEntity;

public abstract class OpenCallbackHandlerBase extends SysOpenUtilRTAddinBase implements IOpenCallbackHandler {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(OpenCallbackHandlerBase.class);
	
	private String strOpenType = null;
	
	/**
	 * 逻辑标记：绑定开放平台用户至Cloud用户
	 */
	public final static String LOGICTAG_BINDUSER = "BINDUSER";
	
	/**
	 * 逻辑标记：通过开放平台用户获取Cloud用户
	 */
	public final static String LOGICTAG_GETUSER = "GETUSER";
	
	/**
	 * 逻辑标记：解绑开放平台用户与Cloud用户关系
	 */
	public final static String LOGICTAG_UNBINDUSER = "UNBINDUSER";
	
	
	@Override
	protected void onInit() throws Exception {
		String value = (String)this.getAddinData();
		if(StringUtils.hasLength(value)) {
			String[] items = value.split("[:]");
			this.strOpenType = items[items.length - 1];
		}
		super.onInit();
	}
	
	public String getOpenType() {
		return this.strOpenType;
	}
	
	@Override
	public String executeCallback(String strOpenTag, String strInput) {
		try {
			return this.onExecuteCallback(strOpenTag, strInput);
		}
		catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			ModelRTAddinException.rethrow(this, ex);
			throw new ModelRTAddinException(this.getSysUtilRuntime(), this, String.format("执行回调发生异常，%1$s", ex.getMessage()), ex); 
		}
	}
	
	protected abstract String onExecuteCallback(String strOpenTag, String strInput) throws Throwable;
	
	
	protected IEntity bindUser(IDataEntityRuntime processDataEntityRuntime, String strOpenTag, String strOpenUserId, String strDCSystemId, boolean bTryMode) throws Throwable {
		String strLogicTag = String.format("%1$s_%2$s", this.getOpenType(), LOGICTAG_BINDUSER).toUpperCase();
		IDELogicRuntime iPSDELogicRuntime = processDataEntityRuntime.getDELogicRuntime(strLogicTag, true);
		if(iPSDELogicRuntime != null) {
			IEntity iEntity = processDataEntityRuntime.createEntity();
			Map<String, Object> params = this.getContext().getSettings("binduser", null);
			if(params != null) {
				iEntity.putAll(params);
			}
			
			iEntity.set("opentype", this.getOpenType().toLowerCase());
			iEntity.set("openuserid", strOpenUserId);
			iEntity.set("openaccessid", strOpenTag);
			iEntity.set("dcsystemid", strDCSystemId);
			iEntity.set("openusertag", String.format("%s%s", this.getOpenType().toLowerCase(), strOpenUserId));
			
			Object ret = processDataEntityRuntime.executeLogic(strLogicTag, new Object[] { iEntity });
			if(ret instanceof IEntity) {
				return (IEntity)ret;
			}
		}
		
		if(bTryMode) {
			if(iPSDELogicRuntime == null) {
				log.error(String.format("无法获取指定开放平台[%1$s][%2$s]绑定用户逻辑，忽略绑定用户", this.getOpenType(), strOpenTag));
			}
			return null;
		}
		
		throw new Exception(String.format("无法绑定开放平台用户[%1$s]", strOpenUserId));
	}
	
	protected IEntity unbindUser(IDataEntityRuntime processDataEntityRuntime, String strOpenTag, String strOpenUserId, boolean bTryMode) throws Throwable {
		String strLogicTag = String.format("%1$s_%2$s", this.getOpenType(), LOGICTAG_UNBINDUSER).toUpperCase();
		IDELogicRuntime iPSDELogicRuntime = processDataEntityRuntime.getDELogicRuntime(strLogicTag, true);
		if(iPSDELogicRuntime != null) {
			IEntity iEntity = processDataEntityRuntime.createEntity();
			
			iEntity.set("opentype", this.getOpenType().toLowerCase());
			iEntity.set("openuserid", strOpenUserId);
			iEntity.set("openaccessid", strOpenTag);
			iEntity.set("openusertag", String.format("%s%s", this.getOpenType().toLowerCase(), strOpenUserId));
			
			Object ret = processDataEntityRuntime.executeLogic(strLogicTag, new Object[] { iEntity });
			if(ret instanceof IEntity) {
				return (IEntity)ret;
			}
		}
		
		if(bTryMode) {
			if(iPSDELogicRuntime == null) {
				log.error(String.format("无法获取指定开放平台[%1$s][%2$s]获取解绑用户逻辑，忽略解绑用户", this.getOpenType(), strOpenTag));
			}
			return null;
		}
		
		throw new Exception(String.format("无法获取开放平台用户[%1$s]的绑定用户", strOpenUserId));
	}
	
	protected IEntity getUser(IDataEntityRuntime processDataEntityRuntime, String strOpenTag, String strOpenUserId, boolean bTryMode) throws Throwable {
		String strLogicTag = String.format("%1$s_%2$s", this.getOpenType(), LOGICTAG_GETUSER).toUpperCase();
		IDELogicRuntime iPSDELogicRuntime = processDataEntityRuntime.getDELogicRuntime(strLogicTag, true);
		if(iPSDELogicRuntime != null) {
			IEntity iEntity = processDataEntityRuntime.createEntity();
			
			iEntity.set("opentype", this.getOpenType().toLowerCase());
			iEntity.set("openuserid", strOpenUserId);
			iEntity.set("openaccessid", strOpenTag);
			iEntity.set("openusertag", String.format("%s%s", this.getOpenType().toLowerCase(), strOpenUserId));
			
			Object ret = processDataEntityRuntime.executeLogic(strLogicTag, new Object[] { iEntity });
			if(ret instanceof IEntity) {
				return (IEntity)ret;
			}
		}
		
		if(bTryMode) {
			if(iPSDELogicRuntime == null) {
				log.error(String.format("无法获取指定开放平台[%1$s][%2$s]获取绑定用户逻辑，忽略获取绑定用户", this.getOpenType(), strOpenTag));
			}
			return null;
		}
		
		throw new Exception(String.format("无法获取开放平台用户[%1$s]的绑定用户", strOpenUserId));
	}
	
	
}
