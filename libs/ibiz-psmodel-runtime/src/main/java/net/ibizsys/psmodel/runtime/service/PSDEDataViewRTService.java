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
import net.ibizsys.model.control.dataview.IPSDEDataView;
import net.ibizsys.psmodel.core.domain.PSDEDataView;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.filter.PSDEDataViewFilter;
import net.ibizsys.psmodel.core.service.IPSDEDataViewService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEDataViewRTService extends PSModelRTServiceBase<PSDEDataView, PSDEDataViewFilter> implements IPSDEDataViewService{
    private static final Log log = LogFactory.getLog(PSDEDataViewRTService.class);

    @Override
    public PSDEDataView createDomain(){
        return new PSDEDataView();
    }

    @Override
    public PSDEDataViewFilter createFilter(){
        return new PSDEDataViewFilter();
	}

	@Override
	public PSDEDataView getDomain(Object params) {
		if(params instanceof PSDEDataView) {
			return (PSDEDataView)params;
		}
		return getMapper().convertValue(params, PSDEDataView.class);
	}

	@Override
	public PSDEDataViewFilter getFilter(Object params) {
		if(params instanceof PSDEDataViewFilter) {
			return (PSDEDataViewFilter)params;
		}
		return getMapper().convertValue(params, PSDEDataViewFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEDATAVIEW";
        }
        else{
            return "PSDEDATAVIEWS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSControl.class;
    }
    
    @Override
    protected List<IPSDEDataView> getPSModelObjectList(PSDEDataViewFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEDataView.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
     		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	String strPSDEId = null;
    	if(objPSDEId!=null) {
    		strPSDEId = (String)objPSDEId;
    	}

    	List<IPSDEDataView> psDEDataViewList = new ArrayList<IPSDEDataView>();
    	fillPSControlList(IPSDEDataView.class, psDEDataViewList);
    	
    	Map<String, IPSDEDataView> psDEDataViewMap = new HashMap<String, IPSDEDataView>();
    	
    	for(IPSDEDataView iPSDEDataView: psDEDataViewList) {
    		if(StringUtils.hasLength(strPSDEId)) {
    			if(iPSDEDataView.getPSAppDataEntity() == null || iPSDEDataView.getPSAppDataEntity().getPSDataEntity() == null) {
    				continue;
    			}
    			
    			String strId = this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEDataView.getPSAppDataEntity().getPSDataEntity());
    			if(!strPSDEId.equals(strId)) {
    				continue;
    			}
    		}
    		
    		psDEDataViewMap.put(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEDataView), iPSDEDataView);
    		
    	}
    	
    	psDEDataViewList.clear();
    	psDEDataViewList.addAll(psDEDataViewMap.values());
    	return psDEDataViewList;
    	
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEDataView.class
    			,getPSModelObjectList(new PSDEDataViewFilter())
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEDataView domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	PSDataEntity parentPSModel = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
