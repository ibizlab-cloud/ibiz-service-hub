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
import net.ibizsys.psmodel.core.domain.PSDESAVR;
import net.ibizsys.psmodel.core.service.IPSDESAVRService;
import net.ibizsys.psmodel.core.filter.PSDESAVRFilter;


public class PSDESAVRRTService extends PSModelRTServiceBase<PSDESAVR, PSDESAVRFilter> implements IPSDESAVRService{
    private static final Log log = LogFactory.getLog(PSDESAVRRTService.class);

    @Override
    public PSDESAVR createDomain(){
        return new PSDESAVR();
    }

    @Override
    public PSDESAVRFilter createFilter(){
        return new PSDESAVRFilter();
	}

	@Override
	public PSDESAVR getDomain(Object params) {
		if(params instanceof PSDESAVR) {
			return (PSDESAVR)params;
		}
		return getMapper().convertValue(params, PSDESAVR.class);
	}

	@Override
	public PSDESAVRFilter getFilter(Object params) {
		if(params instanceof PSDESAVRFilter) {
			return (PSDESAVRFilter)params;
		}
		return getMapper().convertValue(params, PSDESAVRFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDESAVR";
        }
        else{
            return "PSDESAVRS";
        }
	}
}
