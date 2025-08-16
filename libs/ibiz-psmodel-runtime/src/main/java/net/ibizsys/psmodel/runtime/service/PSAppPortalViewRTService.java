package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.psmodel.core.domain.PSAppDataEntity;
import net.ibizsys.psmodel.core.domain.PSAppPortalView;
import net.ibizsys.psmodel.core.filter.PSAppPortalViewFilter;
import net.ibizsys.psmodel.core.service.IPSAppPortalViewService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSAppPortalViewRTService extends PSModelRTServiceBase<PSAppPortalView, PSAppPortalViewFilter> implements IPSAppPortalViewService{
    private static final Log log = LogFactory.getLog(PSAppPortalViewRTService.class);

    @Override
    public PSAppPortalView createDomain(){
        return new PSAppPortalView();
    }

    @Override
    public PSAppPortalViewFilter createFilter(){
        return new PSAppPortalViewFilter();
	}

	@Override
	public PSAppPortalView getDomain(Object params) {
		if(params instanceof PSAppPortalView) {
			return (PSAppPortalView)params;
		}
		return getMapper().convertValue(params, PSAppPortalView.class);
	}

	@Override
	public PSAppPortalViewFilter getFilter(Object params) {
		if(params instanceof PSAppPortalViewFilter) {
			return (PSAppPortalViewFilter)params;
		}
		return getMapper().convertValue(params, PSAppPortalViewFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPPORTALVIEW";
        }
        else{
            return "PSAPPPORTALVIEWS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSAppView.class;
    }
    
    @Override
    protected List<? extends IPSAppView> getPSModelObjectList(PSAppPortalViewFilter f) throws Exception {
    	
    	Object objPSSysAppId = f.getFieldCond(PSAppDataEntity.FIELD_PSSYSAPPID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysAppId)) {
    		objPSSysAppId  = getParentId(f, PSModels.PSSYSAPP);
    		if(ObjectUtils.isEmpty(objPSSysAppId)) {
    			throw new Exception("未指定应用标识");
    		}
    	}
    	return getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)objPSSysAppId, false).getAllPSAppViews();
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSAppView.class
    			,getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)getParentId(key), false).getAllPSAppViews()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSAppPortalView domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAPP, getParentId(domain.getId()));
    	domain.setPSSysAppId(parentPSModel.getId());
    	domain.setPSSysAppName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
