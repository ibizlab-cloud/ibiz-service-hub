package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.psmodel.core.domain.PSDEDataSet;
import net.ibizsys.psmodel.core.filter.PSDEDataSetFilter;
import net.ibizsys.psmodel.core.service.IPSDEDataSetService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEDataSetRTService extends PSModelRTServiceBase<PSDEDataSet, PSDEDataSetFilter> implements IPSDEDataSetService{
    private static final Log log = LogFactory.getLog(PSDEDataSetRTService.class);

    @Override
    public PSDEDataSet createDomain(){
        return new PSDEDataSet();
    }

    @Override
    public PSDEDataSetFilter createFilter(){
        return new PSDEDataSetFilter();
	}

	@Override
	public PSDEDataSet getDomain(Object params) {
		if(params instanceof PSDEDataSet) {
			return (PSDEDataSet)params;
		}
		return getMapper().convertValue(params, PSDEDataSet.class);
	}

	@Override
	public PSDEDataSetFilter getFilter(Object params) {
		if(params instanceof PSDEDataSetFilter) {
			return (PSDEDataSetFilter)params;
		}
		return getMapper().convertValue(params, PSDEDataSetFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEDATASET";
        }
        else{
            return "PSDEDATASETS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEDataSet.class;
    }
    
    @Override
    protected List<? extends IPSDEDataSet> getPSModelObjectList(PSDEDataSetFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEDataSet.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSDataEntities() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSDEDataSet> allPSDEDataSetList = new ArrayList<IPSDEDataSet>();
    		for(IPSDataEntity iPSDataEntity : this.getPSSystemService().getPSSystem().getAllPSDataEntities()) {
    			if(iPSDataEntity.getAllPSDEDataSets() != null) {
    				allPSDEDataSetList.addAll(iPSDataEntity.getAllPSDEDataSets());
    			}
    		}
    		return allPSDEDataSetList;
    	}
    	
    	return getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)objPSDEId, false).getAllPSDEDataSets();
    }
  
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEDataSet.class
    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getAllPSDEDataSets()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEDataSet domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
