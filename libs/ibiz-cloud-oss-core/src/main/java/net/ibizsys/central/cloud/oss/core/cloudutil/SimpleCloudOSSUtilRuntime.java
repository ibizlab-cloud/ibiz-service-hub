package net.ibizsys.central.cloud.oss.core.cloudutil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipOutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.jsonwebtoken.lang.Assert;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.domain.DownloadTicket;
import net.ibizsys.central.cloud.core.util.error.NotFoundException;
import net.ibizsys.central.cloud.oss.core.addin.IOSSPreviewProvider;
import net.ibizsys.central.cloud.oss.core.addin.IOSSTextProvider;
import net.ibizsys.central.cloud.oss.core.util.domain.DownloadTicketMode;
import net.ibizsys.central.cloud.oss.core.util.domain.FileItem;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.ZipUtils;

public class SimpleCloudOSSUtilRuntime extends CloudOSSUtilRuntimeBase implements ISimpleFileStorageService {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SimpleCloudOSSUtilRuntime.class);
	private String strFileRootFolder = null;
	public final static int DOWNLOADKEY_TIMEOUT = 3600;

	private DownloadTicketMode downloadTicketMode = DownloadTicketMode.DISABLED;
	private Set<String> downloadTicketFolderSet = null;

	@Override
	protected void onInit() throws Exception {
		this.setFileRootFolder(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".filepath", null));
		if (!StringUtils.hasLength(this.getFileRootFolder())) {
			this.setFileRootFolder(this.getSystemRuntimeSetting().getParam(CLOUDOSSUTIL_CONFIGFOLDER + ".filepath", null));
			if (!StringUtils.hasLength(this.getFileRootFolder())) {
				if (!StringUtils.hasLength(this.getSystemRuntime().getFileFolder())) {
					throw new Exception("未定义文件存储路径");
				}
				String strFolder = this.getSystemRuntime().getFileFolder() + File.separator + "ibizutil";
				File folder = new File(strFolder);
				if (!folder.exists() && !folder.mkdirs()) {
					throw new Exception(String.format("文件存储路径[%1$s]无效", strFolder));
				}
				this.setFileRootFolder(strFolder);
			}
		}

		super.onInit();
	}

	@Override
	protected boolean isEnableReloadSetting() {
		return true;
	}

	@Override
	protected void onReloadSetting(boolean bFirst) throws Throwable {
		String strDownloadTicketMode = this.getSystemRuntimeSetting().getParam(CLOUDOSSUTIL_CONFIGFOLDER + ".downloadticket.mode", null);
		String strDownloadTicketFolder = this.getSystemRuntimeSetting().getParam(CLOUDOSSUTIL_CONFIGFOLDER + ".downloadticket.folder", null);

		DownloadTicketMode downloadTicketMode = DownloadTicketMode.DISABLED;
		Set<String> downloadTicketFolderSet = new HashSet<String>();
		if (StringUtils.hasLength(strDownloadTicketMode)) {
			downloadTicketMode = DownloadTicketMode.valueOf(strDownloadTicketMode.toUpperCase());
		} else {
			downloadTicketMode = DownloadTicketMode.DISABLED;
		}

		if (downloadTicketMode != DownloadTicketMode.DISABLED) {
			if (StringUtils.hasLength(strDownloadTicketFolder)) {
				String[] folders = strDownloadTicketFolder.toLowerCase().split("[,]");
				for (String item : folders) {
					downloadTicketFolderSet.add(item);
				}
			}
			if (downloadTicketMode == DownloadTicketMode.EXCLUSION) {
				// 补充临时目录
				downloadTicketFolderSet.add(CAT_TEMP);
			}
		}

		this.downloadTicketMode = downloadTicketMode;
		this.downloadTicketFolderSet = Collections.unmodifiableSet(downloadTicketFolderSet);

		super.onReloadSetting(bFirst);
	}

	@Override
	public DownloadTicketMode getDownloadTicketMode() {
		return this.downloadTicketMode;
	}

	@Override
	public Set<String> getDownloadTicketFolders() {
		return this.downloadTicketFolderSet;
	}

	@Override
	public boolean containsDownloadTicketFolder(String strFolder) {
		Assert.hasLength(strFolder, "传入目录无效");
		return this.downloadTicketFolderSet.contains(strFolder.toLowerCase());
	}

	protected String getFileRootFolder() {
		return this.strFileRootFolder;
	}

	protected void setFileRootFolder(String strFileRootFolder) {
		this.strFileRootFolder = strFileRootFolder;
	}

	@Override
	public FileItem saveFile(String strCat, MultipartFile multipartFile) {
		// 获取文件名
		String fileName = multipartFile.getOriginalFilename();
		// 获取文件后缀
		String fileExt = getFileExt(fileName);
		// 文件后缀过滤
		String fileExtfilter = this.getSystemRuntimeSetting().getParam(CLOUDOSSUTIL_CONFIGFOLDER + ".fileextfilter", null);
		if (StringUtils.hasLength(fileExtfilter)) {
			List<String> fileExtfilterList = Arrays.asList(fileExtfilter.split(","));
			if (!ObjectUtils.isEmpty(fileExtfilterList)) {
				String finalFileExt = fileExt;
				fileExtfilterList.forEach(item -> {
					if (item.equalsIgnoreCase(finalFileExt)) {
						log.error(String.format("%1$s保存上传文件发生异常，文件类型[%2$s]不允许上传", this.getLogicName(), finalFileExt));
						throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("保存上传文件发生异常，文件类型[%1$s]不允许上传", finalFileExt));
					}
				});
			}
		}
		if (StringUtils.hasLength(fileExt)) {
			fileExt = "." + fileExt;
		}
		try {
			// String fileId =
			// DigestUtils.md5DigestAsHex(multipartFile.getInputStream());
			String fileId = KeyValueUtils.genUniqueId();
			String fileFullPath = null;
			if (ObjectUtils.isEmpty(strCat) || strCat.equalsIgnoreCase(CAT_DEFAULT)) {
				fileFullPath = getFileRootFolder() + File.separator + fileId + File.separator + fileName;
			} else {
				strCat = strCat.toLowerCase();
				fileFullPath = getFileRootFolder() + File.separator + strCat + File.separator + fileId + File.separator + fileName;
			}

			File file = new File(fileFullPath);
			File parent = new File(file.getParent());
			if (!parent.exists()) {
				parent.mkdirs();
			}
			FileUtils.copyInputStreamToFile(multipartFile.getInputStream(), file);

			// FileCopyUtils.copy(multipartFile.getInputStream(),
			// Files.newOutputStream(file.toPath()));
			FileItem item = new FileItem();
			item.setFileId(fileId);
			item.setFileName(fileName);
			item.setFileSize(multipartFile.getSize());
			item.setFileExt(fileExt);
			item.setFolder(strCat);

			try {
				this.getCloudSaaSUtilRuntime(false).saveOSSFile(item);
			} catch (Exception ex) {
				log.error(String.format("保存OSS文件项发生异常，%1$s", ex.getMessage()), ex);
			}

			// 判断指定文件夹是否需要建立临时凭证
			if (this.getDownloadTicketMode() != DownloadTicketMode.DISABLED && !ObjectUtils.isEmpty(strCat)) {
				switch (this.getDownloadTicketMode()) {
				case INCLUSION:
					if (this.containsDownloadTicketFolder(strCat)) {
						DownloadTicket downloadTicket = this.createDownloadTicket(file, strCat, fileId, -1);
						item.setTicket(downloadTicket);
					}
					break;
				case EXCLUSION:
					if (!this.containsDownloadTicketFolder(strCat)) {
						DownloadTicket downloadTicket = this.createDownloadTicket(file, strCat, fileId, -1);
						item.setTicket(downloadTicket);
					}
					break;
				default:
					break;
				}
			}

			return item;
		} catch (Throwable ex) {
			log.error(String.format("%1$s保存上传文件发生异常，%2$s", this.getLogicName(), ex.getMessage()), ex);
			throw dealException(String.format("保存上传文件发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public File getFile(String strCat, String strFileId) {
		String dirpath = null;
		if (ObjectUtils.isEmpty(strCat) || strCat.equalsIgnoreCase(CAT_DEFAULT)) {
			dirpath = getFileRootFolder() + File.separator + strFileId;
		} else {
			strCat = strCat.toLowerCase();
			dirpath = getFileRootFolder() + File.separator + strCat + File.separator + strFileId;
		}
		// String dirpath = getFileRootFolder() + File.separator + strFileId;
		File parent = new File(dirpath);
		if (parent.exists() && parent.isDirectory() && parent.listFiles().length > 0) {
			if (parent.listFiles()[0].isDirectory()) {
				throw new NotFoundException(String.format("文件[%1$s]未找到", strFileId));
			}

			return parent.listFiles()[0];
		}
		throw new NotFoundException(String.format("文件[%1$s]未找到", strFileId));
	}

	@Override
	public File getFile(String strCat, List<JsonNode> list) {
		return getFile(strCat, list, PACKMODE_DEFAULT);
	}

	@Override
	public File getFile(String strCat, List<JsonNode> list, String strPackMode) {

		if (ObjectUtils.isEmpty(list)) {
			throw new NotFoundException("未传入文件清单");
		}

		List<File> fileList = new ArrayList<File>();
		for (JsonNode item : list) {

			if (item instanceof ObjectNode) {
				ObjectNode map = (ObjectNode) item;
				item = map.get("id");
			}
			fileList.add(this.getFile(strCat, item.asText()));
		}

		Map<Integer, String> fileZipEntryMap = null;
		// 重新计算打包文件名
		if (PACKMODE_FLAT.equals(strPackMode)) {
			fileZipEntryMap = new HashMap<Integer, String>();
			Map<String, File> nameFileMap = new HashMap<String, File>();
			for (int i = 0; i < fileList.size(); i++) {
				File file = fileList.get(i);
				String strFullName = file.getName();
				if (!nameFileMap.containsKey(strFullName)) {
					nameFileMap.put(strFullName, file);
					fileZipEntryMap.put(i, strFullName);
				} else {
					String strName = "";
					String strExt = "";
					// 计算名称
					int dot = strFullName.lastIndexOf('.');
					if (dot != -1) {
						strName = strFullName.substring(0, dot);
						strExt = strFullName.substring(dot);
					} else {
						strName = strFullName;
					}
					int nIndex = 2;
					while (true) {
						String strNewName = String.format("%1$s(%2$s)%3$s", strName, nIndex, strExt);
						if (!nameFileMap.containsKey(strNewName)) {
							nameFileMap.put(strNewName, file);
							fileZipEntryMap.put(i, strNewName);
							break;
						} else {
							nIndex++;
						}
					}
				}
			}

		}

		try {
			File tempFile = File.createTempFile("oss", ".zip");
			try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(tempFile))) {
				for (int i = 0; i < fileList.size(); i++) {
					File file = fileList.get(i);
					if (PACKMODE_FLAT.equals(strPackMode)) {
						String strEntry = fileZipEntryMap.get(i);
						long nTime = System.currentTimeMillis();
						ZipUtils.zipFile(file, zipOutputStream, strEntry);
						log.debug(String.format("压缩文件[%1$s]耗时[%2$s]ms", file.getAbsolutePath(), System.currentTimeMillis() - nTime));
					} else if (PACKMODE_DEFAULT.equals(strPackMode)) {
						if (file.getParentFile() == null || file.getParentFile().getParentFile() == null) {
							throw new Exception("文件路径不正确");
						}
						int nFolderLength = file.getParentFile().getParentFile().getAbsolutePath().length() + 1;
						long nTime = System.currentTimeMillis();
						ZipUtils.zip(file, zipOutputStream, nFolderLength);
						log.debug(String.format("压缩文件[%1$s]耗时[%2$s]ms", file.getAbsolutePath(), System.currentTimeMillis() - nTime));
					} else {
						throw new RuntimeException(String.format("无法识别的文件打包类型[%1$s]", strPackMode));
					}

				}
				zipOutputStream.flush();
				zipOutputStream.close();
			}
			return tempFile;
		} catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("生成压缩文件发生异常，%1$s", ex.getMessage()), ex);
		}

	}

	/**
	 * 获取文件扩展名
	 *
	 * @param filename
	 * @return
	 */
	public static String getFileExt(String filename) {
		if ((filename != null) && (filename.length() > 0)) {
			int dot = filename.lastIndexOf('.');
			if ((dot > -1) && (dot < (filename.length() - 1))) {
				return filename.substring(dot + 1);
			}
		}
		return "";
	}

	@Override
	public void downloadFile(String strCat, String strFileId, HttpServletResponse response) {
		File file = getFile(strCat, strFileId);
		response.setHeader("Content-Disposition", String.format("attachment;filename=\"%1$s\"", getFileName(file.getName())));
		this.sendResponse(response, file);
	}

	@Override
	public void downloadText(String strCat, String strFileId, HttpServletResponse response) {
		File file = getFile(strCat, strFileId);
		String ext = getFileExt(file.getName());
		if (StringUtils.hasLength(ext)) {
			try {
				IOSSTextProvider iOSSTextProvider = this.getOSSTextProvider(ext, true);
				if (iOSSTextProvider != null) {
					response.setHeader("Content-Disposition", String.format("attachment;filename=\"%1$s.txt\"", getFileName(file.getName())));
					String strText = iOSSTextProvider.getText(file);
					if (StringUtils.hasLength(strText)) {
						byte[] bytes = strText.getBytes(StandardCharsets.UTF_8);
						InputStream inputStream = new ByteArrayInputStream(bytes);
						this.sendResponse(response, inputStream);
					}
					return;
				}
			} catch (Throwable ex) {
				throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("生成文本信息发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		response.setHeader("Content-Disposition", String.format("attachment;filename=\"%1$s\"", getFileName(file.getName())));
		this.sendResponse(response, file);
	}

	@Override
	public DownloadTicket createDownloadTicket(String strCat, String strFileId, int nSeconds) {
		File file = getFile(strCat, strFileId);
		return this.createDownloadTicket(file, strCat, strFileId, nSeconds);
	}

	protected DownloadTicket createDownloadTicket(File file, String strCat, String strFileId, int nSeconds) {

		String strDownloadTicket = "t_" + KeyValueUtils.genUniqueId(strCat, strFileId, KeyValueUtils.genGuidEx());
		String strCacheTag = this.getDownloadTicketCacheTag(strDownloadTicket);
		if (nSeconds <= 0) {
			nSeconds = DOWNLOADKEY_TIMEOUT;
		}

		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("cat", strCat);
		map.put("id", strFileId);

		this.getSysCacheUtilRuntime(false).set(strCacheTag, JsonUtils.toString(map), nSeconds);

		DownloadTicket ret = new DownloadTicket();
		ret.setTicket(strDownloadTicket);
		ret.setExpireIn(nSeconds);

		return ret;
	}

	@Override
	public void downloadFileByTicket(String strCat, String strDownloadTicket, HttpServletResponse response, boolean bTryFileId) {
		String strRealCat = null;
		String strFileId = null;
		String strCacheTag = this.getDownloadTicketCacheTag(strDownloadTicket);
		Map<String, String> map = this.getSysCacheUtilRuntime(false).get(strCacheTag, Map.class);
		if (ObjectUtils.isEmpty(map)) {
			if (bTryFileId) {
				strRealCat = strCat;
				strFileId = strDownloadTicket;
			} else {
				throw new NotFoundException(String.format("文件[%1$s]未找到", strDownloadTicket));
			}
		} else {
			strRealCat = DataTypeUtils.asString(map.get("cat"));
			strFileId = DataTypeUtils.asString(map.get("id"));
		}

		File file = getFile(strRealCat, strFileId);
		response.setHeader("Content-Disposition", String.format("attachment;filename=\"%1$s\"", getFileName(file.getName())));
		this.sendResponse(response, file);
	}

	@Override
	public void downloadTextByTicket(String strCat, String strDownloadTicket, HttpServletResponse response, boolean bTryFileId) {
		String strRealCat = null;
		String strFileId = null;
		String strCacheTag = this.getDownloadTicketCacheTag(strDownloadTicket);
		Map<String, String> map = this.getSysCacheUtilRuntime(false).get(strCacheTag, Map.class);
		if (ObjectUtils.isEmpty(map)) {
			if (bTryFileId) {
				strRealCat = strCat;
				strFileId = strDownloadTicket;
			} else {
				throw new NotFoundException(String.format("文件[%1$s]未找到", strDownloadTicket));
			}
		} else {
			strRealCat = DataTypeUtils.asString(map.get("cat"));
			strFileId = DataTypeUtils.asString(map.get("id"));
		}

		File file = getFile(strRealCat, strFileId);
		String ext = getFileExt(file.getName());
		if (StringUtils.hasLength(ext)) {
			try {
				IOSSTextProvider iOSSTextProvider = this.getOSSTextProvider(ext, true);
				if (iOSSTextProvider != null) {
					response.setHeader("Content-Disposition", String.format("attachment;filename=\"%1$s.txt\"", getFileName(file.getName())));
					String strText = iOSSTextProvider.getText(file);
					if (StringUtils.hasLength(strText)) {
						byte[] bytes = strText.getBytes(StandardCharsets.UTF_8);
						InputStream inputStream = new ByteArrayInputStream(bytes);
						this.sendResponse(response, inputStream);
					}
					return;
				}
			} catch (Throwable ex) {
				throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("生成文本信息发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		response.setHeader("Content-Disposition", String.format("attachment;filename=\"%1$s\"", getFileName(file.getName())));
		this.sendResponse(response, file);
	}

	protected String getDownloadTicketCacheTag(String strRandomKey) {
		return String.format("%1$s-oss-downloadticket-%2$s", CloudCacheTagUtils.PREFIX, strRandomKey);
	}

	@Override
	public FileItem uploadFile(String strCat, MultipartFile multipartFile) {
		return this.uploadFile(strCat, multipartFile, false);
	}

	@Override
	public FileItem uploadFile(String strCat, MultipartFile multipartFile, boolean bPreview) {
		FileItem fileItem = this.saveFile(strCat, multipartFile);
		if (bPreview) {
			File file = getFile(strCat, fileItem.getFileId());
			String ext = getFileExt(file.getName());
			if (StringUtils.hasLength(ext)) {
				try {
					IOSSPreviewProvider iOSSPreviewProvider = this.getOSSPreviewProvider(ext, true);
					if (iOSSPreviewProvider != null) {
						iOSSPreviewProvider.fillPreviewInfo(fileItem, file);
					}
				} catch (Throwable ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("生成预览信息发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}

		return fileItem;
	}

	protected void sendResponse(HttpServletResponse response, File file) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(file));
			bos = new BufferedOutputStream(response.getOutputStream());
			byte[] buff = new byte[2048];
			int bytesRead;
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				bos.write(buff, 0, bytesRead);
			}
		} catch (Exception e) {
			log.error(e);
		} finally {
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					log.error(e);
				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					log.error(e);
				}
			}
		}
	}

	protected void sendResponse(HttpServletResponse response, InputStream is) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(is);
			bos = new BufferedOutputStream(response.getOutputStream());
			byte[] buff = new byte[2048];
			int bytesRead;
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				bos.write(buff, 0, bytesRead);
			}
		} catch (Exception e) {
			log.error(e);
		} finally {
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					log.error(e);
				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					log.error(e);
				}
			}
		}
	}

	//
	protected String getFileName(String fileName) {
		try {
			return new String(fileName.getBytes("utf-8"), "iso8859-1");// 防止中文乱码
		} catch (UnsupportedEncodingException ex) {
			log.error(ex);
		}
		return fileName;
	}

}
