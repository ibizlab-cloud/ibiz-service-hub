package net.ibizsys.runtime.res;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.PSModelEnums.PluginRTMode;
import net.ibizsys.model.res.IPSSysSFPlugin;
import net.ibizsys.runtime.ISystemRuntimeContext;
import net.ibizsys.runtime.ModelException;
import net.ibizsys.runtime.SystemModelRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.plugin.IPluginRuntimeInitable;
import net.ibizsys.runtime.util.KeyValueUtils;

/**
 * 系统后台插件运行时对象
 * 
 * @author lionlau
 *
 */
public class SysSFPluginRuntime extends SystemModelRuntimeBase implements ISysSFPluginRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysSFPluginRuntime.class);

	//private final static Map<String, GroovyClassLoader> groovyClassLoaderMap = new HashMap<String, GroovyClassLoader>();
	private final static Map<String, Map<String, Class<?>>> groovyRTClassMapMap = new HashMap<String, Map<String, Class<?>>>();
	private final static Map<String, Map<String, String>> groovyRTCodeMapMap = new HashMap<String, Map<String, String>>();
	private final static Map<String, Map<String, String>> groovyHotCodeMapMap = new HashMap<String, Map<String, String>>();
	
	
//	private final static GroovyClassLoader groovyClassLoader = new GroovyClassLoader( SysSFPluginRuntime.class.getClassLoader());
//    private final static Map<String, Class<?>> groovyRTClassMap = new ConcurrentHashMap<String, Class<?>>();
//    private final static Map<String, String> groovyRTCodeMap = new ConcurrentHashMap<String, String>();
//    private final static Map<String, String> groovyHotCodeMap = new ConcurrentHashMap<String, String>();
    
