package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.wf.IPSWFRole;
import net.ibizsys.psmodel.core.domain.PSWFRole;
import net.ibizsys.psmodel.core.filter.PSWFRoleFilter;
import net.ibizsys.psmodel.core.service.IPSWFRoleService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSWFRoleRTService extends PSModelRTServiceBase<PSWFRole, PSWFRoleFilter> implements IPSWFRoleService{
    private static final Log log = LogFactory.getLog(PSWFRoleRTService.class);

    @Override
    public PSWFRole createDomain(){
        return new PSWFRole();
    }

    @Override
    public PSWFRoleFilter createFilter(){
        return new PSWFRoleFilter();
	}

	@Override
	public PSWFRole getDomain(Object params) {
		if(params instanceof PSWFRole) {
			return (PSWFRole)params;
		}
		return getMapper().convertValue(params, PSWFRole.class);
	}

	@Override
	public PSWFRoleFilter getFilter(Object params) {
		if(params instanceof PSWFRoleFilter) {
			return (PSWFRoleFilter)params;
		}
		return getMapper().convertValue(params, PSWFRoleFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSWFROLE";
        }
        else{
            return "PSWFROLES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSWFRole.class;
    }
    
    @Override
    protected List<? extends IPSWFRole> getPSModelObjectList(PSWFRoleFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSWFRoles();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSWFRole.class, this.getPSSystemService().getPSSystem().getAllPSWFRoles(), (String)key, tryMode);
    }
}
