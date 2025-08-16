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
import net.ibizsys.psmodel.core.domain.PSDEChart;
import net.ibizsys.psmodel.core.service.IPSDEChartService;
import net.ibizsys.psmodel.core.filter.PSDEChartFilter;


public class PSDEChartRTService extends PSModelRTServiceBase<PSDEChart, PSDEChartFilter> implements IPSDEChartService{
    private static final Log log = LogFactory.getLog(PSDEChartRTService.class);

    @Override
    public PSDEChart createDomain(){
        return new PSDEChart();
    }

    @Override
    public PSDEChartFilter createFilter(){
        return new PSDEChartFilter();
	}

	@Override
	public PSDEChart getDomain(Object params) {
		if(params instanceof PSDEChart) {
			return (PSDEChart)params;
		}
		return getMapper().convertValue(params, PSDEChart.class);
	}

	@Override
	public PSDEChartFilter getFilter(Object params) {
		if(params instanceof PSDEChartFilter) {
			return (PSDEChartFilter)params;
		}
		return getMapper().convertValue(params, PSDEChartFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDECHART";
        }
        else{
            return "PSDECHARTS";
        }
	}
}
