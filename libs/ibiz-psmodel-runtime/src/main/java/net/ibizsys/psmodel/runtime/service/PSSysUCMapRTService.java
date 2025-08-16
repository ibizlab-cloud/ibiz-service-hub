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
import net.ibizsys.psmodel.core.domain.PSSysUCMap;
import net.ibizsys.psmodel.core.service.IPSSysUCMapService;
import net.ibizsys.psmodel.core.filter.PSSysUCMapFilter;


public class PSSysUCMapRTService extends PSModelRTServiceBase<PSSysUCMap, PSSysUCMapFilter> implements IPSSysUCMapService{
    private static final Log log = LogFactory.getLog(PSSysUCMapRTService.class);

    @Override
    public PSSysUCMap createDomain(){
        return new PSSysUCMap();
    }

    @Override
    public PSSysUCMapFilter createFilter(){
        return new PSSysUCMapFilter();
	}

	@Override
	public PSSysUCMap getDomain(Object params) {
		if(params instanceof PSSysUCMap) {
			return (PSSysUCMap)params;
		}
		return getMapper().convertValue(params, PSSysUCMap.class);
	}

	@Override
	public PSSysUCMapFilter getFilter(Object params) {
		if(params instanceof PSSysUCMapFilter) {
			return (PSSysUCMapFilter)params;
		}
		return getMapper().convertValue(params, PSSysUCMapFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSUCMAP";
        }
        else{
            return "PSSYSUCMAPS";
        }
	}
}