//	private GroovyClassLoader groovyClassLoader = null;
	private Map<String, Class<?>> groovyRTClassMap = null;
	private Map<String, String> groovyRTCodeMap = null;
	private Map<String, String> groovyHotCodeMap = null;
	
	private static Random random = new Random();
    
	private ISystemRuntimeContext iSystemRuntimeContext = null;
	private IPSSysSFPlugin iPSSysSFPlugin = null;
	private Object runtimeObject = null;
	private String strRTObjectName = null;
	private boolean bRuntimePlugin = false;
	private Class<?> rtObjectClass = null;
	private boolean bGroovyRTObject = false;
	private String strRTObjectCode = null;
	private Class<?> globalRtObjectClass = null;

	public static void registerHotCode(String strSystemId, String strPSSysSFPluginId, String strCode) {
		//String strKey = String.format("%1$s|%2$s", strSystemId, strPSSysSFPluginId).toLowerCase();
		
		Map<String, String> groovyHotCodeMap = null;
		synchronized (groovyHotCodeMapMap) {
			groovyHotCodeMap = groovyHotCodeMapMap.get(strSystemId);
			if(groovyHotCodeMap == null) {
				groovyHotCodeMap =  new ConcurrentHashMap<String, String>();
				groovyHotCodeMapMap.put(strSystemId, groovyHotCodeMap);
			}
		}
		groovyHotCodeMap.put(strPSSysSFPluginId, strCode);
	}
	
	public static String getHotCode(String strSystemId, String strPSSysSFPluginId) {
		
		//String strKey = String.format("%1$s|%2$s", strSystemId, strPSSysSFPluginId).toLowerCase();
		
		Map<String, String> groovyHotCodeMap = null;
		synchronized (groovyHotCodeMapMap) {
			groovyHotCodeMap = groovyHotCodeMapMap.get(strSystemId);
			if(groovyHotCodeMap == null) {
				groovyHotCodeMap =  new ConcurrentHashMap<String, String>();
				groovyHotCodeMapMap.put(strSystemId, groovyHotCodeMap);
			}
		}
		
		return groovyHotCodeMap.get(strPSSysSFPluginId);
	}
	
	private void prepareSystemParams(String strSystemId) {
//		synchronized (groovyClassLoaderMap) {
//			this.groovyClassLoader = groovyClassLoaderMap.get(strSystemId);
//			if(this.groovyClassLoader == null) {
//				//this.groovyClassLoader =  new GroovyClassLoader( SysSFPluginRuntime.class.getClassLoader());
//				this.groovyClassLoader =  new GroovyClassLoader( );
//				groovyClassLoaderMap.put(strSystemId, this.groovyClassLoader);
//			}
//		}
	
		synchronized (groovyRTClassMapMap) {
			this.groovyRTClassMap = groovyRTClassMapMap.get(strSystemId);
			if(this.groovyRTClassMap == null) {
				this.groovyRTClassMap =  new ConcurrentHashMap<String, Class<?>>();
				groovyRTClassMapMap.put(strSystemId, this.groovyRTClassMap);
			}
		}
		
		synchronized (groovyRTCodeMapMap) {
			this.groovyRTCodeMap = groovyRTCodeMapMap.get(strSystemId);
			if(this.groovyRTCodeMap == null) {
				this.groovyRTCodeMap =  new ConcurrentHashMap<String, String>();
				groovyRTCodeMapMap.put(strSystemId, this.groovyRTCodeMap);
			}
		}
		
		synchronized (groovyHotCodeMapMap) {
			this.groovyHotCodeMap = groovyHotCodeMapMap.get(strSystemId);
			if(this.groovyHotCodeMap == null) {
				this.groovyHotCodeMap =  new ConcurrentHashMap<String, String>();
				groovyHotCodeMapMap.put(strSystemId, this.groovyHotCodeMap);
			}
		}
	}
	
	public static void resetSystemCache(String strSystemId) {
		synchronized (groovyRTClassMapMap) {
			groovyRTClassMapMap.remove(strSystemId);
		}
		
		synchronized (groovyRTCodeMapMap) {
			groovyRTCodeMapMap.remove(strSystemId);
		}
		
		synchronized (groovyHotCodeMapMap) {
			groovyHotCodeMapMap.remove(strSystemId);
		}
	}
	
	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysSFPlugin iPSSysSFPlugin) throws Exception {

		Assert.notNull(iSystemRuntimeContext, "传入系统运行时上下文无效");
		Assert.notNull(iPSSysSFPlugin, "传入系统后台插件无效");

		this.iSystemRuntimeContext = iSystemRuntimeContext;
		this.setSystemRuntimeBase(this.getSystemRuntimeContext().getSystemRuntime());
		
		prepareSystemParams(this.getSystemRuntimeContext().getSystemRuntime().getDeploySystemId());
		
		this.iPSSysSFPlugin = iPSSysSFPlugin;

		this.setRuntimePlugin(this.getPSSysSFPlugin().isRuntimeObject());
		this.setRTObjectName(this.getPSSysSFPlugin().getRTObjectName());

		this.setConfigFolder("syssfplugin." + PSModelUtils.calcUniqueTag(this.iPSSysSFPlugin.getPSSystemModule(), this.iPSSysSFPlugin.getPluginCode()));
		this.onInit();
		
		if (this.isRuntimePlugin()) {
			if (!StringUtils.hasLength(this.getRTObjectName())) {
				throw new ModelException(this.getPSSysSFPlugin(), String.format("系统后台插件[%1$s]设置为运行时组件但未指定组件名称", this.getName()));
			}
			try {
				if(this.getRTObjectName().indexOf(RTOBJECTNAME_GROOVY) == 0) {
					setGroovyRTObject(true);
					if(this.getRTObjectName().length() > RTOBJECTNAME_GROOVY.length() + 1) {
						this.setRTObjectName(this.getRTObjectName().substring(RTOBJECTNAME_GROOVY.length() + 1));
					}
					else {
						this.setRTObjectName(null);
					}
				}
				String strTemplCode = this.getRTObjectCode();
				if(!this.isGroovyRTObject()) {
					try {
						rtObjectClass = Class.forName(this.getRTObjectName());
						if(StringUtils.hasLength(strTemplCode)) {
							//判断代码是否更新
							String strCodeTag = null;
							if(StringUtils.hasLength(rtObjectClass.getCanonicalName())) {
								strCodeTag = groovyRTCodeMap.get(rtObjectClass.getCanonicalName());
							}
							
							if(!StringUtils.hasLength(strCodeTag)) {
								log.warn(String.format("系统后台插件[%1$s]使用内置组件[%2$s]，忽略动态代码", this.getName(), this.getRTObjectName()));
							}
							else {
								//判断代码是否一致
								String strTag = KeyValueUtils.genUniqueId(strTemplCode);
								if(!strCodeTag.equals(strTag)) {
									log.warn(String.format("系统后台插件[%1$s]组件[%2$s]代码变化，重新编译", this.getName(), this.getRTObjectName()));
									this.rtObjectClass = null;
								}
							}
						}
					}
					catch(Exception ex) {
						if(this.getPSSysSFPlugin().getRTObjectSource() == PluginRTMode.REMOTE.value) {
							if(!StringUtils.hasLength(this.getPSSysSFPlugin().getRTObjectRepo())) {
								throw ex;
							}
						}
						else
							if(!StringUtils.hasLength(strTemplCode)) {
								throw ex;
							}
					}
				}
				
				if(this.rtObjectClass == null) {
					if(this.getPSSysSFPlugin().getRTObjectSource() == PluginRTMode.REMOTE.value) {
						
						String strUrl = String.format("%1$s/%2$s", this.getSystemRuntime().getPSSystemService().getLibraryFolderPath(), this.getPSSysSFPlugin().getRTObjectRepo());

				        try {
				        	File jarFile = new File(strUrl.replace("\\", "/"));
				        	if(!jarFile.exists()) {
				        		throw new Exception(String.format("指定jar文件[%1$s]不存在", this.getPSSysSFPlugin().getRTObjectRepo()));
				        	}
				        	
				        	URLClassLoader child = (URLClassLoader) ClassLoader.getSystemClassLoader();
					        Class<URLClassLoader> classLoaderClass = URLClassLoader.class;
					        Method method = classLoaderClass.getDeclaredMethod("addURL", URL.class);
					        method.setAccessible(true);
					        method.invoke(child, jarFile.toURI().toURL());
					        
					        rtObjectClass = Class.forName(this.getRTObjectName());
						        
//				        	this.getSystemRuntime().getGroovyClassLoader().addURL(jarFile.toURI().toURL());
//							rtObjectClass = this.getSystemRuntime().getGroovyClassLoader().loadClass(this.getRTObjectName());
						}
						catch(Exception ex) {
							throw new ModelException(this.getPSSysSFPlugin(), String.format("系统后台插件[%1$s]指定组件[%2$s]加载发生异常，%3$s", this.getName(), this.getRTObjectName(), ex.getMessage()));
						}
				        
				        log.warn(String.format("系统后台插件[%1$s]使用jar[%2$s]构建组件[%3$s]", this.getName(), this.getPSSysSFPlugin().getRTObjectRepo(), this.getRTObjectName()));
					}
					else {
						if(!StringUtils.hasLength(strTemplCode)) {
							throw new ModelException(this.getPSSysSFPlugin(), String.format("系统后台插件[%1$s]未指定Groovy代码", this.getName()));
						}
						String strTag = KeyValueUtils.genUniqueId(strTemplCode);
						rtObjectClass = groovyRTClassMap.get(strTag);
						if(!this.getPSSysSFPlugin().isLazyMode()) {
							if(rtObjectClass == null) {
								try {
									//判断代码中是否有包信息
									if(strTemplCode.indexOf("package ") == -1) {
										String strAutoPackage = String.format("package net.ibizsys.runtime.plugin.groovy.a%1$s\r\n", random.nextInt(99999999));
										strTemplCode = strAutoPackage + strTemplCode;
									}
									rtObjectClass = this.getSystemRuntime().getGroovyClassLoader().parseClass(strTemplCode);
								
									groovyRTClassMap.put(strTag, rtObjectClass);
									if(StringUtils.hasLength(rtObjectClass.getCanonicalName())) {
										groovyRTCodeMap.put(rtObjectClass.getCanonicalName(), strTag);
									}
								}
								catch (Exception ex) {
									//log.error(ex);
									throw new ModelException(this.getPSSysSFPlugin(), String.format("系统后台插件[%1$s]指定组件[%2$s]编译发生异常，%3$s", this.getName(), this.getRTObjectName(), ex.getMessage()));
								}
							}
							this.setRTObjectCode(strTemplCode);
							this.setGroovyRTObject(true);
						}
						else {
							this.setGroovyRTObject(true);
						}
						log.warn(String.format("系统后台插件[%1$s]使用动态代码构建组件[%2$s]", this.getName(), this.getRTObjectName()));
					}
				}
				
				if(StringUtils.hasLength(this.getPSSysSFPlugin().getPluginTag())) {
					try {
						globalRtObjectClass = this.getSystemRuntime().getGroovyClassLoader().loadClass(this.getPSSysSFPlugin().getPluginTag());
					}
					catch(Exception ex) {
						//log.error(ex);
					}
					if(globalRtObjectClass == null) {
						try {
							globalRtObjectClass = Class.forName(this.getPSSysSFPlugin().getPluginTag());						
						}
						catch(Exception ex) {
							log.warn(String.format("系统后台插件[%1$s]全局插件类型[%2$s]无效", this.getName(), this.getPSSysSFPlugin().getPluginTag()));
						}
					}
				}
				
			} catch (Exception ex) {
				if(ex instanceof ModelException) {
					throw ex;
				}
				throw new ModelException(this.getPSSysSFPlugin(), String.format("系统后台插件[%1$s]指定组件无效[%2$s]", this.getName(), this.getRTObjectName()));
			}
		}
	}
	
	
	

	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return this.iSystemRuntimeContext;
	}

	@Override
	public IPSSysSFPlugin getPSSysSFPlugin() {
		return this.iPSSysSFPlugin;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysSFPlugin();
	}

	@Override
	public boolean isRuntimePlugin() {
		return this.bRuntimePlugin;
	}

	protected void setRuntimePlugin(boolean bRuntimePlugin) {
		this.bRuntimePlugin = bRuntimePlugin;
	}
	
	/**
	 * 获取运行时对象名称
	 * 
	 * @return
	 */
	@Override
	public String getRTObjectName() {
		return this.strRTObjectName;
	}
	
	/**
	 * 设置运行时对象名称
	 * @param strRTObjectName
	 */
	protected void setRTObjectName(String strRTObjectName) {
		this.strRTObjectName = strRTObjectName;
	}
	
	
	@Override
	public <T> T getRuntimeObject(Class<T> cls) throws Exception {
		return this.getRuntimeObject(cls, !this.getPSSysSFPlugin().isSingleInstance());
	}

	@Override
	public Object getRuntimeObject() throws Exception {
		return this.getRuntimeObject(!this.getPSSysSFPlugin().isSingleInstance());
	}

	@Override
	public <T> T getRuntimeObject(Class<T> cls, boolean bNewInstance) throws Exception {
		if (!isRuntimePlugin()) {
			throw new SystemRuntimeException(this.getSystemRuntime(), String.format("系统后台插件[%1$s]不提供运行时组件", this.getName()));
		}

		Class<?> rtObjectClass = getRTObjectClass();
		
		if (!cls.isAssignableFrom(rtObjectClass)) {
			throw new SystemRuntimeException(this.getSystemRuntime(), String.format("系统后台插件[%1$s]不支持指定类型[%2$s]", this.getName(), cls.getCanonicalName()));
		}

		if (bNewInstance) {
			Object objItem = rtObjectClass.newInstance();
			if(objItem instanceof IPluginRuntimeInitable) {
				((IPluginRuntimeInitable)objItem).init(this.getSystemRuntimeContext(), this.getPSSysSFPlugin());
			}
			this.autowareObject(objItem);
			return (T) objItem;
		}

		if (this.runtimeObject == null) {
			Object objItem = rtObjectClass.newInstance();
			if(objItem instanceof IPluginRuntimeInitable) {
				((IPluginRuntimeInitable)objItem).init(this.getSystemRuntimeContext(), this.getPSSysSFPlugin());
			}
			this.autowareObject(objItem);
			this.runtimeObject = objItem;
		}

		return (T) this.runtimeObject;
	}
	
	@Override
	public Object getRuntimeObject(boolean bNewInstance) throws Exception {
		if (!isRuntimePlugin()) {
			throw new SystemRuntimeException(this.getSystemRuntime(), String.format("系统后台插件[%1$s]不提供运行时组件", this.getName()));
		}

		Class<?> rtObjectClass = getRTObjectClass();

		if (bNewInstance) {
			Object objItem = rtObjectClass.newInstance();
			if(objItem instanceof IPluginRuntimeInitable) {
				((IPluginRuntimeInitable)objItem).init(this.getSystemRuntimeContext(), this.getPSSysSFPlugin());
			}
			this.autowareObject(objItem);
			return objItem;
		}

		if (this.runtimeObject == null) {
			Object objItem = rtObjectClass.newInstance();
			if(objItem instanceof IPluginRuntimeInitable) {
				((IPluginRuntimeInitable)objItem).init(this.getSystemRuntimeContext(), this.getPSSysSFPlugin());
			}
			this.autowareObject(objItem);
			this.runtimeObject = objItem;
		}

		return this.runtimeObject;
	}
	
	protected void autowareObject(Object object) throws Exception {
		this.getSystemRuntime().autowareObject(object);
	}
