package net.ibizsys.psmodel.core.util;

import java.util.HashMap;
import java.util.Map;

public class PSModelServiceFactory {

//	
	
//	protected static PSModelServiceFactory getDefault() {
//		if(PSModelServiceFactory.defaultInst == null) {
//			PSModelServiceFactory.defaultInst = new PSModelServiceFactory();
//		}
//		return PSModelServiceFactory.defaultInst;
//	}
//	
//	protected static void setDefault(PSModelServiceFactory defaultInst) {
//		PSModelServiceFactory.defaultInst = defaultInst;
//	}
	
	
	private Map<String, IPSModelService> psModelServiceMap = new HashMap<String, IPSModelService>();
	private Map<String, Class<?>> psModelServiceClsMap = new HashMap<String, Class<?>>();
	
	
	public IPSModelService getPSModelService(String modelName) throws Exception {
		return getPSModelService(modelName, false);
	}
	
	public IPSModelService getPSModelService(String modelName, boolean tryMode) throws Exception {
		IPSModelService iPSModelService = this.psModelServiceMap.get(modelName);
		if(iPSModelService == null) {
			Class<?> cls = psModelServiceClsMap.get(modelName);
			if(cls != null) {
				iPSModelService =(IPSModelService)cls.newInstance();
			}
		}
		if(iPSModelService != null || tryMode) {
			return iPSModelService;
		}
		throw new Exception(String.format("无法获取指定模型[%1$s]服务对象", modelName));
	}
	
	public void registerPSModelService(String modelName, IPSModelService iPSModelService) {
		psModelServiceMap.put(modelName, iPSModelService);
	}
	
	public void registerPSModelService(String modelName, Class<?> cls) {
		psModelServiceClsMap.put(modelName, cls);
	}
	
}
