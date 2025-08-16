package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.priv.IPSDEOPPriv;
import net.ibizsys.model.dataentity.priv.IPSSysDEOPPriv;
import net.ibizsys.psmodel.core.domain.PSDEOPPriv;
import net.ibizsys.psmodel.core.filter.PSDEOPPrivFilter;
import net.ibizsys.psmodel.core.service.IPSDEOPPrivService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEOPPrivRTService extends PSModelRTServiceBase<PSDEOPPriv, PSDEOPPrivFilter> implements IPSDEOPPrivService{
    private static final Log log = LogFactory.getLog(PSDEOPPrivRTService.class);

    @Override
    public PSDEOPPriv createDomain(){
        return new PSDEOPPriv();
    }

    @Override
    public PSDEOPPrivFilter createFilter(){
        return new PSDEOPPrivFilter();
	}

	@Override
	public PSDEOPPriv getDomain(Object params) {
		if(params instanceof PSDEOPPriv) {
			return (PSDEOPPriv)params;
		}
		return getMapper().convertValue(params, PSDEOPPriv.class);
	}

	@Override
	public PSDEOPPrivFilter getFilter(Object params) {
		if(params instanceof PSDEOPPrivFilter) {
			return (PSDEOPPrivFilter)params;
		}
		return getMapper().convertValue(params, PSDEOPPrivFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEOPPRIV";
        }
        else{
            return "PSDEOPPRIVS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDEOPPriv.class;
    }
    
    @Override
    protected List<? extends IPSDEOPPriv> getPSModelObjectList(PSDEOPPrivFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEOPPriv.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSDEId)) {
    		return this.getPSSystemService().getPSSystem().getAllPSDEOPPrivs();
    	}
    	return getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)objPSDEId, false).getAllPSDEOPPrivs();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	String strParentId = (String)getParentId(key);
    	if(this.getPSModelRTServiceSession().getPSModelService(PSModels.PSDATAENTITY).get(strParentId, true)!=null) {
    		return getPSModelObject(IPSDEOPPriv.class
        			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), strParentId, false).getAllPSDEOPPrivs()
        			,key, tryMode);
    	}
    	else {
    		return getPSModelObject(IPSSysDEOPPriv.class
        			,this.getPSSystemService().getPSSystem().getAllPSDEOPPrivs()
        			,key, tryMode);
    	}
    	
    }
    
    @Override
    protected void doFillDomain(PSDEOPPriv domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	if(iPSModelObject instanceof IPSSysDEOPPriv) {
    		super.doFillDomain(domain, iPSModelObject, bFullMode);
    		return;
    	}
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
}
