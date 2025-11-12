package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.valuerule.IPSSysValueRule;
import net.ibizsys.psmodel.core.domain.PSSysValueRule;
import net.ibizsys.psmodel.core.filter.PSSysValueRuleFilter;
import net.ibizsys.psmodel.core.service.IPSSysValueRuleService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysValueRuleRTService extends PSModelRTServiceBase<PSSysValueRule, PSSysValueRuleFilter> implements IPSSysValueRuleService{
    private static final Log log = LogFactory.getLog(PSSysValueRuleRTService.class);

    @Override
    public PSSysValueRule createDomain(){
        return new PSSysValueRule();
    }

    @Override
    public PSSysValueRuleFilter createFilter(){
        return new PSSysValueRuleFilter();
	}

	@Override
	public PSSysValueRule getDomain(Object params) {
		if(params instanceof PSSysValueRule) {
			return (PSSysValueRule)params;
		}
		return getMapper().convertValue(params, PSSysValueRule.class);
	}

	@Override
	public PSSysValueRuleFilter getFilter(Object params) {
		if(params instanceof PSSysValueRuleFilter) {
			return (PSSysValueRuleFilter)params;
		}
		return getMapper().convertValue(params, PSSysValueRuleFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSVALUERULE";
        }
        else{
            return "PSSYSVALUERULES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysValueRule.class;
    }
    
    @Override
    protected List<? extends IPSSysValueRule> getPSModelObjectList(PSSysValueRuleFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysValueRules();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysValueRule.class, this.getPSSystemService().getPSSystem().getAllPSSysValueRules(), (String)key, tryMode);
    }
    
}
