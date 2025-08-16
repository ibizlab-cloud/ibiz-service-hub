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
import net.ibizsys.psmodel.core.domain.PSSysBDTable;
import net.ibizsys.psmodel.core.service.IPSSysBDTableService;
import net.ibizsys.psmodel.core.filter.PSSysBDTableFilter;


public class PSSysBDTableRTService extends PSModelRTServiceBase<PSSysBDTable, PSSysBDTableFilter> implements IPSSysBDTableService{
    private static final Log log = LogFactory.getLog(PSSysBDTableRTService.class);

    @Override
    public PSSysBDTable createDomain(){
        return new PSSysBDTable();
    }

    @Override
    public PSSysBDTableFilter createFilter(){
        return new PSSysBDTableFilter();
	}

	@Override
	public PSSysBDTable getDomain(Object params) {
		if(params instanceof PSSysBDTable) {
			return (PSSysBDTable)params;
		}
		return getMapper().convertValue(params, PSSysBDTable.class);
	}

	@Override
	public PSSysBDTableFilter getFilter(Object params) {
		if(params instanceof PSSysBDTableFilter) {
			return (PSSysBDTableFilter)params;
		}
		return getMapper().convertValue(params, PSSysBDTableFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBDTABLE";
        }
        else{
            return "PSSYSBDTABLES";
        }
	}
}
