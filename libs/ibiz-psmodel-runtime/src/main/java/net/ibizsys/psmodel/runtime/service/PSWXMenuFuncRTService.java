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
import net.ibizsys.psmodel.core.domain.PSWXMenuFunc;
import net.ibizsys.psmodel.core.service.IPSWXMenuFuncService;
import net.ibizsys.psmodel.core.filter.PSWXMenuFuncFilter;


public class PSWXMenuFuncRTService extends PSModelRTServiceBase<PSWXMenuFunc, PSWXMenuFuncFilter> implements IPSWXMenuFuncService{
    private static final Log log = LogFactory.getLog(PSWXMenuFuncRTService.class);

    @Override
    public PSWXMenuFunc createDomain(){
        return new PSWXMenuFunc();
    }

    @Override
    public PSWXMenuFuncFilter createFilter(){
        return new PSWXMenuFuncFilter();
	}

	@Override
	public PSWXMenuFunc getDomain(Object params) {
		if(params instanceof PSWXMenuFunc) {
			return (PSWXMenuFunc)params;
		}
		return getMapper().convertValue(params, PSWXMenuFunc.class);
	}

	@Override
	public PSWXMenuFuncFilter getFilter(Object params) {
		if(params instanceof PSWXMenuFuncFilter) {
			return (PSWXMenuFuncFilter)params;
		}
		return getMapper().convertValue(params, PSWXMenuFuncFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSWXMENUFUNC";
        }
        else{
            return "PSWXMENUFUNCS";
        }
	}
}
