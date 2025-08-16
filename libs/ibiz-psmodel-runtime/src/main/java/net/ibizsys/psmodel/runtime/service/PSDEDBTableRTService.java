package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.database.IPSDEDBTable;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.psmodel.core.domain.PSDEDBTable;
import net.ibizsys.psmodel.core.filter.PSDEDBTableFilter;
import net.ibizsys.psmodel.core.service.IPSDEDBTableService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEDBTableRTService extends PSModelRTServiceBase<PSDEDBTable, PSDEDBTableFilter> implements IPSDEDBTableService{
    private static final Log log = LogFactory.getLog(PSDEDBTableRTService.class);

    @Override
    public PSDEDBTable createDomain(){
        return new PSDEDBTable();
    }

    @Override
    public PSDEDBTableFilter createFilter(){
        return new PSDEDBTableFilter();
	}

	@Override
	public PSDEDBTable getDomain(Object params) {
		if(params instanceof PSDEDBTable) {
			return (PSDEDBTable)params;
		}
		return getMapper().convertValue(params, PSDEDBTable.class);
	}

	@Override
	public PSDEDBTableFilter getFilter(Object params) {
		if(params instanceof PSDEDBTableFilter) {
			return (PSDEDBTableFilter)params;
		}
		return getMapper().convertValue(params, PSDEDBTableFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEDBTABLE";
        }
        else{
            return "PSDEDBTABLES";
        }
	}

    @Override
    protected String getOriginModelName() {
        return "PSDETABLE";
    }
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEDBTable.class;
    }
    
    @Override
    protected List<? extends IPSDEDBTable> getPSModelObjectList(PSDEDBTableFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEDBTable.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	Object objPSSysDBTableId = f.getFieldCond(PSDEDBTable.FIELD_PSSYSDBTABLEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysDBTableId)) {
			objPSSysDBTableId = getParentId(f, PSModels.PSSYSDBTABLE);
			if(!ObjectUtils.isEmpty(objPSSysDBTableId)) {
				f.setFieldCond(PSDEDBTable.FIELD_PSSYSDBTABLEID, IPSModelFilter.EQ, objPSSysDBTableId);
			}
    	}
    	
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSDataEntities() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSDEDBTable> allPSDEDBTableList = new ArrayList<IPSDEDBTable>();
    		for(IPSDataEntity iPSDataEntity : this.getPSSystemService().getPSSystem().getAllPSDataEntities()) {
    			if(iPSDataEntity.getAllPSDEDBTables() != null) {
    				allPSDEDBTableList.addAll(iPSDataEntity.getAllPSDEDBTables());
    			}
    		}
    		return allPSDEDBTableList;
    	}
    	return getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)objPSDEId, false).getAllPSDEDBTables();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEDBTable.class
    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getAllPSDEDBTables()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEDBTable domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
