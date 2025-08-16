package net.ibizsys.model.app;



/**
 * 应用方法DTO属性对象接口
 *
 */
public interface IPSAppMethodDTOField extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取Json格式化
	 * @return
	 */
	java.lang.String getJsonFormat();
	
	
	/**
	 * 获取中文名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取引用应用实体方法DTO对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO getRefPSAppDEMethodDTO();


	/**
	 * 获取引用应用实体方法DTO对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO getRefPSAppDEMethodDTOMust();
	
	
	/**
	 * 获取引用应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getRefPSAppDataEntity();


	/**
	 * 获取引用应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getRefPSAppDataEntityMust();
	
	
	/**
	 * 获取引用应用方法DTO对象
	 * @return
	 */
	net.ibizsys.model.app.IPSAppMethodDTO getRefPSAppMethodDTO();


	/**
	 * 获取引用应用方法DTO对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.IPSAppMethodDTO getRefPSAppMethodDTOMust();
	
	
	/**
	 * 获取DTO属性来源类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMethodDTOFieldSourceType}
	 * @return
	 */
	java.lang.String getSourceType();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取应用DTO对象属性类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMethodDTOFieldType}
	 * @return
	 */
	java.lang.String getType();
	
	
	/**
	 * 获取是否允许空输入
	 * @return
	 */
	boolean isAllowEmpty();
}