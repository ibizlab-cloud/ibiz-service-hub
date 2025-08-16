package net.ibizsys.model.control.editor;



/**
 * 图片上传编辑器模型对象接口
 * <P>
 * 扩展父接口类型[PICTURE,MOBPICTURELIST,MOBPICTURE,PICTURE_ONE]
 *
 */
public interface IPSPicture extends net.ibizsys.model.control.editor.IPSValueItemEditor{

	
	
	/**
	 * 获取对象存储分类[OSSCAT]
	 * @return
	 */
	java.lang.String getOSSCat();
	
	
	/**
	 * 获取是否直接内容存储
	 * @return
	 */
	boolean isRawContent();
}