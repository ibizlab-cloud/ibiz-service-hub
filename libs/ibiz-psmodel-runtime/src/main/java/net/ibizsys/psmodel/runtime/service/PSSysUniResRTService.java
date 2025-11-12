package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.security.IPSSysUniRes;
import net.ibizsys.psmodel.core.domain.PSSysUniRes;
import net.ibizsys.psmodel.core.filter.PSSysUniResFilter;
import net.ibizsys.psmodel.core.service.IPSSysUniResService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysUniResRTService extends PSModelRTServiceBase<PSSysUniRes, PSSysUniResFilter> implements IPSSysUniResService{
    private static final Log log = LogFactory.getLog(PSSysUniResRTService.class);

    @Override
    public PSSysUniRes createDomain(){
        return new PSSysUniRes();
    }

    @Override
    public PSSysUniResFilter createFilter(){
        return new PSSysUniResFilter();
	}

	@Override
	public PSSysUniRes getDomain(Object params) {
		if(params instanceof PSSysUniRes) {
			return (PSSysUniRes)params;
		}
		return getMapper().convertValue(params, PSSysUniRes.class);
	}

	@Override
	public PSSysUniResFilter getFilter(Object params) {
		if(params instanceof PSSysUniResFilter) {
			return (PSSysUniResFilter)params;
		}
		return getMapper().convertValue(params, PSSysUniResFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSUNIRES";
        }
        else{
            return "PSSYSUNIRES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysUniRes.class;
    }
    
    @Override
    protected List<? extends IPSSysUniRes> getPSModelObjectList(PSSysUniResFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysUniReses();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysUniRes.class, this.getPSSystemService().getPSSystem().getAllPSSysUniReses(), (String)key, tryMode);
    }
}
