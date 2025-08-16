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
import net.ibizsys.psmodel.core.domain.PSSysDBProc;
import net.ibizsys.psmodel.core.service.IPSSysDBProcService;
import net.ibizsys.psmodel.core.filter.PSSysDBProcFilter;


public class PSSysDBProcRTService extends PSModelRTServiceBase<PSSysDBProc, PSSysDBProcFilter> implements IPSSysDBProcService{
    private static final Log log = LogFactory.getLog(PSSysDBProcRTService.class);

    @Override
    public PSSysDBProc createDomain(){
        return new PSSysDBProc();
    }

    @Override
    public PSSysDBProcFilter createFilter(){
        return new PSSysDBProcFilter();
	}

	@Override
	public PSSysDBProc getDomain(Object params) {
		if(params instanceof PSSysDBProc) {
			return (PSSysDBProc)params;
		}
		return getMapper().convertValue(params, PSSysDBProc.class);
	}

	@Override
	public PSSysDBProcFilter getFilter(Object params) {
		if(params instanceof PSSysDBProcFilter) {
			return (PSSysDBProcFilter)params;
		}
		return getMapper().convertValue(params, PSSysDBProcFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSDBPROC";
        }
        else{
            return "PSSYSDBPROCS";
        }
	}
}
