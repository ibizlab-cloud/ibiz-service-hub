package net.ibizsys.model.wf;



/**
 * 工作流启动处理节点模型对象接口
 * <P>
 * 扩展父接口类型[START]
 *
 */
public interface IPSWFStartProcess extends net.ibizsys.model.wf.IPSWFProcess{

	
	
	/**
	 * 获取操作表单标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_FORMCODENAME}
	 * @return
	 */
	java.lang.String getFormCodeName();
	
	
	/**
	 * 获取移动端操作表单标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MOBFORMCODENAME}
	 * @return
	 */
	java.lang.String getMobFormCodeName();
	
	
	/**
	 * 获取移动端启动视图代码标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MOBVIEWCODENAME}
	 * @return
	 */
	java.lang.String getMobStartViewCodeName();
	
	
	/**
	 * 获取移动端启动视图名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_MOBPSDEVIEWNAME}
	 * @return
	 */
	java.lang.String getMobStartViewName();
	
	
	/**
	 * 获取启动视图代码标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_VIEWCODENAME}
	 * @return
	 */
	java.lang.String getStartViewCodeName();
	
	
	/**
	 * 获取启动视图名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_PSDEVIEWBASENAME}
	 * @return
	 */
	java.lang.String getStartViewName();
}