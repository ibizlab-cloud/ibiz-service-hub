package net.ibizsys.central.cloud.core.ai;

import java.io.File;
import java.util.List;

public interface IAIChatSkillUtil {
 
	/**
	 * 列出全部技能
	 * @return
	 */
	List<File> listSkills() throws Exception;
	
	/**
	 * 写入技能文件
	 * @param skillId
	 * @param filePath
	 * @param content
	 * @throws Exception
	 */
	void writeFile(String skillId, String filePath, String content) throws Exception;
	
	/**
	 * 读取技能文件
	 * @param skillId
	 * @param filePath
	 */
	String readFile(String skillId, String filePath) throws Exception;
	
	/**
	 * 删除技能文件
	 * @param skillId
	 * @param filePath
	 * @throws Exception
	 */
	void deleteFile(String skillId, String filePath) throws Exception;
	
	
	/**
	 * 是否支持操作指定文件
	 * @param skillId
	 * @param filePath
	 * @return
	 */
	boolean supportFile(String skillId, String filePath);
}
