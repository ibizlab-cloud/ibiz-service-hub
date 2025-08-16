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
import net.ibizsys.psmodel.core.domain.PSSysTestModule;
import net.ibizsys.psmodel.core.service.IPSSysTestModuleService;
import net.ibizsys.psmodel.core.filter.PSSysTestModuleFilter;


public class PSSysTestModuleRTService extends PSModelRTServiceBase<PSSysTestModule, PSSysTestModuleFilter> implements IPSSysTestModuleService{
    private static final Log log = LogFactory.getLog(PSSysTestModuleRTService.class);

    @Override
    public PSSysTestModule createDomain(){
        return new PSSysTestModule();
    }

    @Override
    public PSSysTestModuleFilter createFilter(){
        return new PSSysTestModuleFilter();
	}

	@Override
	public PSSysTestModule getDomain(Object params) {
		if(params instanceof PSSysTestModule) {
			return (PSSysTestModule)params;
		}
		return getMapper().convertValue(params, PSSysTestModule.class);
	}

	@Override
	public PSSysTestModuleFilter getFilter(Object params) {
		if(params instanceof PSSysTestModuleFilter) {
			return (PSSysTestModuleFilter)params;
		}
		return getMapper().convertValue(params, PSSysTestModuleFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSTESTMODULE";
        }
        else{
            return "PSSYSTESTMODULES";
        }
	}
}
