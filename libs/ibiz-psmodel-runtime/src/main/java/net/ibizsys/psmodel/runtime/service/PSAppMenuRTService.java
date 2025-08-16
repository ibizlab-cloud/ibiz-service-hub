package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.appmenu.IPSAppMenuModel;
import net.ibizsys.model.control.menu.IPSAppMenu;
import net.ibizsys.psmodel.core.domain.PSAppMenu;
import net.ibizsys.psmodel.core.filter.PSAppMenuFilter;
import net.ibizsys.psmodel.core.service.IPSAppMenuService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSAppMenuRTService extends PSModelRTServiceBase<PSAppMenu, PSAppMenuFilter> implements IPSAppMenuService{
    private static final Log log = LogFactory.getLog(PSAppMenuRTService.class);

    @Override
    public PSAppMenu createDomain(){
        return new PSAppMenu();
    }

    @Override
    public PSAppMenuFilter createFilter(){
        return new PSAppMenuFilter();
	}

	@Override
	public PSAppMenu getDomain(Object params) {
		if(params instanceof PSAppMenu) {
			return (PSAppMenu)params;
		}
		return getMapper().convertValue(params, PSAppMenu.class);
	}

	@Override
	public PSAppMenuFilter getFilter(Object params) {
		if(params instanceof PSAppMenuFilter) {
			return (PSAppMenuFilter)params;
		}
		return getMapper().convertValue(params, PSAppMenuFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPMENU";
        }
        else{
            return "PSAPPMENUS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSAppMenuModel.class;
    }
    
    @Override
    protected List<? extends IPSAppMenuModel> getPSModelObjectList(PSAppMenuFilter f) throws Exception {
    	
    	Object objPSSysAppId = f.getFieldCond(PSAppMenu.FIELD_PSSYSAPPID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysAppId)) {
    		objPSSysAppId  = getParentId(f, PSModels.PSSYSAPP);
    		if(ObjectUtils.isEmpty(objPSSysAppId)) {
    			throw new Exception("未指定应用标识");
    		}
    	}
    	return getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)objPSSysAppId, false).getAllPSAppMenuModels();
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSAppMenuModel.class
    			,getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)getParentId(key), false).getAllPSAppMenuModels()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSAppMenu domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAPP, getParentId(domain.getId()));
    	domain.setPSSysAppId(parentPSModel.getId());
    	domain.setPSSysAppName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }

}
