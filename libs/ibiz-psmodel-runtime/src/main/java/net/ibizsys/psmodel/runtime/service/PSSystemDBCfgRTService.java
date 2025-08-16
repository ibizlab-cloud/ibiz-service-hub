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
import net.ibizsys.psmodel.core.domain.PSSystemDBCfg;
import net.ibizsys.psmodel.core.service.IPSSystemDBCfgService;
import net.ibizsys.psmodel.core.filter.PSSystemDBCfgFilter;


public class PSSystemDBCfgRTService extends PSModelRTServiceBase<PSSystemDBCfg, PSSystemDBCfgFilter> implements IPSSystemDBCfgService{
    private static final Log log = LogFactory.getLog(PSSystemDBCfgRTService.class);

    @Override
    public PSSystemDBCfg createDomain(){
        return new PSSystemDBCfg();
    }

    @Override
    public PSSystemDBCfgFilter createFilter(){
        return new PSSystemDBCfgFilter();
	}

	@Override
	public PSSystemDBCfg getDomain(Object params) {
		if(params instanceof PSSystemDBCfg) {
			return (PSSystemDBCfg)params;
		}
		return getMapper().convertValue(params, PSSystemDBCfg.class);
	}

	@Override
	public PSSystemDBCfgFilter getFilter(Object params) {
		if(params instanceof PSSystemDBCfgFilter) {
			return (PSSystemDBCfgFilter)params;
		}
		return getMapper().convertValue(params, PSSystemDBCfgFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSTEMDBCFG";
        }
        else{
            return "PSSYSTEMDBCFGS";
        }
	}
}
