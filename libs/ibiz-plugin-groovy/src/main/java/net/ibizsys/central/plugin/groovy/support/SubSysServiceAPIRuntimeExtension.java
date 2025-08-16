package net.ibizsys.central.plugin.groovy.support;

import java.util.Map;

import net.ibizsys.central.service.ISubSysServiceAPIDERuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.central.service.SubSysServiceAPIRuntimeException;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.model.service.IPSSubSysServiceAPIDE;
import net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod;
import net.ibizsys.model.service.IPSSubSysServiceAPIMethodInput;
import net.ibizsys.model.service.IPSSubSysServiceAPIMethodReturn;
import net.ibizsys.runtime.util.script.ScriptUtils;

public class SubSysServiceAPIRuntimeExtension {

	public static String getTokenurl(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime) {
		return iSubSysServiceAPIRuntime.getAccessTokenUrl();
	}

	public static String getClientid(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime) {
		return iSubSysServiceAPIRuntime.getClientId();
	}

	public static String getClientsecret(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime) {
		return iSubSysServiceAPIRuntime.getClientSecret();
	}

	public static String getAuthmode(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime) {
		return iSubSysServiceAPIRuntime.getAuthMode();
	}

	public static String getAuthparam(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime) {
		return iSubSysServiceAPIRuntime.getAuthParam();
	}

	public static String getAuthparam2(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime) {
		return iSubSysServiceAPIRuntime.getAuthParam2();
	}

	public static ISubSysServiceAPIRuntime header(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntim, Object objHeader) {
		Object objValue = ScriptUtils.getReal(objHeader);
		if(objValue instanceof Map) {
			iSubSysServiceAPIRuntim.setHeaders((Map)objValue);
		}
		else
			throw new SubSysServiceAPIRuntimeException(iSubSysServiceAPIRuntim, String.format("无法识别的请求头数据"));
		return iSubSysServiceAPIRuntim;
	}

	
	public static ISubSysServiceAPIRuntime tokentimeout(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntim, Object objTime) {
		return expirein(iSubSysServiceAPIRuntim, objTime);
	}
	
	public static ISubSysServiceAPIRuntime expirein(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntim, Object objTime) {
		if(objTime != null) {
			Object objValue = ScriptUtils.getReal(objTime);
			if(objValue != null) {
				int nValue = Integer.parseInt(objValue.toString());
				if(nValue > 0) {
					iSubSysServiceAPIRuntim.setTokenTimeout(System.currentTimeMillis() + nValue * 1000);
				}
			}
		}
		
		//
		return iSubSysServiceAPIRuntim;
	}
	
	public static IWebClient webclient(ISubSysServiceAPIRuntime iSubSysServiceAPIRuntim) {
		return iSubSysServiceAPIRuntim.getWebClient();
	}
	
	
	public static String getDename(ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime) {
		return iSubSysServiceAPIDERuntime.getName();
	}
	
	public static String getDename(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod) {
		return iPSSubSysServiceAPIDEMethod.getParentPSModelObject(IPSSubSysServiceAPIDE.class, false).getName();
	}

	public static String getPath(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod) {
		return iPSSubSysServiceAPIDEMethod.getRequestPath();
	}

	public static String getMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod) {
		return iPSSubSysServiceAPIDEMethod.getRequestMethod();
	}

	public static String getType(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod) {
		return iPSSubSysServiceAPIDEMethod.getMethodType();
	}

	public static String getCodename(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod) {
		return iPSSubSysServiceAPIDEMethod.getCodeName();
	}

	public static String getTag(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod) {
		return iPSSubSysServiceAPIDEMethod.getMethodTag();
	}

	public static String getTag2(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod) {
		return iPSSubSysServiceAPIDEMethod.getMethodTag2();
	}
	
	public static String getContenttype(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod) {
		return iPSSubSysServiceAPIDEMethod.getBodyContentType();
	}

	public static IPSSubSysServiceAPIMethodInput getInput(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod) {
		return iPSSubSysServiceAPIDEMethod.getPSSubSysServiceAPIMethodInput();
	}

	public static IPSSubSysServiceAPIMethodReturn getReturn(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod) {
		return iPSSubSysServiceAPIDEMethod.getPSSubSysServiceAPIMethodReturn();
	}
}
