package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DEFDataType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.psmodel.core.domain.PSDEField;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.filter.PSDEFieldFilter;
import net.ibizsys.psmodel.core.service.IPSDEFieldService;
import net.ibizsys.psmodel.core.util.DataTypeUtils;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEFieldRTService extends PSModelRTServiceBase<PSDEField, PSDEFieldFilter> implements IPSDEFieldService{
    private static final Log log = LogFactory.getLog(PSDEFieldRTService.class);

    @Override
    public PSDEField createDomain(){
        return new PSDEField();
    }

    @Override
    public PSDEFieldFilter createFilter(){
        return new PSDEFieldFilter();
	}

	@Override
	public PSDEField getDomain(Object params) {
		if(params instanceof PSDEField) {
			return (PSDEField)params;
		}
		return getMapper().convertValue(params, PSDEField.class);
	}

	@Override
	public PSDEFieldFilter getFilter(Object params) {
		if(params instanceof PSDEFieldFilter) {
			return (PSDEFieldFilter)params;
		}
		return getMapper().convertValue(params, PSDEFieldFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEFIELD";
        }
        else{
            return "PSDEFIELDS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEField.class;
    }
    
    @Override
    protected List<? extends IPSDEField> getPSModelObjectList(PSDEFieldFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEField.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    		if(ObjectUtils.isEmpty(objPSDEId)) {
    			throw new Exception("未指定实体标识");
    		}
    	}
    	return getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)objPSDEId, false).getAllPSDEFields();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEField.class
    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getAllPSDEFields()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEField domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
    @Override
    protected void onBeforeCreate(PSDEField m) throws Exception {
    	if(!StringUtils.hasLength(m.getPSDEId())) {
			throw new Exception("未传入实体标识");
		}
		
		PSDataEntity psDataEntity = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, m.getPSDEId());
		
		String strPSDEFieldName = m.getPSDEFieldName();
		boolean bSystemFlag = DataTypeUtils.asBoolean(m.get("systemflag"), false);
		if(!StringUtils.hasLength(strPSDEFieldName)) {
			strPSDEFieldName = String.format("uxfield%1$s", this.getRandom().nextInt(99999));
		}
		else {
			if(!bSystemFlag) {
				if(strPSDEFieldName.indexOf("ux") != 0) {
					strPSDEFieldName = String.format("ux%1$s", strPSDEFieldName);
				}
			}
		}
			
		
		String strFieldId = String.format("%1$s.%2$s", m.getPSDEId(), strPSDEFieldName.toLowerCase());
		
		m.setPSDEFieldId(strFieldId);
		m.setPSDEFieldName(strPSDEFieldName.toUpperCase());
		m.setCodeName(strPSDEFieldName.toLowerCase());
		m.setPSDEName(psDataEntity.getPSDataEntityName());
		if(!StringUtils.hasLength(m.getPSDataTypeId())) {
			m.setPSDataTypeId(DEFDataType.TEXT.value);
			m.setPSDataTypeName(DEFDataType.TEXT.text);
		}
    	super.onBeforeCreate(m);
    }
    
    @Override
    protected void onBeforeUpdate(PSDEField m) throws Exception {
    	// TODO Auto-generated method stub
    	super.onBeforeUpdate(m);
    }
    
//    @Override
//    protected void onMergeLast(PSDEField m) throws Exception {
//    	PSDEField last = this.get(m.getId(), false);
//    	//合入属性
//    	last.copyToIf(m);
//    	m.setName(last.getName());
//    	m.setCodeName(last.getCodeName());
//    	
//    	
//    	super.onMergeLast(m);
//    }
}
