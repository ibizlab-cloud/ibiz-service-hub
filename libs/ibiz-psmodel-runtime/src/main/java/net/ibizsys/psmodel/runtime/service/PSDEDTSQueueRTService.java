package net.ibizsys.psmodel.runtime.service;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;
import org.springframework.util.ObjectUtils;

import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModelFilter;
import net.ibizsys.psmodel.core.util.IPSModelService;
import net.ibizsys.psmodel.core.util.PSModelServiceFactory;
import net.ibizsys.psmodel.core.util.PSModelServiceSession;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.IPSModelRTService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;
import net.ibizsys.psmodel.core.domain.PSDEDTSQueue;
import net.ibizsys.psmodel.core.service.IPSDEDTSQueueService;
import net.ibizsys.psmodel.core.filter.PSDEDTSQueueFilter;


public class PSDEDTSQueueRTService extends PSModelRTServiceBase<PSDEDTSQueue, PSDEDTSQueueFilter> implements IPSDEDTSQueueService{
    private static final Log log = LogFactory.getLog(PSDEDTSQueueRTService.class);

    @Override
    public PSDEDTSQueue createDomain(){
        return new PSDEDTSQueue();
    }

    @Override
    public PSDEDTSQueueFilter createFilter(){
        return new PSDEDTSQueueFilter();
	}

	@Override
	public PSDEDTSQueue getDomain(Object params) {
		if(params instanceof PSDEDTSQueue) {
			return (PSDEDTSQueue)params;
		}
		return getMapper().convertValue(params, PSDEDTSQueue.class);
	}

	@Override
	public PSDEDTSQueueFilter getFilter(Object params) {
		if(params instanceof PSDEDTSQueueFilter) {
			return (PSDEDTSQueueFilter)params;
		}
		return getMapper().convertValue(params, PSDEDTSQueueFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEDTSQUEUE";
        }
        else{
            return "PSDEDTSQUEUES";
        }
	}
}
