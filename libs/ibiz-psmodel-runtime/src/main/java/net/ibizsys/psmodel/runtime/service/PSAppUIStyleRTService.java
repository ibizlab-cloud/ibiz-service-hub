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
import net.ibizsys.psmodel.core.domain.PSAppUIStyle;
import net.ibizsys.psmodel.core.service.IPSAppUIStyleService;
import net.ibizsys.psmodel.core.filter.PSAppUIStyleFilter;


public class PSAppUIStyleRTService extends PSModelRTServiceBase<PSAppUIStyle, PSAppUIStyleFilter> implements IPSAppUIStyleService{
    private static final Log log = LogFactory.getLog(PSAppUIStyleRTService.class);

    @Override
    public PSAppUIStyle createDomain(){
        return new PSAppUIStyle();
    }

    @Override
    public PSAppUIStyleFilter createFilter(){
        return new PSAppUIStyleFilter();
	}

	@Override
	public PSAppUIStyle getDomain(Object params) {
		if(params instanceof PSAppUIStyle) {
			return (PSAppUIStyle)params;
		}
		return getMapper().convertValue(params, PSAppUIStyle.class);
	}

	@Override
	public PSAppUIStyleFilter getFilter(Object params) {
		if(params instanceof PSAppUIStyleFilter) {
			return (PSAppUIStyleFilter)params;
		}
		return getMapper().convertValue(params, PSAppUIStyleFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPUISTYLE";
        }
        else{
            return "PSAPPUISTYLES";
        }
	}
}
