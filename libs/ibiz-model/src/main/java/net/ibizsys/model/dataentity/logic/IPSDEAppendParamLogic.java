package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑附加逻辑参数节点模型对象接口
 * <P>
 * 扩展父接口类型[APPENDPARAM]
 *
 */
public interface IPSDEAppendParamLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取目标列表参数起始位置
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTINDEX}
	 * @return
	 */
	int getDstIndex();
	
	
	/**
	 * 获取目标逻辑参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParam();


	/**
	 * 获取目标逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParamMust();
	
	
	/**
	 * 获取源属性名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_CUSTOMSRCPARAM}
	 * @return
	 */
	java.lang.String getSrcFieldName();
	
	
	/**
	 * 获取源列表参数起始位置
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_SRCINDEX}
	 * @return
	 */
	int getSrcIndex();
	
	
	/**
	 * 获取源逻辑参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_SRCPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getSrcPSDELogicParam();


	/**
	 * 获取源逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getSrcPSDELogicParamMust();
	
	
	/**
	 * 获取源列表参数大小
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_SRCSIZE}
	 * @return
	 */
	int getSrcSize();
}