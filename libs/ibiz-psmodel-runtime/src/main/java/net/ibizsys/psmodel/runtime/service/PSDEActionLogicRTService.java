package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.action.IPSDEActionLogic;
import net.ibizsys.psmodel.core.domain.PSDEAction;
import net.ibizsys.psmodel.core.domain.PSDEActionLogic;
import net.ibizsys.psmodel.core.filter.PSDEActionLogicFilter;
import net.ibizsys.psmodel.core.service.IPSDEActionLogicService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEActionLogicRTService extends PSModelRTServiceBase<PSDEActionLogic, PSDEActionLogicFilter> implements IPSDEActionLogicService{
    private static final Log log = LogFactory.getLog(PSDEActionLogicRTService.class);

    @Override
    public PSDEActionLogic createDomain(){
        return new PSDEActionLogic();
    }

    @Override
    public PSDEActionLogicFilter createFilter(){
        return new PSDEActionLogicFilter();
	}

	@Override
	public PSDEActionLogic getDomain(Object params) {
		if(params instanceof PSDEActionLogic) {
			return (PSDEActionLogic)params;
		}
		return getMapper().convertValue(params, PSDEActionLogic.class);
	}

	@Override
	public PSDEActionLogicFilter getFilter(Object params) {
		if(params instanceof PSDEActionLogicFilter) {
			return (PSDEActionLogicFilter)params;
		}
		return getMapper().convertValue(params, PSDEActionLogicFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEACTIONLOGIC";
        }
        else{
            return "PSDEACTIONLOGICS";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEActionLogic.class;
    }
    
    @Override
    protected List<? extends IPSDEActionLogic> getPSModelObjectList(PSDEActionLogicFilter f) throws Exception {
    	Object objPSDEActionId = f.getFieldCond(PSDEActionLogic.FIELD_PSDEACTIONID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEActionId)) {
    		objPSDEActionId = getParentId(f, PSModels.PSDEACTION);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSDEActionId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSDataEntities() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSDEActionLogic> allPSDEActionLogicList = new ArrayList<IPSDEActionLogic>();
    		for(IPSDataEntity iPSDataEntity : this.getPSSystemService().getPSSystem().getAllPSDataEntities()) {
    			if(iPSDataEntity.getAllPSDEActions() != null) {
    				for(IPSDEAction iPSDEAction : iPSDataEntity.getAllPSDEActions()) {
    					if(!ObjectUtils.isEmpty(iPSDEAction.getPreparePSDEActionLogics())) {
    						allPSDEActionLogicList.addAll(iPSDEAction.getPreparePSDEActionLogics());
    					}
    					if(!ObjectUtils.isEmpty(iPSDEAction.getCheckPSDEActionLogics())) {
    						allPSDEActionLogicList.addAll(iPSDEAction.getCheckPSDEActionLogics());
    					}
    					if(!ObjectUtils.isEmpty(iPSDEAction.getBeforePSDEActionLogics())) {
    						allPSDEActionLogicList.addAll(iPSDEAction.getBeforePSDEActionLogics());
    					}
    					if(!ObjectUtils.isEmpty(iPSDEAction.getAfterPSDEActionLogics())) {
    						allPSDEActionLogicList.addAll(iPSDEAction.getAfterPSDEActionLogics());
    					}
    				}
    				
    			}
    		}
    		return allPSDEActionLogicList;
    	}
    	
    	String strPSDEId = getParentId((String)objPSDEActionId);
    	IPSDEAction iPSDEAction = getPSModelObject(IPSDEAction.class, 
    			getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), strPSDEId, false).getAllPSDEActions(),
    			(String)objPSDEActionId, false);
    	
    	List<IPSDEActionLogic> allPSDEActionLogicList = new ArrayList<IPSDEActionLogic>();
    	if(!ObjectUtils.isEmpty(iPSDEAction.getPreparePSDEActionLogics())) {
			allPSDEActionLogicList.addAll(iPSDEAction.getPreparePSDEActionLogics());
		}
		if(!ObjectUtils.isEmpty(iPSDEAction.getCheckPSDEActionLogics())) {
			allPSDEActionLogicList.addAll(iPSDEAction.getCheckPSDEActionLogics());
		}
		if(!ObjectUtils.isEmpty(iPSDEAction.getBeforePSDEActionLogics())) {
			allPSDEActionLogicList.addAll(iPSDEAction.getBeforePSDEActionLogics());
		}
		if(!ObjectUtils.isEmpty(iPSDEAction.getAfterPSDEActionLogics())) {
			allPSDEActionLogicList.addAll(iPSDEAction.getAfterPSDEActionLogics());
		}
    	return allPSDEActionLogicList;
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	
    	String strPSDEActionId = getParentId(key);
    	String strPSDEId = getParentId(strPSDEActionId);
    	
    	IPSDEAction iPSDEAction = getPSModelObject(IPSDEAction.class, 
    			getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), strPSDEId, false).getAllPSDEActions(),
    			strPSDEActionId, false);
    	
    	List<IPSDEActionLogic> allPSDEActionLogicList = new ArrayList<IPSDEActionLogic>();
    	if(!ObjectUtils.isEmpty(iPSDEAction.getPreparePSDEActionLogics())) {
			allPSDEActionLogicList.addAll(iPSDEAction.getPreparePSDEActionLogics());
		}
		if(!ObjectUtils.isEmpty(iPSDEAction.getCheckPSDEActionLogics())) {
			allPSDEActionLogicList.addAll(iPSDEAction.getCheckPSDEActionLogics());
		}
		if(!ObjectUtils.isEmpty(iPSDEAction.getBeforePSDEActionLogics())) {
			allPSDEActionLogicList.addAll(iPSDEAction.getBeforePSDEActionLogics());
		}
		if(!ObjectUtils.isEmpty(iPSDEAction.getAfterPSDEActionLogics())) {
			allPSDEActionLogicList.addAll(iPSDEAction.getAfterPSDEActionLogics());
		}
		
		return getPSModelObject(IPSDEActionLogic.class
    			,allPSDEActionLogicList
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEActionLogic domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	PSDEAction parentPSModel = (PSDEAction) this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDEACTION, getParentId(domain.getId()));
    	domain.setPSDEActionId(parentPSModel.getId());
    	domain.setPSDEActionName(parentPSModel.getName());
    	domain.setPSDEId(parentPSModel.getPSDEId());
    	domain.setPSDEName(parentPSModel.getPSDEName());
    	
    	IPSDEAction iPSDEAction = iPSModelObject.getParentPSModelObject(IPSDEAction.class, false);
    	if(!ObjectUtils.isEmpty(iPSDEAction.getPreparePSDEActionLogics())) {
    		int nPos = iPSDEAction.getPreparePSDEActionLogics().indexOf(iPSModelObject);
    		if(nPos!=-1) {
    			domain.setOrderValue((nPos+1)* 100);
    			domain.setCodeName(String.format("prepare%1$s", domain.getOrderValue()));
    		}
		}
		if(!ObjectUtils.isEmpty(iPSDEAction.getCheckPSDEActionLogics())) {
			int nPos = iPSDEAction.getCheckPSDEActionLogics().indexOf(iPSModelObject);
    		if(nPos!=-1) {
    			domain.setOrderValue((nPos+1)* 100);
    			domain.setCodeName(String.format("check%1$s", domain.getOrderValue()));
    		}
		}
		if(!ObjectUtils.isEmpty(iPSDEAction.getBeforePSDEActionLogics())) {
			int nPos = iPSDEAction.getBeforePSDEActionLogics().indexOf(iPSModelObject);
    		if(nPos!=-1) {
    			domain.setOrderValue((nPos+1)* 100);
    			domain.setCodeName(String.format("before%1$s", domain.getOrderValue()));
    		}
		}
		if(!ObjectUtils.isEmpty(iPSDEAction.getAfterPSDEActionLogics())) {
			int nPos = iPSDEAction.getAfterPSDEActionLogics().indexOf(iPSModelObject);
    		if(nPos!=-1) {
    			domain.setOrderValue((nPos+1)* 100);
    			domain.setCodeName(String.format("after%1$s", domain.getOrderValue()));
    		}
		}
//		
//		if(StringUtils.hasLength(domain.getCodeName())) {
//			domain.setId(String.format("%1$s.%2$s", parentPSModel.getId(), domain.getCodeName()).toLowerCase());
//		}
		
		
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
