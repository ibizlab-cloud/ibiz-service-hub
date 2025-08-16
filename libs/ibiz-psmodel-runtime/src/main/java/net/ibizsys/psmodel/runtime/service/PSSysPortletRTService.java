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
import net.ibizsys.psmodel.core.domain.PSSysPortlet;
import net.ibizsys.psmodel.core.service.IPSSysPortletService;
import net.ibizsys.psmodel.core.filter.PSSysPortletFilter;


public class PSSysPortletRTService extends PSModelRTServiceBase<PSSysPortlet, PSSysPortletFilter> implements IPSSysPortletService{
    private static final Log log = LogFactory.getLog(PSSysPortletRTService.class);

    @Override
    public PSSysPortlet createDomain(){
        return new PSSysPortlet();
    }

    @Override
    public PSSysPortletFilter createFilter(){
        return new PSSysPortletFilter();
	}

	@Override
	public PSSysPortlet getDomain(Object params) {
		if(params instanceof PSSysPortlet) {
			return (PSSysPortlet)params;
		}
		return getMapper().convertValue(params, PSSysPortlet.class);
	}

	@Override
	public PSSysPortletFilter getFilter(Object params) {
		if(params instanceof PSSysPortletFilter) {
			return (PSSysPortletFilter)params;
		}
		return getMapper().convertValue(params, PSSysPortletFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSPORTLET";
        }
        else{
            return "PSSYSPORTLETS";
        }
	}
}
