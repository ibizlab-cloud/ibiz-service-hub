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
import net.ibizsys.psmodel.core.domain.PSDEFDTCol;
import net.ibizsys.psmodel.core.service.IPSDEFDTColService;
import net.ibizsys.psmodel.core.filter.PSDEFDTColFilter;


public class PSDEFDTColRTService extends PSModelRTServiceBase<PSDEFDTCol, PSDEFDTColFilter> implements IPSDEFDTColService{
    private static final Log log = LogFactory.getLog(PSDEFDTColRTService.class);

    @Override
    public PSDEFDTCol createDomain(){
        return new PSDEFDTCol();
    }

    @Override
    public PSDEFDTColFilter createFilter(){
        return new PSDEFDTColFilter();
	}

	@Override
	public PSDEFDTCol getDomain(Object params) {
		if(params instanceof PSDEFDTCol) {
			return (PSDEFDTCol)params;
		}
		return getMapper().convertValue(params, PSDEFDTCol.class);
	}

	@Override
	public PSDEFDTColFilter getFilter(Object params) {
		if(params instanceof PSDEFDTColFilter) {
			return (PSDEFDTColFilter)params;
		}
		return getMapper().convertValue(params, PSDEFDTColFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEFDTCOL";
        }
        else{
            return "PSDEFDTCOLS";
        }
	}
}
