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
import net.ibizsys.psmodel.core.domain.PSWXLogic;
import net.ibizsys.psmodel.core.service.IPSWXLogicService;
import net.ibizsys.psmodel.core.filter.PSWXLogicFilter;


public class PSWXLogicRTService extends PSModelRTServiceBase<PSWXLogic, PSWXLogicFilter> implements IPSWXLogicService{
    private static final Log log = LogFactory.getLog(PSWXLogicRTService.class);

    @Override
    public PSWXLogic createDomain(){
        return new PSWXLogic();
    }

    @Override
    public PSWXLogicFilter createFilter(){
        return new PSWXLogicFilter();
	}

	@Override
	public PSWXLogic getDomain(Object params) {
		if(params instanceof PSWXLogic) {
			return (PSWXLogic)params;
		}
		return getMapper().convertValue(params, PSWXLogic.class);
	}

	@Override
	public PSWXLogicFilter getFilter(Object params) {
		if(params instanceof PSWXLogicFilter) {
			return (PSWXLogicFilter)params;
		}
		return getMapper().convertValue(params, PSWXLogicFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSWXLOGIC";
        }
        else{
            return "PSWXLOGICS";
        }
	}
}
