package net.ibizsys.model.util.merger;

import java.util.HashMap;
import java.util.Map;

public abstract class PSModelMergerFactoryBase {

	private Map<Class<?>, IPSModelMerger> psModelMergerMap = new HashMap<>();
	private Map<Class<?>, IPSModelListMerger> psModelListMergerMap = new HashMap<>();
	
	public void registerPSModelMerger(Class<?> cls, IPSModelMerger iPSModelMerger) {
		this.psModelMergerMap.put(cls, iPSModelMerger);
	}
	
	public void registerPSModelListMerger(Class<?> cls, IPSModelListMerger iPSModelListMerger) {
		this.psModelListMergerMap.put(cls, iPSModelListMerger);
	}
	
	public IPSModelMerger getPSModelMerger(Class<?> cls, boolean bTryMode) throws Exception {
		IPSModelMerger iPSModelMerger = psModelMergerMap.get(cls);
		if(iPSModelMerger != null || bTryMode) {
			return iPSModelMerger;
		}
		throw new Exception(String.format("无法获取指定模型[%1$s]合并器", cls.getName()));
	}
	
	public IPSModelListMerger getPSModelListMerger(Class<?> cls, boolean bTryMode) throws Exception {
		IPSModelListMerger iPSModelListMerger = psModelListMergerMap.get(cls);
		if(iPSModelListMerger != null || bTryMode) {
			return iPSModelListMerger;
		}
		throw new Exception(String.format("无法获取指定模型[%1$s]列表合并器", cls.getName()));
	}
}
