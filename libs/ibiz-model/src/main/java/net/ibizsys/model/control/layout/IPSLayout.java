package net.ibizsys.model.control.layout;



/**
 * 布局模型基础对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSLayoutDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getLayout}
 *
 */
public interface IPSLayout extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取布局模式
	 * @return
	 */
	java.lang.String getLayout();
}