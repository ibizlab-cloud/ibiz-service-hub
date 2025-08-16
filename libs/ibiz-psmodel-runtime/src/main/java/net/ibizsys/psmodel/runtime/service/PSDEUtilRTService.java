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
import net.ibizsys.psmodel.core.domain.PSDEUtil;
import net.ibizsys.psmodel.core.service.IPSDEUtilService;
import net.ibizsys.psmodel.core.filter.PSDEUtilFilter;


public class PSDEUtilRTService extends PSModelRTServiceBase<PSDEUtil, PSDEUtilFilter> implements IPSDEUtilService{
    private static final Log log = LogFactory.getLog(PSDEUtilRTService.class);

    @Override
    public PSDEUtil createDomain(){
        return new PSDEUtil();
    }

    @Override
    public PSDEUtilFilter createFilter(){
        return new PSDEUtilFilter();
	}

	@Override
	public PSDEUtil getDomain(Object params) {
		if(params instanceof PSDEUtil) {
			return (PSDEUtil)params;
		}
		return getMapper().convertValue(params, PSDEUtil.class);
	}

	@Override
	public PSDEUtilFilter getFilter(Object params) {
		if(params instanceof PSDEUtilFilter) {
			return (PSDEUtilFilter)params;
		}
		return getMapper().convertValue(params, PSDEUtilFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEUTIL";
        }
        else{
            return "PSDEUTILS";
        }
	}

    @Override
    protected String getOriginModelName() {
        return "PSDEUTILDE";
    }
}
