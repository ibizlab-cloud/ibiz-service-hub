package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.psmodel.core.domain.PSSysUseCaseCat;
import net.ibizsys.psmodel.core.filter.PSSysUseCaseCatFilter;
import net.ibizsys.psmodel.core.service.IPSSysUseCaseCatService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysUseCaseCatRTService extends PSModelRTServiceBase<PSSysUseCaseCat, PSSysUseCaseCatFilter> implements IPSSysUseCaseCatService{
    private static final Log log = LogFactory.getLog(PSSysUseCaseCatRTService.class);

    @Override
    public PSSysUseCaseCat createDomain(){
        return new PSSysUseCaseCat();
    }

    @Override
    public PSSysUseCaseCatFilter createFilter(){
        return new PSSysUseCaseCatFilter();
	}

	@Override
	public PSSysUseCaseCat getDomain(Object params) {
		if(params instanceof PSSysUseCaseCat) {
			return (PSSysUseCaseCat)params;
		}
		return getMapper().convertValue(params, PSSysUseCaseCat.class);
	}

	@Override
	public PSSysUseCaseCatFilter getFilter(Object params) {
		if(params instanceof PSSysUseCaseCatFilter) {
			return (PSSysUseCaseCatFilter)params;
		}
		return getMapper().convertValue(params, PSSysUseCaseCatFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSUSECASECAT";
        }
        else{
            return "PSSYSUSECASECATS";
        }
	}
    
//    @Override
//    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
//    	return IPSSysUseCaseCat.class;
//    }
//    
//    @Override
//    protected List<? extends IPSSysUseCaseCat> getPSModelObjectList(PSSysUseCaseCatFilter f) throws Exception {
//    	return this.getPSSystemService().getPSSystem().getAllPSSysUseCaseCats();
//    }
//    
//    @Override
//    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
//    	return getPSModelObject(IPSSysUseCaseCat.class, this.getPSSystemService().getPSSystem().getAllPSSysUseCaseCats(), (String)key, false);
//    }
}
