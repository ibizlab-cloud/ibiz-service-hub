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
import net.ibizsys.psmodel.core.domain.PSSysBDInstCfg;
import net.ibizsys.psmodel.core.service.IPSSysBDInstCfgService;
import net.ibizsys.psmodel.core.filter.PSSysBDInstCfgFilter;


public class PSSysBDInstCfgRTService extends PSModelRTServiceBase<PSSysBDInstCfg, PSSysBDInstCfgFilter> implements IPSSysBDInstCfgService{
    private static final Log log = LogFactory.getLog(PSSysBDInstCfgRTService.class);

    @Override
    public PSSysBDInstCfg createDomain(){
        return new PSSysBDInstCfg();
    }

    @Override
    public PSSysBDInstCfgFilter createFilter(){
        return new PSSysBDInstCfgFilter();
	}

	@Override
	public PSSysBDInstCfg getDomain(Object params) {
		if(params instanceof PSSysBDInstCfg) {
			return (PSSysBDInstCfg)params;
		}
		return getMapper().convertValue(params, PSSysBDInstCfg.class);
	}

	@Override
	public PSSysBDInstCfgFilter getFilter(Object params) {
		if(params instanceof PSSysBDInstCfgFilter) {
			return (PSSysBDInstCfgFilter)params;
		}
		return getMapper().convertValue(params, PSSysBDInstCfgFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBDINSTCFG";
        }
        else{
            return "PSSYSBDINSTCFGS";
        }
	}
}
