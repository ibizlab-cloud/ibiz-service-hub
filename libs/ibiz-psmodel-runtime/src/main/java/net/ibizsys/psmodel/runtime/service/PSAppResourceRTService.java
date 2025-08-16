package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSAppResource;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.psmodel.core.domain.PSAppResource;
import net.ibizsys.psmodel.core.filter.PSAppResourceFilter;
import net.ibizsys.psmodel.core.service.IPSAppResourceService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSAppResourceRTService extends PSModelRTServiceBase<PSAppResource, PSAppResourceFilter> implements IPSAppResourceService{
    private static final Log log = LogFactory.getLog(PSAppResourceRTService.class);

    @Override
    public PSAppResource createDomain(){
        return new PSAppResource();
    }

    @Override
    public PSAppResourceFilter createFilter(){
        return new PSAppResourceFilter();
	}

	@Override
	public PSAppResource getDomain(Object params) {
		if(params instanceof PSAppResource) {
			return (PSAppResource)params;
		}
		return getMapper().convertValue(params, PSAppResource.class);
	}

	@Override
	public PSAppResourceFilter getFilter(Object params) {
		if(params instanceof PSAppResourceFilter) {
			return (PSAppResourceFilter)params;
		}
		return getMapper().convertValue(params, PSAppResourceFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPRESOURCE";
        }
        else{
            return "PSAPPRESOURCES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSAppResource.class;
    }
    
    @Override
    protected List<? extends IPSAppResource> getPSModelObjectList(PSAppResourceFilter f) throws Exception {
    	
    	Object objPSSysAppId = f.getFieldCond(PSAppResource.FIELD_PSSYSAPPID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysAppId)) {
    		objPSSysAppId  = getParentId(f, PSModels.PSSYSAPP);
    		if(ObjectUtils.isEmpty(objPSSysAppId)) {
    			throw new Exception("未指定应用标识");
    		}
    	}
    	return getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)objPSSysAppId, false).getAllPSAppResources();
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSAppResource.class
    			,getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)getParentId(key), false).getAllPSAppResources()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSAppResource domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAPP, getParentId(domain.getId()));
    	domain.setPSSysAppId(parentPSModel.getId());
    	domain.setPSSysAppName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
