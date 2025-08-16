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
import net.ibizsys.psmodel.core.domain.PSSysEAIElement;
import net.ibizsys.psmodel.core.service.IPSSysEAIElementService;
import net.ibizsys.psmodel.core.filter.PSSysEAIElementFilter;


public class PSSysEAIElementRTService extends PSModelRTServiceBase<PSSysEAIElement, PSSysEAIElementFilter> implements IPSSysEAIElementService{
    private static final Log log = LogFactory.getLog(PSSysEAIElementRTService.class);

    @Override
    public PSSysEAIElement createDomain(){
        return new PSSysEAIElement();
    }

    @Override
    public PSSysEAIElementFilter createFilter(){
        return new PSSysEAIElementFilter();
	}

	@Override
	public PSSysEAIElement getDomain(Object params) {
		if(params instanceof PSSysEAIElement) {
			return (PSSysEAIElement)params;
		}
		return getMapper().convertValue(params, PSSysEAIElement.class);
	}

	@Override
	public PSSysEAIElementFilter getFilter(Object params) {
		if(params instanceof PSSysEAIElementFilter) {
			return (PSSysEAIElementFilter)params;
		}
		return getMapper().convertValue(params, PSSysEAIElementFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSEAIELEMENT";
        }
        else{
            return "PSSYSEAIELEMENTS";
        }
	}
}
