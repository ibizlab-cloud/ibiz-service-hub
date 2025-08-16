package net.ibizsys.psmodel.runtime.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.psmodel.core.domain.PSCorePrdFunc;
import net.ibizsys.psmodel.core.filter.PSCorePrdFuncFilter;
import net.ibizsys.psmodel.core.service.IPSCorePrdFuncService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSCorePrdFuncRTService extends PSModelRTServiceBase<PSCorePrdFunc, PSCorePrdFuncFilter> implements IPSCorePrdFuncService{
    private static final Log log = LogFactory.getLog(PSCorePrdFuncRTService.class);

    /**
   	 * 行为：安装
   	 */
   	final public static String METHOD_INSTALL = "INSTALL";

   	/**
   	 * 行为：卸载
   	 */
   	final public static String METHOD_UNINSTALL = "UNINSTALL";
   	
   	
    @Override
    public PSCorePrdFunc createDomain(){
        return new PSCorePrdFunc();
    }

    @Override
    public PSCorePrdFuncFilter createFilter(){
        return new PSCorePrdFuncFilter();
	}

	@Override
	public PSCorePrdFunc getDomain(Object params) {
		if(params instanceof PSCorePrdFunc) {
			return (PSCorePrdFunc)params;
		}
		return getMapper().convertValue(params, PSCorePrdFunc.class);
	}

	@Override
	public PSCorePrdFuncFilter getFilter(Object params) {
		if(params instanceof PSCorePrdFuncFilter) {
			return (PSCorePrdFuncFilter)params;
		}
		return getMapper().convertValue(params, PSCorePrdFuncFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSCOREPRDFUNC";
        }
        else{
            return "PSCOREPRDFUNCS";
        }
	}
    
    @Override
	protected Object doInvoke(String methodName, String key, Object params) throws Exception {
		if(METHOD_INSTALL.equalsIgnoreCase(methodName)) {
			PSCorePrdFunc domain = this.getDomain(params);
			return this.install(domain);
		}
		
		if(METHOD_UNINSTALL.equalsIgnoreCase(methodName)) {
			PSCorePrdFunc domain = this.getDomain(params);
			return this.uninstall(domain);
		}
		
		return super.doInvoke(methodName, key, params);
	}
	
	public Object install(PSCorePrdFunc m) throws Exception {
		return this.doInstall(m);
	}

	protected Object doInstall(PSCorePrdFunc m) throws Exception {
		throw new Exception("没有实现");
	}
	
	public Object uninstall(PSCorePrdFunc m) throws Exception {
		return this.doUninstall(m);
	}

	protected Object doUninstall(PSCorePrdFunc m) throws Exception {
		throw new Exception("没有实现");
	}
}
