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
import net.ibizsys.psmodel.core.domain.PSSysSearchBar;
import net.ibizsys.psmodel.core.service.IPSSysSearchBarService;
import net.ibizsys.psmodel.core.filter.PSSysSearchBarFilter;


public class PSSysSearchBarRTService extends PSModelRTServiceBase<PSSysSearchBar, PSSysSearchBarFilter> implements IPSSysSearchBarService{
    private static final Log log = LogFactory.getLog(PSSysSearchBarRTService.class);

    @Override
    public PSSysSearchBar createDomain(){
        return new PSSysSearchBar();
    }

    @Override
    public PSSysSearchBarFilter createFilter(){
        return new PSSysSearchBarFilter();
	}

	@Override
	public PSSysSearchBar getDomain(Object params) {
		if(params instanceof PSSysSearchBar) {
			return (PSSysSearchBar)params;
		}
		return getMapper().convertValue(params, PSSysSearchBar.class);
	}

	@Override
	public PSSysSearchBarFilter getFilter(Object params) {
		if(params instanceof PSSysSearchBarFilter) {
			return (PSSysSearchBarFilter)params;
		}
		return getMapper().convertValue(params, PSSysSearchBarFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSSEARCHBAR";
        }
        else{
            return "PSSYSSEARCHBARS";
        }
	}
}
