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
import net.ibizsys.psmodel.core.domain.PSDEVRGrpDetail;
import net.ibizsys.psmodel.core.service.IPSDEVRGrpDetailService;
import net.ibizsys.psmodel.core.filter.PSDEVRGrpDetailFilter;


public class PSDEVRGrpDetailRTService extends PSModelRTServiceBase<PSDEVRGrpDetail, PSDEVRGrpDetailFilter> implements IPSDEVRGrpDetailService{
    private static final Log log = LogFactory.getLog(PSDEVRGrpDetailRTService.class);

    @Override
    public PSDEVRGrpDetail createDomain(){
        return new PSDEVRGrpDetail();
    }

    @Override
    public PSDEVRGrpDetailFilter createFilter(){
        return new PSDEVRGrpDetailFilter();
	}

	@Override
	public PSDEVRGrpDetail getDomain(Object params) {
		if(params instanceof PSDEVRGrpDetail) {
			return (PSDEVRGrpDetail)params;
		}
		return getMapper().convertValue(params, PSDEVRGrpDetail.class);
	}

	@Override
	public PSDEVRGrpDetailFilter getFilter(Object params) {
		if(params instanceof PSDEVRGrpDetailFilter) {
			return (PSDEVRGrpDetailFilter)params;
		}
		return getMapper().convertValue(params, PSDEVRGrpDetailFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEVRGRPDETAIL";
        }
        else{
            return "PSDEVRGRPDETAILS";
        }
	}
}
