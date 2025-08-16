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
import net.ibizsys.psmodel.core.domain.PSSysBDTableDE;
import net.ibizsys.psmodel.core.service.IPSSysBDTableDEService;
import net.ibizsys.psmodel.core.filter.PSSysBDTableDEFilter;


public class PSSysBDTableDERTService extends PSModelRTServiceBase<PSSysBDTableDE, PSSysBDTableDEFilter> implements IPSSysBDTableDEService{
    private static final Log log = LogFactory.getLog(PSSysBDTableDERTService.class);

    @Override
    public PSSysBDTableDE createDomain(){
        return new PSSysBDTableDE();
    }

    @Override
    public PSSysBDTableDEFilter createFilter(){
        return new PSSysBDTableDEFilter();
	}

	@Override
	public PSSysBDTableDE getDomain(Object params) {
		if(params instanceof PSSysBDTableDE) {
			return (PSSysBDTableDE)params;
		}
		return getMapper().convertValue(params, PSSysBDTableDE.class);
	}

	@Override
	public PSSysBDTableDEFilter getFilter(Object params) {
		if(params instanceof PSSysBDTableDEFilter) {
			return (PSSysBDTableDEFilter)params;
		}
		return getMapper().convertValue(params, PSSysBDTableDEFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBDTABLEDE";
        }
        else{
            return "PSSYSBDTABLEDES";
        }
	}
}
