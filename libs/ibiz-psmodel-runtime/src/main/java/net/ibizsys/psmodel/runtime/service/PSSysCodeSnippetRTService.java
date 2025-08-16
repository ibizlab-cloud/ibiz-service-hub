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
import net.ibizsys.psmodel.core.domain.PSSysCodeSnippet;
import net.ibizsys.psmodel.core.service.IPSSysCodeSnippetService;
import net.ibizsys.psmodel.core.filter.PSSysCodeSnippetFilter;


public class PSSysCodeSnippetRTService extends PSModelRTServiceBase<PSSysCodeSnippet, PSSysCodeSnippetFilter> implements IPSSysCodeSnippetService{
    private static final Log log = LogFactory.getLog(PSSysCodeSnippetRTService.class);

    @Override
    public PSSysCodeSnippet createDomain(){
        return new PSSysCodeSnippet();
    }

    @Override
    public PSSysCodeSnippetFilter createFilter(){
        return new PSSysCodeSnippetFilter();
	}

	@Override
	public PSSysCodeSnippet getDomain(Object params) {
		if(params instanceof PSSysCodeSnippet) {
			return (PSSysCodeSnippet)params;
		}
		return getMapper().convertValue(params, PSSysCodeSnippet.class);
	}

	@Override
	public PSSysCodeSnippetFilter getFilter(Object params) {
		if(params instanceof PSSysCodeSnippetFilter) {
			return (PSSysCodeSnippetFilter)params;
		}
		return getMapper().convertValue(params, PSSysCodeSnippetFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSCODESNIPPET";
        }
        else{
            return "PSSYSCODESNIPPETS";
        }
	}
}
