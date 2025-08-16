package net.ibizsys.psmodel.runtime.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.psmodel.core.domain.PSCorePrdVer;
import net.ibizsys.psmodel.core.filter.PSCorePrdVerFilter;
import net.ibizsys.psmodel.core.service.IPSCorePrdVerService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSCorePrdVerRTService extends PSModelRTServiceBase<PSCorePrdVer, PSCorePrdVerFilter> implements IPSCorePrdVerService{
    private static final Log log = LogFactory.getLog(PSCorePrdVerRTService.class);

   
   	
   	
    @Override
    public PSCorePrdVer createDomain(){
        return new PSCorePrdVer();
    }

    @Override
    public PSCorePrdVerFilter createFilter(){
        return new PSCorePrdVerFilter();
	}

	@Override
	public PSCorePrdVer getDomain(Object params) {
		if(params instanceof PSCorePrdVer) {
			return (PSCorePrdVer)params;
		}
		return getMapper().convertValue(params, PSCorePrdVer.class);
	}

	@Override
	public PSCorePrdVerFilter getFilter(Object params) {
		if(params instanceof PSCorePrdVerFilter) {
			return (PSCorePrdVerFilter)params;
		}
		return getMapper().convertValue(params, PSCorePrdVerFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSCOREPRDVER";
        }
        else{
            return "PSCOREPRDVERS";
        }
	}
    
    
}
