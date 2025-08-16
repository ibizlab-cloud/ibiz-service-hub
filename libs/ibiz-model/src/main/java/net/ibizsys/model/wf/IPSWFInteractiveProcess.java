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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_EDITFLAG}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFProcessEditMode}
	 * @return
	 */
	int getEditMode();
	
	
	/**
	 * 获取操作表单标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_FORMCODENAME}
	 * @return
	 */
	java.lang.String getFormCodeName();
	
	
	/**
	 * 获取操作表单名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_PSDEFORMNAME}
	 * @return
	 */
	java.lang.String getFormName();
	
	
	/**
	 * 获取处理意见字段
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MEMOFIELD}
	 * @return
	 */
	java.lang.String getMemoField();
	
	
	/**
	 * 获取移动端操作表单标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MOBFORMCODENAME}
	 * @return
	 */
	java.lang.String getMobFormCodeName();
	
	
	/**
	 * 获取移动端操作表单名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MOBPSDEFORMNAME}
	 * @return
	 */
	java.lang.String getMobFormName();
	
	
	/**
	 * 获取移动端附加界面行为组标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MOBUAGROUPCODENAME}
	 * @return
	 */
	java.lang.String getMobUAGroupCodeName();
	
	
	/**
	 * 获取移动端功能2操作表单标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MOBUTIL2FORMCODENAME}
	 * @return
	 */
	java.lang.String getMobUtil2FormCodeName();
	
	
	/**
	 * 获取移动端功能2操作表单名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MOBUTIL2PSDEFORMNAME}
	 * @return
	 */
	java.lang.String getMobUtil2FormName();
	
	
	/**
	 * 获取移动端功能3操作表单标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MOBUTIL3FORMCODENAME}
	 * @return
	 */
	java.lang.String getMobUtil3FormCodeName();
	
	
	/**
	 * 获取移动端功能3操作表单名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MOBUTIL3PSDEFORMNAME}
	 * @return
	 */
	java.lang.String getMobUtil3FormName();
	
	
	/**
	 * 获取移动端功能4操作表单标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MOBUTIL4FORMCODENAME}
	 * @return
	 */
	java.lang.String getMobUtil4FormCodeName();
	
	
	/**
	 * 获取移动端功能4操作表单名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MOBUTIL4PSDEFORMNAME}
	 * @return
	 */
	java.lang.String getMobUtil4FormName();
	
	
	/**
	 * 获取移动端功能5操作表单标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MOBUTIL5FORMCODENAME}
	 * @return
	 */
	java.lang.String getMobUtil5FormCodeName();
	
	
	/**
	 * 获取移动端功能5操作表单名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MOBUTIL5PSDEFORMNAME}
	 * @return
	 */
	java.lang.String getMobUtil5FormName();
	
	
	/**
	 * 获取移动端功能操作表单标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MOBUTILFORMCODENAME}
	 * @return
	 */
	java.lang.String getMobUtilFormCodeName();
	
	
	/**
	 * 获取移动端功能操作表单名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MOBUTILPSDEFORMNAME}
	 * @return
	 */
	java.lang.String getMobUtilFormName();
	
	
	/**
	 * 获取发送通知类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MSGTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.InfomMsgType}
	 * @return
	 */
	int getMsgType();
	
	
	/**
	 * 获取多实例模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MULTIINSTMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFProcMultiInstMode}
	 * @return
	 */
	java.lang.String getMultiInstMode();
	
	
	/**
	 * 获取实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_PSDEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_UAGROUPCODENAME}
	 * @return
	 */
	java.lang.String getUAGroupCodeName();
	
	
	/**
	 * 获取功能2操作表单标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_UTIL2FORMCODENAME}
	 * @return
	 */
	java.lang.String getUtil2FormCodeName();
	
	
	/**
	 * 获取功能2操作表单名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_UTIL2PSDEFORMNAME}
	 * @return
	 */
	java.lang.String getUtil2FormName();
	
	
	/**
	 * 获取功能3操作表单标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_UTIL3FORMCODENAME}
	 * @return
	 */
	java.lang.String getUtil3FormCodeName();
	
	
	/**
	 * 获取功能3操作表单名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_UTIL3PSDEFORMNAME}
	 * @return
	 */
	java.lang.String getUtil3FormName();
	
	
	/**
	 * 获取功能4操作表单标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_UTIL4FORMCODENAME}
	 * @return
	 */
	java.lang.String getUtil4FormCodeName();
	
	
	/**
	 * 获取功能4操作表单名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_UTIL4PSDEFORMNAME}
	 * @return
	 */
	java.lang.String getUtil4FormName();
	
	
	/**
	 * 获取功能5操作表单标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_UTIL5FORMCODENAME}
	 * @return
	 */
	java.lang.String getUtil5FormCodeName();
	
	
	/**
	 * 获取功能5操作表单名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_UTIL5PSDEFORMNAME}
	 * @return
	 */
	java.lang.String getUtil5FormName();
	
	
	/**
	 * 获取功能操作表单标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_UTILFORMCODENAME}
	 * @return
	 */
	java.lang.String getUtilFormCodeName();
	
	
	/**
	 * 获取功能操作表单名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_UTILPSDEFORMNAME}
	 * @return
	 */
	java.lang.String getUtilFormName();
	
	
	/**
	 * 获取是否支持编辑
	 * @return
	 */
	boolean isEditable();
	
	
	/**
	 * 获取是否发送通知
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_SENDINFORM}
	 * @return
	 */
	boolean isSendInform();
}