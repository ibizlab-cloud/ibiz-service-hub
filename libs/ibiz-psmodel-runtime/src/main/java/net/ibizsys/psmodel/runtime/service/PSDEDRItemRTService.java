package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.dr.IPSDEDRItem;
import net.ibizsys.psmodel.core.domain.PSDEDRItem;
import net.ibizsys.psmodel.core.filter.PSDEDRItemFilter;
import net.ibizsys.psmodel.core.service.IPSDEDRItemService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEDRItemRTService extends PSModelRTServiceBase<PSDEDRItem, PSDEDRItemFilter> implements IPSDEDRItemService{
    private static final Log log = LogFactory.getLog(PSDEDRItemRTService.class);

    @Override
    public PSDEDRItem createDomain(){
        return new PSDEDRItem();
    }

    @Override
    public PSDEDRItemFilter createFilter(){
        return new PSDEDRItemFilter();
	}

	@Override
	public PSDEDRItem getDomain(Object params) {
		if(params instanceof PSDEDRItem) {
			return (PSDEDRItem)params;
		}
		return getMapper().convertValue(params, PSDEDRItem.class);
	}

	@Override
	public PSDEDRItemFilter getFilter(Object params) {
		if(params instanceof PSDEDRItemFilter) {
			return (PSDEDRItemFilter)params;
		}
		return getMapper().convertValue(params, PSDEDRItemFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEDRITEM";
        }
        else{
            return "PSDEDRITEMS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEDRItem.class;
    }
    
    @Override
    protected List<? extends IPSDEDRItem> getPSModelObjectList(PSDEDRItemFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEDRItem.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSDataEntities() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSDEDRItem> allPSDEDRItemList = new ArrayList<IPSDEDRItem>();
    		for(IPSDataEntity iPSDataEntity : this.getPSSystemService().getPSSystem().getAllPSDataEntities()) {
    			if(iPSDataEntity.getAllPSDEDRItems() != null) {
    				allPSDEDRItemList.addAll(iPSDataEntity.getAllPSDEDRItems());
    			}
    		}
    		return allPSDEDRItemList;
    	}
    	return getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)objPSDEId, false).getAllPSDEDRItems();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEDRItem.class
    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getAllPSDEDRItems()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEDRItem domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
    
