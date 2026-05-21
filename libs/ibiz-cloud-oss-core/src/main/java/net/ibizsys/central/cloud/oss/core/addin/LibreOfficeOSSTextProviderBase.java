package net.ibizsys.central.cloud.oss.core.addin;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.runtime.util.DataTypeUtils;

public abstract class LibreOfficeOSSTextProviderBase extends PandocOSSTextProviderBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(LibreOfficeOSSTextProviderBase.class);

	private Map<String, Object> libreOfficeParams = new ConcurrentHashMap<String, Object>();
	private String strLibreOfficePath = null;
	
	
	@Override
	protected void onInit() throws Exception {
		this.getContext().getSettings("libreoffice", this.libreOfficeParams);
		this.strLibreOfficePath = DataTypeUtils.asString(this.libreOfficeParams.get("path"));
		super.onInit();
	}

	protected String getLibreOfficeCommandPath() {
		return strLibreOfficePath;
	}
	
	@Override
	protected void onReloadSetting() throws Throwable {
		this.libreOfficeParams.clear();
		this.getContext().getSettings("libreoffice", this.libreOfficeParams);
		this.strLibreOfficePath = DataTypeUtils.asString(this.libreOfficeParams.get("path"));
		super.onReloadSetting();
	}
	
	@Override
	public boolean isEnabled() {
		return StringUtils.hasLength(getLibreOfficeCommandPath()) || super.isEnabled();
	}
	
}
