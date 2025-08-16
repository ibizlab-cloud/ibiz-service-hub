package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.psmodel.core.domain.PSAppDataEntity;
import net.ibizsys.psmodel.core.domain.PSDEAction;
import net.ibizsys.psmodel.core.filter.PSAppDataEntityFilter;
import net.ibizsys.psmodel.core.service.IPSAppDataEntityService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSAppDataEntityRTService extends PSModelRTServiceBase<PSAppDataEntity, PSAppDataEntityFilter> implements IPSAppDataEntityService{
    private static final Log log = LogFactory.getLog(PSAppDataEntityRTService.class);

    @Override
    public PSAppDataEntity createDomain(){
        return new PSAppDataEntity();
    }

    @Override
    public PSAppDataEntityFilter createFilter(){
        return new PSAppDataEntityFilter();
	}

	@Override
	public PSAppDataEntity getDomain(Object params) {
		if(params instanceof PSAppDataEntity) {
			return (PSAppDataEntity)params;
		}
		return getMapper().convertValue(params, PSAppDataEntity.class);
	}

	@Override
	public PSAppDataEntityFilter getFilter(Object params) {
		if(params instanceof PSAppDataEntityFilter) {
			return (PSAppDataEntityFilter)params;
		}
		return getMapper().convertValue(params, PSAppDataEntityFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPDATAENTITY";
        }
        else{
            return "PSAPPDATAENTITIES";
        }
	}

    @Override
    protected String getOriginModelName() {
        return "PSAPPLOCALDE";
    }
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSAppDataEntity.class;
    }
    
    @Override
    protected List<? extends IPSAppDataEntity> getPSModelObjectList(PSAppDataEntityFilter f) throws Exception {
    	
    	Object objPSSysAppId = f.getFieldCond(PSAppDataEntity.FIELD_PSSYSAPPID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysAppId)) {
    		objPSSysAppId  = getParentId(f, PSModels.PSSYSAPP);
    		if(ObjectUtils.isEmpty(objPSSysAppId)) {
    			throw new Exception("未指定应用标识");
    		}
    	}
    	return getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)objPSSysAppId, false).getAllPSAppDataEntities();
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSAppDataEntity.class
    			,getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)getParentId(key), false).getAllPSAppDataEntities()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSAppDataEntity domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAPP, getParentId(domain.getId()));
    	domain.setPSSysAppId(parentPSModel.getId());
    	domain.setPSSysAppName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
