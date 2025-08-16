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
import net.ibizsys.psmodel.core.domain.PSSysAIWorkerAgent;
import net.ibizsys.psmodel.core.service.IPSSysAIWorkerAgentService;
import net.ibizsys.psmodel.core.filter.PSSysAIWorkerAgentFilter;


public class PSSysAIWorkerAgentRTService extends PSModelRTServiceBase<PSSysAIWorkerAgent, PSSysAIWorkerAgentFilter> implements IPSSysAIWorkerAgentService{
    private static final Log log = LogFactory.getLog(PSSysAIWorkerAgentRTService.class);

    @Override
    public PSSysAIWorkerAgent createDomain(){
        return new PSSysAIWorkerAgent();
    }

    @Override
    public PSSysAIWorkerAgentFilter createFilter(){
        return new PSSysAIWorkerAgentFilter();
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSAIWORKERAGENT";
        }
        else{
            return "PSSYSAIWORKERAGENTS";
        }
	}
}
