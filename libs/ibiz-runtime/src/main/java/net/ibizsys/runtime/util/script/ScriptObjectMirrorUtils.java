package net.ibizsys.runtime.util.script;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 脚本映射对象辅助对象
 * @author lionlau
 *
 */
public class ScriptObjectMirrorUtils {

	@SuppressWarnings("restriction")
	public static Object getJavaObject(jdk.nashorn.api.scripting.ScriptObjectMirror obj) {
		String strClassName = obj.getClassName();
		if("Date".equals(strClassName)) {
			Double objValue2  = (Double)obj.callMember("getTime");
			long nLong = objValue2.longValue();
			return new java.sql.Timestamp(nLong);
		}
		
		if("Array".equals(strClassName)) {
			List list = new ArrayList();
			Integer nLength  = (Integer)obj.get("length");
			for(int i =0;i<nLength;i++) {
				Object objValue   = obj.get(Integer.toString(i));
				list.add(ScriptUtils.getReal(objValue));
			}
			return list;
		}
		
		if("Object".equals(strClassName)) {
			Map<String, Object> map = new LinkedHashMap<>();
			for(Entry<String, Object> entry : obj.entrySet()) {
				Object objValue = entry.getValue();
				objValue = ScriptUtils.getReal(objValue);
				map.put(entry.getKey(), objValue);
			}
			return map;
		}
		
		if("Function".equals(strClassName)) {
			return null;
		}
		
		
		
		throw new RuntimeException(String.format("无法识别的JS对象类型[%1$s]，无法进行值转换",strClassName));
	}
}
