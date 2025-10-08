package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.dataentity.service.IDEServiceAPIRuntime;
import net.ibizsys.central.service.ISysServiceAPIRuntime;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPI;

public class DefaultMcpServerToolProvider extends DEMcpServerToolProviderBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DefaultMcpServerToolProvider.class);
	
	private List<IDEServiceAPIRuntime> deServiceAPIRuntimeList = null;
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}
	
	
	
	@Override
	protected List<IDEServiceAPIRuntime> getDEServiceAPIRuntimes() {
		if(this.deServiceAPIRuntimeList == null) {
			Map<String, IDEServiceAPIRuntime> map = new LinkedHashMap<String, IDEServiceAPIRuntime>();
			ISysServiceAPIRuntime iSysServiceAPIRuntime = getSysServiceAPIRuntime();
			if(iSysServiceAPIRuntime != null) {
				List<IPSDEServiceAPI> psDEServiceAPIList = iSysServiceAPIRuntime.getPSSysServiceAPI().getPSDEServiceAPIs();
				if(!ObjectUtils.isEmpty(psDEServiceAPIList)) {
					for(IPSDEServiceAPI iPSDEServiceAPI : psDEServiceAPIList) {
						if(!iPSDEServiceAPI.isMajor()) {
							continue;
						}
						
						IDEServiceAPIRuntime iDEServiceAPIRuntime = iSysServiceAPIRuntime.getDEServiceAPIRuntime(iPSDEServiceAPI.getName(), true);
						if(iDEServiceAPIRuntime == null) {
							continue;
						}
						
						map.put(iDEServiceAPIRuntime.getDataEntityRuntime().getId(), iDEServiceAPIRuntime);
					}
				}
			}
			this.deServiceAPIRuntimeList = Collections.unmodifiableList(new ArrayList<IDEServiceAPIRuntime>(map.values()));
		}
		return this.deServiceAPIRuntimeList;
	}

	
	/**
	 * 获取绑定的服务接口
	 * @return
	 */
	protected ISysServiceAPIRuntime getSysServiceAPIRuntime() {
		ISysServiceAPIRuntime iSysServiceAPIRuntime = this.getSystemRuntime().getSysServiceAPIRuntime("_" + this.getContext().getSysMcpServerUtilRuntime().getPSModelObject().getCodeName(), true);
		if(iSysServiceAPIRuntime!=null) {
			return iSysServiceAPIRuntime;
		}
		return this.getSystemRuntime().getSysServiceAPIRuntime("_mcp", true);
	}

	@Override
	public boolean isEnabled() {
		return getSysServiceAPIRuntime() != null;
	}
}
