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
import net.ibizsys.psmodel.core.domain.PSAppWF;
import net.ibizsys.psmodel.core.service.IPSAppWFService;
import net.ibizsys.psmodel.core.filter.PSAppWFFilter;


public class PSAppWFRTService extends PSModelRTServiceBase<PSAppWF, PSAppWFFilter> implements IPSAppWFService{
    private static final Log log = LogFactory.getLog(PSAppWFRTService.class);

    @Override
    public PSAppWF createDomain(){
        return new PSAppWF();
    }

    @Override
    public PSAppWFFilter createFilter(){
        return new PSAppWFFilter();
	}

	@Override
	public PSAppWF getDomain(Object params) {
		if(params instanceof PSAppWF) {
			return (PSAppWF)params;
		}
		return getMapper().convertValue(params, PSAppWF.class);
	}

	@Override
	public PSAppWFFilter getFilter(Object params) {
		if(params instanceof PSAppWFFilter) {
			return (PSAppWFFilter)params;
		}
		return getMapper().convertValue(params, PSAppWFFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPWF";
        }
        else{
            return "PSAPPWFS";
        }
	}
}