//    @Override
//    protected List<PSDEDRItem> getDomainList(String strDataSetName, PSDEDRItemFilter f) throws Exception {
//    	
//    	//拿出实体全部表单
//    	Object objPSDEId = f.getFieldCond(PSDEDRItem.FIELD_PSDEID, IPSModelFilter.EQ);
//    	if(ObjectUtils.isEmpty(objPSDEId)) {
//     		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
//    	}
//    	
//    	String strPSDEId = null;
//    	if(objPSDEId!=null) {
//    		strPSDEId = (String)objPSDEId;
//    	}
//
//    	List<IPSDEForm> psDEFormList = new ArrayList<IPSDEForm>();
//    	fillPSControlList(IPSDEForm.class, psDEFormList);
//    	
//    	Map<String, IPSDEForm> psDEFormMap = new HashMap<String, IPSDEForm>();
//    	
//    	for(IPSDEForm iPSDEForm: psDEFormList) {
//    		if(StringUtils.hasLength(strPSDEId)) {
//    			if(iPSDEForm.getPSAppDataEntity() == null || iPSDEForm.getPSAppDataEntity().getPSDataEntity() == null) {
//    				continue;
//    			}
//    			
//    			String strId = this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEForm.getPSAppDataEntity().getPSDataEntity());
//    			if(!strPSDEId.equals(strId)) {
//    				continue;
//    			}
//    		}
//    		
//    		psDEFormMap.put(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEForm), iPSDEForm);
//    		
//    	}
//    	
//    	List<IPSDEFormDRUIPart> psDEFormDRUIPartList = new ArrayList<IPSDEFormDRUIPart>();
//    	for(IPSDEForm iPSDEForm : psDEFormMap.values()) {
//    		fillPSDEFormDRUIParts(iPSDEForm, psDEFormDRUIPartList);
//    	}
//    	
//    	if(ObjectUtils.isEmpty(psDEFormDRUIPartList)) {
//    		return null;
//    	}
//    	
//    	List<PSDEDRItem> psDEDRItemList = new ArrayList<PSDEDRItem>();
//    	for(IPSDEFormDRUIPart iPSDEFormDRUIPart : psDEFormDRUIPartList) {
//    		
//    		IPSDEForm iPSDEForm = iPSDEFormDRUIPart.getParentPSModelObject(IPSDEForm.class, false);
//    		String strPSDEFormId = this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEForm);
//    		
//    		PSDEDRItem psDEDRItem = new PSDEDRItem();
//    		psDEDRItem.setPSDEDRItemId(String.format("%1$s__formdruipart__%2$s", strPSDEFormId, iPSDEFormDRUIPart.getName()).toLowerCase());
//    		psDEDRItem.setPSDEDRItemName(String.format("表单关系部件[%1$s][%2$s]", iPSDEForm.getCodeName(), iPSDEFormDRUIPart.getName()));
//    		
//    		PSDataEntity parentPSModel = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(strPSDEFormId));
//    		psDEDRItem.setPSDEId(parentPSModel.getId());
//    		psDEDRItem.setPSDEName(parentPSModel.getName());
//    		
//    		psDEDRItem.dritemtype(DEDRItemType.CUSTOM);
//    		
//    		if(iPSDEFormDRUIPart.getPSAppView()!=null) {
//    			if(iPSDEFormDRUIPart.getPSAppView() instanceof IPSAppDEView) {
//    				IPSAppDEView iPSAppDEView = (IPSAppDEView)iPSDEFormDRUIPart.getPSAppView();
//    				String strTag = PSAppViewListTranspilerEx.getPSDEViewBaseId(this.getPSModelRTServiceSession(), iPSAppDEView); 
//					psDEDRItem.setPSDEViewBaseId(strTag);
//					psDEDRItem.setPSDEViewBaseName(iPSAppDEView.getTitle());
//					psDEDRItem.set("viewpsdeid", getParentId(strTag));
//    			}
//    		}
//    		
//    		//填充项
//    		String strViewParams = getPSNavigateParams(iPSDEFormDRUIPart);
//    		if(StringUtils.hasLength(strViewParams)) {
//    			psDEDRItem.setViewParams(strViewParams);
//    		}
//    		
//    		
//    		psDEDRItemList.add(psDEDRItem);
//    	}
//    	
//    	return filterDomainList(psDEDRItemList, strDataSetName, f);
//    }
//    
//    @Override
//    protected PSDEDRItem doGet(String key, boolean tryMode) throws Exception {
//    	
//    	String strPSDEId = getParentId(key);
//    	PSDEDRItemFilter psDEDRItemFilter = new PSDEDRItemFilter();
//    	psDEDRItemFilter.psdeid__eq(strPSDEId);
//    	
//    	List<PSDEDRItem> list = this.getDomainList("Default", psDEDRItemFilter);
//    	if(!ObjectUtils.isEmpty(list)) {
//    		for(PSDEDRItem psDEDRItem : list) {
//    			if(key.equals(psDEDRItem.getId())) {
//    				return psDEDRItem;
//    			}
//    		}
//    	}
//    	
//    	throw new Exception(String.format("无法获取指定模型对象[%1$s]", key));
//    }
//    
//    @Override
//    protected void doFillDomain(PSDEDRItem domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
//    	PSDataEntity parentPSModel = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
//    	domain.setPSDEId(parentPSModel.getId());
//    	domain.setPSDEName(parentPSModel.getName());
//    	super.doFillDomain(domain, iPSModelObject, bFullMode);
//    }
    
   
}
