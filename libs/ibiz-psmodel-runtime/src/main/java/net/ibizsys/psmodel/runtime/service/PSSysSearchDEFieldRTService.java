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
import net.ibizsys.psmodel.core.domain.PSSysSearchDEField;
import net.ibizsys.psmodel.core.service.IPSSysSearchDEFieldService;
import net.ibizsys.psmodel.core.filter.PSSysSearchDEFieldFilter;


public class PSSysSearchDEFieldRTService extends PSModelRTServiceBase<PSSysSearchDEField, PSSysSearchDEFieldFilter> implements IPSSysSearchDEFieldService{
    private static final Log log = LogFactory.getLog(PSSysSearchDEFieldRTService.class);

    @Override
    public PSSysSearchDEField createDomain(){
        return new PSSysSearchDEField();
    }

    @Override
    public PSSysSearchDEFieldFilter createFilter(){
        return new PSSysSearchDEFieldFilter();
	}

	@Override
	public PSSysSearchDEField getDomain(Object params) {
		if(params instanceof PSSysSearchDEField) {
			return (PSSysSearchDEField)params;
		}
		return getMapper().convertValue(params, PSSysSearchDEField.class);
	}

	@Override
	public PSSysSearchDEFieldFilter getFilter(Object params) {
		if(params instanceof PSSysSearchDEFieldFilter) {
			return (PSSysSearchDEFieldFilter)params;
		}
		return getMapper().convertValue(params, PSSysSearchDEFieldFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSSEARCHDEFIELD";
        }
        else{
            return "PSSYSSEARCHDEFIELDS";
        }
	}
}
