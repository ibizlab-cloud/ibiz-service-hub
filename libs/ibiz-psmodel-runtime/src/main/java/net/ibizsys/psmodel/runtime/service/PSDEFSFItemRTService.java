package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEFSearchMode;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.psmodel.core.domain.PSDEFSFItem;
import net.ibizsys.psmodel.core.domain.PSDEField;
import net.ibizsys.psmodel.core.filter.PSDEFSFItemFilter;
import net.ibizsys.psmodel.core.service.IPSDEFSFItemService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEFSFItemRTService extends PSModelRTServiceBase<PSDEFSFItem, PSDEFSFItemFilter> implements IPSDEFSFItemService{
    private static final Log log = LogFactory.getLog(PSDEFSFItemRTService.class);

    @Override
    public PSDEFSFItem createDomain(){
        return new PSDEFSFItem();
    }

    @Override
    public PSDEFSFItemFilter createFilter(){
        return new PSDEFSFItemFilter();
	}

	@Override
	public PSDEFSFItem getDomain(Object params) {
		if(params instanceof PSDEFSFItem) {
			return (PSDEFSFItem)params;
		}
		return getMapper().convertValue(params, PSDEFSFItem.class);
	}

	@Override
	public PSDEFSFItemFilter getFilter(Object params) {
		if(params instanceof PSDEFSFItemFilter) {
			return (PSDEFSFItemFilter)params;
		}
		return getMapper().convertValue(params, PSDEFSFItemFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEFSFITEM";
        }
        else{
            return "PSDEFSFITEMS";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEFSearchMode.class;
    }
    
    @Override
    protected List<? extends IPSDEFSearchMode> getPSModelObjectList(PSDEFSFItemFilter f) throws Exception {
    	Object objPSDEFieldId = f.getFieldCond(PSDEFSFItem.FIELD_PSDEFID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEFieldId)) {
    		objPSDEFieldId = getParentId(f, PSModels.PSDEFIELD);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSDEFieldId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSDataEntities() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSDEFSearchMode> allPSDEFSearchModeList = new ArrayList<IPSDEFSearchMode>();
    		for(IPSDataEntity iPSDataEntity : this.getPSSystemService().getPSSystem().getAllPSDataEntities()) {
    			if(iPSDataEntity.getAllPSDEFields() != null) {
    				for(IPSDEField iPSDEField : iPSDataEntity.getAllPSDEFields()) {
    					if(!ObjectUtils.isEmpty(iPSDEField.getAllPSDEFSearchModes())) {
    						allPSDEFSearchModeList.addAll(iPSDEField.getAllPSDEFSearchModes());
    					}
    				}
    			}
    		}
    		return allPSDEFSearchModeList;
    	}
    	
    	String strPSDEId = getParentId((String)objPSDEFieldId);
    	IPSDEField iPSDEField = getPSModelObject(IPSDEField.class, 
    			getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), strPSDEId, false).getAllPSDEFields(),
    			(String)objPSDEFieldId, false);
    	
    	return iPSDEField.getAllPSDEFSearchModes();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	
    	String strPSDEFieldId = getParentId(key);
    	String strPSDEId = getParentId(strPSDEFieldId);
    	
    	IPSDEField iPSDEField = getPSModelObject(IPSDEField.class, 
    			getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), strPSDEId, false).getAllPSDEFields(),
    			strPSDEFieldId, false);
    
    	return getPSModelObject(IPSDEFSearchMode.class
    			,iPSDEField.getAllPSDEFSearchModes()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEFSFItem domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	PSDEField parentPSModel = (PSDEField) this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDEFIELD, getParentId(domain.getId()));
    	domain.setPSDEFId(parentPSModel.getId());
    	domain.setPSDEFName(parentPSModel.getName());
    	domain.setPSDEId(parentPSModel.getPSDEId());
    	domain.setPSDEName(parentPSModel.getPSDEName());
    	
    
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
}
