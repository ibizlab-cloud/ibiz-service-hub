package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSAppLogic;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.psmodel.core.domain.PSAppLogic;
import net.ibizsys.psmodel.core.filter.PSAppLogicFilter;
import net.ibizsys.psmodel.core.service.IPSAppLogicService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSAppLogicRTService extends PSModelRTServiceBase<PSAppLogic, PSAppLogicFilter> implements IPSAppLogicService{
    private static final Log log = LogFactory.getLog(PSAppLogicRTService.class);

    @Override
    public PSAppLogic createDomain(){
        return new PSAppLogic();
    }

    @Override
    public PSAppLogicFilter createFilter(){
        return new PSAppLogicFilter();
	}

	@Override
	public PSAppLogic getDomain(Object params) {
		if(params instanceof PSAppLogic) {
			return (PSAppLogic)params;
		}
		return getMapper().convertValue(params, PSAppLogic.class);
	}

	@Override
	public PSAppLogicFilter getFilter(Object params) {
		if(params instanceof PSAppLogicFilter) {
			return (PSAppLogicFilter)params;
		}
		return getMapper().convertValue(params, PSAppLogicFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPLOGIC";
        }
        else{
            return "PSAPPLOGICS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSAppLogic.class;
    }
    
    @Override
    protected List<? extends IPSAppLogic> getPSModelObjectList(PSAppLogicFilter f) throws Exception {
    	
    	Object objPSSysAppId = f.getFieldCond(PSAppLogic.FIELD_PSSYSAPPID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysAppId)) {
    		objPSSysAppId  = getParentId(f, PSModels.PSSYSAPP);
    		if(ObjectUtils.isEmpty(objPSSysAppId)) {
    			throw new Exception("未指定应用标识");
    		}
    	}
    	return getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)objPSSysAppId, false).getAllPSAppLogics();
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSAppLogic.class
    			,getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)getParentId(key), false).getAllPSAppLogics()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSAppLogic domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAPP, getParentId(domain.getId()));
    	domain.setPSSysAppId(parentPSModel.getId());
    	domain.setPSSysAppName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
