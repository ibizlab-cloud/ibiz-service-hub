package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.wf.IPSWFDE;
import net.ibizsys.model.wf.IPSWorkflow;
import net.ibizsys.psmodel.core.domain.PSWFDE;
import net.ibizsys.psmodel.core.domain.PSWorkflow;
import net.ibizsys.psmodel.core.filter.PSWFDEFilter;
import net.ibizsys.psmodel.core.service.IPSWFDEService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSWFDERTService extends PSModelRTServiceBase<PSWFDE, PSWFDEFilter> implements IPSWFDEService{
    private static final Log log = LogFactory.getLog(PSWFDERTService.class);

    @Override
    public PSWFDE createDomain(){
        return new PSWFDE();
    }

    @Override
    public PSWFDEFilter createFilter(){
        return new PSWFDEFilter();
	}

	@Override
	public PSWFDE getDomain(Object params) {
		if(params instanceof PSWFDE) {
			return (PSWFDE)params;
		}
		return getMapper().convertValue(params, PSWFDE.class);
	}

	@Override
	public PSWFDEFilter getFilter(Object params) {
		if(params instanceof PSWFDEFilter) {
			return (PSWFDEFilter)params;
		}
		return getMapper().convertValue(params, PSWFDEFilter.class);
    }


    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSWFDE";
        }
        else{
            return "PSWFDES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSWFDE.class;
    }
    
    @Override
    protected List<? extends IPSWFDE> getPSModelObjectList(PSWFDEFilter f) throws Exception {
    	Object objPSWFId = f.getFieldCond(PSWFDE.FIELD_PSWFID, IPSModelFilter.EQ);
    	if(!ObjectUtils.isEmpty(objPSWFId)) {
    		//objPSWFId = getParentId(f, PSModels.PSWORKFLOW);
    		return getPSModelObject(IPSWorkflow.class, this.getPSSystemService().getPSSystem().getAllPSWorkflows(), (String)objPSWFId, false).getPSWFDEs();
    	}
    	List<IPSWFDE> psWFDEList = new ArrayList<IPSWFDE>();
    	if(!ObjectUtils.isEmpty(this.getPSSystemService().getPSSystem().getAllPSWorkflows())) {
    		for(IPSWorkflow iPSWorkflow : this.getPSSystemService().getPSSystem().getAllPSWorkflows()) {
        		if(!ObjectUtils.isEmpty(iPSWorkflow.getPSWFDEs())) {
        			psWFDEList.addAll(iPSWorkflow.getPSWFDEs());
        		}
        	}
    	}
    	return psWFDEList;
    	
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSWFDE.class
    			,getPSModelObject(IPSWorkflow.class, this.getPSSystemService().getPSSystem().getAllPSWorkflows(), (String)getParentId(key), false).getPSWFDEs()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSWFDE domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	PSWorkflow parentPSModel = (PSWorkflow)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSWORKFLOW, getParentId(domain.getId()));
    	
    	domain.setPSWFId(parentPSModel.getId());
    	domain.setPSWFName(parentPSModel.getName());
    	
    	domain.setWFCodeName(parentPSModel.getCodeName());
    	domain.setWFCatCode(parentPSModel.getWFCatCode());
        	
    
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
}
