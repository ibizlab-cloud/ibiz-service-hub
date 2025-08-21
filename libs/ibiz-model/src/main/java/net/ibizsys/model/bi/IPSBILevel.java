package net.ibizsys.model.bi;



/**
 *
 */
public interface IPSBILevel extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取聚合标题
	 * @return
	 */
	java.lang.String getAggCaption();
	
	
	/**
	 * 获取层级标记
	 * @return
	 */
	java.lang.String getLevelTag();
	
	
	/**
	 * 获取层级标记2
	 * @return
	 */
	java.lang.String getLevelTag2();
	
	
	/**
	 * 获取层级类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BILevelType}
	 * @return
	 */
	java.lang.String getLevelType();
	
	
	/**
	 * 获取显示文本属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEField();


	/**
	 * 获取显示文本属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEFieldMust();
	
	
	/**
	 * 获取值属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEField();


	/**
	 * 获取值属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEFieldMust();
	
	
	/**
	 * 获取是否唯一标记成员
	 * @return
	 */
	boolean isUniqueMembers();
}