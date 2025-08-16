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
import net.ibizsys.psmodel.core.domain.PSSysTestCase;
import net.ibizsys.psmodel.core.service.IPSSysTestCaseService;
import net.ibizsys.psmodel.core.filter.PSSysTestCaseFilter;


public class PSSysTestCaseRTService extends PSModelRTServiceBase<PSSysTestCase, PSSysTestCaseFilter> implements IPSSysTestCaseService{
    private static final Log log = LogFactory.getLog(PSSysTestCaseRTService.class);

    @Override
    public PSSysTestCase createDomain(){
        return new PSSysTestCase();
    }

    @Override
    public PSSysTestCaseFilter createFilter(){
        return new PSSysTestCaseFilter();
	}

	@Override
	public PSSysTestCase getDomain(Object params) {
		if(params instanceof PSSysTestCase) {
			return (PSSysTestCase)params;
		}
		return getMapper().convertValue(params, PSSysTestCase.class);
	}

	@Override
	public PSSysTestCaseFilter getFilter(Object params) {
		if(params instanceof PSSysTestCaseFilter) {
			return (PSSysTestCaseFilter)params;
		}
		return getMapper().convertValue(params, PSSysTestCaseFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSTESTCASE";
        }
        else{
            return "PSSYSTESTCASES";
        }
	}
}
