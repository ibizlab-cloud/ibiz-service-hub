package net.ibizsys.central.plugin.eai;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import jcifs.CIFSContext;
import jcifs.config.PropertyConfiguration;
import jcifs.context.BaseContext;
import jcifs.smb.NtlmPasswordAuthenticator;
import jcifs.smb.SmbFile;
import jcifs.smb.SmbFileInputStream;
import jcifs.smb.SmbFileOutputStream;
import net.ibizsys.central.eai.SysFileSyncAgentRuntimeBase;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * SMB (Server Message Block) 文件同步代理实现。 支持 SMB 2/3 协议，使用 jcifs-ng 库。
 * <p>
 * 配置参数（在系统应用集成代理设置中可覆盖）：
 * <ul>
 * <li>DOMAIN - Windows 域（可选）</li>
 * <li>TIMEOUT - 连接超时（毫秒，默认 30000）</li>
 * </ul>
 * serviceUrl 格式：smb://host:port/share/path 或 host:port/share/path
 */
public class SMBFileSyncAgentRuntime extends SysFileSyncAgentRuntimeBase {

	private static final Log log = LogFactory.getLog(SMBFileSyncAgentRuntime.class);

	public static final String PARAM_DOMAIN = "DOMAIN";

	private String domain;

	private CIFSContext context;
	private String baseUrlPrefix; // 如 "smb://server:445/d/share/"

	@Override
	protected int getDefaultPort() {
		return 445; // SMB 默认端口
	}

	@Override
	protected void onPrepareDefaultSetting() throws Exception {
		super.onPrepareDefaultSetting();

		
		this.domain = getSystemRuntimeSetting().getParam(getConfigFolder() + ".domain", DataTypeUtils.getStringValue(getAgentParam(PARAM_DOMAIN, null), null));

	}

	@Override
	protected void doConnect() throws Exception {
		// 1. 构建基础 URL
		String host = getHost();
		int port = getPort();
		String remoteDir = getRemoteDir();
		if (!remoteDir.startsWith("/")) {
			remoteDir = "/" + remoteDir;
		}
		if (remoteDir.length() > 1 && remoteDir.endsWith("/")) {
			remoteDir = remoteDir.substring(0, remoteDir.length() - 1);
		}
		String baseUrl = "smb://" + host + ":" + port + remoteDir;
		if (!baseUrl.endsWith("/")) {
			baseUrl += "/";
		}

		// 2. 配置属性
		Properties props = new Properties();
		props.setProperty("jcifs.smb.client.timeout", String.valueOf(this.getTimeout()));
		// 可选：明确禁用 SMB1，强制使用 SMB2/3[reference:8]
		props.setProperty("jcifs.smb.client.enableSMB2", "true");
		// 禁用 SMB1 的开关，设置为 false 以允许使用 SMB1
		props.setProperty("jcifs.smb.client.disableSMB1", "false");
		// 可选：设置支持的最小协议版本为 SMB1，确保兼容性
		props.setProperty("jcifs.smb.client.minVersion", "SMB1");
		// 可选：设置最大协议版本，可根据服务器能力调整
		props.setProperty("jcifs.smb.client.maxVersion", "SMB210");
		PropertyConfiguration config = new PropertyConfiguration(props);

		// 3. 创建基础上下文（只传配置）
		CIFSContext baseContext = new BaseContext(config);

		// 4. 创建认证信息
		NtlmPasswordAuthenticator auth;
		if (StringUtils.hasLength(domain)) {
			auth = new NtlmPasswordAuthenticator(domain, getClientId(), getClientSecret());
		} else {
			auth = new NtlmPasswordAuthenticator(null, getClientId(), getClientSecret());
		}

		// 5. 将认证信息附加到上下文
		this.context = baseContext.withCredentials(auth);
		this.baseUrlPrefix = baseUrl;

		// 6. 测试连接，验证认证是否成功
		try {
			try (SmbFile rootFile = new SmbFile(baseUrlPrefix, context)) {
				if (!rootFile.exists()) {
					throw new Exception("远程 SMB 目录不存在：" + baseUrlPrefix);
				}
				if (!rootFile.isDirectory()) {
					throw new Exception("远程路径不是目录：" + baseUrlPrefix);
				}
			}

		} catch (IOException e) {
			// 认证失败，清理状态
			try {
				this.doDisconnect();
			}
			catch (Exception ignore) {
			}
			
			this.context = null;
			this.baseUrlPrefix = null;
			throw new Exception("SMB 连接失败，请检查主机、端口、共享名称和认证信息: " + e.getMessage(), e);
		}

		log.info(String.format("SMB 连接成功：%s@%s:%d，远程目录：%s", getClientId(), getHost(), getPort(), remoteDir));
	}

	@Override
	protected void doDisconnect() throws Exception {
		// jcifs-ng 不需要显式断开，释放上下文即可
		this.context = null;
		this.baseUrlPrefix = null;
	}

