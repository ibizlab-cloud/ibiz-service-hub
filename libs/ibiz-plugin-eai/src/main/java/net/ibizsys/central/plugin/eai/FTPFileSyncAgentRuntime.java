package net.ibizsys.central.plugin.eai;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.eai.SysFileSyncAgentRuntimeBase;
import net.ibizsys.runtime.util.DataTypeUtils;

public class FTPFileSyncAgentRuntime extends SysFileSyncAgentRuntimeBase {

	private static final Log log = LogFactory.getLog(FTPFileSyncAgentRuntime.class);

	public static final String PARAM_PASSIVE_MODE = "PASSIVE_MODE";
	public static final String PARAM_CONTROL_ENCODING = "CONTROL_ENCODING";
	public static final String PARAM_FILE_TYPE = "FILE_TYPE"; // ASCII / BINARY

	private boolean passiveMode = true;
	private String controlEncoding = "UTF-8";
	private int fileType = FTP.BINARY_FILE_TYPE;

	private FTPClient ftpClient;
	private String workingDir = null;

	@Override
	protected int getDefaultPort() {
		return 21;
	}

	@Override
	protected void onPrepareDefaultSetting() throws Exception {

		super.onPrepareDefaultSetting();

		this.passiveMode = getSystemRuntimeSetting().getParam(getConfigFolder() + ".passivemode", DataTypeUtils.getBooleanValue(getAgentParam(PARAM_PASSIVE_MODE, null), true));

		this.controlEncoding = getSystemRuntimeSetting().getParam(getConfigFolder() + ".controlencoding", DataTypeUtils.getStringValue(getAgentParam(PARAM_CONTROL_ENCODING, null), "UTF-8"));

		String strFileType = getSystemRuntimeSetting().getParam(getConfigFolder() + ".filetype", DataTypeUtils.getStringValue(getAgentParam(PARAM_FILE_TYPE, null), "BINARY"));
		if ("ASCII".equalsIgnoreCase(strFileType)) {
			this.fileType = FTP.ASCII_FILE_TYPE;
		} else {
			this.fileType = FTP.BINARY_FILE_TYPE;
		}
	}

	@Override
	protected void doConnect() throws Exception {
		ftpClient = new FTPClient();
		ftpClient.setControlEncoding(controlEncoding);
		ftpClient.connect(this.getHost(), this.getPort());
		int reply = ftpClient.getReplyCode();
		if (!FTPReply.isPositiveCompletion(reply)) {
			ftpClient.disconnect();
			throw new Exception("FTP服务器拒绝连接，响应码：" + reply);
		}
		if (!ftpClient.login(this.getClientId(), this.getClientSecret())) {
			ftpClient.disconnect();
			throw new Exception("FTP登录失败，用户名或密码错误");
		}
		if (passiveMode) {
			ftpClient.enterLocalPassiveMode();
		} else {
			ftpClient.enterLocalActiveMode();
		}
		ftpClient.setFileType(fileType);
		
		
		this.workingDir = ftpClient.printWorkingDirectory();
		if(ObjectUtils.isEmpty(this.workingDir)) {
			this.workingDir = "/";
		}
		
		// 切换到远程目录，若不存在则尝试创建
		if (StringUtils.hasLength(this.getRemoteDir()) && !"/".equals(this.getRemoteDir())) {
			
			String dir = this.getRemoteDir();
			// 去除开头的 '/'，得到相对路径
			if (dir.startsWith("/")) {
				dir = dir.substring(1);
			}
			// 按 '/' 分割
			String[] parts = dir.split("/");
			StringBuilder current = new StringBuilder();
			current.append(this.workingDir);
			for (String part : parts) {
				if (!StringUtils.hasLength(part))
					continue;
				if (current.length() > 0) {
					current.append("/").append(part);
				} else {
					current.append(part);
				}
				String path = current.toString();
				// 尝试切换，若失败则创建并再次切换
				if (!ftpClient.changeWorkingDirectory(path)) {
					if (!ftpClient.makeDirectory(path)) {
						throw new Exception("无法创建远程目录：" + path);
					}
					ftpClient.changeWorkingDirectory(path);
				}
			}
		}

		log.info(String.format("FTP连接成功：%s@%s:%d，远程目录：%s", this.getClientId(), this.getHost(), this.getPort(), this.getRemoteDir()));
	}

	@Override
	protected void doDisconnect() throws Exception {
		if (ftpClient != null && ftpClient.isConnected()) {
			try {
				ftpClient.logout();
			} catch (IOException ignored) {
			}
			ftpClient.disconnect();
		}
		ftpClient = null;
	}

	@Override
	protected boolean isConnected() {
		try {
			boolean ret = ftpClient != null && ftpClient.isConnected();
			if(ret) {
				this.listFiles(null);
			}
			return ret;
		} catch (Throwable ignored) {
			return false;
		}
	}

	@Override
	protected List<String> listFiles(String remoteDir) throws Exception {
		synchronized (this) {
			return doListFiles(remoteDir);
		}
	}

