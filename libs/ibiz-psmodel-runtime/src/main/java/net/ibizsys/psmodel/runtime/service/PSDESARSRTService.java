package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS;
import net.ibizsys.model.service.IPSSysServiceAPI;
import net.ibizsys.psmodel.core.domain.PSDESARS;
import net.ibizsys.psmodel.core.filter.PSDESARSFilter;
import net.ibizsys.psmodel.core.service.IPSDESARSService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDESARSRTService extends PSModelRTServiceBase<PSDESARS, PSDESARSFilter> implements IPSDESARSService{
    private static final Log log = LogFactory.getLog(PSDESARSRTService.class);

    @Override
    public PSDESARS createDomain(){
        return new PSDESARS();
    }

    @Override
    public PSDESARSFilter createFilter(){
        return new PSDESARSFilter();
	}

	@Override
	public PSDESARS getDomain(Object params) {
		if(params instanceof PSDESARS) {
			return (PSDESARS)params;
		}
		return getMapper().convertValue(params, PSDESARS.class);
	}

	@Override
	public PSDESARSFilter getFilter(Object params) {
		if(params instanceof PSDESARSFilter) {
			return (PSDESARSFilter)params;
		}
		return getMapper().convertValue(params, PSDESARSFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDESARS";
        }
        else{
            return "PSDESARS";
        }
	}
    
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEServiceAPIRS.class;
    }
    
    @Override
    protected List<? extends IPSDEServiceAPIRS> getPSModelObjectList(PSDESARSFilter f) throws Exception {
    	
    	Object objPSSysServiceAPIId = f.getFieldCond(PSDESARS.FIELD_PSSYSSERVICEAPIID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysServiceAPIId)) {
    		objPSSysServiceAPIId  = getParentId(f, PSModels.PSSYSSERVICEAPI);
     	}
    	
    	if(ObjectUtils.isEmpty(objPSSysServiceAPIId)) {
    		List<IPSSysServiceAPI> psSysServiceAPIList = this.getPSSystemService().getPSSystem().getAllPSSysServiceAPIs();
    		if(ObjectUtils.isEmpty(psSysServiceAPIList)) {
    			return null;
    		}
    		
    		List<IPSDEServiceAPIRS> psDEServiceAPIList = new ArrayList<IPSDEServiceAPIRS>();
    		for(IPSSysServiceAPI iPSSysServiceAPI : psSysServiceAPIList) {
    			if(ObjectUtils.isEmpty(iPSSysServiceAPI.getPSDEServiceAPIRSs())) {
    				continue;
    			}
    			
    			psDEServiceAPIList.addAll(iPSSysServiceAPI.getPSDEServiceAPIRSs());
    		}
    		
    		return psDEServiceAPIList;
    	}
    	
    	return getPSModelObject(IPSSysServiceAPI.class, this.getPSSystemService().getPSSystem().getAllPSSysServiceAPIs(), (String)objPSSysServiceAPIId, false).getPSDEServiceAPIRSs();
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEServiceAPIRS.class
    			,getPSModelObject(IPSSysServiceAPI.class, this.getPSSystemService().getPSSystem().getAllPSSysServiceAPIs(), (String)getParentId(key), false).getPSDEServiceAPIRSs()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDESARS domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSSERVICEAPI, getParentId(domain.getId()));
    	domain.setPSSysServiceAPIId(parentPSModel.getId());
    	domain.setPSSysServiceAPIName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
