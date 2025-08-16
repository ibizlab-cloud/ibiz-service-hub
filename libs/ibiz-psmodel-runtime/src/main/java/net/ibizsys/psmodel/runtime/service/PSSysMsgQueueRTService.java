package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.msg.IPSSysMsgQueue;
import net.ibizsys.psmodel.core.domain.PSSysMsgQueue;
import net.ibizsys.psmodel.core.filter.PSSysMsgQueueFilter;
import net.ibizsys.psmodel.core.service.IPSSysMsgQueueService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysMsgQueueRTService extends PSModelRTServiceBase<PSSysMsgQueue, PSSysMsgQueueFilter> implements IPSSysMsgQueueService{
    private static final Log log = LogFactory.getLog(PSSysMsgQueueRTService.class);

    @Override
    public PSSysMsgQueue createDomain(){
        return new PSSysMsgQueue();
    }

    @Override
    public PSSysMsgQueueFilter createFilter(){
        return new PSSysMsgQueueFilter();
	}

	@Override
	public PSSysMsgQueue getDomain(Object params) {
		if(params instanceof PSSysMsgQueue) {
			return (PSSysMsgQueue)params;
		}
		return getMapper().convertValue(params, PSSysMsgQueue.class);
	}

	@Override
	public PSSysMsgQueueFilter getFilter(Object params) {
		if(params instanceof PSSysMsgQueueFilter) {
			return (PSSysMsgQueueFilter)params;
		}
		return getMapper().convertValue(params, PSSysMsgQueueFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSMSGQUEUE";
        }
        else{
            return "PSSYSMSGQUEUES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysMsgQueue.class;
    }
    
    @Override
    protected List<? extends IPSSysMsgQueue> getPSModelObjectList(PSSysMsgQueueFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysMsgQueues();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysMsgQueue.class, this.getPSSystemService().getPSSystem().getAllPSSysMsgQueues(), (String)key, false);
    }
}
