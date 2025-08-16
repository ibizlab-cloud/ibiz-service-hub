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
import net.ibizsys.psmodel.core.domain.PSSysViewLogic;
import net.ibizsys.psmodel.core.service.IPSSysViewLogicService;
import net.ibizsys.psmodel.core.filter.PSSysViewLogicFilter;


public class PSSysViewLogicRTService extends PSModelRTServiceBase<PSSysViewLogic, PSSysViewLogicFilter> implements IPSSysViewLogicService{
    private static final Log log = LogFactory.getLog(PSSysViewLogicRTService.class);

    @Override
    public PSSysViewLogic createDomain(){
        return new PSSysViewLogic();
    }

    @Override
    public PSSysViewLogicFilter createFilter(){
        return new PSSysViewLogicFilter();
	}

	@Override
	public PSSysViewLogic getDomain(Object params) {
		if(params instanceof PSSysViewLogic) {
			return (PSSysViewLogic)params;
		}
		return getMapper().convertValue(params, PSSysViewLogic.class);
	}

	@Override
	public PSSysViewLogicFilter getFilter(Object params) {
		if(params instanceof PSSysViewLogicFilter) {
			return (PSSysViewLogicFilter)params;
		}
		return getMapper().convertValue(params, PSSysViewLogicFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSVIEWLOGIC";
        }
        else{
            return "PSSYSVIEWLOGICS";
        }
	}
}
