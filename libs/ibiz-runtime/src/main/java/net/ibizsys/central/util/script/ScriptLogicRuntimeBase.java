package net.ibizsys.central.util.script;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.springframework.util.StringUtils;

import net.ibizsys.central.IDynaInstRuntime;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.ISystemUtilRuntime;
import net.ibizsys.runtime.ModelRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

/**
 * 脚本逻辑运行时基类
 * 
 * @author lionlau
 *
 */
public abstract class ScriptLogicRuntimeBase extends ModelRuntimeBase implements IScriptLogicRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ScriptLogicRuntimeBase.class);

	private ISystemRuntimeBase iSystemRuntimeBase = null;
	private String strScript = null;
	private String strLogicMode = null;
	private IModelRuntime iModelRuntime = null;
	private Invocable invocable = null;
	private String strScriptEngine = null;

	public ScriptLogicRuntimeBase() {

	}
	
	@Override
	public void init(ISystemRuntimeBase iSystemRuntimeBase, IModelRuntime iModelRuntime, String strScript, String strLogicMode) throws Exception {
		this.init(iSystemRuntimeBase, iModelRuntime, null, strScript, strLogicMode);
	}

	@Override
	public void init(ISystemRuntimeBase iSystemRuntimeBase, IModelRuntime iModelRuntime, String strScriptEngine, String strScript, String strLogicMode) throws Exception {
		this.iSystemRuntimeBase = iSystemRuntimeBase;
		this.iModelRuntime = iModelRuntime;
		this.strScriptEngine = strScriptEngine;
		if(!StringUtils.hasLength(this.strScriptEngine)) {
			this.strScriptEngine = getSystemRuntime().getScriptEngine(strScript);
		}	
		this.strLogicMode = strLogicMode;
		this.strScript = strScript;
		onInit();
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return null;
	}
	
	protected IModelRuntime getModelRuntime() {
		return this.iModelRuntime;
	}

	protected ISystemRuntimeBase getSystemRuntimeBase() {
		return this.iSystemRuntimeBase;
	}
	
	protected ISystemRuntime getSystemRuntime() {
		if(this.getSystemRuntimeBase() instanceof ISystemRuntime) {
			return (ISystemRuntime)getSystemRuntimeBase();
		}
		else
			return (ISystemRuntime)((IDynaInstRuntime)getSystemRuntimeBase()).getSystemRuntime();
	}
	
	@Override
	protected void onInit() throws Exception {

		if (!StringUtils.hasLength(strScript)) {
			throw new Exception(String.format("没有指定脚本代码"));
		}

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName(this.getScriptEngine());
		String strJSCode = onPrepreScriptCode(strScript);
		engine.eval(strJSCode);
		invocable = (Invocable) engine;

		super.onInit();
	}
	
	protected abstract String onPrepreScriptCode(String strScript);
	
	
	@Override
	public Object execute(Object[] args) {

		try {
			if(ISystemUtilRuntime.SCRIPTENGINE_GROOVY.equals(this.getScriptEngine())) {
				if(args != null && args.length> 0) {
					switch(args.length) {
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
				}
				else {
					return invocable.invokeFunction("main", this.getSystemRuntime());
				}
			}
			else {
				if(args != null && args.length> 0) {
					switch(args.length) {
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
				}
				else {
					return invocable.invokeFunction("main", this.getSystemRuntime().getSystemRTScriptContext());
				}
			}
			
			
		} catch (NoSuchMethodException | ScriptException ex) {
			log.error(ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.SCRIPT, String.format("执行脚本[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this.getModelRuntime(), String.format("执行脚本[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()));
		}
	}

	

	@Override
	public String getId() {
		return String.format("%1$s", strScript.hashCode());
	}

	@Override
	public String getName() {
		return getLogicMode();
	}

	@Override
	public String getLogicMode() {
		return this.strLogicMode;
	}
	
	@Override
	public String getScriptEngine() {
		return this.strScriptEngine;
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