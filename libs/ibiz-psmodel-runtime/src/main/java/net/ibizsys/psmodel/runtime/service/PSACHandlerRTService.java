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
import net.ibizsys.psmodel.core.domain.PSACHandler;
import net.ibizsys.psmodel.core.service.IPSACHandlerService;
import net.ibizsys.psmodel.core.filter.PSACHandlerFilter;


public class PSACHandlerRTService extends PSModelRTServiceBase<PSACHandler, PSACHandlerFilter> implements IPSACHandlerService{
    private static final Log log = LogFactory.getLog(PSACHandlerRTService.class);

    @Override
    public PSACHandler createDomain(){
        return new PSACHandler();
    }

    @Override
    public PSACHandlerFilter createFilter(){
        return new PSACHandlerFilter();
	}

	@Override
	public PSACHandler getDomain(Object params) {
		if(params instanceof PSACHandler) {
			return (PSACHandler)params;
		}
		return getMapper().convertValue(params, PSACHandler.class);
	}

	@Override
	public PSACHandlerFilter getFilter(Object params) {
		if(params instanceof PSACHandlerFilter) {
			return (PSACHandlerFilter)params;
		}
		return getMapper().convertValue(params, PSACHandlerFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSACHANDLER";
        }
        else{
            return "PSACHANDLERS";
        }
	}
}
