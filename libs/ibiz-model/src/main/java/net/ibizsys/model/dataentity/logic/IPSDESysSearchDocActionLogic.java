package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑全文检索文档操作节点模型对象接口
 * <P>
 * 扩展父接口类型[SYSSEARCHDOCACTION]
 *
 */
public interface IPSDESysSearchDocActionLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
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
	 * 获取检索文档
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PSSYSSEARCHDOCID}
	 * @return
	 */
	net.ibizsys.model.search.IPSSysSearchDoc getPSSysSearchDoc();


	/**
	 * 获取检索文档，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.search.IPSSysSearchDoc getPSSysSearchDocMust();
	
	
	/**
	 * 获取全文检索体系
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PSSYSSEARCHSCHEMEID}
	 * @return
	 */
	net.ibizsys.model.search.IPSSysSearchScheme getPSSysSearchScheme();


	/**
	 * 获取全文检索体系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.search.IPSSysSearchScheme getPSSysSearchSchemeMust();
	
	
	/**
	 * 获取检索文档操作
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM1}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DBTableAction}
	 * @return
	 */
	java.lang.String getSearchDocAction();
}