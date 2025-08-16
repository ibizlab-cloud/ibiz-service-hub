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
import net.ibizsys.psmodel.core.domain.PSDEDQCodeCond;
import net.ibizsys.psmodel.core.service.IPSDEDQCodeCondService;
import net.ibizsys.psmodel.core.filter.PSDEDQCodeCondFilter;


public class PSDEDQCodeCondRTService extends PSModelRTServiceBase<PSDEDQCodeCond, PSDEDQCodeCondFilter> implements IPSDEDQCodeCondService{
    private static final Log log = LogFactory.getLog(PSDEDQCodeCondRTService.class);

    @Override
    public PSDEDQCodeCond createDomain(){
        return new PSDEDQCodeCond();
    }

    @Override
    public PSDEDQCodeCondFilter createFilter(){
        return new PSDEDQCodeCondFilter();
	}

	@Override
	public PSDEDQCodeCond getDomain(Object params) {
		if(params instanceof PSDEDQCodeCond) {
			return (PSDEDQCodeCond)params;
		}
		return getMapper().convertValue(params, PSDEDQCodeCond.class);
	}

	@Override
	public PSDEDQCodeCondFilter getFilter(Object params) {
		if(params instanceof PSDEDQCodeCondFilter) {
			return (PSDEDQCodeCondFilter)params;
		}
		return getMapper().convertValue(params, PSDEDQCodeCondFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEDQCODECOND";
        }
        else{
            return "PSDEDQCODECONDS";
        }
	}
}
