package net.ibizsys.central.cloud.oss.core.addin;

import java.io.File;

import net.ibizsys.central.cloud.oss.core.util.domain.FileItem;

public interface IOSSPreviewProvider extends ICloudOSSUtilRTAddin{

	/**
	 * 填充预览信息
	 * @param FileItem
	 * @param file
	 */
	void fillPreviewInfo(FileItem FileItem, File file) throws Throwable;
}
