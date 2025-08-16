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
import net.ibizsys.psmodel.core.domain.PSAppPFPlugin;
import net.ibizsys.psmodel.core.service.IPSAppPFPluginService;
import net.ibizsys.psmodel.core.filter.PSAppPFPluginFilter;


public class PSAppPFPluginRTService extends PSModelRTServiceBase<PSAppPFPlugin, PSAppPFPluginFilter> implements IPSAppPFPluginService{
    private static final Log log = LogFactory.getLog(PSAppPFPluginRTService.class);

    @Override
    public PSAppPFPlugin createDomain(){
        return new PSAppPFPlugin();
    }

    @Override
    public PSAppPFPluginFilter createFilter(){
        return new PSAppPFPluginFilter();
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPPFPLUGIN";
        }
        else{
            return "PSAPPPFPLUGINS";
        }
	}
}
