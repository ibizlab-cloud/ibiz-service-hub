package net.ibizsys.model.app;



/**
 * 应用方法DTO对象接口
 *
 */
public interface IPSAppMethodDTO extends net.ibizsys.model.IPSModelObject
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
	java.util.List<net.ibizsys.model.app.IPSAppMethodDTOField> getPSAppMethodDTOFields();
	
	/**
	 * 获取DTO对象属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.IPSAppMethodDTOField getPSAppMethodDTOField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置DTO对象属性集合
	 * @param list DTO对象属性集合
	 */
	void setPSAppMethodDTOFields(java.util.List<net.ibizsys.model.app.IPSAppMethodDTOField> list);
	
	
	/**
	 * 获取实体方法DTO对象来源类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMethodDTOSourceType}
	 * @return
	 */
	java.lang.String getSourceType();
	
	
	/**
	 * 获取标记
	 * @return
	 */
	java.lang.String getTag();
	
	
	/**
	 * 获取标记2
	 * @return
	 */
	java.lang.String getTag2();
	
	
	/**
	 * 获取类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMethodDTOType}
	 * @return
	 */
	java.lang.String getType();
}