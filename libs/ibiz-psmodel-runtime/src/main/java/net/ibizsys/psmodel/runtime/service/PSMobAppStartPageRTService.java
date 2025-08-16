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
import net.ibizsys.psmodel.core.domain.PSMobAppStartPage;
import net.ibizsys.psmodel.core.service.IPSMobAppStartPageService;
import net.ibizsys.psmodel.core.filter.PSMobAppStartPageFilter;


public class PSMobAppStartPageRTService extends PSModelRTServiceBase<PSMobAppStartPage, PSMobAppStartPageFilter> implements IPSMobAppStartPageService{
    private static final Log log = LogFactory.getLog(PSMobAppStartPageRTService.class);

    @Override
    public PSMobAppStartPage createDomain(){
        return new PSMobAppStartPage();
    }

    @Override
    public PSMobAppStartPageFilter createFilter(){
        return new PSMobAppStartPageFilter();
	}

	@Override
	public PSMobAppStartPage getDomain(Object params) {
		if(params instanceof PSMobAppStartPage) {
			return (PSMobAppStartPage)params;
		}
		return getMapper().convertValue(params, PSMobAppStartPage.class);
	}

	@Override
	public PSMobAppStartPageFilter getFilter(Object params) {
		if(params instanceof PSMobAppStartPageFilter) {
			return (PSMobAppStartPageFilter)params;
		}
		return getMapper().convertValue(params, PSMobAppStartPageFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSMOBAPPSTARTPAGE";
        }
        else{
            return "PSMOBAPPSTARTPAGES";
        }
	}
}
