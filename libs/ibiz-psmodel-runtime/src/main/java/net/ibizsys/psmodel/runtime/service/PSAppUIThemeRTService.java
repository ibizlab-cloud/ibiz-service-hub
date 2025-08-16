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
import net.ibizsys.psmodel.core.domain.PSAppUITheme;
import net.ibizsys.psmodel.core.service.IPSAppUIThemeService;
import net.ibizsys.psmodel.core.filter.PSAppUIThemeFilter;


public class PSAppUIThemeRTService extends PSModelRTServiceBase<PSAppUITheme, PSAppUIThemeFilter> implements IPSAppUIThemeService{
    private static final Log log = LogFactory.getLog(PSAppUIThemeRTService.class);

    @Override
    public PSAppUITheme createDomain(){
        return new PSAppUITheme();
    }

    @Override
    public PSAppUIThemeFilter createFilter(){
        return new PSAppUIThemeFilter();
	}

	@Override
	public PSAppUITheme getDomain(Object params) {
		if(params instanceof PSAppUITheme) {
			return (PSAppUITheme)params;
		}
		return getMapper().convertValue(params, PSAppUITheme.class);
	}

	@Override
	public PSAppUIThemeFilter getFilter(Object params) {
		if(params instanceof PSAppUIThemeFilter) {
			return (PSAppUIThemeFilter)params;
		}
		return getMapper().convertValue(params, PSAppUIThemeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPUITHEME";
        }
        else{
            return "PSAPPUITHEMES";
        }
	}
}
