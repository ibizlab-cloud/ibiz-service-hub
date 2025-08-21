package net.ibizsys.model.dataentity.action;



/**
 * 实体行为输入模型对象接口
 * <P>
 * 实体行为输入模型是实体行为模型的组成
 *
 */
public interface IPSDEActionInput extends net.ibizsys.model.dataentity.service.IPSDEMethodInput{

	
	
	/**
	 * 获取主键属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEField();


	/**
	 * 获取主键属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEFieldMust();
	
	
	/**
	 * 获取行为参数集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionParam> getPSDEActionParams();
	
	/**
	 * 获取行为参数集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.action.IPSDEActionParam getPSDEActionParam(Object objKey, boolean bTryMode);
	
	/**
	 * 设置行为参数集合
	 * @param list 行为参数集合
	 */
	void setPSDEActionParams(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionParam> list);
	
	
	/**
	 * 获取实体方法DTO对象
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTO getPSDEMethodDTO();


	/**
	 * 获取实体方法DTO对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTO getPSDEMethodDTOMust();
	
	
	/**
	 * 获取是否输入对象同时为结果对象
	 * @return
	 */
	boolean isOutput();
}