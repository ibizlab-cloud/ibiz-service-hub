package net.ibizsys.model.control.toolbar;



/**
 * 实体工具栏分隔项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO}运行时对象
 * <P>
 * 扩展父接口类型[SEPERATOR]
 *
 */
public interface IPSDETBSeperatorItem extends net.ibizsys.model.control.toolbar.IPSDEToolbarItem{

	
	
	/**
	 * 获取是否延展
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_SPANFLAG}
	 * @return
	 */
	boolean isSpanMode();
}