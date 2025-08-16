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
import net.ibizsys.psmodel.core.domain.PSSystemRun;
import net.ibizsys.psmodel.core.service.IPSSystemRunService;
import net.ibizsys.psmodel.core.filter.PSSystemRunFilter;


public class PSSystemRunRTService extends PSModelRTServiceBase<PSSystemRun, PSSystemRunFilter> implements IPSSystemRunService{
    private static final Log log = LogFactory.getLog(PSSystemRunRTService.class);

    @Override
    public PSSystemRun createDomain(){
        return new PSSystemRun();
    }

    @Override
    public PSSystemRunFilter createFilter(){
        return new PSSystemRunFilter();
	}

	@Override
	public PSSystemRun getDomain(Object params) {
		if(params instanceof PSSystemRun) {
			return (PSSystemRun)params;
		}
		return getMapper().convertValue(params, PSSystemRun.class);
	}

	@Override
	public PSSystemRunFilter getFilter(Object params) {
		if(params instanceof PSSystemRunFilter) {
			return (PSSystemRunFilter)params;
		}
		return getMapper().convertValue(params, PSSystemRunFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSTEMRUN";
        }
        else{
            return "PSSYSTEMRUNS";
        }
	}
}
