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
import net.ibizsys.psmodel.core.domain.PSSysDynaModelAttr;
import net.ibizsys.psmodel.core.service.IPSSysDynaModelAttrService;
import net.ibizsys.psmodel.core.filter.PSSysDynaModelAttrFilter;


public class PSSysDynaModelAttrRTService extends PSModelRTServiceBase<PSSysDynaModelAttr, PSSysDynaModelAttrFilter> implements IPSSysDynaModelAttrService{
    private static final Log log = LogFactory.getLog(PSSysDynaModelAttrRTService.class);

    @Override
    public PSSysDynaModelAttr createDomain(){
        return new PSSysDynaModelAttr();
    }

    @Override
    public PSSysDynaModelAttrFilter createFilter(){
        return new PSSysDynaModelAttrFilter();
	}

	@Override
	public PSSysDynaModelAttr getDomain(Object params) {
		if(params instanceof PSSysDynaModelAttr) {
			return (PSSysDynaModelAttr)params;
		}
		return getMapper().convertValue(params, PSSysDynaModelAttr.class);
	}

	@Override
	public PSSysDynaModelAttrFilter getFilter(Object params) {
		if(params instanceof PSSysDynaModelAttrFilter) {
			return (PSSysDynaModelAttrFilter)params;
		}
		return getMapper().convertValue(params, PSSysDynaModelAttrFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSDYNAMODELATTR";
        }
        else{
            return "PSSYSDYNAMODELATTRS";
        }
	}
}
