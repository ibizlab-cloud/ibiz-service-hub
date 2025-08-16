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
import net.ibizsys.psmodel.core.domain.PSSysAIPipelineJob;
import net.ibizsys.psmodel.core.service.IPSSysAIPipelineJobService;
import net.ibizsys.psmodel.core.filter.PSSysAIPipelineJobFilter;


public class PSSysAIPipelineJobRTService extends PSModelRTServiceBase<PSSysAIPipelineJob, PSSysAIPipelineJobFilter> implements IPSSysAIPipelineJobService{
    private static final Log log = LogFactory.getLog(PSSysAIPipelineJobRTService.class);

    @Override
    public PSSysAIPipelineJob createDomain(){
        return new PSSysAIPipelineJob();
    }

    @Override
    public PSSysAIPipelineJobFilter createFilter(){
        return new PSSysAIPipelineJobFilter();
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSAIPIPELINEJOB";
        }
        else{
            return "PSSYSAIPIPELINEJOBS";
        }
	}
}
