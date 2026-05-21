package net.ibizsys.central.cloud.core.ai;

import java.io.File;
import java.util.Map;

import net.ibizsys.model.ai.IPSSysAIChatAgent;
import net.ibizsys.runtime.IModelRuntimeContext;

/**
 * 系统AI工厂运行时上下文对象
 * @author lionlau
 *
 */
public interface ISysAIFactoryRuntimeContext extends IModelRuntimeContext, IAIFactoryRuntimeBaseContext {

	/**
	 * 获取AI工厂运行时对象
	 * @return
	 */
	default ISysAIFactoryRuntime getAIFactoryRuntime() {
		return getModelRuntime();
	}
	
	
	
	@Override
	ISysAIFactoryRuntime getModelRuntime();
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param strDefault
	 * @return
	 */
	String getParam(String strKey, String strDefault);
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param nDefault
	 * @return
	 */
	int getParam(String strKey, int nDefault);
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param nDefault
	 * @return
	 */
	long getParam(String strKey, long nDefault);
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param fDefault
	 * @return
	 */
	double getParam(String strKey, double fDefault);
	
	
	
	
	/**
	 * 获取动态配置参数
	 * @param strKey
	 * @param bDefault
	 * @return
	 */
	boolean getParam(String strKey, boolean bDefault);
	
	
	
	
	
	/**
	 * 获取指定父键的参数集合
	 * @param strPKey
	 * @param params
	 * @return
	 */
	Map<String, Object> getParams(String strPKey, Map<String, Object> params);
	
	
	
	/**
	 * 获取聊天历史消息数量
	 * @return
	 */
	int getHistoryCount();
	
	
	/**
	 * 获取默认AI平台类型
	 * @return
	 */
	String getAIPlatformType();
	
	
	/**
	 * 获取默认KB平台类型
	 * @return
	 */
	String getKBPlatformType();
	
	
	
	/**
	 * 建立AI聊天代理运行时对象
	 * @param iPSSysAIChatAgent
	 * @return
	 */
	ISysAIChatAgentRuntime createSysAIChatAgentRuntime(IPSSysAIChatAgent iPSSysAIChatAgent) throws Exception;
	
	
	
	/**
	 * 获取工作空间
	 * @return
	 */
	File getWorkspace();


	
	
	/**
	 * 获取AI聊天代理组
	 * @return
	 */
	ISysAIChatAgentGroup getAIChatAgentGroup(String groupTag) throws Exception;
	
	
	
	/**
	 * 获取AI聊天记忆组件
	 * @param tryMode
	 * @return
	 * @throws Exception
	 */
	IAIChatMemoryUtil getAIChatMemoryUtil(boolean tryMode) throws Exception;
	
	
	/**
	 * 获取AI聊天技能组件
	 * @param tryMode
	 * @return
	 * @throws Exception
	 */
	IAIChatSkillUtil getAIChatSkillUtil(boolean tryMode) throws Exception; 
	
	
	/**
	 * 获取聊天资源最大词数
	 * @return
	 */
	int getChatResourceMaxTokens();
	
	/**
	 * 获取常规记忆最大词数
	 * @return
	 */
	int getRegularMemoryMaxTokens();
	
	/**
	 * 获取常驻记忆最大词数
	 * @return
	 */
	int getResidentMemoryMaxTokens();
	
	/**
	 * 获取当日记忆最大词数
	 * @return
	 */
	int getDailyMemoryMaxTokens();
}
