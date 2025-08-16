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
import net.ibizsys.psmodel.core.domain.PSAppPDTView;
import net.ibizsys.psmodel.core.service.IPSAppPDTViewService;
import net.ibizsys.psmodel.core.filter.PSAppPDTViewFilter;


public class PSAppPDTViewRTService extends PSModelRTServiceBase<PSAppPDTView, PSAppPDTViewFilter> implements IPSAppPDTViewService{
    private static final Log log = LogFactory.getLog(PSAppPDTViewRTService.class);

    @Override
    public PSAppPDTView createDomain(){
        return new PSAppPDTView();
    }

    @Override
    public PSAppPDTViewFilter createFilter(){
        return new PSAppPDTViewFilter();
	}

	@Override
	public PSAppPDTView getDomain(Object params) {
		if(params instanceof PSAppPDTView) {
			return (PSAppPDTView)params;
		}
		return getMapper().convertValue(params, PSAppPDTView.class);
	}

	@Override
	public PSAppPDTViewFilter getFilter(Object params) {
		if(params instanceof PSAppPDTViewFilter) {
			return (PSAppPDTViewFilter)params;
		}
		return getMapper().convertValue(params, PSAppPDTViewFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPPDTVIEW";
        }
        else{
            return "PSAPPPDTVIEWS";
        }
	}
}
