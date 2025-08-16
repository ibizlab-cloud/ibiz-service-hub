package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPI;
import net.ibizsys.model.service.IPSSysServiceAPI;
import net.ibizsys.psmodel.core.domain.PSDEServiceAPI;
import net.ibizsys.psmodel.core.filter.PSDEServiceAPIFilter;
import net.ibizsys.psmodel.core.service.IPSDEServiceAPIService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEServiceAPIRTService extends PSModelRTServiceBase<PSDEServiceAPI, PSDEServiceAPIFilter> implements IPSDEServiceAPIService{
    private static final Log log = LogFactory.getLog(PSDEServiceAPIRTService.class);

    @Override
    public PSDEServiceAPI createDomain(){
        return new PSDEServiceAPI();
    }

    @Override
    public PSDEServiceAPIFilter createFilter(){
        return new PSDEServiceAPIFilter();
	}

	@Override
	public PSDEServiceAPI getDomain(Object params) {
		if(params instanceof PSDEServiceAPI) {
			return (PSDEServiceAPI)params;
		}
		return getMapper().convertValue(params, PSDEServiceAPI.class);
	}

	@Override
	public PSDEServiceAPIFilter getFilter(Object params) {
		if(params instanceof PSDEServiceAPIFilter) {
			return (PSDEServiceAPIFilter)params;
		}
		return getMapper().convertValue(params, PSDEServiceAPIFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDESERVICEAPI";
        }
        else{
            return "PSDESERVICEAPIS";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEServiceAPI.class;
    }
    
    @Override
    protected List<? extends IPSDEServiceAPI> getPSModelObjectList(PSDEServiceAPIFilter f) throws Exception {
    	
    	Object objPSSysServiceAPIId = f.getFieldCond(PSDEServiceAPI.FIELD_PSSYSSERVICEAPIID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysServiceAPIId)) {
    		objPSSysServiceAPIId  = getParentId(f, PSModels.PSSYSSERVICEAPI);
     	}
    	
    	if(ObjectUtils.isEmpty(objPSSysServiceAPIId)) {
    		List<IPSSysServiceAPI> psSysServiceAPIList = this.getPSSystemService().getPSSystem().getAllPSSysServiceAPIs();
    		if(ObjectUtils.isEmpty(psSysServiceAPIList)) {
    			return null;
    		}
    		
    		List<IPSDEServiceAPI> psDEServiceAPIList = new ArrayList<IPSDEServiceAPI>();
    		for(IPSSysServiceAPI iPSSysServiceAPI : psSysServiceAPIList) {
    			if(ObjectUtils.isEmpty(iPSSysServiceAPI.getPSDEServiceAPIs())) {
    				continue;
    			}
    			
    			psDEServiceAPIList.addAll(iPSSysServiceAPI.getPSDEServiceAPIs());
    		}
    		
    		return psDEServiceAPIList;
    	}
    	
    	return getPSModelObject(IPSSysServiceAPI.class, this.getPSSystemService().getPSSystem().getAllPSSysServiceAPIs(), (String)objPSSysServiceAPIId, false).getPSDEServiceAPIs();
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEServiceAPI.class
    			,getPSModelObject(IPSSysServiceAPI.class, this.getPSSystemService().getPSSystem().getAllPSSysServiceAPIs(), (String)getParentId(key), false).getPSDEServiceAPIs()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEServiceAPI domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSSERVICEAPI, getParentId(domain.getId()));
    	domain.setPSSysServiceAPIId(parentPSModel.getId());
    	domain.setPSSysServiceAPIName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
