package net.ibizsys.model.control.editor;



/**
 * 代码编辑器模型对象接口
 * <P>
 * 扩展父接口类型[CODE,MOBCODE]
 *
 */
public interface IPSCode extends net.ibizsys.model.control.editor.IPSTextArea{

	
	
	/**
	 * 获取代码类型[CODETYPE]
	 * @return
	 */
	java.lang.String getCodeType();
	
	
	/**
	 * 获取是否启用全屏[FULLSCREEN]
	 * @return
	 */
	boolean isEnableFullScreen();
	
	
	/**
	 * 获取是否启用缩略图[MINIMAP]
	 * @return
	 */
	boolean isEnableMinimap();
}