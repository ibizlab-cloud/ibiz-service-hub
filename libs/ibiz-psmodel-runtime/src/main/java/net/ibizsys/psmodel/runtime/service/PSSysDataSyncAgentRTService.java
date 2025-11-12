package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.res.IPSSysDataSyncAgent;
import net.ibizsys.psmodel.core.domain.PSSysDataSyncAgent;
import net.ibizsys.psmodel.core.filter.PSSysDataSyncAgentFilter;
import net.ibizsys.psmodel.core.service.IPSSysDataSyncAgentService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysDataSyncAgentRTService extends PSModelRTServiceBase<PSSysDataSyncAgent, PSSysDataSyncAgentFilter> implements IPSSysDataSyncAgentService{
    private static final Log log = LogFactory.getLog(PSSysDataSyncAgentRTService.class);

    @Override
    public PSSysDataSyncAgent createDomain(){
        return new PSSysDataSyncAgent();
    }

    @Override
    public PSSysDataSyncAgentFilter createFilter(){
        return new PSSysDataSyncAgentFilter();
	}

	@Override
	public PSSysDataSyncAgent getDomain(Object params) {
		if(params instanceof PSSysDataSyncAgent) {
			return (PSSysDataSyncAgent)params;
		}
		return getMapper().convertValue(params, PSSysDataSyncAgent.class);
	}

	@Override
	public PSSysDataSyncAgentFilter getFilter(Object params) {
		if(params instanceof PSSysDataSyncAgentFilter) {
			return (PSSysDataSyncAgentFilter)params;
		}
		return getMapper().convertValue(params, PSSysDataSyncAgentFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSDATASYNCAGENT";
        }
        else{
            return "PSSYSDATASYNCAGENTS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysDataSyncAgent.class;
    }
    
    @Override
    protected List<? extends IPSSysDataSyncAgent> getPSModelObjectList(PSSysDataSyncAgentFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysDataSyncAgents();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysDataSyncAgent.class, this.getPSSystemService().getPSSystem().getAllPSSysDataSyncAgents(), (String)key, tryMode);
    }
}
