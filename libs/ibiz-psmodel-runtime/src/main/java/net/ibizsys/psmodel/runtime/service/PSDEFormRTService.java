package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.control.IPSControl;
import net.ibizsys.model.control.form.IPSDEForm;
import net.ibizsys.psmodel.core.domain.PSDEForm;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.filter.PSDEFormFilter;
import net.ibizsys.psmodel.core.service.IPSDEFormService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModelEnums.FormType;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEFormRTService extends PSModelRTServiceBase<PSDEForm, PSDEFormFilter> implements IPSDEFormService{
    private static final Log log = LogFactory.getLog(PSDEFormRTService.class);

    @Override
    public PSDEForm createDomain(){
        return new PSDEForm();
    }

    @Override
    public PSDEFormFilter createFilter(){
        return new PSDEFormFilter();
	}

	@Override
	public PSDEForm getDomain(Object params) {
		if(params instanceof PSDEForm) {
			return (PSDEForm)params;
		}
		return getMapper().convertValue(params, PSDEForm.class);
	}

	@Override
	public PSDEFormFilter getFilter(Object params) {
		if(params instanceof PSDEFormFilter) {
			return (PSDEFormFilter)params;
		}
		return getMapper().convertValue(params, PSDEFormFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEFORM";
        }
        else{
            return "PSDEFORMS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSControl.class;
    }
    
    @Override
    protected List<IPSDEForm> getPSModelObjectList(PSDEFormFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEForm.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
     		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	String strPSDEId = null;
    	if(objPSDEId!=null) {
    		strPSDEId = (String)objPSDEId;
    	}

    	List<IPSDEForm> psDEFormList = new ArrayList<IPSDEForm>();
    	fillPSControlList(IPSDEForm.class, psDEFormList);
    	
    	Map<String, IPSDEForm> psDEFormMap = new HashMap<String, IPSDEForm>();
    	
    	for(IPSDEForm iPSDEForm: psDEFormList) {
    		if(StringUtils.hasLength(strPSDEId)) {
    			if(iPSDEForm.getPSAppDataEntity() == null || iPSDEForm.getPSAppDataEntity().getPSDataEntity() == null) {
    				continue;
    			}
    			
    			String strId = this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEForm.getPSAppDataEntity().getPSDataEntity());
    			if(!strPSDEId.equals(strId)) {
    				continue;
    			}
    		}
    		
    		psDEFormMap.put(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEForm), iPSDEForm);
    		
    	}
    	
    	psDEFormList.clear();
    	psDEFormList.addAll(psDEFormMap.values());
    	return psDEFormList;
    	
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEForm.class
    			,getPSModelObjectList(new PSDEFormFilter())
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEForm domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	PSDataEntity parentPSModel = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
    @Override
    protected Map<String, Object> getDataSetConds(String strDataSetName, PSDEFormFilter f) {
    	if("CurDEEditMode".equalsIgnoreCase(strDataSetName)) {
    		return new HashMap<String, Object>(){{
    			put("n_formtype_eq","EDITFORM");
    		}};
    	}
    	
    	if("CurDESearchMode".equalsIgnoreCase(strDataSetName)) {
    		return new HashMap<String, Object>(){{
    			put("n_formtype_eq","SEARCHFORM");
    		}};
    	}
    	
    	if("CurDEWizardMode".equalsIgnoreCase(strDataSetName)) {
    		return new HashMap<String, Object>(){{
    			put("n_formtype_eq","EDITFORM");
    			put("n_funcmode_eq","WIZARDFORM");
    		}};
    	}
    	
    	return super.getDataSetConds(strDataSetName, f);
    }
    
    
    @Override
    protected void onBeforeCreate(PSDEForm m) throws Exception {
    	if(!StringUtils.hasLength(m.getPSDEId())) {
			throw new Exception("未传入实体标识");
		}
		
    	PSDataEntity psDataEntity = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, m.getPSDEId());
    	String strFormType = m.getFormType();
    	if(!StringUtils.hasLength(strFormType)) {
    		strFormType = FormType.EDITFORM.value;
    		m.setFormType(strFormType);
    	}
    	
    	if(!StringUtils.hasLength(m.getCodeName())) {
    		m.setCodeName(String.format("ux%1$s%2$s", m.getFormType().toLowerCase(), this.getRandom().nextInt(9999999)));
    	}

		String strPSDFormId = String.format("%1$s.%2$s", m.getPSDEId(), m.getCodeName().toLowerCase());
		
		m.setPSDEFormId(strPSDFormId);
		m.setPSDEName(psDataEntity.getPSDataEntityName());
		
    	super.onBeforeCreate(m);
    }
}
