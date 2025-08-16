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
import net.ibizsys.psmodel.core.domain.PSSysWFCat;
import net.ibizsys.psmodel.core.service.IPSSysWFCatService;
import net.ibizsys.psmodel.core.filter.PSSysWFCatFilter;


public class PSSysWFCatRTService extends PSModelRTServiceBase<PSSysWFCat, PSSysWFCatFilter> implements IPSSysWFCatService{
    private static final Log log = LogFactory.getLog(PSSysWFCatRTService.class);

    @Override
    public PSSysWFCat createDomain(){
        return new PSSysWFCat();
    }

    @Override
    public PSSysWFCatFilter createFilter(){
        return new PSSysWFCatFilter();
	}

	@Override
	public PSSysWFCat getDomain(Object params) {
		if(params instanceof PSSysWFCat) {
			return (PSSysWFCat)params;
		}
		return getMapper().convertValue(params, PSSysWFCat.class);
	}

	@Override
	public PSSysWFCatFilter getFilter(Object params) {
		if(params instanceof PSSysWFCatFilter) {
			return (PSSysWFCatFilter)params;
		}
		return getMapper().convertValue(params, PSSysWFCatFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSWFCAT";
        }
        else{
            return "PSSYSWFCATS";
        }
	}
}
