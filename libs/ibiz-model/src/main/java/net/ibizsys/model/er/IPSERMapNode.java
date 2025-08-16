package net.ibizsys.model.er;



/**
 *
 */
public interface IPSERMapNode extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取上方位置
	 * @return
	 */
	int getLeftPos();
	
	
	/**
	 * 获取实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
	/**
	 * 获取左侧位置
	 * @return
	 */
	int getTopPos();
}