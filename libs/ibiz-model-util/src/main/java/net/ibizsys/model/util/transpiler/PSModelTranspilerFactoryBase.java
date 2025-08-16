package net.ibizsys.model.util.transpiler;

import java.util.HashMap;
import java.util.Map;

public abstract class PSModelTranspilerFactoryBase {

	private Map<Class<?>, IPSModelTranspiler> psModelTranspilerMap = new HashMap<>();
	private Map<Class<?>, IPSModelListTranspiler> psModelListTranspilerMap = new HashMap<>();
	
	private Map<Class<?>, Class<?>> psModelTranspilerClsMap = new HashMap<>();
	private Map<Class<?>, Class<?>> psModelListTranspilerClsMap = new HashMap<>();
	
	
	public void registerPSModelTranspiler(Class<?> cls, IPSModelTranspiler iPSModelTranspiler) {
		this.psModelTranspilerMap.put(cls, iPSModelTranspiler);
	}
	
	public void registerPSModelListTranspiler(Class<?> cls, IPSModelListTranspiler iPSModelListTranspiler) {
		this.psModelListTranspilerMap.put(cls, iPSModelListTranspiler);
	}
	
	public void registerPSModelTranspiler(Class<?> cls, Class<?> psModelTranspilerCls) {
		this.psModelTranspilerClsMap.put(cls, psModelTranspilerCls);
	}
	
	public void registerPSModelListTranspiler(Class<?> cls, Class<?> psModelListTranspilerCls) {
		this.psModelListTranspilerClsMap.put(cls, psModelListTranspilerCls);
	}
	
	
	public IPSModelTranspiler getPSModelTranspiler(Class<?> cls, boolean bTryMode) throws Exception {
		IPSModelTranspiler iPSModelTranspiler = psModelTranspilerMap.get(cls);
		if(iPSModelTranspiler == null) {
			Class<?> transpilerCls = psModelTranspilerClsMap.get(cls);
			if(transpilerCls!=null) {
				iPSModelTranspiler = (IPSModelTranspiler)transpilerCls.newInstance();
				psModelTranspilerMap.put(cls, iPSModelTranspiler);
			}
		}
		if(iPSModelTranspiler == null) {
			iPSModelTranspiler =  psModelListTranspilerMap.get(cls);
			if(iPSModelTranspiler == null) {
				Class<?> transpilerCls = psModelListTranspilerClsMap.get(cls);
				if(transpilerCls!=null) {
					iPSModelTranspiler = (IPSModelTranspiler)transpilerCls.newInstance();
					psModelListTranspilerMap.put(cls, (IPSModelListTranspiler)iPSModelTranspiler);
				}
			}
		}
		if(iPSModelTranspiler != null || bTryMode) {
			return iPSModelTranspiler;
		}
		throw new Exception(String.format("无法获取指定模型[%1$s]合并器", cls.getName()));
	}
	
	public IPSModelListTranspiler getPSModelListTranspiler(Class<?> cls, boolean bTryMode) throws Exception {
		IPSModelListTranspiler iPSModelListTranspiler = psModelListTranspilerMap.get(cls);
		if(iPSModelListTranspiler == null) {
			Class<?> transpilerCls = psModelListTranspilerClsMap.get(cls);
			if(transpilerCls!=null) {
				iPSModelListTranspiler = (IPSModelListTranspiler)transpilerCls.newInstance();
				psModelListTranspilerMap.put(cls, iPSModelListTranspiler);
			}
		}
		if(iPSModelListTranspiler != null || bTryMode) {
			return iPSModelListTranspiler;
		}
		throw new Exception(String.format("无法获取指定模型[%1$s]列表合并器", cls.getName()));
	}
}
