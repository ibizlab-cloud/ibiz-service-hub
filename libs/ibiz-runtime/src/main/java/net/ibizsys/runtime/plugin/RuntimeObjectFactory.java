package net.ibizsys.runtime.plugin;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.runtime.res.SysSFPluginRuntime;

public class RuntimeObjectFactory implements IRuntimeObjectFactory {

	private static IRuntimeObjectFactory instance = null;
	
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(RuntimeObjectFactory.class);

	static class RuntimeObject{
		public Object object = null;
		public int order = 100;
		
		public RuntimeObject() {
			
		}
	}
	
	/**
	 * 注册数据为静态变量
	 */
	private final static Map<String, RuntimeObject> RUNTIMEOBJMAP = new ConcurrentHashMap<>();
	
	private final static Map<String, Map> RUNTIMEOBJLISTMAP = new ConcurrentHashMap<>();
	
	
	
	
	public static IRuntimeObjectFactory getInstance() {
		if(RuntimeObjectFactory.instance == null) {
			RuntimeObjectFactory.instance = new RuntimeObjectFactory();
		}
		return RuntimeObjectFactory.instance;
	}
	
	public static void setInstance(IRuntimeObjectFactory instance) {
		RuntimeObjectFactory.instance = instance;
	}
	
	protected static boolean registerRuntimeObject(Class<?> cls, String strType, Object objObject) {
		return registerRuntimeObject(cls, strType, objObject, ORDER_DEFAULT);
	}
	
	protected static boolean registerRuntimeObject(Class<?> cls, String strType, Object objObject, int nOrder) {
		String strTag = null;
		if (StringUtils.hasLength(strType)) {
			strTag = String.format("%1$s|%2$s", getObjectType(cls), strType);
		} else {
			strTag = String.format("%1$s|", getObjectType(cls));
		}
		
		if(objObject instanceof String) {
			try {
				objObject = Class.forName((String)objObject);
			} catch (Exception ex) {
				//log.debug(String.format("忽略注册运行时对象[%1$s][%2$s]，对象不存在", objObject, strTag));
				return false;
			}
		}
		
		RuntimeObject lastObject = RUNTIMEOBJMAP.get(strTag);
		if(lastObject != null) {
			if(nOrder > lastObject.order){
				log.warn(String.format("无法注册运行时对象[%1$s][%2$s]，优先级不足", objObject, strTag));
				return false;
			}
			else {
				log.warn(String.format("注册运行时对象[%1$s][%2$s]，替换[%3$s]", objObject, strTag, lastObject.object));
			}
		}
		else {
			log.debug(String.format("注册运行时对象[%1$s][%2$s]", objObject, strTag));
		}
		
		RuntimeObject runtimeObject = new RuntimeObject();
		
		runtimeObject.object = objObject;
		runtimeObject.order = nOrder;
		
		RUNTIMEOBJMAP.put(strTag, runtimeObject);
		
		return true;
		
//		if (StringUtils.hasLength(strType)) {
//			RUNTIMEOBJMAP.put(String.format("%1$s|%2$s", cls.getCanonicalName(), strType), objObject);
//		} else {
//			RUNTIMEOBJMAP.put(String.format("%1$s|", cls.getCanonicalName()), objObject);
//		}
	}
	
	
	@Override
	public boolean registerObject(Class<?> cls, String strType, Object strObject) {
		return registerObject(cls, strType, strObject, ORDER_DEFAULT);
	}
	
	@Override
	public boolean registerObjectPrimary(Class<?> cls, String strType, Object strObject) {
		return registerObject(cls, strType, strObject, ORDER_PRIMARY);
	}
	
	@Override
	public boolean registerObject(Class<?> cls, String strType, Object strObject, int nOrderValue) {
		return registerRuntimeObject(cls, strType, strObject, nOrderValue);
	}
	
	@Override
	public boolean registerObjectIf(Class<?> cls, String strType, Object strObject) {
		if(this.containsObject(cls, strType)) {
			return false;
		}
		return this.registerObject(cls, strType, strObject);
	}
	
	@Override
	public boolean containsObject(Class<?> cls, String strType) {
		Object runtimeObject = null;
		if (StringUtils.hasLength(strType)) {
			runtimeObject = RUNTIMEOBJMAP.get(String.format("%1$s|%2$s", getObjectType(cls) , strType));
		} else {
			runtimeObject = RUNTIMEOBJMAP.get(String.format("%1$s|", getObjectType(cls)));
		}
		return !ObjectUtils.isEmpty(runtimeObject);
	}
	
	
	@Override
	public <T> T getObject(Class<T> cls){
		return this.getObject(cls, "");
	}
	
