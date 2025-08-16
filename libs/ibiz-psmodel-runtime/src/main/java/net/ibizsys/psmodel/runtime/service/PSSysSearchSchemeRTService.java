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
import net.ibizsys.psmodel.core.domain.PSSysSearchScheme;
import net.ibizsys.psmodel.core.service.IPSSysSearchSchemeService;
import net.ibizsys.psmodel.core.filter.PSSysSearchSchemeFilter;


public class PSSysSearchSchemeRTService extends PSModelRTServiceBase<PSSysSearchScheme, PSSysSearchSchemeFilter> implements IPSSysSearchSchemeService{
    private static final Log log = LogFactory.getLog(PSSysSearchSchemeRTService.class);

    @Override
    public PSSysSearchScheme createDomain(){
        return new PSSysSearchScheme();
    }

    @Override
    public PSSysSearchSchemeFilter createFilter(){
        return new PSSysSearchSchemeFilter();
	}

	@Override
	public PSSysSearchScheme getDomain(Object params) {
		if(params instanceof PSSysSearchScheme) {
			return (PSSysSearchScheme)params;
		}
		return getMapper().convertValue(params, PSSysSearchScheme.class);
	}

	@Override
	public PSSysSearchSchemeFilter getFilter(Object params) {
		if(params instanceof PSSysSearchSchemeFilter) {
			return (PSSysSearchSchemeFilter)params;
		}
		return getMapper().convertValue(params, PSSysSearchSchemeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSSEARCHSCHEME";
        }
        else{
            return "PSSYSSEARCHSCHEMES";
        }
	}
}
