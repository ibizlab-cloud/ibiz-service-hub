package net.ibizsys.model.dataentity.jit;



/**
 * 实体示例数据模型对象接口
 *
 */
public interface IPSDESampleData extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取示例数据
	 * @return
	 */
	java.lang.String getData();
	
	
	/**
	 * 获取示例数据JSON对象
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getDataJO();
	
	
	/**
	 * 获取数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SampleDataType}
	 * @return
	 */
	java.lang.String getDataType();
	
	
	/**
	 * 获取逻辑模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SampleDataLogicMode}
	 * @return
	 */
	java.lang.String getLogicMode();
	
	
	/**
	 * 获取随机数量
	 * @return
	 */
	int getRandomCount();
	
	
	/**
	 * 获取随机模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SampleDataRandomMode}
	 * @return
	 */
	java.lang.String getRandomMode();
	
	
	/**
	 * 获取随机参数
	 * @return
	 */
	java.lang.String getRandomParam();
	
	
	/**
	 * 获取随机参数2
	 * @return
	 */
	java.lang.String getRandomParam2();
	
	
	/**
	 * 获取随机参数3
	 * @return
	 */
	int getRandomParam3();
	
	
	/**
	 * 获取随机参数4
	 * @return
	 */
	int getRandomParam4();
}