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
import net.ibizsys.psmodel.core.domain.PSSysDMItem;
import net.ibizsys.psmodel.core.service.IPSSysDMItemService;
import net.ibizsys.psmodel.core.filter.PSSysDMItemFilter;


public class PSSysDMItemRTService extends PSModelRTServiceBase<PSSysDMItem, PSSysDMItemFilter> implements IPSSysDMItemService{
    private static final Log log = LogFactory.getLog(PSSysDMItemRTService.class);

    @Override
    public PSSysDMItem createDomain(){
        return new PSSysDMItem();
    }

    @Override
    public PSSysDMItemFilter createFilter(){
        return new PSSysDMItemFilter();
	}

	@Override
	public PSSysDMItem getDomain(Object params) {
		if(params instanceof PSSysDMItem) {
			return (PSSysDMItem)params;
		}
		return getMapper().convertValue(params, PSSysDMItem.class);
	}

	@Override
	public PSSysDMItemFilter getFilter(Object params) {
		if(params instanceof PSSysDMItemFilter) {
			return (PSSysDMItemFilter)params;
		}
		return getMapper().convertValue(params, PSSysDMItemFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSDMITEM";
        }
        else{
            return "PSSYSDMITEMS";
        }
	}
}
