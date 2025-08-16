package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.service.IPSSubSysServiceAPI;
import net.ibizsys.model.service.IPSSubSysServiceAPIDE;
import net.ibizsys.model.service.IPSSubSysServiceAPIDEField;
import net.ibizsys.psmodel.core.domain.PSSubSysSADE;
import net.ibizsys.psmodel.core.domain.PSSubSysSADEField;
import net.ibizsys.psmodel.core.filter.PSSubSysSADEFieldFilter;
import net.ibizsys.psmodel.core.service.IPSSubSysSADEFieldService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSubSysSADEFieldRTService extends PSModelRTServiceBase<PSSubSysSADEField, PSSubSysSADEFieldFilter> implements IPSSubSysSADEFieldService{
    private static final Log log = LogFactory.getLog(PSSubSysSADEFieldRTService.class);

    @Override
    public PSSubSysSADEField createDomain(){
        return new PSSubSysSADEField();
    }

    @Override
    public PSSubSysSADEFieldFilter createFilter(){
        return new PSSubSysSADEFieldFilter();
	}

	@Override
	public PSSubSysSADEField getDomain(Object params) {
		if(params instanceof PSSubSysSADEField) {
			return (PSSubSysSADEField)params;
		}
		return getMapper().convertValue(params, PSSubSysSADEField.class);
	}

	@Override
	public PSSubSysSADEFieldFilter getFilter(Object params) {
		if(params instanceof PSSubSysSADEFieldFilter) {
			return (PSSubSysSADEFieldFilter)params;
		}
		return getMapper().convertValue(params, PSSubSysSADEFieldFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSUBSYSSADEFIELD";
        }
        else{
            return "PSSUBSYSSADEFIELDS";
        }
	}
    
    @Override
	protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
		return IPSSubSysServiceAPIDEField.class;
	}

	@Override
	protected List<? extends IPSSubSysServiceAPIDEField> getPSModelObjectList(PSSubSysSADEFieldFilter f) throws Exception {
		Object objPSSubSysServiceAPIDEId = f.getFieldCond(PSSubSysSADEField.FIELD_PSSUBSYSSADEID, IPSModelFilter.EQ);
		if (ObjectUtils.isEmpty(objPSSubSysServiceAPIDEId)) {
			objPSSubSysServiceAPIDEId = getParentId(f, PSModels.PSSUBSYSSADE);
		}
		
		Object objPSSubSysServiceAPIId = null;
		if (ObjectUtils.isEmpty(objPSSubSysServiceAPIDEId)) {
			objPSSubSysServiceAPIId = f.getFieldCond(PSSubSysSADEField.FIELD_PSSUBSYSSERVICEAPIID, IPSModelFilter.EQ);
			if (ObjectUtils.isEmpty(objPSSubSysServiceAPIId)) {
				objPSSubSysServiceAPIId = getParentId(f, PSModels.PSSUBSYSSERVICEAPI);
			}
		}

		if (ObjectUtils.isEmpty(objPSSubSysServiceAPIDEId)) {
			
			if (this.getPSSystemService().getPSSystem().getAllPSSubSysServiceAPIs() == null) {
				return null;
			}
			// 查询全部
			List<IPSSubSysServiceAPIDEField> allPSSubSysSADEFieldList = new ArrayList<IPSSubSysServiceAPIDEField>();
			for (IPSSubSysServiceAPI iPSSubSysServiceAPI : this.getPSSystemService().getPSSystem().getAllPSSubSysServiceAPIs()) {
				
				if (!ObjectUtils.isEmpty(objPSSubSysServiceAPIId)) {
					if(!this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSSubSysServiceAPI).equals(objPSSubSysServiceAPIId)) {
						continue;
					}
				}
				
				
				
				if (ObjectUtils.isEmpty(iPSSubSysServiceAPI.getAllPSSubSysServiceAPIDEs())) {
					continue;
				}
				for (IPSSubSysServiceAPIDE iPSSubSysServiceAPIDE : iPSSubSysServiceAPI.getAllPSSubSysServiceAPIDEs()) {
					if (ObjectUtils.isEmpty(iPSSubSysServiceAPIDE.getPSSubSysServiceAPIDEFields())) {
						continue;
					}
					allPSSubSysSADEFieldList.addAll(iPSSubSysServiceAPIDE.getPSSubSysServiceAPIDEFields());
				}
			}
			return allPSSubSysSADEFieldList;
			
		
		}
		
		return getPSModelObject(IPSSubSysServiceAPIDE.class,

				getPSModelObject(IPSSubSysServiceAPI.class, this.getPSSystemService().getPSSystem().getAllPSSubSysServiceAPIs(), getParentId((String) objPSSubSysServiceAPIDEId), false).getAllPSSubSysServiceAPIDEs()

				, (String) objPSSubSysServiceAPIDEId, false).getPSSubSysServiceAPIDEFields();
	}

	@Override
	protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {

		String strPSSubSysServiceAPIDEId = getParentId(key);

		return getPSModelObject(IPSSubSysServiceAPIDEField.class, getPSModelObject(IPSSubSysServiceAPIDE.class, getPSModelObject(IPSSubSysServiceAPI.class, this.getPSSystemService().getPSSystem().getAllPSSubSysServiceAPIs(), getParentId(strPSSubSysServiceAPIDEId), false).getAllPSSubSysServiceAPIDEs(), strPSSubSysServiceAPIDEId, false).getPSSubSysServiceAPIDEFields(), key, tryMode);

	}

	@Override
	protected void doFillDomain(PSSubSysSADEField domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
		PSSubSysSADE parentPSModel = (PSSubSysSADE)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSUBSYSSADE, getParentId(domain.getId()));
		domain.setPSSubSysSADEId(parentPSModel.getId());
		domain.setPSSubSysSADEName(parentPSModel.getName());
		domain.setPSSubSysServiceAPIId(parentPSModel.getPSSubSysServiceAPIId());
		super.doFillDomain(domain, iPSModelObject, bFullMode);
	}
	
}
