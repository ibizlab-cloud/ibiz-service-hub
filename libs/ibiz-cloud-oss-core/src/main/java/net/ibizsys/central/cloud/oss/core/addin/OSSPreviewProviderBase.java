package net.ibizsys.central.cloud.oss.core.addin;

import java.io.File;

import net.ibizsys.central.cloud.oss.core.util.domain.FileItem;

public abstract class OSSPreviewProviderBase extends CloudOSSUtilRTAddinBase implements IOSSPreviewProvider {

	@Override
	public void fillPreviewInfo(FileItem FileItem, File file) throws Throwable{
		this.onFillPreviewInfo(FileItem, file);
	}
	
	protected void onFillPreviewInfo(FileItem FileItem, File file) throws Throwable {
		throw new Exception("没有实现");
	}

}
