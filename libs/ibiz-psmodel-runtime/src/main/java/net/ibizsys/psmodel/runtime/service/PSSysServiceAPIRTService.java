package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.service.IPSSysServiceAPI;
import net.ibizsys.psmodel.core.domain.PSSysServiceAPI;
import net.ibizsys.psmodel.core.filter.PSSysServiceAPIFilter;
import net.ibizsys.psmodel.core.service.IPSSysServiceAPIService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysServiceAPIRTService extends PSModelRTServiceBase<PSSysServiceAPI, PSSysServiceAPIFilter> implements IPSSysServiceAPIService{
    private static final Log log = LogFactory.getLog(PSSysServiceAPIRTService.class);

    @Override
    public PSSysServiceAPI createDomain(){
        return new PSSysServiceAPI();
    }

    @Override
    public PSSysServiceAPIFilter createFilter(){
        return new PSSysServiceAPIFilter();
	}

	@Override
	public PSSysServiceAPI getDomain(Object params) {
		if(params instanceof PSSysServiceAPI) {
			return (PSSysServiceAPI)params;
		}
		return getMapper().convertValue(params, PSSysServiceAPI.class);
	}

	@Override
	public PSSysServiceAPIFilter getFilter(Object params) {
		if(params instanceof PSSysServiceAPIFilter) {
			return (PSSysServiceAPIFilter)params;
		}
		return getMapper().convertValue(params, PSSysServiceAPIFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSSERVICEAPI";
        }
        else{
            return "PSSYSSERVICEAPIS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysServiceAPI.class;
    }
    
    @Override
    protected List<? extends IPSSysServiceAPI> getPSModelObjectList(PSSysServiceAPIFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysServiceAPIs();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysServiceAPI.class, this.getPSSystemService().getPSSystem().getAllPSSysServiceAPIs(), (String)key, false);
    }
}
