package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.psmodel.core.domain.PSDEUserRole;
import net.ibizsys.psmodel.core.filter.PSDEUserRoleFilter;
import net.ibizsys.psmodel.core.service.IPSDEUserRoleService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEUserRoleRTService extends PSModelRTServiceBase<PSDEUserRole, PSDEUserRoleFilter> implements IPSDEUserRoleService{
    private static final Log log = LogFactory.getLog(PSDEUserRoleRTService.class);

    @Override
    public PSDEUserRole createDomain(){
        return new PSDEUserRole();
    }

    @Override
    public PSDEUserRoleFilter createFilter(){
        return new PSDEUserRoleFilter();
	}

	@Override
	public PSDEUserRole getDomain(Object params) {
		if(params instanceof PSDEUserRole) {
			return (PSDEUserRole)params;
		}
		return getMapper().convertValue(params, PSDEUserRole.class);
	}

	@Override
	public PSDEUserRoleFilter getFilter(Object params) {
		if(params instanceof PSDEUserRoleFilter) {
			return (PSDEUserRoleFilter)params;
		}
		return getMapper().convertValue(params, PSDEUserRoleFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEUSERROLE";
        }
        else{
            return "PSDEUSERROLES";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEUserRole.class;
    }
    
    @Override
    protected List<? extends IPSDEUserRole> getPSModelObjectList(PSDEUserRoleFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEUserRole.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSDataEntities() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSDEUserRole> allPSDEUserRoleList = new ArrayList<IPSDEUserRole>();
    		for(IPSDataEntity iPSDataEntity : this.getPSSystemService().getPSSystem().getAllPSDataEntities()) {
    			if(iPSDataEntity.getAllPSDEUserRoles() != null) {
    				allPSDEUserRoleList.addAll(iPSDataEntity.getAllPSDEUserRoles());
    			}
    		}
    		return allPSDEUserRoleList;
    	}
    	return getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)objPSDEId, false).getAllPSDEUserRoles();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDEUserRole.class
    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getAllPSDEUserRoles()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDEUserRole domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
}
