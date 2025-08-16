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
import net.ibizsys.psmodel.core.domain.PSViewMsg;
import net.ibizsys.psmodel.core.service.IPSViewMsgService;
import net.ibizsys.psmodel.core.filter.PSViewMsgFilter;


public class PSViewMsgRTService extends PSModelRTServiceBase<PSViewMsg, PSViewMsgFilter> implements IPSViewMsgService{
    private static final Log log = LogFactory.getLog(PSViewMsgRTService.class);

    @Override
    public PSViewMsg createDomain(){
        return new PSViewMsg();
    }

    @Override
    public PSViewMsgFilter createFilter(){
        return new PSViewMsgFilter();
	}

	@Override
	public PSViewMsg getDomain(Object params) {
		if(params instanceof PSViewMsg) {
			return (PSViewMsg)params;
		}
		return getMapper().convertValue(params, PSViewMsg.class);
	}

	@Override
	public PSViewMsgFilter getFilter(Object params) {
		if(params instanceof PSViewMsgFilter) {
			return (PSViewMsgFilter)params;
		}
		return getMapper().convertValue(params, PSViewMsgFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSVIEWMSG";
        }
        else{
            return "PSVIEWMSGS";
        }
	}
}
