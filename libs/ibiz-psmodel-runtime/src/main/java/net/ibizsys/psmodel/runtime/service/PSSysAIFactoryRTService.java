package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.ai.IPSSysAIFactory;
import net.ibizsys.psmodel.core.domain.PSSysAIFactory;
import net.ibizsys.psmodel.core.filter.PSSysAIFactoryFilter;
import net.ibizsys.psmodel.core.service.IPSSysAIFactoryService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysAIFactoryRTService extends PSModelRTServiceBase<PSSysAIFactory, PSSysAIFactoryFilter> implements IPSSysAIFactoryService{
    private static final Log log = LogFactory.getLog(PSSysAIFactoryRTService.class);

    @Override
    public PSSysAIFactory createDomain(){
        return new PSSysAIFactory();
    }

    @Override
    public PSSysAIFactoryFilter createFilter(){
        return new PSSysAIFactoryFilter();
    }

	@Override
	public PSSysAIFactory getDomain(Object params) {
		if(params instanceof PSSysAIFactory) {
			return (PSSysAIFactory)params;
		}
		return getMapper().convertValue(params, PSSysAIFactory.class);
	}

	@Override
	public PSSysAIFactoryFilter getFilter(Object params) {
		if(params instanceof PSSysAIFactoryFilter) {
			return (PSSysAIFactoryFilter)params;
		}
		return getMapper().convertValue(params, PSSysAIFactoryFilter.class);
    }
	
    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSAIFACTORY";
        }
        else{
            return "PSSYSAIFACTORIES";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysAIFactory.class;
    }
    
    @Override
    protected List<? extends IPSSysAIFactory> getPSModelObjectList(PSSysAIFactoryFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysAIFactories();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysAIFactory.class, this.getPSSystemService().getPSSystem().getAllPSSysAIFactories(), (String)key, tryMode);
    }
}
