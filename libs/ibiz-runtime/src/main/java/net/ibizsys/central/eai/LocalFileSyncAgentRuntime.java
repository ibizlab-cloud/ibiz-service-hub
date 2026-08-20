package net.ibizsys.central.eai;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

public class LocalFileSyncAgentRuntime extends SysFileSyncAgentRuntimeBase {

	private static final Log log = LogFactory.getLog(LocalFileSyncAgentRuntime.class);
	private String remoteDir = null;

	@Override
	protected void parseServiceUrl() throws Exception {
		String serviceUrl = this.getServiceUrl();
		if (!StringUtils.hasLength(serviceUrl)) {
			throw new Exception("未指定本地路径(serviceUrl)");
		}

		String url = serviceUrl.trim();
		int schemeIdx = url.indexOf("://");
		if (schemeIdx != -1) {
			url = url.substring(schemeIdx + 3);
		}
		this.remoteDir = url;

	}

	protected String getRemoteDir() {
		return this.remoteDir;
	}

	@Override
	protected int getDefaultPort() {
		return 0; // 本地代理无需端口
	}

	@Override
	protected void doConnect() throws Exception {
		// 本地操作无需连接
	}

	@Override
	protected void doDisconnect() throws Exception {
		// 本地操作无需断开
	}

	@Override
	protected boolean isConnected() {
		return true;
	}

	@Override
	protected List<String> listFiles(String remoteDir) throws Exception {
		String dirPath = StringUtils.hasLength(remoteDir)?remoteDir: getRemoteDir();
		if (!StringUtils.hasLength(dirPath)) {
			throw new Exception("远程目录未设置");
		}
		File dir = new File(dirPath);
		if (!dir.exists() || !dir.isDirectory()) {
			log.warn(String.format("本地目录不存在或不是目录：%s", dirPath));
			return new ArrayList<>();
		}
		File[] files = dir.listFiles();
		List<String> fileNames = new ArrayList<>();
		if (files != null) {
			for (File file : files) {
				if (file.isFile()) {
					// 基类会过滤临时文件，所以返回所有文件名
					fileNames.add(file.getName());
				}
			}
		}
		return fileNames;
	}

	@Override
	protected File downloadFile(String remoteFilePath, boolean overwrite) throws Exception {
		if (!StringUtils.hasLength(remoteFilePath)) {
			throw new Exception("远程文件路径为空");
		}
		File file = new File(remoteFilePath);
		if (!file.exists()) {
			throw new Exception(String.format("本地文件不存在：%s", remoteFilePath));
		}
		if (!file.isFile()) {
			throw new Exception(String.format("路径不是文件：%s", remoteFilePath));
		}
		// 直接返回本地文件，无需复制到工作区
		return file;
	}

	@Override
	protected void uploadFile(String tempRemotePath, InputStream inputStream) throws Exception {
		if (inputStream == null) {
			throw new Exception("输入流为空");
		}
		File tempFile = new File(tempRemotePath);
		// 确保父目录存在
		File parentDir = tempFile.getParentFile();
		if (parentDir != null && !parentDir.exists()) {
			if (!parentDir.mkdirs()) {
				throw new Exception(String.format("无法创建父目录：%s", parentDir.getAbsolutePath()));
			}
		}
		try (FileOutputStream fos = new FileOutputStream(tempFile)) {
			byte[] buffer = new byte[8192];
			int len;
			while ((len = inputStream.read(buffer)) != -1) {
				fos.write(buffer, 0, len);
			}
			fos.flush();
		}
		log.debug(String.format("临时文件写入成功：%s", tempRemotePath));
	}

	@Override
	protected void renameFile(String tempRemotePath, String finalRemotePath) throws Exception {
		File tempFile = new File(tempRemotePath);
		File finalFile = new File(finalRemotePath);
		if (!tempFile.exists()) {
			throw new Exception(String.format("临时文件不存在：%s", tempRemotePath));
		}
		// 如果目标文件已存在，根据 overwrite 决定是否覆盖（基类已在调用前判断）
		if (finalFile.exists()) {
			if (!finalFile.delete()) {
				throw new Exception(String.format("无法删除已存在的目标文件：%s", finalRemotePath));
			}
		}
		if (!tempFile.renameTo(finalFile)) {
			throw new Exception(String.format("重命名失败：%s -> %s", tempRemotePath, finalRemotePath));
		}
		log.debug(String.format("文件重命名成功：%s -> %s", tempRemotePath, finalRemotePath));
	}

	@Override
	protected void deleteFile(String remoteFilePath) throws Exception {
		if (!StringUtils.hasLength(remoteFilePath)) {
			return;
		}
		File file = new File(remoteFilePath);
		if (file.exists()) {
			if (!file.delete()) {
				log.warn(String.format("删除文件失败：%s", remoteFilePath));
			} else {
				log.debug(String.format("删除文件成功：%s", remoteFilePath));
			}
		}
	}

	@Override
	protected boolean fileExists(String remoteFilePath) throws Exception {
		if (!StringUtils.hasLength(remoteFilePath)) {
			return false;
		}
		File file = new File(remoteFilePath);
		return file.exists() && file.isFile();
	}

}
