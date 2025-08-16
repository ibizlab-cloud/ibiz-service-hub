package net.ibizsys.model.dataentity.dataexport;



/**
 * 实体数据导出分组模型对象接口
 *
 */
public interface IPSDEDataExportGroup extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取水平对齐
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridColAlign}
	 * @return
	 */
	java.lang.String getAlign();
	
	
	/**
	 * 获取标题语言资源
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
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取分组级别
	 * @return
	 */
	int getGroupLevel();
	
	
	/**
	 * 获取父数据导出分组
	 * @return
	 */
	net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup getParentPSDEDataExportGroup();


	/**
	 * 获取父数据导出分组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup getParentPSDEDataExportGroupMust();
}