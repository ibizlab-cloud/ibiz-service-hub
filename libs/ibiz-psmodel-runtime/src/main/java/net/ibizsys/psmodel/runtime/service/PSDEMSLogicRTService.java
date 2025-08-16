package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogic;
import net.ibizsys.psmodel.core.domain.PSDELogic;
import net.ibizsys.psmodel.core.filter.PSDELogicFilter;
import net.ibizsys.psmodel.core.service.IPSDELogicService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModelEnums.LogicType;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEMSLogicRTService extends PSModelRTServiceBase<PSDELogic, PSDELogicFilter> implements IPSDELogicService{
    private static final Log log = LogFactory.getLog(PSDEMSLogicRTService.class);

    @Override
    public PSDELogic createDomain(){
        return new PSDELogic();
    }

    @Override
    public PSDELogicFilter createFilter(){
        return new PSDELogicFilter();
    }

    @Override
	public PSDELogic getDomain(Object params) {
		if(params instanceof PSDELogic) {
			return (PSDELogic)params;
		}
		return getMapper().convertValue(params, PSDELogic.class);
	}

	@Override
	public PSDELogicFilter getFilter(Object params) {
		if(params instanceof PSDELogicFilter) {
			return (PSDELogicFilter)params;
		}
		return getMapper().convertValue(params, PSDELogicFilter.class);
    }
	
    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEMSLOGIC";
        }
        else{
            return "PSDEMSLOGICS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEMSLogic.class;
    }
    
    @Override
    protected List<? extends IPSDEMSLogic> getPSModelObjectList(PSDELogicFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDELogic.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
     		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSDataEntities() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSDEMSLogic> allPSDEMSLogicList = new ArrayList<IPSDEMSLogic>();
    		for(IPSDataEntity iPSDataEntity : this.getPSSystemService().getPSSystem().getAllPSDataEntities()) {
    			if(iPSDataEntity.getAllPSDEMSLogics() != null) {
    				allPSDEMSLogicList.addAll(iPSDataEntity.getAllPSDEMSLogics());
    			}
    		}
    		return allPSDEMSLogicList;
    	}
    	
    	return getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)objPSDEId, false).getAllPSDEMSLogics();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEMSLogic.class
    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getAllPSDEMSLogics()
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
