package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.uml.IPSSysUseCase;
import net.ibizsys.psmodel.core.domain.PSSysUseCase;
import net.ibizsys.psmodel.core.filter.PSSysUseCaseFilter;
import net.ibizsys.psmodel.core.service.IPSSysUseCaseService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysUseCaseRTService extends PSModelRTServiceBase<PSSysUseCase, PSSysUseCaseFilter> implements IPSSysUseCaseService{
    private static final Log log = LogFactory.getLog(PSSysUseCaseRTService.class);

    @Override
    public PSSysUseCase createDomain(){
        return new PSSysUseCase();
    }

    @Override
    public PSSysUseCaseFilter createFilter(){
        return new PSSysUseCaseFilter();
	}

	@Override
	public PSSysUseCase getDomain(Object params) {
		if(params instanceof PSSysUseCase) {
			return (PSSysUseCase)params;
		}
		return getMapper().convertValue(params, PSSysUseCase.class);
	}

	@Override
	public PSSysUseCaseFilter getFilter(Object params) {
		if(params instanceof PSSysUseCaseFilter) {
			return (PSSysUseCaseFilter)params;
		}
		return getMapper().convertValue(params, PSSysUseCaseFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSUSECASE";
        }
        else{
            return "PSSYSUSECASES";
        }
	}

    @Override
    protected String getOriginModelName() {
        return "PSSYSUSERCASE";
    }
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysUseCase.class;
    }
    
    @Override
    protected List<? extends IPSSysUseCase> getPSModelObjectList(PSSysUseCaseFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysUseCases();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysUseCase.class, this.getPSSystemService().getPSSystem().getAllPSSysUseCases(), (String)key, false);
    }
}
