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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSLayoutDTO#FIELD_FLEXALIGN}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.FlexAlign}
	 * @return
	 */
	java.lang.String getAlign();
	
	
	/**
	 * 获取Flex布局方向
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSLayoutDTO#FIELD_FLEXDIR}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.FlexLayoutDir}
	 * @return
	 */
	java.lang.String getDir();
	
	
	/**
	 * 获取Flex纵轴对齐方向
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSLayoutDTO#FIELD_FLEXVALIGN}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.FlexVAlign}
	 * @return
	 */
	java.lang.String getVAlign();
}