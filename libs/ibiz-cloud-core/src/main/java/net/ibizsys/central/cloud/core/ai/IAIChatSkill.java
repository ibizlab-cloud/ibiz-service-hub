package net.ibizsys.central.cloud.core.ai;

import java.io.IOException;

/**
 * 聊天技能对象接口
 * @author lionlau
 *
 */
public interface IAIChatSkill {

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
	
}
