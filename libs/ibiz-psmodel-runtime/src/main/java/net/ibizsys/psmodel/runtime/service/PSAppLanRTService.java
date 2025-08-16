package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSAppLan;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.psmodel.core.domain.PSAppLan;
import net.ibizsys.psmodel.core.filter.PSAppLanFilter;
import net.ibizsys.psmodel.core.service.IPSAppLanService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSAppLanRTService extends PSModelRTServiceBase<PSAppLan, PSAppLanFilter> implements IPSAppLanService{
    private static final Log log = LogFactory.getLog(PSAppLanRTService.class);

    @Override
    public PSAppLan createDomain(){
        return new PSAppLan();
    }

    @Override
    public PSAppLanFilter createFilter(){
        return new PSAppLanFilter();
	}

	@Override
	public PSAppLan getDomain(Object params) {
		if(params instanceof PSAppLan) {
			return (PSAppLan)params;
		}
		return getMapper().convertValue(params, PSAppLan.class);
	}

	@Override
	public PSAppLanFilter getFilter(Object params) {
		if(params instanceof PSAppLanFilter) {
			return (PSAppLanFilter)params;
		}
		return getMapper().convertValue(params, PSAppLanFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPLAN";
        }
        else{
            return "PSAPPLANS";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSAppLan.class;
    }
    
    @Override
    protected List<? extends IPSAppLan> getPSModelObjectList(PSAppLanFilter f) throws Exception {
    	
    	Object objPSSysAppId = f.getFieldCond(PSAppLan.FIELD_PSSYSAPPID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysAppId)) {
    		objPSSysAppId  = getParentId(f, PSModels.PSSYSAPP);
    		if(ObjectUtils.isEmpty(objPSSysAppId)) {
    			throw new Exception("未指定应用标识");
    		}
    	}
    	return getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)objPSSysAppId, false).getAllPSAppLans();
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSAppLan.class
    			,getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)getParentId(key), false).getAllPSAppLans()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSAppLan domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAPP, getParentId(domain.getId()));
    	domain.setPSSysAppId(parentPSModel.getId());
    	domain.setPSSysAppName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
