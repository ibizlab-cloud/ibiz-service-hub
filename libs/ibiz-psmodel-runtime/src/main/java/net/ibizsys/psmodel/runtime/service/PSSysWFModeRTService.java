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
import net.ibizsys.psmodel.core.domain.PSSysWFMode;
import net.ibizsys.psmodel.core.service.IPSSysWFModeService;
import net.ibizsys.psmodel.core.filter.PSSysWFModeFilter;


public class PSSysWFModeRTService extends PSModelRTServiceBase<PSSysWFMode, PSSysWFModeFilter> implements IPSSysWFModeService{
    private static final Log log = LogFactory.getLog(PSSysWFModeRTService.class);

    @Override
    public PSSysWFMode createDomain(){
        return new PSSysWFMode();
    }

    @Override
    public PSSysWFModeFilter createFilter(){
        return new PSSysWFModeFilter();
	}

	@Override
	public PSSysWFMode getDomain(Object params) {
		if(params instanceof PSSysWFMode) {
			return (PSSysWFMode)params;
		}
		return getMapper().convertValue(params, PSSysWFMode.class);
	}

	@Override
	public PSSysWFModeFilter getFilter(Object params) {
		if(params instanceof PSSysWFModeFilter) {
			return (PSSysWFModeFilter)params;
		}
		return getMapper().convertValue(params, PSSysWFModeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSWFMODE";
        }
        else{
            return "PSSYSWFMODES";
        }
	}
}
