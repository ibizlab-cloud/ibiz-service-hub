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
import net.ibizsys.psmodel.core.domain.PSCorePrdCat;
import net.ibizsys.psmodel.core.service.IPSCorePrdCatService;
import net.ibizsys.psmodel.core.filter.PSCorePrdCatFilter;


public class PSCorePrdCatRTService extends PSModelRTServiceBase<PSCorePrdCat, PSCorePrdCatFilter> implements IPSCorePrdCatService{
    private static final Log log = LogFactory.getLog(PSCorePrdCatRTService.class);

    @Override
    public PSCorePrdCat createDomain(){
        return new PSCorePrdCat();
    }

    @Override
    public PSCorePrdCatFilter createFilter(){
        return new PSCorePrdCatFilter();
	}

	@Override
	public PSCorePrdCat getDomain(Object params) {
		if(params instanceof PSCorePrdCat) {
			return (PSCorePrdCat)params;
		}
		return getMapper().convertValue(params, PSCorePrdCat.class);
	}

	@Override
	public PSCorePrdCatFilter getFilter(Object params) {
		if(params instanceof PSCorePrdCatFilter) {
			return (PSCorePrdCatFilter)params;
		}
		return getMapper().convertValue(params, PSCorePrdCatFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSCOREPRDCAT";
        }
        else{
            return "PSCOREPRDCATS";
        }
	}
}
