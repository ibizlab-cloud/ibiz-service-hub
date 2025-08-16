package net.ibizsys.runtime.dataentity.util;

import net.ibizsys.runtime.util.domain.File;

/**
 * 实体文件功能运行时对象
 * @author lionlau
 *
 */
public interface IDEFileUtilRuntime extends IDEUtilRuntime{

	/**
	 * 文件分类：临时文件
	 */
	public final static String FILECAT_TEMP = "temp"; 
	
	/**
	 * 建立临时文件
	 * @param strSuffix 文件后缀
	 * @return
	 */
	File createTempFile(String strSuffix);

	/**
	 * 建立Url文件
	 * @param strUrl 远程路径
	 * @return
	 */
	File createUrlFile(String strUrl);
	
	
	/**
	 * 建立对象存储文件
	 * @param 本地文件对象
	 * @return
	 */
	File createOSSFile(java.io.File file) ;
	
	
	/**
	 * 建立对象存储文件
	 * @param 本地文件对象
	 * @param strCat 分类
	 * @return
	 */
	File createOSSFile(java.io.File file, String strCat) ;
	
	
	/**
	 * 获取草稿远程文件
	 * @return
	 * @throws Throwable
	 */
	File getDraft();
	
	
	/**
	 * 从源文件建立远程文件
	 * @param srcFile
	 * @return
	 * @throws Throwable
	 */
	File createFrom(File srcFile);
	
	/**
	 * 拷贝文件
	 * @param srcFile
	 * @param dstFile
	 * @throws Throwable
	 */
	void copy(File srcFile, File dstFile);
	
	
	/**
	 * 建立文件对象
	 * @param file
	 * @return
	 * @throws Throwable
	 */
	void create(File file);
	
	
	
//	/**
//	 * 更新文件对象
//	 * @param file
//	 * @param bAppendMode 附加模式
//	 * @return
//	 * @throws Throwable
//	 */
//	void update(File file, boolean bAppendMode)throws Throwable;
	
	
	/**
	 * 获取文件对象
	 * @param strKey
	 * @param bTryMode
	 * @return
	 * @throws Throwable
	 */
	File get(String strKey, boolean bTryMode);
	
	
	
	/**
	 * 获取文件对象
	 * @param strKey
	 * @param bTryMode
	 * @return
	 * @throws Throwable
	 */
	File getOSSFile(String strKey, String strCat, boolean bTryMode);
	
	
	
	/**
	 * 删除数据
	 * @param strKey
	 * @throws Throwable
	 */
	void remove(String strKey);
	
	
	
	/**
	 * 获取文件输入流
	 * @param keyOrFile
	 * 
	 * @return
	 * @throws Throwable
	 */
	java.io.InputStream getInputStream(Object keyOrFile);
	
	
	
	
	/**
	 * 获取文件输出流
	 * @param keyOrFile
	 * @param bAppendMode 附加模式
	 * @return
	 * @throws Throwable
	 */
	java.io.OutputStream getOutputStream(Object keyOrFile, boolean bAppendMode);
	
}
