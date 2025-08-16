package net.ibizsys.central.dataentity.service;

public interface IDEMethodDTO {

	/**
	 * 初始化
	 * @param iDEMethodDTORuntime
	 * @param objData 原始数据
	 * @param bDTOData 是否为DTO数据
	 * @throws Exception
	 */
	void init(IDEMethodDTORuntime iDEMethodDTORuntime, Object dtoData, boolean bDTOData) throws Exception;
	
	
	/**
	 * 获取实体方法DTO运行时对象
	 * @return
	 */
	IDEMethodDTORuntime getDEMethodDTORuntime();
	
	
	

}
