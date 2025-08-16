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
import net.ibizsys.psmodel.core.domain.PSDEMainState;
import net.ibizsys.psmodel.core.service.IPSDEMainStateService;
import net.ibizsys.psmodel.core.filter.PSDEMainStateFilter;


public class PSDEMainStateRTService extends PSModelRTServiceBase<PSDEMainState, PSDEMainStateFilter> implements IPSDEMainStateService{
    private static final Log log = LogFactory.getLog(PSDEMainStateRTService.class);

    @Override
    public PSDEMainState createDomain(){
        return new PSDEMainState();
    }

    @Override
    public PSDEMainStateFilter createFilter(){
        return new PSDEMainStateFilter();
	}

	@Override
	public PSDEMainState getDomain(Object params) {
		if(params instanceof PSDEMainState) {
			return (PSDEMainState)params;
		}
		return getMapper().convertValue(params, PSDEMainState.class);
	}

	@Override
	public PSDEMainStateFilter getFilter(Object params) {
		if(params instanceof PSDEMainStateFilter) {
			return (PSDEMainStateFilter)params;
		}
		return getMapper().convertValue(params, PSDEMainStateFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEMAINSTATE";
        }
        else{
            return "PSDEMAINSTATES";
        }
	}
}
