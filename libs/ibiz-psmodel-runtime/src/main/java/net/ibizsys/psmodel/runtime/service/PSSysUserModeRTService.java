package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.security.IPSSysUserMode;
import net.ibizsys.psmodel.core.domain.PSSysUserMode;
import net.ibizsys.psmodel.core.filter.PSSysUserModeFilter;
import net.ibizsys.psmodel.core.service.IPSSysUserModeService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysUserModeRTService extends PSModelRTServiceBase<PSSysUserMode, PSSysUserModeFilter> implements IPSSysUserModeService{
    private static final Log log = LogFactory.getLog(PSSysUserModeRTService.class);

    @Override
    public PSSysUserMode createDomain(){
        return new PSSysUserMode();
    }

    @Override
    public PSSysUserModeFilter createFilter(){
        return new PSSysUserModeFilter();
	}

	@Override
	public PSSysUserMode getDomain(Object params) {
		if(params instanceof PSSysUserMode) {
			return (PSSysUserMode)params;
		}
		return getMapper().convertValue(params, PSSysUserMode.class);
	}

	@Override
	public PSSysUserModeFilter getFilter(Object params) {
		if(params instanceof PSSysUserModeFilter) {
			return (PSSysUserModeFilter)params;
		}
		return getMapper().convertValue(params, PSSysUserModeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSUSERMODE";
        }
        else{
            return "PSSYSUSERMODES";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysUserMode.class;
    }
    
    @Override
    protected List<? extends IPSSysUserMode> getPSModelObjectList(PSSysUserModeFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysUserModes();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysUserMode.class, this.getPSSystemService().getPSSystem().getAllPSSysUserModes(), (String)key, false);
    }
}
