package net.ibizsys.psmodel.core.util;

import java.util.HashMap;
import java.util.Map;

public class PSModelServiceSession implements IPSModelServiceSession{

	private Map<String, Object> params = new HashMap<String, Object>();
	private IPSModelStorage iPSModelStorage = null;
	private static ThreadLocal<IPSModelServiceSession> current = new ThreadLocal<IPSModelServiceSession>();
	
	public static IPSModelServiceSession getCurrent() throws Exception{
		return getCurrent(false);
	}
	
	public static IPSModelServiceSession getCurrent(boolean bTryMode)throws Exception{
		
		IPSModelServiceSession iPSModelServiceSession = current.get();
		if(iPSModelServiceSession == null && !bTryMode) {
			throw new Exception("当前未打开模型服务会话");
		}
		return iPSModelServiceSession;
	}
	
	public static void setCurrent(IPSModelServiceSession iPSModelServiceSession) {
		current.set(iPSModelServiceSession);
	}
	
	

	@Override
	public Object getParam(String name) {
		return this.params.get(name);
	}

	@Override
	public void setParam(String name, Object value) {
		this.params.put(name, value);
	}
	
	
	@Override
	public void removeParam(String name) {
		this.params.remove(name);
	}

	@Override
	public IPSModelStorage getPSModelStorage() throws Exception {
		return this.getPSModelStorage(false);
	}
	
	@Override
	public IPSModelStorage getPSModelStorage(boolean tryMode) throws Exception {
		if(this.iPSModelStorage != null || tryMode) {
			return this.iPSModelStorage;
		}
		return null;
	}

	public void setPSModelStorage(IPSModelStorage iPSModelStorage) {
		this.iPSModelStorage = iPSModelStorage;
	}

	@Override
	public IPSModelService getPSModelService(String modelName) throws Exception {
		return getPSModelService(modelName, false);
	}

	@Override
	public IPSModelService getPSModelService(String modelName, boolean tryMode) throws Exception {
		throw new Exception("没有实现");
	}
	
	
}
