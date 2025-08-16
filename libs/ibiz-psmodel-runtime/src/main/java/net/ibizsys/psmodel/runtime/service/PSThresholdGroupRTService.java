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
import net.ibizsys.psmodel.core.domain.PSThresholdGroup;
import net.ibizsys.psmodel.core.service.IPSThresholdGroupService;
import net.ibizsys.psmodel.core.filter.PSThresholdGroupFilter;


public class PSThresholdGroupRTService extends PSModelRTServiceBase<PSThresholdGroup, PSThresholdGroupFilter> implements IPSThresholdGroupService{
    private static final Log log = LogFactory.getLog(PSThresholdGroupRTService.class);

    @Override
    public PSThresholdGroup createDomain(){
        return new PSThresholdGroup();
    }

    @Override
    public PSThresholdGroupFilter createFilter(){
        return new PSThresholdGroupFilter();
	}

	@Override
	public PSThresholdGroup getDomain(Object params) {
		if(params instanceof PSThresholdGroup) {
			return (PSThresholdGroup)params;
		}
		return getMapper().convertValue(params, PSThresholdGroup.class);
	}

	@Override
	public PSThresholdGroupFilter getFilter(Object params) {
		if(params instanceof PSThresholdGroupFilter) {
			return (PSThresholdGroupFilter)params;
		}
		return getMapper().convertValue(params, PSThresholdGroupFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSTHRESHOLDGROUP";
        }
        else{
            return "PSTHRESHOLDGROUPS";
        }
	}
}
