package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.res.IPSSysUniState;
import net.ibizsys.psmodel.core.domain.PSSysUniState;
import net.ibizsys.psmodel.core.filter.PSSysUniStateFilter;
import net.ibizsys.psmodel.core.service.IPSSysUniStateService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysUniStateRTService extends PSModelRTServiceBase<PSSysUniState, PSSysUniStateFilter> implements IPSSysUniStateService{
    private static final Log log = LogFactory.getLog(PSSysUniStateRTService.class);

    @Override
    public PSSysUniState createDomain(){
        return new PSSysUniState();
    }

    @Override
    public PSSysUniStateFilter createFilter(){
        return new PSSysUniStateFilter();
	}

	@Override
	public PSSysUniState getDomain(Object params) {
		if(params instanceof PSSysUniState) {
			return (PSSysUniState)params;
		}
		return getMapper().convertValue(params, PSSysUniState.class);
	}

	@Override
	public PSSysUniStateFilter getFilter(Object params) {
		if(params instanceof PSSysUniStateFilter) {
			return (PSSysUniStateFilter)params;
		}
		return getMapper().convertValue(params, PSSysUniStateFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSUNISTATE";
        }
        else{
            return "PSSYSUNISTATES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysUniState.class;
    }
    
    @Override
    protected List<? extends IPSSysUniState> getPSModelObjectList(PSSysUniStateFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysUniStates();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysUniState.class, this.getPSSystemService().getPSSystem().getAllPSSysUniStates(), (String)key, tryMode);
    }
}
