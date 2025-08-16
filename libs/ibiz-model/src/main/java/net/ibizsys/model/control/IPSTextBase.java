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
	java.lang.String getCaption();
	
	
	/**
	 * 获取文本水平对齐模式[HALIGN]
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TextAlign}
	 * @return
	 */
	java.lang.String getHAlign();
	
	
	/**
	 * 获取绘制模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TextRenderMode}
	 * @return
	 */
	java.lang.String getRenderMode();
	
	
	/**
	 * 获取文本垂直对齐模式[VALIGN]
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TextVAlign}
	 * @return
	 */
	java.lang.String getVAlign();
	
	
	/**
	 * 获取换行模式[WRAPMODE]
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WrapMode}
	 * @return
	 */
	java.lang.String getWrapMode();
}