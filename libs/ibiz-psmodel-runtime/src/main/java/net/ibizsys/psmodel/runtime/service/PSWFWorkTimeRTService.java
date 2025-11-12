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
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.wf.IPSWFWorkTime;
import net.ibizsys.model.wf.IPSWorkflow;
import net.ibizsys.psmodel.core.domain.PSWFWorkTime;
import net.ibizsys.psmodel.core.service.IPSWFWorkTimeService;
import net.ibizsys.psmodel.core.filter.PSWFWorkTimeFilter;
import net.ibizsys.psmodel.core.filter.PSWorkflowFilter;


public class PSWFWorkTimeRTService extends PSModelRTServiceBase<PSWFWorkTime, PSWFWorkTimeFilter> implements IPSWFWorkTimeService{
    private static final Log log = LogFactory.getLog(PSWFWorkTimeRTService.class);

    @Override
    public PSWFWorkTime createDomain(){
        return new PSWFWorkTime();
    }

    @Override
    public PSWFWorkTimeFilter createFilter(){
        return new PSWFWorkTimeFilter();
	}

	@Override
	public PSWFWorkTime getDomain(Object params) {
		if(params instanceof PSWFWorkTime) {
			return (PSWFWorkTime)params;
		}
		return getMapper().convertValue(params, PSWFWorkTime.class);
	}

	@Override
	public PSWFWorkTimeFilter getFilter(Object params) {
		if(params instanceof PSWFWorkTimeFilter) {
			return (PSWFWorkTimeFilter)params;
		}
		return getMapper().convertValue(params, PSWFWorkTimeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSWFWORKTIME";
        }
        else{
            return "PSWFWORKTIMES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSWFWorkTime.class;
    }
    
    @Override
    protected List<? extends IPSWFWorkTime> getPSModelObjectList(PSWFWorkTimeFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSWFWorkTimes();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSWFWorkTime.class, this.getPSSystemService().getPSSystem().getAllPSWFWorkTimes(), (String)key, tryMode);
    }
    
}
