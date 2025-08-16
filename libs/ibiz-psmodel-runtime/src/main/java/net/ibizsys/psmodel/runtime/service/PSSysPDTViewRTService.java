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
import net.ibizsys.psmodel.core.domain.PSSysPDTView;
import net.ibizsys.psmodel.core.service.IPSSysPDTViewService;
import net.ibizsys.psmodel.core.filter.PSSysPDTViewFilter;


public class PSSysPDTViewRTService extends PSModelRTServiceBase<PSSysPDTView, PSSysPDTViewFilter> implements IPSSysPDTViewService{
    private static final Log log = LogFactory.getLog(PSSysPDTViewRTService.class);

    @Override
    public PSSysPDTView createDomain(){
        return new PSSysPDTView();
    }

    @Override
    public PSSysPDTViewFilter createFilter(){
        return new PSSysPDTViewFilter();
	}

	@Override
	public PSSysPDTView getDomain(Object params) {
		if(params instanceof PSSysPDTView) {
			return (PSSysPDTView)params;
		}
		return getMapper().convertValue(params, PSSysPDTView.class);
	}

	@Override
	public PSSysPDTViewFilter getFilter(Object params) {
		if(params instanceof PSSysPDTViewFilter) {
			return (PSSysPDTViewFilter)params;
		}
		return getMapper().convertValue(params, PSSysPDTViewFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSPDTVIEW";
        }
        else{
            return "PSSYSPDTVIEWS";
        }
	}
}
