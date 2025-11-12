package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.security.IPSSysUserDR;
import net.ibizsys.psmodel.core.domain.PSSysUserDR;
import net.ibizsys.psmodel.core.filter.PSSysUserDRFilter;
import net.ibizsys.psmodel.core.service.IPSSysUserDRService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysUserDRRTService extends PSModelRTServiceBase<PSSysUserDR, PSSysUserDRFilter> implements IPSSysUserDRService{
    private static final Log log = LogFactory.getLog(PSSysUserDRRTService.class);

    @Override
    public PSSysUserDR createDomain(){
        return new PSSysUserDR();
    }

    @Override
    public PSSysUserDRFilter createFilter(){
        return new PSSysUserDRFilter();
	}

	@Override
	public PSSysUserDR getDomain(Object params) {
		if(params instanceof PSSysUserDR) {
			return (PSSysUserDR)params;
		}
		return getMapper().convertValue(params, PSSysUserDR.class);
	}

	@Override
	public PSSysUserDRFilter getFilter(Object params) {
		if(params instanceof PSSysUserDRFilter) {
			return (PSSysUserDRFilter)params;
		}
		return getMapper().convertValue(params, PSSysUserDRFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSUSERDR";
        }
        else{
            return "PSSYSUSERDRS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysUserDR.class;
    }
    
    @Override
    protected List<? extends IPSSysUserDR> getPSModelObjectList(PSSysUserDRFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysUserDRs();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysUserDR.class, this.getPSSystemService().getPSSystem().getAllPSSysUserDRs(), (String)key, tryMode);
    }
}
