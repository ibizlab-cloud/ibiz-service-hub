package net.ibizsys.central.cloud.oss.core.addin;

import java.io.File;

public abstract class OSSTextProviderBase extends CloudOSSUtilRTAddinBase implements IOSSTextProvider {

	@Override
	public String getText(File file) throws Throwable{
		return this.onGetText(file);
	}
	
	protected String onGetText(File file) throws Throwable {
		throw new Exception("没有实现");
	}

}
