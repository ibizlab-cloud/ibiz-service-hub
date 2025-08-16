package net.ibizsys.psmodel.runtime.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.psmodel.core.domain.PSCorePrd;
import net.ibizsys.psmodel.core.filter.PSCorePrdFilter;
import net.ibizsys.psmodel.core.service.IPSCorePrdService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSCorePrdRTService extends PSModelRTServiceBase<PSCorePrd, PSCorePrdFilter> implements IPSCorePrdService{
    private static final Log log = LogFactory.getLog(PSCorePrdRTService.class);

    //当前分类（子分类）
    final public static String DATASET_CURCATDESCENDANT = "CURCATDESCENDANT";

    /**
	 * 行为：安装
	 */
	final public static String METHOD_INSTALL = "INSTALL";

	/**
	 * 行为：卸载
	 */
	final public static String METHOD_UNINSTALL = "UNINSTALL";
	

	
    
    @Override
    public PSCorePrd createDomain(){
        return new PSCorePrd();
    }

    @Override
    public PSCorePrdFilter createFilter(){
        return new PSCorePrdFilter();
	}

	@Override
	public PSCorePrd getDomain(Object params) {
		if(params instanceof PSCorePrd) {
			return (PSCorePrd)params;
		}
		return getMapper().convertValue(params, PSCorePrd.class);
	}

	@Override
	public PSCorePrdFilter getFilter(Object params) {
		if(params instanceof PSCorePrdFilter) {
			return (PSCorePrdFilter)params;
		}
		return getMapper().convertValue(params, PSCorePrdFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSCOREPRD";
        }
        else{
            return "PSCOREPRDS";
        }
	}
    
 
    

	@Override
	protected Object doInvoke(String methodName, String key, Object params) throws Exception {
		if(METHOD_INSTALL.equalsIgnoreCase(methodName)) {
			PSCorePrd domain = this.getDomain(params);
			if(StringUtils.hasLength(key)) {
				domain.setId(key);
			}
			return this.install(domain);
		}
		
		if(METHOD_UNINSTALL.equalsIgnoreCase(methodName)) {
			PSCorePrd domain = this.getDomain(params);
			if(StringUtils.hasLength(key)) {
				domain.setId(key);
			}
			return this.uninstall(domain);
		}
		
		return super.doInvoke(methodName, key, params);
	}
	
	public Object install(PSCorePrd m) throws Exception {
		return this.doInstall(m);
	}

	protected Object doInstall(PSCorePrd m) throws Exception {
		throw new Exception("没有实现");
	}
	
	public Object uninstall(PSCorePrd m) throws Exception {
		return this.doUninstall(m);
	}

	protected Object doUninstall(PSCorePrd m) throws Exception {
		throw new Exception("没有实现");
	}
}
