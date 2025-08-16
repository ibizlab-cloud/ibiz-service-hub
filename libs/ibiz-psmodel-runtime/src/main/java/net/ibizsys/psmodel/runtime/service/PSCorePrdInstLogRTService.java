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
import net.ibizsys.psmodel.core.domain.PSCorePrdInstLog;
import net.ibizsys.psmodel.core.service.IPSCorePrdInstLogService;
import net.ibizsys.psmodel.core.filter.PSCorePrdInstLogFilter;


public class PSCorePrdInstLogRTService extends PSModelRTServiceBase<PSCorePrdInstLog, PSCorePrdInstLogFilter> implements IPSCorePrdInstLogService{
    private static final Log log = LogFactory.getLog(PSCorePrdInstLogRTService.class);

    @Override
    public PSCorePrdInstLog createDomain(){
        return new PSCorePrdInstLog();
    }

    @Override
    public PSCorePrdInstLogFilter createFilter(){
        return new PSCorePrdInstLogFilter();
	}

	@Override
	public PSCorePrdInstLog getDomain(Object params) {
		if(params instanceof PSCorePrdInstLog) {
			return (PSCorePrdInstLog)params;
		}
		return getMapper().convertValue(params, PSCorePrdInstLog.class);
	}

	@Override
	public PSCorePrdInstLogFilter getFilter(Object params) {
		if(params instanceof PSCorePrdInstLogFilter) {
			return (PSCorePrdInstLogFilter)params;
		}
		return getMapper().convertValue(params, PSCorePrdInstLogFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSCOREPRDINSTLOG";
        }
        else{
            return "PSCOREPRDINSTLOGS";
        }
	}
}
