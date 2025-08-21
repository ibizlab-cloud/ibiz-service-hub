package net.ibizsys.model.control.layout;



/**
 * 布局占位模型基础对象接口
 *
 */
public interface IPSLayoutPos extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取自身水平对齐模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TextAlign}
	 * @return
	 */
	java.lang.String getHAlignSelf();
	
	
	/**
	 * 获取布局高度
	 * @return
	 */
	java.lang.Integer getHeight();
	
	
	/**
	 * 获取高度模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.HeightMode}
	 * @return
	 */
	java.lang.String getHeightMode();
	
	
	/**
	 * 获取布局模式
	 * @return
	 */
	java.lang.String getLayout();
	
	
	/**
	 * 获取下方间隔模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SpacingMode}
	 * @return
	 */
	java.lang.String getSpacingBottom();
	
	
	/**
	 * 获取左侧间隔模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SpacingMode}
	 * @return
	 */
	java.lang.String getSpacingLeft();
	
	
	/**
	 * 获取右侧间隔模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SpacingMode}
	 * @return
	 */
	java.lang.String getSpacingRight();
	
	
	/**
	 * 获取上方间隔模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SpacingMode}
	 * @return
	 */
	java.lang.String getSpacingTop();
	
	
	/**
	 * 获取自身垂直对齐模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TextVAlign}
	 * @return
	 */
	java.lang.String getVAlignSelf();
	
	
	/**
	 * 获取布局宽度
	 * @return
	 */
	java.lang.Integer getWidth();
	
	
	/**
	 * 获取宽度模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WidthMode}
	 * @return
	 */
	java.lang.String getWidthMode();
}