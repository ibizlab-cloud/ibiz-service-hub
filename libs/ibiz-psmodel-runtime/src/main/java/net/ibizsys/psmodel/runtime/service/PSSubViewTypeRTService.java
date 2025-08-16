package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.res.IPSSubViewType;
import net.ibizsys.psmodel.core.domain.PSSubViewType;
import net.ibizsys.psmodel.core.filter.PSSubViewTypeFilter;
import net.ibizsys.psmodel.core.service.IPSSubViewTypeService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSubViewTypeRTService extends PSModelRTServiceBase<PSSubViewType, PSSubViewTypeFilter> implements IPSSubViewTypeService{
    private static final Log log = LogFactory.getLog(PSSubViewTypeRTService.class);

    @Override
    public PSSubViewType createDomain(){
        return new PSSubViewType();
    }

    @Override
    public PSSubViewTypeFilter createFilter(){
        return new PSSubViewTypeFilter();
	}

	@Override
	public PSSubViewType getDomain(Object params) {
		if(params instanceof PSSubViewType) {
			return (PSSubViewType)params;
		}
		return getMapper().convertValue(params, PSSubViewType.class);
	}

	@Override
	public PSSubViewTypeFilter getFilter(Object params) {
		if(params instanceof PSSubViewTypeFilter) {
			return (PSSubViewTypeFilter)params;
		}
		return getMapper().convertValue(params, PSSubViewTypeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSUBVIEWTYPE";
        }
        else{
            return "PSSUBVIEWTYPES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSubViewType.class;
    }
    
    @Override
    protected List<? extends IPSSubViewType> getPSModelObjectList(PSSubViewTypeFilter f) throws Exception {
    	return null;
    }
    
//    @Override
//    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
//    	return getPSModelObject(IPSSubViewType.class
//    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getAllPSSubViewTypes()
//    			,key, tryMode);
//    }
//    
//    @Override
//    protected void doFillDomain(PSSubViewType domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
//    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
//    	domain.setPSDEId(parentPSModel.getId());
//    	domain.setPSDEName(parentPSModel.getName());
//    	super.doFillDomain(domain, iPSModelObject, bFullMode);
//    }
}
