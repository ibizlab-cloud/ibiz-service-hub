package net.ibizsys.central.sysutil;

import net.ibizsys.runtime.util.domain.File;

/**
 * 对象存储服务适配器对象接口
 * @author lionlau
 *
 */
public interface IObjectStorageServiceAdapter {

	
	
	/**
	 * 上传文件
	 * @param file
	 * @param strCat 分类
	 * @param objFile
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	File saveFile(File file, String strCat, Object objFile, Object objTag);
	
	
	
	/**
	 * 下载文件
	 * @param strId
	 * @param strCat 分类
	 * @param objFile
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	File getFile(String strId, String strCat, Object objFile, Object objTag);
	
	
	

}