	protected List<String> doListFiles(String remoteDir) throws Exception {
		String dir = StringUtils.hasLength(remoteDir) ? remoteDir : getRemoteDir();

		if (StringUtils.hasLength(dir) && !"/".equals(dir)) {
			if (dir.startsWith("/")) {
				dir = dir.substring(1);
			}
			String[] parts = dir.split("/");
			StringBuilder current = new StringBuilder();
			current.append(this.workingDir);
			for (String part : parts) {
				if (!StringUtils.hasLength(part))
					continue;
				if (current.length() > 0) {
					current.append("/").append(part);
				} else {
					current.append(part);
				}
				String path = current.toString();
				// 尝试切换，若失败则创建并再次切换
				if (!ftpClient.changeWorkingDirectory(path)) {
					if (!ftpClient.makeDirectory(path)) {
						throw new Exception("无法创建远程目录：" + path);
					}
					ftpClient.changeWorkingDirectory(path);
				}
			}
		} else {
			ftpClient.changeWorkingDirectory(this.workingDir);
		}

		List<String> list = new ArrayList<>();
		FTPFile[] files = ftpClient.listFiles();
		if (files != null) {
			for (FTPFile file : files) {
				if (file.isFile()) {
					list.add(file.getName());
				}
			}
		}
		return list;
	}

	@Override
	protected File downloadFile(String remoteFilePath, boolean overwrite) throws Exception {

		File localFile = new File(getWorkspace(), remoteFilePath);

		if (localFile.exists() && !overwrite) {
			return localFile;
		}

		if (!localFile.getParentFile().exists()) {
			localFile.getParentFile().mkdirs();
		}
		
		StringBuilder fullFilePath = new StringBuilder();
		if(!"/".equals(this.workingDir)) {
			fullFilePath.append(this.workingDir);
		}
		
		fullFilePath.append(remoteFilePath);
		
		String strRealRemoteFilePath = fullFilePath.toString();

		try (FileOutputStream fos = new FileOutputStream(localFile)) {
			boolean success = ftpClient.retrieveFile(strRealRemoteFilePath, fos);
			if (!success) {
				throw new Exception("下载文件失败：" + remoteFilePath + "，响应码：" + ftpClient.getReplyCode());
			}
		} catch (IOException e) {
			// 删除可能不完整的本地文件
			if (localFile.exists()) {
				localFile.delete();
			}
			throw e;
		}

		log.debug(String.format("文件下载成功：%s -> %s", remoteFilePath, localFile.getAbsolutePath()));
		return localFile;
	}

	@Override
	protected void uploadFile(String remoteFilePath, InputStream inputStream) throws Exception {
		
		
		StringBuilder fullFilePath = new StringBuilder();
		if(!"/".equals(this.workingDir)) {
			fullFilePath.append(this.workingDir);
		}
		fullFilePath.append(remoteFilePath);
		
		String strRealRemoteFilePath = fullFilePath.toString();
		
		boolean success = ftpClient.storeFile(strRealRemoteFilePath, inputStream);
		if (!success) {
			throw new Exception("上传临时文件失败：" + remoteFilePath + "，响应码：" + ftpClient.getReplyCode());
		}
	}

	@Override
	protected void renameFile(String remoteFilePath, String finalRemotePath) throws Exception {
		
		StringBuilder fullFilePath = new StringBuilder();
		if(!"/".equals(this.workingDir)) 
			fullFilePath.append(this.workingDir);
		fullFilePath.append(remoteFilePath);
		
		String strRealRemoteFilePath = fullFilePath.toString();
		
		
		StringBuilder finalFullFilePath = new StringBuilder();
		if(!"/".equals(this.workingDir)) 
			finalFullFilePath.append(this.workingDir);
		finalFullFilePath.append(finalRemotePath);
		
		String strFinalRemoteFilePath = finalFullFilePath.toString();
		
		boolean success = ftpClient.rename(strRealRemoteFilePath, strFinalRemoteFilePath);
		if (!success) {
			throw new Exception("重命名文件失败：" + remoteFilePath + " -> " + finalRemotePath + "，响应码：" + ftpClient.getReplyCode());
		}
	}

	@Override
	protected void deleteFile(String remoteFilePath) throws Exception {
		StringBuilder fullFilePath = new StringBuilder();
		if(!"/".equals(this.workingDir)) 
			fullFilePath.append(this.workingDir);
		fullFilePath.append(remoteFilePath);
		
		String strRealRemoteFilePath = fullFilePath.toString();
		
		try {
			ftpClient.deleteFile(strRealRemoteFilePath);
		} catch (IOException e) {
			// 忽略文件不存在的错误
			if (!ftpClient.getReplyString().contains("550")) {
				throw e;
			}
		}
	}

	@Override
	protected boolean fileExists(String remoteFilePath) throws Exception {
		
		StringBuilder fullFilePath = new StringBuilder();
		if(!"/".equals(this.workingDir)) 
			fullFilePath.append(this.workingDir);
		fullFilePath.append(remoteFilePath);
		
		String strRealRemoteFilePath = fullFilePath.toString();
		
		FTPFile[] files = ftpClient.listFiles(strRealRemoteFilePath);
		return files != null && files.length > 0;
	}

}
