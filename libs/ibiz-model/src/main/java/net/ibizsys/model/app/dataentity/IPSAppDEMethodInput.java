package net.ibizsys.model.app.dataentity;



/**
 * 应用实体方法输入模型对象接口
 *
 */
public interface IPSAppDEMethodInput extends net.ibizsys.model.dataentity.service.IPSDEMethodInput{

	
	
	/**
	 * 获取输入主键属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getKeyPSAppDEField();


	/**
	 * 获取输入主键属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getKeyPSAppDEFieldMust();
	
	
	/**
	 * 获取输入DTO对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO getPSAppDEMethodDTO();


	/**
	 * 获取输入DTO对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO getPSAppDEMethodDTOMust();
	
	
	/**
	 * 获取输入类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMethodInputType}
	 * @return
	 */
	java.lang.String getType();
	
	
	/**
	 * 获取是否同时为结果输出
	 * @return
	 */
	boolean isOutput();
}