package net.ibizsys.central.cloud.oss.core.addin;

import java.io.File;

public interface IOSSTextProvider extends ICloudOSSUtilRTAddin{

	/**
	 * 获取传入文件的文本
	 * @param file
	 */
	String getText(File file) throws Throwable;
}
