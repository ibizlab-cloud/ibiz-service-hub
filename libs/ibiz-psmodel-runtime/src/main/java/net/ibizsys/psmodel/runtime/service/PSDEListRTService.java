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
import net.ibizsys.model.control.list.IPSDEList;
import net.ibizsys.psmodel.core.domain.PSDEList;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.filter.PSDEListFilter;
import net.ibizsys.psmodel.core.service.IPSDEListService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEListRTService extends PSModelRTServiceBase<PSDEList, PSDEListFilter> implements IPSDEListService{
    private static final Log log = LogFactory.getLog(PSDEListRTService.class);

    @Override
    public PSDEList createDomain(){
        return new PSDEList();
    }

    @Override
    public PSDEListFilter createFilter(){
        return new PSDEListFilter();
	}

	@Override
	public PSDEList getDomain(Object params) {
		if(params instanceof PSDEList) {
			return (PSDEList)params;
		}
		return getMapper().convertValue(params, PSDEList.class);
	}

	@Override
	public PSDEListFilter getFilter(Object params) {
		if(params instanceof PSDEListFilter) {
			return (PSDEListFilter)params;
		}
		return getMapper().convertValue(params, PSDEListFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDELIST";
        }
        else{
            return "PSDELISTS";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSControl.class;
    }
    
    @Override
    protected List<IPSDEList> getPSModelObjectList(PSDEListFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEList.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
     		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	String strPSDEId = null;
    	if(objPSDEId!=null) {
    		strPSDEId = (String)objPSDEId;
    	}

    	List<IPSDEList> psDEListList = new ArrayList<IPSDEList>();
    	fillPSControlList(IPSDEList.class, psDEListList);
    	
    	Map<String, IPSDEList> psDEListMap = new HashMap<String, IPSDEList>();
    	
    	for(IPSDEList iPSDEList: psDEListList) {
    		if(StringUtils.hasLength(strPSDEId)) {
    			if(iPSDEList.getPSAppDataEntity() == null || iPSDEList.getPSAppDataEntity().getPSDataEntity() == null) {
    				continue;
    			}
    			
    			String strId = this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEList.getPSAppDataEntity().getPSDataEntity());
    			if(!strPSDEId.equals(strId)) {
    				continue;
    			}
    		}
    		
    		psDEListMap.put(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEList), iPSDEList);
    		
    	}
    	
    	psDEListList.clear();
    	psDEListList.addAll(psDEListMap.values());
    	return psDEListList;
    	
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEList.class
    			,getPSModelObjectList(new PSDEListFilter())
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEList domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	PSDataEntity parentPSModel = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
