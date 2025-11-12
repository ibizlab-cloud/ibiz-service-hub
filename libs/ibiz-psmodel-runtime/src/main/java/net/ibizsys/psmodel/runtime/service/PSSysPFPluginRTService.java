package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.res.IPSSysPFPlugin;
import net.ibizsys.psmodel.core.domain.PSSysPFPlugin;
import net.ibizsys.psmodel.core.filter.PSSysPFPluginFilter;
import net.ibizsys.psmodel.core.service.IPSSysPFPluginService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysPFPluginRTService extends PSModelRTServiceBase<PSSysPFPlugin, PSSysPFPluginFilter> implements IPSSysPFPluginService{
    private static final Log log = LogFactory.getLog(PSSysPFPluginRTService.class);

    @Override
    public PSSysPFPlugin createDomain(){
        return new PSSysPFPlugin();
    }

    @Override
    public PSSysPFPluginFilter createFilter(){
        return new PSSysPFPluginFilter();
	}

	@Override
	public PSSysPFPlugin getDomain(Object params) {
		if(params instanceof PSSysPFPlugin) {
			return (PSSysPFPlugin)params;
		}
		return getMapper().convertValue(params, PSSysPFPlugin.class);
	}

	@Override
	public PSSysPFPluginFilter getFilter(Object params) {
		if(params instanceof PSSysPFPluginFilter) {
			return (PSSysPFPluginFilter)params;
		}
		return getMapper().convertValue(params, PSSysPFPluginFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSPFPLUGIN";
        }
        else{
            return "PSSYSPFPLUGINS";
        }
		
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysPFPlugin.class;
    }
    
    @Override
    protected List<? extends IPSSysPFPlugin> getPSModelObjectList(PSSysPFPluginFilter f) throws Exception {
    	//列出全部应用包含的插件
    	return null;
    }
    
    
//    @Override
//    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
//    	return IPSSysPFPlugin.class;
//    }
//    
//    @Override
//    protected List<? extends IPSSysPFPlugin> getPSModelObjectList(PSSysPFPluginFilter f) throws Exception {
//    	return this.getPSSystemService().getPSSystem().getAllPSSysPFPlugins();
//    }
//    
//    @Override
//    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
//    	return getPSModelObject(IPSSysPFPlugin.class, this.getPSSystemService().getPSSystem().getAllPSSysPFPlugins(), (String)key, tryMode);
//    }
}
