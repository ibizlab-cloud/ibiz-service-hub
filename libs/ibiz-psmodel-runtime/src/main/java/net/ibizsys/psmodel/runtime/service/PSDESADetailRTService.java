package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPI;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod;
import net.ibizsys.model.service.IPSSysServiceAPI;
import net.ibizsys.psmodel.core.domain.PSDESADetail;
import net.ibizsys.psmodel.core.domain.PSDEServiceAPI;
import net.ibizsys.psmodel.core.domain.PSSubSysSADetail;
import net.ibizsys.psmodel.core.filter.PSDESADetailFilter;
import net.ibizsys.psmodel.core.service.IPSDESADetailService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDESADetailRTService extends PSModelRTServiceBase<PSDESADetail, PSDESADetailFilter> implements IPSDESADetailService{
    private static final Log log = LogFactory.getLog(PSDESADetailRTService.class);

    @Override
    public PSDESADetail createDomain(){
        return new PSDESADetail();
    }

    @Override
    public PSDESADetailFilter createFilter(){
        return new PSDESADetailFilter();
	}

	@Override
	public PSDESADetail getDomain(Object params) {
		if(params instanceof PSDESADetail) {
			return (PSDESADetail)params;
		}
		return getMapper().convertValue(params, PSDESADetail.class);
	}

	@Override
	public PSDESADetailFilter getFilter(Object params) {
		if(params instanceof PSDESADetailFilter) {
			return (PSDESADetailFilter)params;
		}
		return getMapper().convertValue(params, PSDESADetailFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDESADETAIL";
        }
        else{
            return "PSDESADETAILS";
        }
	}
    
	  @Override
	  protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
	  	return IPSDEServiceAPIMethod.class;
	  }
    
    
    @Override
    protected List<? extends IPSDEServiceAPIMethod> getPSModelObjectList(PSDESADetailFilter f) throws Exception {
    	Object objPSDEServiceAPIId = f.getFieldCond(PSDESADetail.FIELD_PSDESERVICEAPIID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEServiceAPIId)) {
    		objPSDEServiceAPIId = getParentId(f, PSModels.PSDESERVICEAPI);
    	}
    	
    	Object objPSSysServiceAPIId = null;
		if (ObjectUtils.isEmpty(objPSSysServiceAPIId)) {
			objPSSysServiceAPIId = f.getFieldCond(PSDESADetail.FIELD_PSSYSSERVICEAPIID, IPSModelFilter.EQ);
			if (ObjectUtils.isEmpty(objPSSysServiceAPIId)) {
				objPSSysServiceAPIId = getParentId(f, PSModels.PSSYSSERVICEAPI);
			}
		}
		
    	
    	if(ObjectUtils.isEmpty(objPSDEServiceAPIId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSSysServiceAPIs() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSDEServiceAPIMethod> allPSDESADetailList = new ArrayList<IPSDEServiceAPIMethod>();
    		for(IPSSysServiceAPI iPSSysServiceAPI : this.getPSSystemService().getPSSystem().getAllPSSysServiceAPIs()) {
    			
    			if (!ObjectUtils.isEmpty(objPSSysServiceAPIId)) {
					if(!this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSSysServiceAPI).equals(objPSSysServiceAPIId)) {
						continue;
					}
				}
				
    			
    			if(ObjectUtils.isEmpty(iPSSysServiceAPI.getPSDEServiceAPIs())) {
    				continue;
    			}
    			for(IPSDEServiceAPI iPSDEServiceAPI : iPSSysServiceAPI.getPSDEServiceAPIs()) {
    				if(ObjectUtils.isEmpty(iPSDEServiceAPI.getPSDEServiceAPIMethods())) {
        				continue;
        			}
    				allPSDESADetailList.addAll(iPSDEServiceAPI.getPSDEServiceAPIMethods());
    			}
    		}
    		return allPSDESADetailList;
    	}
    	return getPSModelObject(IPSDEServiceAPI.class,
    			
    			getPSModelObject(IPSSysServiceAPI.class, this.getPSSystemService().getPSSystem().getAllPSSysServiceAPIs(), getParentId((String)objPSDEServiceAPIId), false).getPSDEServiceAPIs()			
    			
    			, (String)objPSDEServiceAPIId, false).getPSDEServiceAPIMethods();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	
    	String strPSDEServiceAPIId = getParentId(key);
    	
    	return getPSModelObject(IPSDEServiceAPIMethod.class, 
    				getPSModelObject(IPSDEServiceAPI.class,
    					getPSModelObject(IPSSysServiceAPI.class, this.getPSSystemService().getPSSystem().getAllPSSysServiceAPIs(), getParentId(strPSDEServiceAPIId), false).getPSDEServiceAPIs()			
		    				,strPSDEServiceAPIId, false).getPSDEServiceAPIMethods()
    				,key, tryMode);

    }
    
    @Override
    protected void doFillDomain(PSDESADetail domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	PSDEServiceAPI parentPSModel = (PSDEServiceAPI) this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDESERVICEAPI, getParentId(domain.getId()));
    	domain.setPSDEServiceAPIId(parentPSModel.getId());
    	domain.setPSDEServiceAPIName(parentPSModel.getName());
    	domain.setPSSysServiceAPIId(parentPSModel.getPSSysServiceAPIId());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
   
}
