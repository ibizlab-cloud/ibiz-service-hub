package net.ibizsys.model.app.dataentity;



/**
 * 应用实体方法DTO对象接口
 *
 */
public interface IPSAppDEMethodDTO extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.app.dataentity.IPSAppDataEntityObject
		,net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取DTO对象属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMethodDTOField> getPSAppDEMethodDTOFields();
	
	/**
	 * 获取DTO对象属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethodDTOField getPSAppDEMethodDTOField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置DTO对象属性集合
	 * @param list DTO对象属性集合
	 */
	void setPSAppDEMethodDTOFields(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMethodDTOField> list);
	
	
	/**
	 * 获取引用应用实体DTO
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO getRefPSAppDEMethodDTO();


	/**
	 * 获取引用应用实体DTO，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO getRefPSAppDEMethodDTOMust();
	
	
	/**
	 * 获取引用应用实体
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getRefPSAppDataEntity();


	/**
	 * 获取引用应用实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getRefPSAppDataEntityMust();
	
	
	/**
	 * 获取实体方法DTO对象来源类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMethodDTOSourceType}
	 * @return
	 */
	java.lang.String getSourceType();
	
	
	/**
	 * 获取源应用DTO
	 * @return
	 */
	net.ibizsys.model.app.IPSAppMethodDTO getSrcPSAppMethodDTO();


	/**
	 * 获取源应用DTO，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.IPSAppMethodDTO getSrcPSAppMethodDTOMust();
	
	
	/**
	 * 获取类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMethodDTOType}
	 * @return
	 */
	java.lang.String getType();
}