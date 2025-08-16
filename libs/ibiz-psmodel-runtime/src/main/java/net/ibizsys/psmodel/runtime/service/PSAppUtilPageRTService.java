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
import net.ibizsys.psmodel.core.domain.PSAppUtilPage;
import net.ibizsys.psmodel.core.service.IPSAppUtilPageService;
import net.ibizsys.psmodel.core.filter.PSAppUtilPageFilter;


public class PSAppUtilPageRTService extends PSModelRTServiceBase<PSAppUtilPage, PSAppUtilPageFilter> implements IPSAppUtilPageService{
    private static final Log log = LogFactory.getLog(PSAppUtilPageRTService.class);

    @Override
    public PSAppUtilPage createDomain(){
        return new PSAppUtilPage();
    }

    @Override
    public PSAppUtilPageFilter createFilter(){
        return new PSAppUtilPageFilter();
	}

	@Override
	public PSAppUtilPage getDomain(Object params) {
		if(params instanceof PSAppUtilPage) {
			return (PSAppUtilPage)params;
		}
		return getMapper().convertValue(params, PSAppUtilPage.class);
	}

	@Override
	public PSAppUtilPageFilter getFilter(Object params) {
		if(params instanceof PSAppUtilPageFilter) {
			return (PSAppUtilPageFilter)params;
		}
		return getMapper().convertValue(params, PSAppUtilPageFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPUTILPAGE";
        }
        else{
            return "PSAPPUTILPAGES";
        }
	}
}
