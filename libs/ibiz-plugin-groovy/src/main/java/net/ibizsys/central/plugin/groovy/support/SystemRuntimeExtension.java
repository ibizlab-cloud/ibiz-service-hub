package net.ibizsys.central.plugin.groovy.support;

import groovy.lang.Closure;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.eai.ISysEAIAgentRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.sysutil.ISysUtilRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.script.IScriptList;
import net.ibizsys.central.util.script.IScriptPage;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.res.ISysLogicRuntime;
import net.ibizsys.runtime.res.ISysSequenceRuntime;
import net.ibizsys.runtime.res.ISysTranslatorRuntime;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IWebContext;

/**
 * 系统运行时对象Groovy扩展
 * @author lionlau
 *
 */
public class SystemRuntimeExtension {

	public static IWebClient webclient(ISystemRuntime iSystemRuntime) {
		return iSystemRuntime.getSystemRTGroovyContext().webclient();
	}

	public static IWebClient getWebclient(ISystemRuntime iSystemRuntime) {
		return iSystemRuntime.getSystemRTGroovyContext().webclient();
	}
	
	public static IWebClient webclient(ISystemRuntime iSystemRuntime, String tag) {
		return iSystemRuntime.getSystemRTGroovyContext().webclient(tag);
	}
	
	public static IDataEntityRuntime dataentity(ISystemRuntime iSystemRuntime, String tag) {
		return iSystemRuntime.getSystemRTGroovyContext().dataentity(tag);
	}

	public static ISubSysServiceAPIRuntime subsysapi(ISystemRuntime iSystemRuntime, String tag) {
		return iSystemRuntime.getSystemRTGroovyContext().subsysapi(tag);
	}

	public static ISysUtilRuntime util(ISystemRuntime iSystemRuntime, String tag) {
		return iSystemRuntime.getSystemRTGroovyContext().util(tag);
	}
	
	
	public static ISysUtilRuntime util(ISystemRuntime iSystemRuntime, Class<? extends ISysUtilRuntime> cls) {
		return iSystemRuntime.getSysUtilRuntime(cls, false);
	}
	
	public static ICodeListRuntime codelist(ISystemRuntime iSystemRuntime, String tag) {
		return iSystemRuntime.getSystemRTGroovyContext().codelist(tag);
	}
	
	public static IEntity entity(ISystemRuntime iSystemRuntime) {
		return iSystemRuntime.getSystemRTGroovyContext().entity();
	}

	
	public static IEntityDTO entity(ISystemRuntime iSystemRuntime, String tag) {
		return iSystemRuntime.getSystemRTGroovyContext().entity(tag);
	}
	
	public static ISearchContextDTO filter(ISystemRuntime iSystemRuntime, String tag) {
		return iSystemRuntime.getSystemRTGroovyContext().filter(tag);
	}
	
	public static ISysLogicRuntime logic(ISystemRuntime iSystemRuntime, String tag) {
		return iSystemRuntime.getSystemRTGroovyContext().logic(tag);
	}
	
	public static ISysSequenceRuntime sequence(ISystemRuntime iSystemRuntime, String tag) {
		return iSystemRuntime.getSystemRTGroovyContext().sequence(tag);
	}

	public static ISysTranslatorRuntime translator(ISystemRuntime iSystemRuntime, String tag) {
		return iSystemRuntime.getSystemRTGroovyContext().translator(tag);
	}
	
	public static ISysDataSyncAgentRuntime datasyncagent(ISystemRuntime iSystemRuntime, String tag) {
		return iSystemRuntime.getSystemRTGroovyContext().datasyncagent(tag);
	}

	public static ISysEAIAgentRuntime eaiagent(ISystemRuntime iSystemRuntime, String tag) {
		return iSystemRuntime.getSystemRTGroovyContext().eaiagent(tag);
	}
	
	public static ISysDBSchemeRuntime dbscheme(ISystemRuntime iSystemRuntime, String tag) {
		return iSystemRuntime.getSystemRTGroovyContext().dbscheme(tag);
	}

	public static ISysDBSchemeRuntime dbschema(ISystemRuntime iSystemRuntime, String tag) {
		return iSystemRuntime.getSystemRTGroovyContext().dbschema(tag);
	}
	
	public static Object plugin(ISystemRuntime iSystemRuntime, String tag) {
		return iSystemRuntime.getSystemRTGroovyContext().plugin(tag);
	}
	
