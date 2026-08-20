package net.ibizsys.central.eai;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.datasync.IDEDataSyncInRuntimeBase;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.datasync.IDEDataSyncInRuntime;
import net.ibizsys.runtime.res.SysDataSyncAgentDirs;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

public abstract class SysFileSyncAgentRuntimeBase extends SysEAIAgentRuntimeBase implements ISysFileSyncAgentRuntime {

	private static final Log log = LogFactory.getLog(SysFileSyncAgentRuntimeBase.class);

	public static final String PARAM_OVERWRITE = "OVERWRITE";
	public static final String PARAM_TIMEOUT = "TIMEOUT";
	public static final String PARAM_DELETE_AFTER_RECV = "DELETE_AFTER_RECV";

	private String host;
	private int port;
	private String remoteDir = "/";

	private boolean overwrite = true;
	private int timeout = 30000;
	private boolean deleteAfterRecv = true;

	private File workspace = null;
	private final Set<String> processingFilePaths = ConcurrentHashMap.newKeySet();

	// ---------- 抽象方法（子类必须实现） ----------
	protected abstract int getDefaultPort();

	protected abstract void doConnect() throws Exception;

	protected abstract void doDisconnect() throws Exception;

	protected abstract boolean isConnected();

	protected abstract List<String> listFiles(String remoteDir) throws Exception;

	protected abstract File downloadFile(String remoteFilePath, boolean overwrite) throws Exception;

	protected abstract void uploadFile(String remoteFilePath, InputStream inputStream) throws Exception;

	protected abstract void renameFile(String tempRemotePath, String finalRemotePath) throws Exception;

	protected abstract void deleteFile(String remoteFilePath) throws Exception;

	protected abstract boolean fileExists(String remoteFilePath) throws Exception;

	@Override
	protected void onPrepareDefaultSetting() throws Exception {

		super.onPrepareDefaultSetting();

		this.overwrite = getSystemRuntimeSetting().getParam(getConfigFolder() + ".overwrite", DataTypeUtils.getBooleanValue(getAgentParam(PARAM_OVERWRITE, null), true));
		this.timeout = getSystemRuntimeSetting().getParam(getConfigFolder() + ".timeout", DataTypeUtils.getIntegerValue(getAgentParam(PARAM_TIMEOUT, null), 30000));
		this.deleteAfterRecv = getSystemRuntimeSetting().getParam(getConfigFolder() + ".deleteafterrecv", DataTypeUtils.getBooleanValue(getAgentParam(PARAM_DELETE_AFTER_RECV, null), true));
	}

