package net.ibizsys.runtime.util;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;

import net.ibizsys.runtime.ISystemRuntime;

public class EntityUtils {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(EntityUtils.class);
	
	private static class CacheMethodMap {
		private static Map<String, Map<String, Method>> CacheMap = new HashMap<>();

		private static Map<String, Method> get(Class clazz) {
			Map<String, Method> result = CacheMap.get(clazz.getName());
			if (result == null) {
				synchronized (CacheMethodMap.class) {
					if (result == null) {
						Map<String, Method> methodMap = new HashMap<>();
						for (Method method : clazz.getMethods()) {
							String strName = method.getName();
							if(strName.indexOf("set") != 0) {
								continue;
							}
							if(method.getGenericParameterTypes()==null 
									|| method.getGenericParameterTypes().length != 1) {
								continue;
							}
							methodMap.put(strName.substring(3).toLowerCase(), method);
						}
						CacheMap.put(clazz.getName(), methodMap);
						result = CacheMap.get(clazz.getName());
					}
				}
			}
			return result;
		}

	}

	public static Object getValue(Object objValue) {
		return getValue(objValue, true, null);
	}

	public static Object getValue(Object objValue, boolean bLowerCaseFieldName, ISystemRuntime iSystemRuntime) {
		if (objValue instanceof Map) {
			// 构建对象
			if (iSystemRuntime != null) {
				return iSystemRuntime.createEntity(objValue, bLowerCaseFieldName);
			}
			return createEntity(objValue);
		}

		if (objValue instanceof List) {
			// 构建对象
			List list = (List) objValue;
			List entityList = new ArrayList();
			for (Object objItem : list) {
				Object real = getValue(objItem, bLowerCaseFieldName, iSystemRuntime);
				entityList.add(real);
			}
			return entityList;
		}

		return objValue;
	}

	public static IEntity createEntity(Object objData) {
		return createEntity(objData, true);
	}

	public static IEntity createEntity(Object objData, boolean bLowerCaseFieldName) {
		return new Entity(objData, bLowerCaseFieldName);
	}

	public static IEntity asEntity(Object objData) {
		Assert.notNull(objData, "传入对象无效");
		if(objData instanceof IEntity) {
			return (IEntity)objData;
		}
		return JsonUtils.asEntity(objData);
	}
	
	public static void copyTo(IEntity srcEntity, Object dstObject) {
		Map<String, Method> methodMap = CacheMethodMap.get(dstObject.getClass());
		for (java.util.Map.Entry<String, Method> entry : methodMap.entrySet()) {
			String strName = entry.getKey();
			if (!srcEntity.contains(strName)) {
				continue;
			}

			Object objValue = srcEntity.get(strName);
			try {
				if (objValue != null 
						&& (!entry.getValue().getParameterTypes()[0].equals(objValue.getClass()))
						&& (!entry.getValue().getParameterTypes()[0].isAssignableFrom(objValue.getClass()))) {
					objValue = parse(entry.getValue().getParameterTypes()[0], objValue);
				}
				entry.getValue().invoke(dstObject, objValue);
			} catch (Exception ex) {
				log.error(String.format("设置目标对象[%1$s]属性[%2$s]发生异常，%3$s", dstObject.getClass().getName(), strName, ex.getMessage()), ex);
				continue;
			}
		}
	}
	
	public static void copyTo(Map<String, Object> srcMap, Object dstObject) {
		Map<String, Method> methodMap = CacheMethodMap.get(dstObject.getClass());
		for (java.util.Map.Entry<String, Method> entry : methodMap.entrySet()) {
			//标识转化为小写
			String strName = entry.getKey().toLowerCase();
			if (!srcMap.containsKey(strName)) {
				continue;
			}

			Object objValue = srcMap.get(strName);
			try {
				if (objValue != null 
						&& (!entry.getValue().getParameterTypes()[0].equals(objValue.getClass()))
						&& (!entry.getValue().getParameterTypes()[0].isAssignableFrom(objValue.getClass()))) {
					objValue = parse(entry.getValue().getParameterTypes()[0], objValue);
				}
				entry.getValue().invoke(dstObject, objValue);
			} catch (Exception ex) {
				log.error(String.format("设置目标对象[%1$s]属性[%2$s]发生异常，%3$s", dstObject.getClass().getName(), strName, ex.getMessage()), ex);
				continue;
			}
		}
	}
	
	
	private static Object parse(Class<?> type, Object objValue) throws Exception {
		if(objValue == null || type == java.lang.Object.class) {
			return objValue;
		}
		
		if (type.equals(String.class)) {
			return objValue.toString();
		}
		
		if (type.equals(BigInteger.class)) {
			return DataTypeUtils.getBigIntegerValue(objValue, null);
		}
		
		if (type.equals(BigDecimal.class)) {
			return DataTypeUtils.getBigDecimalValue(objValue, null);
		}
		
		if (type.equals(int.class) || type.equals(Integer.class)) {
			return DataTypeUtils.getIntegerValue(objValue, null);
		}
		if (type.equals(long.class) || type.equals(Long.class)) {
			return DataTypeUtils.getLongValue(objValue, null);
		}
		
		if (type.equals(double.class) || type.equals(Double.class)) {
			return DataTypeUtils.getDoubleValue(objValue, null);
		}
		
		if (type.isAssignableFrom(java.sql.Timestamp.class)) {
			return DataTypeUtils.getDateTimeValue(objValue, null);
		}
		
		if (type.equals(boolean.class) || type.isAssignableFrom(Boolean.class)) {
			String strValue = objValue.toString();
			return strValue.equalsIgnoreCase("1") || strValue.equalsIgnoreCase("true");
		}
		

		return objValue;

	}
}
