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
import net.ibizsys.psmodel.core.domain.PSSysBIHierarchy;
import net.ibizsys.psmodel.core.service.IPSSysBIHierarchyService;
import net.ibizsys.psmodel.core.filter.PSSysBICubeLevelFilter;
import net.ibizsys.psmodel.core.filter.PSSysBIHierarchyFilter;


public class PSSysBIHierarchyRTService extends PSModelRTServiceBase<PSSysBIHierarchy, PSSysBIHierarchyFilter> implements IPSSysBIHierarchyService{
    private static final Log log = LogFactory.getLog(PSSysBIHierarchyRTService.class);

    @Override
    public PSSysBIHierarchy createDomain(){
        return new PSSysBIHierarchy();
    }

    @Override
    public PSSysBIHierarchyFilter createFilter(){
        return new PSSysBIHierarchyFilter();
    }
    

	@Override
	public PSSysBIHierarchy getDomain(Object params) {
		if (params instanceof PSSysBIHierarchy) {
			return (PSSysBIHierarchy) params;
		}
		return getMapper().convertValue(params, PSSysBIHierarchy.class);
	}

	@Override
	public PSSysBIHierarchyFilter getFilter(Object params) {
		if (params instanceof PSSysBIHierarchyFilter) {
			return (PSSysBIHierarchyFilter) params;
		}
		return getMapper().convertValue(params, PSSysBIHierarchyFilter.class);
	}
	

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBIHIERARCHY";
        }
        else{
            return "PSSYSBIHIERARCHIES";
        }
	}
}
