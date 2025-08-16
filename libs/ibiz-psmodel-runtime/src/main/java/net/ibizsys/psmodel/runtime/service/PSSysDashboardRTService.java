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
import net.ibizsys.psmodel.core.domain.PSSysDashboard;
import net.ibizsys.psmodel.core.service.IPSSysDashboardService;
import net.ibizsys.psmodel.core.filter.PSSysDashboardFilter;


public class PSSysDashboardRTService extends PSModelRTServiceBase<PSSysDashboard, PSSysDashboardFilter> implements IPSSysDashboardService{
    private static final Log log = LogFactory.getLog(PSSysDashboardRTService.class);

    @Override
    public PSSysDashboard createDomain(){
        return new PSSysDashboard();
    }

    @Override
    public PSSysDashboardFilter createFilter(){
        return new PSSysDashboardFilter();
	}

	@Override
	public PSSysDashboard getDomain(Object params) {
		if(params instanceof PSSysDashboard) {
			return (PSSysDashboard)params;
		}
		return getMapper().convertValue(params, PSSysDashboard.class);
	}

	@Override
	public PSSysDashboardFilter getFilter(Object params) {
		if(params instanceof PSSysDashboardFilter) {
			return (PSSysDashboardFilter)params;
		}
		return getMapper().convertValue(params, PSSysDashboardFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSDASHBOARD";
        }
        else{
            return "PSSYSDASHBOARDS";
        }
	}
}
