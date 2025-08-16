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
import net.ibizsys.psmodel.core.domain.PSDEDataSync;
import net.ibizsys.psmodel.core.service.IPSDEDataSyncService;
import net.ibizsys.psmodel.core.filter.PSDEDataSyncFilter;


public class PSDEDataSyncRTService extends PSModelRTServiceBase<PSDEDataSync, PSDEDataSyncFilter> implements IPSDEDataSyncService{
    private static final Log log = LogFactory.getLog(PSDEDataSyncRTService.class);

    @Override
    public PSDEDataSync createDomain(){
        return new PSDEDataSync();
    }

    @Override
    public PSDEDataSyncFilter createFilter(){
        return new PSDEDataSyncFilter();
	}

	@Override
	public PSDEDataSync getDomain(Object params) {
		if(params instanceof PSDEDataSync) {
			return (PSDEDataSync)params;
		}
		return getMapper().convertValue(params, PSDEDataSync.class);
	}

	@Override
	public PSDEDataSyncFilter getFilter(Object params) {
		if(params instanceof PSDEDataSyncFilter) {
			return (PSDEDataSyncFilter)params;
		}
		return getMapper().convertValue(params, PSDEDataSyncFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEDATASYNC";
        }
        else{
            return "PSDEDATASYNCS";
        }
	}
}
