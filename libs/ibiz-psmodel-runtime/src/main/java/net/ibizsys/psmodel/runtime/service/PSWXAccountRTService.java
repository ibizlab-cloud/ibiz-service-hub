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
import net.ibizsys.psmodel.core.domain.PSWXAccount;
import net.ibizsys.psmodel.core.service.IPSWXAccountService;
import net.ibizsys.psmodel.core.filter.PSWXAccountFilter;


public class PSWXAccountRTService extends PSModelRTServiceBase<PSWXAccount, PSWXAccountFilter> implements IPSWXAccountService{
    private static final Log log = LogFactory.getLog(PSWXAccountRTService.class);

    @Override
    public PSWXAccount createDomain(){
        return new PSWXAccount();
    }

    @Override
    public PSWXAccountFilter createFilter(){
        return new PSWXAccountFilter();
	}

	@Override
	public PSWXAccount getDomain(Object params) {
		if(params instanceof PSWXAccount) {
			return (PSWXAccount)params;
		}
		return getMapper().convertValue(params, PSWXAccount.class);
	}

	@Override
	public PSWXAccountFilter getFilter(Object params) {
		if(params instanceof PSWXAccountFilter) {
			return (PSWXAccountFilter)params;
		}
		return getMapper().convertValue(params, PSWXAccountFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSWXACCOUNT";
        }
        else{
            return "PSWXACCOUNTS";
        }
	}
}
