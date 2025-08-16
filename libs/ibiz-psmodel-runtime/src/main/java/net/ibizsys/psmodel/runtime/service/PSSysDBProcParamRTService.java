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
import net.ibizsys.psmodel.core.domain.PSSysDBProcParam;
import net.ibizsys.psmodel.core.service.IPSSysDBProcParamService;
import net.ibizsys.psmodel.core.filter.PSSysDBProcParamFilter;


public class PSSysDBProcParamRTService extends PSModelRTServiceBase<PSSysDBProcParam, PSSysDBProcParamFilter> implements IPSSysDBProcParamService{
    private static final Log log = LogFactory.getLog(PSSysDBProcParamRTService.class);

    @Override
    public PSSysDBProcParam createDomain(){
        return new PSSysDBProcParam();
    }

    @Override
    public PSSysDBProcParamFilter createFilter(){
        return new PSSysDBProcParamFilter();
	}

	@Override
	public PSSysDBProcParam getDomain(Object params) {
		if(params instanceof PSSysDBProcParam) {
			return (PSSysDBProcParam)params;
		}
		return getMapper().convertValue(params, PSSysDBProcParam.class);
	}

	@Override
	public PSSysDBProcParamFilter getFilter(Object params) {
		if(params instanceof PSSysDBProcParamFilter) {
			return (PSSysDBProcParamFilter)params;
		}
		return getMapper().convertValue(params, PSSysDBProcParamFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSDBPROCPARAM";
        }
        else{
            return "PSSYSDBPROCPARAMS";
        }
	}
}
