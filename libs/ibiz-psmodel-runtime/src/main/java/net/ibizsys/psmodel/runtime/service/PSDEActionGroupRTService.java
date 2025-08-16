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
import net.ibizsys.psmodel.core.domain.PSDEActionGroup;
import net.ibizsys.psmodel.core.service.IPSDEActionGroupService;
import net.ibizsys.psmodel.core.filter.PSDEActionGroupFilter;


public class PSDEActionGroupRTService extends PSModelRTServiceBase<PSDEActionGroup, PSDEActionGroupFilter> implements IPSDEActionGroupService{
    private static final Log log = LogFactory.getLog(PSDEActionGroupRTService.class);

    @Override
    public PSDEActionGroup createDomain(){
        return new PSDEActionGroup();
    }

    @Override
    public PSDEActionGroupFilter createFilter(){
        return new PSDEActionGroupFilter();
	}

	@Override
	public PSDEActionGroup getDomain(Object params) {
		if(params instanceof PSDEActionGroup) {
			return (PSDEActionGroup)params;
		}
		return getMapper().convertValue(params, PSDEActionGroup.class);
	}

	@Override
	public PSDEActionGroupFilter getFilter(Object params) {
		if(params instanceof PSDEActionGroupFilter) {
			return (PSDEActionGroupFilter)params;
		}
		return getMapper().convertValue(params, PSDEActionGroupFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEACTIONGROUP";
        }
        else{
            return "PSDEACTIONGROUPS";
        }
	}
}
