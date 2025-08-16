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
import net.ibizsys.psmodel.core.domain.PSCtrlLogicGroup;
import net.ibizsys.psmodel.core.service.IPSCtrlLogicGroupService;
import net.ibizsys.psmodel.core.filter.PSCtrlLogicGroupFilter;


public class PSCtrlLogicGroupRTService extends PSModelRTServiceBase<PSCtrlLogicGroup, PSCtrlLogicGroupFilter> implements IPSCtrlLogicGroupService{
    private static final Log log = LogFactory.getLog(PSCtrlLogicGroupRTService.class);

    @Override
    public PSCtrlLogicGroup createDomain(){
        return new PSCtrlLogicGroup();
    }

    @Override
    public PSCtrlLogicGroupFilter createFilter(){
        return new PSCtrlLogicGroupFilter();
	}

	@Override
	public PSCtrlLogicGroup getDomain(Object params) {
		if(params instanceof PSCtrlLogicGroup) {
			return (PSCtrlLogicGroup)params;
		}
		return getMapper().convertValue(params, PSCtrlLogicGroup.class);
	}

	@Override
	public PSCtrlLogicGroupFilter getFilter(Object params) {
		if(params instanceof PSCtrlLogicGroupFilter) {
			return (PSCtrlLogicGroupFilter)params;
		}
		return getMapper().convertValue(params, PSCtrlLogicGroupFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSCTRLLOGICGROUP";
        }
        else{
            return "PSCTRLLOGICGROUPS";
        }
	}
}
