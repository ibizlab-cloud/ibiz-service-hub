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
	String getCodeName();
	
	
	/**
	 * 获取图片样式
	 * @return
	 */
	String getCssClass();
	
	
	/**
	 * 获取图片样式（X）
	 * @return
	 */
	String getCssClassX();
	
	
	/**
	 * 获取字体标识
	 * @return
	 */
	String getGlyph();
	
	
	/**
	 * 获取图片宽度
	 * @return
	 */
	int getHeight();
	
	
	/**
	 * 获取图片路径
	 * @return
	 */
	String getImagePath();
	
	
	/**
	 * 获取图片路径（X）
	 * @return
	 */
	String getImagePathX();
	
	
	/**
	 * 获取直接内容
	 * @return
	 */
	String getRawContent();
	
	
	/**
	 * 获取图片宽度
	 * @return
	 */
	int getWidth();
}