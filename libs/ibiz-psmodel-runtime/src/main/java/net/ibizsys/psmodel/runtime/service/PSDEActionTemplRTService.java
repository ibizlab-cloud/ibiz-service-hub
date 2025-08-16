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
import net.ibizsys.psmodel.core.domain.PSDEActionTempl;
import net.ibizsys.psmodel.core.service.IPSDEActionTemplService;
import net.ibizsys.psmodel.core.filter.PSDEActionTemplFilter;


public class PSDEActionTemplRTService extends PSModelRTServiceBase<PSDEActionTempl, PSDEActionTemplFilter> implements IPSDEActionTemplService{
    private static final Log log = LogFactory.getLog(PSDEActionTemplRTService.class);

    @Override
    public PSDEActionTempl createDomain(){
        return new PSDEActionTempl();
    }

    @Override
    public PSDEActionTemplFilter createFilter(){
        return new PSDEActionTemplFilter();
	}

	@Override
	public PSDEActionTempl getDomain(Object params) {
		if(params instanceof PSDEActionTempl) {
			return (PSDEActionTempl)params;
		}
		return getMapper().convertValue(params, PSDEActionTempl.class);
	}

	@Override
	public PSDEActionTemplFilter getFilter(Object params) {
		if(params instanceof PSDEActionTemplFilter) {
			return (PSDEActionTemplFilter)params;
		}
		return getMapper().convertValue(params, PSDEActionTemplFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEACTIONTEMPL";
        }
        else{
            return "PSDEACTIONTEMPLS";
        }
	}
}
