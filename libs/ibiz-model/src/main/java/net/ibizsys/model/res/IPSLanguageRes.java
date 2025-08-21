package net.ibizsys.model.res;



/**
 *
 */
public interface IPSLanguageRes extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取默认内容
	 * @return
	 */
	java.lang.String getDefaultContent();
	
	
	/**
	 * 获取语言资源标记
	 * @return
	 */
	java.lang.String getLanResTag();
	
	
	/**
	 * 获取语言资源类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.LanResType}
	 * @return
	 */
	java.lang.String getLanResType();
	
	
	/**
	 * 获取名称
	 * @return
	 */
	java.lang.String getName();
	
	
	/**
	 * 获取是否引用标志
	 * @return
	 */
	boolean getRefFlag();
}