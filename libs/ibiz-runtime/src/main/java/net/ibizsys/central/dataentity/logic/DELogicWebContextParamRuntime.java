package net.ibizsys.central.dataentity.logic;

import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.IWebContext;

/**
 * WebContext参数运行时对象实现
 * 
 * @author lionlau
 *
 */
public class DELogicWebContextParamRuntime extends DELogicSysParamRuntimeBase {

	public final static String PARAM_PARAM_PREFIX = "SRFPARAM.";
	
	public final static String PARAM_HEADER_PREFIX = "SRFHEADER.";
	
	public final static String PARAM_PARAMVALUES_PREFIX = "SRFPARAMVALUES.";
	
	public final static String PARAM_HEADERVALUES_PREFIX = "SRFHEADERVALUES.";
	
	public final static String PARAM_PARAMNAMES = "paramnames";
	
	public final static String PARAM_HEADERNAMES = "headernames";
	
	
	@Override
	public Object getScriptObject(IDELogicSession iDELogicSession) throws Throwable {
		Object objParam = getParamObject(iDELogicSession);
		if (objParam instanceof IWebContext) {
			return this.getSystemRuntime().getSystemRTScriptContext().request();
		}
		return super.getScriptObject(iDELogicSession);
	}

	@Override
	public Object getParamObject(IDELogicSession iDELogicSession) throws Throwable {
		return iDELogicSession.getWebContext();
	}

	@Override
	public Object onGet(IDELogicSession iDELogicSession, String strName) throws Throwable {
		
		IWebContext iWebContext = (IWebContext)this.getParamObject(iDELogicSession);
		if(iWebContext == null) {
			throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]Web上下文对象无效", getCodeName()));
		}
		
		String strName2 = strName.toUpperCase();
		if(strName2.indexOf(PARAM_PARAM_PREFIX) == 0) {
			strName2 = strName.substring(PARAM_PARAM_PREFIX.length());
			return iWebContext.getParameter(strName2);
		}
		
		if(strName2.indexOf(PARAM_HEADER_PREFIX) == 0) {
			strName2 = strName.substring(PARAM_HEADER_PREFIX.length());
			return iWebContext.getHeader(strName2);
		}
		
		if(strName2.indexOf(PARAM_PARAMVALUES_PREFIX) == 0) {
			strName2 = strName.substring(PARAM_PARAMVALUES_PREFIX.length());
			return iWebContext.getParameterValues(strName2);
		}
		
		if(strName2.indexOf(PARAM_HEADERVALUES_PREFIX) == 0) {
			strName2 = strName.substring(PARAM_HEADERVALUES_PREFIX.length());
			return iWebContext.getHeaderValues(strName2);
		}
		
		if(strName2.equals(PARAM_PARAMNAMES)) {
			return iWebContext.getParameterNames();
		}
		
		if(strName2.equals(PARAM_HEADERNAMES)) {
			return iWebContext.getHeaderNames();
		}
		
		return iWebContext.getParameter(strName);
	}

}
