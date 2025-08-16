package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.msg.IPSSysMsgTempl;
import net.ibizsys.psmodel.core.domain.PSSysMsgTempl;
import net.ibizsys.psmodel.core.filter.PSSysMsgTemplFilter;
import net.ibizsys.psmodel.core.service.IPSSysMsgTemplService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysMsgTemplRTService extends PSModelRTServiceBase<PSSysMsgTempl, PSSysMsgTemplFilter> implements IPSSysMsgTemplService{
    private static final Log log = LogFactory.getLog(PSSysMsgTemplRTService.class);

    @Override
    public PSSysMsgTempl createDomain(){
        return new PSSysMsgTempl();
    }

    @Override
    public PSSysMsgTemplFilter createFilter(){
        return new PSSysMsgTemplFilter();
	}

	@Override
	public PSSysMsgTempl getDomain(Object params) {
		if(params instanceof PSSysMsgTempl) {
			return (PSSysMsgTempl)params;
		}
		return getMapper().convertValue(params, PSSysMsgTempl.class);
	}

	@Override
	public PSSysMsgTemplFilter getFilter(Object params) {
		if(params instanceof PSSysMsgTemplFilter) {
			return (PSSysMsgTemplFilter)params;
		}
		return getMapper().convertValue(params, PSSysMsgTemplFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSMSGTEMPL";
        }
        else{
            return "PSSYSMSGTEMPLS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysMsgTempl.class;
    }
    
    @Override
    protected List<? extends IPSSysMsgTempl> getPSModelObjectList(PSSysMsgTemplFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysMsgTempls();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysMsgTempl.class, this.getPSSystemService().getPSSystem().getAllPSSysMsgTempls(), (String)key, false);
    }
    
}
