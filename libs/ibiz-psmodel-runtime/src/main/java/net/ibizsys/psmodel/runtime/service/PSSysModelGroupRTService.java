package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.system.IPSSysModelGroup;
import net.ibizsys.psmodel.core.domain.PSSysModelGroup;
import net.ibizsys.psmodel.core.filter.PSSysModelGroupFilter;
import net.ibizsys.psmodel.core.service.IPSSysModelGroupService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysModelGroupRTService extends PSModelRTServiceBase<PSSysModelGroup, PSSysModelGroupFilter> implements IPSSysModelGroupService{
    private static final Log log = LogFactory.getLog(PSSysModelGroupRTService.class);

    @Override
    public PSSysModelGroup createDomain(){
        return new PSSysModelGroup();
    }

    @Override
    public PSSysModelGroupFilter createFilter(){
        return new PSSysModelGroupFilter();
	}

	@Override
	public PSSysModelGroup getDomain(Object params) {
		if(params instanceof PSSysModelGroup) {
			return (PSSysModelGroup)params;
		}
		return getMapper().convertValue(params, PSSysModelGroup.class);
	}

	@Override
	public PSSysModelGroupFilter getFilter(Object params) {
		if(params instanceof PSSysModelGroupFilter) {
			return (PSSysModelGroupFilter)params;
		}
		return getMapper().convertValue(params, PSSysModelGroupFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSMODELGROUP";
        }
        else{
            return "PSSYSMODELGROUPS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysModelGroup.class;
    }
    
    @Override
    protected List<? extends IPSSysModelGroup> getPSModelObjectList(PSSysModelGroupFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysModelGroups();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysModelGroup.class, this.getPSSystemService().getPSSystem().getAllPSSysModelGroups(), (String)key, tryMode);
    }
}
