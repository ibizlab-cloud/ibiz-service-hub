package net.ibizsys.central.cloud.oss.core.addin;

import java.io.File;
import java.util.Map;

public interface IOSSPdfProvider extends ICloudOSSUtilRTAddin{

	/**
	 * 获取传入文件的PDF文件
	 * @param cat
	 * @param fileId
	 * @param file
	 * @param params
	 * @return
	 * @throws Throwable
	 */
	File getPdfFile(String cat, String fileId, File file, Map<String, Object> params) throws Throwable;
	
}
