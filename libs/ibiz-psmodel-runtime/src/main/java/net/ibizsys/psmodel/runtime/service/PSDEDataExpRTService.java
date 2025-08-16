package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExport;
import net.ibizsys.psmodel.core.domain.PSDEDataExp;
import net.ibizsys.psmodel.core.filter.PSDEDataExpFilter;
import net.ibizsys.psmodel.core.service.IPSDEDataExpService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEDataExpRTService extends PSModelRTServiceBase<PSDEDataExp, PSDEDataExpFilter> implements IPSDEDataExpService{
    private static final Log log = LogFactory.getLog(PSDEDataExpRTService.class);

    @Override
    public PSDEDataExp createDomain(){
        return new PSDEDataExp();
    }

    @Override
    public PSDEDataExpFilter createFilter(){
        return new PSDEDataExpFilter();
	}

	@Override
	public PSDEDataExp getDomain(Object params) {
		if(params instanceof PSDEDataExp) {
			return (PSDEDataExp)params;
		}
		return getMapper().convertValue(params, PSDEDataExp.class);
	}

	@Override
	public PSDEDataExpFilter getFilter(Object params) {
		if(params instanceof PSDEDataExpFilter) {
			return (PSDEDataExpFilter)params;
		}
		return getMapper().convertValue(params, PSDEDataExpFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEDATAEXP";
        }
        else{
            return "PSDEDATAEXPS";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEDataExport.class;
    }
    
    @Override
    protected List<? extends IPSDEDataExport> getPSModelObjectList(PSDEDataExpFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEDataExp.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSDataEntities() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSDEDataExport> allPSDEDataExportList = new ArrayList<IPSDEDataExport>();
    		for(IPSDataEntity iPSDataEntity : this.getPSSystemService().getPSSystem().getAllPSDataEntities()) {
    			if(iPSDataEntity.getAllPSDEDataExports() != null) {
    				allPSDEDataExportList.addAll(iPSDataEntity.getAllPSDEDataExports());
    			}
    		}
    		return allPSDEDataExportList;
    	}
    	return getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)objPSDEId, false).getAllPSDEDataExports();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEDataExport.class
    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getAllPSDEDataExports()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEDataExp domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
}
