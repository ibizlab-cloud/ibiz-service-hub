package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.system.IPSSysRef;
import net.ibizsys.psmodel.core.domain.PSSysRef;
import net.ibizsys.psmodel.core.filter.PSSysRefFilter;
import net.ibizsys.psmodel.core.service.IPSSysRefService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysRefRTService extends PSModelRTServiceBase<PSSysRef, PSSysRefFilter> implements IPSSysRefService{
    private static final Log log = LogFactory.getLog(PSSysRefRTService.class);

    @Override
    public PSSysRef createDomain(){
        return new PSSysRef();
    }

    @Override
    public PSSysRefFilter createFilter(){
        return new PSSysRefFilter();
	}

	@Override
	public PSSysRef getDomain(Object params) {
		if(params instanceof PSSysRef) {
			return (PSSysRef)params;
		}
		return getMapper().convertValue(params, PSSysRef.class);
	}

	@Override
	public PSSysRefFilter getFilter(Object params) {
		if(params instanceof PSSysRefFilter) {
			return (PSSysRefFilter)params;
		}
		return getMapper().convertValue(params, PSSysRefFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSREF";
        }
        else{
            return "PSSYSREFS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysRef.class;
    }
    
    @Override
    protected List<? extends IPSSysRef> getPSModelObjectList(PSSysRefFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysRefs();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysRef.class, this.getPSSystemService().getPSSystem().getAllPSSysRefs(), (String)key, false);
    }
}
