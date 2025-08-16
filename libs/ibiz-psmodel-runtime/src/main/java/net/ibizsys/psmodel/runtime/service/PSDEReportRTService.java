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
import net.ibizsys.psmodel.core.domain.PSDEReport;
import net.ibizsys.psmodel.core.service.IPSDEReportService;
import net.ibizsys.psmodel.core.filter.PSDEReportFilter;


public class PSDEReportRTService extends PSModelRTServiceBase<PSDEReport, PSDEReportFilter> implements IPSDEReportService{
    private static final Log log = LogFactory.getLog(PSDEReportRTService.class);

    @Override
    public PSDEReport createDomain(){
        return new PSDEReport();
    }

    @Override
    public PSDEReportFilter createFilter(){
        return new PSDEReportFilter();
	}

	@Override
	public PSDEReport getDomain(Object params) {
		if(params instanceof PSDEReport) {
			return (PSDEReport)params;
		}
		return getMapper().convertValue(params, PSDEReport.class);
	}

	@Override
	public PSDEReportFilter getFilter(Object params) {
		if(params instanceof PSDEReportFilter) {
			return (PSDEReportFilter)params;
		}
		return getMapper().convertValue(params, PSDEReportFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEREPORT";
        }
        else{
            return "PSDEREPORTS";
        }
	}
}