	@Override
	protected boolean isConnected() {
		// 只有 context 非空才视为已连接
		try {
			boolean ret =  this.context != null;
			if(ret) {
				this.listFiles(null);
			}
			return ret;
		} catch (Throwable ignored) {
			return false;
		}
	}

	/**
	 * 将传入的远程路径转换为 SmbFile 对象。 路径可以是绝对路径（以 "/" 开头，包含共享名）或相对路径（相对于 remoteDir）。
	 * 内部统一转换为基于 baseUrlPrefix 的 URL。
	 */
	private SmbFile getSmbFile(String path) throws Exception {
		if (context == null) {
			throw new IllegalStateException("SMB 连接未建立或已断开");
		}
		String fullUrl;
		// 如果 path 已经是完整的 smb:// URL，则直接使用
		if (path.startsWith("smb://")) {
			fullUrl = path;
		} else {
			// 去除可能的 remoteDir 前缀，得到相对路径
			String relative = path;
			String remoteDir = getRemoteDir();
			if (StringUtils.hasLength(remoteDir) && !"/".equals(remoteDir)) {
				// 确保 remoteDir 有前导 /
				String base = remoteDir.startsWith("/") ? remoteDir : "/" + remoteDir;
				if (path.startsWith(base)) {
					relative = path.substring(base.length());
				}
			}
			// 去除开头的 "/"
			if (relative.startsWith("/")) {
				relative = relative.substring(1);
			}
			// 拼接
			fullUrl = baseUrlPrefix + relative;
		}
		return new SmbFile(fullUrl, context);
	}

	@Override
	protected List<String> listFiles(String remoteDir) throws Exception {
		SmbFile dirFile = getSmbFile(remoteDir);
		SmbFile[] children = dirFile.listFiles();
		List<String> fileNames = new ArrayList<>();
		if (children != null) {
			for (SmbFile child : children) {
				if (child.isFile()) {
					fileNames.add(child.getName());
				}
			}
		}
		return fileNames;
	}

	@Override
	protected File downloadFile(String remoteFilePath, boolean overwrite) throws Exception {
		String fileName = new File(remoteFilePath).getName();
		File localFile = new File(getWorkspace(), fileName);

		if (localFile.exists() && !overwrite) {
			return localFile;
		}

		if (!localFile.getParentFile().exists()) {
			localFile.getParentFile().mkdirs();
		}

		SmbFile smbFile = getSmbFile(remoteFilePath);
		try (SmbFileInputStream sis = new SmbFileInputStream(smbFile); FileOutputStream fos = new FileOutputStream(localFile)) {
			byte[] buffer = new byte[8192];
			int len;
			while ((len = sis.read(buffer)) != -1) {
				fos.write(buffer, 0, len);
			}
		} catch (IOException e) {
			if (localFile.exists()) {
				localFile.delete();
			}
			throw new Exception("下载文件失败：" + remoteFilePath, e);
		}

		log.debug(String.format("文件下载成功：%s -> %s", remoteFilePath, localFile.getAbsolutePath()));
		return localFile;
	}

	@Override
	protected void uploadFile(String remoteFilePath, InputStream inputStream) throws Exception {
		SmbFile smbFile = getSmbFile(remoteFilePath);
		// 确保父目录存在
		String parentPath = smbFile.getParent();
		if (parentPath != null) {
			try (SmbFile parent = new SmbFile(parentPath, context)) {
				if (!parent.exists()) {
					parent.mkdirs();
				}
			}
		}
		try (SmbFileOutputStream sos = new SmbFileOutputStream(smbFile)) {
			byte[] buffer = new byte[8192];
			int len;
			while ((len = inputStream.read(buffer)) != -1) {
				sos.write(buffer, 0, len);
			}
			sos.flush();
		} catch (IOException e) {
			throw new Exception("上传文件失败：" + remoteFilePath, e);
		}
	}

	@Override
	protected void renameFile(String tempRemotePath, String finalRemotePath) throws Exception {
		SmbFile src = getSmbFile(tempRemotePath);
		SmbFile dest = getSmbFile(finalRemotePath);
		if (!src.exists()) {
			throw new Exception("源文件不存在：" + tempRemotePath);
		}
		if (dest.exists()) {
			dest.delete();
		}
		src.renameTo(dest);
	}

	@Override
	protected void deleteFile(String remoteFilePath) throws Exception {
		SmbFile file = getSmbFile(remoteFilePath);
		if (file.exists()) {
			file.delete();
		}
	}

	@Override
	protected boolean fileExists(String remoteFilePath) throws Exception {
		SmbFile file = getSmbFile(remoteFilePath);
		return file.exists();
	}

	@Override
	protected void onShutdown() throws Exception {
		doDisconnect(); // 确保 context 置空
		super.onShutdown();
	}
}