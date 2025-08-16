package net.ibizsys.psmodel.runtime.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.psmodel.core.domain.PSSysBIAggColumn;
import net.ibizsys.psmodel.core.util.PSModelFilter;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysBIAggColumnRTService extends PSModelRTServiceBase<PSSysBIAggColumn, PSModelFilter>{
    private static final Log log = LogFactory.getLog(PSSysBIAggColumnRTService.class);

    @Override
    public PSSysBIAggColumn createDomain(){
        return new PSSysBIAggColumn();
    }

    @Override
    public PSModelFilter createFilter(){
        return new PSModelFilter();
    }
    

	

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBIAGGCOLUMN";
        }
        else{
            return "PSSYSBIAGGCOLUMNS";
        }
	}
}
