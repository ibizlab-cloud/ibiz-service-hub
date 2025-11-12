package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.res.IPSSysTranslator;
import net.ibizsys.psmodel.core.domain.PSSysTranslator;
import net.ibizsys.psmodel.core.filter.PSSysTranslatorFilter;
import net.ibizsys.psmodel.core.service.IPSSysTranslatorService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysTranslatorRTService extends PSModelRTServiceBase<PSSysTranslator, PSSysTranslatorFilter> implements IPSSysTranslatorService{
    private static final Log log = LogFactory.getLog(PSSysTranslatorRTService.class);

    @Override
    public PSSysTranslator createDomain(){
        return new PSSysTranslator();
    }

    @Override
    public PSSysTranslatorFilter createFilter(){
        return new PSSysTranslatorFilter();
	}

	@Override
	public PSSysTranslator getDomain(Object params) {
		if(params instanceof PSSysTranslator) {
			return (PSSysTranslator)params;
		}
		return getMapper().convertValue(params, PSSysTranslator.class);
	}

	@Override
	public PSSysTranslatorFilter getFilter(Object params) {
		if(params instanceof PSSysTranslatorFilter) {
			return (PSSysTranslatorFilter)params;
		}
		return getMapper().convertValue(params, PSSysTranslatorFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSTRANSLATOR";
        }
        else{
            return "PSSYSTRANSLATORS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysTranslator.class;
    }
    
    @Override
    protected List<? extends IPSSysTranslator> getPSModelObjectList(PSSysTranslatorFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysTranslators();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysTranslator.class, this.getPSSystemService().getPSSystem().getAllPSSysTranslators(), (String)key, tryMode);
    }
}
