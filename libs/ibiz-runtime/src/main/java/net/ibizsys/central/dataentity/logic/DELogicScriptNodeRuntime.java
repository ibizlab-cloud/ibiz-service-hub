package net.ibizsys.central.dataentity.logic;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemUtilRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.script.ISystemRTScriptContext;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam;
import net.ibizsys.model.dataentity.logic.IPSDELogicParam;
import net.ibizsys.model.dataentity.logic.IPSDERawCodeLogic;
import net.ibizsys.runtime.ModelRuntimeBase;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.script.ScriptUtils;

/**
 * 实体逻辑脚本节点运行时
 * 
 * @author lionlau
 *
 */
public class DELogicScriptNodeRuntime extends ModelRuntimeBase implements IDELogicScriptNodeRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DELogicScriptNodeRuntime.class);

	private String strScript = null;
	private String strMode = null;
	private IDELogicNodeRuntime iDELogicNodeRuntime = null;
	private ISystemRTScriptContext iSystemRTScriptContext = null;
	private Invocable invocable = null;
	private IDELogicScriptNodeRuntimeContext iDELogicScriptNodeRuntimeContext = null;
	private String strScriptEngine = null;

	public DELogicScriptNodeRuntime() {

	}
	
	@Override
	public void init(ISystemRTScriptContext iSystemRTScriptContext, IDELogicNodeRuntime iDELogicNodeRuntime, String strScriptEngine, String strScript, String strMode) throws Exception {
		this.iDELogicNodeRuntime = iDELogicNodeRuntime;
		this.strScript = strScript;
		this.strScriptEngine = strScriptEngine;
		if(!StringUtils.hasLength(this.strScriptEngine)) {
			this.strScriptEngine = iSystemRTScriptContext.getSystemRuntime().getScriptEngine(strScript);
		}		
		this.strMode = strMode;
		this.iSystemRTScriptContext = iSystemRTScriptContext;
		this.iDELogicScriptNodeRuntimeContext = new DELogicScriptNodeRuntimeContext(iDELogicNodeRuntime);
		onInit();
	}

	@Override
	public void init(ISystemRTScriptContext iSystemRTScriptContext, IDELogicNodeRuntime iDELogicNodeRuntime, String strScript, String strMode) throws Exception {
		this.init(iSystemRTScriptContext, iDELogicNodeRuntime, null, strScript, strMode);
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return null;
	}
	
	public IDELogicNodeRuntime getDELogicNodeRuntime() {
		return iDELogicNodeRuntime;
	}
	
	public String getMode() {
		return this.strMode;
	}
	
	public String getScriptEngine() {
		return this.strScriptEngine;
	}
	
	protected ISystemRTScriptContext getSystemRTScriptContext() {
		return this.iSystemRTScriptContext;
	}

	protected IDELogicScriptNodeRuntimeContext getDELogicScriptNodeRuntimeContext() {
		return this.iDELogicScriptNodeRuntimeContext;
	}
	
	

	@Override
	protected void onInit() throws Exception {

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName(this.getScriptEngine());
		if(ISystemUtilRuntime.SCRIPTENGINE_GROOVY.equals(this.getScriptEngine())) {
			log.debug(String.format("脚本使用Groovy引擎"));
			String strJSCode = "def main(";
			strJSCode += "sys,logic,entity,data,param";
			strJSCode += "){";
			if(getMode().equals(IDELogicScriptNodeRuntime.MODE_EXPRESSION)) {
				strJSCode += strScript;
			}
			else {
				strJSCode += strScript;
			}
			strJSCode += "}";
			engine.eval(strJSCode);
		}
		else {
			String strJSCode = "function main(";
			strJSCode += "sys,logic,entity";
			strJSCode += "){";
			if(getMode().equals(IDELogicScriptNodeRuntime.MODE_EXPRESSION)) {
				strJSCode += "return " + strScript + ";";
			}
			else {
				strJSCode += strScript;
			}
			strJSCode += "}";
			engine.eval(strJSCode);
		}
		
		invocable = (Invocable) engine;

		
		super.onInit();
	}

	@Override
	public Object execute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSModelObject iPSModelObject) throws Throwable {
		try {
			if(ISystemUtilRuntime.SCRIPTENGINE_GROOVY.equals(this.getScriptEngine())) {
				if(getMode().equals(IDELogicScriptNodeRuntime.MODE_EXPRESSION)) {
					Object scriptObject = null;
					Object realObject = null;
					if(iPSModelObject instanceof IPSDELogicNodeParam) {
						IPSDELogicParam iPSDELogicParam = ((IPSDELogicNodeParam)iPSModelObject).getDstPSDELogicParam();
						if(iPSDELogicParam != null) {
							scriptObject =	iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicParam.getCodeName(), false);
							realObject = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicParam.getCodeName(), false).getReal(iDELogicSession);
						}
					}
					Object objRet = invocable.invokeFunction("main", this.getSystemRTScriptContext().getSystemRuntime(), iDELogicSession.getDELogicRuntime(), realObject, realObject, scriptObject);
					//objRet = ScriptUtils.getReal(objRet);
					return objRet;
				}
				else {
					Object scriptObject = null;
					Object realObject = null;
					IPSDERawCodeLogic iPSDERawCodeLogic = null;
					if(iPSModelObject instanceof IPSDERawCodeLogic) {
						iPSDERawCodeLogic = (IPSDERawCodeLogic)iPSModelObject;
						IPSDELogicParam iPSDELogicParam = iPSDERawCodeLogic.getDstPSDELogicParam();
						if(iPSDELogicParam != null) {
							scriptObject =	iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicParam.getCodeName(), false);
							realObject = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicParam.getCodeName(), false).getReal(iDELogicSession);
						}
					}
					Object objRet = invocable.invokeFunction("main", this.getSystemRTScriptContext().getSystemRuntime(), iDELogicSession.getDELogicRuntime(), realObject, realObject, scriptObject);
					//objRet = ScriptUtils.getReal(objRet);
					iDELogicSession.setLastReturn(objRet);
					if(iPSDERawCodeLogic != null && iPSDERawCodeLogic.getRetPSDELogicParam() != null) {
						IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDERawCodeLogic.getRetPSDELogicParam().getCodeName(), false);
						retDELogicParamRuntime.bind(iDELogicSession, objRet);
					}
					return objRet;
				}
			}
			else {
				if(getMode().equals(IDELogicScriptNodeRuntime.MODE_EXPRESSION)) {
					Object scriptObject = null;
					if(iPSModelObject instanceof IPSDELogicNodeParam) {
						IPSDELogicParam iPSDELogicParam = ((IPSDELogicNodeParam)iPSModelObject).getDstPSDELogicParam();
						if(iPSDELogicParam != null) {
							IDELogicParamRuntime iDELogicParamRuntime =	iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicParam.getCodeName(), false);
							scriptObject = iDELogicParamRuntime.getScriptObject(iDELogicSession);
						}
					}
					Object objRet = invocable.invokeFunction("main", this.getSystemRTScriptContext(), this.getDELogicScriptNodeRuntimeContext(), scriptObject);
					objRet = ScriptUtils.getReal(objRet);
					return objRet;
				}
				else {
					Object scriptObject = null;
					IPSDERawCodeLogic iPSDERawCodeLogic = null;
					if(iPSModelObject instanceof IPSDERawCodeLogic) {
						iPSDERawCodeLogic = (IPSDERawCodeLogic)iPSModelObject;
						IPSDELogicParam iPSDELogicParam = iPSDERawCodeLogic.getDstPSDELogicParam();
						if(iPSDELogicParam != null) {
							IDELogicParamRuntime iDELogicParamRuntime =	iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicParam.getCodeName(), false);
							scriptObject = iDELogicParamRuntime.getScriptObject(iDELogicSession);
						}
					}
					Object objRet = invocable.invokeFunction("main", this.getSystemRTScriptContext(), this.getDELogicScriptNodeRuntimeContext(), scriptObject);
					objRet = ScriptUtils.getReal(objRet);
					iDELogicSession.setLastReturn(objRet);
					if(iPSDERawCodeLogic != null && iPSDERawCodeLogic.getRetPSDELogicParam() != null) {
						IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDERawCodeLogic.getRetPSDELogicParam().getCodeName(), false);
						retDELogicParamRuntime.bind(iDELogicSession, objRet);
					}
					return objRet;
				}
			}
			
			
		} catch (NoSuchMethodException | ScriptException ex) {
			log.error(ex);
			IDataEntityRuntime iDataEntityRuntime = iDELogicRuntimeContext.getDataEntityRuntime();
			iDataEntityRuntime.getSystemRuntime().log(LogLevels.ERROR, LogCats.SCRIPT, String.format("执行实体逻辑脚本节点[%1$s][%2$s][%3$s]发生异常，%4$s", iDataEntityRuntime.getName(),
					iDELogicRuntimeContext.getDELogicRuntime().getName(), iPSModelObject.getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("执行实体逻辑脚本节点[%1$s][%2$s]发生异常，%3$s", iDELogicRuntimeContext.getDELogicRuntime().getName(), iPSModelObject.getName(), ex.getMessage()), ex);
		}
	}


	@Override
	public String getId() {
		return String.format("%1$s", strScript.hashCode());
	}

	@Override
	public String getName() {
		return null;
	}



	

}