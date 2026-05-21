package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.ai.IPSSysAIFactory;
import net.ibizsys.model.ai.IPSSysAIPipelineAgent;
import net.ibizsys.psmodel.core.domain.PSSysAIPipelineAgent;
import net.ibizsys.psmodel.core.filter.PSSysAIPipelineAgentFilter;
import net.ibizsys.psmodel.core.service.IPSSysAIPipelineAgentService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysAIPipelineAgentRTService extends PSModelRTServiceBase<PSSysAIPipelineAgent, PSSysAIPipelineAgentFilter> implements IPSSysAIPipelineAgentService{
    private static final Log log = LogFactory.getLog(PSSysAIPipelineAgentRTService.class);

    @Override
    public PSSysAIPipelineAgent createDomain(){
        return new PSSysAIPipelineAgent();
    }

    @Override
    public PSSysAIPipelineAgentFilter createFilter(){
        return new PSSysAIPipelineAgentFilter();
    }

	@Override
	public PSSysAIPipelineAgent getDomain(Object params) {
		if(params instanceof PSSysAIPipelineAgent) {
			return (PSSysAIPipelineAgent)params;
		}
		return getMapper().convertValue(params, PSSysAIPipelineAgent.class);
	}

	@Override
	public PSSysAIPipelineAgentFilter getFilter(Object params) {
		if(params instanceof PSSysAIPipelineAgentFilter) {
			return (PSSysAIPipelineAgentFilter)params;
		}
		return getMapper().convertValue(params, PSSysAIPipelineAgentFilter.class);
    }
	
    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSAIPIPELINEAGENT";
        }
        else{
            return "PSSYSAIPIPELINEAGENTS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysAIPipelineAgent.class;
    }
    
    @Override
    protected List<? extends IPSSysAIPipelineAgent> getPSModelObjectList(PSSysAIPipelineAgentFilter f) throws Exception {
    	Object objPSSysAIFactoryId = f.getFieldCond(PSSysAIPipelineAgent.FIELD_PSSYSAIFACTORYID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysAIFactoryId)) {
    		objPSSysAIFactoryId = getParentId(f, PSModels.PSSYSAIFACTORY);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSSysAIFactoryId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSSysAIFactories() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSSysAIPipelineAgent> allPSSysAIPipelineAgentList = new ArrayList<IPSSysAIPipelineAgent>();
    		for(IPSSysAIFactory iPSSysAIFactory : this.getPSSystemService().getPSSystem().getAllPSSysAIFactories()) {
    			if(iPSSysAIFactory.getAllPSSysAIPipelineAgents() != null) {
    				allPSSysAIPipelineAgentList.addAll(iPSSysAIFactory.getAllPSSysAIPipelineAgents());
    			}
    		}
    		return allPSSysAIPipelineAgentList;
    	}
    	return getPSModelObject(IPSSysAIFactory.class, this.getPSSystemService().getPSSystem().getAllPSSysAIFactories(), (String)objPSSysAIFactoryId, false).getAllPSSysAIPipelineAgents();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysAIPipelineAgent.class
    			,getPSModelObject(IPSSysAIFactory.class, this.getPSSystemService().getPSSystem().getAllPSSysAIFactories(), (String)getParentId(key), false).getAllPSSysAIPipelineAgents()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSSysAIPipelineAgent domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAIFACTORY, getParentId(domain.getId()));
    	domain.setPSSysAIFactoryId(parentPSModel.getId());
    	domain.setPSSysAIFactoryName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
