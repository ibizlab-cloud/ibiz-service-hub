package net.ibizsys.model.control.layout;



/**
 * 绝对布局占位模型对象接口
 * <P>
 * 扩展父接口类型[ABSOLUTE]
 *
 */
public interface IPSAbsoluteLayoutPos extends net.ibizsys.model.control.layout.IPSLayoutPos{

	
	
	/**
	 * 获取下方位置
	 * @return
	 */
	int getBottom();
	
	
	/**
	 * 获取布局占位
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AbsoluteLayoutPos}
	 * @return
	 */
	java.lang.String getLayoutPos();
	
	
	/**
	 * 获取左侧位置
	 * @return
	 */
	int getLeft();
	
	
	/**
	 * 获取右侧位置
	 * @return
	 */
	int getRight();
	
	
	/**
	 * 获取上方位置
	 * @return
	 */
	int getTop();
}