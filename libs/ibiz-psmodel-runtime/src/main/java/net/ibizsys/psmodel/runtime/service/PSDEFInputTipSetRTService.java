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
import net.ibizsys.psmodel.core.domain.PSDEFInputTipSet;
import net.ibizsys.psmodel.core.service.IPSDEFInputTipSetService;
import net.ibizsys.psmodel.core.filter.PSDEFInputTipSetFilter;


public class PSDEFInputTipSetRTService extends PSModelRTServiceBase<PSDEFInputTipSet, PSDEFInputTipSetFilter> implements IPSDEFInputTipSetService{
    private static final Log log = LogFactory.getLog(PSDEFInputTipSetRTService.class);

    @Override
    public PSDEFInputTipSet createDomain(){
        return new PSDEFInputTipSet();
    }

    @Override
    public PSDEFInputTipSetFilter createFilter(){
        return new PSDEFInputTipSetFilter();
	}

	@Override
	public PSDEFInputTipSet getDomain(Object params) {
		if(params instanceof PSDEFInputTipSet) {
			return (PSDEFInputTipSet)params;
		}
		return getMapper().convertValue(params, PSDEFInputTipSet.class);
	}

	@Override
	public PSDEFInputTipSetFilter getFilter(Object params) {
		if(params instanceof PSDEFInputTipSetFilter) {
			return (PSDEFInputTipSetFilter)params;
		}
		return getMapper().convertValue(params, PSDEFInputTipSetFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEFINPUTTIPSET";
        }
        else{
            return "PSDEFINPUTTIPSETS";
        }
	}
}
