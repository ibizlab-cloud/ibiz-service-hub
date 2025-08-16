package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.psmodel.core.domain.PSDEAction;
import net.ibizsys.psmodel.core.filter.PSDEActionFilter;
import net.ibizsys.psmodel.core.service.IPSDEActionService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEActionRTService extends PSModelRTServiceBase<PSDEAction, PSDEActionFilter> implements IPSDEActionService{
    private static final Log log = LogFactory.getLog(PSDEActionRTService.class);

    @Override
    public PSDEAction createDomain(){
        return new PSDEAction();
    }

    @Override
    public PSDEActionFilter createFilter(){
        return new PSDEActionFilter();
	}

	@Override
	public PSDEAction getDomain(Object params) {
		if(params instanceof PSDEAction) {
			return (PSDEAction)params;
		}
		return getMapper().convertValue(params, PSDEAction.class);
	}

	@Override
	public PSDEActionFilter getFilter(Object params) {
		if(params instanceof PSDEActionFilter) {
			return (PSDEActionFilter)params;
		}
		return getMapper().convertValue(params, PSDEActionFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEACTION";
        }
        else{
            return "PSDEACTIONS";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEAction.class;
    }
    
    @Override
    protected List<? extends IPSDEAction> getPSModelObjectList(PSDEActionFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEAction.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSDataEntities() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSDEAction> allPSDEActionList = new ArrayList<IPSDEAction>();
    		for(IPSDataEntity iPSDataEntity : this.getPSSystemService().getPSSystem().getAllPSDataEntities()) {
    			if(iPSDataEntity.getAllPSDEActions() != null) {
    				allPSDEActionList.addAll(iPSDataEntity.getAllPSDEActions());
    			}
    		}
    		return allPSDEActionList;
    	}
    	return getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)objPSDEId, false).getAllPSDEActions();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEAction.class
    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getAllPSDEActions()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEAction domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
