package net.ibizsys.central.cloud.devops.core.addin;

import java.util.Map;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.util.domain.System;
import net.ibizsys.central.cloud.devops.core.util.domain.CodeGenResult;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.LogLevels;

/**
 * 代码产生工具基类
 * 
 * @author lionlau
 *
 */
public abstract class DevOpsCodeGenToolBase extends CloudDevOpsUtilRTAddinBase implements IDevOpsCodeGenTool {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DevOpsCodeGenToolBase.class);

	@Override
	protected void onInit() throws Exception {

		super.onInit();
	}

	@Override
	protected boolean isPrepareConfigEntity() {
		return true;
	}

	@Override
	public CodeGenResult generateCodeSnippet(System system, IPSSystemService iPSSystemService, Map<String, Object> params) {
		try {
			if (params == null) {
				throw new Exception("未传入代码片段参数");
			}
			return this.onGenerateCodeSnippet(system, iPSSystemService, params);
		} catch (Throwable ex) {
			log.error(String.format("代码工具[%1$s]生产代码片段发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, this.getClass().getName(), String.format("代码工具[%1$s]生产代码片段发生异常，%2$s", this.getName(), ex.getMessage()), null);
			if (ex instanceof ISystemRuntimeException) {
				throw (RuntimeException) ex;
			}
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudDevOpsUtilRuntime(), String.format("代码工具[%1$s]生产代码片段发生异常，%2$s", this.getName(), ex.getMessage()), ex);
		}
	}

	protected CodeGenResult onGenerateCodeSnippet(System system, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable {
		throw new Exception("没有实现");
	}

}
