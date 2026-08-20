package net.ibizsys.central.cloud.core.ai;

import java.io.File;
import java.util.Map;

public interface ISysAIChatSkill extends IAIChatSkill {

	/**
	 * 技能根文件
	 */
	public static String SKILLFILE = "SKILL.md";
	
	/**
	 * 元数据文件
	 */
	public static String METADATAFILE = "METADATA.yaml";
	
	
	/**
	 * 参考资料
	 */
	public static String REFERENCEFILE_PREFIX = "references/";
	
	/**
	 * 脚本文件
	 */
	public static String SCRIPTFILE_PREFIX = "scripts/";
	
	
	/**
	 * 初始化
	 * @param iSysAIFactoryRuntimeContext
	 * @param skillFolder
	 * @throws Exception
	 */
	void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, Object skillData) throws Exception;
	
	
	/**
	 * 初始化
	 * @param iSysAIFactoryRuntimeContext
	 * @param skillFolder
	 * @param inherit
	 * @param bExtendedSkill 是否为扩展技能
	 * @throws Exception
	 */
	void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, Object skillData, ISysAIChatSkill inherit, boolean bExtended) throws Exception;
	

//	/**
//	 * 通过文件后缀查找相应的技能文件
//	 * @param extensions
//	 * @return
//	 * @throws Exception
//	 */
//	Map<String, File> findFilesByExtensions(String[] extensions) throws Exception;
//	
	
	
	/**
	 * 获取继承Skill
	 * @return
	 */
	ISysAIChatSkill getInheritSkill();
	
	
	
	/**
	 * 获取技能所在目录
	 * @return
	 */
	File getSkillFolder();
	
	
	/**
	 * 获取技能数据
	 * @return
	 */
	Object getSkillData();
	
	
	
	/**
	 * 是否为扩展技能
	 * @return
	 */
	boolean isExtended();
	
	
	/**
	 * 获取扩展数据
	 * @return
	 */
	Map<String, String> getExtendedData();
	
	
	/**
	 * 获取扩展脚本文件
	 * @return
	 */
	Map<String, String> getExtendedScripts();
	
//	/**
//	 * 重新刷新
//	 */
//	void reload();
}
