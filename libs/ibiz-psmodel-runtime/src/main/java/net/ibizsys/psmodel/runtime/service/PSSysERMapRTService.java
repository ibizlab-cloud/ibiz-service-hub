package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.er.IPSSysERMap;
import net.ibizsys.psmodel.core.domain.PSSysERMap;
import net.ibizsys.psmodel.core.filter.PSSysERMapFilter;
import net.ibizsys.psmodel.core.service.IPSSysERMapService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysERMapRTService extends PSModelRTServiceBase<PSSysERMap, PSSysERMapFilter> implements IPSSysERMapService{
    private static final Log log = LogFactory.getLog(PSSysERMapRTService.class);

    @Override
    public PSSysERMap createDomain(){
        return new PSSysERMap();
    }

    @Override
    public PSSysERMapFilter createFilter(){
        return new PSSysERMapFilter();
	}

	@Override
	public PSSysERMap getDomain(Object params) {
		if(params instanceof PSSysERMap) {
			return (PSSysERMap)params;
		}
		return getMapper().convertValue(params, PSSysERMap.class);
	}

	@Override
	public PSSysERMapFilter getFilter(Object params) {
		if(params instanceof PSSysERMapFilter) {
			return (PSSysERMapFilter)params;
		}
		return getMapper().convertValue(params, PSSysERMapFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSERMAP";
        }
        else{
            return "PSSYSERMAPS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysERMap.class;
    }
    
    @Override
    protected List<? extends IPSSysERMap> getPSModelObjectList(PSSysERMapFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysERMaps();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysERMap.class, this.getPSSystemService().getPSSystem().getAllPSSysERMaps(), (String)key, false);
    }
}
