package net.ibizsys.model.wf;



/**
 * 工作流交互处理模型对象接口
 * <P>
 * 扩展父接口类型[INTERACTIVE]
 *
 */
public interface IPSWFInteractiveProcess extends net.ibizsys.model.wf.IPSWFProcess{

	
	
	/**
	 * 获取编辑相关属性
	 * @return
	 */
	java.util.List<java.lang.String> getEditFields();
	
	
	/**
	 * 获取编辑模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFProcessEditMode}
	 * @return
	 */
	int getEditMode();
	
	
	/**
	 * 获取操作表单标记
	 * @return
	 */
	String getFormCodeName();
	
	
	/**
	 * 获取操作表单名称
	 * @return
	 */
	String getFormName();
	
	
	/**
	 * 获取处理意见字段
	 * @return
	 */
	String getMemoField();
	
	
	/**
	 * 获取移动端操作表单标记
	 * @return
	 */
	String getMobFormCodeName();
	
	
	/**
	 * 获取移动端操作表单名称
	 * @return
	 */
	String getMobFormName();
	
	
	/**
	 * 获取移动端附加界面行为组标记
	 * @return
	 */
	String getMobUAGroupCodeName();
	
	
	/**
	 * 获取移动端功能2操作表单标记
	 * @return
	 */
	String getMobUtil2FormCodeName();
	
	
	/**
	 * 获取移动端功能2操作表单名称
	 * @return
	 */
	String getMobUtil2FormName();
	
	
	/**
	 * 获取移动端功能3操作表单标记
	 * @return
	 */
	String getMobUtil3FormCodeName();
	
	
	/**
	 * 获取移动端功能3操作表单名称
	 * @return
	 */
	String getMobUtil3FormName();
	
	
	/**
	 * 获取移动端功能4操作表单标记
	 * @return
	 */
	String getMobUtil4FormCodeName();
	
	
	/**
	 * 获取移动端功能4操作表单名称
	 * @return
	 */
	String getMobUtil4FormName();
	
	
	/**
	 * 获取移动端功能5操作表单标记
	 * @return
	 */
	String getMobUtil5FormCodeName();
	
	
	/**
	 * 获取移动端功能5操作表单名称
	 * @return
	 */
	String getMobUtil5FormName();
	
	
	/**
	 * 获取移动端功能操作表单标记
	 * @return
	 */
	String getMobUtilFormCodeName();
	
	
	/**
	 * 获取移动端功能操作表单名称
	 * @return
	 */
	String getMobUtilFormName();
	
	
	/**
	 * 获取发送通知类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.InfomMsgType}
	 * @return
	 */
	int getMsgType();
	
	
	/**
	 * 获取多实例模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFProcMultiInstMode}
	 * @return
	 */
	String getMultiInstMode();
	
	
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
	 * 获取交互处理角色集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wf.IPSWFProcessRole> getPSWFProcessRoles();
	
	/**
	 * 获取交互处理角色集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wf.IPSWFProcessRole getPSWFProcessRole(Object objKey, boolean bTryMode);
	
	/**
	 * 设置交互处理角色集合
	 * @param list 交互处理角色集合
	 */
	void setPSWFProcessRoles(java.util.List<net.ibizsys.model.wf.IPSWFProcessRole> list);
	
	
	/**
	 * 获取预定义行为
	 * @return
	 */
	java.util.List<java.lang.String> getPredefinedActions();
	
	
	/**
	 * 获取附加界面行为组标记
	 * @return
	 */
	String getUAGroupCodeName();
	
	
	/**
	 * 获取功能2操作表单标记
	 * @return
	 */
	String getUtil2FormCodeName();
	
	
	/**
	 * 获取功能2操作表单名称
	 * @return
	 */
	String getUtil2FormName();
	
	
	/**
	 * 获取功能3操作表单标记
	 * @return
	 */
	String getUtil3FormCodeName();
	
	
	/**
	 * 获取功能3操作表单名称
	 * @return
	 */
	String getUtil3FormName();
	
	
	/**
	 * 获取功能4操作表单标记
	 * @return
	 */
	String getUtil4FormCodeName();
	
	
	/**
	 * 获取功能4操作表单名称
	 * @return
	 */
	String getUtil4FormName();
	
	
	/**
	 * 获取功能5操作表单标记
	 * @return
	 */
	String getUtil5FormCodeName();
	
	
	/**
	 * 获取功能5操作表单名称
	 * @return
	 */
	String getUtil5FormName();
	
	
	/**
	 * 获取功能操作表单标记
	 * @return
	 */
	String getUtilFormCodeName();
	
	
	/**
	 * 获取功能操作表单名称
	 * @return
	 */
	String getUtilFormName();
	
	
	/**
	 * 获取是否支持编辑
	 * @return
	 */
	boolean isEditable();
	
	
	/**
	 * 获取是否发送通知
	 * @return
	 */
	boolean isSendInform();
}