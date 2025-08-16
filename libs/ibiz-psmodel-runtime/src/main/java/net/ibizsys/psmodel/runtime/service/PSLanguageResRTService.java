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
import net.ibizsys.psmodel.core.domain.PSLanguageRes;
import net.ibizsys.psmodel.core.service.IPSLanguageResService;
import net.ibizsys.psmodel.core.filter.PSLanguageResFilter;


public class PSLanguageResRTService extends PSModelRTServiceBase<PSLanguageRes, PSLanguageResFilter> implements IPSLanguageResService{
    private static final Log log = LogFactory.getLog(PSLanguageResRTService.class);

    @Override
    public PSLanguageRes createDomain(){
        return new PSLanguageRes();
    }

    @Override
    public PSLanguageResFilter createFilter(){
        return new PSLanguageResFilter();
	}

	@Override
	public PSLanguageRes getDomain(Object params) {
		if(params instanceof PSLanguageRes) {
			return (PSLanguageRes)params;
		}
		return getMapper().convertValue(params, PSLanguageRes.class);
	}

	@Override
	public PSLanguageResFilter getFilter(Object params) {
		if(params instanceof PSLanguageResFilter) {
			return (PSLanguageResFilter)params;
		}
		return getMapper().convertValue(params, PSLanguageResFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSLANGUAGERES";
        }
        else{
            return "PSLANGUAGERES";
        }
	}
}
