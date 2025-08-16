package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DEFDataType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.psmodel.core.domain.PSDEField;
import net.ibizsys.psmodel.core.domain.PSDELogic;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.filter.PSDELogicFilter;
import net.ibizsys.psmodel.core.service.IPSDELogicService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.core.util.PSModelEnums.LogicSubType;
import net.ibizsys.psmodel.core.util.PSModelEnums.LogicType;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDELogicRTService extends PSModelRTServiceBase<PSDELogic, PSDELogicFilter> implements IPSDELogicService{
    private static final Log log = LogFactory.getLog(PSDELogicRTService.class);

    @Override
    public PSDELogic createDomain(){
        return new PSDELogic();
    }

    @Override
    public PSDELogicFilter createFilter(){
        return new PSDELogicFilter();
	}

	@Override
	public PSDELogic getDomain(Object params) {
		if(params instanceof PSDELogic) {
			return (PSDELogic)params;
		}
		return getMapper().convertValue(params, PSDELogic.class);
	}

	@Override
	public PSDELogicFilter getFilter(Object params) {
		if(params instanceof PSDELogicFilter) {
			return (PSDELogicFilter)params;
		}
		return getMapper().convertValue(params, PSDELogicFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDELOGIC";
        }
        else{
            return "PSDELOGICS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDELogic.class;
    }
    
    @Override
    protected List<? extends IPSDELogic> getPSModelObjectList(PSDELogicFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDELogic.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
     		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSDataEntities() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSDELogic> allPSDELogicList = new ArrayList<IPSDELogic>();
    		for(IPSDataEntity iPSDataEntity : this.getPSSystemService().getPSSystem().getAllPSDataEntities()) {
    			if(iPSDataEntity.getAllPSDELogics() != null) {
    				allPSDELogicList.addAll(iPSDataEntity.getAllPSDELogics());
    			}
    		}
    		return allPSDELogicList;
    	}
    	
    	return getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)objPSDEId, false).getAllPSDELogics();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDELogic.class
    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getAllPSDELogics()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDELogic domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	domain.logictype(LogicType.DELOGIC);
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
    
    @Override
    protected void onBeforeCreate(PSDELogic m) throws Exception {
    	if(!StringUtils.hasLength(m.getPSDEId())) {
			throw new Exception("未传入实体标识");
		}
		
    	PSDataEntity psDataEntity = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, m.getPSDEId());
    	String strLogicSubType = m.getLogicSubType();
    	if(StringUtils.hasLength(strLogicSubType)
    			&& (!LogicSubType.NONE.value.equals(strLogicSubType))
    			&& (!LogicSubType.DEFIELD.value.equals(strLogicSubType))){
    		m.resetCodeName();
    		m.setCodeName(String.format("ux%1$s%2$s", strLogicSubType.toLowerCase(), this.getRandom().nextInt(9999999)));
    	}
    	
    	if(!StringUtils.hasLength(m.getCodeName())) {
    		m.setCodeName(String.format("uxlogic%1$s", this.getRandom().nextInt(9999999)));
    	}

		String strPSDELogicId = String.format("%1$s.%2$s", m.getPSDEId(), m.getCodeName().toLowerCase());
		
		m.setPSDELogicId(strPSDELogicId);
		m.setPSDEName(psDataEntity.getPSDataEntityName());
		
    	super.onBeforeCreate(m);
    }
}
