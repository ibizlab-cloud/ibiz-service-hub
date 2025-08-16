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
import net.ibizsys.psmodel.core.domain.PSDESampleData;
import net.ibizsys.psmodel.core.service.IPSDESampleDataService;
import net.ibizsys.psmodel.core.filter.PSDESampleDataFilter;


public class PSDESampleDataRTService extends PSModelRTServiceBase<PSDESampleData, PSDESampleDataFilter> implements IPSDESampleDataService{
    private static final Log log = LogFactory.getLog(PSDESampleDataRTService.class);

    @Override
    public PSDESampleData createDomain(){
        return new PSDESampleData();
    }

    @Override
    public PSDESampleDataFilter createFilter(){
        return new PSDESampleDataFilter();
	}

	@Override
	public PSDESampleData getDomain(Object params) {
		if(params instanceof PSDESampleData) {
			return (PSDESampleData)params;
		}
		return getMapper().convertValue(params, PSDESampleData.class);
	}

	@Override
	public PSDESampleDataFilter getFilter(Object params) {
		if(params instanceof PSDESampleDataFilter) {
			return (PSDESampleDataFilter)params;
		}
		return getMapper().convertValue(params, PSDESampleDataFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDESAMPLEDATA";
        }
        else{
            return "PSDESAMPLEDATA";
        }
	}
}
