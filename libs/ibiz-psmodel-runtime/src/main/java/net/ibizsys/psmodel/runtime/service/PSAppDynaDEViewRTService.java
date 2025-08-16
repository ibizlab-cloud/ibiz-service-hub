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
import net.ibizsys.psmodel.core.domain.PSAppDynaDEView;
import net.ibizsys.psmodel.core.service.IPSAppDynaDEViewService;
import net.ibizsys.psmodel.core.filter.PSAppDynaDEViewFilter;


public class PSAppDynaDEViewRTService extends PSModelRTServiceBase<PSAppDynaDEView, PSAppDynaDEViewFilter> implements IPSAppDynaDEViewService{
    private static final Log log = LogFactory.getLog(PSAppDynaDEViewRTService.class);

    @Override
    public PSAppDynaDEView createDomain(){
        return new PSAppDynaDEView();
    }

    @Override
    public PSAppDynaDEViewFilter createFilter(){
        return new PSAppDynaDEViewFilter();
	}

	@Override
	public PSAppDynaDEView getDomain(Object params) {
		if(params instanceof PSAppDynaDEView) {
			return (PSAppDynaDEView)params;
		}
		return getMapper().convertValue(params, PSAppDynaDEView.class);
	}

	@Override
	public PSAppDynaDEViewFilter getFilter(Object params) {
		if(params instanceof PSAppDynaDEViewFilter) {
			return (PSAppDynaDEViewFilter)params;
		}
		return getMapper().convertValue(params, PSAppDynaDEViewFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPDYNADEVIEW";
        }
        else{
            return "PSAPPDYNADEVIEWS";
        }
	}
}
