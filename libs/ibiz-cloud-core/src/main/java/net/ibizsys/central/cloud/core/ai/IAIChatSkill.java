package net.ibizsys.central.cloud.core.ai;

import java.io.IOException;

/**
 * 聊天技能对象接口
 * @author lionlau
 *
 */
public interface IAIChatSkill {

	/**
	 * 访问用户模式：全部
	 */
	public final static String ACCESSUSERMODE_ALL = "ALL";
	
	
	/**
	 * 访问用户模式：指定用户
	 */
	public final static String ACCESSUSERMODE_USER = "USER";
	
	
	/**
	 * 访问用户模式：具备统一资源
	 */
	public final static String ACCESSUSERMODE_UNIRES = "UNIRES";
	
	
	/**
	 * 获取标识
	 * @return
	 */
	String getId();
	
	/**
	 * 获取名称
	 * @return
	 */
	String getName();
	
	
	/**
	 * 获取描述
	 * @return
	 */
	String getDescription();
	
	
	/**
	 * 获取技能提示词
	 * @return
	 */
	String getPrompt();
	
	
	/**
	 * 读取文件
	 * @param filePath
	 * @return
	 * @throws IOException
	 */
	String readFile(String filePath) throws IOException;
	
	
	/**
	 * 判断指定文件是否存在
	 * @param filePath
	 * @return
	 */
	boolean containsFile(String filePath);
	
	
	
	/**
	 * 获取访问用户模式
	 * @return
	 */
	String getAccessUserMode();
	
	
	/**
	 * 获取用户标识
	 * @return
	 */
	String getUserId();
	
	
	/**
	 * 获取统一资源标识
	 * @return
	 */
	String getUniResId();
	
	
	
	
	/**
	 * 是否为远程技能
	 * @return
	 */
	boolean isRemote();
	
	
	
	/**
	 * 获取版本
	 * @return
	 */
	String getVersion();
}
