package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEFUIMode;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.psmodel.core.domain.PSDEFUIMode;
import net.ibizsys.psmodel.core.domain.PSDEField;
import net.ibizsys.psmodel.core.filter.PSDEFUIModeFilter;
import net.ibizsys.psmodel.core.service.IPSDEFUIModeService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModelEnums.DEFUIMode;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEFUIModeRTService extends PSModelRTServiceBase<PSDEFUIMode, PSDEFUIModeFilter> implements IPSDEFUIModeService{
    private static final Log log = LogFactory.getLog(PSDEFUIModeRTService.class);

    @Override
    public PSDEFUIMode createDomain(){
        return new PSDEFUIMode();
    }

    @Override
    public PSDEFUIModeFilter createFilter(){
        return new PSDEFUIModeFilter();
	}

	@Override
	public PSDEFUIMode getDomain(Object params) {
		if(params instanceof PSDEFUIMode) {
			return (PSDEFUIMode)params;
		}
		return getMapper().convertValue(params, PSDEFUIMode.class);
	}

	@Override
	public PSDEFUIModeFilter getFilter(Object params) {
		if(params instanceof PSDEFUIModeFilter) {
			return (PSDEFUIModeFilter)params;
		}
		return getMapper().convertValue(params, PSDEFUIModeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEFUIMODE";
        }
        else{
            return "PSDEFUIMODES";
        }
	}

    @Override
    protected String getOriginModelName() {
        return "PSDEFFORMITEM";
    }
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEFUIMode.class;
    }
    
    @Override
    protected List<? extends IPSDEFUIMode> getPSModelObjectList(PSDEFUIModeFilter f) throws Exception {
    	return null;
    }
    
    
    @Override
    protected List<PSDEFUIMode> getDomainList(String strDataSetName, PSDEFUIModeFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEFUIMode.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    		if(ObjectUtils.isEmpty(objPSDEId)) {
    			throw new Exception("未指定实体标识");
    		}
    	}
    	
    	IPSDataEntity iPSDataEntity = getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)objPSDEId, false);
    	List<PSDEFUIMode> psDEFUIModeList = new ArrayList<PSDEFUIMode>();
    	
    	if(!ObjectUtils.isEmpty(iPSDataEntity.getAllPSDEFields())) {
    		for(IPSDEField iPSDEField : iPSDataEntity.getAllPSDEFields()) {
    			psDEFUIModeList.add(new PSDEFUIMode().psdeid((String)objPSDEId).ftmode(DEFUIMode.DEFAULT).name("默认").psdefid(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEField)).psdefname(iPSDEField.getName()));
    			psDEFUIModeList.add(new PSDEFUIMode().psdeid((String)objPSDEId).ftmode(DEFUIMode.MOBILEDEFAULT).name("移动端默认").psdefid(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEField)).psdefname(iPSDEField.getName()));
    		}
    	}
    	
    	for(PSDEFUIMode psDEFUIMode : psDEFUIModeList ) {
    		psDEFUIMode.setId(String.format("%1$s.%2$s", psDEFUIMode.getPSDEFId(), psDEFUIMode.getFTMode()).toLowerCase());
    		
    	}
    		
    	
    	return this.filterDomainList(psDEFUIModeList, strDataSetName, f);
    }
    
//    @Override
//    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
//    	return getPSModelObject(IPSDEFUIMode.class
//    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getAllPSDEFUIModes()
//    			,key, tryMode);
//    }
//    
//    @Override
//    protected void doFillDomain(PSDEFUIMode domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
//    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
//    	domain.setPSDEId(parentPSModel.getId());
//    	domain.setPSDEName(parentPSModel.getName());
//    	super.doFillDomain(domain, iPSModelObject, bFullMode);
//    }
}
