package net.ibizsys.model.control.editor;



/**
 * 文件上传编辑器模型对象接口
 * <P>
 * 扩展父接口类型[FILEUPLOADER,MOBMULTIFILEUPLOAD,MOBSINGLEFILEUPLOAD,FILEUPLOADERONE]
 *
 */
public interface IPSFileUploader extends net.ibizsys.model.control.editor.IPSValueItemEditor{

	
	
	/**
	 * 获取文件后缀[FILEEXTS]
	 * @return
	 */
	java.lang.String getFileExts();
	
	
	/**
	 * 获取最大文件数量[MAXFILECNT]
	 * @return
	 */
	int getMaxFileCount();
	
	
	/**
	 * 获取最大文件大小[MAXFILESIZE]
	 * @return
	 */
	int getMaxFileSize();
	
	
	/**
	 * 获取最小文件数量[MINFILECNT]
	 * @return
	 */
	int getMinFileCount();
	
	
	/**
	 * 获取对象存储分类[OSSCAT]
	 * @return
	 */
	java.lang.String getOSSCat();
}