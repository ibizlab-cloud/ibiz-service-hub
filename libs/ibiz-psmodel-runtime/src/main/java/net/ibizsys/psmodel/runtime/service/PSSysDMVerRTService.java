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
import net.ibizsys.psmodel.core.domain.PSSysDMVer;
import net.ibizsys.psmodel.core.service.IPSSysDMVerService;
import net.ibizsys.psmodel.core.filter.PSSysDMVerFilter;


public class PSSysDMVerRTService extends PSModelRTServiceBase<PSSysDMVer, PSSysDMVerFilter> implements IPSSysDMVerService{
    private static final Log log = LogFactory.getLog(PSSysDMVerRTService.class);

    @Override
    public PSSysDMVer createDomain(){
        return new PSSysDMVer();
    }

    @Override
    public PSSysDMVerFilter createFilter(){
        return new PSSysDMVerFilter();
	}

	@Override
	public PSSysDMVer getDomain(Object params) {
		if(params instanceof PSSysDMVer) {
			return (PSSysDMVer)params;
		}
		return getMapper().convertValue(params, PSSysDMVer.class);
	}

	@Override
	public PSSysDMVerFilter getFilter(Object params) {
		if(params instanceof PSSysDMVerFilter) {
			return (PSSysDMVerFilter)params;
		}
		return getMapper().convertValue(params, PSSysDMVerFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSDMVER";
        }
        else{
            return "PSSYSDMVERS";
        }
	}
}
