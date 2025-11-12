package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.security.IPSSysUserRole;
import net.ibizsys.psmodel.core.domain.PSSysUserRole;
import net.ibizsys.psmodel.core.filter.PSSysUserRoleFilter;
import net.ibizsys.psmodel.core.service.IPSSysUserRoleService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysUserRoleRTService extends PSModelRTServiceBase<PSSysUserRole, PSSysUserRoleFilter> implements IPSSysUserRoleService{
    private static final Log log = LogFactory.getLog(PSSysUserRoleRTService.class);

    @Override
    public PSSysUserRole createDomain(){
        return new PSSysUserRole();
    }

    @Override
    public PSSysUserRoleFilter createFilter(){
        return new PSSysUserRoleFilter();
	}

	@Override
	public PSSysUserRole getDomain(Object params) {
		if(params instanceof PSSysUserRole) {
			return (PSSysUserRole)params;
		}
		return getMapper().convertValue(params, PSSysUserRole.class);
	}

	@Override
	public PSSysUserRoleFilter getFilter(Object params) {
		if(params instanceof PSSysUserRoleFilter) {
			return (PSSysUserRoleFilter)params;
		}
		return getMapper().convertValue(params, PSSysUserRoleFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSUSERROLE";
        }
        else{
            return "PSSYSUSERROLES";
        }
	}

    @Override
    protected String getOriginModelName() {
        return "PSSYSOPPRIV";
    }
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysUserRole.class;
    }
    
    @Override
    protected List<? extends IPSSysUserRole> getPSModelObjectList(PSSysUserRoleFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysUserRoles();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysUserRole.class, this.getPSSystemService().getPSSystem().getAllPSSysUserRoles(), (String)key, tryMode);
    }
}
