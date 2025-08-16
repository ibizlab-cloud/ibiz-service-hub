package net.ibizsys.model.app.bi;



/**
 * 应用智能立方体维度体系层级模型对象接口
 *
 */
public interface IPSAppBICubeLevel extends net.ibizsys.model.IPSModelObject{

	
	
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
	 * 获取相关应用属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField();


	/**
	 * 获取相关应用属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust();
	
	
	/**
	 * 获取文本项标识
	 * @return
	 */
	java.lang.String getTextItemName();
	
	
	/**
	 * 获取是否唯一标记成员
	 * @return
	 */
	boolean isUniqueMembers();
}