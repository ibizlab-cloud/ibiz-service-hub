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
import net.ibizsys.psmodel.core.domain.PSDEDQCode;
import net.ibizsys.psmodel.core.service.IPSDEDQCodeService;
import net.ibizsys.psmodel.core.filter.PSDEDQCodeFilter;


public class PSDEDQCodeRTService extends PSModelRTServiceBase<PSDEDQCode, PSDEDQCodeFilter> implements IPSDEDQCodeService{
    private static final Log log = LogFactory.getLog(PSDEDQCodeRTService.class);

    @Override
    public PSDEDQCode createDomain(){
        return new PSDEDQCode();
    }

    @Override
    public PSDEDQCodeFilter createFilter(){
        return new PSDEDQCodeFilter();
	}

	@Override
	public PSDEDQCode getDomain(Object params) {
		if(params instanceof PSDEDQCode) {
			return (PSDEDQCode)params;
		}
		return getMapper().convertValue(params, PSDEDQCode.class);
	}

	@Override
	public PSDEDQCodeFilter getFilter(Object params) {
		if(params instanceof PSDEDQCodeFilter) {
			return (PSDEDQCodeFilter)params;
		}
		return getMapper().convertValue(params, PSDEDQCodeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEDQCODE";
        }
        else{
            return "PSDEDQCODES";
        }
	}
}
