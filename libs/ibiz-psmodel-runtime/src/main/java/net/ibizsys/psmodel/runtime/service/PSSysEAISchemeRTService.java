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
import net.ibizsys.psmodel.core.domain.PSSysEAIScheme;
import net.ibizsys.psmodel.core.service.IPSSysEAISchemeService;
import net.ibizsys.psmodel.core.filter.PSSysEAISchemeFilter;


public class PSSysEAISchemeRTService extends PSModelRTServiceBase<PSSysEAIScheme, PSSysEAISchemeFilter> implements IPSSysEAISchemeService{
    private static final Log log = LogFactory.getLog(PSSysEAISchemeRTService.class);

    @Override
    public PSSysEAIScheme createDomain(){
        return new PSSysEAIScheme();
    }

    @Override
    public PSSysEAISchemeFilter createFilter(){
        return new PSSysEAISchemeFilter();
	}

	@Override
	public PSSysEAIScheme getDomain(Object params) {
		if(params instanceof PSSysEAIScheme) {
			return (PSSysEAIScheme)params;
		}
		return getMapper().convertValue(params, PSSysEAIScheme.class);
	}

	@Override
	public PSSysEAISchemeFilter getFilter(Object params) {
		if(params instanceof PSSysEAISchemeFilter) {
			return (PSSysEAISchemeFilter)params;
		}
		return getMapper().convertValue(params, PSSysEAISchemeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSEAISCHEME";
        }
        else{
            return "PSSYSEAISCHEMES";
        }
	}
}
