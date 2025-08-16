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
import net.ibizsys.psmodel.core.domain.PSSysBDColSet;
import net.ibizsys.psmodel.core.service.IPSSysBDColSetService;
import net.ibizsys.psmodel.core.filter.PSSysBDColSetFilter;


public class PSSysBDColSetRTService extends PSModelRTServiceBase<PSSysBDColSet, PSSysBDColSetFilter> implements IPSSysBDColSetService{
    private static final Log log = LogFactory.getLog(PSSysBDColSetRTService.class);

    @Override
    public PSSysBDColSet createDomain(){
        return new PSSysBDColSet();
    }

    @Override
    public PSSysBDColSetFilter createFilter(){
        return new PSSysBDColSetFilter();
	}

	@Override
	public PSSysBDColSet getDomain(Object params) {
		if(params instanceof PSSysBDColSet) {
			return (PSSysBDColSet)params;
		}
		return getMapper().convertValue(params, PSSysBDColSet.class);
	}

	@Override
	public PSSysBDColSetFilter getFilter(Object params) {
		if(params instanceof PSSysBDColSetFilter) {
			return (PSSysBDColSetFilter)params;
		}
		return getMapper().convertValue(params, PSSysBDColSetFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBDCOLSET";
        }
        else{
            return "PSSYSBDCOLSETS";
        }
	}
}
