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
import net.ibizsys.psmodel.core.domain.PSWFUtilUIAction;
import net.ibizsys.psmodel.core.service.IPSWFUtilUIActionService;
import net.ibizsys.psmodel.core.filter.PSWFUtilUIActionFilter;


public class PSWFUtilUIActionRTService extends PSModelRTServiceBase<PSWFUtilUIAction, PSWFUtilUIActionFilter> implements IPSWFUtilUIActionService{
    private static final Log log = LogFactory.getLog(PSWFUtilUIActionRTService.class);

    @Override
    public PSWFUtilUIAction createDomain(){
        return new PSWFUtilUIAction();
    }

    @Override
    public PSWFUtilUIActionFilter createFilter(){
        return new PSWFUtilUIActionFilter();
	}

	@Override
	public PSWFUtilUIAction getDomain(Object params) {
		if(params instanceof PSWFUtilUIAction) {
			return (PSWFUtilUIAction)params;
		}
		return getMapper().convertValue(params, PSWFUtilUIAction.class);
	}

	@Override
	public PSWFUtilUIActionFilter getFilter(Object params) {
		if(params instanceof PSWFUtilUIActionFilter) {
			return (PSWFUtilUIActionFilter)params;
		}
		return getMapper().convertValue(params, PSWFUtilUIActionFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSWFUTILUIACTION";
        }
        else{
            return "PSWFUTILUIACTIONS";
        }
	}
}
