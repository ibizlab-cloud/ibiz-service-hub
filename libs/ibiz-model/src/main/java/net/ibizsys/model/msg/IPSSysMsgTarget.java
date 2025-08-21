package net.ibizsys.model.msg;



/**
 * 系统消息目标模型对象接口
 *
 */
public interface IPSSysMsgTarget extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getMsgTargetParams();
	
	
	/**
	 * 获取消息目标标记
	 * @return
	 */
	java.lang.String getMsgTargetTag();
	
	
	/**
	 * 获取消息目标标记2
	 * @return
	 */
	java.lang.String getMsgTargetTag2();
	
	
	/**
	 * 获取消息目标类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.MsgTargetType}
	 * @return
	 */
	java.lang.String getMsgTargetType();
	
	
	/**
	 * 获取目标数据集
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取目标数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
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
}