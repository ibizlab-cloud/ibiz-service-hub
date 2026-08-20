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
	String getAttrName();
	
	
	/**
	 * 获取部件名称
	 * @return
	 */
	String getCtrlName();
	
	
	/**
	 * 获取事件参数
	 * @return
	 */
	String getEventArg();
	
	
	/**
	 * 获取事件参数2
	 * @return
	 */
	String getEventArg2();
	
	
	/**
	 * 获取事件名称
	 * @return
	 */
	String getEventNames();
	
	
	/**
	 * 获取子项名称
	 * @return
	 */
	String getItemName();
	
	
	/**
	 * 获取逻辑标记
	 * @return
	 */
	String getLogicTag();
	
	
	/**
	 * 获取逻辑标记2
	 * @return
	 */
	String getLogicTag2();
	
	
	/**
	 * 获取触发逻辑类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TargetUILogic}
	 * @return
	 */
	String getLogicType();
	
	
	/**
	 * 获取脚本代码
	 * @return
	 */
	String getScriptCode();
	
	
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
	String getTriggerType();
}