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
import net.ibizsys.psmodel.core.domain.PSDEDBIndex;
import net.ibizsys.psmodel.core.service.IPSDEDBIndexService;
import net.ibizsys.psmodel.core.filter.PSDEDBIndexFilter;


public class PSDEDBIndexRTService extends PSModelRTServiceBase<PSDEDBIndex, PSDEDBIndexFilter> implements IPSDEDBIndexService{
    private static final Log log = LogFactory.getLog(PSDEDBIndexRTService.class);

    @Override
    public PSDEDBIndex createDomain(){
        return new PSDEDBIndex();
    }

    @Override
    public PSDEDBIndexFilter createFilter(){
        return new PSDEDBIndexFilter();
	}

	@Override
	public PSDEDBIndex getDomain(Object params) {
		if(params instanceof PSDEDBIndex) {
			return (PSDEDBIndex)params;
		}
		return getMapper().convertValue(params, PSDEDBIndex.class);
	}

	@Override
	public PSDEDBIndexFilter getFilter(Object params) {
		if(params instanceof PSDEDBIndexFilter) {
			return (PSDEDBIndexFilter)params;
		}
		return getMapper().convertValue(params, PSDEDBIndexFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEDBINDEX";
        }
        else{
            return "PSDEDBINDICES";
        }
	}
}
