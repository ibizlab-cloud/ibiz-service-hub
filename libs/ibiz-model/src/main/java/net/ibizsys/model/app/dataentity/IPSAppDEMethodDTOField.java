package net.ibizsys.model.app.dataentity;



/**
 * 应用实体方法DTO属性对象接口
 *
 */
public interface IPSAppDEMethodDTOField extends net.ibizsys.model.IPSModelObject
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
	 * 获取应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField();


	/**
	 * 获取应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust();
	
	
	/**
	 * 获取引用应用实体的嵌套数据集
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getRefPSAppDEDataSet();


	/**
	 * 获取引用应用实体的嵌套数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getRefPSAppDEDataSetMust();
	
	
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
	 * 获取引用应用实体的连接属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getRefPickupPSAppDEField();


	/**
	 * 获取引用应用实体的连接属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getRefPickupPSAppDEFieldMust();
	
	
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
	 * 获取应用实体DTO对象属性类型
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
	
	
	/**
	 * 获取是否为List的MAP投射
	 * @return
	 */
	boolean isListMap();
}