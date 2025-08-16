package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.wf.IPSWorkflow;
import net.ibizsys.psmodel.core.domain.PSWorkflow;
import net.ibizsys.psmodel.core.filter.PSWorkflowFilter;
import net.ibizsys.psmodel.core.service.IPSWorkflowService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSWorkflowRTService extends PSModelRTServiceBase<PSWorkflow, PSWorkflowFilter> implements IPSWorkflowService{
    private static final Log log = LogFactory.getLog(PSWorkflowRTService.class);

    @Override
    public PSWorkflow createDomain(){
        return new PSWorkflow();
    }

    @Override
    public PSWorkflowFilter createFilter(){
        return new PSWorkflowFilter();
	}

	@Override
	public PSWorkflow getDomain(Object params) {
		if(params instanceof PSWorkflow) {
			return (PSWorkflow)params;
		}
		return getMapper().convertValue(params, PSWorkflow.class);
	}

	@Override
	public PSWorkflowFilter getFilter(Object params) {
		if(params instanceof PSWorkflowFilter) {
			return (PSWorkflowFilter)params;
		}
		return getMapper().convertValue(params, PSWorkflowFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSWORKFLOW";
        }
        else{
            return "PSWORKFLOWS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSWorkflow.class;
    }
    
    @Override
    protected List<? extends IPSWorkflow> getPSModelObjectList(PSWorkflowFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSWorkflows();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSWorkflow.class, this.getPSSystemService().getPSSystem().getAllPSWorkflows(), (String)key, false);
    }
    
    @Override
    protected void doFillDomain(PSWorkflow domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSWorkflow iPSWorkflow = (IPSWorkflow)iPSModelObject;
    	domain.setWFCatCode(iPSWorkflow.getWFCatCode());
    	
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
