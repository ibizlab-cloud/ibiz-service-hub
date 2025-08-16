package net.ibizsys.psmodel.runtime.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.psmodel.core.domain.PSSysBDColumn;
import net.ibizsys.psmodel.core.filter.PSSysBDColumnFilter;
import net.ibizsys.psmodel.core.service.IPSSysBDColumnService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysBDColumnRTService extends PSModelRTServiceBase<PSSysBDColumn, PSSysBDColumnFilter> implements IPSSysBDColumnService{
    private static final Log log = LogFactory.getLog(PSSysBDColumnRTService.class);

    @Override
    public PSSysBDColumn createDomain(){
        return new PSSysBDColumn();
    }

    @Override
    public PSSysBDColumnFilter createFilter(){
        return new PSSysBDColumnFilter();
	}

	@Override
	public PSSysBDColumn getDomain(Object params) {
		if(params instanceof PSSysBDColumn) {
			return (PSSysBDColumn)params;
		}
		return getMapper().convertValue(params, PSSysBDColumn.class);
	}

	@Override
	public PSSysBDColumnFilter getFilter(Object params) {
		if(params instanceof PSSysBDColumnFilter) {
			return (PSSysBDColumnFilter)params;
		}
		return getMapper().convertValue(params, PSSysBDColumnFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBDCOLUMN";
        }
        else{
            return "PSSYSBDCOLUMNS";
        }
	}
    
    
	
	
}
