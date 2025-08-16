package net.ibizsys.model.control;



/**
 * 界面部件数据容器模型基础对象接口
 *
 */
public interface IPSControlXDataContainer{

	
	
	/**
	 * 获取应用实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_LOADDEFAULT}
	 * @return
	 */
	boolean isLoadDefault();
	
	
	/**
	 * 获取是否只读模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_READONLYMODE}
	 * @return
	 */
	boolean isReadOnly();
}