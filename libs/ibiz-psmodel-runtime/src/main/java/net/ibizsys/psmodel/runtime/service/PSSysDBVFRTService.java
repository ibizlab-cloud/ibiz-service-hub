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
import net.ibizsys.psmodel.core.domain.PSSysDBVF;
import net.ibizsys.psmodel.core.service.IPSSysDBVFService;
import net.ibizsys.psmodel.core.filter.PSSysDBVFFilter;


public class PSSysDBVFRTService extends PSModelRTServiceBase<PSSysDBVF, PSSysDBVFFilter> implements IPSSysDBVFService{
    private static final Log log = LogFactory.getLog(PSSysDBVFRTService.class);

    @Override
    public PSSysDBVF createDomain(){
        return new PSSysDBVF();
    }

    @Override
    public PSSysDBVFFilter createFilter(){
        return new PSSysDBVFFilter();
	}

	@Override
	public PSSysDBVF getDomain(Object params) {
		if(params instanceof PSSysDBVF) {
			return (PSSysDBVF)params;
		}
		return getMapper().convertValue(params, PSSysDBVF.class);
	}

	@Override
	public PSSysDBVFFilter getFilter(Object params) {
		if(params instanceof PSSysDBVFFilter) {
			return (PSSysDBVFFilter)params;
		}
		return getMapper().convertValue(params, PSSysDBVFFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSDBVF";
        }
        else{
            return "PSSYSDBVFS";
        }
	}
}
