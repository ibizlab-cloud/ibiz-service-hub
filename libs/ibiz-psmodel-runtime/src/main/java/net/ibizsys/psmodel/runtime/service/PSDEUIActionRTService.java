package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.dataentity.IPSAppDEUIAction;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.dataentity.uiaction.IPSDEUIAction;
import net.ibizsys.psmodel.core.domain.PSDEUIAction;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.filter.PSDEUIActionFilter;
import net.ibizsys.psmodel.core.service.IPSDEUIActionService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEUIActionRTService extends PSModelRTServiceBase<PSDEUIAction, PSDEUIActionFilter> implements IPSDEUIActionService{
    private static final Log log = LogFactory.getLog(PSDEUIActionRTService.class);

    @Override
    public PSDEUIAction createDomain(){
        return new PSDEUIAction();
    }

    @Override
    public PSDEUIActionFilter createFilter(){
        return new PSDEUIActionFilter();
	}

	@Override
	public PSDEUIAction getDomain(Object params) {
		if(params instanceof PSDEUIAction) {
			return (PSDEUIAction)params;
		}
		return getMapper().convertValue(params, PSDEUIAction.class);
	}

	@Override
	public PSDEUIActionFilter getFilter(Object params) {
		if(params instanceof PSDEUIActionFilter) {
			return (PSDEUIActionFilter)params;
		}
		return getMapper().convertValue(params, PSDEUIActionFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEUIACTION";
        }
        else{
            return "PSDEUIACTIONS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEUIAction.class;
    }
    
    @Override
    protected List<IPSDEUIAction> getPSModelObjectList(PSDEUIActionFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEUIAction.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
     		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	String strPSDEId = null;
    	if(objPSDEId!=null) {
    		strPSDEId = (String)objPSDEId;
    	}

    	Map<String, IPSDEUIAction> psDEUIActionMap = new HashMap<String, IPSDEUIAction>();
    	
    	List<IPSDEUIAction> psAppDEUIActionList = new ArrayList<IPSDEUIAction>();
    	if(!ObjectUtils.isEmpty(this.getPSSystemService().getPSSystem().getAllPSApps())) {
    		for(IPSApplication iPSApplication : this.getPSSystemService().getPSSystem().getAllPSApps()) {
    			if(!ObjectUtils.isEmpty(iPSApplication.getAllPSAppDataEntities())) {
    				for(IPSAppDataEntity iPSAppDataEntity : iPSApplication.getAllPSAppDataEntities()) {
    					if(!ObjectUtils.isEmpty(iPSAppDataEntity.getAllPSAppDEUIActions())) {
    						for(IPSAppDEUIAction iPSAppDEUIAction : iPSAppDataEntity.getAllPSAppDEUIActions()) {
    							if(iPSAppDEUIAction.getPSAppDataEntity() == null || iPSAppDEUIAction.getPSAppDataEntity().getPSDataEntity() == null) {
    			    				continue;
    			    			}
    							
    							//后续移动端和PC端要区分视图
    							String strId = this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSAppDEUIAction.getPSAppDataEntity().getPSDataEntity());
    			    			if(strPSDEId != null && !strPSDEId.equals(strId)) {
    			    				continue;
    			    			}
    			    			
    			    			psDEUIActionMap.put(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSAppDEUIAction), iPSAppDEUIAction);
    						}
    					}
    				}
    			}
    		}
    	}
    	
    	
    	psAppDEUIActionList.clear();
    	psAppDEUIActionList.addAll(psDEUIActionMap.values());
    	return psAppDEUIActionList;
    	
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEUIAction.class
    			,getPSModelObjectList(new PSDEUIActionFilter())
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEUIAction domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	PSDataEntity parentPSModel = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
