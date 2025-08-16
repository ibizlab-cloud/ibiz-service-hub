package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.service.IPSSubSysServiceAPI;
import net.ibizsys.model.service.IPSSubSysServiceAPIDE;
import net.ibizsys.psmodel.core.domain.PSSubSysSADE;
import net.ibizsys.psmodel.core.filter.PSSubSysSADEFilter;
import net.ibizsys.psmodel.core.service.IPSSubSysSADEService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSubSysSADERTService extends PSModelRTServiceBase<PSSubSysSADE, PSSubSysSADEFilter> implements IPSSubSysSADEService{
    private static final Log log = LogFactory.getLog(PSSubSysSADERTService.class);

    @Override
    public PSSubSysSADE createDomain(){
        return new PSSubSysSADE();
    }

    @Override
    public PSSubSysSADEFilter createFilter(){
        return new PSSubSysSADEFilter();
	}

	@Override
	public PSSubSysSADE getDomain(Object params) {
		if(params instanceof PSSubSysSADE) {
			return (PSSubSysSADE)params;
		}
		return getMapper().convertValue(params, PSSubSysSADE.class);
	}

	@Override
	public PSSubSysSADEFilter getFilter(Object params) {
		if(params instanceof PSSubSysSADEFilter) {
			return (PSSubSysSADEFilter)params;
		}
		return getMapper().convertValue(params, PSSubSysSADEFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSUBSYSSADE";
        }
        else{
            return "PSSUBSYSSADES";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSubSysServiceAPIDE.class;
    }
    
    @Override
    protected List<? extends IPSSubSysServiceAPIDE> getPSModelObjectList(PSSubSysSADEFilter f) throws Exception {
    	
    	Object objPSSubSysServiceAPIId = f.getFieldCond(PSSubSysSADE.FIELD_PSSUBSYSSERVICEAPIID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSubSysServiceAPIId)) {
    		objPSSubSysServiceAPIId  = getParentId(f, PSModels.PSSUBSYSSERVICEAPI);
     	}
    	
    	if(ObjectUtils.isEmpty(objPSSubSysServiceAPIId)) {
    		List<IPSSubSysServiceAPI> psSysServiceAPIList = this.getPSSystemService().getPSSystem().getAllPSSubSysServiceAPIs();
    		if(ObjectUtils.isEmpty(psSysServiceAPIList)) {
    			return null;
    		}
    		
    		List<IPSSubSysServiceAPIDE> psDEServiceAPIList = new ArrayList<IPSSubSysServiceAPIDE>();
    		for(IPSSubSysServiceAPI iPSSubSysServiceAPI : psSysServiceAPIList) {
    			if(ObjectUtils.isEmpty(iPSSubSysServiceAPI.getAllPSSubSysServiceAPIDEs())) {
    				continue;
    			}
    			
    			psDEServiceAPIList.addAll(iPSSubSysServiceAPI.getAllPSSubSysServiceAPIDEs());
    		}
    		
    		return psDEServiceAPIList;
    	}
    	
    	return getPSModelObject(IPSSubSysServiceAPI.class, this.getPSSystemService().getPSSystem().getAllPSSubSysServiceAPIs(), (String)objPSSubSysServiceAPIId, false).getAllPSSubSysServiceAPIDEs();
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSubSysServiceAPIDE.class
    			,getPSModelObject(IPSSubSysServiceAPI.class, this.getPSSystemService().getPSSystem().getAllPSSubSysServiceAPIs(), (String)getParentId(key), false).getAllPSSubSysServiceAPIDEs()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSSubSysSADE domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSUBSYSSERVICEAPI, getParentId(domain.getId()));
    	domain.setPSSubSysServiceAPIId(parentPSModel.getId());
    	domain.setPSSubSysServiceAPIName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
