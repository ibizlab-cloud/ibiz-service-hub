package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.psmodel.core.domain.PSDEDataQuery;
import net.ibizsys.psmodel.core.filter.PSDEDataQueryFilter;
import net.ibizsys.psmodel.core.service.IPSDEDataQueryService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEDataQueryRTService extends PSModelRTServiceBase<PSDEDataQuery, PSDEDataQueryFilter> implements IPSDEDataQueryService{
    private static final Log log = LogFactory.getLog(PSDEDataQueryRTService.class);

    @Override
    public PSDEDataQuery createDomain(){
        return new PSDEDataQuery();
    }

    @Override
    public PSDEDataQueryFilter createFilter(){
        return new PSDEDataQueryFilter();
	}

	@Override
	public PSDEDataQuery getDomain(Object params) {
		if(params instanceof PSDEDataQuery) {
			return (PSDEDataQuery)params;
		}
		return getMapper().convertValue(params, PSDEDataQuery.class);
	}

	@Override
	public PSDEDataQueryFilter getFilter(Object params) {
		if(params instanceof PSDEDataQueryFilter) {
			return (PSDEDataQueryFilter)params;
		}
		return getMapper().convertValue(params, PSDEDataQueryFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEDATAQUERY";
        }
        else{
            return "PSDEDATAQUERIES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEDataQuery.class;
    }
    
    @Override
    protected List<? extends IPSDEDataQuery> getPSModelObjectList(PSDEDataQueryFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEDataQuery.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSDataEntities() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSDEDataQuery> allPSDEDataQueryList = new ArrayList<IPSDEDataQuery>();
    		for(IPSDataEntity iPSDataEntity : this.getPSSystemService().getPSSystem().getAllPSDataEntities()) {
    			if(iPSDataEntity.getAllPSDEDataQueries() != null) {
    				allPSDEDataQueryList.addAll(iPSDataEntity.getAllPSDEDataQueries());
    			}
    		}
    		return allPSDEDataQueryList;
    	}
    	
    	return getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)objPSDEId, false).getAllPSDEDataQueries();
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEDataQuery.class
    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getAllPSDEDataQueries()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEDataQuery domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
