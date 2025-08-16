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
import net.ibizsys.psmodel.core.domain.PSSysPFPITempl;
import net.ibizsys.psmodel.core.service.IPSSysPFPITemplService;
import net.ibizsys.psmodel.core.filter.PSSysPFPITemplFilter;


public class PSSysPFPITemplRTService extends PSModelRTServiceBase<PSSysPFPITempl, PSSysPFPITemplFilter> implements IPSSysPFPITemplService{
    private static final Log log = LogFactory.getLog(PSSysPFPITemplRTService.class);

    @Override
    public PSSysPFPITempl createDomain(){
        return new PSSysPFPITempl();
    }

    @Override
    public PSSysPFPITemplFilter createFilter(){
        return new PSSysPFPITemplFilter();
	}

	@Override
	public PSSysPFPITempl getDomain(Object params) {
		if(params instanceof PSSysPFPITempl) {
			return (PSSysPFPITempl)params;
		}
		return getMapper().convertValue(params, PSSysPFPITempl.class);
	}

	@Override
	public PSSysPFPITemplFilter getFilter(Object params) {
		if(params instanceof PSSysPFPITemplFilter) {
			return (PSSysPFPITemplFilter)params;
		}
		return getMapper().convertValue(params, PSSysPFPITemplFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSPFPITEMPL";
        }
        else{
            return "PSSYSPFPITEMPLS";
        }
	}
}
