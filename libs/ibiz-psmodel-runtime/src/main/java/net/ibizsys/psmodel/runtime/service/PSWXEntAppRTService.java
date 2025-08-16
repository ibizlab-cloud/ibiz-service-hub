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
import net.ibizsys.psmodel.core.domain.PSWXEntApp;
import net.ibizsys.psmodel.core.service.IPSWXEntAppService;
import net.ibizsys.psmodel.core.filter.PSWXEntAppFilter;


public class PSWXEntAppRTService extends PSModelRTServiceBase<PSWXEntApp, PSWXEntAppFilter> implements IPSWXEntAppService{
    private static final Log log = LogFactory.getLog(PSWXEntAppRTService.class);

    @Override
    public PSWXEntApp createDomain(){
        return new PSWXEntApp();
    }

    @Override
    public PSWXEntAppFilter createFilter(){
        return new PSWXEntAppFilter();
	}

	@Override
	public PSWXEntApp getDomain(Object params) {
		if(params instanceof PSWXEntApp) {
			return (PSWXEntApp)params;
		}
		return getMapper().convertValue(params, PSWXEntApp.class);
	}

	@Override
	public PSWXEntAppFilter getFilter(Object params) {
		if(params instanceof PSWXEntAppFilter) {
			return (PSWXEntAppFilter)params;
		}
		return getMapper().convertValue(params, PSWXEntAppFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSWXENTAPP";
        }
        else{
            return "PSWXENTAPPS";
        }
	}
}
