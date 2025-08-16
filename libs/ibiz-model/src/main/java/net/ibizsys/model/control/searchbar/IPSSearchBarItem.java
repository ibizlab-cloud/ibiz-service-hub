package net.ibizsys.model.control.searchbar;



/**
 *
 */
public interface IPSSearchBarItem extends net.ibizsys.model.control.searchbar.IPSSearchBarObject
		,net.ibizsys.model.control.IPSControlItem{

	
	
	/**
	 * 获取标题多语言资源对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CAPPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes();


	/**
	 * 获取标题多语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust();
	
	
	/**
	 * 获取标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CAPTION}
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取项直接样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_RAWCSSSTYLE}
	 * @return
	 */
	java.lang.String getCssStyle();
	
	
	/**
	 * 获取项数据
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DATA}
	 * @return
	 */
	java.lang.String getData();
	
	
	/**
	 * 获取动态样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DYNACLASS}
	 * @return
	 */
	java.lang.String getDynaClass();
	
	
	/**
	 * 获取项类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_ITEMTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SearchBarItemType}
	 * @return
	 */
	java.lang.String getItemType();
	
	
	/**
	 * 获取标签直接样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_LABELRAWCSSSTYLE}
	 * @return
	 */
	java.lang.String getLabelCssStyle();
	
	
	/**
	 * 获取标签动态样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_LABELDYNACLASS}
	 * @return
	 */
	java.lang.String getLabelDynaClass();
	
	
	/**
	 * 获取项样式表对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_LABELPSSYSCSSID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getLabelPSSysCss();


	/**
	 * 获取项样式表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getLabelPSSysCssMust();
	
	
	/**
	 * 获取应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField();


	/**
	 * 获取应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust();
	
	
	/**
	 * 获取过滤项界面样式表
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取过滤项界面样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取项图片对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取项图片对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
}