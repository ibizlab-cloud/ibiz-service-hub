package net.ibizsys.runtime.res;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.springframework.util.StringUtils;

import net.ibizsys.model.res.IPSSysLogic;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.ISystemUtilRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

/**
 * 系统脚本逻辑运行时对象
 * 
 * @author lionlau
 *
 */
public class SysScriptLogicRuntime extends SysLogicRuntimeBase implements ISysScriptLogicRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysScriptLogicRuntime.class);

	private Invocable invocable = null;
	private String strScriptEngine = null;

	@Override
	public void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysLogic iPSSysLogic) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeBaseContext);
		this.strScriptEngine = this.getSystemRuntime().getScriptEngine(iPSSysLogic.getScriptCode());
		super.init(iSystemRuntimeBaseContext, iPSSysLogic);
	}

	@Override
	protected void onInit() throws Exception {

		if (!StringUtils.hasLength(this.getPSSysLogic().getScriptCode())) {
			throw new Exception(String.format("没有指定脚本代码"));
		}

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName(getScriptEngine());
		engine.eval(this.getPSSysLogic().getScriptCode());
		invocable = (Invocable) engine;

		super.onInit();
	}
	
	@Override
	public String getScriptEngine() {
		return this.strScriptEngine;
	}
	

	@Override
	public Object execute(Object... args) {

		try {
			if(ISystemUtilRuntime.SCRIPTENGINE_GROOVY.equals(this.getScriptEngine())) {
				if (args != null && args.length > 0) {
					switch (args.length) {
					case 1:
						return invocable.invokeFunction("main", this.getSystemRuntime(), args[0]);
					case 2:
						return invocable.invokeFunction("main", this.getSystemRuntime(), args[0], args[1]);
					case 3:
						return invocable.invokeFunction("main", this.getSystemRuntime(), args[0], args[1], args[2]);
					case 4:
						return invocable.invokeFunction("main", this.getSystemRuntime(), args[0], args[1], args[2], args[3]);
					case 5:
						return invocable.invokeFunction("main", this.getSystemRuntime(), args[0], args[1], args[2], args[3], args[4]);
					case 6:
						return invocable.invokeFunction("main", this.getSystemRuntime(), args[0], args[1], args[2], args[3], args[4], args[5]);
					case 7:
						return invocable.invokeFunction("main", this.getSystemRuntime(), args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
					default:
						return invocable.invokeFunction("main", this.getSystemRuntime(), args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7]);
					}
				} else {
					return invocable.invokeFunction("main", this.getSystemRuntime());
				}
			}
			else {
				if (args != null && args.length > 0) {
					switch (args.length) {
					case 1:
						return invocable.invokeFunction("main", this.getSystemRuntime().getSystemRTScriptContext(), args[0]);
					case 2:
						return invocable.invokeFunction("main", this.getSystemRuntime().getSystemRTScriptContext(), args[0], args[1]);
					case 3:
						return invocable.invokeFunction("main", this.getSystemRuntime().getSystemRTScriptContext(), args[0], args[1], args[2]);
					case 4:
						return invocable.invokeFunction("main", this.getSystemRuntime().getSystemRTScriptContext(), args[0], args[1], args[2], args[3]);
					case 5:
						return invocable.invokeFunction("main", this.getSystemRuntime().getSystemRTScriptContext(), args[0], args[1], args[2], args[3], args[4]);
					case 6:
						return invocable.invokeFunction("main", this.getSystemRuntime().getSystemRTScriptContext(), args[0], args[1], args[2], args[3], args[4], args[5]);
					case 7:
						return invocable.invokeFunction("main", this.getSystemRuntime().getSystemRTScriptContext(), args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
					default:
						return invocable.invokeFunction("main", this.getSystemRuntime().getSystemRTScriptContext(), args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7]);
					}
				} else {
					return invocable.invokeFunction("main", this.getSystemRuntime().getSystemRTScriptContext());
				}
			}
			

		} catch (NoSuchMethodException | ScriptException ex) {
			log.error(ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.SCRIPT, String.format("执行系统逻辑脚本[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), String.format("执行系统逻辑脚本[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()));
		}
	}

}
