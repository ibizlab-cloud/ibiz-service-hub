package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow;
import net.ibizsys.psmodel.core.domain.PSDELogic;
import net.ibizsys.psmodel.core.filter.PSDELogicFilter;
import net.ibizsys.psmodel.core.service.IPSDELogicService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModelEnums.LogicType;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEDataFlowRTService extends PSModelRTServiceBase<PSDELogic, PSDELogicFilter> implements IPSDELogicService{
    private static final Log log = LogFactory.getLog(PSDEDataFlowRTService.class);

    @Override
    public PSDELogic createDomain(){
        return new PSDELogic();
    }

    @Override
    public PSDELogicFilter createFilter(){
        return new PSDELogicFilter();
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEDATAFLOW";
        }
        else{
            return "PSDEDATAFLOWS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEDataFlow.class;
    }
    
    @Override
    protected List<? extends IPSDEDataFlow> getPSModelObjectList(PSDELogicFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDELogic.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
     		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSDataEntities() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSDEDataFlow> allPSDEDataFlowList = new ArrayList<IPSDEDataFlow>();
    		for(IPSDataEntity iPSDataEntity : this.getPSSystemService().getPSSystem().getAllPSDataEntities()) {
    			if(iPSDataEntity.getAllPSDEDataFlows() != null) {
    				allPSDEDataFlowList.addAll(iPSDataEntity.getAllPSDEDataFlows());
    			}
    		}
    		return allPSDEDataFlowList;
    	}
    	
    	return getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)objPSDEId, false).getAllPSDEDataFlows();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEDataFlow.class
    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getAllPSDEDataFlows()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDELogic domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	domain.logictype(LogicType.DATAFLOWLOGIC);
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
