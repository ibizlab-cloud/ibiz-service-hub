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
import net.ibizsys.psmodel.core.domain.PSSysCss;
import net.ibizsys.psmodel.core.service.IPSSysCssService;
import net.ibizsys.psmodel.core.filter.PSSysCssFilter;


public class PSSysCssRTService extends PSModelRTServiceBase<PSSysCss, PSSysCssFilter> implements IPSSysCssService{
    private static final Log log = LogFactory.getLog(PSSysCssRTService.class);

    @Override
    public PSSysCss createDomain(){
        return new PSSysCss();
    }

    @Override
    public PSSysCssFilter createFilter(){
        return new PSSysCssFilter();
	}

	@Override
	public PSSysCss getDomain(Object params) {
		if(params instanceof PSSysCss) {
			return (PSSysCss)params;
		}
		return getMapper().convertValue(params, PSSysCss.class);
	}

	@Override
	public PSSysCssFilter getFilter(Object params) {
		if(params instanceof PSSysCssFilter) {
			return (PSSysCssFilter)params;
		}
		return getMapper().convertValue(params, PSSysCssFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSCSS";
        }
        else{
            return "PSSYSCSSES";
        }
	}
}
