package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.dr.IPSDEDataRelation;
import net.ibizsys.psmodel.core.domain.PSDEDataRelation;
import net.ibizsys.psmodel.core.filter.PSDEDataRelationFilter;
import net.ibizsys.psmodel.core.service.IPSDEDataRelationService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEDataRelationRTService extends PSModelRTServiceBase<PSDEDataRelation, PSDEDataRelationFilter> implements IPSDEDataRelationService{
    private static final Log log = LogFactory.getLog(PSDEDataRelationRTService.class);

    @Override
    public PSDEDataRelation createDomain(){
        return new PSDEDataRelation();
    }

    @Override
    public PSDEDataRelationFilter createFilter(){
        return new PSDEDataRelationFilter();
	}

	@Override
	public PSDEDataRelation getDomain(Object params) {
		if(params instanceof PSDEDataRelation) {
			return (PSDEDataRelation)params;
		}
		return getMapper().convertValue(params, PSDEDataRelation.class);
	}

	@Override
	public PSDEDataRelationFilter getFilter(Object params) {
		if(params instanceof PSDEDataRelationFilter) {
			return (PSDEDataRelationFilter)params;
		}
		return getMapper().convertValue(params, PSDEDataRelationFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEDATARELATION";
        }
        else{
            return "PSDEDATARELATIONS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEDataRelation.class;
    }
    
    @Override
    protected List<? extends IPSDEDataRelation> getPSModelObjectList(PSDEDataRelationFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEDataRelation.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSDataEntities() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSDEDataRelation> allPSDEDataRelationList = new ArrayList<IPSDEDataRelation>();
    		for(IPSDataEntity iPSDataEntity : this.getPSSystemService().getPSSystem().getAllPSDataEntities()) {
    			if(iPSDataEntity.getAllPSDEDataRelations() != null) {
    				allPSDEDataRelationList.addAll(iPSDataEntity.getAllPSDEDataRelations());
    			}
    		}
    		return allPSDEDataRelationList;
    	}
    	return getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)objPSDEId, false).getAllPSDEDataRelations();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEDataRelation.class
    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getAllPSDEDataRelations()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEDataRelation domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
    
    
//    @Override
//    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
//    	return IPSControl.class;
//    }
//    
//    @Override
//    protected List<IPSDEDRCtrl> getPSModelObjectList(PSDEDataRelationFilter f) throws Exception {
//    	Object objPSDEId = f.getFieldCond(PSDEDataRelation.FIELD_PSDEID, IPSModelFilter.EQ);
//    	if(ObjectUtils.isEmpty(objPSDEId)) {
//     		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
//    	}
//    	
//    	String strPSDEId = null;
//    	if(objPSDEId!=null) {
//    		strPSDEId = (String)objPSDEId;
//    	}
//
//    	List<IPSDEDRCtrl> psDEDataRelationList = new ArrayList<IPSDEDRCtrl>();
//    	fillPSControlList(IPSDEDRCtrl.class, psDEDataRelationList);
//    	
//    	Map<String, IPSDEDRCtrl> psDEDataRelationMap = new HashMap<String, IPSDEDRCtrl>();
//    	
//    	for(IPSDEDRCtrl iPSDEDataRelation: psDEDataRelationList) {
//    		if(StringUtils.hasLength(strPSDEId)) {
//    			if(iPSDEDataRelation.getPSAppDataEntity() == null || iPSDEDataRelation.getPSAppDataEntity().getPSDataEntity() == null) {
//    				continue;
//    			}
//    			
//    			String strId = this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEDataRelation.getPSAppDataEntity().getPSDataEntity());
//    			if(!strPSDEId.equals(strId)) {
//    				continue;
//    			}
//    		}
//    		
//    		psDEDataRelationMap.put(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEDataRelation), iPSDEDataRelation);
//    		
//    	}
//    	
//    	psDEDataRelationList.clear();
//    	psDEDataRelationList.addAll(psDEDataRelationMap.values());
//    	return psDEDataRelationList;
//    	
//    }
//    
//    @Override
//    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
//    	return getPSModelObject(IPSDEDRCtrl.class
//    			,getPSModelObjectList(new PSDEDataRelationFilter())
//    			,key, tryMode);
//    }
//    
//    @Override
//    protected void doFillDomain(PSDEDataRelation domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
//    	PSDataEntity parentPSModel = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
//    	domain.setPSDEId(parentPSModel.getId());
//    	domain.setPSDEName(parentPSModel.getName());
//    	super.doFillDomain(domain, iPSModelObject, bFullMode);
//    }
    
}