	@Override
	public <T> T getObject(Class<T> cls, String strType){
		RuntimeObject runtimeObject = null;
		if (StringUtils.hasLength(strType)) {
			runtimeObject = RUNTIMEOBJMAP.get(String.format("%1$s|%2$s", getObjectType(cls), strType));
		} else {
			runtimeObject = RUNTIMEOBJMAP.get(String.format("%1$s|", getObjectType(cls)));
		}

		if (ObjectUtils.isEmpty(runtimeObject)) {
			return null;
		}
		
		return getObject(cls, runtimeObject, false);
	}
	
	
	@Override
	public Class<?> getObjectClass(Class<?> cls) {
		return this.getObjectClass(cls, "");
	}

	@Override
	public Class<?> getObjectClass(Class<?> cls, String strType) {
		RuntimeObject runtimeObject = null;
		if (StringUtils.hasLength(strType)) {
			runtimeObject = RUNTIMEOBJMAP.get(String.format("%1$s|%2$s", getObjectType(cls), strType));
		} else {
			runtimeObject = RUNTIMEOBJMAP.get(String.format("%1$s|", getObjectType(cls)));
		}

		if (ObjectUtils.isEmpty(runtimeObject)) {
			return null;
		}
		
		Object obj = runtimeObject.object;
		if(obj == null) {
			return null;
		}
		
		if(obj instanceof Class) {
			return (Class)obj;
		}
		else
			if(obj instanceof String) {
				try {
					return Class.forName((String)obj);
				} catch (Exception ex) {
					log.warn(String.format("运行时对象[%1$s]不存在", obj));
					return null;
				}
			}
		else
			return obj.getClass();
	}

	

	@Override
	public <T> Map<String, T> getObjects(Class<T> cls){
		return getObjects(cls, null);
	}

	@Override
	public <T> Map<String, T> getObjects(Class<T> cls, String strTypePrefix){
		
		String strTag = null;
		if(StringUtils.hasLength(strTypePrefix)) {
			strTag = String.format("%1$s|%2$s", getObjectType(cls), strTypePrefix);
		} else {
			strTag = String.format("%1$s|", getObjectType(cls));
		}
		Object objMap = RUNTIMEOBJLISTMAP.get(strTag);
		if(objMap != null) {
			return (Map<String, T>)objMap;
		}
		Map<String, T> map = new HashMap<String, T>();
		for(java.util.Map.Entry<String, RuntimeObject> entry : RUNTIMEOBJMAP.entrySet()) {
			if(entry.getKey().indexOf(strTag)!=0) {
				continue;
			}
			
			T t = getObject(cls, entry.getValue(), true);
			if(t != null) {
				
				//map.put(entry.getKey().substring(getObjectType(cls).length() + 1), t);
				map.put(entry.getKey().substring(strTag.length() ), t);
			}
		}
		
		RUNTIMEOBJLISTMAP.put(strTag, map);
		return map;
	}
	
	protected <T> T getObject(Class<T> cls, RuntimeObject runtimeObject, boolean bTryMode){
		
		Object obj = runtimeObject.object;
		
		if(obj instanceof Class) {
			Object objInstance;
			try {
				objInstance = ((Class)obj).newInstance();
			} catch (Exception e) {
				if(bTryMode) {
					log.warn(String.format("无法建立插件对象[%1$s]", obj));
					return null;
				}
				throw new RuntimeException(e);
			}
			if (cls.isAssignableFrom(objInstance.getClass())) {
				return (T) objInstance;
			}
		}
		else
			if(obj instanceof String) {
				Object objInstance;
				try {
					objInstance = SysSFPluginRuntime.createObject((String)obj);
				} catch (Exception e) {
					if(bTryMode) {
						log.warn(String.format("无法建立插件对象[%1$s]", obj));
						return null;
					}
					throw new RuntimeException(e);
				}
				if (cls.isAssignableFrom(objInstance.getClass())) {
					return (T) objInstance;
				}
			}
		else
			if (cls.isAssignableFrom(obj.getClass())) {
				return (T) obj;
			}
			
		if(bTryMode) {
			return null;
		}
		throw new RuntimeException(String.format("[%1$s]类型不正确", obj));
	}
	
	protected static String getObjectType(Class<?> cls) {
		//return cls.getCanonicalName();
		return cls.getSimpleName();
	}
}
