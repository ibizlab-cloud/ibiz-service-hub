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
import net.ibizsys.psmodel.core.domain.PSSysEAIDE;
import net.ibizsys.psmodel.core.service.IPSSysEAIDEService;
import net.ibizsys.psmodel.core.filter.PSSysEAIDEFilter;


public class PSSysEAIDERTService extends PSModelRTServiceBase<PSSysEAIDE, PSSysEAIDEFilter> implements IPSSysEAIDEService{
    private static final Log log = LogFactory.getLog(PSSysEAIDERTService.class);

    @Override
    public PSSysEAIDE createDomain(){
        return new PSSysEAIDE();
    }

    @Override
    public PSSysEAIDEFilter createFilter(){
        return new PSSysEAIDEFilter();
	}

	@Override
	public PSSysEAIDE getDomain(Object params) {
		if(params instanceof PSSysEAIDE) {
			return (PSSysEAIDE)params;
		}
		return getMapper().convertValue(params, PSSysEAIDE.class);
	}

	@Override
	public PSSysEAIDEFilter getFilter(Object params) {
		if(params instanceof PSSysEAIDEFilter) {
			return (PSSysEAIDEFilter)params;
		}
		return getMapper().convertValue(params, PSSysEAIDEFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSEAIDE";
        }
        else{
            return "PSSYSEAIDES";
        }
	}
}
