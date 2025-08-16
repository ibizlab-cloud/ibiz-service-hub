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
import net.ibizsys.psmodel.core.domain.PSSysUnit;
import net.ibizsys.psmodel.core.service.IPSSysUnitService;
import net.ibizsys.psmodel.core.filter.PSSysUnitFilter;


public class PSSysUnitRTService extends PSModelRTServiceBase<PSSysUnit, PSSysUnitFilter> implements IPSSysUnitService{
    private static final Log log = LogFactory.getLog(PSSysUnitRTService.class);

    @Override
    public PSSysUnit createDomain(){
        return new PSSysUnit();
    }

    @Override
    public PSSysUnitFilter createFilter(){
        return new PSSysUnitFilter();
	}

	@Override
	public PSSysUnit getDomain(Object params) {
		if(params instanceof PSSysUnit) {
			return (PSSysUnit)params;
		}
		return getMapper().convertValue(params, PSSysUnit.class);
	}

	@Override
	public PSSysUnitFilter getFilter(Object params) {
		if(params instanceof PSSysUnitFilter) {
			return (PSSysUnitFilter)params;
		}
		return getMapper().convertValue(params, PSSysUnitFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSUNIT";
        }
        else{
            return "PSSYSUNITS";
        }
	}
}
