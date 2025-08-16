package net.ibizsys.runtime.res;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.springframework.util.StringUtils;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.IReadOnlyEntity;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

/**
 * 脚本系统值规则运行时对象
 * @author lionlau
 *
 */
public class SysScriptValueRuleRuntime extends SysValueRuleRuntimeBase implements ISysScriptValueRuleRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysScriptValueRuleRuntime.class);
	
	/**
	 * 脚本值规则上下文对象
	 * @author Administrator
	 *
	 */
	private class ScriptValueRuleContext{
		
		private ThreadLocal<IReadOnlyEntity> et = new ThreadLocal<IReadOnlyEntity>();
		private ThreadLocal<String> strFieldName = new ThreadLocal<String>();
		private ThreadLocal<Object> value = new ThreadLocal<Object>();
		
		public void setEntity(IReadOnlyEntity et){
			this.et.set(et);
		}
		
		public IReadOnlyEntity getEntity(){
			return this.et.get();
		}
		
		public void setField(String strFieldName){
			this.strFieldName.set(strFieldName);
		}
		
		public String getField(){
			return this.strFieldName.get();
		}
		
		/**
		 * 保持兼容性
		 * @return
		 */
		public boolean isTempMode(){
			return false;
		}
		
		public Object getValue(){
			return value.get();
		}
		
		public void setValue(Object objValue){
			this.value.set(objValue);
		}
		
		public void reset(){
			this.et.set(null);
			this.strFieldName.set(null);
			this.value.set(null);
		}
	}
	
	
	private ScriptValueRuleContext scriptValueRuleContext = new ScriptValueRuleContext();
	
	private Invocable  invocable  = null;
	
	
	@Override
	protected void onInit() throws Exception {
		
		if (!StringUtils.hasLength(this.getPSSysValueRule().getScriptCode())) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), String.format("系统值规则[%1$s]没有指定脚本代码", this.getName()));
		}
		
		ScriptEngineManager manager = new ScriptEngineManager();  
	    ScriptEngine engine = manager.getEngineByName("JavaScript");  
	    String strJSCode = "function main(value,ctx,entity){";
	    strJSCode += this.getPSSysValueRule().getScriptCode();
	    strJSCode += "}";
	    engine.eval(strJSCode);
	    invocable = (Invocable)engine;
		
		super.onInit();
	}
	
	@Override
	public boolean test(final Object objValue, final IEntityBase iEntityBase, final IPSDEField iPSDEField, final IDataEntityRuntimeBase iDataEntityRuntimeBase) throws Throwable{
		
		try{
			scriptValueRuleContext.reset();
			if(iDataEntityRuntimeBase != null && iEntityBase!=null && iDataEntityRuntimeBase instanceof IDataEntityRuntime) {
				scriptValueRuleContext.setEntity(new IReadOnlyEntity() {
					
					@Override
					public Object get(String strName) {
						IPSDEField iPSDEField2 = iDataEntityRuntimeBase.getPSDEField(strName);
						if(iPSDEField2 != null) {
							return ((IDataEntityRuntime)iDataEntityRuntimeBase).getFieldValue(iEntityBase, iPSDEField2);
						}
						return null;
					}
					
					@Override
					public boolean contains(String strName) {
						IPSDEField iPSDEField2 = iDataEntityRuntimeBase.getPSDEField(strName);
						if(iPSDEField2 != null) {
							return ((IDataEntityRuntime)iDataEntityRuntimeBase).containsFieldValue(iEntityBase, iPSDEField2);
						}
						return false;
					}
				});
			}
			
			if(iPSDEField!=null) {
				scriptValueRuleContext.setField(iPSDEField.getName().toLowerCase());
			}
			scriptValueRuleContext.setValue(objValue);
		
			Object objRet = invocable.invokeFunction("main",objValue,scriptValueRuleContext,scriptValueRuleContext.getEntity());
			boolean bRet = false;
			if(objRet != null && objRet instanceof Boolean){
				bRet = (Boolean)objRet;
			}
			scriptValueRuleContext.reset();
			
			return bRet;
		} catch (NoSuchMethodException | ScriptException ex) {
			scriptValueRuleContext.reset();
			
			log.error(ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.SCRIPT, String.format("系统值规则[%1$s]执行发生异常，%2%s", this.getName(), ex.getMessage()), ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), String.format("系统值规则[%1$s]执行发生异常，%2%s",this.getName(),ex.getMessage()));
		}
	}
}
