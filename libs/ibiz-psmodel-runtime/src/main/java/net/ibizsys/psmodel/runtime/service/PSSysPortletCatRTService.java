package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.control.IPSAppPortletCat;
import net.ibizsys.model.res.IPSSysPortletCat;
import net.ibizsys.psmodel.core.domain.PSAppPortlet;
import net.ibizsys.psmodel.core.domain.PSSysPortletCat;
import net.ibizsys.psmodel.core.filter.PSSysPortletCatFilter;
import net.ibizsys.psmodel.core.service.IPSSysPortletCatService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysPortletCatRTService extends PSModelRTServiceBase<PSSysPortletCat, PSSysPortletCatFilter> implements IPSSysPortletCatService{
    private static final Log log = LogFactory.getLog(PSSysPortletCatRTService.class);
    
    public final static String CAT_UNGROUP = "Ungroup";

    @Override
    public PSSysPortletCat createDomain(){
        return new PSSysPortletCat();
    }

    @Override
    public PSSysPortletCatFilter createFilter(){
        return new PSSysPortletCatFilter();
	}

	@Override
	public PSSysPortletCat getDomain(Object params) {
		if(params instanceof PSSysPortletCat) {
			return (PSSysPortletCat)params;
		}
		return getMapper().convertValue(params, PSSysPortletCat.class);
	}

	@Override
	public PSSysPortletCatFilter getFilter(Object params) {
		if(params instanceof PSSysPortletCatFilter) {
			return (PSSysPortletCatFilter)params;
		}
		return getMapper().convertValue(params, PSSysPortletCatFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSPORTLETCAT";
        }
        else{
            return "PSSYSPORTLETCATS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysPortletCat.class;
    }
    
    @Override
    protected List<? extends IPSSysPortletCat> getPSModelObjectList(PSSysPortletCatFilter f) throws Exception {
    	
    	Object objPSSysAppId = f.getFieldCond(PSAppPortlet.FIELD_PSSYSAPPID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysAppId)) {
    		objPSSysAppId  = getParentId(f, PSModels.PSSYSAPP);
    	}
    	
    	if(!ObjectUtils.isEmpty(objPSSysAppId)) {
    		return getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)objPSSysAppId, false).getAllPSAppPortletCats();
		}
    	else {
    		//暂时不支持
    		return null;
    	}
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSAppPortletCat.class
    			,getPSModelObject(IPSApplication.class, this.getPSSystemService().getPSSystem().getAllPSApps(), (String)getParentId(key), false).getAllPSAppPortletCats()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSSysPortletCat domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSAPP, getParentId(domain.getId()));
    	
    	domain.set("pssysappid", parentPSModel.getId());
    	domain.set("pssysappname", parentPSModel.getName());
    	
    	
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
