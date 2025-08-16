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
import net.ibizsys.psmodel.core.domain.PSDEDRGroup;
import net.ibizsys.psmodel.core.service.IPSDEDRGroupService;
import net.ibizsys.psmodel.core.filter.PSDEDRGroupFilter;


public class PSDEDRGroupRTService extends PSModelRTServiceBase<PSDEDRGroup, PSDEDRGroupFilter> implements IPSDEDRGroupService{
    private static final Log log = LogFactory.getLog(PSDEDRGroupRTService.class);

    @Override
    public PSDEDRGroup createDomain(){
        return new PSDEDRGroup();
    }

    @Override
    public PSDEDRGroupFilter createFilter(){
        return new PSDEDRGroupFilter();
	}

	@Override
	public PSDEDRGroup getDomain(Object params) {
		if(params instanceof PSDEDRGroup) {
			return (PSDEDRGroup)params;
		}
		return getMapper().convertValue(params, PSDEDRGroup.class);
	}

	@Override
	public PSDEDRGroupFilter getFilter(Object params) {
		if(params instanceof PSDEDRGroupFilter) {
			return (PSDEDRGroupFilter)params;
		}
		return getMapper().convertValue(params, PSDEDRGroupFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEDRGROUP";
        }
        else{
            return "PSDEDRGROUPS";
        }
	}
}
