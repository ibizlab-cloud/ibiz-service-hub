package net.ibizsys.runtime.plugin;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.runtime.IModelRuntimeContext;
import net.ibizsys.runtime.IModelRuntimeShutdownable;
import net.ibizsys.runtime.ISystemRuntime;


/**
 * 模型运行时插件仓库对象
 * @author lionlau
 *
 */
public class ModelRTAddinRepo implements IModelRTAddinRepo, IModelRuntimeShutdownable{

	private static final Log log = LogFactory.getLog(ModelRTAddinRepo.class);
	
	private Map<String, IModelRTAddin> addinMap = new ConcurrentHashMap<String, IModelRTAddin>();
	 
	private IModelRuntimeContext ctx = null;
	private String strTypePrefix = null;
	private Class<? extends IModelRTAddin> addinCls = null;
	private Map<String, Map> addinListMap = new ConcurrentHashMap<>();
	private IRuntimeObjectFactory iRuntimeObjectFactory = null;
	private ISystemRuntime iSystemRuntime = null;
	
	public void init(IModelRuntimeContext ctx, Class<? extends IModelRTAddin> addinCls, String strTypePrefix) throws Exception{
		this.init(ctx, addinCls, strTypePrefix, null);
	}
	
	public void init(IModelRuntimeContext ctx, Class<? extends IModelRTAddin> addinCls, String strTypePrefix, IRuntimeObjectFactory iRuntimeObjectFactory) throws Exception{
		this.init(ctx, addinCls, strTypePrefix, iRuntimeObjectFactory, null);
	}
	
	public void init(IModelRuntimeContext ctx, Class<? extends IModelRTAddin> addinCls, String strTypePrefix, IRuntimeObjectFactory iRuntimeObjectFactory, ISystemRuntime iSystemRuntime) throws Exception{
		this.ctx = ctx;
		this.strTypePrefix = strTypePrefix;
		this.addinCls = addinCls;
		this.iRuntimeObjectFactory = iRuntimeObjectFactory == null ? RuntimeObjectFactory.getInstance():iRuntimeObjectFactory;
		this.iSystemRuntime = iSystemRuntime;
		this.prepareAddins();
		this.onInit();
		if(this.getSystemRuntime() != null) {
			this.getSystemRuntime().registerModelRuntimeShutdownable(this);
		}
	}
	
	
	
	protected void prepareAddins() throws Exception{
		Map<String, ? extends IModelRTAddin> map = getRuntimeObjectFactory().getObjects(getAddinCls(), this.getTypePrefix());
		if(!ObjectUtils.isEmpty(map)) {
			this.addinMap.putAll(map);
			for(java.util.Map.Entry<String, ? extends IModelRTAddin> entry : addinMap.entrySet()) {
				IModelRTAddin iModelRTAddin = entry.getValue();
				if(getSystemRuntime()!=null) {
					getSystemRuntime().autowareObject(iModelRTAddin);
				}
				iModelRTAddin.init(this.getContext(), entry.getKey());
			}
		}
	}
	
	protected void onInit() throws Exception{
		
	}
	
	protected IRuntimeObjectFactory getRuntimeObjectFactory() {
		return this.iRuntimeObjectFactory;
	}
	
	protected IModelRuntimeContext getContext() {
		return this.ctx;
	}
	
	protected ISystemRuntime getSystemRuntime() {
		return this.iSystemRuntime;
	}
	
	protected String getTypePrefix() {
		return this.strTypePrefix;
	}
	
	protected Class<? extends IModelRTAddin> getAddinCls(){
		return this.addinCls;
	}
	
	
	@Override
	public <T> Map<String, T> getAddins(Class<T> cls, String strTypePrefix){
		String strTag = null;
		if(StringUtils.hasLength(strTypePrefix)) {
			strTag = String.format("%1$s|%2$s", cls.getCanonicalName() , strTypePrefix);
		} else {
			strTag = String.format("%1$s|", cls.getCanonicalName());
		}
		
		Object objMap = addinListMap.get(strTag);
		if(objMap != null) {
			return (Map<String, T>)objMap;
		}
		Map<String, T> map = new HashMap<String, T>();
		for(java.util.Map.Entry<String, IModelRTAddin> entry : addinMap.entrySet()) {
			if(!(cls.isAssignableFrom(entry.getValue().getClass()))) {
				continue;
			}
			
			if(StringUtils.hasLength(strTypePrefix)) {
				if(entry.getKey().indexOf(strTypePrefix)!=0) {
					continue;
				}
				map.put(entry.getKey().substring(strTypePrefix.length()), (T)entry.getValue());
			}
			else {
				map.put(entry.getKey(), (T)entry.getValue());
			}
		}
		
		addinListMap.put(strTag, map);
		return map;
	}
	
	@Override
	public <T> T getAddin(Class<T> cls, String strTypePrefix, boolean bTryMode){
		Map<String, T> map = getAddins(cls, strTypePrefix);
		if(!ObjectUtils.isEmpty(map)) {
			T t = map.get("");
			if(t != null) {
				return t;
			}
		}
		
		if(bTryMode) {
			return null;
		}
		
		throw new RuntimeException(String.format("无法获取指定类型[%1$s]插件", strTypePrefix));
	}
	
	@Override
	public void shutdown() throws Exception {
		onShutdown();
	}
	
	protected void onShutdown() throws Exception{
		if(!ObjectUtils.isEmpty(this.addinMap)) {
			this.addinMap.clear();
		}
		if(!ObjectUtils.isEmpty(this.addinListMap)) {
			this.addinListMap.clear();
		}
		this.iRuntimeObjectFactory = null;
	}
}
