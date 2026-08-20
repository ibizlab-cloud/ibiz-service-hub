package net.ibizsys.model.res;



/**
 *
 */
public interface IPSLanguageRes extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	
	/**
	 * 获取默认内容
	 * @return
	 */
	String getDefaultContent();
	
	
	/**
	 * 获取语言资源标记
	 * @return
	 */
	String getLanResTag();
	
	
	/**
	 * 获取语言资源类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.LanResType}
	 * @return
	 */
	String getLanResType();
	
	
	/**
	 * 获取名称
	 * @return
	 */
	String getName();
	
	
	/**
	 * 获取是否引用标志
	 * @return
	 */
	boolean getRefFlag();
}