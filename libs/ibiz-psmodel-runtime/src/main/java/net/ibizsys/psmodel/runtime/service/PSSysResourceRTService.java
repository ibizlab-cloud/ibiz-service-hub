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
import net.ibizsys.psmodel.core.domain.PSSysResource;
import net.ibizsys.psmodel.core.service.IPSSysResourceService;
import net.ibizsys.psmodel.core.filter.PSSysResourceFilter;


public class PSSysResourceRTService extends PSModelRTServiceBase<PSSysResource, PSSysResourceFilter> implements IPSSysResourceService{
    private static final Log log = LogFactory.getLog(PSSysResourceRTService.class);

    @Override
    public PSSysResource createDomain(){
        return new PSSysResource();
    }

    @Override
    public PSSysResourceFilter createFilter(){
        return new PSSysResourceFilter();
	}

	@Override
	public PSSysResource getDomain(Object params) {
		if(params instanceof PSSysResource) {
			return (PSSysResource)params;
		}
		return getMapper().convertValue(params, PSSysResource.class);
	}

	@Override
	public PSSysResourceFilter getFilter(Object params) {
		if(params instanceof PSSysResourceFilter) {
			return (PSSysResourceFilter)params;
		}
		return getMapper().convertValue(params, PSSysResourceFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSRESOURCE";
        }
        else{
            return "PSSYSRESOURCES";
        }
	}
}
