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
import net.ibizsys.psmodel.core.domain.PSLanguage;
import net.ibizsys.psmodel.core.service.IPSLanguageService;
import net.ibizsys.psmodel.core.filter.PSLanguageFilter;


public class PSLanguageRTService extends PSModelRTServiceBase<PSLanguage, PSLanguageFilter> implements IPSLanguageService{
    private static final Log log = LogFactory.getLog(PSLanguageRTService.class);

    @Override
    public PSLanguage createDomain(){
        return new PSLanguage();
    }

    @Override
    public PSLanguageFilter createFilter(){
        return new PSLanguageFilter();
	}

	@Override
	public PSLanguage getDomain(Object params) {
		if(params instanceof PSLanguage) {
			return (PSLanguage)params;
		}
		return getMapper().convertValue(params, PSLanguage.class);
	}

	@Override
	public PSLanguageFilter getFilter(Object params) {
		if(params instanceof PSLanguageFilter) {
			return (PSLanguageFilter)params;
		}
		return getMapper().convertValue(params, PSLanguageFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSLANGUAGE";
        }
        else{
            return "PSLANGUAGES";
        }
	}
}
