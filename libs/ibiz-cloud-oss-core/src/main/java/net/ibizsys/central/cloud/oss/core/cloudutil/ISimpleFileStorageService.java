package net.ibizsys.central.cloud.oss.core.cloudutil;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.JsonNode;

import net.ibizsys.central.cloud.core.util.domain.DownloadTicket;
import net.ibizsys.central.cloud.oss.core.util.domain.DownloadTextMode;
import net.ibizsys.central.cloud.oss.core.util.domain.DownloadTicketMode;
import net.ibizsys.central.cloud.oss.core.util.domain.FileItem;

/**
 * 简单文件存储适配器接口
 * 
 * @author lionlau
 *
 */
public interface ISimpleFileStorageService {

	/**
	 * 默认分类
	 */
	public final static String CAT_DEFAULT = "default";
	
	/**
	 * 文件分类：临时文件
	 */
	public final static String CAT_TEMP = "temp"; 
	
	
	/**
	 * 打包模式，默认（带文件目录）
	 */
	public final static String PACKMODE_DEFAULT = "default";
	
	
	/**
	 * 打包模式，平铺
	 */
	public final static String PACKMODE_FLAT = "flat";
	
	
	/**
	 * 上传参数：返回预览信息
	 */
	public final static String UPLOADPARAM_PREVIEW = "preview";
	
	
	/**
	 * 上传参数：解压
	 */
	public final static String UPLOADPARAM_UNZIP = "unzip";
	
	
	/**
	 * 保存远程上传的文件内容
	 * 
	 * @param strCat 分类
	 * @param multipartFile
	 * @return
	 */
	@Deprecated
	FileItem saveFile(String strCat, MultipartFile multipartFile);

	/**
	 * 获取指定标识文件对象
	 *  @param strCat 分类
	 * @param strFileId
	 *
	 * @return
	 */
	File getFile(String strCat, String strFileId);
	
	
	
	/**
	 * 获取指定标识列表的压缩文件对象
	 * @param strCat 分类
	 * @param list
	 * @return
	 */
	File getFile(String strCat, List<JsonNode> list);
	
	
	/**
	 * 获取指定标识列表的压缩文件对象
	 * @param strCat 分类
	 * @param list
	 * @param strPackMode 打包模式
	 * @return
	 */
	File getFile(String strCat, List<JsonNode> list, String strPackMode);
	
	
	
	
	/**
	 * 下载文件
	 * @param strCat
	 * @param strFileid
	 * @param response
	 */
	void downloadFile(String strCat, String strFileId, HttpServletResponse response);
	
	
	
	/**
	 * 下载文件（提取文件中文本）
	 * @param strCat
	 * @param strFileid
	 * @param response
	 * @param params
	 */
	void downloadText(String strCat, String strFileId, HttpServletResponse response, Map<String, Object> params);
	
	
	/**
	 * 下载PDF文件（将文件转化为PDF）
	 * @param strCat
	 * @param strFileid
	 * @param response
	 * @param params
	 */
	void downloadPdf(String strCat, String strFileId, HttpServletResponse response, Map<String, Object> params);
	
	
	/**
	 * 保存远程上传的文件内容
	 * 
	 * @param multipartFile
	 * @param strCat 分类
	 * @return
	 */
	FileItem uploadFile(String strCat, MultipartFile multipartFile);

	
	/**
	 * 保存远程上传的文件内容并返回预览信息
	 * 
	 * @param multipartFile
	 * @param strCat 分类
	 * @param bPreview
	 * @return
	 */
	FileItem uploadFile(String strCat, MultipartFile multipartFile, boolean bPreview);
	
	/**
	 * 保存远程上传的文件内容
	 * 
	 * @param multipartFile
	 * @param strCat 分类
	 * @param params
	 * @return
	 */
	List<FileItem> uploadFile(String strCat, MultipartFile multipartFile, Map<String, Object> params);
	
	
	
	
	/**
	 * 建立下载文件访问键
	 * @param strCat
	 * @param strFileId
	 * @param nSeconds
	 * @return
	 */
	DownloadTicket createDownloadTicket(String strCat, String strFileId, int nSeconds);
	
	
	/**
	 * 通过文件访问键下载文件
	 * @param strCat
	 * @param strDownloadKey
	 * @param response
	 * @param bTryOrigin 尝试文件标识
	 */
	void downloadFileByTicket(String strCat, String strDownloadTicket, HttpServletResponse response, boolean bTryFileId);
	
	
	/**
	 * 通过文件访问键下载文件（提取文件中文本）
	 * @param strCat
	 * @param strDownloadKey
	 * @param response
	 * @param params 
	 * @param bTryOrigin 尝试文件标识
	 */
	void downloadTextByTicket(String strCat, String strDownloadTicket, HttpServletResponse response, Map<String, Object> params, boolean bTryFileId);
	
	
		
	
	/**
	 * 通过文件访问键下载PDF文件（将文件转化为PDF）
	 * @param strCat
	 * @param strDownloadKey
	 * @param response
	 * @param params 
	 * @param bTryOrigin 尝试文件标识
	 */
	void downloadPdfByTicket(String strCat, String strDownloadTicket, HttpServletResponse response, Map<String, Object> params, boolean bTryFileId);
	
	
	
	/**
	 * 获取下载凭证模式
	 * @return
	 */
	DownloadTicketMode getDownloadTicketMode();
	
	
	/**
	 * 是否包含下载凭证目录
	 * @param strFolder
	 * @return
	 */
	boolean containsDownloadTicketFolder(String strFolder);
	
	
	/**
	 * 获取下载凭证控制目录集合
	 * @return
	 */
	Set<String> getDownloadTicketFolders();
	
	
	
	/**
	 * 直接上传文件
	 * @param strCat
	 * @param srcFile
	 * @return
	 */
	FileItem uploadFile(String strCat, File srcFile);
	
	
	
	/**
	 * 获取指定文件的文本信息
	 * @param strCat
	 * @param strFileid
	 * @param params
	 */
	String getText(String strCat, String strFileId, Map<String, Object> params);
	
	
	
	/**
	 * 获取下载文本模式
	 * @return
	 */
	DownloadTextMode getDownloadTextMode();
	
	
	/**
	 * 是否包含下载文本文件后缀
	 * @param strExt
	 * @return
	 */
	boolean containsDownloadTextExt(String strExt);
	
	
	/**
	 * 获取下载文本控制后缀集合
	 * @return
	 */
	Set<String> getDownloadTextExts();
}
