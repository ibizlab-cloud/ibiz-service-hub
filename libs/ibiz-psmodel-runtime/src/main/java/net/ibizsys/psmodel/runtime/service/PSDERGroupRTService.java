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
import net.ibizsys.psmodel.core.domain.PSDERGroup;
import net.ibizsys.psmodel.core.service.IPSDERGroupService;
import net.ibizsys.psmodel.core.filter.PSDERGroupFilter;


public class PSDERGroupRTService extends PSModelRTServiceBase<PSDERGroup, PSDERGroupFilter> implements IPSDERGroupService{
    private static final Log log = LogFactory.getLog(PSDERGroupRTService.class);

    @Override
    public PSDERGroup createDomain(){
        return new PSDERGroup();
    }

    @Override
    public PSDERGroupFilter createFilter(){
        return new PSDERGroupFilter();
	}

	@Override
	public PSDERGroup getDomain(Object params) {
		if(params instanceof PSDERGroup) {
			return (PSDERGroup)params;
		}
		return getMapper().convertValue(params, PSDERGroup.class);
	}

	@Override
	public PSDERGroupFilter getFilter(Object params) {
		if(params instanceof PSDERGroupFilter) {
			return (PSDERGroupFilter)params;
		}
		return getMapper().convertValue(params, PSDERGroupFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDERGROUP";
        }
        else{
            return "PSDERGROUPS";
        }
	}
}
