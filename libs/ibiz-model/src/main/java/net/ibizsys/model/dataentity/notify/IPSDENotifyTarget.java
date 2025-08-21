package net.ibizsys.model.dataentity.notify;



/**
 * 实体通知目标模型对象接口
 *
 */
public interface IPSDENotifyTarget extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取目标数据
	 * @return
	 */
	java.lang.String getData();
	
	
	/**
	 * 获取系统消息目标过滤项
	 * @return
	 */
	java.lang.String getFilter();
	
	
	/**
	 * 获取系统消息目标
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTarget getPSSysMsgTarget();


	/**
	 * 获取系统消息目标，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTarget getPSSysMsgTargetMust();
	
	
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
	 * 获取目标类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DENotifyTargetType}
	 * @return
	 */
	java.lang.String getTargetType();
	
	
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