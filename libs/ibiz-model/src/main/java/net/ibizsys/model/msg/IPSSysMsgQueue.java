package net.ibizsys.model.msg;



/**
 * 系统消息队列模型对象接口
 *
 */
public interface IPSSysMsgQueue extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取消息内容值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getContentPSDEField();


	/**
	 * 获取消息内容值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getContentPSDEFieldMust();
	
	
	/**
	 * 获取钉钉消息内容值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getDDContentPSDEField();


	/**
	 * 获取钉钉消息内容值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getDDContentPSDEFieldMust();
	
	
	/**
	 * 获取文件值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getFilePSDEField();


	/**
	 * 获取文件值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getFilePSDEFieldMust();
	
	
	/**
	 * 获取即时消息内容值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getIMContentPSDEField();


	/**
	 * 获取即时消息内容值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getIMContentPSDEFieldMust();
	
	
	/**
	 * 获取移动端任务操作路径值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMobTaskUrlPSDEField();


	/**
	 * 获取移动端任务操作路径值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMobTaskUrlPSDEFieldMust();
	
	
	/**
	 * 获取动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getMsgQueueParams();
	
	
	/**
	 * 获取消息队列标记
	 * @return
	 */
	java.lang.String getMsgQueueTag();
	
	
	/**
	 * 获取消息队列标记2
	 * @return
	 */
	java.lang.String getMsgQueueTag2();
	
	
	/**
	 * 获取消息队列类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.MsgQueueType}
	 * @return
	 */
	java.lang.String getMsgQueueType();
	
	
	/**
	 * 获取消息类型值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMsgTypePSDEField();


	/**
	 * 获取消息类型值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getMsgTypePSDEFieldMust();
	
	
	/**
	 * 获取实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
	/**
	 * 获取后台扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后台扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
	
	
	/**
	 * 获取相关系统功能组件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysUtil getPSSysUtil();


	/**
	 * 获取相关系统功能组件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysUtil getPSSysUtilMust();
	
	
	/**
	 * 获取系统模块
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
	
	
	/**
	 * 获取短消息内容值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getSMSContentPSDEField();


	/**
	 * 获取短消息内容值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getSMSContentPSDEFieldMust();
	
	
	/**
	 * 获取消息发送时间值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getSendTimePSDEField();


	/**
	 * 获取消息发送时间值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getSendTimePSDEFieldMust();
	
	
	/**
	 * 获取消息状态值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getStatePSDEField();


	/**
	 * 获取消息状态值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getStatePSDEFieldMust();
	
	
	/**
	 * 获取消息标记2值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTag2PSDEField();


	/**
	 * 获取消息标记2值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTag2PSDEFieldMust();
	
	
	/**
	 * 获取消息标记值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTagPSDEField();


	/**
	 * 获取消息标记值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTagPSDEFieldMust();
	
	
	/**
	 * 获取目标标识值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTargetPSDEField();


	/**
	 * 获取目标标识值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTargetPSDEFieldMust();
	
	
	/**
	 * 获取目标类型值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTargetTypePSDEField();


	/**
	 * 获取目标类型值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTargetTypePSDEFieldMust();
	
	
	/**
	 * 获取任务操作路径值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTaskUrlPSDEField();


	/**
	 * 获取任务操作路径值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTaskUrlPSDEFieldMust();
	
	
	/**
	 * 获取消息标题值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTitlePSDEField();


	/**
	 * 获取消息标题值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTitlePSDEFieldMust();
	
	
	/**
	 * 获取微信消息内容值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWXContentPSDEField();


	/**
	 * 获取微信消息内容值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getWXContentPSDEFieldMust();
}