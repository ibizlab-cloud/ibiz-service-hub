package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑组成员模型对象接口
 *
 */
public interface IPSDEUILogicGroupDetail extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取注入属性名称
	 * @return
	 */
	java.lang.String getAttrName();
	
	
	/**
	 * 获取部件名称
	 * @return
	 */
	java.lang.String getCtrlName();
	
	
	/**
	 * 获取事件参数
	 * @return
	 */
	java.lang.String getEventArg();
	
	
	/**
	 * 获取事件参数2
	 * @return
	 */
	java.lang.String getEventArg2();
	
	
	/**
	 * 获取事件名称
	 * @return
	 */
	java.lang.String getEventNames();
	
	
	/**
	 * 获取子项名称
	 * @return
	 */
	java.lang.String getItemName();
	
	
	/**
	 * 获取逻辑标记
	 * @return
	 */
	java.lang.String getLogicTag();
	
	
	/**
	 * 获取逻辑标记2
	 * @return
	 */
	java.lang.String getLogicTag2();
	
	
	/**
	 * 获取触发逻辑类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TargetUILogic}
	 * @return
	 */
	java.lang.String getLogicType();
	
	
	/**
	 * 获取脚本代码
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取定时间隔（ms）
	 * @return
	 */
	int getTimer();
	
	
	/**
	 * 获取触发器类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UILogicTriggerType}
	 * @return
	 */
	java.lang.String getTriggerType();
}