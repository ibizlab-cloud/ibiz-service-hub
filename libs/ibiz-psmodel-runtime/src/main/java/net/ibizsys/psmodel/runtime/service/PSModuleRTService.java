package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.system.IPSSystemModule;
import net.ibizsys.model.wf.IPSWFRole;
import net.ibizsys.psmodel.core.domain.PSModule;
import net.ibizsys.psmodel.core.filter.PSModuleFilter;
import net.ibizsys.psmodel.core.filter.PSWFRoleFilter;
import net.ibizsys.psmodel.core.service.IPSModuleService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSModuleRTService extends PSModelRTServiceBase<PSModule, PSModuleFilter> implements IPSModuleService{
    private static final Log log = LogFactory.getLog(PSModuleRTService.class);

    @Override
    public PSModule createDomain(){
        return new PSModule();
    }

    @Override
    public PSModuleFilter createFilter(){
        return new PSModuleFilter();
	}

	@Override
	public PSModule getDomain(Object params) {
		if(params instanceof PSModule) {
			return (PSModule)params;
		}
		return getMapper().convertValue(params, PSModule.class);
	}

	@Override
	public PSModuleFilter getFilter(Object params) {
		if(params instanceof PSModuleFilter) {
			return (PSModuleFilter)params;
		}
		return getMapper().convertValue(params, PSModuleFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSMODULE";
        }
        else{
            return "PSMODULES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSystemModule.class;
    }
    
    @Override
    protected List<? extends IPSModelObject> getPSModelObjectList(PSModuleFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSystemModules();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSystemModule.class, this.getPSSystemService().getPSSystem().getAllPSSystemModules(), (String)key, false);
    }
    
    
  
}
