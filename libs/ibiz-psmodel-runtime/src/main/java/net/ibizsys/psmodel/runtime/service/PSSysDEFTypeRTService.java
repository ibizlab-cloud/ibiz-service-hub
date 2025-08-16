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
import net.ibizsys.psmodel.core.domain.PSSysDEFType;
import net.ibizsys.psmodel.core.service.IPSSysDEFTypeService;
import net.ibizsys.psmodel.core.filter.PSSysDEFTypeFilter;


public class PSSysDEFTypeRTService extends PSModelRTServiceBase<PSSysDEFType, PSSysDEFTypeFilter> implements IPSSysDEFTypeService{
    private static final Log log = LogFactory.getLog(PSSysDEFTypeRTService.class);

    @Override
    public PSSysDEFType createDomain(){
        return new PSSysDEFType();
    }

    @Override
    public PSSysDEFTypeFilter createFilter(){
        return new PSSysDEFTypeFilter();
	}

	@Override
	public PSSysDEFType getDomain(Object params) {
		if(params instanceof PSSysDEFType) {
			return (PSSysDEFType)params;
		}
		return getMapper().convertValue(params, PSSysDEFType.class);
	}

	@Override
	public PSSysDEFTypeFilter getFilter(Object params) {
		if(params instanceof PSSysDEFTypeFilter) {
			return (PSSysDEFTypeFilter)params;
		}
		return getMapper().convertValue(params, PSSysDEFTypeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSDEFTYPE";
        }
        else{
            return "PSSYSDEFTYPES";
        }
	}
}
