package net.ibizsys.central.cloud.core.ai;

/**
 * 系统AI代理运行时脚本基类
 * @author lionlau
 *
 */
public abstract class SysAIAgentRTScriptBase extends AIAgentRTScriptBase {

	@Override
	public ISysAIAgentRuntime getOwner() {
		return (ISysAIAgentRuntime)super.getOwner();
	}
	
	/**
	 * 获取指定AI工作者代理
	 * @param tag
	 * @return
	 */
	public ISysAIWorkerAgentRuntime aiworker(String tag) {
		return this.getOwner().getAIFactoryRuntime().getAIWorkerAgentRuntime(tag, false);
	}
	
	
	
//	/**
//	 * 
//	 * @param chatTag
//	 * @param data
//	 * @return
//	 * @throws Throwable
//	 */
//	public String request(String chatTag, Object data) {
//		
//	}
}
