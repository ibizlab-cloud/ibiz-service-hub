package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.ai.IPSSysAIFactory;
import net.ibizsys.model.ai.IPSSysAIWorkerAgent;
import net.ibizsys.psmodel.core.domain.PSSysAIWorkerAgent;
import net.ibizsys.psmodel.core.filter.PSSysAIWorkerAgentFilter;
import net.ibizsys.psmodel.core.service.IPSSysAIWorkerAgentService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysAIWorkerAgentRTService extends PSModelRTServiceBase<PSSysAIWorkerAgent, PSSysAIWorkerAgentFilter> implements IPSSysAIWorkerAgentService{
    private static final Log log = LogFactory.getLog(PSSysAIWorkerAgentRTService.class);

    @Override
    public PSSysAIWorkerAgent createDomain(){
        return new PSSysAIWorkerAgent();
    }

    @Override
    public PSSysAIWorkerAgentFilter createFilter(){
        return new PSSysAIWorkerAgentFilter();
    }

	@Override
	public PSSysAIWorkerAgent getDomain(Object params) {
		if(params instanceof PSSysAIWorkerAgent) {
			return (PSSysAIWorkerAgent)params;
		}
		return getMapper().convertValue(params, PSSysAIWorkerAgent.class);
	}

	@Override
	public PSSysAIWorkerAgentFilter getFilter(Object params) {
		if(params instanceof PSSysAIWorkerAgentFilter) {
			return (PSSysAIWorkerAgentFilter)params;
		}
		return getMapper().convertValue(params, PSSysAIWorkerAgentFilter.class);
    }
	
    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSAIWORKERAGENT";
        }
        else{
            return "PSSYSAIWORKERAGENTS";
        }
	}
    

    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysAIWorkerAgent.class;
    }
    
    @Override
    protected List<? extends IPSSysAIWorkerAgent> getPSModelObjectList(PSSysAIWorkerAgentFilter f) throws Exception {
    	Object objPSSysAIFactoryId = f.getFieldCond(PSSysAIWorkerAgent.FIELD_PSSYSAIFACTORYID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysAIFactoryId)) {
    		objPSSysAIFactoryId = getParentId(f, PSModels.PSSYSAIFACTORY);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSSysAIFactoryId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSSysAIFactories() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSSysAIWorkerAgent> allPSSysAIWorkerAgentList = new ArrayList<IPSSysAIWorkerAgent>();
    		for(IPSSysAIFactory iPSSysAIFactory : this.getPSSystemService().getPSSystem().getAllPSSysAIFactories()) {
    			if(iPSSysAIFactory.getAllPSSysAIWorkerAgents() != null) {
    				allPSSysAIWorkerAgentList.addAll(iPSSysAIFactory.getAllPSSysAIWorkerAgents());
    			}
    		}
    		return allPSSysAIWorkerAgentList;
    	}
    	return getPSModelObject(IPSSysAIFactory.class, this.getPSSystemService().getPSSystem().getAllPSSysAIFactories(), (String)objPSSysAIFactoryId, false).getAllPSSysAIWorkerAgents();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysAIWorkerAgent.class
    			,getPSModelObject(IPSSysAIFactory.class, this.getPSSystemService().getPSSystem().getAllPSSysAIFactories(), (String)getParentId(key), false).getAllPSSysAIWorkerAgents()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSSysAIWorkerAgent domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAIFACTORY, getParentId(domain.getId()));
    	domain.setPSSysAIFactoryId(parentPSModel.getId());
    	domain.setPSSysAIFactoryName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
