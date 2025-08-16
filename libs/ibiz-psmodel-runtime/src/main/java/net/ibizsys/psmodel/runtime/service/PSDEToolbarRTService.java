package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.control.IPSControl;
import net.ibizsys.model.control.toolbar.IPSDEToolbar;
import net.ibizsys.psmodel.core.domain.PSDEToolbar;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.filter.PSDEToolbarFilter;
import net.ibizsys.psmodel.core.service.IPSDEToolbarService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEToolbarRTService extends PSModelRTServiceBase<PSDEToolbar, PSDEToolbarFilter> implements IPSDEToolbarService{
    private static final Log log = LogFactory.getLog(PSDEToolbarRTService.class);

    @Override
    public PSDEToolbar createDomain(){
        return new PSDEToolbar();
    }

    @Override
    public PSDEToolbarFilter createFilter(){
        return new PSDEToolbarFilter();
	}

	@Override
	public PSDEToolbar getDomain(Object params) {
		if(params instanceof PSDEToolbar) {
			return (PSDEToolbar)params;
		}
		return getMapper().convertValue(params, PSDEToolbar.class);
	}

	@Override
	public PSDEToolbarFilter getFilter(Object params) {
		if(params instanceof PSDEToolbarFilter) {
			return (PSDEToolbarFilter)params;
		}
		return getMapper().convertValue(params, PSDEToolbarFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDETOOLBAR";
        }
        else{
            return "PSDETOOLBARS";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSControl.class;
    }
    
    @Override
    protected List<IPSDEToolbar> getPSModelObjectList(PSDEToolbarFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEToolbar.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
     		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	String strPSDEId = null;
    	if(objPSDEId!=null) {
    		strPSDEId = (String)objPSDEId;
    	}

    	List<IPSDEToolbar> psDEToolbarList = new ArrayList<IPSDEToolbar>();
    	fillPSControlList(IPSDEToolbar.class, psDEToolbarList);
    	
    	Map<String, IPSDEToolbar> psDEToolbarMap = new HashMap<String, IPSDEToolbar>();
    	
    	for(IPSDEToolbar iPSDEToolbar: psDEToolbarList) {
    		if(StringUtils.hasLength(strPSDEId)) {
    			if(iPSDEToolbar.getPSAppDataEntity() == null || iPSDEToolbar.getPSAppDataEntity().getPSDataEntity() == null) {
    				continue;
    			}
    			
    			String strId = this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEToolbar.getPSAppDataEntity().getPSDataEntity());
    			if(!strPSDEId.equals(strId)) {
    				continue;
    			}
    		}
    		
    		psDEToolbarMap.put(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEToolbar), iPSDEToolbar);
    		
    	}
    	
    	psDEToolbarList.clear();
    	psDEToolbarList.addAll(psDEToolbarMap.values());
    	return psDEToolbarList;
    	
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEToolbar.class
    			,getPSModelObjectList(new PSDEToolbarFilter())
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEToolbar domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	PSDataEntity parentPSModel = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
