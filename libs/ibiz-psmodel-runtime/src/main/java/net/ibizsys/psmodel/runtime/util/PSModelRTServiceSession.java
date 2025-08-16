package net.ibizsys.psmodel.runtime.util;

import java.util.HashMap;
import java.util.Map;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.model.util.transpiler.PSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelService;
import net.ibizsys.psmodel.core.util.PSModelServiceSession;

public class PSModelRTServiceSession extends PSModelServiceSession implements IPSModelRTServiceSession {

	private IPSSystemService iPSSystemService = null;
	private PSModelTranspileContext psModelTranspileContext = new PSModelTranspileContext();
	private Map<String, IPSModel> cachePSModelMap = new HashMap<String, IPSModel>();
	//private IPSModelObject compileOwner = null;
	private IPSApplication iPSApplication = null;

	@Override
	public IPSSystemService getPSSystemService() {
		return this.iPSSystemService;
	}

	public void setPSSystemService(IPSSystemService iPSSystemService) {
		this.iPSSystemService = iPSSystemService;
	}
	
	@Override
	public IPSSystem getPSSystem() {
		return (getPSSystemService()!=null)?getPSSystemService().getPSSystem():null;
	}
	
//	@Override
//	public IPSModelObject getCompileOwner() {
//		return this.compileOwner;
//	}
//	
//	//@Override
//	public void setCompileOwner(IPSModelObject iPSModelObject) {
//		this.compileOwner = iPSModelObject;
//	}

	@Override
	public IPSModelService getPSModelService(String modelName, boolean tryMode) throws Exception {
		modelName = modelName.toUpperCase();
		return PSModelRTServiceFactory.getCurrent().getPSModelService(modelName, tryMode);
	}
	
	@Override
	public Object getParam(String strKey) {
		return this.psModelTranspileContext.getParam(strKey);
	}

	
	
	@Override
	public String getParam(String strKey, String strDefault) {
		return this.psModelTranspileContext.getParam(strKey, strDefault);
	}

	@Override
	public int getParam(String strKey, int nDefault) {
		return this.psModelTranspileContext.getParam(strKey, nDefault);
	}

	@Override
	public long getParam(String strKey, long nDefault) {
		return this.psModelTranspileContext.getParam(strKey, nDefault);
	}

	@Override
	public double getParam(String strKey, double fDefault) {
		return this.psModelTranspileContext.getParam(strKey, fDefault);
	}

	@Override
	public boolean getParam(String strKey, boolean bDefault) {
		return this.psModelTranspileContext.getParam(strKey, bDefault);
	}

	@Override
	public void setParam(String strKey, Object objValue) {
		this.psModelTranspileContext.setParam(strKey, objValue);
	}
	
	public void registerPSModelTranspiler(Class<?> cls, IPSModelTranspiler iPSModelTranspiler) {
		this.psModelTranspileContext.registerPSModelTranspiler(cls, iPSModelTranspiler);
	}
	
	public void registerPSModelListTranspiler(Class<?> cls, IPSModelListTranspiler iPSModelListTranspiler) {
		this.psModelTranspileContext.registerPSModelListTranspiler(cls, iPSModelListTranspiler);
	}

	@Override
	public IPSModelTranspiler getPSModelTranspiler(Class<?> cls, boolean bTryMode) throws Exception {
		return this.psModelTranspileContext.getPSModelTranspiler(cls, bTryMode);
	}
	
	@Override
	public IPSModelListTranspiler getPSModelListTranspiler(Class<?> cls, boolean bTryMode) throws Exception {
		return this.psModelTranspileContext.getPSModelListTranspiler(cls, bTryMode);
	}

	@Override
	public String getPSModelUniqueTag(IPSModelObject iPSModelObject) throws Exception {
		return this.psModelTranspileContext.getPSModelUniqueTag(iPSModelObject);
	}

	@Override
	public IPSModel getCachePSModel(String strPSModelName, String strKey) throws Exception {
		String strCacheTag = String.format("%1$s|%2$s", strPSModelName, strKey);
		IPSModel iPSModel = this.cachePSModelMap.get(strCacheTag);
		if(iPSModel==null) {
			iPSModel = this.getPSModelService(strPSModelName).get(strKey, false);
			this.cachePSModelMap.put(strCacheTag, iPSModel);
		}
		return iPSModel;
	}

	@Override
	public IPSApplication getPSApplication() {
		return this.iPSApplication;
	}
	
	
	public void setPSApplication(IPSApplication iPSApplication) {
		this.iPSApplication = iPSApplication;
	}

}
