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
import net.ibizsys.psmodel.core.domain.PSDEMap;
import net.ibizsys.psmodel.core.service.IPSDEMapService;
import net.ibizsys.psmodel.core.filter.PSDEMapFilter;


public class PSDEMapRTService extends PSModelRTServiceBase<PSDEMap, PSDEMapFilter> implements IPSDEMapService{
    private static final Log log = LogFactory.getLog(PSDEMapRTService.class);

    @Override
    public PSDEMap createDomain(){
        return new PSDEMap();
    }

    @Override
    public PSDEMapFilter createFilter(){
        return new PSDEMapFilter();
	}

	@Override
	public PSDEMap getDomain(Object params) {
		if(params instanceof PSDEMap) {
			return (PSDEMap)params;
		}
		return getMapper().convertValue(params, PSDEMap.class);
	}

	@Override
	public PSDEMapFilter getFilter(Object params) {
		if(params instanceof PSDEMapFilter) {
			return (PSDEMapFilter)params;
		}
		return getMapper().convertValue(params, PSDEMapFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEMAP";
        }
        else{
            return "PSDEMAPS";
        }
	}
}
