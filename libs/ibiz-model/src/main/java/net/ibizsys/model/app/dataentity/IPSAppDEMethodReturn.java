package net.ibizsys.model.app.dataentity;



/**
 * 应用实体方法方法模型基础对象接口
 *
 */
public interface IPSAppDEMethodReturn extends net.ibizsys.model.dataentity.service.IPSDEMethodReturn{

	
	
	/**
	 * 获取返回DTO对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO getPSAppDEMethodDTO();


	/**
	 * 获取返回DTO对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO getPSAppDEMethodDTOMust();
	
	
	/**
	 * 获取简单值类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取返回类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMethodReturnType}
	 * @return
	 */
	java.lang.String getType();
}