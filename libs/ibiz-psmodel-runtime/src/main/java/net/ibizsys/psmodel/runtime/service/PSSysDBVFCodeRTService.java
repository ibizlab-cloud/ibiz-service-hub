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
import net.ibizsys.psmodel.core.domain.PSSysDBVFCode;
import net.ibizsys.psmodel.core.service.IPSSysDBVFCodeService;
import net.ibizsys.psmodel.core.filter.PSSysDBVFCodeFilter;


public class PSSysDBVFCodeRTService extends PSModelRTServiceBase<PSSysDBVFCode, PSSysDBVFCodeFilter> implements IPSSysDBVFCodeService{
    private static final Log log = LogFactory.getLog(PSSysDBVFCodeRTService.class);

    @Override
    public PSSysDBVFCode createDomain(){
        return new PSSysDBVFCode();
    }

    @Override
    public PSSysDBVFCodeFilter createFilter(){
        return new PSSysDBVFCodeFilter();
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSDBVFCODE";
        }
        else{
            return "PSSYSDBVFCODES";
        }
	}
}
