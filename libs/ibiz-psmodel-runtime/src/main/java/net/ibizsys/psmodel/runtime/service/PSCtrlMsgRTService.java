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
import net.ibizsys.psmodel.core.domain.PSCtrlMsg;
import net.ibizsys.psmodel.core.service.IPSCtrlMsgService;
import net.ibizsys.psmodel.core.filter.PSCtrlMsgFilter;


public class PSCtrlMsgRTService extends PSModelRTServiceBase<PSCtrlMsg, PSCtrlMsgFilter> implements IPSCtrlMsgService{
    private static final Log log = LogFactory.getLog(PSCtrlMsgRTService.class);

    @Override
    public PSCtrlMsg createDomain(){
        return new PSCtrlMsg();
    }

    @Override
    public PSCtrlMsgFilter createFilter(){
        return new PSCtrlMsgFilter();
	}

	@Override
	public PSCtrlMsg getDomain(Object params) {
		if(params instanceof PSCtrlMsg) {
			return (PSCtrlMsg)params;
		}
		return getMapper().convertValue(params, PSCtrlMsg.class);
	}

	@Override
	public PSCtrlMsgFilter getFilter(Object params) {
		if(params instanceof PSCtrlMsgFilter) {
			return (PSCtrlMsgFilter)params;
		}
		return getMapper().convertValue(params, PSCtrlMsgFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSCTRLMSG";
        }
        else{
            return "PSCTRLMSGS";
        }
	}
}