	public static Object create(ISystemRuntime iSystemRuntime, String tag) {
		return iSystemRuntime.getSystemRTGroovyContext().create(tag);
	}
	
	public static Object config(ISystemRuntime iSystemRuntime, String strKey) {
		return iSystemRuntime.getSystemRTGroovyContext().config(strKey);
	}
	
	
	public static Object config(ISystemRuntime iSystemRuntime, String strKey, Object defValue) {
		return iSystemRuntime.getSystemRTGroovyContext().config(strKey, defValue);
	}
	
	
	public static Object param(ISystemRuntime iSystemRuntime, String strKey) {
		return iSystemRuntime.getSystemRTGroovyContext().param(strKey);
	}

	public static Object param(ISystemRuntime iSystemRuntime, String strKey, Object defValue) {
		return iSystemRuntime.getSystemRTGroovyContext().param(strKey, defValue);
	}

	public static IAppContext context(ISystemRuntime iSystemRuntime) {
		return iSystemRuntime.getSystemRTGroovyContext().context();
	}
	
	public static IAppContext getContext(ISystemRuntime iSystemRuntime) {
		return iSystemRuntime.getSystemRTGroovyContext().context();
	}

	public static IUserContext user(ISystemRuntime iSystemRuntime) {
		return iSystemRuntime.getSystemRTGroovyContext().user();
	}

	public static IUserContext getUser(ISystemRuntime iSystemRuntime) {
		return iSystemRuntime.getSystemRTGroovyContext().user();
	}
	
	public static IWebContext request(ISystemRuntime iSystemRuntime) {
		return iSystemRuntime.getSystemRTGroovyContext().request();
	}
	
	public static IWebContext request(ISystemRuntime iSystemRuntime, boolean bTryMode) {
		return iSystemRuntime.getSystemRTGroovyContext().request(bTryMode);
	}
	
	public static IWebContext getRequest(ISystemRuntime iSystemRuntime) {
		return iSystemRuntime.getSystemRTGroovyContext().request();
	}
	
	public static void info(ISystemRuntime iSystemRuntime, String info) {
		iSystemRuntime.getSystemRTGroovyContext().info(info);
	}

	public static void warn(ISystemRuntime iSystemRuntime, String info) {
		iSystemRuntime.getSystemRTGroovyContext().warn(info);
	}

	public static void error(ISystemRuntime iSystemRuntime, String info) {
		iSystemRuntime.getSystemRTGroovyContext().error(info);
	}
	
	public static int random(ISystemRuntime iSystemRuntime, int bound) {
		return iSystemRuntime.getSystemRTGroovyContext().random(bound);
	}
	
	public static ICloudAIUtilRuntime aiutil(ISystemRuntime iSystemRuntime) {
		return iSystemRuntime.getSysUtilRuntime(ICloudAIUtilRuntime.class, false);
	}
	
	public static IScriptList list(ISystemRuntime iSystemRuntime) {
		return iSystemRuntime.getSystemRTGroovyContext().list();
	}
	
	public static IScriptList list(ISystemRuntime iSystemRuntime, Object obj) {
		return iSystemRuntime.getSystemRTGroovyContext().list(obj);
	}
	
	public static IScriptList list(ISystemRuntime iSystemRuntime, Object obj, Object data) {
		return iSystemRuntime.getSystemRTGroovyContext().list(obj, data);
	}
	
	
	public static IScriptPage page(ISystemRuntime iSystemRuntime){
		return iSystemRuntime.getSystemRTGroovyContext().page();
	}
	
	public static IScriptPage page(ISystemRuntime iSystemRuntime, Object obj) {
		return iSystemRuntime.getSystemRTGroovyContext().page(obj);
	}
	

	public static IScriptPage page(ISystemRuntime iSystemRuntime, Object obj, Object data) {
		return iSystemRuntime.getSystemRTGroovyContext().page(obj, data);
	}

	public static IScriptPage page(ISystemRuntime iSystemRuntime, Object obj, Object data, int pageNo, int size) {
		return iSystemRuntime.getSystemRTGroovyContext().page(obj, data, pageNo, size);
	}
	
	
	
	public static void threadRun(ISystemRuntime iSystemRuntime, Closure<?> closure) {
		threadRun(iSystemRuntime, closure, -1);
	}

	public static void threadRun(ISystemRuntime iSystemRuntime, Closure<?> closure, long nTime) {
		iSystemRuntime.threadRun(new Runnable() {

			@Override
			public void run() {
				closure.call();
			}
			
		}, nTime);
	}
}
