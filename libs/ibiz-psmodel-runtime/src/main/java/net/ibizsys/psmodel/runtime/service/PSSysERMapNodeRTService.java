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
import net.ibizsys.psmodel.core.domain.PSSysERMapNode;


public class PSSysERMapNodeRTService extends PSModelRTServiceBase<PSSysERMapNode, PSModelFilter>{
    private static final Log log = LogFactory.getLog(PSSysERMapNodeRTService.class);

    @Override
    public PSSysERMapNode createDomain(){
        return new PSSysERMapNode();
    }

    @Override
    public PSModelFilter createFilter(){
        return new PSModelFilter();
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSERMAPNODE";
        }
        else{
            return "PSSYSERMAPNODES";
        }
	}
}
