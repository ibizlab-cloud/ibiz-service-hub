package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule;
import net.ibizsys.psmodel.core.domain.PSDEFValueRule;
import net.ibizsys.psmodel.core.domain.PSDEField;
import net.ibizsys.psmodel.core.filter.PSDEFValueRuleFilter;
import net.ibizsys.psmodel.core.service.IPSDEFValueRuleService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEFValueRuleRTService extends PSModelRTServiceBase<PSDEFValueRule, PSDEFValueRuleFilter> implements IPSDEFValueRuleService{
    private static final Log log = LogFactory.getLog(PSDEFValueRuleRTService.class);

    @Override
    public PSDEFValueRule createDomain(){
        return new PSDEFValueRule();
    }

    @Override
    public PSDEFValueRuleFilter createFilter(){
        return new PSDEFValueRuleFilter();
	}

	@Override
	public PSDEFValueRule getDomain(Object params) {
		if(params instanceof PSDEFValueRule) {
			return (PSDEFValueRule)params;
		}
		return getMapper().convertValue(params, PSDEFValueRule.class);
	}

	@Override
	public PSDEFValueRuleFilter getFilter(Object params) {
		if(params instanceof PSDEFValueRuleFilter) {
			return (PSDEFValueRuleFilter)params;
		}
		return getMapper().convertValue(params, PSDEFValueRuleFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEFVALUERULE";
        }
        else{
            return "PSDEFVALUERULES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEFValueRule.class;
    }
    
    @Override
    protected List<? extends IPSDEFValueRule> getPSModelObjectList(PSDEFValueRuleFilter f) throws Exception {
    	Object objPSDEFieldId = f.getFieldCond(PSDEFValueRule.FIELD_PSDEFID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEFieldId)) {
    		objPSDEFieldId = getParentId(f, PSModels.PSDEFIELD);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSDEFieldId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSDataEntities() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSDEFValueRule> allPSDEFValueRuleList = new ArrayList<IPSDEFValueRule>();
    		for(IPSDataEntity iPSDataEntity : this.getPSSystemService().getPSSystem().getAllPSDataEntities()) {
    			if(iPSDataEntity.getAllPSDEFields() != null) {
    				for(IPSDEField iPSDEField : iPSDataEntity.getAllPSDEFields()) {
    					allPSDEFValueRuleList.addAll(iPSDEField.getAllPSDEFValueRules());
    				}
    				
    			}
    		}
    		return allPSDEFValueRuleList;
    	}
    	
    	String strPSDEId = getParentId((String)objPSDEFieldId);
    	IPSDEField iPSDEField = getPSModelObject(IPSDEField.class, 
    			getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), strPSDEId, false).getAllPSDEFields(),
    			(String)objPSDEFieldId, false);
    	
    	return iPSDEField.getAllPSDEFValueRules();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	
    	String strPSDEFieldId = getParentId(key);
    	String strPSDEId = getParentId(strPSDEFieldId);
    	
    	IPSDEField iPSDEField = getPSModelObject(IPSDEField.class, 
    			getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), strPSDEId, false).getAllPSDEFields(),
    			strPSDEFieldId, false);
    
    	return getPSModelObject(IPSDEFValueRule.class
    			,iPSDEField.getAllPSDEFValueRules()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEFValueRule domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	PSDEField parentPSModel = (PSDEField) this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDEFIELD, getParentId(domain.getId()));
    	domain.setPSDEFId(parentPSModel.getId());
    	domain.setPSDEFName(parentPSModel.getName());
    	domain.setPSDEId(parentPSModel.getPSDEId());
    	domain.setPSDEName(parentPSModel.getPSDEName());
    	
    
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
