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
import net.ibizsys.psmodel.core.domain.PSSysDynaModelCat;
import net.ibizsys.psmodel.core.service.IPSSysDynaModelCatService;
import net.ibizsys.psmodel.core.filter.PSSysDynaModelCatFilter;


public class PSSysDynaModelCatRTService extends PSModelRTServiceBase<PSSysDynaModelCat, PSSysDynaModelCatFilter> implements IPSSysDynaModelCatService{
    private static final Log log = LogFactory.getLog(PSSysDynaModelCatRTService.class);

    @Override
    public PSSysDynaModelCat createDomain(){
        return new PSSysDynaModelCat();
    }

    @Override
    public PSSysDynaModelCatFilter createFilter(){
        return new PSSysDynaModelCatFilter();
	}

	@Override
	public PSSysDynaModelCat getDomain(Object params) {
		if(params instanceof PSSysDynaModelCat) {
			return (PSSysDynaModelCat)params;
		}
		return getMapper().convertValue(params, PSSysDynaModelCat.class);
	}

	@Override
	public PSSysDynaModelCatFilter getFilter(Object params) {
		if(params instanceof PSSysDynaModelCatFilter) {
			return (PSSysDynaModelCatFilter)params;
		}
		return getMapper().convertValue(params, PSSysDynaModelCatFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSDYNAMODELCAT";
        }
        else{
            return "PSSYSDYNAMODELCATS";
        }
	}
}
