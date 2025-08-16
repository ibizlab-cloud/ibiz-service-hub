package net.ibizsys.model;



/**
 *
 */
public interface IPSModelObject extends net.ibizsys.model.IPSObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取动态模型文件路径
	 * @return
	 */
	java.lang.String getDynaModelFilePath();
	
	
	/**
	 * 获取备注
	 * @return
	 */
	java.lang.String getMemo();
	
	
	/**
	 * 获取名称
	 * @return
	 */
	java.lang.String getName();
	
	
	/**
	 * 获取动态模型对象
	 * @return
	 */
	net.ibizsys.model.dynamodel.IPSDynaModel getPSDynaModel();


	/**
	 * 获取动态模型对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dynamodel.IPSDynaModel getPSDynaModelMust();
	
	
	/**
	 * 获取用户模型分类
	 * @return
	 */
	java.lang.String getUserCat();
	
	
	/**
	 * 获取用户标记
	 * @return
	 */
	java.lang.String getUserTag();
	
	
	/**
	 * 获取用户标记2
	 * @return
	 */
	java.lang.String getUserTag2();
	
	
	/**
	 * 获取用户标记3
	 * @return
	 */
	java.lang.String getUserTag3();
	
	
	/**
	 * 获取用户标记4
	 * @return
	 */
	java.lang.String getUserTag4();
}