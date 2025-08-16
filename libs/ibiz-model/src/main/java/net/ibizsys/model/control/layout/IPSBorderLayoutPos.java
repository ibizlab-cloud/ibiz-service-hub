package net.ibizsys.model.control.layout;



/**
 * 边缘布局占位模型对象接口
 * <P>
 * 扩展父接口类型[BORDER]
 *
 */
public interface IPSBorderLayoutPos extends net.ibizsys.model.control.layout.IPSLayoutPos{

	
	
	/**
	 * 获取布局占位
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSLayoutDTO#FIELD_AL_POS}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BorderLayoutPos}
	 * @return
	 */
	java.lang.String getLayoutPos();
}