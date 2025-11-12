package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.psmodel.core.domain.PSSysApp;
import net.ibizsys.psmodel.core.filter.PSSysAppFilter;
import net.ibizsys.psmodel.core.service.IPSSysAppService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysAppRTService extends PSModelRTServiceBase<PSSysApp, PSSysAppFilter> implements IPSSysAppService{
    private static final Log log = LogFactory.getLog(PSSysAppRTService.class);

    @Override
    public PSSysApp createDomain(){
        return new PSSysApp();
    }

    @Override
    public PSSysAppFilter createFilter(){
        return new PSSysAppFilter();
	}

	@Override
	public PSSysApp getDomain(Object params) {
		if(params instanceof PSSysApp) {
			return (PSSysApp)params;
		}
		return getMapper().convertValue(params, PSSysApp.class);
	}

	@Override
	public PSSysAppFilter getFilter(Object params) {
		if(params instanceof PSSysAppFilter) {
			return (PSSysAppFilter)params;
		}
		return getMapper().convertValue(params, PSSysAppFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSAPP";
        }
        else{
            return "PSSYSAPPS";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSApplication.class;
    }
    
    @Override
    protected List<? extends IPSApplication> getPSModelObjectList(PSSysAppFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSApps();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)key, tryMode);
    }
}
