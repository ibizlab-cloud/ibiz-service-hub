package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.ba.IPSSysBDScheme;
import net.ibizsys.psmodel.core.domain.PSSysBDScheme;
import net.ibizsys.psmodel.core.filter.PSSysBDSchemeFilter;
import net.ibizsys.psmodel.core.service.IPSSysBDSchemeService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysBDSchemeRTService extends PSModelRTServiceBase<PSSysBDScheme, PSSysBDSchemeFilter> implements IPSSysBDSchemeService{
    private static final Log log = LogFactory.getLog(PSSysBDSchemeRTService.class);

    @Override
    public PSSysBDScheme createDomain(){
        return new PSSysBDScheme();
    }

    @Override
    public PSSysBDSchemeFilter createFilter(){
        return new PSSysBDSchemeFilter();
	}

	@Override
	public PSSysBDScheme getDomain(Object params) {
		if(params instanceof PSSysBDScheme) {
			return (PSSysBDScheme)params;
		}
		return getMapper().convertValue(params, PSSysBDScheme.class);
	}

	@Override
	public PSSysBDSchemeFilter getFilter(Object params) {
		if(params instanceof PSSysBDSchemeFilter) {
			return (PSSysBDSchemeFilter)params;
		}
		return getMapper().convertValue(params, PSSysBDSchemeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBDSCHEME";
        }
        else{
            return "PSSYSBDSCHEMES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysBDScheme.class;
    }
    
    @Override
    protected List<? extends IPSSysBDScheme> getPSModelObjectList(PSSysBDSchemeFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysBDSchemes();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysBDScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysBDSchemes(), (String)key, false);
    }
}
