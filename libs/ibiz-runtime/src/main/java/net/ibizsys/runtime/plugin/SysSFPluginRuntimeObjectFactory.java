package net.ibizsys.runtime.plugin;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.runtime.ISystemRuntime;
import net.ibizsys.runtime.ISystemRuntimeContext;
import net.ibizsys.runtime.res.ISysSFPluginRuntime;

public class SysSFPluginRuntimeObjectFactory implements ISysSFPluginRuntimeObjectFactory {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysSFPluginRuntimeObjectFactory.class);

	static class RuntimeObject{
		public Class<?> object = null;
		public int order = 100;
		public ISysSFPluginRuntime plugin = null;
		
		public RuntimeObject() {
			
		}
	}
	
	private final Map<String, RuntimeObject> runtimeObjMap = new ConcurrentHashMap<>();
	
	private final Map<String, Map> runtimeObjListMap = new ConcurrentHashMap<>();
	
	private ISystemRuntimeContext iSystemRuntimeContext = null;
	
	private IRuntimeObjectFactory inheritRuntimeObjectFactory = null;
	
	//private boolean bInheritRuntimeObjectFactoryMode = false;
	
	/**
	 * 初始化系统后台插件运行时
	 * @param iSystemRuntimeContext
	 * @throws Exception
	 */
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IRuntimeObjectFactory inheritRuntimeObjectFactory) throws Exception{
		Assert.notNull(iSystemRuntimeContext, "传入系统上下文对象无效");
		this.iSystemRuntimeContext = iSystemRuntimeContext;
		this.inheritRuntimeObjectFactory = inheritRuntimeObjectFactory;
		this.onInit();
	}
	
	protected void onInit() throws Exception {
		this.loadSysSFPluginRuntimes();
	}
	
	protected void loadSysSFPluginRuntimes() throws Exception {
		
		//this.bInheritRuntimeObjectFactoryMode = this.getInheritRuntimeObjectFactory()!=null;
		
		//枚举
		Collection<ISysSFPluginRuntime> sysSFPluginRuntimes = this.getSystemRuntime().getSysSFPluginRuntimes();
		if(ObjectUtils.isEmpty(sysSFPluginRuntimes)) {
			return;
		}
				
		for(ISysSFPluginRuntime iSysSFPluginRuntime : sysSFPluginRuntimes) {
			Class<?> type = iSysSFPluginRuntime.getGlobalRuntimeObjectClass();
			if(type == null) {
				continue;
			}
			this.registerObjectIf(type, iSysSFPluginRuntime.getGlobalRuntimeObjectType(), iSysSFPluginRuntime);
			//this.bInheritRuntimeObjectFactoryMode = false;
		}
	}
