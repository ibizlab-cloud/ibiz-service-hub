package net.ibizsys.model.control.layout;



/**
 * Flex布局模型对象接口
 * <P>
 * 扩展父接口类型[FLEX]
 *
 */
public interface IPSFlexLayout extends net.ibizsys.model.control.layout.IPSLayout{

	
	
	/**
	 * 获取Flex横轴对齐方向
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.FlexAlign}
	 * @return
	 */
	String getAlign();
	
	
	/**
	 * 获取Flex布局方向
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.FlexLayoutDir}
	 * @return
	 */
	String getDir();
	
	
	/**
	 * 获取Flex纵轴对齐方向
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.FlexVAlign}
	 * @return
	 */
	String getVAlign();
}