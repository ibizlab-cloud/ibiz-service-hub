package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.func.IPSAppFunc;
import net.ibizsys.psmodel.core.domain.PSAppFunc;
import net.ibizsys.psmodel.core.filter.PSAppFuncFilter;
import net.ibizsys.psmodel.core.service.IPSAppFuncService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSAppFuncRTService extends PSModelRTServiceBase<PSAppFunc, PSAppFuncFilter> implements IPSAppFuncService{
    private static final Log log = LogFactory.getLog(PSAppFuncRTService.class);

    @Override
    public PSAppFunc createDomain(){
        return new PSAppFunc();
    }

    @Override
    public PSAppFuncFilter createFilter(){
        return new PSAppFuncFilter();
	}

	@Override
	public PSAppFunc getDomain(Object params) {
		if(params instanceof PSAppFunc) {
			return (PSAppFunc)params;
		}
		return getMapper().convertValue(params, PSAppFunc.class);
	}

	@Override
	public PSAppFuncFilter getFilter(Object params) {
		if(params instanceof PSAppFuncFilter) {
			return (PSAppFuncFilter)params;
		}
		return getMapper().convertValue(params, PSAppFuncFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPFUNC";
        }
        else{
            return "PSAPPFUNCS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSAppFunc.class;
    }
    
    @Override
    protected List<? extends IPSAppFunc> getPSModelObjectList(PSAppFuncFilter f) throws Exception {
    	
    	Object objPSSysAppId = f.getFieldCond(PSAppFunc.FIELD_PSSYSAPPID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysAppId)) {
    		objPSSysAppId  = getParentId(f, PSModels.PSSYSAPP);
    		if(ObjectUtils.isEmpty(objPSSysAppId)) {
    			throw new Exception("未指定应用标识");
    		}
    	}
    	return getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)objPSSysAppId, false).getAllPSAppFuncs();
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSAppFunc.class
    			,getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)getParentId(key), false).getAllPSAppFuncs()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSAppFunc domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAPP, getParentId(domain.getId()));
    	domain.setPSSysAppId(parentPSModel.getId());
    	domain.setPSSysAppName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
