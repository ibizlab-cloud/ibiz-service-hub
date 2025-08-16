package net.ibizsys.central.plugin.extension.dataentity;

import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.cloud.core.dataentity.DataEntityRuntime;
import net.ibizsys.model.dataentity.IPSDataEntity;

public abstract class ExtensionDataEntityRuntimeBase extends DataEntityRuntime implements IExtensionDataEntityRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ExtensionDataEntityRuntimeBase.class);
	private String strExtensionTag = null;
	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSDataEntity iPSDataEntity, Object data) throws Exception {
		strExtensionTag = iPSDataEntity.getDETag();
		if(!StringUtils.hasLength(strExtensionTag)) {
			strExtensionTag = iPSDataEntity.getName();
		}
		super.init(iSystemRuntimeContext, iPSDataEntity, data);
	}
	
	@Override
	public String getExtensionTag() {
		return this.strExtensionTag;
	}
}
