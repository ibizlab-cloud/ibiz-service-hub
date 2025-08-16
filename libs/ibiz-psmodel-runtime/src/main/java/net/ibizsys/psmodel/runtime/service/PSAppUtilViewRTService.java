package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.psmodel.core.domain.PSAppDataEntity;
import net.ibizsys.psmodel.core.domain.PSAppUtilView;
import net.ibizsys.psmodel.core.filter.PSAppUtilViewFilter;
import net.ibizsys.psmodel.core.service.IPSAppUtilViewService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSAppUtilViewRTService extends PSModelRTServiceBase<PSAppUtilView, PSAppUtilViewFilter> implements IPSAppUtilViewService{
    private static final Log log = LogFactory.getLog(PSAppUtilViewRTService.class);

    @Override
    public PSAppUtilView createDomain(){
        return new PSAppUtilView();
    }

    @Override
    public PSAppUtilViewFilter createFilter(){
        return new PSAppUtilViewFilter();
	}

	@Override
	public PSAppUtilView getDomain(Object params) {
		if(params instanceof PSAppUtilView) {
			return (PSAppUtilView)params;
		}
		return getMapper().convertValue(params, PSAppUtilView.class);
	}

	@Override
	public PSAppUtilViewFilter getFilter(Object params) {
		if(params instanceof PSAppUtilViewFilter) {
			return (PSAppUtilViewFilter)params;
		}
		return getMapper().convertValue(params, PSAppUtilViewFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPUTILVIEW";
        }
        else{
            return "PSAPPUTILVIEWS";
      
        
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSAppView.class;
    }
    
    @Override
    protected List<? extends IPSAppView> getPSModelObjectList(PSAppUtilViewFilter f) throws Exception {
    	
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
    protected void doFillDomain(PSAppUtilView domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAPP, getParentId(domain.getId()));
    	domain.setPSSysAppId(parentPSModel.getId());
    	domain.setPSSysAppName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
