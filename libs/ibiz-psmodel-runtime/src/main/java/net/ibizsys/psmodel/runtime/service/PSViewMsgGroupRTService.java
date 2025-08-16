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
import net.ibizsys.psmodel.core.domain.PSViewMsgGroup;
import net.ibizsys.psmodel.core.service.IPSViewMsgGroupService;
import net.ibizsys.psmodel.core.filter.PSViewMsgGroupFilter;


public class PSViewMsgGroupRTService extends PSModelRTServiceBase<PSViewMsgGroup, PSViewMsgGroupFilter> implements IPSViewMsgGroupService{
    private static final Log log = LogFactory.getLog(PSViewMsgGroupRTService.class);

    @Override
    public PSViewMsgGroup createDomain(){
        return new PSViewMsgGroup();
    }

    @Override
    public PSViewMsgGroupFilter createFilter(){
        return new PSViewMsgGroupFilter();
	}

	@Override
	public PSViewMsgGroup getDomain(Object params) {
		if(params instanceof PSViewMsgGroup) {
			return (PSViewMsgGroup)params;
		}
		return getMapper().convertValue(params, PSViewMsgGroup.class);
	}

	@Override
	public PSViewMsgGroupFilter getFilter(Object params) {
		if(params instanceof PSViewMsgGroupFilter) {
			return (PSViewMsgGroupFilter)params;
		}
		return getMapper().convertValue(params, PSViewMsgGroupFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSVIEWMSGGROUP";
        }
        else{
            return "PSVIEWMSGGROUPS";
        }
	}
}
