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
import net.ibizsys.psmodel.core.domain.PSSysBDTableDER;
import net.ibizsys.psmodel.core.service.IPSSysBDTableDERService;
import net.ibizsys.psmodel.core.filter.PSSysBDTableDERFilter;


public class PSSysBDTableDERRTService extends PSModelRTServiceBase<PSSysBDTableDER, PSSysBDTableDERFilter> implements IPSSysBDTableDERService{
    private static final Log log = LogFactory.getLog(PSSysBDTableDERRTService.class);

    @Override
    public PSSysBDTableDER createDomain(){
        return new PSSysBDTableDER();
    }

    @Override
    public PSSysBDTableDERFilter createFilter(){
        return new PSSysBDTableDERFilter();
	}

	@Override
	public PSSysBDTableDER getDomain(Object params) {
		if(params instanceof PSSysBDTableDER) {
			return (PSSysBDTableDER)params;
		}
		return getMapper().convertValue(params, PSSysBDTableDER.class);
	}

	@Override
	public PSSysBDTableDERFilter getFilter(Object params) {
		if(params instanceof PSSysBDTableDERFilter) {
			return (PSSysBDTableDERFilter)params;
		}
		return getMapper().convertValue(params, PSSysBDTableDERFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBDTABLEDER";
        }
        else{
            return "PSSYSBDTABLEDERS";
        }
	}
}
