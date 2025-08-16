package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.psmodel.core.domain.PSAppDataEntity;
import net.ibizsys.psmodel.core.domain.PSAppView;
import net.ibizsys.psmodel.core.filter.PSAppViewFilter;
import net.ibizsys.psmodel.core.service.IPSAppViewService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSAppViewRTService extends PSModelRTServiceBase<PSAppView, PSAppViewFilter> implements IPSAppViewService<PSAppView, PSAppViewFilter>{
    private static final Log log = LogFactory.getLog(PSAppViewRTService.class);

    @Override
    public PSAppView createDomain(){
       // return new PSAppDEView();
    	return null;
    }

    @Override
    public PSAppViewFilter createFilter(){
        return new PSAppViewFilter();
	}

	@Override
	public PSAppView getDomain(Object params) {
		if(params instanceof PSAppView) {
			return (PSAppView)params;
		}
		return getMapper().convertValue(params, PSAppView.class);
	}

	@Override
	public PSAppViewFilter getFilter(Object params) {
		if(params instanceof PSAppViewFilter) {
			return (PSAppViewFilter)params;
		}
		return getMapper().convertValue(params, PSAppViewFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPVIEW";
        }
        else{
            return "PSAPPVIEWS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSAppView.class;
    }
    
    @Override
    protected List<? extends IPSAppView> getPSModelObjectList(PSAppViewFilter f) throws Exception {
    	
    	Object objPSSysAppId = f.getFieldCond(PSAppDataEntity.FIELD_PSSYSAPPID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysAppId)) {
    		objPSSysAppId  = getParentId(f, PSModels.PSSYSAPP);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSSysAppId)) {
    		List<IPSAppView> allPSAppViewList = new ArrayList<IPSAppView>();
    		if(!ObjectUtils.isEmpty(this.getPSSystemService().getPSSystem().getAllPSApps())) {
    			for(IPSApplication iPSApplication : this.getPSSystemService().getPSSystem().getAllPSApps()) {
    				if(iPSApplication.getAllPSAppViews()==null) {
    					continue;
    				}
    				
    				allPSAppViewList.addAll(iPSApplication.getAllPSAppViews());
    			}
    		}
    		return allPSAppViewList;
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
    protected void doFillDomain(PSAppView domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAPP, getParentId(domain.getId()));
    	domain.setPSSysAppId(parentPSModel.getId());
    	domain.setPSSysAppName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
