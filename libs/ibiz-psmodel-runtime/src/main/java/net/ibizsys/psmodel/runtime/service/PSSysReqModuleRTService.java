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
import net.ibizsys.psmodel.core.domain.PSSysReqModule;
import net.ibizsys.psmodel.core.service.IPSSysReqModuleService;
import net.ibizsys.psmodel.core.filter.PSSysReqModuleFilter;


public class PSSysReqModuleRTService extends PSModelRTServiceBase<PSSysReqModule, PSSysReqModuleFilter> implements IPSSysReqModuleService{
    private static final Log log = LogFactory.getLog(PSSysReqModuleRTService.class);

    @Override
    public PSSysReqModule createDomain(){
        return new PSSysReqModule();
    }

    @Override
    public PSSysReqModuleFilter createFilter(){
        return new PSSysReqModuleFilter();
	}

	@Override
	public PSSysReqModule getDomain(Object params) {
		if(params instanceof PSSysReqModule) {
			return (PSSysReqModule)params;
		}
		return getMapper().convertValue(params, PSSysReqModule.class);
	}

	@Override
	public PSSysReqModuleFilter getFilter(Object params) {
		if(params instanceof PSSysReqModuleFilter) {
			return (PSSysReqModuleFilter)params;
		}
		return getMapper().convertValue(params, PSSysReqModuleFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSREQMODULE";
        }
        else{
            return "PSSYSREQMODULES";
        }
	}
}
