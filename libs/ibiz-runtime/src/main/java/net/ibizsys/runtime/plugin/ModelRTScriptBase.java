package net.ibizsys.runtime.plugin;

import java.util.HashMap;
import java.util.Map;

import groovy.lang.Closure;
import groovy.lang.GString;
import net.ibizsys.runtime.plugin.IModelRTScript;
import net.ibizsys.runtime.util.IAction;

/**
 * 模型运行时脚本插件基类
 * @author lionlau
 *
 */
public abstract class ModelRTScriptBase extends groovy.lang.Script implements IModelRTScript{

	private Object owner = null;
	private Map<String, Closure<?>> closureMap = new HashMap<>();
	
	
	public void setOwner(Object owner) {
		this.owner = owner;
	}
	
	public Object getOwner() {
		return this.owner;
	}
	
	
	public void before(Closure<?> closure) {
		this.before(METHOD_EXECUTE, closure);
	}
	
	public void after(Closure<?> closure) {
		this.after(METHOD_EXECUTE, closure);
	}
	
	public void execute(Closure<?> closure) {
		this.execute(METHOD_EXECUTE, closure);
	}
	
	public void before(String strMethodName, Closure<?> closure) {
		String strTag = String.format("%1$s|%2$s", strMethodName, ATTACHMODE_BEFORE).toUpperCase();
		closure.setDelegate(this.getOwner());
		closureMap.put(strTag, closure);
	}
	
	public void after(String strMethodName, Closure<?> closure) {
		String strTag = String.format("%1$s|%2$s", strMethodName, ATTACHMODE_AFTER).toUpperCase();
		closure.setDelegate(this.getOwner());
		closureMap.put(strTag, closure);
	}
	
	
	public void execute(String strMethodName, Closure<?> closure) {
		String strTag = String.format("%1$s|%2$s", strMethodName, ATTACHMODE_EXECUTE).toUpperCase();
		closure.setDelegate(this.getOwner());
		closureMap.put(strTag, closure);
	}
	
	@Override
	public Object call(Object... args) {
		return call(METHOD_EXECUTE, ATTACHMODE_EXECUTE, args);
	}

	@Override
	public Object call(String strMethodName, String strAttachMode, Object... args) {
		String strTag = String.format("%1$s|%2$s", strMethodName, strAttachMode).toUpperCase();
		Closure<?> closure = closureMap.get(strTag);
		if(closure == null) {
			throw new RuntimeException(String.format("无法获取[%1$s]对应的闭包函数", strTag));
		}
		if(args == null || args.length == 0) {
			return getReal(closure.call());
		}
		return getReal(closure.call(args));
	}

	@Override
	public boolean contains(String strMethodName, String strAttachMode) {
		String strTag = String.format("%1$s|%2$s", strMethodName, strAttachMode).toUpperCase();
		return closureMap.containsKey(strTag);
	}
	
	@Override
	public boolean support(String strMethodName) {
		String strTag = String.format("%1$s|%2$s", strMethodName, ATTACHMODE_BEFORE).toUpperCase();
		if(closureMap.containsKey(strTag)) {
			return true;
		}
		strTag = String.format("%1$s|%2$s", strMethodName, ATTACHMODE_EXECUTE).toUpperCase();
		if(closureMap.containsKey(strTag)) {
			return true;
		}
		
		strTag = String.format("%1$s|%2$s", strMethodName, ATTACHMODE_AFTER).toUpperCase();
		return closureMap.containsKey(strTag);
	}
	
	
	@Override
	public Object callAround(String strMethodName, IAction iAction, Object... args) throws Throwable {
		String strTag = String.format("%1$s|%2$s", strMethodName, ATTACHMODE_BEFORE).toUpperCase();
		Closure<?> closure = closureMap.get(strTag);
		if(closure != null) {
			if(args == null || args.length == 0) {
				closure.call();
			}
			else {
				closure.call(args);
			}
		}
		
		Object ret = null;
		strTag = String.format("%1$s|%2$s", strMethodName, ATTACHMODE_EXECUTE).toUpperCase();
		closure = closureMap.get(strTag);
		if(closure != null) {
			if(args == null || args.length == 0) {
				ret = closure.call();
			}
			else {
				ret = closure.call(args);
			}
		}
		else {
			ret = iAction.execute(args);
		}
		
		if(ret != null) {
			ret = getReal(ret);
		}
		
		
		strTag = String.format("%1$s|%2$s", strMethodName, ATTACHMODE_AFTER).toUpperCase();
		closure = closureMap.get(strTag);
		if(closure != null) {
			int nLength = 1;
			if(args != null ) {
				nLength += args.length;
			}
			Object[] newArgs = new Object[nLength];
			
			//第一个参数为返回值
			newArgs[0] = ret;
			if(nLength>1) {
				System.arraycopy(args, 0, newArgs, 1, args.length);
			}
			
			ret = closure.call(args);
		}
		
		if(ret != null) {
			ret = getReal(ret);
		}
		return ret;
	}
	
	protected Object getReal(Object value) {
		if(value instanceof GString) {
			return ((GString)value).toString();
		}
		return value;
	}
}
