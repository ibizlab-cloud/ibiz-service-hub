package net.ibizsys.model.dataentity.ds;



/**
 * 实体数据集合返回模型对象接口
 * <P>
 * 实体数据集合返回模型是实体数据集合模型的组成
 *
 */
public interface IPSDEDataSetReturn extends net.ibizsys.model.dataentity.service.IPSDEMethodReturn{

	
	
	/**
	 * 获取实体方法DTO对象
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTO getPSDEMethodDTO();


	/**
	 * 获取实体方法DTO对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTO getPSDEMethodDTOMust();
}