//	protected void autowareGroovyObject(GroovyObject groovyObject) throws Exception {
//		
//		if(this.getSystemRuntime().isLoaded()) {
//			this.doAutowareGroovyObject(groovyObject);
//		}
//		else {
//			//在系统加载后装配
//			ISystemEventListener systemEventListener = new ISystemEventListener() {
//				@Override
//				public void receiveEvent(String event, Object[] params) {
//					getSystemRuntime().unregisterSystemEventListener(this);
//					try {
//						doAutowareGroovyObject(groovyObject);
//					}
//					catch (Exception ex) {
//						log.error(ex);
//					}
//				}
//				
//				@Override
//				public Executor getExecutor() {
//					return null;
//				}
//			};
//			
//			this.getSystemRuntime().registerSystemEventListener(systemEventListener, new String[] { ISystemRuntime.SYSTEMEVENT_LOAD});
//		}
//	}
//
//	protected void doAutowareGroovyObject(GroovyObject groovyObject) throws Exception {
//		try {
//			this.autowire(groovyObject);
//		}
//		catch (Throwable ex) {
//			throw new Exception(String.format("装配Groovy对象发生异常，%1$s", ex.getMessage()), ex);
//		}
//	}
//	
//	protected void autowire(Object object) {
//		Field[] fields = object.getClass().getDeclaredFields();
//		if (ObjectUtils.isEmpty(fields)) {
//			return;
//		}
//		
//
//		try {
//			for (Field field : fields) {
//				Qualifier qualifier = field.getAnnotation(Qualifier.class);
//				if (qualifier != null) {
//					Object value = calcModelRuntime(object, field, qualifier);
//					if(value == null) {
//						continue;
//					}
//					
//					if (!field.isAccessible()) {
//						field.setAccessible(true);
//					}
//					
//					if(value instanceof IModelRuntime) {
//						field.set(object, value);
//					}
//					else {
//						field.set(object, getRealValue(field.getGenericType().getClass(), value));
//					}
//				}
//			}
//		} catch (Throwable ex) {
//			// log.error(ex);
//			throw new RuntimeException(ex);
//		}
//	}
//	
//	protected Object calcModelRuntime(Object object, Field field, Qualifier qualifier) {
//
//		if (qualifier != null) {
//			String name = qualifier.value();
//			if (StringUtils.hasLength(name)) {
//				String[] items = name.split("[:]");
//				if (items.length == 1) {
//					if(field.getGenericType().getClass().getName().equals("java.lang.Class")) {
//						return this.getSystemRuntime().getSystemRTGroovyContext().getModelRuntime(items[0], field.getName());
//					}
//					else {
//						return this.getSystemRuntime().getSystemRTGroovyContext().getModelRuntime(field.getGenericType().getClass(), items[0]);
//					}
//					
//				} else {
//					return this.getSystemRuntime().getSystemRTGroovyContext().getModelRuntime(items[0], items[1]);
//				}
//			}
//		}
//
//		return null;
//	}
	
	
	@Override
	public String getId() {
		return this.getPSSysSFPlugin().getId();
	}

	@Override
	public String getName() {
		return this.getPSSysSFPlugin().getName();
	}
	
	@Override
	public boolean isGroovyRTObject() {
		return this.bGroovyRTObject;
	}
	
	protected void setGroovyRTObject(boolean bGroovyRTObject) {
		this.bGroovyRTObject = bGroovyRTObject;
	}
	
	public String getRTObjectCode() {
		if(StringUtils.hasLength(this.strRTObjectCode)) {
			return this.strRTObjectCode;
		}
		
		String strHotCode = getHotCode(this.getSystemRuntime().getDeploySystemId(), this.getPSSysSFPlugin().getId());
		if(StringUtils.hasLength(strHotCode)) {
			return strHotCode;
		}
		
		return this.getPSSysSFPlugin().getTemplCode();
	}
	
	protected void setRTObjectCode(String strRTObjectCode) {
		this.strRTObjectCode = strRTObjectCode;
	}
	
	
	private Class<?> getRTObjectClass() throws Exception{
		if(this.rtObjectClass == null) {
			String strTemplCode = this.getRTObjectCode();
			String strTag = KeyValueUtils.genUniqueId(strTemplCode);
			rtObjectClass = groovyRTClassMap.get(strTag);
			if(rtObjectClass == null) {
				try {
					//判断代码中是否有包信息
					if(strTemplCode.indexOf("package ") == -1) {
						String strAutoPackage = String.format("package net.ibizsys.runtime.plugin.groovy.a%1$s\r\n", random.nextInt(99999999));
						strTemplCode = strAutoPackage + strTemplCode;
					}

//					try (GroovyClassLoader groovyClassLoader = new GroovyClassLoader()){
//						rtObjectClass = groovyClassLoader.parseClass(strTemplCode);
//					}
					rtObjectClass = this.getSystemRuntime().getGroovyClassLoader().parseClass(strTemplCode);
					groovyRTClassMap.put(strTag, rtObjectClass);
					if(StringUtils.hasLength(rtObjectClass.getCanonicalName())) {
						groovyRTCodeMap.put(rtObjectClass.getCanonicalName(), strTag);
					}
				}
				catch (Exception ex) {
					log.error(ex);
					throw new ModelException(this.getPSSysSFPlugin(), String.format("系统后台插件[%1$s]指定组件[%2$s]编译发生异常，%3$s", this.getName(), this.getRTObjectName(), ex.getMessage()));
				}
			}
			this.setRTObjectCode(strTemplCode);
			this.setGroovyRTObject(true);
		}
		return this.rtObjectClass;
	}
	
	/**
	 * 建立组件对象
	 * @param strObjectName
	 * @return
	 * @throws Exception
	 */
	public static Object createObject(String strObjectName) throws Exception {
		Assert.notNull(strObjectName, "未传入组件名称");
		
		try {
			Class<?> cls = Class.forName(strObjectName);
			return cls.newInstance();
		} catch (Exception ex) {
			throw ex;
		}
	}

	@Override
	public Class<?> getGlobalRuntimeObjectClass() {
		return this.globalRtObjectClass;
	}

	@Override
	public String getGlobalRuntimeObjectType() {
		if(getGlobalRuntimeObjectClass()!=null) {
			return this.getPSSysSFPlugin().getPluginTag2();
		}
		return null;
	}
	
	@Override
	public Class<?> getRuntimeObjectClass() {
		try {
			return this.getRTObjectClass();
		} catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("获取运行时对象类信息发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	
//	protected Object getRealValue(Class<?> type, Object objValue) throws Exception {
//		
//		if (type.equals(String.class)) {
//			return objValue.toString();
//		}
//		
//		if (type.equals(BigInteger.class)) {
//			return DataTypeUtils.getBigIntegerValue(objValue, null);
//		}
//		
//		if (type.equals(BigDecimal.class)) {
//			return DataTypeUtils.getBigDecimalValue(objValue, null);
//		}
//		
//		if (type.equals(int.class) || type.equals(Integer.class)) {
//			return DataTypeUtils.getIntegerValue(objValue, null);
//		}
//		if (type.equals(long.class) || type.equals(Long.class)) {
//			return DataTypeUtils.getLongValue(objValue, null);
//		}
//		
//		if (type.equals(double.class) || type.equals(Double.class)) {
//			return DataTypeUtils.getDoubleValue(objValue, null);
//		}
//		
//		if (type.isAssignableFrom(java.sql.Timestamp.class)) {
//			return DataTypeUtils.getDateTimeValue(objValue, null);
//		}
//		
//		if (type.equals(boolean.class) || type.isAssignableFrom(Boolean.class)) {
//			String strValue = objValue.toString();
//			return strValue.equalsIgnoreCase("1") || strValue.equalsIgnoreCase("true");
//		}
//		
//
//		return objValue;
//
//	}
//	

}
