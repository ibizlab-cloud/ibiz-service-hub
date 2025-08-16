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
import net.ibizsys.psmodel.core.domain.PSSysContentCat;
import net.ibizsys.psmodel.core.service.IPSSysContentCatService;
import net.ibizsys.psmodel.core.filter.PSSysContentCatFilter;


public class PSSysContentCatRTService extends PSModelRTServiceBase<PSSysContentCat, PSSysContentCatFilter> implements IPSSysContentCatService{
    private static final Log log = LogFactory.getLog(PSSysContentCatRTService.class);

    @Override
    public PSSysContentCat createDomain(){
        return new PSSysContentCat();
    }

    @Override
    public PSSysContentCatFilter createFilter(){
        return new PSSysContentCatFilter();
	}

	@Override
	public PSSysContentCat getDomain(Object params) {
		if(params instanceof PSSysContentCat) {
			return (PSSysContentCat)params;
		}
		return getMapper().convertValue(params, PSSysContentCat.class);
	}

	@Override
	public PSSysContentCatFilter getFilter(Object params) {
		if(params instanceof PSSysContentCatFilter) {
			return (PSSysContentCatFilter)params;
		}
		return getMapper().convertValue(params, PSSysContentCatFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSCONTENTCAT";
        }
        else{
            return "PSSYSCONTENTCATS";
        }
	}
}
