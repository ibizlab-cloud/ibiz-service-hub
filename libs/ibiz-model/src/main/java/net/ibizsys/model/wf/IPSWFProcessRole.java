package net.ibizsys.model.wf;



/**
 * 工作流处理节点角色模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSWFProcRoleDTO}运行时对象
 *
 */
public interface IPSWFProcessRole extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取通知消息模板
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcRoleDTO#FIELD_PSSYSMSGTEMPLID}
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTempl();


	/**
	 * 获取通知消息模板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTemplMust();
	
	
	/**
	 * 获取流程角色对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcRoleDTO#FIELD_PSWFROLEID}
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFRole getPSWFRole();


	/**
	 * 获取流程角色对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFRole getPSWFRoleMust();
	
	
	/**
	 * 获取数据对象属性名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcRoleDTO#FIELD_UDFIELDS}
	 * @return
	 */
	java.lang.String getUDField();
	
	
	/**
	 * 获取处理角色数据
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcRoleDTO#FIELD_USERDATA}
	 * @return
	 */
	java.lang.String getUserData();
	
	
	/**
	 * 获取处理角色数据2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcRoleDTO#FIELD_USERDATA2}
	 * @return
	 */
	java.lang.String getUserData2();
	
	
	/**
	 * 获取流程处理角色类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcRoleDTO#FIELD_ROLETYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFProcRoleType}
	 * @return
	 */
	java.lang.String getWFProcessRoleType();
	
	
	/**
	 * 获取是否仅抄送模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcRoleDTO#FIELD_CCMODE}
	 * @return
	 */
	boolean isCCMode();
}