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
import net.ibizsys.psmodel.core.domain.PSAppUserMode;
import net.ibizsys.psmodel.core.service.IPSAppUserModeService;
import net.ibizsys.psmodel.core.filter.PSAppUserModeFilter;


public class PSAppUserModeRTService extends PSModelRTServiceBase<PSAppUserMode, PSAppUserModeFilter> implements IPSAppUserModeService{
    private static final Log log = LogFactory.getLog(PSAppUserModeRTService.class);

    @Override
    public PSAppUserMode createDomain(){
        return new PSAppUserMode();
    }

    @Override
    public PSAppUserModeFilter createFilter(){
        return new PSAppUserModeFilter();
	}

	@Override
	public PSAppUserMode getDomain(Object params) {
		if(params instanceof PSAppUserMode) {
			return (PSAppUserMode)params;
		}
		return getMapper().convertValue(params, PSAppUserMode.class);
	}

	@Override
	public PSAppUserModeFilter getFilter(Object params) {
		if(params instanceof PSAppUserModeFilter) {
			return (PSAppUserModeFilter)params;
		}
		return getMapper().convertValue(params, PSAppUserModeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPUSERMODE";
        }
        else{
            return "PSAPPUSERMODES";
        }
	}
}
