package net.ibizsys.psmodel.runtime.service;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;
import org.springframework.util.ObjectUtils;

import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModelFilter;
import net.ibizsys.psmodel.core.util.IPSModelService;
import net.ibizsys.psmodel.core.util.PSModelServiceFactory;
import net.ibizsys.psmodel.core.util.PSModelServiceSession;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.IPSModelRTService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;
import net.ibizsys.psmodel.core.domain.PSSysCounterItem;
import net.ibizsys.psmodel.core.service.IPSSysCounterItemService;
import net.ibizsys.psmodel.core.filter.PSSysCounterItemFilter;


public class PSSysCounterItemRTService extends PSModelRTServiceBase<PSSysCounterItem, PSSysCounterItemFilter> implements IPSSysCounterItemService{
    private static final Log log = LogFactory.getLog(PSSysCounterItemRTService.class);

    @Override
    public PSSysCounterItem createDomain(){
        return new PSSysCounterItem();
    }

    @Override
    public PSSysCounterItemFilter createFilter(){
        return new PSSysCounterItemFilter();
	}

	@Override
	public PSSysCounterItem getDomain(Object params) {
		if(params instanceof PSSysCounterItem) {
			return (PSSysCounterItem)params;
		}
		return getMapper().convertValue(params, PSSysCounterItem.class);
	}

	@Override
	public PSSysCounterItemFilter getFilter(Object params) {
		if(params instanceof PSSysCounterItemFilter) {
			return (PSSysCounterItemFilter)params;
		}
		return getMapper().convertValue(params, PSSysCounterItemFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSCOUNTERITEM";
        }
        else{
            return "PSSYSCOUNTERITEMS";
        }
	}
}
