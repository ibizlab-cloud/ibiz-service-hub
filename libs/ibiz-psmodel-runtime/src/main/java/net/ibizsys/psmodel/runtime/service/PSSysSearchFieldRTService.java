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
import net.ibizsys.psmodel.core.domain.PSSysSearchField;
import net.ibizsys.psmodel.core.service.IPSSysSearchFieldService;
import net.ibizsys.psmodel.core.filter.PSSysSearchFieldFilter;


public class PSSysSearchFieldRTService extends PSModelRTServiceBase<PSSysSearchField, PSSysSearchFieldFilter> implements IPSSysSearchFieldService{
    private static final Log log = LogFactory.getLog(PSSysSearchFieldRTService.class);

    @Override
    public PSSysSearchField createDomain(){
        return new PSSysSearchField();
    }

    @Override
    public PSSysSearchFieldFilter createFilter(){
        return new PSSysSearchFieldFilter();
	}

	@Override
	public PSSysSearchField getDomain(Object params) {
		if(params instanceof PSSysSearchField) {
			return (PSSysSearchField)params;
		}
		return getMapper().convertValue(params, PSSysSearchField.class);
	}

	@Override
	public PSSysSearchFieldFilter getFilter(Object params) {
		if(params instanceof PSSysSearchFieldFilter) {
			return (PSSysSearchFieldFilter)params;
		}
		return getMapper().convertValue(params, PSSysSearchFieldFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSSEARCHFIELD";
        }
        else{
            return "PSSYSSEARCHFIELDS";
        }
	}
}
