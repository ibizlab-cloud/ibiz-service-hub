package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.control.IPSAppPortlet;
import net.ibizsys.psmodel.core.domain.PSAppPortlet;
import net.ibizsys.psmodel.core.filter.PSAppPortletFilter;
import net.ibizsys.psmodel.core.service.IPSAppPortletService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSAppPortletRTService extends PSModelRTServiceBase<PSAppPortlet, PSAppPortletFilter> implements IPSAppPortletService{
    private static final Log log = LogFactory.getLog(PSAppPortletRTService.class);

    @Override
    public PSAppPortlet createDomain(){
        return new PSAppPortlet();
    }

    @Override
    public PSAppPortletFilter createFilter(){
        return new PSAppPortletFilter();
	}

	@Override
	public PSAppPortlet getDomain(Object params) {
		if(params instanceof PSAppPortlet) {
			return (PSAppPortlet)params;
		}
		return getMapper().convertValue(params, PSAppPortlet.class);
	}

	@Override
	public PSAppPortletFilter getFilter(Object params) {
		if(params instanceof PSAppPortletFilter) {
			return (PSAppPortletFilter)params;
		}
		return getMapper().convertValue(params, PSAppPortletFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPPORTLET";
        }
        else{
            return "PSAPPPORTLETS";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSAppPortlet.class;
    }
    
    @Override
    protected List<? extends IPSAppPortlet> getPSModelObjectList(PSAppPortletFilter f) throws Exception {
    	
    	Object objPSSysAppId = f.getFieldCond(PSAppPortlet.FIELD_PSSYSAPPID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysAppId)) {
    		objPSSysAppId  = getParentId(f, PSModels.PSSYSAPP);
    		if(ObjectUtils.isEmpty(objPSSysAppId)) {
    			throw new Exception("未指定应用标识");
    		}
    	}
    	return getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)objPSSysAppId, false).getAllPSAppPortlets();
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSAppPortlet.class
    			,getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)getParentId(key), false).getAllPSAppPortlets()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSAppPortlet domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAPP, getParentId(domain.getId()));
    	
    	domain.setPSSysAppId(parentPSModel.getId());
    	domain.setPSSysAppName(parentPSModel.getName());
    	
    	
    	if(StringUtils.hasLength(domain.getPSAppLocalDEId())
    			&& !StringUtils.hasLength(domain.getPSAppDataEntityId())){
    		domain.setPSAppDataEntityId(domain.getPSAppLocalDEId());
    		domain.setPSAppDataEntityName(domain.getPSAppLocalDEName());
    	}
    	
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
