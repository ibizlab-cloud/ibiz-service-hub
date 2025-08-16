package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑组成员模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGrpDetailDTO}运行时对象
 *
 */
public interface IPSDEUILogicGroupDetail extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取注入属性名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGrpDetailDTO#FIELD_ATTRNAME}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGrpDetailDTO#FIELD_EVENTARG}
	 * @return
	 */
	java.lang.String getEventArg();
	
	
	/**
	 * 获取事件参数2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGrpDetailDTO#FIELD_EVENTARG2}
	 * @return
	 */
	java.lang.String getEventArg2();
	
	
	/**
	 * 获取事件名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGrpDetailDTO#FIELD_EVENTNAMES}
	 * @return
	 */
	java.lang.String getEventNames();
	
	
	/**
	 * 获取子项名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGrpDetailDTO#FIELD_ITEMNAME}
	 * @return
	 */
	java.lang.String getItemName();
	
	
	/**
	 * 获取逻辑标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGrpDetailDTO#FIELD_LOGICPARAM}
	 * @return
	 */
	java.lang.String getLogicTag();
	
	
	/**
	 * 获取逻辑标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGrpDetailDTO#FIELD_LOGICPARAM2}
	 * @return
	 */
	java.lang.String getLogicTag2();
	
	
	/**
	 * 获取触发逻辑类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGrpDetailDTO#FIELD_DSTLOGICTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TargetUILogic}
	 * @return
	 */
	java.lang.String getLogicType();
	
	
	/**
	 * 获取脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGrpDetailDTO#FIELD_CUSTOMCODE}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGrpDetailDTO#FIELD_TRIGGERTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UILogicTriggerType}
	 * @return
	 */
	java.lang.String getTriggerType();
}