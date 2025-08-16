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
import net.ibizsys.psmodel.core.domain.PSDEFInputTip;
import net.ibizsys.psmodel.core.service.IPSDEFInputTipService;
import net.ibizsys.psmodel.core.filter.PSDEFInputTipFilter;


public class PSDEFInputTipRTService extends PSModelRTServiceBase<PSDEFInputTip, PSDEFInputTipFilter> implements IPSDEFInputTipService{
    private static final Log log = LogFactory.getLog(PSDEFInputTipRTService.class);

    @Override
    public PSDEFInputTip createDomain(){
        return new PSDEFInputTip();
    }

    @Override
    public PSDEFInputTipFilter createFilter(){
        return new PSDEFInputTipFilter();
	}

	@Override
	public PSDEFInputTip getDomain(Object params) {
		if(params instanceof PSDEFInputTip) {
			return (PSDEFInputTip)params;
		}
		return getMapper().convertValue(params, PSDEFInputTip.class);
	}

	@Override
	public PSDEFInputTipFilter getFilter(Object params) {
		if(params instanceof PSDEFInputTipFilter) {
			return (PSDEFInputTipFilter)params;
		}
		return getMapper().convertValue(params, PSDEFInputTipFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEFINPUTTIP";
        }
        else{
            return "PSDEFINPUTTIPS";
        }
	}
}
