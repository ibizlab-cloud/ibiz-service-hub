package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEFGroup;
import net.ibizsys.psmodel.core.domain.PSDEFGroup;
import net.ibizsys.psmodel.core.filter.PSDEFGroupFilter;
import net.ibizsys.psmodel.core.service.IPSDEFGroupService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEFGroupRTService extends PSModelRTServiceBase<PSDEFGroup, PSDEFGroupFilter> implements IPSDEFGroupService{
    private static final Log log = LogFactory.getLog(PSDEFGroupRTService.class);

    @Override
    public PSDEFGroup createDomain(){
        return new PSDEFGroup();
    }

    @Override
    public PSDEFGroupFilter createFilter(){
        return new PSDEFGroupFilter();
	}

	@Override
	public PSDEFGroup getDomain(Object params) {
		if(params instanceof PSDEFGroup) {
			return (PSDEFGroup)params;
		}
		return getMapper().convertValue(params, PSDEFGroup.class);
	}

	@Override
	public PSDEFGroupFilter getFilter(Object params) {
		if(params instanceof PSDEFGroupFilter) {
			return (PSDEFGroupFilter)params;
		}
		return getMapper().convertValue(params, PSDEFGroupFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEFGROUP";
        }
        else{
            return "PSDEFGROUPS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEFGroup.class;
    }
    
    @Override
    protected List<? extends IPSDEFGroup> getPSModelObjectList(PSDEFGroupFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEFGroup.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSDataEntities() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSDEFGroup> allPSDEFGroupList = new ArrayList<IPSDEFGroup>();
    		for(IPSDataEntity iPSDataEntity : this.getPSSystemService().getPSSystem().getAllPSDataEntities()) {
    			if(iPSDataEntity.getAllPSDEFGroups() != null) {
    				allPSDEFGroupList.addAll(iPSDataEntity.getAllPSDEFGroups());
    			}
    		}
    		return allPSDEFGroupList;
    	}
    	return getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)objPSDEId, false).getAllPSDEFGroups();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEFGroup.class
    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getAllPSDEFGroups()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEFGroup domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
