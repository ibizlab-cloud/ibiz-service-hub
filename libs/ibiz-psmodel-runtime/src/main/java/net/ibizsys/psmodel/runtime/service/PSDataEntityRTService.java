package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.filter.PSDataEntityFilter;
import net.ibizsys.psmodel.core.service.IPSDataEntityService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDataEntityRTService extends PSModelRTServiceBase<PSDataEntity, PSDataEntityFilter> implements IPSDataEntityService{
    private static final Log log = LogFactory.getLog(PSDataEntityRTService.class);

    @Override
    public PSDataEntity createDomain(){
        return new PSDataEntity();
    }

    @Override
    public PSDataEntityFilter createFilter(){
        return new PSDataEntityFilter();
	}

	@Override
	public PSDataEntity getDomain(Object params) {
		if(params instanceof PSDataEntity) {
			return (PSDataEntity)params;
		}
		return getMapper().convertValue(params, PSDataEntity.class);
	}

	@Override
	public PSDataEntityFilter getFilter(Object params) {
		if(params instanceof PSDataEntityFilter) {
			return (PSDataEntityFilter)params;
		}
		return getMapper().convertValue(params, PSDataEntityFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDATAENTITY";
        }
        else{
            return "PSDATAENTITIES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDataEntity.class;
    }
    
    @Override
    protected List<? extends IPSDataEntity> getPSModelObjectList(PSDataEntityFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSDataEntities();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)key, tryMode);
    }
}
