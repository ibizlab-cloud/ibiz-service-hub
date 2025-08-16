package net.ibizsys.model.res;



/**
 * 系统图片模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysImageDTO}运行时对象
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysImageDTO#FIELD_CSSCLASS}
	 * @return
	 */
	java.lang.String getCssClass();
	
	
	/**
	 * 获取图片样式（X）
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysImageDTO#FIELD_CSSCLASSX}
	 * @return
	 */
	java.lang.String getCssClassX();
	
	
	/**
	 * 获取字体标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysImageDTO#FIELD_GLYPH}
	 * @return
	 */
	java.lang.String getGlyph();
	
	
	/**
	 * 获取图片宽度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysImageDTO#FIELD_HEIGHT}
	 * @return
	 */
	int getHeight();
	
	
	/**
	 * 获取图片路径
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysImageDTO#FIELD_IMAGEPATH}
	 * @return
	 */
	java.lang.String getImagePath();
	
	
	/**
	 * 获取图片路径（X）
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysImageDTO#FIELD_IMAGEPATHX}
	 * @return
	 */
	java.lang.String getImagePathX();
	
	
	/**
	 * 获取直接内容
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysImageDTO#FIELD_RAWCONTENT}
	 * @return
	 */
	java.lang.String getRawContent();
	
	
	/**
	 * 获取图片宽度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysImageDTO#FIELD_WIDTH}
	 * @return
	 */
	int getWidth();
}