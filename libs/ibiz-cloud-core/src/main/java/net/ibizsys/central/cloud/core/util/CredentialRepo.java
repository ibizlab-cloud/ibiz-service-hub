package net.ibizsys.central.cloud.core.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.domain.Credential;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.YamlUtils;

/**
 * 配置侦听器仓库
 * @author lionlau
 *
 */
public class CredentialRepo implements ICredentialRepo{

	private static final Log log = LogFactory.getLog(CredentialRepo.class);
	
	private ISystemRuntime iSystemRuntime = null;
	private Map<String, Credential> credentialMap = new ConcurrentHashMap<String, Credential>();
	
	private IConfigListenerRepo iConfigListenerRepo ;
	
	//public final static String CONFIGID_CREDENTIAL_PREFIX = "credential-";
	
	private final static Credential EMPTY = new Credential();
	
	public void init(ISystemRuntime iSystemRuntime, IConfigListenerRepo iConfigListenerRepo) throws Exception {
		Assert.notNull(iSystemRuntime, "传入系统运行时对象无效");
		Assert.notNull(iSystemRuntime, "传入配置侦听器仓库对象无效");
		this.iSystemRuntime = iSystemRuntime;
		this.iConfigListenerRepo = iConfigListenerRepo;
		this.onInit();
	}
	
	
	protected void onInit() throws Exception {
		
	}
	
	public ISystemRuntime getSystemRuntime() {
		return this.iSystemRuntime;
	}

	protected IConfigListenerRepo getConfigListenerRepo() {
		return this.iConfigListenerRepo;
	}


	@Override
	public Credential getCredential(String strConfigId, boolean bTryMode) {
		Assert.hasLength(strConfigId, "未传入配置标识");
		Credential credential = this.credentialMap.get(strConfigId);
		if(credential == null) {
			String strFullConfigId = strConfigId;// String.format("%1$s%2$s", CONFIGID_CREDENTIAL_PREFIX, strConfigId);
			try {
				credential = this.doGetCredential(strFullConfigId);
			}
			catch (Throwable ex) {
				ex = ExceptionUtils.unwrapThrowable(ex);
				//SystemRuntimeException.rethrow(this.getSystemRuntime(), ex);
				throw new SystemRuntimeException(this.getSystemRuntime(), String.format("获取指定凭证[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
			}
			if(credential == null) {
				credential = EMPTY;
			}
			//放入Map中
			credentialMap.put(strConfigId, credential);
			this.getConfigListenerRepo().addConfigListener(strFullConfigId, new IConfigListener() {
				@Override
				public void receiveConfigInfo(String configInfo) {
					credentialMap.remove(strConfigId);
					if(ObjectUtils.isEmpty(configInfo)) {
						return;
					}
					Credential credential2 = toCredential(configInfo);
					credentialMap.put(strConfigId, credential2);
				}
			});
		}
		if(credential == EMPTY) {
			credential = null;
		}
		if(credential != null || bTryMode) {
			return credential;
		}
		
		throw new SystemRuntimeException(this.getSystemRuntime(), String.format("指定凭证[%1$s]不存在", strConfigId));
	}
	
	protected Credential doGetCredential(String strFullConfigId) {
		String strConfig = ServiceHub.getInstance().getConfig(strFullConfigId);
		if(ObjectUtils.isEmpty(strConfig)) {
			return null;
		}
		
		return this.toCredential(strConfig);
	}
	
	protected Credential toCredential(String strConfig) {
		Map<String, Object> map = null;
		if(strConfig.indexOf("{") == 0) {
			map = JsonUtils.asMap(strConfig);
		}
		else {
			map = YamlUtils.asMap(strConfig);
		}
		
		Credential credential = new Credential();
		credential.putAll(map);
		return credential;
	}

	@Override
	public void updateCredential(String strConfigId, Credential credential) {
		Assert.hasLength(strConfigId, "未传入配置标识");
		Assert.notNull(credential, "未传入更新凭证");
		//String strFullConfigId = String.format("%1$s%2$s", CONFIGID_CREDENTIAL_PREFIX, strConfigId);
		
	}


	@Override
	public void removeCredential(String strConfigId) {
		// TODO Auto-generated method stub
		
	}

	
	
}
