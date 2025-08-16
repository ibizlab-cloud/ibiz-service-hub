package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.dataimport.IPSDEDataImport;
import net.ibizsys.psmodel.core.domain.PSDEDataExp;
import net.ibizsys.psmodel.core.domain.PSDEDataImp;
import net.ibizsys.psmodel.core.filter.PSDEDataImpFilter;
import net.ibizsys.psmodel.core.service.IPSDEDataImpService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEDataImpRTService extends PSModelRTServiceBase<PSDEDataImp, PSDEDataImpFilter> implements IPSDEDataImpService{
    private static final Log log = LogFactory.getLog(PSDEDataImpRTService.class);

    @Override
    public PSDEDataImp createDomain(){
        return new PSDEDataImp();
    }

    @Override
    public PSDEDataImpFilter createFilter(){
        return new PSDEDataImpFilter();
	}

	@Override
	public PSDEDataImp getDomain(Object params) {
		if(params instanceof PSDEDataImp) {
			return (PSDEDataImp)params;
		}
		return getMapper().convertValue(params, PSDEDataImp.class);
	}

	@Override
	public PSDEDataImpFilter getFilter(Object params) {
		if(params instanceof PSDEDataImpFilter) {
			return (PSDEDataImpFilter)params;
		}
		return getMapper().convertValue(params, PSDEDataImpFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEDATAIMP";
        }
        else{
            return "PSDEDATAIMPS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEDataImport.class;
    }
    
    @Override
    protected List<? extends IPSDEDataImport> getPSModelObjectList(PSDEDataImpFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEDataExp.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSDataEntities() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSDEDataImport> allPSDEDataImportList = new ArrayList<IPSDEDataImport>();
    		for(IPSDataEntity iPSDataEntity : this.getPSSystemService().getPSSystem().getAllPSDataEntities()) {
    			if(iPSDataEntity.getAllPSDEDataImports() != null) {
    				allPSDEDataImportList.addAll(iPSDataEntity.getAllPSDEDataImports());
    			}
    		}
    		return allPSDEDataImportList;
    	}
    	return getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)objPSDEId, false).getAllPSDEDataImports();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEDataImport.class
    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getAllPSDEDataImports()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEDataImp domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
