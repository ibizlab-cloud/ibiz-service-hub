package net.ibizsys.central.cloud.oss.core.cloudutil;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

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
	 * 建立下载文件访问键
	 * @param strCat
	 * @param strFileId
	 * @param nSeconds
	 * @return
	 */
	ObjectNode createDownloadTicket(String strCat, String strFileId, int nSeconds);
	
	
	/**
	 * 通过文件访问键下载文件
	 * @param strDownloadKey
	 * @param response
	 */
	void downloadFileByTicket(String strDownloadTicket, HttpServletResponse response);
}
