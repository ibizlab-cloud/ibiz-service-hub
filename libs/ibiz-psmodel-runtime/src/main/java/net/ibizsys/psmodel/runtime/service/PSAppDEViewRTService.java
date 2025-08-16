package net.ibizsys.psmodel.runtime.service;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;
import org.springframework.util.ObjectUtils;

import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModelFilter;
import net.ibizsys.psmodel.core.util.IPSModelService;
import net.ibizsys.psmodel.core.util.PSModelServiceFactory;
import net.ibizsys.psmodel.core.util.PSModelServiceSession;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.IPSModelRTService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.psmodel.core.domain.PSAppDEView;
import net.ibizsys.psmodel.core.domain.PSAppDataEntity;
import net.ibizsys.psmodel.core.domain.PSAppIndexView;
import net.ibizsys.psmodel.core.service.IPSAppDEViewService;
import net.ibizsys.psmodel.core.filter.PSAppDEViewFilter;
import net.ibizsys.psmodel.core.filter.PSAppIndexViewFilter;


public class PSAppDEViewRTService extends PSModelRTServiceBase<PSAppDEView, PSAppDEViewFilter> implements IPSAppDEViewService{
    private static final Log log = LogFactory.getLog(PSAppDEViewRTService.class);

    @Override
    public PSAppDEView createDomain(){
        return new PSAppDEView();
    }

    @Override
    public PSAppDEViewFilter createFilter(){
        return new PSAppDEViewFilter();
	}

	@Override
	public PSAppDEView getDomain(Object params) {
		if(params instanceof PSAppDEView) {
			return (PSAppDEView)params;
		}
		return getMapper().convertValue(params, PSAppDEView.class);
	}

	@Override
	public PSAppDEViewFilter getFilter(Object params) {
		if(params instanceof PSAppDEViewFilter) {
			return (PSAppDEViewFilter)params;
		}
		return getMapper().convertValue(params, PSAppDEViewFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPDEVIEW";
        }
        else{
            return "PSAPPDEVIEWS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSAppView.class;
    }
    
    @Override
    protected List<? extends IPSAppView> getPSModelObjectList(PSAppDEViewFilter f) throws Exception {
    	
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
    protected void doFillDomain(PSAppDEView domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAPP, getParentId(domain.getId()));
    	domain.setPSSysAppId(parentPSModel.getId());
    	domain.setPSSysAppName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
