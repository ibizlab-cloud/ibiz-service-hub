package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.uml.IPSSysActor;
import net.ibizsys.psmodel.core.domain.PSSysActor;
import net.ibizsys.psmodel.core.filter.PSSysActorFilter;
import net.ibizsys.psmodel.core.service.IPSSysActorService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysActorRTService extends PSModelRTServiceBase<PSSysActor, PSSysActorFilter> implements IPSSysActorService{
    private static final Log log = LogFactory.getLog(PSSysActorRTService.class);

    @Override
    public PSSysActor createDomain(){
        return new PSSysActor();
    }

    @Override
    public PSSysActorFilter createFilter(){
        return new PSSysActorFilter();
	}

	@Override
	public PSSysActor getDomain(Object params) {
		if(params instanceof PSSysActor) {
			return (PSSysActor)params;
		}
		return getMapper().convertValue(params, PSSysActor.class);
	}

	@Override
	public PSSysActorFilter getFilter(Object params) {
		if(params instanceof PSSysActorFilter) {
			return (PSSysActorFilter)params;
		}
		return getMapper().convertValue(params, PSSysActorFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSACTOR";
        }
        else{
            return "PSSYSACTORS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysActor.class;
    }
    
    @Override
    protected List<? extends IPSSysActor> getPSModelObjectList(PSSysActorFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysActors();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysActor.class, this.getPSSystemService().getPSSystem().getAllPSSysActors(), (String)key, tryMode);
    }
}
