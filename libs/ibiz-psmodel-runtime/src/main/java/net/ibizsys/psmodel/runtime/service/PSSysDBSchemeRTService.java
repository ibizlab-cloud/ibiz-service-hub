package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.database.IPSSysDBScheme;
import net.ibizsys.psmodel.core.domain.PSSysDBScheme;
import net.ibizsys.psmodel.core.filter.PSSysDBSchemeFilter;
import net.ibizsys.psmodel.core.service.IPSSysDBSchemeService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysDBSchemeRTService extends PSModelRTServiceBase<PSSysDBScheme, PSSysDBSchemeFilter> implements IPSSysDBSchemeService{
    private static final Log log = LogFactory.getLog(PSSysDBSchemeRTService.class);

    @Override
    public PSSysDBScheme createDomain(){
        return new PSSysDBScheme();
    }

    @Override
    public PSSysDBSchemeFilter createFilter(){
        return new PSSysDBSchemeFilter();
	}

	@Override
	public PSSysDBScheme getDomain(Object params) {
		if(params instanceof PSSysDBScheme) {
			return (PSSysDBScheme)params;
		}
		return getMapper().convertValue(params, PSSysDBScheme.class);
	}

	@Override
	public PSSysDBSchemeFilter getFilter(Object params) {
		if(params instanceof PSSysDBSchemeFilter) {
			return (PSSysDBSchemeFilter)params;
		}
		return getMapper().convertValue(params, PSSysDBSchemeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSDBSCHEME";
        }
        else{
            return "PSSYSDBSCHEMES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysDBScheme.class;
    }
    
    @Override
    protected List<? extends IPSSysDBScheme> getPSModelObjectList(PSSysDBSchemeFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysDBSchemes();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysDBScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysDBSchemes(), (String)key, false);
    }
}
