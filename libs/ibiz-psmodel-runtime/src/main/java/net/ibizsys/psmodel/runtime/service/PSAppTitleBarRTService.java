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
import net.ibizsys.psmodel.core.domain.PSAppTitleBar;
import net.ibizsys.psmodel.core.service.IPSAppTitleBarService;
import net.ibizsys.psmodel.core.filter.PSAppTitleBarFilter;


public class PSAppTitleBarRTService extends PSModelRTServiceBase<PSAppTitleBar, PSAppTitleBarFilter> implements IPSAppTitleBarService{
    private static final Log log = LogFactory.getLog(PSAppTitleBarRTService.class);

    @Override
    public PSAppTitleBar createDomain(){
        return new PSAppTitleBar();
    }

    @Override
    public PSAppTitleBarFilter createFilter(){
        return new PSAppTitleBarFilter();
	}

	@Override
	public PSAppTitleBar getDomain(Object params) {
		if(params instanceof PSAppTitleBar) {
			return (PSAppTitleBar)params;
		}
		return getMapper().convertValue(params, PSAppTitleBar.class);
	}

	@Override
	public PSAppTitleBarFilter getFilter(Object params) {
		if(params instanceof PSAppTitleBarFilter) {
			return (PSAppTitleBarFilter)params;
		}
		return getMapper().convertValue(params, PSAppTitleBarFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPTITLEBAR";
        }
        else{
            return "PSAPPTITLEBARS";
        }
	}
}
