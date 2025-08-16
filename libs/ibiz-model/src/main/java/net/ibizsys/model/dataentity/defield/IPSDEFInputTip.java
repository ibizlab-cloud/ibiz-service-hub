package net.ibizsys.model.dataentity.defield;



/**
 * 实体属性输入提示模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEFInputTipDTO}运行时对象
 *
 */
public interface IPSDEFInputTip extends net.ibizsys.model.dataentity.defield.IPSDEFieldObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取内容
	 * @return
	 */
	java.lang.String getContent();
	
	
	/**
	 * 获取内容语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFInputTipDTO#FIELD_CONTENTPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageRes();


	/**
	 * 获取内容语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageResMust();
	
	
	/**
	 * 获取Html内容
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFInputTipDTO#FIELD_CONTENT}
	 * @return
	 */
	java.lang.String getHtmlContent();
	
	
	/**
	 * 获取直接内容
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFInputTipDTO#FIELD_RAWCONTENT}
	 * @return
	 */
	java.lang.String getRawContent();
	
	
	/**
	 * 获取提示模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFInputTipDTO#FIELD_TIPMODE}
	 * @return
	 */
	java.lang.String getTipMode();
	
	
	/**
	 * 获取唯一标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFInputTipDTO#FIELD_UNIQUETAG}
	 * @return
	 */
	java.lang.String getUniqueTag();
	
	
	/**
	 * 获取是否属性默认输入提示
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFInputTipDTO#FIELD_DEFAULTFLAG}
	 * @return
	 */
	boolean isDefault();
}