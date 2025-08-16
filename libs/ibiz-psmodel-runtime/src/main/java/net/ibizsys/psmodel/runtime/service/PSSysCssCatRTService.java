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
import net.ibizsys.psmodel.core.domain.PSSysCssCat;
import net.ibizsys.psmodel.core.service.IPSSysCssCatService;
import net.ibizsys.psmodel.core.filter.PSSysCssCatFilter;


public class PSSysCssCatRTService extends PSModelRTServiceBase<PSSysCssCat, PSSysCssCatFilter> implements IPSSysCssCatService{
    private static final Log log = LogFactory.getLog(PSSysCssCatRTService.class);

    @Override
    public PSSysCssCat createDomain(){
        return new PSSysCssCat();
    }

    @Override
    public PSSysCssCatFilter createFilter(){
        return new PSSysCssCatFilter();
	}

	@Override
	public PSSysCssCat getDomain(Object params) {
		if(params instanceof PSSysCssCat) {
			return (PSSysCssCat)params;
		}
		return getMapper().convertValue(params, PSSysCssCat.class);
	}

	@Override
	public PSSysCssCatFilter getFilter(Object params) {
		if(params instanceof PSSysCssCatFilter) {
			return (PSSysCssCatFilter)params;
		}
		return getMapper().convertValue(params, PSSysCssCatFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSCSSCAT";
        }
        else{
            return "PSSYSCSSCATS";
        }
	}
}
