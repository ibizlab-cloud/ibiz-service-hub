package net.ibizsys.model.app.control;



/**
 * 应用门户部件分类模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysPortletCatDTO}运行时对象
 *
 */
public interface IPSAppPortletCat extends net.ibizsys.model.res.IPSSysPortletCat
		,net.ibizsys.model.app.IPSApplicationObject
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取名称语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletCatDTO#FIELD_NAMEPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageRes();


	/**
	 * 获取名称语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageResMust();
	
	
	/**
	 * 获取系统界面样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletCatDTO#FIELD_PSSYSCSSID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取系统界面样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取系统图片
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysPortletCatDTO#FIELD_PSSYSIMAGEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取系统图片，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取是否未分组分类
	 * @return
	 */
	boolean isUngroup();
}