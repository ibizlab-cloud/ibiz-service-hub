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
import net.ibizsys.psmodel.core.domain.PSSysAIPipelineWorker;
import net.ibizsys.psmodel.core.service.IPSSysAIPipelineWorkerService;
import net.ibizsys.psmodel.core.filter.PSSysAIPipelineWorkerFilter;


public class PSSysAIPipelineWorkerRTService extends PSModelRTServiceBase<PSSysAIPipelineWorker, PSSysAIPipelineWorkerFilter> implements IPSSysAIPipelineWorkerService{
    private static final Log log = LogFactory.getLog(PSSysAIPipelineWorkerRTService.class);

    @Override
    public PSSysAIPipelineWorker createDomain(){
        return new PSSysAIPipelineWorker();
    }

    @Override
    public PSSysAIPipelineWorkerFilter createFilter(){
        return new PSSysAIPipelineWorkerFilter();
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSAIPIPELINEWORKER";
        }
        else{
            return "PSSYSAIPIPELINEWORKERS";
        }
	}
}
