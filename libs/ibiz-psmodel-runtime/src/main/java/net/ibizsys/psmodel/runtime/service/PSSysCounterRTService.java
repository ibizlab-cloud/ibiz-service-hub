package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.control.counter.IPSSysCounter;
import net.ibizsys.psmodel.core.domain.PSSysCounter;
import net.ibizsys.psmodel.core.filter.PSSysCounterFilter;
import net.ibizsys.psmodel.core.service.IPSSysCounterService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysCounterRTService extends PSModelRTServiceBase<PSSysCounter, PSSysCounterFilter> implements IPSSysCounterService{
    private static final Log log = LogFactory.getLog(PSSysCounterRTService.class);

    @Override
    public PSSysCounter createDomain(){
        return new PSSysCounter();
    }

    @Override
    public PSSysCounterFilter createFilter(){
        return new PSSysCounterFilter();
	}

	@Override
	public PSSysCounter getDomain(Object params) {
		if(params instanceof PSSysCounter) {
			return (PSSysCounter)params;
		}
		return getMapper().convertValue(params, PSSysCounter.class);
	}

	@Override
	public PSSysCounterFilter getFilter(Object params) {
		if(params instanceof PSSysCounterFilter) {
			return (PSSysCounterFilter)params;
		}
		return getMapper().convertValue(params, PSSysCounterFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSCOUNTER";
        }
        else{
            return "PSSYSCOUNTERS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysCounter.class;
    }
    
    @Override
    protected List<? extends IPSSysCounter> getPSModelObjectList(PSSysCounterFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysCounters();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysCounter.class, this.getPSSystemService().getPSSystem().getAllPSSysCounters(), (String)key, tryMode);
    }
}
