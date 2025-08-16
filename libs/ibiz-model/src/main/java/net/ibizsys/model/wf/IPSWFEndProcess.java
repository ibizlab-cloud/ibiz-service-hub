package net.ibizsys.model.wf;



/**
 * 工作流结束处理模型对象接口
 * <P>
 * 扩展父接口类型[END]
 *
 */
public interface IPSWFEndProcess extends net.ibizsys.model.wf.IPSWFProcess{

	
	
	/**
	 * 获取结束状态值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO#FIELD_EXITSTATEVALUE}
	 * @return
	 */
	java.lang.String getExitStateValue();
}