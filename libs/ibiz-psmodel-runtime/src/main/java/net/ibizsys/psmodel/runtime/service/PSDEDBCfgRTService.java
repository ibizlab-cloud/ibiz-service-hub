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
import net.ibizsys.psmodel.core.domain.PSDEDBCfg;
import net.ibizsys.psmodel.core.service.IPSDEDBCfgService;
import net.ibizsys.psmodel.core.filter.PSDEDBCfgFilter;


public class PSDEDBCfgRTService extends PSModelRTServiceBase<PSDEDBCfg, PSDEDBCfgFilter> implements IPSDEDBCfgService{
    private static final Log log = LogFactory.getLog(PSDEDBCfgRTService.class);

    @Override
    public PSDEDBCfg createDomain(){
        return new PSDEDBCfg();
    }

    @Override
    public PSDEDBCfgFilter createFilter(){
        return new PSDEDBCfgFilter();
	}

	@Override
	public PSDEDBCfg getDomain(Object params) {
		if(params instanceof PSDEDBCfg) {
			return (PSDEDBCfg)params;
		}
		return getMapper().convertValue(params, PSDEDBCfg.class);
	}

	@Override
	public PSDEDBCfgFilter getFilter(Object params) {
		if(params instanceof PSDEDBCfgFilter) {
			return (PSDEDBCfgFilter)params;
		}
		return getMapper().convertValue(params, PSDEDBCfgFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEDBCFG";
        }
        else{
            return "PSDEDBCFGS";
        }
	}
}
