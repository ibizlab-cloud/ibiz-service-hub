package cn.ibizlab.central.plugin.groovy.eai;

import java.util.Map;

import net.ibizsys.central.cloud.core.eai.SysEAIAgentRuntimeBase;

/**
 * 简单应用集成代理运行时对象
 * @author lionlau
 *
 */
public class SimpleSysEAIAgentRuntime extends SysEAIAgentRuntimeBase {

	@Override
	protected void onRecv(String strTopic, String strData, Map<String, Object> map) throws Throwable {
		//重写接收数据处理
		super.onRecv(strTopic, strData, map);
	}
	
	@Override
	protected void onSend(String strTopic, String strData) throws Throwable {
		//重写发送数据
		super.onSend(strTopic, strData);
	}
}
