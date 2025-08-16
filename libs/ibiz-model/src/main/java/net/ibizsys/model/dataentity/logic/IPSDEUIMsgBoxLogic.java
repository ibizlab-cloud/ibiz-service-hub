package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑消息弹窗节点模型对象接口
 * <P>
 * 扩展父接口类型[MSGBOX]
 *
 */
public interface IPSDEUIMsgBoxLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicNode{

	
	
	/**
	 * 获取按钮集类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM1}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DELNMsgBoxButtonsType}
	 * @return
	 */
	java.lang.String getButtonsType();
	
	
	/**
	 * 获取消息内容
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM4}
	 * @return
	 */
	java.lang.String getMessage();
	
	
	/**
	 * 获取消息框参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getMsgBoxParam();


	/**
	 * 获取消息框参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getMsgBoxParamMust();
	
	
	/**
	 * 获取消息框类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM2}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DELNMsgBoxType}
	 * @return
	 */
	java.lang.String getMsgBoxType();
	
	
	/**
	 * 获取显示模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM11}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DELNMsgBoxShowMode}
	 * @return
	 */
	java.lang.String getShowMode();
	
	
	/**
	 * 获取消息抬头
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM3}
	 * @return
	 */
	java.lang.String getTitle();
}