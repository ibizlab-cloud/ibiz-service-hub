package net.ibizsys.model.control.layout;



/**
 * 栅格布局占位模型对象接口
 * <P>
 * 扩展父接口类型[TABLE_12COL,TABLE_24COL]
 *
 */
public interface IPSGridLayoutPos extends net.ibizsys.model.control.layout.IPSLayoutPos{

	
	
	/**
	 * 获取大型列宽
	 * @return
	 */
	int getColLG();
	
	
	/**
	 * 获取大型偏移
	 * @return
	 */
	int getColLGOffset();
	
	
	/**
	 * 获取中型列宽
	 * @return
	 */
	int getColMD();
	
	
	/**
	 * 获取中型偏移
	 * @return
	 */
	int getColMDOffset();
	
	
	/**
	 * 获取小型列宽
	 * @return
	 */
	int getColSM();
	
	
	/**
	 * 获取小型偏移
	 * @return
	 */
	int getColSMOffset();
	
	
	/**
	 * 获取固定列宽
	 * @return
	 */
	int getColWidth();
	
	
	/**
	 * 获取超小列宽
	 * @return
	 */
	int getColXS();
	
	
	/**
	 * 获取超小偏移
	 * @return
	 */
	int getColXSOffset();
}