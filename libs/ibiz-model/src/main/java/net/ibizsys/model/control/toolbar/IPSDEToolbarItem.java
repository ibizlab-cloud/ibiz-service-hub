package net.ibizsys.model.control.toolbar;



/**
 * 工具栏项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getItemType}
 *
 */
public interface IPSDEToolbarItem extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSControlItem{

	
	
	/**
	 * 获取标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_CAPPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes();


	/**
	 * 获取标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust();
	
	
	/**
	 * 获取标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_CAPTION}
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取计数器标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_COUNTERID}
	 * @return
	 */
	java.lang.String getCounterId();
	
	
	/**
	 * 获取计数器模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_COUNTERMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TreeNodeCounterMode}
	 * @return
	 */
	int getCounterMode();
	
	
	/**
	 * 获取项直接样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_RAWCSSSTYLE}
	 * @return
	 */
	java.lang.String getCssStyle();
	
	
	/**
	 * 获取项数据
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_DATA}
	 * @return
	 */
	java.lang.String getData();
	
	
	/**
	 * 获取动态样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_DYNACLASS}
	 * @return
	 */
	java.lang.String getDynaClass();
	
	
	/**
	 * 获取工具栏项高度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_HEIGHT}
	 * @return
	 */
	double getHeight();
	
	
	/**
	 * 获取项类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_TBITEMTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TBItemType}
	 * @return
	 */
	java.lang.String getItemType();
	
	
	/**
	 * 获取系统样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_PSSYSCSSID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取系统样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取图标资源对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_PSSYSIMAGEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取图标资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取前端应用插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端应用插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取工具提示
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_TOOLTIPINFO}
	 * @return
	 */
	java.lang.String getTooltip();
	
	
	/**
	 * 获取提示语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_TIPPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageRes();


	/**
	 * 获取提示语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageResMust();
	
	
	/**
	 * 获取用户标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_USERTAG}
	 * @return
	 */
	java.lang.String getUserTag();
	
	
	/**
	 * 获取用户标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_USERTAG2}
	 * @return
	 */
	java.lang.String getUserTag2();
	
	
	/**
	 * 获取工具栏项宽度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_WIDTH}
	 * @return
	 */
	double getWidth();
	
	
	/**
	 * 获取是否显示标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_SHOWMODE}
	 * @return
	 */
	boolean isShowCaption();
	
	
	/**
	 * 获取是否显示图标
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_SHOWMODE}
	 * @return
	 */
	boolean isShowIcon();
	
	
	/**
	 * 获取是否启用
	 * @return
	 */
	boolean isValid();
}