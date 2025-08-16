package net.ibizsys.runtime.dataentity.action;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.springframework.util.StringUtils;


import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.ISystemUtilRuntime;
import net.ibizsys.runtime.ModelRuntimeBase;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.script.IScriptEntity;
import net.ibizsys.runtime.util.script.ISystemRTScriptContext;
import net.ibizsys.runtime.util.script.ScriptUtils;

/**
 * 实体脚本逻辑运行时
 * 
 * @author lionlau
 *
 */
public class DEScriptLogicRuntime extends ModelRuntimeBase implements IDEScriptLogicRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEScriptLogicRuntime.class);

	private String strScript = null;
	private String strLogicMode = null;
	private IDataEntityRuntime iDataEntityRuntime = null;
	private ISystemRTScriptContext iSystemRTScriptContext = null;
	private Invocable invocable = null;
	private String strScriptEngine = null;

	public DEScriptLogicRuntime() {

	}

	@Override
	public void init(ISystemRTScriptContext iSystemRTScriptContext, IDataEntityRuntime iDataEntityRuntime, String strLogicMode, String strScript) throws Exception {
		this.iSystemRTScriptContext = iSystemRTScriptContext;
		this.iDataEntityRuntime = iDataEntityRuntime;
		this.strLogicMode = strLogicMode;
		this.strScript = strScript;
		this.strScriptEngine = iSystemRTScriptContext.getSystemRuntime().getScriptEngine(strScript);
		
		onInit();
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return null;
	}
	
	@Override
	public String getScriptEngine() {
		return this.strScriptEngine;
	}

	@Override
	protected void onInit() throws Exception {

		if (!StringUtils.hasLength(strScript)) {
			throw new DataEntityRuntimeException(this.iDataEntityRuntime, String.format("没有指定脚本代码"));
		}

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName(this.getScriptEngine());
		if(ISystemUtilRuntime.SCRIPTENGINE_GROOVY.equals(this.getScriptEngine())) {
			String strJSCode = "def main(";
			if (LOGICMODE_DEFCHECK.equals(this.getLogicMode()) || LOGICMODE_DEFDEFAULT.equals(this.getLogicMode())) {
				strJSCode += "sys,entity,actionmode,field,action";
			} else {
				strJSCode += "sys,entity";
			}
			strJSCode += "){";
			if(LOGICMODE_DEFEXPRESSION.equals(this.getLogicMode())) {
				//strJSCode += "return " + strScript + ";";
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
			if (LOGICMODE_DEFCHECK.equals(this.getLogicMode()) || LOGICMODE_DEFDEFAULT.equals(this.getLogicMode())) {
				strJSCode += "sys,entity,actionmode,field,action";
			} else {
				strJSCode += "sys,entity";
			}
			strJSCode += "){";
			if(LOGICMODE_DEFEXPRESSION.equals(this.getLogicMode())) {
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
	public Object execute(Object[] args) {

		IEntityBase iEntityBase = null;
		if (args.length > 0 && args[0] instanceof IEntityBase) {
			iEntityBase = (IEntityBase) args[0];
		} else if (args.length > 1 && args[1] instanceof IEntityBase) {
			iEntityBase = (IEntityBase) args[1];
		}
		if (iEntityBase == null) {
			throw new DataEntityRuntimeException(this.iDataEntityRuntime, String.format("传入参数无效"), Errors.INPUTERROR);
		}
		
		try {
			
			if(ISystemUtilRuntime.SCRIPTENGINE_GROOVY.equals(this.getScriptEngine())) {
				Object objRet;
				if (LOGICMODE_DEFCHECK.equals(this.getLogicMode()) || LOGICMODE_DEFDEFAULT.equals(this.getLogicMode())) {
					String strActionMode = this.getArg(args, 1, String.class);
					IPSDEField iDEField = this.getArg(args, 2, IPSDEField.class);
					IPSDEAction iPSDEAction = this.getArg(args, 3, IPSDEAction.class);
					objRet = invocable.invokeFunction("main", this.iSystemRTScriptContext.getSystemRuntime(), iEntityBase, strActionMode, iDEField, iPSDEAction);
				} else {
					objRet = invocable.invokeFunction("main", this.iSystemRTScriptContext.getSystemRuntime(), iEntityBase);
				}
				return objRet;
			}
			else {
				IScriptEntity iScriptEntity = this.iDataEntityRuntime.createScriptEntity(iEntityBase);
				Object objRet;
				
				if (LOGICMODE_DEFCHECK.equals(this.getLogicMode()) || LOGICMODE_DEFDEFAULT.equals(this.getLogicMode())) {
					String strActionMode = this.getArg(args, 1, String.class);
					IPSDEField iDEField = this.getArg(args, 2, IPSDEField.class);
					IPSDEAction iPSDEAction = this.getArg(args, 3, IPSDEAction.class);
					objRet = invocable.invokeFunction("main", this.iSystemRTScriptContext, iScriptEntity, strActionMode, iDEField, iPSDEAction);
				} else {
					objRet = invocable.invokeFunction("main", this.iSystemRTScriptContext, iScriptEntity);
				}
				return ScriptUtils.getReal(objRet);
			}
			
		} catch (NoSuchMethodException | ScriptException ex) {
			log.error(ex);
			iDataEntityRuntime.getSystemRuntime().log(LogLevels.ERROR, LogCats.SCRIPT, String.format("执行实体脚本[%1$s][%2$s]发生异常，%3$s", iDataEntityRuntime.getName(), this.getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.iDataEntityRuntime, String.format("执行实体脚本[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()));
		}
	}

	@Override
	public String getId() {
		return String.format("%1$s", strScript.hashCode());
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLogicMode() {
		return this.strLogicMode;
	}

	/**
	 * 获取指定类型参数
	 * 
	 * @param args
	 * @param nPos
	 * @param cls
	 * @return
	 */
	protected <T> T getArg(Object[] args, int nPos, Class<T> cls) {
		if (args.length > nPos && args[nPos] != null) {
			if (cls.isAssignableFrom(args[nPos].getClass())) {
				return (T) args[nPos];
			}
		}
		return null;
	}
}