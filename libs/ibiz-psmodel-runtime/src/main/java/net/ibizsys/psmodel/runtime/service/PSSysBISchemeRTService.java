package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.bi.IPSSysBIScheme;
import net.ibizsys.psmodel.core.domain.PSSysBIScheme;
import net.ibizsys.psmodel.core.filter.PSSysBISchemeFilter;
import net.ibizsys.psmodel.core.service.IPSSysBISchemeService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysBISchemeRTService extends PSModelRTServiceBase<PSSysBIScheme, PSSysBISchemeFilter> implements IPSSysBISchemeService{
    private static final Log log = LogFactory.getLog(PSSysBISchemeRTService.class);

    @Override
    public PSSysBIScheme createDomain(){
        return new PSSysBIScheme();
    }

    @Override
    public PSSysBISchemeFilter createFilter(){
        return new PSSysBISchemeFilter();
	}

	@Override
	public PSSysBIScheme getDomain(Object params) {
		if(params instanceof PSSysBIScheme) {
			return (PSSysBIScheme)params;
		}
		return getMapper().convertValue(params, PSSysBIScheme.class);
	}

	@Override
	public PSSysBISchemeFilter getFilter(Object params) {
		if(params instanceof PSSysBISchemeFilter) {
			return (PSSysBISchemeFilter)params;
		}
		return getMapper().convertValue(params, PSSysBISchemeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBISCHEME";
        }
        else{
            return "PSSYSBISCHEMES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysBIScheme.class;
    }
    
    @Override
    protected List<? extends IPSSysBIScheme> getPSModelObjectList(PSSysBISchemeFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysBISchemes();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysBIScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysBISchemes(), (String)key, false);
    }
}
