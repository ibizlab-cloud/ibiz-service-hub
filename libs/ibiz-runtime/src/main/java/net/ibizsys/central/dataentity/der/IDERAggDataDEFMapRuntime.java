package net.ibizsys.central.dataentity.der;

import net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap;
import net.ibizsys.runtime.IModelRuntime;

public interface IDERAggDataDEFMapRuntime extends IModelRuntime {

	/**
	 * 初始化
	 * @param iDERBaseRuntimeContext
	 * @param iPSDERAggDataDEFieldMap
	 * @throws Exception
	 */
	void init(IDERRuntimeContext iDERBaseRuntimeContext, IPSDERAggDataDEFieldMap iPSDERAggDataDEFieldMap) throws Exception;
	
	
	
	
	/**
	 * 获取实体聚合数据关系属性映射
	 * @return
	 */
	IPSDERAggDataDEFieldMap getPSDERAggDataDEFieldMap();
	
	
	/**
	 * 获取公式格式化
	 * @return
	 */
	String getFormulaFormat();
	
	
	/**
	 * 获取公式格式化
	 * @param 数据库类型
	 * @return
	 */
	String getFormulaFormat(String strDBType);
	
	
	/**
	 * 获取属性映射类型
	 * @return
	 */
	String getMapType();
	
	
	/**
	 * 是否为维度
	 * @return
	 */
	boolean isDimension();
	
	
	
	/**
	 * 是否为指标
	 * @return
	 */
	boolean isMetric();
	
	
	
	
	/**
	 * 是否为简单分组
	 * @return
	 */
	boolean isSimpleGroup();
	
	
	/**
	 * 是否为时间分组
	 * @return
	 */
	boolean isTimeGroup();
	
	
	
	
	/**
	 * 获取标准数据类型
	 * @return
	 */
	int getStdDataType();
}
