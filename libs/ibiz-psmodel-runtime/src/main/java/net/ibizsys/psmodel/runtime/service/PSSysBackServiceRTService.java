package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.backservice.IPSSysBackService;
import net.ibizsys.psmodel.core.domain.PSSysBackService;
import net.ibizsys.psmodel.core.filter.PSSysBackServiceFilter;
import net.ibizsys.psmodel.core.service.IPSSysBackServiceService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysBackServiceRTService extends PSModelRTServiceBase<PSSysBackService, PSSysBackServiceFilter> implements IPSSysBackServiceService{
    private static final Log log = LogFactory.getLog(PSSysBackServiceRTService.class);

    @Override
    public PSSysBackService createDomain(){
        return new PSSysBackService();
    }

    @Override
    public PSSysBackServiceFilter createFilter(){
        return new PSSysBackServiceFilter();
	}

	@Override
	public PSSysBackService getDomain(Object params) {
		if(params instanceof PSSysBackService) {
			return (PSSysBackService)params;
		}
		return getMapper().convertValue(params, PSSysBackService.class);
	}

	@Override
	public PSSysBackServiceFilter getFilter(Object params) {
		if(params instanceof PSSysBackServiceFilter) {
			return (PSSysBackServiceFilter)params;
		}
		return getMapper().convertValue(params, PSSysBackServiceFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBACKSERVICE";
        }
        else{
            return "PSSYSBACKSERVICES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysBackService.class;
    }
    
    @Override
    protected List<? extends IPSSysBackService> getPSModelObjectList(PSSysBackServiceFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysBackServices();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysBackService.class, this.getPSSystemService().getPSSystem().getAllPSSysBackServices(), (String)key, false);
    }
}
