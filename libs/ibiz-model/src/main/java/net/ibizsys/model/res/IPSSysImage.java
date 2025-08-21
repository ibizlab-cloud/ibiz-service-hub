package net.ibizsys.model.res;



/**
 * 系统图片模型对象接口
 *
 */
public interface IPSSysImage extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取图片样式
	 * @return
	 */
	java.lang.String getCssClass();
	
	
	/**
	 * 获取图片样式（X）
	 * @return
	 */
	java.lang.String getCssClassX();
	
	
	/**
	 * 获取字体标识
	 * @return
	 */
	java.lang.String getGlyph();
	
	
	/**
	 * 获取图片宽度
	 * @return
	 */
	int getHeight();
	
	
	/**
	 * 获取图片路径
	 * @return
	 */
	java.lang.String getImagePath();
	
	
	/**
	 * 获取图片路径（X）
	 * @return
	 */
	java.lang.String getImagePathX();
	
	
	/**
	 * 获取直接内容
	 * @return
	 */
	java.lang.String getRawContent();
	
	
	/**
	 * 获取图片宽度
	 * @return
	 */
	int getWidth();
}