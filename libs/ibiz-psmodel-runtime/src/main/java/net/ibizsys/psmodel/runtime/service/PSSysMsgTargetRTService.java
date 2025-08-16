package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.msg.IPSSysMsgTarget;
import net.ibizsys.psmodel.core.domain.PSSysMsgTarget;
import net.ibizsys.psmodel.core.filter.PSSysMsgTargetFilter;
import net.ibizsys.psmodel.core.service.IPSSysMsgTargetService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysMsgTargetRTService extends PSModelRTServiceBase<PSSysMsgTarget, PSSysMsgTargetFilter> implements IPSSysMsgTargetService{
    private static final Log log = LogFactory.getLog(PSSysMsgTargetRTService.class);

    @Override
    public PSSysMsgTarget createDomain(){
        return new PSSysMsgTarget();
    }

    @Override
    public PSSysMsgTargetFilter createFilter(){
        return new PSSysMsgTargetFilter();
	}

	@Override
	public PSSysMsgTarget getDomain(Object params) {
		if(params instanceof PSSysMsgTarget) {
			return (PSSysMsgTarget)params;
		}
		return getMapper().convertValue(params, PSSysMsgTarget.class);
	}

	@Override
	public PSSysMsgTargetFilter getFilter(Object params) {
		if(params instanceof PSSysMsgTargetFilter) {
			return (PSSysMsgTargetFilter)params;
		}
		return getMapper().convertValue(params, PSSysMsgTargetFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSMSGTARGET";
        }
        else{
            return "PSSYSMSGTARGETS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysMsgTarget.class;
    }
    
    @Override
    protected List<? extends IPSSysMsgTarget> getPSModelObjectList(PSSysMsgTargetFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysMsgTargets();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysMsgTarget.class, this.getPSSystemService().getPSSystem().getAllPSSysMsgTargets(), (String)key, false);
    }
}
