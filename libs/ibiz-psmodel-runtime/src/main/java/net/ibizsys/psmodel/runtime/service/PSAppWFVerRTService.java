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
import net.ibizsys.psmodel.core.domain.PSAppWFVer;
import net.ibizsys.psmodel.core.service.IPSAppWFVerService;
import net.ibizsys.psmodel.core.filter.PSAppWFVerFilter;


public class PSAppWFVerRTService extends PSModelRTServiceBase<PSAppWFVer, PSAppWFVerFilter> implements IPSAppWFVerService{
    private static final Log log = LogFactory.getLog(PSAppWFVerRTService.class);

    @Override
    public PSAppWFVer createDomain(){
        return new PSAppWFVer();
    }

    @Override
    public PSAppWFVerFilter createFilter(){
        return new PSAppWFVerFilter();
	}

	@Override
	public PSAppWFVer getDomain(Object params) {
		if(params instanceof PSAppWFVer) {
			return (PSAppWFVer)params;
		}
		return getMapper().convertValue(params, PSAppWFVer.class);
	}

	@Override
	public PSAppWFVerFilter getFilter(Object params) {
		if(params instanceof PSAppWFVerFilter) {
			return (PSAppWFVerFilter)params;
		}
		return getMapper().convertValue(params, PSAppWFVerFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPWFVER";
        }
        else{
            return "PSAPPWFVERS";
        }
	}
}
