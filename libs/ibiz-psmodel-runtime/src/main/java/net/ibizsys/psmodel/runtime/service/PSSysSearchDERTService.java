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
import net.ibizsys.psmodel.core.domain.PSSysSearchDE;
import net.ibizsys.psmodel.core.service.IPSSysSearchDEService;
import net.ibizsys.psmodel.core.filter.PSSysSearchDEFilter;


public class PSSysSearchDERTService extends PSModelRTServiceBase<PSSysSearchDE, PSSysSearchDEFilter> implements IPSSysSearchDEService{
    private static final Log log = LogFactory.getLog(PSSysSearchDERTService.class);

    @Override
    public PSSysSearchDE createDomain(){
        return new PSSysSearchDE();
    }

    @Override
    public PSSysSearchDEFilter createFilter(){
        return new PSSysSearchDEFilter();
	}

	@Override
	public PSSysSearchDE getDomain(Object params) {
		if(params instanceof PSSysSearchDE) {
			return (PSSysSearchDE)params;
		}
		return getMapper().convertValue(params, PSSysSearchDE.class);
	}

	@Override
	public PSSysSearchDEFilter getFilter(Object params) {
		if(params instanceof PSSysSearchDEFilter) {
			return (PSSysSearchDEFilter)params;
		}
		return getMapper().convertValue(params, PSSysSearchDEFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSSEARCHDE";
        }
        else{
            return "PSSYSSEARCHDES";
        }
	}
}
