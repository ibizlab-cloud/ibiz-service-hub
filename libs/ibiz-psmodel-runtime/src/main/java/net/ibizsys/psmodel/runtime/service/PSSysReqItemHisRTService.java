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
import net.ibizsys.psmodel.core.domain.PSSysReqItemHis;
import net.ibizsys.psmodel.core.service.IPSSysReqItemHisService;
import net.ibizsys.psmodel.core.filter.PSSysReqItemHisFilter;


public class PSSysReqItemHisRTService extends PSModelRTServiceBase<PSSysReqItemHis, PSSysReqItemHisFilter> implements IPSSysReqItemHisService{
    private static final Log log = LogFactory.getLog(PSSysReqItemHisRTService.class);

    @Override
    public PSSysReqItemHis createDomain(){
        return new PSSysReqItemHis();
    }

    @Override
    public PSSysReqItemHisFilter createFilter(){
        return new PSSysReqItemHisFilter();
	}

	@Override
	public PSSysReqItemHis getDomain(Object params) {
		if(params instanceof PSSysReqItemHis) {
			return (PSSysReqItemHis)params;
		}
		return getMapper().convertValue(params, PSSysReqItemHis.class);
	}

	@Override
	public PSSysReqItemHisFilter getFilter(Object params) {
		if(params instanceof PSSysReqItemHisFilter) {
			return (PSSysReqItemHisFilter)params;
		}
		return getMapper().convertValue(params, PSSysReqItemHisFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSREQITEMHIS";
        }
        else{
            return "PSSYSREQITEMHIS";
        }
	}
}
