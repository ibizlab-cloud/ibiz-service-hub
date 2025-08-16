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
import net.ibizsys.model.control.grid.IPSDEGrid;
import net.ibizsys.psmodel.core.domain.PSDEGrid;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.filter.PSDEGridFilter;
import net.ibizsys.psmodel.core.service.IPSDEGridService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEGridRTService extends PSModelRTServiceBase<PSDEGrid, PSDEGridFilter> implements IPSDEGridService{
    private static final Log log = LogFactory.getLog(PSDEGridRTService.class);

    @Override
    public PSDEGrid createDomain(){
        return new PSDEGrid();
    }

    @Override
    public PSDEGridFilter createFilter(){
        return new PSDEGridFilter();
	}

	@Override
	public PSDEGrid getDomain(Object params) {
		if(params instanceof PSDEGrid) {
			return (PSDEGrid)params;
		}
		return getMapper().convertValue(params, PSDEGrid.class);
	}

	@Override
	public PSDEGridFilter getFilter(Object params) {
		if(params instanceof PSDEGridFilter) {
			return (PSDEGridFilter)params;
		}
		return getMapper().convertValue(params, PSDEGridFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEGRID";
        }
        else{
            return "PSDEGRIDS";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSControl.class;
    }
    
    @Override
    protected List<IPSDEGrid> getPSModelObjectList(PSDEGridFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEGrid.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
     		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	String strPSDEId = null;
    	if(objPSDEId!=null) {
    		strPSDEId = (String)objPSDEId;
    	}

    	List<IPSDEGrid> psDEGridList = new ArrayList<IPSDEGrid>();
    	fillPSControlList(IPSDEGrid.class, psDEGridList);
    	
    	Map<String, IPSDEGrid> psDEGridMap = new HashMap<String, IPSDEGrid>();
    	
    	for(IPSDEGrid iPSDEGrid: psDEGridList) {
    		if(StringUtils.hasLength(strPSDEId)) {
    			if(iPSDEGrid.getPSAppDataEntity() == null || iPSDEGrid.getPSAppDataEntity().getPSDataEntity() == null) {
    				continue;
    			}
    			
    			String strId = this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEGrid.getPSAppDataEntity().getPSDataEntity());
    			if(!strPSDEId.equals(strId)) {
    				continue;
    			}
    		}
    		
    		psDEGridMap.put(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEGrid), iPSDEGrid);
    		
    	}
    	
    	psDEGridList.clear();
    	psDEGridList.addAll(psDEGridMap.values());
    	return psDEGridList;
    	
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEGrid.class
    			,getPSModelObjectList(new PSDEGridFilter())
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEGrid domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	PSDataEntity parentPSModel = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