//	
//	protected boolean isInheritRuntimeObjectFactoryMode() {
//		return this.bInheritRuntimeObjectFactoryMode;
//	}
//	
	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return this.iSystemRuntimeContext;
	}
	
	public ISystemRuntime getSystemRuntime() {
		return this.getSystemRuntimeContext().getSystemRuntime();
	}
	
	protected IRuntimeObjectFactory getInheritRuntimeObjectFactory() {
		return this.inheritRuntimeObjectFactory;
	}
	
	protected boolean registerRuntimeObject(Class<?> cls, String strType, Object objObject) {
		return registerRuntimeObject(cls, strType, objObject, ORDER_DEFAULT);
	}
	
	protected boolean registerRuntimeObject(Class<?> cls, String strType, Object objObject, int nOrder) {
		ISysSFPluginRuntime iSysSFPluginRuntime = null;
		if(objObject instanceof ISysSFPluginRuntime) {
			iSysSFPluginRuntime = ((ISysSFPluginRuntime)objObject);
			objObject = iSysSFPluginRuntime.getRuntimeObjectClass();
		}
		else
			if(objObject instanceof String) {
				try {
					objObject = Class.forName((String)objObject);
				} catch (Exception ex) {
					//log.debug(String.format("忽略注册运行时对象[%1$s][%2$s]，对象不存在", objObject, strTag));
					return false;
				}
			}
		
		if(!(objObject instanceof Class)) {
			return false;
		}
		
		String strTag = null;
		if (StringUtils.hasLength(strType)) {
			strTag = String.format("%1$s|%2$s", getObjectType(cls), strType);
		} else {
			strTag = String.format("%1$s|", getObjectType(cls));
		}
		
		RuntimeObject lastObject = runtimeObjMap.get(strTag);
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
		
		runtimeObject.object = (Class)objObject;
		runtimeObject.order = nOrder;
		runtimeObject.plugin = iSysSFPluginRuntime;
		
		runtimeObjMap.put(strTag, runtimeObject);
		
		return true;
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
		if(this.internalContainsObject(cls, strType)) {
			return false;
		}
		return this.registerObject(cls, strType, strObject);
	}
	
	@Override
	public boolean containsObject(Class<?> cls, String strType) {
		if(this.internalContainsObject(cls, strType)) {
			return true;
		}
		if(this.getInheritRuntimeObjectFactory() != null) {
			return this.getInheritRuntimeObjectFactory().containsObject(cls, strType);
		}
		return false;
	}
	
	protected boolean internalContainsObject(Class<?> cls, String strType) {
		Object runtimeObject = null;
		if (StringUtils.hasLength(strType)) {
			runtimeObject = runtimeObjMap.get(String.format("%1$s|%2$s", getObjectType(cls) , strType));
		} else {
			runtimeObject = runtimeObjMap.get(String.format("%1$s|", getObjectType(cls)));
		}
		return !ObjectUtils.isEmpty(runtimeObject);
	}
	
	
	
	@Override
	public <T> T getObject(Class<T> cls){
		return this.getObject(cls, "");
	}
	
	@Override
	public <T> T getObject(Class<T> cls, String strType){
		T t = this.internalGetObject(cls, strType);
		if(t != null) {
			return t;
		}
		if(this.getInheritRuntimeObjectFactory() != null) {
			return this.getInheritRuntimeObjectFactory().getObject(cls, strType);
		}
		return t;
	}
	
	protected <T> T internalGetObject(Class<T> cls, String strType){
		RuntimeObject runtimeObject = null;
		if (StringUtils.hasLength(strType)) {
			runtimeObject = runtimeObjMap.get(String.format("%1$s|%2$s", getObjectType(cls), strType));
		} else {
			runtimeObject = runtimeObjMap.get(String.format("%1$s|", getObjectType(cls)));
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
		Class<?> ret = this.internalGetObjectClass(cls, strType);
		if(ret == null
				&& this.getInheritRuntimeObjectFactory() != null) {
			return this.getInheritRuntimeObjectFactory().getObjectClass(cls, strType);
		}
		return ret;
	}

	protected Class<?> internalGetObjectClass(Class<?> cls, String strType) {
		RuntimeObject runtimeObject = null;
		if (StringUtils.hasLength(strType)) {
			runtimeObject = runtimeObjMap.get(String.format("%1$s|%2$s", getObjectType(cls), strType));
		} else {
			runtimeObject = runtimeObjMap.get(String.format("%1$s|", getObjectType(cls)));
		}

		if (ObjectUtils.isEmpty(runtimeObject)) {
			return null;
		}
		
		return (Class<?>)runtimeObject.object;
	}
	

	@Override
	public <T> Map<String, T> getObjects(Class<T> cls){
		return getObjects(cls, null);
	}

	@Override
	public <T> Map<String, T> getObjects(Class<T> cls, String strTypePrefix){
		Map<String, T> map = this.internalGetObjects(cls, strTypePrefix);
		Map<String, T> map2 = null;
		if(this.getInheritRuntimeObjectFactory() != null) {
			Map<String, T> map3 = null;
			if(StringUtils.hasLength(strTypePrefix)) {
				map3 = this.getInheritRuntimeObjectFactory().getObjects(cls, "*:");
			}
			map2 = this.getInheritRuntimeObjectFactory().getObjects(cls, strTypePrefix);
			if(!ObjectUtils.isEmpty(map3)) {
				if(ObjectUtils.isEmpty(map2)) {
					map2 = map3;
				}
				else {
					map3.putAll(map2);
					map2 = map3;
				}
			}
		}
		
		if(ObjectUtils.isEmpty(map)) {
			if(ObjectUtils.isEmpty(map2)) {
				return map;
			}
			return map2;
		}
		else {
			if(ObjectUtils.isEmpty(map2)) {
				return map;
			}
			
			Map<String, T> total = new HashMap<String, T>();
			total.putAll(map2);
			total.putAll(map);
			return total;
		}
	}
	
	protected <T> Map<String, T> internalGetObjects(Class<T> cls, String strTypePrefix){
		String strTag = null;
		if(StringUtils.hasLength(strTypePrefix)) {
			strTag = String.format("%1$s|%2$s", getObjectType(cls), strTypePrefix);
		} else {
			strTag = String.format("%1$s|", getObjectType(cls));
		}
		Object objMap = runtimeObjListMap.get(strTag);
		if(objMap != null) {
			return (Map<String, T>)objMap;
		}
		Map<String, T> map = new HashMap<String, T>();
		for(java.util.Map.Entry<String, RuntimeObject> entry : runtimeObjMap.entrySet()) {
			if(entry.getKey().toUpperCase().indexOf(strTag.toUpperCase())!=0) {
				continue;
			}
			
			T t = getObject(cls, entry.getValue(), true);
			if(t != null) {
				//map.put(entry.getKey().substring(getObjectType(cls).length() + 1), t);
				map.put(entry.getKey().substring(strTag.length()), t);
			}
		}
		
		runtimeObjListMap.put(strTag, map);
		return map;
	}
	
	protected <T> T getObject(Class<T> cls, RuntimeObject runtimeObject, boolean bTryMode){
		if (cls.isAssignableFrom(runtimeObject.object)) {
			try {
				if(runtimeObject.plugin!=null)
					return (T)runtimeObject.plugin.getRuntimeObject(true);
				return  (T) runtimeObject.object.newInstance();
			} catch (Exception e) {
				if(bTryMode) {
					log.warn(String.format("无法建立插件对象[%1$s]", runtimeObject.object));
					return null;
				}
				throw new RuntimeException(e);
			}
		}
		
		if(bTryMode) {
			return null;
		}
		
		throw new RuntimeException(String.format("[%1$s]类型不正确",runtimeObject.object));
	}
	
	protected String getObjectType(Class<?> cls) {
		return cls.getSimpleName();
	}
}
