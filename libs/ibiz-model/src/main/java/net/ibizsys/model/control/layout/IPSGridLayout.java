package net.ibizsys.model.control.layout;



/**
 * 栅格布局模型对象接口
 * <P>
 * 扩展父接口类型[TABLE_12COL,TABLE_24COL]
 *
 */
public interface IPSGridLayout extends net.ibizsys.model.control.layout.IPSLayout{

	
	
	/**
	 * 获取子成员默认列数量（大型）
	 * @return
	 */
	int getChildColLG();
	
	
	/**
	 * 获取子成员默认列数量（中型）
	 * @return
	 */
	int getChildColMD();
	
	
	/**
	 * 获取子成员默认列数量（小型）
	 * @return
	 */
	int getChildColSM();
	
	
	/**
	 * 获取子成员默认列数量（极小）
	 * @return
	 */
	int getChildColXS();
	
	
	/**
	 * 获取列数量
	 * @return
	 */
	int getColumnCount();
	
	
	/**
	 * 获取是否启用12列转24列布局
	 * @return
	 */
	boolean isEnableCol12ToCol24();
}