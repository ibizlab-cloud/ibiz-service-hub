package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.service.IPSSubSysServiceAPI;
import net.ibizsys.model.service.IPSSubSysServiceAPIDERS;
import net.ibizsys.psmodel.core.domain.PSSubSysSADERS;
import net.ibizsys.psmodel.core.filter.PSSubSysSADERSFilter;
import net.ibizsys.psmodel.core.service.IPSSubSysSADERSService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSubSysSADERSRTService extends PSModelRTServiceBase<PSSubSysSADERS, PSSubSysSADERSFilter> implements IPSSubSysSADERSService{
    private static final Log log = LogFactory.getLog(PSSubSysSADERSRTService.class);

    @Override
    public PSSubSysSADERS createDomain(){
        return new PSSubSysSADERS();
    }

    @Override
    public PSSubSysSADERSFilter createFilter(){
        return new PSSubSysSADERSFilter();
	}

	@Override
	public PSSubSysSADERS getDomain(Object params) {
		if(params instanceof PSSubSysSADERS) {
			return (PSSubSysSADERS)params;
		}
		return getMapper().convertValue(params, PSSubSysSADERS.class);
	}

	@Override
	public PSSubSysSADERSFilter getFilter(Object params) {
		if(params instanceof PSSubSysSADERSFilter) {
			return (PSSubSysSADERSFilter)params;
		}
		return getMapper().convertValue(params, PSSubSysSADERSFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSUBSYSSADERS";
        }
        else{
            return "PSSUBSYSSADERS";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSubSysServiceAPIDERS.class;
    }
    
    @Override
    protected List<? extends IPSSubSysServiceAPIDERS> getPSModelObjectList(PSSubSysSADERSFilter f) throws Exception {
    	
    	Object objPSSubSysServiceAPIId = f.getFieldCond(PSSubSysSADERS.FIELD_PSSUBSYSSERVICEAPIID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSubSysServiceAPIId)) {
    		objPSSubSysServiceAPIId  = getParentId(f, PSModels.PSSUBSYSSERVICEAPI);
     	}
    	
    	if(ObjectUtils.isEmpty(objPSSubSysServiceAPIId)) {
    		List<IPSSubSysServiceAPI> psSysServiceAPIList = this.getPSSystemService().getPSSystem().getAllPSSubSysServiceAPIs();
    		if(ObjectUtils.isEmpty(psSysServiceAPIList)) {
    			return null;
    		}
    		
    		List<IPSSubSysServiceAPIDERS> psDEServiceAPIList = new ArrayList<IPSSubSysServiceAPIDERS>();
    		for(IPSSubSysServiceAPI iPSSubSysServiceAPI : psSysServiceAPIList) {
    			if(ObjectUtils.isEmpty(iPSSubSysServiceAPI.getAllPSSubSysServiceAPIDERSs())) {
    				continue;
    			}
    			
    			psDEServiceAPIList.addAll(iPSSubSysServiceAPI.getAllPSSubSysServiceAPIDERSs());
    		}
    		
    		return psDEServiceAPIList;
    	}
    	
    	return getPSModelObject(IPSSubSysServiceAPI.class, this.getPSSystemService().getPSSystem().getAllPSSubSysServiceAPIs(), (String)objPSSubSysServiceAPIId, false).getAllPSSubSysServiceAPIDERSs();
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSubSysServiceAPIDERS.class
    			,getPSModelObject(IPSSubSysServiceAPI.class, this.getPSSystemService().getPSSystem().getAllPSSubSysServiceAPIs(), (String)getParentId(key), false).getAllPSSubSysServiceAPIDERSs()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSSubSysSADERS domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSUBSYSSERVICEAPI, getParentId(domain.getId()));
    	domain.setPSSubSysServiceAPIId(parentPSModel.getId());
    	domain.setPSSubSysServiceAPIName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
}
