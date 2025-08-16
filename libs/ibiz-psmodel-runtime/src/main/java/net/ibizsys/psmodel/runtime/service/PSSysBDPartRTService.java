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
import net.ibizsys.psmodel.core.domain.PSSysBDPart;
import net.ibizsys.psmodel.core.service.IPSSysBDPartService;
import net.ibizsys.psmodel.core.filter.PSSysBDPartFilter;


public class PSSysBDPartRTService extends PSModelRTServiceBase<PSSysBDPart, PSSysBDPartFilter> implements IPSSysBDPartService{
    private static final Log log = LogFactory.getLog(PSSysBDPartRTService.class);

    @Override
    public PSSysBDPart createDomain(){
        return new PSSysBDPart();
    }

    @Override
    public PSSysBDPartFilter createFilter(){
        return new PSSysBDPartFilter();
	}

	@Override
	public PSSysBDPart getDomain(Object params) {
		if(params instanceof PSSysBDPart) {
			return (PSSysBDPart)params;
		}
		return getMapper().convertValue(params, PSSysBDPart.class);
	}

	@Override
	public PSSysBDPartFilter getFilter(Object params) {
		if(params instanceof PSSysBDPartFilter) {
			return (PSSysBDPartFilter)params;
		}
		return getMapper().convertValue(params, PSSysBDPartFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBDPART";
        }
        else{
            return "PSSYSBDPARTS";
        }
	}
}
