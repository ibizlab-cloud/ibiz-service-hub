package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEFGroup;
import net.ibizsys.psmodel.core.domain.PSDEFGroup;
import net.ibizsys.psmodel.core.domain.PSDEGroup;
import net.ibizsys.psmodel.core.filter.PSDEFGroupFilter;
import net.ibizsys.psmodel.core.filter.PSDEGroupFilter;
import net.ibizsys.psmodel.core.service.IPSDEGroupService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEGroupRTService extends PSModelRTServiceBase<PSDEGroup, PSDEGroupFilter> implements IPSDEGroupService{
    private static final Log log = LogFactory.getLog(PSDEGroupRTService.class);

    @Override
    public PSDEGroup createDomain(){
        return new PSDEGroup();
    }

    @Override
    public PSDEGroupFilter createFilter(){
        return new PSDEGroupFilter();
	}

	@Override
	public PSDEGroup getDomain(Object params) {
		if(params instanceof PSDEGroup) {
			return (PSDEGroup)params;
		}
		return getMapper().convertValue(params, PSDEGroup.class);
	}

	@Override
	public PSDEGroupFilter getFilter(Object params) {
		if(params instanceof PSDEGroupFilter) {
			return (PSDEGroupFilter)params;
		}
		return getMapper().convertValue(params, PSDEGroupFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEGROUP";
        }
        else{
            return "PSDEGROUPS";
        }
	}
    
 
}
