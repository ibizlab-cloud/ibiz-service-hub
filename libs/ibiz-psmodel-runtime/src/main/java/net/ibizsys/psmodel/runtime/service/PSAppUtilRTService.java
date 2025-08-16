package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.util.IPSAppUtil;
import net.ibizsys.psmodel.core.domain.PSAppUtil;
import net.ibizsys.psmodel.core.filter.PSAppUtilFilter;
import net.ibizsys.psmodel.core.service.IPSAppUtilService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSAppUtilRTService extends PSModelRTServiceBase<PSAppUtil, PSAppUtilFilter> implements IPSAppUtilService{
    private static final Log log = LogFactory.getLog(PSAppUtilRTService.class);

    @Override
    public PSAppUtil createDomain(){
        return new PSAppUtil();
    }

    @Override
    public PSAppUtilFilter createFilter(){
        return new PSAppUtilFilter();
	}

	@Override
	public PSAppUtil getDomain(Object params) {
		if(params instanceof PSAppUtil) {
			return (PSAppUtil)params;
		}
		return getMapper().convertValue(params, PSAppUtil.class);
	}

	@Override
	public PSAppUtilFilter getFilter(Object params) {
		if(params instanceof PSAppUtilFilter) {
			return (PSAppUtilFilter)params;
		}
		return getMapper().convertValue(params, PSAppUtilFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPUTIL";
        }
        else{
            return "PSAPPUTILS";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSAppUtil.class;
    }
    
    @Override
    protected List<? extends IPSAppUtil> getPSModelObjectList(PSAppUtilFilter f) throws Exception {
    	
    	Object objPSSysAppId = f.getFieldCond(PSAppUtil.FIELD_PSSYSAPPID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysAppId)) {
    		objPSSysAppId  = getParentId(f, PSModels.PSSYSAPP);
    		if(ObjectUtils.isEmpty(objPSSysAppId)) {
    			throw new Exception("未指定应用标识");
    		}
    	}
    	return getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)objPSSysAppId, false).getAllPSAppUtils();
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSAppUtil.class
    			,getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)getParentId(key), false).getAllPSAppUtils()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSAppUtil domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAPP, getParentId(domain.getId()));
    	domain.setPSSysAppId(parentPSModel.getId());
    	domain.setPSSysAppName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
