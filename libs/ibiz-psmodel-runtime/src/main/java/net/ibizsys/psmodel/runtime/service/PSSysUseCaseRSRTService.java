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
import net.ibizsys.psmodel.core.domain.PSSysUseCaseRS;
import net.ibizsys.psmodel.core.service.IPSSysUseCaseRSService;
import net.ibizsys.psmodel.core.filter.PSSysUseCaseRSFilter;


public class PSSysUseCaseRSRTService extends PSModelRTServiceBase<PSSysUseCaseRS, PSSysUseCaseRSFilter> implements IPSSysUseCaseRSService{
    private static final Log log = LogFactory.getLog(PSSysUseCaseRSRTService.class);

    @Override
    public PSSysUseCaseRS createDomain(){
        return new PSSysUseCaseRS();
    }

    @Override
    public PSSysUseCaseRSFilter createFilter(){
        return new PSSysUseCaseRSFilter();
	}

	@Override
	public PSSysUseCaseRS getDomain(Object params) {
		if(params instanceof PSSysUseCaseRS) {
			return (PSSysUseCaseRS)params;
		}
		return getMapper().convertValue(params, PSSysUseCaseRS.class);
	}

	@Override
	public PSSysUseCaseRSFilter getFilter(Object params) {
		if(params instanceof PSSysUseCaseRSFilter) {
			return (PSSysUseCaseRSFilter)params;
		}
		return getMapper().convertValue(params, PSSysUseCaseRSFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSUSECASERS";
        }
        else{
            return "PSSYSUSECASERS";
        }
	}

    @Override
    protected String getOriginModelName() {
        return "PSSYSUSERCASERS";
    }
}
