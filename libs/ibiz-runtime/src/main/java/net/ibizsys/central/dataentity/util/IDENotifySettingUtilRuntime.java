package net.ibizsys.central.dataentity.util;

import java.util.Map;
import java.util.Set;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.IEntity;

/**
 * 实体通知设置功能组件运行时对象
 * @author lionlau
 *
 */
public interface IDENotifySettingUtilRuntime extends IDEUtilRuntime {

	
	/**
	 * 预定义数据集：当前用户
	 */
	public final static String PREDEFINEDDATASET_SETTING = "SETTING";
	
	/**
	 * 预定义属性：设置模式，长文本
	 */
	public final static String PREDEFINEDFIELD_SETTING_MODEL = "SETTING_MODEL";
	
	/**
	 * 预定义属性：所有者类型
	 */
	public final static String PREDEFINEDFIELD_OWNER_TYPE = "OWNER_TYPE";
	
	/**
	 * 预定义属性：所有者标识
	 */
	public final static String PREDEFINEDFIELD_OWNER_ID = "OWNER_ID";
	
	/**
	 * 预定义属性：系统标记
	 */
	public final static String PREDEFINEDFIELD_SYSTEM_TAG = "SYSTEM_TAG";
	
	
	
	/**
	 * 所有者类型：个人。所有者标识指定人员标识
	 */
	public final static String OWNER_TYPE_PERSONAL = "PERSONAL";
	
	
	/**
	 * 所有者类型：系统
	 */
	public final static String OWNER_TYPE_SYSTEM = "SYSTEM";
	
	
	/**
	 * 模型属性：通知标记
	 */
	public final static String MODEL_FIELD_NOTIFY_TAG = "id";
	
	/**
	 * 模型属性：消息类型
	 */
	public final static String MODEL_FIELD_MSG_TYPE = "msg_type";
	
	
	
	/**
	 * 获取设置数据实体运行时
	 * @return
	 */
	IDataEntityRuntime getSettingDataEntityRuntime();
	
	
	/**
	 * 填充通知设置
	 * @param iEntity
	 * @param strNotifyTag
	 * @param nMsgType
	 * @param map
	 */
	Map<String, Integer> getSettings(IEntity iEntity, String strNotifyTag, int nMsgType, Set<String> personIdSet);
}
