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
import net.ibizsys.psmodel.core.domain.PSSysBDModule;
import net.ibizsys.psmodel.core.service.IPSSysBDModuleService;
import net.ibizsys.psmodel.core.filter.PSSysBDModuleFilter;


public class PSSysBDModuleRTService extends PSModelRTServiceBase<PSSysBDModule, PSSysBDModuleFilter> implements IPSSysBDModuleService{
    private static final Log log = LogFactory.getLog(PSSysBDModuleRTService.class);

    @Override
    public PSSysBDModule createDomain(){
        return new PSSysBDModule();
    }

    @Override
    public PSSysBDModuleFilter createFilter(){
        return new PSSysBDModuleFilter();
	}

	@Override
	public PSSysBDModule getDomain(Object params) {
		if(params instanceof PSSysBDModule) {
			return (PSSysBDModule)params;
		}
		return getMapper().convertValue(params, PSSysBDModule.class);
	}

	@Override
	public PSSysBDModuleFilter getFilter(Object params) {
		if(params instanceof PSSysBDModuleFilter) {
			return (PSSysBDModuleFilter)params;
		}
		return getMapper().convertValue(params, PSSysBDModuleFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBDMODULE";
        }
        else{
            return "PSSYSBDMODULES";
        }
	}
}
