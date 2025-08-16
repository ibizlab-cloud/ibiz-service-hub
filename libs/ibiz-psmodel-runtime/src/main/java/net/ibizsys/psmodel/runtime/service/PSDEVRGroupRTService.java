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
import net.ibizsys.psmodel.core.domain.PSDEVRGroup;
import net.ibizsys.psmodel.core.service.IPSDEVRGroupService;
import net.ibizsys.psmodel.core.filter.PSDEVRGroupFilter;


public class PSDEVRGroupRTService extends PSModelRTServiceBase<PSDEVRGroup, PSDEVRGroupFilter> implements IPSDEVRGroupService{
    private static final Log log = LogFactory.getLog(PSDEVRGroupRTService.class);

    @Override
    public PSDEVRGroup createDomain(){
        return new PSDEVRGroup();
    }

    @Override
    public PSDEVRGroupFilter createFilter(){
        return new PSDEVRGroupFilter();
	}

	@Override
	public PSDEVRGroup getDomain(Object params) {
		if(params instanceof PSDEVRGroup) {
			return (PSDEVRGroup)params;
		}
		return getMapper().convertValue(params, PSDEVRGroup.class);
	}

	@Override
	public PSDEVRGroupFilter getFilter(Object params) {
		if(params instanceof PSDEVRGroupFilter) {
			return (PSDEVRGroupFilter)params;
		}
		return getMapper().convertValue(params, PSDEVRGroupFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEVRGROUP";
        }
        else{
            return "PSDEVRGROUPS";
        }
	}
}
