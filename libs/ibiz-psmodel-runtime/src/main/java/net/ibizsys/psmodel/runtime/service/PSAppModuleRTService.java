package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSAppModule;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.psmodel.core.domain.PSAppModule;
import net.ibizsys.psmodel.core.filter.PSAppModuleFilter;
import net.ibizsys.psmodel.core.service.IPSAppModuleService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSAppModuleRTService extends PSModelRTServiceBase<PSAppModule, PSAppModuleFilter> implements IPSAppModuleService{
    private static final Log log = LogFactory.getLog(PSAppModuleRTService.class);

    @Override
    public PSAppModule createDomain(){
        return new PSAppModule();
    }

    @Override
    public PSAppModuleFilter createFilter(){
        return new PSAppModuleFilter();
	}

	@Override
	public PSAppModule getDomain(Object params) {
		if(params instanceof PSAppModule) {
			return (PSAppModule)params;
		}
		return getMapper().convertValue(params, PSAppModule.class);
	}

	@Override
	public PSAppModuleFilter getFilter(Object params) {
		if(params instanceof PSAppModuleFilter) {
			return (PSAppModuleFilter)params;
		}
		return getMapper().convertValue(params, PSAppModuleFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPMODULE";
        }
        else{
            return "PSAPPMODULES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSAppModule.class;
    }
    
    @Override
    protected List<? extends IPSAppModule> getPSModelObjectList(PSAppModuleFilter f) throws Exception {
    	
    	Object objPSSysAppId = f.getFieldCond(PSAppModule.FIELD_PSSYSAPPID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysAppId)) {
    		objPSSysAppId  = getParentId(f, PSModels.PSSYSAPP);
    		if(ObjectUtils.isEmpty(objPSSysAppId)) {
    			throw new Exception("未指定应用标识");
    		}
    	}
    	return getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)objPSSysAppId, false).getAllPSAppModules();
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSAppModule.class
    			,getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)getParentId(key), false).getAllPSAppModules()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSAppModule domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAPP, getParentId(domain.getId()));
    	domain.setPSSysAppId(parentPSModel.getId());
    	domain.setPSSysAppName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
