package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSAppPkg;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.psmodel.core.domain.PSAppPkg;
import net.ibizsys.psmodel.core.filter.PSAppPkgFilter;
import net.ibizsys.psmodel.core.service.IPSAppPkgService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSAppPkgRTService extends PSModelRTServiceBase<PSAppPkg, PSAppPkgFilter> implements IPSAppPkgService{
    private static final Log log = LogFactory.getLog(PSAppPkgRTService.class);

    @Override
    public PSAppPkg createDomain(){
        return new PSAppPkg();
    }

    @Override
    public PSAppPkgFilter createFilter(){
        return new PSAppPkgFilter();
	}

	@Override
	public PSAppPkg getDomain(Object params) {
		if(params instanceof PSAppPkg) {
			return (PSAppPkg)params;
		}
		return getMapper().convertValue(params, PSAppPkg.class);
	}

	@Override
	public PSAppPkgFilter getFilter(Object params) {
		if(params instanceof PSAppPkgFilter) {
			return (PSAppPkgFilter)params;
		}
		return getMapper().convertValue(params, PSAppPkgFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPPKG";
        }
        else{
            return "PSAPPPKGS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSAppPkg.class;
    }
    
    @Override
    protected List<? extends IPSAppPkg> getPSModelObjectList(PSAppPkgFilter f) throws Exception {
    	
    	Object objPSSysAppId = f.getFieldCond(PSAppPkg.FIELD_PSSYSAPPID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysAppId)) {
    		objPSSysAppId  = getParentId(f, PSModels.PSSYSAPP);
    		if(ObjectUtils.isEmpty(objPSSysAppId)) {
    			throw new Exception("未指定应用标识");
    		}
    	}
    	return getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)objPSSysAppId, false).getAllPSAppPkgs();
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSAppPkg.class
    			,getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)getParentId(key), false).getAllPSAppPkgs()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSAppPkg domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAPP, getParentId(domain.getId()));
    	domain.setPSSysAppId(parentPSModel.getId());
    	domain.setPSSysAppName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
