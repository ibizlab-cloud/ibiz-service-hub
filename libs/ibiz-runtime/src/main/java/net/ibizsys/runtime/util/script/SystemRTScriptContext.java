package net.ibizsys.runtime.util.script;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;

import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.res.IPSSysLogic;
import net.ibizsys.runtime.ISystemRuntime;
import net.ibizsys.runtime.ISystemRuntimeContext;
import net.ibizsys.runtime.ISystemUtilRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.res.ISysLogicRuntime;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.AppContext;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogCats;

/**
 * 系统运行时脚本上下文对象实现
 * 
 * @author lionlau
 *
 */
public class SystemRTScriptContext implements ISystemRTScriptContext {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SystemRTScriptContext.class);

	private ISystemRuntimeContext iSystemRuntimeContext = null;
	private IScriptUtil iScriptUtil = new ScriptUtil();
	private Map<String, Object> cacheMap = new HashMap<String, Object>();
	private ScriptAppContext scriptAppContext = new ScriptAppContext();
	private ScriptUserContext scriptUserContext = new ScriptUserContext();
	private ScriptWebContext scriptWebContext = new ScriptWebContext();

	public SystemRTScriptContext(ISystemRuntimeContext iSystemRuntimeContext) {
		this.iSystemRuntimeContext = iSystemRuntimeContext;
	}

	@Override
	public IScriptEntity entity() {
		IEntity iEntity = this.getSystemRuntimeContext().getSystemRuntime().createEntity();
		return this.getSystemRuntimeContext().getSystemRuntime().createScriptEntity(iEntity);
	}

	@Override
	public IScriptEntity entity(String strName) {
		try {
			IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(strName);
			return iDataEntityRuntime.createScriptEntity(null);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntimeContext().getSystemRuntime(), String.format("无法获取指定实体[%1$s]运行时模型对象", strName));
		}
	}

	@Override
	public IScriptEntity[] select(String strName, String strCondition) {

		IDataEntityRuntime iDataEntityRuntime = null;
		try {
			iDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(strName);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntimeContext().getSystemRuntime(), String.format("无法获取指定实体[%1$s]运行时模型对象", strName));
		}

		java.util.List<? extends IEntityBase> list = iDataEntityRuntime.select(strCondition);
		if (list == null || list.size() == 0) {
			return null;
		}
		IScriptEntity[] arr = new IScriptEntity[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = iDataEntityRuntime.createScriptEntity(list.get(i));
		}
		return arr;
	}

	@Override
	public IScriptEntity selectOne(String strName, String strCondition) {
		IDataEntityRuntime iDataEntityRuntime = null;
		try {
			iDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(strName);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntimeContext().getSystemRuntime(), String.format("无法获取指定实体[%1$s]运行时模型对象", strName));
		}

		IEntityBase iEntityBase = iDataEntityRuntime.selectOne(strCondition);
		if (iEntityBase == null) {
			return null;
		}
		return iDataEntityRuntime.createScriptEntity(iEntityBase);
	}

	@Override
	public IScriptEntity selectone(String strName, String strCondition) {
		return selectOne(strName, strCondition);
	}

	@Override
	public int remove(String strName, String strCondition) {
		IDataEntityRuntime iDataEntityRuntime = null;
		try {
			iDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(strName);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntimeContext().getSystemRuntime(), String.format("无法获取指定实体[%1$s]运行时模型对象", strName));
		}

		java.util.List<? extends IEntityBase> list = iDataEntityRuntime.select(strCondition);
		if (list == null || list.size() == 0) {
			return 0;
		}
		for (int i = 0; i < list.size(); i++) {
			try {
				iDataEntityRuntime.remove(iDataEntityRuntime.getFieldValue(list.get(i), iDataEntityRuntime.getKeyPSDEField()));
			} catch (Throwable ex) {
				throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("实体[%1$s]删除指定数据发生异常，%2$s", strName, ex.getMessage()), ex);
			}
		}
		return list.size();
	}

	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return this.iSystemRuntimeContext;
	}

	public ISystemRuntime getSystemRuntime() {
		return this.getSystemRuntimeContext().getSystemRuntime();
	}

	@Override
	public void exception(String strErrorInfo) {
		throw new SystemRuntimeException(getSystemRuntimeContext().getSystemRuntime(), strErrorInfo);
	}

	@Override
	public void exception(String strErrorInfo, int nErrorCode) {
		throw new SystemRuntimeException(getSystemRuntimeContext().getSystemRuntime(), strErrorInfo, nErrorCode);
	}

	@Override
	public void info(String strInfo) {
		log.info(strInfo);
		this.getSystemRuntimeContext().getSystemRuntime().log(ISystemUtilRuntime.LOGLEVEL_INFO, LogCats.SCRIPT, strInfo, null);
	}

	@Override
	public void warn(String strInfo) {
		log.warn(strInfo);
		this.getSystemRuntimeContext().getSystemRuntime().log(ISystemUtilRuntime.LOGLEVEL_WARN, LogCats.SCRIPT, strInfo, null);
	}

	@Override
	public void error(String strInfo) {
		log.error(strInfo);
		this.getSystemRuntimeContext().getSystemRuntime().log(ISystemUtilRuntime.LOGLEVEL_ERROR, LogCats.SCRIPT, strInfo, null);
	}

	@Override
	public IScriptUtil getUtil() {
		return this.iScriptUtil;
	}

	@Override
	public Object call(String strName, Object... objects) {
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		if (actionSession.getDynaInstRuntime() != null) {
			IPSSysLogic iPSSysLogic = actionSession.getDynaInstRuntime().getPSSysLogic(strName);
			if (iPSSysLogic == null) {
				throw new SystemRuntimeException(this.getSystemRuntimeContext().getSystemRuntime(), String.format("无法获取指定系统预置逻辑[%1$s]模型对象", strName));
			}
			ISysLogicRuntime iSysLogicRuntime = actionSession.getDynaInstRuntime().getSysLogicRuntime(iPSSysLogic);
			return iSysLogicRuntime.execute(objects);
		} else {
			IPSSysLogic iPSSysLogic = this.getSystemRuntimeContext().getSystemRuntime().getPSSysLogic(strName);
			if (iPSSysLogic == null) {
				throw new SystemRuntimeException(this.getSystemRuntimeContext().getSystemRuntime(), String.format("无法获取指定系统预置逻辑[%1$s]模型对象", strName));
			}
			ISysLogicRuntime iSysLogicRuntime = this.getSystemRuntimeContext().getSystemRuntime().getSysLogicRuntime(iPSSysLogic);
			return iSysLogicRuntime.execute(objects);
		}
	}

	@Override
	public void setSessionParam(String strName, Object objValue) {
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		actionSession.setActionParam(strName.toUpperCase(), objValue);
	}

	@Override
	public Object removeSessionParam(String strName) {
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		return actionSession.removeActionParam(strName.toUpperCase());
	}

	@Override
	public boolean containsSessionParam(String strName) {
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		return actionSession.containsActionParam(strName.toUpperCase());
	}

	@Override
	public Object getSessionParam(String strName) {
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		return actionSession.getActionParam(strName.toUpperCase());
	}

	@Override
	public void setActionParam(String strName, Object objValue) {
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		String strParamKey = String.format("%1$s_%2$s", strName.toUpperCase(), actionSession.getSessionId());
		actionSession.setActionParam(strParamKey, objValue);
	}

	@Override
	public Object removeActionParam(String strName) {
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		String strParamKey = String.format("%1$s_%2$s", strName.toUpperCase(), actionSession.getSessionId());
		return actionSession.removeActionParam(strParamKey);
	}

	@Override
	public boolean containsActionParam(String strName) {
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		String strParamKey = String.format("%1$s_%2$s", strName.toUpperCase(), actionSession.getSessionId());
		return actionSession.containsActionParam(strParamKey);
	}

	@Override
	public Object getActionParam(String strName) {
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		String strParamKey = String.format("%1$s_%2$s", strName.toUpperCase(), actionSession.getSessionId());
		return actionSession.getActionParam(strParamKey);
	}

	// @Override
	// public IUserContext getUserContext() {
	// return ActionSessionManager.getCurrentSessionMust().getUserContext();
	// }
	//
	// @Override
	// public IAppContext getAppContext() {
	// IAppContext iAppContext =
	// ActionSessionManager.getCurrentSessionMust().getAppContext();
	// if (iAppContext == null) {
	// iAppContext = AppContext.newInstance(null);
	// ActionSessionManager.getCurrentSessionMust().setAppContext(iAppContext);
	// }
	// return iAppContext;
	// }

	@Override
	public IScriptSearchContext filter(String strName) {
		try {
			IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(strName);
			return iDataEntityRuntime.createScriptSearchContext(null);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntimeContext().getSystemRuntime(), String.format("无法获取指定实体[%1$s]运行时模型对象", strName));
		}
	}

	@Override
	public IScriptUserContext user() {
		return scriptUserContext;
	}

	@Override
	public IScriptAppContext context() {
		// 如当前应用上下文不存在则进行新建
		IAppContext iAppContext = ActionSessionManager.getAppContext();
		if (iAppContext == null) {
			iAppContext = AppContext.newInstance(null);
			ActionSessionManager.getCurrentSessionMust().setAppContext(iAppContext);
		}
		return scriptAppContext;
	}
	
