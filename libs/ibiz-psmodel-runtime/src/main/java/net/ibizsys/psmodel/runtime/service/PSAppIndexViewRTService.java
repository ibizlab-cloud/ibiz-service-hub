package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.psmodel.core.domain.PSAppDataEntity;
import net.ibizsys.psmodel.core.domain.PSAppIndexView;
import net.ibizsys.psmodel.core.filter.PSAppIndexViewFilter;
import net.ibizsys.psmodel.core.service.IPSAppIndexViewService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSAppIndexViewRTService extends PSModelRTServiceBase<PSAppIndexView, PSAppIndexViewFilter> implements IPSAppIndexViewService{
    private static final Log log = LogFactory.getLog(PSAppIndexViewRTService.class);

    @Override
    public PSAppIndexView createDomain(){
        return new PSAppIndexView();
    }

    @Override
    public PSAppIndexViewFilter createFilter(){
        return new PSAppIndexViewFilter();
	}

	@Override
	public PSAppIndexView getDomain(Object params) {
		if(params instanceof PSAppIndexView) {
			return (PSAppIndexView)params;
		}
		return getMapper().convertValue(params, PSAppIndexView.class);
	}

	@Override
	public PSAppIndexViewFilter getFilter(Object params) {
		if(params instanceof PSAppIndexViewFilter) {
			return (PSAppIndexViewFilter)params;
		}
		return getMapper().convertValue(params, PSAppIndexViewFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPINDEXVIEW";
        }
        else{
            return "PSAPPINDEXVIEWS";
        }
	}
    
    
  
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSAppView.class;
    }
    
    @Override
    protected List<? extends IPSAppView> getPSModelObjectList(PSAppIndexViewFilter f) throws Exception {
    	
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
    protected void doFillDomain(PSAppIndexView domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAPP, getParentId(domain.getId()));
    	domain.setPSSysAppId(parentPSModel.getId());
    	domain.setPSSysAppName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
}
