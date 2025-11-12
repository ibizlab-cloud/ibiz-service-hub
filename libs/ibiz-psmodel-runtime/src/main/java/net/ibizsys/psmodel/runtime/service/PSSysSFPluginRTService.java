package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.res.IPSSysSFPlugin;
import net.ibizsys.psmodel.core.domain.PSSysSFPlugin;
import net.ibizsys.psmodel.core.filter.PSSysSFPluginFilter;
import net.ibizsys.psmodel.core.service.IPSSysSFPluginService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysSFPluginRTService extends PSModelRTServiceBase<PSSysSFPlugin, PSSysSFPluginFilter> implements IPSSysSFPluginService{
    private static final Log log = LogFactory.getLog(PSSysSFPluginRTService.class);

    @Override
    public PSSysSFPlugin createDomain(){
        return new PSSysSFPlugin();
    }

    @Override
    public PSSysSFPluginFilter createFilter(){
        return new PSSysSFPluginFilter();
	}

	@Override
	public PSSysSFPlugin getDomain(Object params) {
		if(params instanceof PSSysSFPlugin) {
			return (PSSysSFPlugin)params;
		}
		return getMapper().convertValue(params, PSSysSFPlugin.class);
	}

	@Override
	public PSSysSFPluginFilter getFilter(Object params) {
		if(params instanceof PSSysSFPluginFilter) {
			return (PSSysSFPluginFilter)params;
		}
		return getMapper().convertValue(params, PSSysSFPluginFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSSFPLUGIN";
        }
        else{
            return "PSSYSSFPLUGINS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysSFPlugin.class;
    }
    
    @Override
    protected List<? extends IPSSysSFPlugin> getPSModelObjectList(PSSysSFPluginFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysSFPlugins();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysSFPlugin.class, this.getPSSystemService().getPSSystem().getAllPSSysSFPlugins(), (String)key, tryMode);
    }
}
