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
import net.ibizsys.psmodel.core.domain.PSSysMapView;
import net.ibizsys.psmodel.core.service.IPSSysMapViewService;
import net.ibizsys.psmodel.core.filter.PSSysMapViewFilter;


public class PSSysMapViewRTService extends PSModelRTServiceBase<PSSysMapView, PSSysMapViewFilter> implements IPSSysMapViewService{
    private static final Log log = LogFactory.getLog(PSSysMapViewRTService.class);

    @Override
    public PSSysMapView createDomain(){
        return new PSSysMapView();
    }

    @Override
    public PSSysMapViewFilter createFilter(){
        return new PSSysMapViewFilter();
	}

	@Override
	public PSSysMapView getDomain(Object params) {
		if(params instanceof PSSysMapView) {
			return (PSSysMapView)params;
		}
		return getMapper().convertValue(params, PSSysMapView.class);
	}

	@Override
	public PSSysMapViewFilter getFilter(Object params) {
		if(params instanceof PSSysMapViewFilter) {
			return (PSSysMapViewFilter)params;
		}
		return getMapper().convertValue(params, PSSysMapViewFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSMAPVIEW";
        }
        else{
            return "PSSYSMAPVIEWS";
        }
	}
}