//	@Override
//	public IWebc request() {
//		return request(false);
//	}
//	
//	
//	@Override
//	public ServletRequest request(boolean bTryMode) {
//		if(bTryMode) {
//			return ActionSessionManager.getRequest();
//		}
//		else {
//			return ActionSessionManager.getRequestMust();
//		}
//	}

	@Override
	public IScriptCodeList codelist(String strTag) {
		Assert.hasLength(strTag, "传入标识无效");

		String strCacheTag = String.format("_IScriptCodeList_%1$s", strTag).toLowerCase();
		Object obj = this.getCache(strCacheTag);
		if (obj == null) {
			IPSCodeList iPSCodeList = this.getSystemRuntime().getPSSystemService().getPSCodeList(strTag, false);
			ICodeListRuntime iCodeListRuntime = this.getSystemRuntime().getCodeListRuntime(iPSCodeList);
			IScriptCodeList iScriptCodeList = new ScriptCodeList(iCodeListRuntime);
			this.setCache(strCacheTag, iScriptCodeList);
			return iScriptCodeList;
		}
		return (IScriptCodeList) obj;
	}

	@Override
	public String uniqueid(Object... args) {
		if (args != null && args.length > 0) {
			return KeyValueUtils.genUniqueId(args);
		}
		return KeyValueUtils.genUniqueId();
	}

	protected Object getCache(String strKey) {
		return cacheMap.get(strKey);
	}

	protected void setCache(String strKey, Object objValue) {
		this.cacheMap.put(strKey, objValue);
	}

	@Override
	public String format(Object value, String strFormat) {
		value = ScriptUtils.getReal(value);
		if (value == null) {
			return null;
		}
		if (value instanceof java.util.Date) {
			return new SimpleDateFormat(strFormat).format((java.util.Date) value);
		}

		// 数值等后续按需实现
		return value.toString();
	}

	@Override
	public IScriptWebContext request() {
		return request(false);
	}

	@Override
	public IScriptWebContext request(boolean bTryMode) {
		if(bTryMode) {
			if(ActionSessionManager.getUserContextMust().getWebContext()!=null) {
				return scriptWebContext;
			}
			return null;
		}
		else {
			ActionSessionManager.getUserContextMust().getWebContextMust();
			return scriptWebContext;
		}
		
	}
	
	

	// @Override
	// public Object config(String strKey, Object defValue) {
	// String strTag = String.format("config.%1$s", strKey);
	// Object objValue =
	// this.getSystemRuntimeContext().getSystemRuntime().getGlobalParam(strTag);
	// if(objValue != null) {
	// return objValue;
	// }
	// return defValue;
	// }
	//

}
