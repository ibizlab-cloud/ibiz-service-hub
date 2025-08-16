package net.ibizsys.central;

/**
 * 系统运行时设置
 * @author lionlau
 *
 */
public interface ISystemRuntimeSetting extends net.ibizsys.runtime.ISystemRuntimeSetting{

	/**
	 * 配置目录：前端应用
	 */
	final static String CONFIGFOLDER_APP = "app";
	
	/**
	 * 配置目录：系统引用
	 */
	final static String CONFIGFOLDER_SYSREF = "sysref";
	
	/**
	 * 配置目录：关系数据库体系
	 */
	final static String CONFIGFOLDER_SYSDBSCHEME = "sysdbscheme";
	
	
	/**
	 * 配置目录：大数据库体系
	 */
	final static String CONFIGFOLDER_SYSBDSCHEME = "sysbdscheme";
	
	
	/**
	 * 配置目录：系统集成代理
	 */
	final static String CONFIGFOLDER_SYSEAIAGENT = "syseaiagent";
	
	
	/**
	 * 配置目录：系统资源
	 */
	final static String CONFIGFOLDER_SYSRESOURCE = "sysresource";
	
	
	/**
	 * 配置目录：搜索体系
	 */
	final static String CONFIGFOLDER_SYSSEARCHSCHEME = "syssearchscheme";
	
	/**
	 * 配置目录：智能报表体系
	 */
	final static String CONFIGFOLDER_SYSBISCHEME = "sysbischeme";
	
	
	/**
	 * 配置目录：AI工厂
	 */
	final static String CONFIGFOLDER_SYSAIFACTORY = "sysaifactory";
	
	
	/**
	 * 配置目录：系统统一资源
	 */
	final static String CONFIGFOLDER_SYSUNISTATE = "sysunistate";
	
	
	/**
	 * 配置目录：微信账户
	 */
	final static String CONFIGFOLDER_WXACCOUNT = "wxaccount";
	
	
	
	/**
	 * 配置目录：实体映射
	 */
	final static String CONFIGFOLDER_DEMAP = "demap";
	
	
	/**
	 * 参数：启用的服务接口
	 */
	public final static String PARAM_ENABLEAPIS = "enableapis";
	
	
	
	/**
	 * 参数：默认数据库实例标记
	 */
	public final static String PARAM_DEFAULTDBINSTTAG = "defaultdbinsttag";
	
	
	/**
	 * 参数：默认大数据库实例标记
	 */
	public final static String PARAM_DEFAULTBDINSTTAG = "defaultbdinsttag";
	
	
	/**
	 * 获取实体行为代码标识格式化
	 * @return
	 */
	String getDEActionCodeNameFormat();

	
	/**
	 * 获取实体数据集代码标识格式化
	 * @return
	 */
	String getDEDataSetCodeNameFormat();
	
	
	/**
	 * DTO 属性名称统一为小写
	 * @return
	 */
	boolean isDTOFieldNameLowerCase();
	
	
	/**
	 * 获取启用的服务接口，多个使用 ; 分隔
	 * @return
	 */
	String getEnableAPIs();
	
	
	
}
