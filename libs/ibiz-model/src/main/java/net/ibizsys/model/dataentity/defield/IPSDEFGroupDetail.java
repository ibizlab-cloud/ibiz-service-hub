package net.ibizsys.model.dataentity.defield;



/**
 * 实体属性组成员模型对象接口
 *
 */
public interface IPSDEFGroupDetail extends net.ibizsys.model.IPSModelSortable
		,net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.dataentity.defield.IPSDEFieldBase{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取代码名称2
	 * @return
	 */
	java.lang.String getCodeName2();
	
	
	/**
	 * 获取成员参数
	 * @return
	 */
	java.lang.String getDetailParam();
	
	
	/**
	 * 获取成员参数2
	 * @return
	 */
	java.lang.String getDetailParam2();
	
	
	/**
	 * 获取逻辑名称语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getLNPSLanguageRes();


	/**
	 * 获取逻辑名称语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getLNPSLanguageResMust();
	
	
	/**
	 * 获取中文名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取排序值
	 * @return
	 */
	int getOrderValue();
	
	
	/**
	 * 获取系统代码表
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeList();


	/**
	 * 获取系统代码表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeListMust();
	
	
	/**
	 * 获取实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField();


	/**
	 * 获取实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust();
	
	
	/**
	 * 获取字符串长度
	 * @return
	 */
	int getStringLength();
	
	
	/**
	 * 获取是否允许空输入
	 * @return
	 */
	boolean isAllowEmpty();
	
	
	/**
	 * 获取是否支持用户输入
	 * @return
	 */
	boolean isEnableUserInsert();
	
	
	/**
	 * 获取是否支持用户更新
	 * @return
	 */
	boolean isEnableUserUpdate();
}