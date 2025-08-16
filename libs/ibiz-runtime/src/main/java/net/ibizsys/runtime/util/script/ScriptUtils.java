package net.ibizsys.runtime.util.script;

public class ScriptUtils {

	/**
	 * 获取脚本传入对象的实际值
	 * @param objValue
	 * @return
	 * @throws Throwable
	 */
	public static Object getReal(Object objValue){
		if(objValue == null) {
			return objValue;
		}
		if(objValue instanceof IScriptUtil) {
			throw new RuntimeException(String.format("脚本功能对象不能作为值"));
		}
		
		if (objValue instanceof jdk.nashorn.api.scripting.ScriptObjectMirror) {
			return ScriptObjectMirrorUtils.getJavaObject((jdk.nashorn.api.scripting.ScriptObjectMirror) objValue);
		}
		
		if(objValue instanceof IScriptObject) {
			return ((IScriptObject)objValue).getReal();
		}
		
		return objValue;
	}
	
	
	
}
