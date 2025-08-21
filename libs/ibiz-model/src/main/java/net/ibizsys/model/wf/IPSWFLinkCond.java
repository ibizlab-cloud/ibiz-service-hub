package net.ibizsys.model.wf;



/**
 * 工作流处理连接条件模型对象基础接口
 *
 */
public interface IPSWFLinkCond extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取条件类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFLinkCondType}
	 * @return
	 */
	java.lang.String getCondType();
}