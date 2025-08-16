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
import net.ibizsys.model.control.tree.IPSDETree;
import net.ibizsys.psmodel.core.domain.PSDETreeView;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.filter.PSDETreeViewFilter;
import net.ibizsys.psmodel.core.service.IPSDETreeViewService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDETreeViewRTService extends PSModelRTServiceBase<PSDETreeView, PSDETreeViewFilter> implements IPSDETreeViewService{
    private static final Log log = LogFactory.getLog(PSDETreeViewRTService.class);

    @Override
    public PSDETreeView createDomain(){
        return new PSDETreeView();
    }

    @Override
    public PSDETreeViewFilter createFilter(){
        return new PSDETreeViewFilter();
	}

	@Override
	public PSDETreeView getDomain(Object params) {
		if(params instanceof PSDETreeView) {
			return (PSDETreeView)params;
		}
		return getMapper().convertValue(params, PSDETreeView.class);
	}

	@Override
	public PSDETreeViewFilter getFilter(Object params) {
		if(params instanceof PSDETreeViewFilter) {
			return (PSDETreeViewFilter)params;
		}
		return getMapper().convertValue(params, PSDETreeViewFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDETREEVIEW";
        }
        else{
            return "PSDETREEVIEWS";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSControl.class;
    }
    
    @Override
    protected List<IPSDETree> getPSModelObjectList(PSDETreeViewFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDETreeView.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
     		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	String strPSDEId = null;
    	if(objPSDEId!=null) {
    		strPSDEId = (String)objPSDEId;
    	}

    	List<IPSDETree> psDETreeViewList = new ArrayList<IPSDETree>();
    	fillPSControlList(IPSDETree.class, psDETreeViewList);
    	
    	Map<String, IPSDETree> psDETreeViewMap = new HashMap<String, IPSDETree>();
    	
    	for(IPSDETree iPSDETreeView: psDETreeViewList) {
    		if(StringUtils.hasLength(strPSDEId)) {
    			if(iPSDETreeView.getPSAppDataEntity() == null || iPSDETreeView.getPSAppDataEntity().getPSDataEntity() == null) {
    				continue;
    			}
    			
    			String strId = this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDETreeView.getPSAppDataEntity().getPSDataEntity());
    			if(!strPSDEId.equals(strId)) {
    				continue;
    			}
    		}
    		
    		psDETreeViewMap.put(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDETreeView), iPSDETreeView);
    		
    	}
    	
    	psDETreeViewList.clear();
    	psDETreeViewList.addAll(psDETreeViewMap.values());
    	return psDETreeViewList;
    	
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDETree.class
    			,getPSModelObjectList(new PSDETreeViewFilter())
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDETreeView domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	PSDataEntity parentPSModel = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
}