	// ---------- 生命周期与初始化 ----------
	@Override
	protected void onInit() throws Exception {

		this.parseServiceUrl();

		this.workspace = new File(new StringBuilder(this.getSystemRuntime().getFileFolder()).append(File.separator).append(this.getConfigFolder().toLowerCase()).toString());
		if (!this.workspace.exists()) {
			this.workspace.mkdirs();
		}

		super.onInit();

		try {
			doConnect();
		} catch (Exception ex) {
			// throw new Exception(String.format("准备文件同步客户端发生异常：%s",
			// ex.getMessage()), ex);
			log.error(String.format("系统应用集成代理[%1$s]准备文件同步客户端发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.EAI, String.format("系统应用集成代理[%1$s]准备文件同步客户端发生异常，%2$s", this.getName(), ex.getMessage()), null);
		}

		String syncDir = this.getPSSysDataSyncAgent().getSyncDir();
		if (SysDataSyncAgentDirs.INOUT.equals(syncDir) || SysDataSyncAgentDirs.IN.equals(syncDir)) {

		}
	}

	/**
	 * 解析 serviceUrl，提取主机、端口和远程目录路径 格式：protocol://host:port/path/to/dir 或
	 * host:port/path/to/dir
	 */
	protected void parseServiceUrl() throws Exception {
		String serviceUrl = this.getServiceUrl();
		if (!StringUtils.hasLength(serviceUrl)) {
			throw new Exception("未指定服务地址(serviceUrl)");
		}

		String url = serviceUrl.trim();
		int schemeIdx = url.indexOf("://");
		if (schemeIdx != -1) {
			url = url.substring(schemeIdx + 3);
		}

		String hostPortPart;
		String pathPart = null;
		int slashIdx = url.indexOf('/');
		if (slashIdx != -1) {
			hostPortPart = url.substring(0, slashIdx);
			pathPart = url.substring(slashIdx);
		} else {
			hostPortPart = url;
			pathPart = null;
		}

		int colonIdx = hostPortPart.lastIndexOf(':');
		if (colonIdx != -1) {
			String portPart = hostPortPart.substring(colonIdx + 1);
			if (portPart.matches("\\d+")) {
				this.host = hostPortPart.substring(0, colonIdx);
				this.port = Integer.parseInt(portPart);
			} else {
				this.host = hostPortPart;
				this.port = getDefaultPort();
			}
		} else {
			this.host = hostPortPart;
			this.port = getDefaultPort();
		}

		if (!StringUtils.hasLength(this.host)) {
			throw new Exception("无法从 serviceUrl 解析出主机地址");
		}
		if (this.port <= 0 || this.port > 65535) {
			throw new Exception("端口号无效：" + this.port);
		}

		this.remoteDir = ((pathPart != null) && !pathPart.equals("/")) ? pathPart : "";
	}

	protected String getHost() {
		return this.host;
	}

	protected int getPort() {
		return this.port;
	}

	protected String getRemoteDir() {
		return this.remoteDir;
	}

	protected File getWorkspace() {
		return this.workspace;
	}

	protected boolean isOverwrite() {
		return this.overwrite;
	}

	protected int getTimeout() {
		return this.timeout;
	}

	protected boolean isDeleteAfterRecv() {
		return this.deleteAfterRecv;
	}

	@Override
	public String getTargetDir() {
		return getRemoteDir();
	}

	protected void uploadLocalFile(String remotePath, File file) throws Exception {
		ensureConnected();

		try (FileInputStream fis = new FileInputStream(file)) {
			if (!overwrite && fileExists(remotePath)) {
				log.debug(String.format("远程文件已存在，跳过上传：%s", remotePath));
				return;
			}
			try {
				deleteFile(remotePath);
			} catch (Exception ignored) {
			}
			uploadFile(remotePath, fis);
			log.debug(String.format("本地文件上传成功：%s -> %s", file.getCanonicalPath(), remotePath));
		} catch (Exception e) {
			try {
				deleteFile(remotePath);
			} catch (Exception ignored) {
			}
			throw new Exception(String.format("上传本地文件失败：%s", e.getMessage()), e);
		}
	}

	// ---------- 连接辅助 ----------
	protected void ensureConnected() throws Exception {
		if (!isConnected()) {
			log.warn("文件同步连接已断开，尝试重连...");
			doDisconnect();
			doConnect();
		}
	}

	@Override
	public void send(String remotePath, File file, Map<String, Object> params) {
		Assert.notNull(file, "传入文件无效");

		try {

			if (!file.exists() || !file.isFile()) {
				throw new Exception(String.format("发送文件[%1$s]无效", file.getCanonicalPath()));
			}

			this.onSend(remotePath, file, params);

		} catch (Throwable ex) {
			if (ex instanceof ISystemRuntimeException) {
				throw (RuntimeException) ex;
			}

			log.error(String.format("发送文件发生异常，%1$s", ex.getMessage()), ex);
			throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("发送文件发生异常，%1$s", ex.getMessage()), ex);
		}

	}

	protected void onSend(String remotePath, File file, Map<String, Object> params) throws Throwable {
		if (ObjectUtils.isEmpty(remotePath)) {
			remotePath = this.getRemoteDir() + "/" + file.getName();
		}

		this.uploadLocalFile(remotePath, file);
	}

	@Override
	public void recv(String remoteDir, IDEDataSyncInRuntimeBase iDEDataSyncInRuntimeBase, Map<String, Object> params) {
		try {
			ensureConnected();
			remoteDir = StringUtils.hasLength(remoteDir) ? remoteDir : this.getRemoteDir();
			List<String> fileNames = listFiles(remoteDir);
			if (fileNames == null || fileNames.isEmpty())
				return;

			fileNames = iDEDataSyncInRuntimeBase.filter(remoteDir, fileNames, params);
			if (fileNames == null || fileNames.isEmpty())
				return;

			if (iDEDataSyncInRuntimeBase.isBatchMode(params)) {
				Map<String, File> fileMap = new LinkedHashMap<String, File>();
				for (String filename : fileNames) {
					String remoteFilePath = remoteDir + "/" + filename;
					// 尝试获取文件处理锁
					if (!processingFilePaths.add(remoteFilePath)) {
						log.debug(String.format("文件 %s 正在被其他线程处理，本次跳过", remoteFilePath));
						continue;
					}
					try {
						File localFile = downloadFile(remoteFilePath, false);
						fileMap.put(remoteFilePath, localFile);
					} catch (Throwable ex) {
						// 发生异常， 释放处理中
						for (String item : fileMap.keySet()) {
							processingFilePaths.remove(item);
						}
						throw ex;
					}
				}

				if (ObjectUtils.isEmpty(fileMap)) {
					return;
				}

				try {
					if (doRecvBatch(fileMap, iDEDataSyncInRuntimeBase, params)) {
						for (String remoteFilePath : fileMap.keySet()) {
							if (this.isDeleteAfterRecv()) {
								try {
									this.deleteFile(remoteFilePath);
									log.debug(String.format("远程文件已删除：%s", remoteFilePath));
								} catch (Throwable ex) {
									log.error(String.format("移除远程文件发生异常，%1$s", ex.getMessage()), ex);
								}
							} else {
								log.debug(String.format("根据配置跳过删除远程文件：%s", remoteFilePath));
							}
							log.debug(String.format("成功处理远程文件：%s", remoteFilePath));
						}
					}
				} finally {
					// 无论处理成功或异常，均释放锁
					for (String item : fileMap.keySet()) {
						processingFilePaths.remove(item);
					}
				}
			} else {
				for (String filename : fileNames) {
					String remoteFilePath = remoteDir + "/" + filename;
					// 尝试获取文件处理锁
					if (!processingFilePaths.add(remoteFilePath)) {
						log.debug(String.format("文件 %s 正在被其他线程处理，本次跳过", remoteFilePath));
						continue;
					}
					try {
						File localFile = downloadFile(remoteFilePath, false);
						if (doRecv(remoteFilePath, localFile, iDEDataSyncInRuntimeBase, params)) {
							if (this.isDeleteAfterRecv()) {
								try {
									this.deleteFile(remoteFilePath);
									log.debug(String.format("远程文件已删除：%s", remoteFilePath));
								} catch (Throwable ex) {
									log.error(String.format("移除远程文件发生异常，%1$s", ex.getMessage()), ex);
								}
							} else {
								log.debug(String.format("根据配置跳过删除远程文件：%s", remoteFilePath));
							}
						}
						log.debug(String.format("成功处理远程文件：%s", remoteFilePath));
					} finally {
						// 无论处理成功或异常，均释放锁
						processingFilePaths.remove(remoteFilePath);
					}
				}
			}

		} catch (Throwable ex) {
			log.error(String.format("接收并处理文件发生异常，%1$s", ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, LogCats.EAI, String.format("系统应用集成代理[%1$s]处理接收文件发生异常，%2$s", this.getName(), ex.getMessage()), null);
		}
	}

	protected boolean doRecv(String remotePath, File file, IDEDataSyncInRuntimeBase iDEDataSyncInRuntimeBase, Map<String, Object> params) throws Throwable {

		boolean bResetUserContext = false;
		IUserContext iUserContext = ActionSessionManager.getUserContext();
		if (iUserContext == null) {
			iUserContext = this.getSystemRuntime().createDefaultUserContext();
			UserContext.setCurrent(iUserContext);
			bResetUserContext = true;
		}

		try {
			iDEDataSyncInRuntimeBase.recv(remotePath, file, params);
			return true;
		} catch (Throwable ex) {
			if (ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException real = (DataEntityRuntimeException) ex;
				if (real.getDataEntityRuntime() != null && real.getModelRuntime() != null) {
					log.error(String.format("实体[%1$s]数据同步[%2$s]处理输入文件发生异常，%3$s", real.getDataEntityRuntime().getName(), real.getModelRuntime().getName(), ex.getMessage()), ex);
					this.getSystemRuntime().log(LogLevels.ERROR, LogCats.EAI, String.format("实体[%1$s]数据同步[%2$s]处理输入文件发生异常，%3$s", real.getDataEntityRuntime().getName(), real.getModelRuntime().getName(), ex.getMessage()), null);
					return false;
				}
			}
			log.error(ex);
			return false;
		} finally {
			if (bResetUserContext) {
				UserContext.setCurrent(null);
			}
		}
	}

	protected boolean doRecvBatch(Map<String, File> remoteFileMap, IDEDataSyncInRuntimeBase iDEDataSyncInRuntimeBase, Map<String, Object> params) throws Throwable {

		boolean bResetUserContext = false;
		IUserContext iUserContext = ActionSessionManager.getUserContext();
		if (iUserContext == null) {
			iUserContext = this.getSystemRuntime().createDefaultUserContext();
			UserContext.setCurrent(iUserContext);
			bResetUserContext = true;
		}

		try {
			iDEDataSyncInRuntimeBase.recvBatch(remoteFileMap, params);
			return true;
		} catch (Throwable ex) {
			if (ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException real = (DataEntityRuntimeException) ex;
				if (real.getDataEntityRuntime() != null && real.getModelRuntime() != null) {
					log.error(String.format("实体[%1$s]数据同步[%2$s]处理输入文件发生异常，%3$s", real.getDataEntityRuntime().getName(), real.getModelRuntime().getName(), ex.getMessage()), ex);
					this.getSystemRuntime().log(LogLevels.ERROR, LogCats.EAI, String.format("实体[%1$s]数据同步[%2$s]处理输入文件发生异常，%3$s", real.getDataEntityRuntime().getName(), real.getModelRuntime().getName(), ex.getMessage()), null);
					return false;
				}
			}
			log.error(ex);
			return false;
		} finally {
			if (bResetUserContext) {
				UserContext.setCurrent(null);
			}
		}
	}

	@Override
	public synchronized void registerSysEAIMsgListener(ISysEAIMsgListener iSysEAIMsgListener) {
		// 忽略
		// super.registerSysEAIMsgListener(iSysEAIMsgListener);
	}

	@Override
	public synchronized void unregisterSysEAIMsgListener(ISysEAIMsgListener iSysEAIMsgListener) {
		// super.unregisterSysEAIMsgListener(iSysEAIMsgListener);
	}

	@Override
	public synchronized void registerDEDataSyncInRuntime(IDEDataSyncInRuntime iDEDataSyncInRuntime) {
		// super.registerDEDataSyncInRuntime(iDEDataSyncInRuntime);
	}

	@Override
	public synchronized void unregisterDEDataSyncInRuntime(IDEDataSyncInRuntime iDEDataSyncInRuntime) {
		// super.unregisterDEDataSyncInRuntime(iDEDataSyncInRuntime);
	}

	@Override
	public void shutdown() throws Exception {
		onShutdown();
	}

	protected void onShutdown() throws Exception {
		try {
			doDisconnect();
		} catch (Exception ex) {
			log.error(String.format("关闭文件同步客户端发生异常：%s", ex.getMessage()), ex);
		}
	}
}