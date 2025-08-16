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
import net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup;
import net.ibizsys.psmodel.core.domain.PSDEUAGroup;
import net.ibizsys.psmodel.core.domain.PSDEUIAction;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.filter.PSDEUAGroupFilter;
import net.ibizsys.psmodel.core.service.IPSDEUAGroupService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEUAGroupRTService extends PSModelRTServiceBase<PSDEUAGroup, PSDEUAGroupFilter> implements IPSDEUAGroupService{
    private static final Log log = LogFactory.getLog(PSDEUAGroupRTService.class);

    @Override
    public PSDEUAGroup createDomain(){
        return new PSDEUAGroup();
    }

    @Override
    public PSDEUAGroupFilter createFilter(){
        return new PSDEUAGroupFilter();
	}

	@Override
	public PSDEUAGroup getDomain(Object params) {
		if(params instanceof PSDEUAGroup) {
			return (PSDEUAGroup)params;
		}
		return getMapper().convertValue(params, PSDEUAGroup.class);
	}

	@Override
	public PSDEUAGroupFilter getFilter(Object params) {
		if(params instanceof PSDEUAGroupFilter) {
			return (PSDEUAGroupFilter)params;
		}
		return getMapper().convertValue(params, PSDEUAGroupFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEUAGROUP";
        }
        else{
            return "PSDEUAGROUPS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEUIActionGroup.class;
    }
    
    @Override
    protected List<IPSDEUIActionGroup> getPSModelObjectList(PSDEUAGroupFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEUIAction.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
     		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	String strPSDEId = null;
    	if(objPSDEId!=null) {
    		strPSDEId = (String)objPSDEId;
    	}

    	Map<String, IPSDEUIActionGroup> psDEUIActionGroupMap = new HashMap<String, IPSDEUIActionGroup>();
    	
    	List<IPSDEUIActionGroup> psAppDEUIActionGroupList = new ArrayList<IPSDEUIActionGroup>();
    	if(!ObjectUtils.isEmpty(this.getPSSystemService().getPSSystem().getAllPSApps())) {
    		for(IPSApplication iPSApplication : this.getPSSystemService().getPSSystem().getAllPSApps()) {
    			if(!ObjectUtils.isEmpty(iPSApplication.getAllPSAppDataEntities())) {
    				for(IPSAppDataEntity iPSAppDataEntity : iPSApplication.getAllPSAppDataEntities()) {
    					if(iPSAppDataEntity.getPSDataEntity() == null) {
    						continue;
    					}
    					if(!ObjectUtils.isEmpty(iPSAppDataEntity.getAllPSAppDEUIActionGroups())) {
    						for(IPSAppDEUIActionGroup iPSAppDEUIActionGroup : iPSAppDataEntity.getAllPSAppDEUIActionGroups()) {
//    							if(iPSAppDEUIActionGroup.getPSAppDataEntity() == null || iPSAppDEUIActionGroup.getPSAppDataEntity().getPSDataEntity() == null) {
//    			    				continue;
//    			    			}
    							
    							//后续移动端和PC端要区分视图
    							String strId = this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSAppDataEntity.getPSDataEntity());
    			    			if(strPSDEId != null && !strPSDEId.equals(strId)) {
    			    				continue;
    			    			}
    			    			
    			    			psDEUIActionGroupMap.put(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSAppDEUIActionGroup), iPSAppDEUIActionGroup);
    						}
    					}
    				}
    			}
    		}
    	}
    	
    	
    	psAppDEUIActionGroupList.clear();
    	psAppDEUIActionGroupList.addAll(psDEUIActionGroupMap.values());
    	return psAppDEUIActionGroupList;
    	
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEUIActionGroup.class
    			,getPSModelObjectList(new PSDEUAGroupFilter())
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEUAGroup domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	PSDataEntity parentPSModel = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
