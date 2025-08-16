package net.ibizsys.model.wf;



/**
 * 工作流处理节点子流程参数模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSWFProcSubWFDTO}运行时对象
 *
 */
public interface IPSWFProcessSubWF extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取嵌套流程实体数据集
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcSubWFDTO#FIELD_EMBEDPSDEDSID}
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取嵌套流程实体数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
	/**
	 * 获取嵌套流程实体
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcSubWFDTO#FIELD_EMBEDPSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取嵌套流程实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
	/**
	 * 获取嵌套流程版本
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcSubWFDTO#FIELD_EMBEDPSWFVERID}
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFVersion getPSWFVersion();


	/**
	 * 获取嵌套流程版本，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFVersion getPSWFVersionMust();
	
	
	/**
	 * 获取嵌套流程
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFProcSubWFDTO#FIELD_EMBEDPSWFID}
	 * @return
	 */
	net.ibizsys.model.wf.IPSWorkflow getPSWorkflow();


	/**
	 * 获取嵌套流程，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.wf.IPSWorkflow getPSWorkflowMust();
}