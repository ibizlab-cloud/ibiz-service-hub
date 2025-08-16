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
import net.ibizsys.psmodel.core.domain.PSSysTestPrj;
import net.ibizsys.psmodel.core.service.IPSSysTestPrjService;
import net.ibizsys.psmodel.core.filter.PSSysTestPrjFilter;


public class PSSysTestPrjRTService extends PSModelRTServiceBase<PSSysTestPrj, PSSysTestPrjFilter> implements IPSSysTestPrjService{
    private static final Log log = LogFactory.getLog(PSSysTestPrjRTService.class);

    @Override
    public PSSysTestPrj createDomain(){
        return new PSSysTestPrj();
    }

    @Override
    public PSSysTestPrjFilter createFilter(){
        return new PSSysTestPrjFilter();
	}

	@Override
	public PSSysTestPrj getDomain(Object params) {
		if(params instanceof PSSysTestPrj) {
			return (PSSysTestPrj)params;
		}
		return getMapper().convertValue(params, PSSysTestPrj.class);
	}

	@Override
	public PSSysTestPrjFilter getFilter(Object params) {
		if(params instanceof PSSysTestPrjFilter) {
			return (PSSysTestPrjFilter)params;
		}
		return getMapper().convertValue(params, PSSysTestPrjFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSTESTPRJ";
        }
        else{
            return "PSSYSTESTPRJS";
        }
	}
}
