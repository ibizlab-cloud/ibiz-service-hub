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
import net.ibizsys.psmodel.core.domain.PSSysContent;
import net.ibizsys.psmodel.core.service.IPSSysContentService;
import net.ibizsys.psmodel.core.filter.PSSysContentFilter;


public class PSSysContentRTService extends PSModelRTServiceBase<PSSysContent, PSSysContentFilter> implements IPSSysContentService{
    private static final Log log = LogFactory.getLog(PSSysContentRTService.class);

    @Override
    public PSSysContent createDomain(){
        return new PSSysContent();
    }

    @Override
    public PSSysContentFilter createFilter(){
        return new PSSysContentFilter();
	}

	@Override
	public PSSysContent getDomain(Object params) {
		if(params instanceof PSSysContent) {
			return (PSSysContent)params;
		}
		return getMapper().convertValue(params, PSSysContent.class);
	}

	@Override
	public PSSysContentFilter getFilter(Object params) {
		if(params instanceof PSSysContentFilter) {
			return (PSSysContentFilter)params;
		}
		return getMapper().convertValue(params, PSSysContentFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSCONTENT";
        }
        else{
            return "PSSYSCONTENTS";
        }
	}
}
