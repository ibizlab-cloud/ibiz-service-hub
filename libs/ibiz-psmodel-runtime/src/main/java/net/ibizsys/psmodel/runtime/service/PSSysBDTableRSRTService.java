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
import net.ibizsys.psmodel.core.domain.PSSysBDTableRS;
import net.ibizsys.psmodel.core.service.IPSSysBDTableRSService;
import net.ibizsys.psmodel.core.filter.PSSysBDTableRSFilter;


public class PSSysBDTableRSRTService extends PSModelRTServiceBase<PSSysBDTableRS, PSSysBDTableRSFilter> implements IPSSysBDTableRSService{
    private static final Log log = LogFactory.getLog(PSSysBDTableRSRTService.class);

    @Override
    public PSSysBDTableRS createDomain(){
        return new PSSysBDTableRS();
    }

    @Override
    public PSSysBDTableRSFilter createFilter(){
        return new PSSysBDTableRSFilter();
	}

	@Override
	public PSSysBDTableRS getDomain(Object params) {
		if(params instanceof PSSysBDTableRS) {
			return (PSSysBDTableRS)params;
		}
		return getMapper().convertValue(params, PSSysBDTableRS.class);
	}

	@Override
	public PSSysBDTableRSFilter getFilter(Object params) {
		if(params instanceof PSSysBDTableRSFilter) {
			return (PSSysBDTableRSFilter)params;
		}
		return getMapper().convertValue(params, PSSysBDTableRSFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBDTABLERS";
        }
        else{
            return "PSSYSBDTABLERS";
        }
	}
}
