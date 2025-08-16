package net.ibizsys.central.cloud.core.cloudutil;

import net.ibizsys.central.cloud.core.util.domain.CodeList;
import net.ibizsys.central.cloud.core.util.domain.Config;

/**
 * 云体系配置功能组件接口
 * @author lionlau
 *
 */
public interface ICloudConfUtilRuntime extends ICloudUtilRuntime{

	/**
	 * 预置代码表：系统操作者
	 */
	public final static String CODELIST_SYSOPERATOR = "SYSOPERATOR";
	
	
	/**
	 * 获取配置值
	 * @param strConfigType
	 * @param strTargetType
	 * @param bTryMode 尝试模式
	 * @return
	 */
	Config getConfig(String strConfigType, String strTargetType, boolean bTryMode);
	
	/**
	 * 保存配置值
	 * @param strConfigType
	 * @param strTargetType
	 * @param objConfig 配置数据
	 * @return
	 */
	Config saveConfig(String strConfigType, String strTargetType, Object objConfig);
	
	
	/**
	 * 获取配置值
	 * @param strConfigType
	 * @param strTargetType
	 * @param bTryMode 尝试模式
	 * @param bTryGlobal 尝试全局
	 * @return
	 */
	Config getConfig(String strConfigType, String strTargetType, boolean bTryMode, boolean bTryGlobal);
	
	/**
	 * 保存配置值
	 * @param strConfigType
	 * @param strTargetType
	 * @param objConfig 配置数据
	 * @param bAsGlobal 同时存储为全局模式
	 * @return
	 */
	Config saveConfig(String strConfigType, String strTargetType, Object objConfig, boolean bAsGlobal);
	
	
	/**
	 * 移除配置
	 * @param strConfigType
	 * @param strTargetType
	 */
	void removeConfig(String strConfigType, String strTargetType);
	
	
	
	/**
	 * 获取代码表对象
	 * @param strCodeListTag
	 * @param bTryMode 尝试模式
	 * @return
	 */
	CodeList getCodeList(String strCodeListTag, boolean bTryMode);

	/**
	 * 获取代码表对象(最大项数量)
	 * @param strCodeListTag
	 * @param bTryMode 尝试模式
	 * @param maxSize 最大项数量
	 * @return
	 */
	CodeList getCodeList(String strCodeListTag, boolean bTryMode, Integer maxSize);
}



