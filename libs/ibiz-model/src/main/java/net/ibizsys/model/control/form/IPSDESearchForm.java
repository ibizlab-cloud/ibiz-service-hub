package net.ibizsys.model.control.form;



/**
 * 实体搜索表单模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEFormDTO}运行时对象
 *
 */
public interface IPSDESearchForm extends net.ibizsys.model.control.form.IPSDEForm{

	
	
	/**
	 * 获取搜索按钮位置
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDTO#FIELD_SEARCHBTNPOS}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SearchFormButtonPos}
	 * @return
	 */
	java.lang.String getSearchButtonPos();
	
	
	/**
	 * 获取搜索按钮样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDTO#FIELD_SEARCHBTNSTYLE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SearchFormButtonStyle}
	 * @return
	 */
	java.lang.String getSearchButtonStyle();
	
	
	/**
	 * 获取是否支持高级搜索，视图部件模型{@link PSDEViewCtrlDTO#FIELD_CTRLPARAM5}优先定义
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDTO#FIELD_ENABLEADVSEARCH}
	 * @return
	 */
	boolean isEnableAdvanceSearch();
	
	
	/**
	 * 获取是否支持自动搜索
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewCtrlDTO#FIELD_CTRLPARAM6}
	 * @return
	 */
	boolean isEnableAutoSearch();
	
	
	/**
	 * 获取是否支持条件保存，视图部件模型{@link PSDEViewCtrlDTO#FIELD_CTRLPARAM7}优先定义
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDTO#FIELD_ENABLEFILTERSAVE}
	 * @return
	 */
	boolean isEnableFilterSave();
}