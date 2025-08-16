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
import net.ibizsys.model.app.dataentity.IPSAppDEACMode;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.dataentity.ac.IPSDEACMode;
import net.ibizsys.psmodel.core.domain.PSDEACMode;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.filter.PSDEACModeFilter;
import net.ibizsys.psmodel.core.service.IPSDEACModeService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEACModeRTService extends PSModelRTServiceBase<PSDEACMode, PSDEACModeFilter> implements IPSDEACModeService{
    private static final Log log = LogFactory.getLog(PSDEACModeRTService.class);

    @Override
    public PSDEACMode createDomain(){
        return new PSDEACMode();
    }

    @Override
    public PSDEACModeFilter createFilter(){
        return new PSDEACModeFilter();
	}

	@Override
	public PSDEACMode getDomain(Object params) {
		if(params instanceof PSDEACMode) {
			return (PSDEACMode)params;
		}
		return getMapper().convertValue(params, PSDEACMode.class);
	}

	@Override
	public PSDEACModeFilter getFilter(Object params) {
		if(params instanceof PSDEACModeFilter) {
			return (PSDEACModeFilter)params;
		}
		return getMapper().convertValue(params, PSDEACModeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEACMODE";
        }
        else{
            return "PSDEACMODES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEACMode.class;
    }
    
    @Override
    protected List<IPSDEACMode> getPSModelObjectList(PSDEACModeFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEACMode.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
     		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	String strPSDEId = null;
    	if(objPSDEId!=null) {
    		strPSDEId = (String)objPSDEId;
    	}

    	Map<String, IPSDEACMode> psDEACModeMap = new HashMap<String, IPSDEACMode>();
    	
    	List<IPSDEACMode> psAppDEACModeList = new ArrayList<IPSDEACMode>();
    	if(!ObjectUtils.isEmpty(this.getPSSystemService().getPSSystem().getAllPSApps())) {
    		for(IPSApplication iPSApplication : this.getPSSystemService().getPSSystem().getAllPSApps()) {
    			if(!ObjectUtils.isEmpty(iPSApplication.getAllPSAppDataEntities())) {
    				for(IPSAppDataEntity iPSAppDataEntity : iPSApplication.getAllPSAppDataEntities()) {
    					
    					if(iPSAppDataEntity.getPSDataEntity() == null) {
    						continue;
    					}
    					
    					String strId = this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSAppDataEntity.getPSDataEntity());
		    			if(strPSDEId != null && !strPSDEId.equals(strId)) {
		    				continue;
		    			}
    					
    					if(!ObjectUtils.isEmpty(iPSAppDataEntity.getAllPSAppDEACModes())) {
    						for(IPSAppDEACMode iPSAppDEACMode : iPSAppDataEntity.getAllPSAppDEACModes()) {
    			    			psDEACModeMap.put(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSAppDEACMode), iPSAppDEACMode);
    						}
    					}
    				}
    			}
    		}
    	}
    	
    	
    	psAppDEACModeList.clear();
    	psAppDEACModeList.addAll(psDEACModeMap.values());
    	return psAppDEACModeList;
    	
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEACMode.class
    			,getPSModelObjectList(new PSDEACModeFilter())
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEACMode domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	PSDataEntity parentPSModel = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
}
