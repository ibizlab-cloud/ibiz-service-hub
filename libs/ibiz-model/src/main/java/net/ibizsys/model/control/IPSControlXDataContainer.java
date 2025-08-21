package net.ibizsys.model.control;



/**
 * 界面部件数据容器模型基础对象接口
 *
 */
public interface IPSControlXDataContainer{

	
	
	/**
	 * 获取应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取是否支持编辑数据
	 * @return
	 */
	boolean isEnableEditData();
	
	
	/**
	 * 获取是否支持新建数据
	 * @return
	 */
	boolean isEnableNewData();
	
	
	/**
	 * 获取是否支持删除数据
	 * @return
	 */
	boolean isEnableRemoveData();
	
	
	/**
	 * 获取是否默认加载数据
	 * @return
	 */
	boolean isLoadDefault();
	
	
	/**
	 * 获取是否只读模式
	 * @return
	 */
	boolean isReadOnly();
}