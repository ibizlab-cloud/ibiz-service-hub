package net.ibizsys.central.util.groovy;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.ba.ISysBDSchemeRuntime;
import net.ibizsys.central.bi.ISysBISchemeRuntime;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.eai.ISysEAIAgentRuntime;
import net.ibizsys.central.res.ISysResourceRuntime;
import net.ibizsys.central.search.ISysSearchSchemeRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntime;
import net.ibizsys.central.sysutil.ISysUtilRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.script.IScriptList;
import net.ibizsys.central.util.script.IScriptPage;
import net.ibizsys.central.util.script.ScriptPageImpl;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.res.ISysLogicRuntime;
import net.ibizsys.runtime.res.ISysSFPluginRuntime;
import net.ibizsys.runtime.res.ISysSequenceRuntime;
import net.ibizsys.runtime.res.ISysTranslatorRuntime;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.sysutil.ISysFileUtilRuntime;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.AppContext;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IWebContext;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;


public class SystemRTGroovyContext implements ISystemRTGroovyContext {

	private ISystemRuntimeContext systemRuntimeContext = null;
	
	private Random random = new Random();
	
	
	public SystemRTGroovyContext(ISystemRuntimeContext systemRuntimeContext) {
		Assert.notNull(systemRuntimeContext, "传入系统运行时上下文无效");
		this.systemRuntimeContext = systemRuntimeContext;
	}
	
	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return this.systemRuntimeContext;
	}
	
	protected ISystemRuntime getSystemRuntime() {
		return this.getSystemRuntimeContext().getSystemRuntime();
	}
	
	@Override
	public IWebClient webclient() {
		return getSystemRuntime().getDefaultWebClient();
	}

	@Override
	public IWebClient webclient(String tag) {
		return subsysapi(tag).getWebClient();
	}
	
	
	@Override
	public IDataEntityRuntime dataentity(String tag) {
		return this.getSystemRuntime().getDataEntityRuntime(tag, false);
	}

	@Override
	public IDEService deservice(String tag) {
		return this.dataentity(tag).getDEService();
	}
	
	@Override
	public ISubSysServiceAPIRuntime subsysapi(String tag) {
		return this.getSystemRuntime().getSubSysServiceAPIRuntime(tag, false);
	}

	@Override
	public ISysUtilRuntime util(String tag) {
		return (ISysUtilRuntime)this.getSystemRuntime().getSysUtilRuntime(tag, false);
	}
	
	@Override
	public ICodeListRuntime codelist(String tag) {
		return this.getSystemRuntime().getCodeListRuntime(tag, false);
	}
	
	@Override
	public IEntity entity() {
		return new Entity();
	}

	@Override
	public IEntityDTO entity(String tag) {
		return dataentity(tag).createEntity();
	}
	
	@Override
	public ISearchContextDTO filter(String tag) {
		return dataentity(tag).createSearchContext();
	}
	
	@Override
	public ISysLogicRuntime logic(String tag) {
		return this.getSystemRuntime().getSysLogicRuntime(tag, false);
	}
	
	
	
	@Override
	public ISysSequenceRuntime sequence(String tag) {
		return this.getSystemRuntime().getSysSequenceRuntime(tag, false);
	}

	@Override
	public ISysTranslatorRuntime translator(String tag) {
		return this.getSystemRuntime().getSysTranslatorRuntime(tag, false);
	}
	
	

	@Override
	public ISysDataSyncAgentRuntime datasyncagent(String tag) {
		return this.getSystemRuntime().getSysDataSyncAgentRuntime(tag, false);
	}

	@Override
	public ISysEAIAgentRuntime eaiagent(String tag) {
		ISysDataSyncAgentRuntime iSysDataSyncAgentRuntime = this.getSystemRuntime().getSysDataSyncAgentRuntime(tag, false);
		if(iSysDataSyncAgentRuntime instanceof ISysEAIAgentRuntime) {
			return (ISysEAIAgentRuntime)iSysDataSyncAgentRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), String.format("应用集成代理[%1$s]类型不正确", tag));
	}
	
	@Override
	public ISysDBSchemeRuntime dbschema(String tag) {
		return dbscheme(tag);
	}
	
	@Override
	public ISysDBSchemeRuntime dbscheme(String tag) {
		return this.getSystemRuntime().getSysDBSchemeRuntime(tag, false);
	}
	
	@Override
	public ISysBDSchemeRuntime bdschema(String tag) {
		return bdscheme(tag);
	}
	
	@Override
	public ISysBDSchemeRuntime bdscheme(String tag) {
		return this.getSystemRuntime().getSysBDSchemeRuntime(tag, false);
	}
	
	@Override
	public ISysBISchemeRuntime bischema(String tag) {
		return bischeme(tag);
	}
	
	@Override
	public ISysBISchemeRuntime bischeme(String tag) {
		return this.getSystemRuntime().getSysBISchemeRuntime(tag, false);
	}
	
	@Override
	public ISysSearchSchemeRuntime searchschema(String tag) {
		return searchscheme(tag);
	}
	
	@Override
	public ISysSearchSchemeRuntime searchscheme(String tag) {
		return this.getSystemRuntime().getSysSearchSchemeRuntime(tag, false);
	}
	
	

	@Override
	public ISysResourceRuntime resource(String tag) {
		return this.getSystemRuntime().getSysResourceRuntime(tag, false);
	}
	
	@Override
	public ISysSFPluginRuntime sfplugin(String tag) {
		return this.getSystemRuntime().getSysSFPluginRuntime(tag, false);
	}
	
	
	@Override
	public Object plugin(String tag) {
		try {
			return this.getSystemRuntime().getSysSFPluginRuntime(tag, false).getRuntimeObject(false);
		}
		catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), String.format("获取插件[%1$s]发生异常，%2$s", tag, ex.getMessage()), ex);
		}
	}
	
	@Override
	public Object create(String tag) {
		try {
			return this.getSystemRuntime().getSysSFPluginRuntime(tag, false).getRuntimeObject(true);
		}
		catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), String.format("获取插件[%1$s]发生异常，%2$s", tag, ex.getMessage()), ex);
		}
	}
	
	
	@Override
	public Object config(String strKey) {
		return config(strKey, null);
	}
	
	@Override
	public Object config(String strKey, Object defValue) {
		Object value = this.getSystemRuntime().getSystemRuntimeSetting().getParam(strKey);
		return (value != null)?value:defValue;
	}
	
	@Override
	public Object param(String strKey) {
		return param(strKey, null);
	}

	@Override
	public Object param(String strKey, Object defValue) {
		Object value = this.getSystemRuntime().getSystemRuntimeSetting().getParam("param." + strKey);
		return (value != null)?value:defValue;
	}

	@Override
	public Object getModelRuntime(Class<?> theClass, String tag) {
		if (ISysUtilRuntime.class.isAssignableFrom(theClass)) {
			if (ISysFileUtilRuntime.class.isAssignableFrom(theClass)) {
				return this.getSystemRuntime().getSysFileUtilRuntime(true);
			}
			if (ISysCacheUtilRuntime.class.isAssignableFrom(theClass)) {
				return this.getSystemRuntime().getSysCacheUtilRuntime(true);
			}
			if (ISysUniStateUtilRuntime.class.isAssignableFrom(theClass)) {
				return this.getSystemRuntime().getSysUniStateUtilRuntime(true);
			}
			
			if(StringUtils.hasLength(tag)) {
				Object obj = this.getSystemRuntime().getSysUtilRuntime(tag, true);
				if(obj != null) {
					return obj;
				}
			}
			
			return this.getSystemRuntime().getSysUtilRuntime(theClass, false);
			
			//return getModelRuntime(MODELTYPE_UTIL, tag);
		}
		if (ISubSysServiceAPIRuntime.class.isAssignableFrom(theClass)) {
			return getModelRuntime(MODELTYPE_SUBSYSAPI, tag);
		}
		if (IWebClient.class.isAssignableFrom(theClass)) {
			return getModelRuntime(MODELTYPE_WEBCLIENT, tag);
		}
		if (IDataEntityRuntime.class.isAssignableFrom(theClass)) {
			return getModelRuntime(MODELTYPE_DATAENTITY, tag);
		}
		if (IDEService.class.isAssignableFrom(theClass)) {
			return getModelRuntime(MODELTYPE_DESERVICE, tag);
		}
		if (ISysLogicRuntime.class.isAssignableFrom(theClass)) {
			return getModelRuntime(MODELTYPE_LOGIC, tag);
		}
		if (ICodeListRuntime.class.isAssignableFrom(theClass)) {
			return getModelRuntime(MODELTYPE_CODELIST, tag);
		}
		if (ISysTranslatorRuntime.class.isAssignableFrom(theClass)) {
			return getModelRuntime(MODELTYPE_TRANSLATOR, tag);
		}
		if (ISysSequenceRuntime.class.isAssignableFrom(theClass)) {
			return getModelRuntime(MODELTYPE_SEQUENCE, tag);
		}
		if (ISysDataSyncAgentRuntime.class.isAssignableFrom(theClass)) {
			return getModelRuntime(MODELTYPE_DATASYNCAGENT, tag);
		}
		if (ISysEAIAgentRuntime.class.isAssignableFrom(theClass)) {
			return getModelRuntime(MODELTYPE_EAIAGENT, tag);
		}
		if (ISysDBSchemeRuntime.class.isAssignableFrom(theClass)) {
			return getModelRuntime(MODELTYPE_DBSCHEME, tag);
		}
		
		if (ISysBDSchemeRuntime.class.isAssignableFrom(theClass)) {
			return getModelRuntime(MODELTYPE_BDSCHEME, tag);
		}
		
		if (ISysBISchemeRuntime.class.isAssignableFrom(theClass)) {
			return getModelRuntime(MODELTYPE_BISCHEME, tag);
		}

		if (ISysSearchSchemeRuntime.class.isAssignableFrom(theClass)) {
			return getModelRuntime(MODELTYPE_SEARCHSCHEME, tag);
		}
		
		if (ISysResourceRuntime.class.isAssignableFrom(theClass)) {
			return getModelRuntime(MODELTYPE_RESOURCE, tag);
		}
		
		if (ISysSFPluginRuntime.class.isAssignableFrom(theClass)) {
			return getModelRuntime(MODELTYPE_SFPLUGIN, tag);
		}
		
		if (ISystemRuntime.class.isAssignableFrom(theClass)) {
			return getModelRuntime(MODELTYPE_SYS, tag);
		}
		
		return this.onGetModelRuntime(theClass, tag);
		
	}
	
	protected Object onGetModelRuntime(Class<?> theClass, String tag) {
		throw new RuntimeException(String.format("无法识别的运行时对象[%1$s][%2$s]", theClass.getName(), tag));
	}

	@Override
	public Object getModelRuntime(String type, String tag) {
		
		if(MODELTYPE_SYS.equalsIgnoreCase(type)) {
			return this.getSystemRuntime();
		}
		
		if(MODELTYPE_UTIL.equalsIgnoreCase(type)) {
			return this.util(tag);
		}
		if(MODELTYPE_SUBSYSAPI.equalsIgnoreCase(type)) {
			return this.subsysapi(tag);
		}
		if(MODELTYPE_WEBCLIENT.equalsIgnoreCase(type)) {
			return this.webclient(tag);
		}
		if(MODELTYPE_DATAENTITY.equalsIgnoreCase(type)) {
			return this.dataentity(tag);
		}
		if(MODELTYPE_DESERVICE.equalsIgnoreCase(type)) {
			return this.deservice(tag);
		}
		
		if(MODELTYPE_LOGIC.equalsIgnoreCase(type)) {
			return this.logic(tag);
		}
		
		if(MODELTYPE_CODELIST.equalsIgnoreCase(type)) {
			return this.codelist(tag);
		}
		
		if(MODELTYPE_SEQUENCE.equalsIgnoreCase(type)) {
			return this.sequence(tag);
		}
		
		if(MODELTYPE_TRANSLATOR.equalsIgnoreCase(type)) {
			return this.translator(tag);
		}
		
		if(MODELTYPE_DATASYNCAGENT.equalsIgnoreCase(type)) {
			return this.datasyncagent(tag);
		}
		
		if(MODELTYPE_EAIAGENT.equalsIgnoreCase(type)) {
			return this.eaiagent(tag);
		}
		
		if(MODELTYPE_DBSCHEMA.equalsIgnoreCase(type)
				||MODELTYPE_DBSCHEME.equalsIgnoreCase(type)) {
			return this.dbscheme(tag);
		}
		
		if(MODELTYPE_BDSCHEMA.equalsIgnoreCase(type)
				||MODELTYPE_BDSCHEME.equalsIgnoreCase(type)) {
			return this.bdscheme(tag);
		}
		
		if(MODELTYPE_BISCHEMA.equalsIgnoreCase(type)
				||MODELTYPE_BISCHEME.equalsIgnoreCase(type)) {
			return this.bischeme(tag);
		}
		
		if(MODELTYPE_SEARCHSCHEMA.equalsIgnoreCase(type)
				||MODELTYPE_SEARCHSCHEME.equalsIgnoreCase(type)) {
			return this.searchscheme(tag);
		}
		
		if(MODELTYPE_RESOURCE.equalsIgnoreCase(type)) {
			return this.resource(tag);
		}
		
		
		if(MODELTYPE_PLUGIN.equalsIgnoreCase(type)) {
			return this.plugin(tag);
		}
		
		if(MODELTYPE_CONFIG.equalsIgnoreCase(type)) {
			return this.config(tag);
		}
		
		if(MODELTYPE_PARAM.equalsIgnoreCase(type)) {
			return this.param(tag);
		}
		
		return this.onGetModelRuntime(type, tag);
	}
	
	protected Object onGetModelRuntime(String type, String tag) {
		throw new RuntimeException(String.format("无法识别的运行时对象[%1$s][%2$s]", type, tag));
	}

	@Override
	public IAppContext context() {
		IAppContext iAppContext = ActionSessionManager.getAppContext();
		if (iAppContext == null) {
			iAppContext = AppContext.newInstance(null);
			ActionSessionManager.getCurrentSessionMust().setAppContext(iAppContext);
		}
		return iAppContext;
	}

	@Override
	public IUserContext user() {
		return UserContext.getCurrentMust();
	}

	@Override
	public IWebContext request() {
		return request(false);
	}
	
	@Override
	public IWebContext request(boolean bTryMode) {
		if(bTryMode) {
			return ActionSessionManager.getWebContext();
		}
		else {
			return ActionSessionManager.getWebContextMust();
		}
	}
	
	
	
	
	@Override
	public ActionSession session() {
		return session(false);
	}

	@Override
	public ActionSession session(boolean bTryMode) {
		if(bTryMode) {
			return ActionSessionManager.getCurrentSession();
		}
		else {
			return ActionSessionManager.getCurrentSessionMust();
		}
	}

	@Override
	public void info(String info) {
		this.getSystemRuntime().log(LogLevels.INFO, LogCats.GROOVY, info, null);
	}

	@Override
	public void warn(String info) {
		this.getSystemRuntime().log(LogLevels.WARN, LogCats.GROOVY, info, null);
	}

	@Override
	public void error(String info) {
		this.getSystemRuntime().log(LogLevels.ERROR, LogCats.GROOVY, info, null);
	}


	@Override
	public int random(int nMax) {
		return this.random.nextInt(nMax);
	}

	
	@Override
	public IScriptList list() {
		return list(null);
	}

	@Override
	public IScriptList list(Object obj) {
		return list(obj, null);
	}

	@Override
	public IScriptList list(Object obj, Object data) {
		
		List source = null;
		if(data != null) {
			if(obj instanceof String) {
				String strName = obj.toString();
				IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strName);
				source = iDataEntityRuntime.deserializeEntityList(data);
			}
			else {
				source = this.getSystemRuntime().deserialize(data, List.class);
			}
		}
		List list =  new ArrayList();
		if(obj instanceof Boolean) {
			IScriptList scriptList = this.getSystemRuntime().createScriptList(list, (Boolean)obj);
			if(source != null) {
				scriptList.addAll(source);
			}
			return scriptList;
		}
		
		IScriptList scriptList = this.getSystemRuntime().createScriptList(list);
		if(source != null) {
			scriptList.addAll(source);
		}
		return scriptList;
	}

	@Override
	public IScriptPage page() {
		return page(null);
	}

	@Override
	public IScriptPage page(Object obj) {
		return page(obj, null);
	}

	@Override
	public IScriptPage page(Object obj, Object data) {
		List source = null;
		if (data != null) {
			if (obj instanceof String) {
				String strName = obj.toString();
				IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strName);
				source = iDataEntityRuntime.deserializeEntityList(data);
			} else {
				source = this.getSystemRuntime().deserialize(data, List.class);
			}
		}
		Page page = new ScriptPageImpl(new ArrayList<>(), Pageable.unpaged(), 0);
		if (obj instanceof Boolean) {
			IScriptPage iScriptPage = this.getSystemRuntime().createScriptPage(page, (Boolean) obj);
			if (source != null) {
				iScriptPage.addAll(source);
			}
			return iScriptPage;
		}

		IScriptPage iScriptPage = this.getSystemRuntime().createScriptPage(page);
		if (source != null) {
			iScriptPage.addAll(source);
		}
		return iScriptPage;
	}

	@Override
	public IScriptPage page(Object obj, Object data, int pageNo, int size) {
		List source = null;
		if (data != null) {
			if (obj instanceof String) {
				String strName = obj.toString();
				IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strName);
				source = iDataEntityRuntime.deserializeEntityList(data);
			} else {
				source = this.getSystemRuntime().deserialize(data, List.class);
			}
		}
		Page page = new ScriptPageImpl(new ArrayList<>(), PageRequest.of(pageNo, size), 0);
		if (obj instanceof Boolean) {
			IScriptPage iScriptPage = this.getSystemRuntime().createScriptPage(page, (Boolean) obj);
			if (source != null) {
				iScriptPage.addAll(source);
			}
			return iScriptPage;
		}

		IScriptPage iScriptPage = this.getSystemRuntime().createScriptPage(page);
		if (source != null) {
			iScriptPage.addAll(source);
		}
		return iScriptPage;
	}


	
	
}
