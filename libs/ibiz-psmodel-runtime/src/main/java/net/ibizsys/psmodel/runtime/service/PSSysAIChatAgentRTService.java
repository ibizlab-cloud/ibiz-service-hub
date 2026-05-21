package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.ai.IPSSysAIChatAgent;
import net.ibizsys.model.ai.IPSSysAIFactory;
import net.ibizsys.psmodel.core.domain.PSSysAIChatAgent;
import net.ibizsys.psmodel.core.filter.PSSysAIChatAgentFilter;
import net.ibizsys.psmodel.core.service.IPSSysAIChatAgentService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysAIChatAgentRTService extends PSModelRTServiceBase<PSSysAIChatAgent, PSSysAIChatAgentFilter> implements IPSSysAIChatAgentService{
    private static final Log log = LogFactory.getLog(PSSysAIChatAgentRTService.class);

    @Override
    public PSSysAIChatAgent createDomain(){
        return new PSSysAIChatAgent();
    }

    @Override
    public PSSysAIChatAgentFilter createFilter(){
        return new PSSysAIChatAgentFilter();
    }
    
	@Override
	public PSSysAIChatAgent getDomain(Object params) {
		if(params instanceof PSSysAIChatAgent) {
			return (PSSysAIChatAgent)params;
		}
		return getMapper().convertValue(params, PSSysAIChatAgent.class);
	}

	@Override
	public PSSysAIChatAgentFilter getFilter(Object params) {
		if(params instanceof PSSysAIChatAgentFilter) {
			return (PSSysAIChatAgentFilter)params;
		}
		return getMapper().convertValue(params, PSSysAIChatAgentFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSAICHATAGENT";
        }
        else{
            return "PSSYSAICHATAGENTS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysAIChatAgent.class;
    }
    
    @Override
    protected List<? extends IPSSysAIChatAgent> getPSModelObjectList(PSSysAIChatAgentFilter f) throws Exception {
    	Object objPSSysAIFactoryId = f.getFieldCond(PSSysAIChatAgent.FIELD_PSSYSAIFACTORYID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysAIFactoryId)) {
    		objPSSysAIFactoryId = getParentId(f, PSModels.PSSYSAIFACTORY);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSSysAIFactoryId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSSysAIFactories() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSSysAIChatAgent> allPSSysAIChatAgentList = new ArrayList<IPSSysAIChatAgent>();
    		for(IPSSysAIFactory iPSSysAIFactory : this.getPSSystemService().getPSSystem().getAllPSSysAIFactories()) {
    			if(iPSSysAIFactory.getAllPSSysAIChatAgents() != null) {
    				allPSSysAIChatAgentList.addAll(iPSSysAIFactory.getAllPSSysAIChatAgents());
    			}
    		}
    		return allPSSysAIChatAgentList;
    	}
    	return getPSModelObject(IPSSysAIFactory.class, this.getPSSystemService().getPSSystem().getAllPSSysAIFactories(), (String)objPSSysAIFactoryId, false).getAllPSSysAIChatAgents();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysAIChatAgent.class
    			,getPSModelObject(IPSSysAIFactory.class, this.getPSSystemService().getPSSystem().getAllPSSysAIFactories(), (String)getParentId(key), false).getAllPSSysAIChatAgents()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSSysAIChatAgent domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAIFACTORY, getParentId(domain.getId()));
    	domain.setPSSysAIFactoryId(parentPSModel.getId());
    	domain.setPSSysAIFactoryName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
