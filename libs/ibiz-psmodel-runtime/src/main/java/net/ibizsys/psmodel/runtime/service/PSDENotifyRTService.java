package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.notify.IPSDENotify;
import net.ibizsys.psmodel.core.domain.PSDENotify;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.filter.PSDENotifyFilter;
import net.ibizsys.psmodel.core.service.IPSDENotifyService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDENotifyRTService extends PSModelRTServiceBase<PSDENotify, PSDENotifyFilter> implements IPSDENotifyService{
    private static final Log log = LogFactory.getLog(PSDENotifyRTService.class);

    @Override
    public PSDENotify createDomain(){
        return new PSDENotify();
    }

    @Override
    public PSDENotifyFilter createFilter(){
        return new PSDENotifyFilter();
	}

	@Override
	public PSDENotify getDomain(Object params) {
		if(params instanceof PSDENotify) {
			return (PSDENotify)params;
		}
		return getMapper().convertValue(params, PSDENotify.class);
	}

	@Override
	public PSDENotifyFilter getFilter(Object params) {
		if(params instanceof PSDENotifyFilter) {
			return (PSDENotifyFilter)params;
		}
		return getMapper().convertValue(params, PSDENotifyFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDENOTIFY";
        }
        else{
            return "PSDENOTIFIES";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDENotify.class;
    }
    
    @Override
    protected List<? extends IPSDENotify> getPSModelObjectList(PSDENotifyFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDENotify.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
     		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSDataEntities() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSDENotify> allPSDENotifyList = new ArrayList<IPSDENotify>();
    		for(IPSDataEntity iPSDataEntity : this.getPSSystemService().getPSSystem().getAllPSDataEntities()) {
    			if(iPSDataEntity.getAllPSDENotifies() != null) {
    				allPSDENotifyList.addAll(iPSDataEntity.getAllPSDENotifies());
    			}
    		}
    		return allPSDENotifyList;
    	}
    	
    	return getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)objPSDEId, false).getAllPSDENotifies();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDENotify.class
    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getAllPSDENotifies()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDENotify domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	//domain.logictype(Type.DELOGIC);
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
    
    @Override
    protected void onBeforeCreate(PSDENotify m) throws Exception {
    	if(!StringUtils.hasLength(m.getPSDEId())) {
			throw new Exception("未传入实体标识");
		}
		
    	PSDataEntity psDataEntity = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, m.getPSDEId());
//    	String strSubType = m.getSubType();
//    	if(StringUtils.hasLength(strSubType)
//    			&& (!SubType.NONE.value.equals(strSubType))
//    			&& (!SubType.DEFIELD.value.equals(strSubType))){
//    		m.resetCodeName();
//    		m.setCodeName(String.format("ux%1$s%2$s", strSubType.toLowerCase(), this.getRandom().nextInt(9999999)));
//    	}
    	
    	if(!StringUtils.hasLength(m.getCodeName())) {
    		m.setCodeName(String.format("uxnotify%1$s", this.getRandom().nextInt(9999999)));
    	}

		String strPSDENotifyId = String.format("%1$s.%2$s", m.getPSDEId(), m.getCodeName().toLowerCase());
		
		m.setPSDENotifyId(strPSDENotifyId);
		m.setPSDEName(psDataEntity.getPSDataEntityName());
		
    	super.onBeforeCreate(m);
    }
}
