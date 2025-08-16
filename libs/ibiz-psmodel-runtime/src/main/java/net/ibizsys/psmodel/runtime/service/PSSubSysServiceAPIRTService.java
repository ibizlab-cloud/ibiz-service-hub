package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.service.IPSSubSysServiceAPI;
import net.ibizsys.psmodel.core.domain.PSSubSysServiceAPI;
import net.ibizsys.psmodel.core.filter.PSSubSysServiceAPIFilter;
import net.ibizsys.psmodel.core.service.IPSSubSysServiceAPIService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSubSysServiceAPIRTService extends PSModelRTServiceBase<PSSubSysServiceAPI, PSSubSysServiceAPIFilter> implements IPSSubSysServiceAPIService{
    private static final Log log = LogFactory.getLog(PSSubSysServiceAPIRTService.class);

    @Override
    public PSSubSysServiceAPI createDomain(){
        return new PSSubSysServiceAPI();
    }

    @Override
    public PSSubSysServiceAPIFilter createFilter(){
        return new PSSubSysServiceAPIFilter();
	}

	@Override
	public PSSubSysServiceAPI getDomain(Object params) {
		if(params instanceof PSSubSysServiceAPI) {
			return (PSSubSysServiceAPI)params;
		}
		return getMapper().convertValue(params, PSSubSysServiceAPI.class);
	}

	@Override
	public PSSubSysServiceAPIFilter getFilter(Object params) {
		if(params instanceof PSSubSysServiceAPIFilter) {
			return (PSSubSysServiceAPIFilter)params;
		}
		return getMapper().convertValue(params, PSSubSysServiceAPIFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSUBSYSSERVICEAPI";
        }
        else{
            return "PSSUBSYSSERVICEAPIS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSubSysServiceAPI.class;
    }
    
    @Override
    protected List<? extends IPSSubSysServiceAPI> getPSModelObjectList(PSSubSysServiceAPIFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSubSysServiceAPIs();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSubSysServiceAPI.class, this.getPSSystemService().getPSSystem().getAllPSSubSysServiceAPIs(), (String)key, false);
    }
}
