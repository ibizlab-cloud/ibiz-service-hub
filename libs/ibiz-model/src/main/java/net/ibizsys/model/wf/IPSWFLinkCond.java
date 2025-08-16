package net.ibizsys.model.wf;



/**
 * 工作流处理连接条件模型对象基础接口，标准模型{@link net.ibizsys.centralstudio.dto.PSWFLinkCondDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getCondType}
 *
 */
public interface IPSWFLinkCond extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取条件类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFLinkCondDTO#FIELD_LOGICTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFLinkCondType}
	 * @return
	 */
	java.lang.String getCondType();
}