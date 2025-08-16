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
import net.ibizsys.psmodel.core.domain.PSSysSearchDoc;
import net.ibizsys.psmodel.core.service.IPSSysSearchDocService;
import net.ibizsys.psmodel.core.filter.PSSysSearchDocFilter;


public class PSSysSearchDocRTService extends PSModelRTServiceBase<PSSysSearchDoc, PSSysSearchDocFilter> implements IPSSysSearchDocService{
    private static final Log log = LogFactory.getLog(PSSysSearchDocRTService.class);

    @Override
    public PSSysSearchDoc createDomain(){
        return new PSSysSearchDoc();
    }

    @Override
    public PSSysSearchDocFilter createFilter(){
        return new PSSysSearchDocFilter();
	}

	@Override
	public PSSysSearchDoc getDomain(Object params) {
		if(params instanceof PSSysSearchDoc) {
			return (PSSysSearchDoc)params;
		}
		return getMapper().convertValue(params, PSSysSearchDoc.class);
	}

	@Override
	public PSSysSearchDocFilter getFilter(Object params) {
		if(params instanceof PSSysSearchDocFilter) {
			return (PSSysSearchDocFilter)params;
		}
		return getMapper().convertValue(params, PSSysSearchDocFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSSEARCHDOC";
        }
        else{
            return "PSSYSSEARCHDOCS";
        }
	}
}
