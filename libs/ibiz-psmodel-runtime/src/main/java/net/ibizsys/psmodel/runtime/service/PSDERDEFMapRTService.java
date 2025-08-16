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
import net.ibizsys.psmodel.core.domain.PSDERDEFMap;
import net.ibizsys.psmodel.core.service.IPSDERDEFMapService;
import net.ibizsys.psmodel.core.filter.PSDERDEFMapFilter;


public class PSDERDEFMapRTService extends PSModelRTServiceBase<PSDERDEFMap, PSDERDEFMapFilter> implements IPSDERDEFMapService{
    private static final Log log = LogFactory.getLog(PSDERDEFMapRTService.class);

    @Override
    public PSDERDEFMap createDomain(){
        return new PSDERDEFMap();
    }

    @Override
    public PSDERDEFMapFilter createFilter(){
        return new PSDERDEFMapFilter();
	}

	@Override
	public PSDERDEFMap getDomain(Object params) {
		if(params instanceof PSDERDEFMap) {
			return (PSDERDEFMap)params;
		}
		return getMapper().convertValue(params, PSDERDEFMap.class);
	}

	@Override
	public PSDERDEFMapFilter getFilter(Object params) {
		if(params instanceof PSDERDEFMapFilter) {
			return (PSDERDEFMapFilter)params;
		}
		return getMapper().convertValue(params, PSDERDEFMapFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDERDEFMAP";
        }
        else{
            return "PSDERDEFMAPS";
        }
	}
}
