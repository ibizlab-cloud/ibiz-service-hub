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
import net.ibizsys.psmodel.core.domain.PSSysDELogicNode;
import net.ibizsys.psmodel.core.service.IPSSysDELogicNodeService;
import net.ibizsys.psmodel.core.filter.PSSysDELogicNodeFilter;


public class PSSysDELogicNodeRTService extends PSModelRTServiceBase<PSSysDELogicNode, PSSysDELogicNodeFilter> implements IPSSysDELogicNodeService{
    private static final Log log = LogFactory.getLog(PSSysDELogicNodeRTService.class);

    @Override
    public PSSysDELogicNode createDomain(){
        return new PSSysDELogicNode();
    }

    @Override
    public PSSysDELogicNodeFilter createFilter(){
        return new PSSysDELogicNodeFilter();
	}

	@Override
	public PSSysDELogicNode getDomain(Object params) {
		if(params instanceof PSSysDELogicNode) {
			return (PSSysDELogicNode)params;
		}
		return getMapper().convertValue(params, PSSysDELogicNode.class);
	}

	@Override
	public PSSysDELogicNodeFilter getFilter(Object params) {
		if(params instanceof PSSysDELogicNodeFilter) {
			return (PSSysDELogicNodeFilter)params;
		}
		return getMapper().convertValue(params, PSSysDELogicNodeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSDELOGICNODE";
        }
        else{
            return "PSSYSDELOGICNODES";
        }
	}
}
