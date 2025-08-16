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
import net.ibizsys.psmodel.core.domain.PSSysReqItem;
import net.ibizsys.psmodel.core.service.IPSSysReqItemService;
import net.ibizsys.psmodel.core.filter.PSSysReqItemFilter;


public class PSSysReqItemRTService extends PSModelRTServiceBase<PSSysReqItem, PSSysReqItemFilter> implements IPSSysReqItemService{
    private static final Log log = LogFactory.getLog(PSSysReqItemRTService.class);

    @Override
    public PSSysReqItem createDomain(){
        return new PSSysReqItem();
    }

    @Override
    public PSSysReqItemFilter createFilter(){
        return new PSSysReqItemFilter();
	}

	@Override
	public PSSysReqItem getDomain(Object params) {
		if(params instanceof PSSysReqItem) {
			return (PSSysReqItem)params;
		}
		return getMapper().convertValue(params, PSSysReqItem.class);
	}

	@Override
	public PSSysReqItemFilter getFilter(Object params) {
		if(params instanceof PSSysReqItemFilter) {
			return (PSSysReqItemFilter)params;
		}
		return getMapper().convertValue(params, PSSysReqItemFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSREQITEM";
        }
        else{
            return "PSSYSREQITEMS";
        }
	}
}
