package net.ibizsys.model.control.layout;



/**
 * Flex布局占位模型对象接口
 * <P>
 * 扩展父接口类型[FLEX]
 *
 */
public interface IPSFlexLayoutPos extends net.ibizsys.model.control.layout.IPSLayoutPos{

	
	
	/**
	 * 获取Flex伸缩基准值
	 * @return
	 */
	int getBasis();
	
	
	/**
	 * 获取Flex延伸
	 * @return
	 */
	int getGrow();
	
	
	/**
	 * 获取Flex伸缩值
	 * @return
	 */
	int getShrink();
}