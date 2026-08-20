package net.ibizsys.runtime.util.domain;

/**
 * 文件对象接口
 * @author lionlau
 *
 */
public interface IFile {

	/**
	 * 获取文件标识
	 * @return
	 */
	String getFileId();
	
	/**
	 * 获取文件名称
	 * @return
	 */
	String getFileName();
	
	/**
	 * 获取本地路径
	 * @return
	 */
	String getLocalPath();
}
