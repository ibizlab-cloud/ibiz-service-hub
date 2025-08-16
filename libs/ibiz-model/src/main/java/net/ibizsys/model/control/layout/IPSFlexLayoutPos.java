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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSLayoutDTO#FIELD_FLEXBASIS}
	 * @return
	 */
	int getBasis();
	
	
	/**
	 * 获取Flex延伸
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSLayoutDTO#FIELD_FLEXGROW}
	 * @return
	 */
	int getGrow();
	
	
	/**
	 * 获取Flex伸缩值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSLayoutDTO#FIELD_FLEXSHRINK}
	 * @return
	 */
	int getShrink();
}