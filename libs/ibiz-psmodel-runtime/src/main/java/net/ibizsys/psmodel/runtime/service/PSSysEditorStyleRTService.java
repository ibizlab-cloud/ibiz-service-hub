package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.res.IPSSysEditorStyle;
import net.ibizsys.psmodel.core.domain.PSSysEditorStyle;
import net.ibizsys.psmodel.core.filter.PSSysEditorStyleFilter;
import net.ibizsys.psmodel.core.service.IPSSysEditorStyleService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysEditorStyleRTService extends PSModelRTServiceBase<PSSysEditorStyle, PSSysEditorStyleFilter> implements IPSSysEditorStyleService{
    private static final Log log = LogFactory.getLog(PSSysEditorStyleRTService.class);

    @Override
    public PSSysEditorStyle createDomain(){
        return new PSSysEditorStyle();
    }

    @Override
    public PSSysEditorStyleFilter createFilter(){
        return new PSSysEditorStyleFilter();
	}

	@Override
	public PSSysEditorStyle getDomain(Object params) {
		if(params instanceof PSSysEditorStyle) {
			return (PSSysEditorStyle)params;
		}
		return getMapper().convertValue(params, PSSysEditorStyle.class);
	}

	@Override
	public PSSysEditorStyleFilter getFilter(Object params) {
		if(params instanceof PSSysEditorStyleFilter) {
			return (PSSysEditorStyleFilter)params;
		}
		return getMapper().convertValue(params, PSSysEditorStyleFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSEDITORSTYLE";
        }
        else{
            return "PSSYSEDITORSTYLES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysEditorStyle.class;
    }
    
    @Override
    protected List<? extends IPSSysEditorStyle> getPSModelObjectList(PSSysEditorStyleFilter f) throws Exception {
    	return null;
    }
    
//    @Override
//    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
//    	return getPSModelObject(IPSSysEditorStyle.class
//    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getAllPSSysEditorStyles()
//    			,key, tryMode);
//    }
//    
//    @Override
//    protected void doFillDomain(PSSysEditorStyle domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
//    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
//    	domain.setPSDEId(parentPSModel.getId());
//    	domain.setPSDEName(parentPSModel.getName());
//    	super.doFillDomain(domain, iPSModelObject, bFullMode);
//    }
}
