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
import net.ibizsys.psmodel.core.domain.PSMobAppPack;
import net.ibizsys.psmodel.core.service.IPSMobAppPackService;
import net.ibizsys.psmodel.core.filter.PSMobAppPackFilter;


public class PSMobAppPackRTService extends PSModelRTServiceBase<PSMobAppPack, PSMobAppPackFilter> implements IPSMobAppPackService{
    private static final Log log = LogFactory.getLog(PSMobAppPackRTService.class);

    @Override
    public PSMobAppPack createDomain(){
        return new PSMobAppPack();
    }

    @Override
    public PSMobAppPackFilter createFilter(){
        return new PSMobAppPackFilter();
	}

	@Override
	public PSMobAppPack getDomain(Object params) {
		if(params instanceof PSMobAppPack) {
			return (PSMobAppPack)params;
		}
		return getMapper().convertValue(params, PSMobAppPack.class);
	}

	@Override
	public PSMobAppPackFilter getFilter(Object params) {
		if(params instanceof PSMobAppPackFilter) {
			return (PSMobAppPackFilter)params;
		}
		return getMapper().convertValue(params, PSMobAppPackFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSMOBAPPPACK";
        }
        else{
            return "PSMOBAPPPACKS";
        }
	}
}
