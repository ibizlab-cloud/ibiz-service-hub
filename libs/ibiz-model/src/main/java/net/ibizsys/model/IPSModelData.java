package net.ibizsys.model;



public interface IPSModelData extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 模型内容
	 * @return
	 */
	java.lang.String getContent();
	
	
	/**
	 * 模型逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 模型标记
	 * @return
	 */
	java.lang.String getModelTag();
	
	
	/**
	 * 模型标记2
	 * @return
	 */
	java.lang.String getModelTag2();
	
	
	/**
	 * 实际模型标识
	 * @return
	 */
	java.lang.String getRealModelId();
	
	
	/**
	 * 实际模型子类型
	 * @return
	 */
	java.lang.String getRealModelSubType();
	
	
	/**
	 * 实际模型类型
	 * @return
	 */
	java.lang.String getRealModelType();
}