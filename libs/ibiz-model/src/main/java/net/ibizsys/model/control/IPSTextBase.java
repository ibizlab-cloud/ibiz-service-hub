package net.ibizsys.model.control;



/**
 * 文本部件模型基础对象接口
 *
 */
public interface IPSTextBase{

	
	
	/**
	 * 获取标题
	 * @return
	 */
	String getCaption();
	
	
	/**
	 * 获取文本水平对齐模式[HALIGN]
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TextAlign}
	 * @return
	 */
	String getHAlign();
	
	
	/**
	 * 获取绘制模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TextRenderMode}
	 * @return
	 */
	String getRenderMode();
	
	
	/**
	 * 获取文本垂直对齐模式[VALIGN]
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TextVAlign}
	 * @return
	 */
	String getVAlign();
	
	
	/**
	 * 获取换行模式[WRAPMODE]
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WrapMode}
	 * @return
	 */
	String getWrapMode();
}