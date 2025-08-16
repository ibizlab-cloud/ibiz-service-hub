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
import net.ibizsys.psmodel.core.domain.PSSysEAIDataType;
import net.ibizsys.psmodel.core.service.IPSSysEAIDataTypeService;
import net.ibizsys.psmodel.core.filter.PSSysEAIDataTypeFilter;


public class PSSysEAIDataTypeRTService extends PSModelRTServiceBase<PSSysEAIDataType, PSSysEAIDataTypeFilter> implements IPSSysEAIDataTypeService{
    private static final Log log = LogFactory.getLog(PSSysEAIDataTypeRTService.class);

    @Override
    public PSSysEAIDataType createDomain(){
        return new PSSysEAIDataType();
    }

    @Override
    public PSSysEAIDataTypeFilter createFilter(){
        return new PSSysEAIDataTypeFilter();
	}

	@Override
	public PSSysEAIDataType getDomain(Object params) {
		if(params instanceof PSSysEAIDataType) {
			return (PSSysEAIDataType)params;
		}
		return getMapper().convertValue(params, PSSysEAIDataType.class);
	}

	@Override
	public PSSysEAIDataTypeFilter getFilter(Object params) {
		if(params instanceof PSSysEAIDataTypeFilter) {
			return (PSSysEAIDataTypeFilter)params;
		}
		return getMapper().convertValue(params, PSSysEAIDataTypeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSEAIDATATYPE";
        }
        else{
            return "PSSYSEAIDATATYPES";
        }
	}
}
