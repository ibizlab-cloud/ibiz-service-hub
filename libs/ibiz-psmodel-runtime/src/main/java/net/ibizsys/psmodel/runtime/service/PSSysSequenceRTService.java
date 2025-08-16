package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.res.IPSSysSequence;
import net.ibizsys.psmodel.core.domain.PSSysSequence;
import net.ibizsys.psmodel.core.filter.PSSysSequenceFilter;
import net.ibizsys.psmodel.core.service.IPSSysSequenceService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysSequenceRTService extends PSModelRTServiceBase<PSSysSequence, PSSysSequenceFilter> implements IPSSysSequenceService{
    private static final Log log = LogFactory.getLog(PSSysSequenceRTService.class);

    @Override
    public PSSysSequence createDomain(){
        return new PSSysSequence();
    }

    @Override
    public PSSysSequenceFilter createFilter(){
        return new PSSysSequenceFilter();
	}

	@Override
	public PSSysSequence getDomain(Object params) {
		if(params instanceof PSSysSequence) {
			return (PSSysSequence)params;
		}
		return getMapper().convertValue(params, PSSysSequence.class);
	}

	@Override
	public PSSysSequenceFilter getFilter(Object params) {
		if(params instanceof PSSysSequenceFilter) {
			return (PSSysSequenceFilter)params;
		}
		return getMapper().convertValue(params, PSSysSequenceFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSSEQUENCE";
        }
        else{
            return "PSSYSSEQUENCES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysSequence.class;
    }
    
    @Override
    protected List<? extends IPSSysSequence> getPSModelObjectList(PSSysSequenceFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysSequences();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysSequence.class, this.getPSSystemService().getPSSystem().getAllPSSysSequences(), (String)key, false);
    }
}
