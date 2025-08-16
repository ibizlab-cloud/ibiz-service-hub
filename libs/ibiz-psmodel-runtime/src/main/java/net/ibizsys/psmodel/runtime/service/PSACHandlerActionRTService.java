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
import net.ibizsys.psmodel.core.domain.PSACHandlerAction;
import net.ibizsys.psmodel.core.service.IPSACHandlerActionService;
import net.ibizsys.psmodel.core.filter.PSACHandlerActionFilter;


public class PSACHandlerActionRTService extends PSModelRTServiceBase<PSACHandlerAction, PSACHandlerActionFilter> implements IPSACHandlerActionService{
    private static final Log log = LogFactory.getLog(PSACHandlerActionRTService.class);

    @Override
    public PSACHandlerAction createDomain(){
        return new PSACHandlerAction();
    }

    @Override
    public PSACHandlerActionFilter createFilter(){
        return new PSACHandlerActionFilter();
	}

	@Override
	public PSACHandlerAction getDomain(Object params) {
		if(params instanceof PSACHandlerAction) {
			return (PSACHandlerAction)params;
		}
		return getMapper().convertValue(params, PSACHandlerAction.class);
	}

	@Override
	public PSACHandlerActionFilter getFilter(Object params) {
		if(params instanceof PSACHandlerActionFilter) {
			return (PSACHandlerActionFilter)params;
		}
		return getMapper().convertValue(params, PSACHandlerActionFilter.class);
	}

	

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSACHANDLERACTION";
        }
        else{
            return "PSACHANDLERACTIONS";
        }
	}
}
