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
import net.ibizsys.psmodel.core.domain.PSSysBICubeLevel;
import net.ibizsys.psmodel.core.domain.PSSysBILevel;
import net.ibizsys.psmodel.core.service.IPSSysBILevelService;
import net.ibizsys.psmodel.core.filter.PSSysBICubeLevelFilter;
import net.ibizsys.psmodel.core.filter.PSSysBILevelFilter;


public class PSSysBILevelRTService extends PSModelRTServiceBase<PSSysBILevel, PSSysBILevelFilter> implements IPSSysBILevelService{
    private static final Log log = LogFactory.getLog(PSSysBILevelRTService.class);

    @Override
    public PSSysBILevel createDomain(){
        return new PSSysBILevel();
    }

    @Override
    public PSSysBILevelFilter createFilter(){
        return new PSSysBILevelFilter();
    }
    

	@Override
	public PSSysBILevel getDomain(Object params) {
		if (params instanceof PSSysBILevel) {
			return (PSSysBILevel) params;
		}
		return getMapper().convertValue(params, PSSysBILevel.class);
	}

	@Override
	public PSSysBILevelFilter getFilter(Object params) {
		if (params instanceof PSSysBILevelFilter) {
			return (PSSysBILevelFilter) params;
		}
		return getMapper().convertValue(params, PSSysBILevelFilter.class);
	}
	

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBILEVEL";
        }
        else{
            return "PSSYSBILEVELS";
        }
	}
}
