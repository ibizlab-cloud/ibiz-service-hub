package net.ibizsys.model.control.map;



/**
 * 地图部件模型对象基础接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysMapDTO}运行时对象
 *
 */
public interface IPSMap extends net.ibizsys.model.control.IPSMDAjaxControl
		,net.ibizsys.model.control.IPSControlContainer
		,net.ibizsys.model.control.IPSControlNavigatable{

	
	
	/**
	 * 获取无值显示内容
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapDTO#FIELD_EMPTYTEXT}
	 * @return
	 */
	java.lang.String getEmptyText();
	
	
	/**
	 * 获取无值内容语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapDTO#FIELD_EMPTYTEXTPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageRes();


	/**
	 * 获取无值内容语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageResMust();
	
	
	/**
	 * 获取地图样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysMapDTO#FIELD_MAPVIEWSTYLE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.MapViewStyle}
	 * @return
	 */
	java.lang.String getMapStyle();
}