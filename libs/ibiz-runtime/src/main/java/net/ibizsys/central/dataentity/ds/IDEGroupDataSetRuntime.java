package net.ibizsys.central.dataentity.ds;

import net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap;
import net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetRuntime;

public interface IDEGroupDataSetRuntime extends IDEDataSetRuntime {
	
	
	
	/**
	 * 是否定义了实体数据集分组参数
	 * @return
	 */
	boolean hasPSDEDataSetGroupParams();
	
	/**
	 * 获取指定实体数据集分组参数
	 * @param strName
	 * @param bTryMode
	 * @return
	 */
	IPSDEDataSetGroupParam getPSDEDataSetGroupParam(String strName, boolean bTryMode);
	
	/**
	 * 通过主属性名称获取聚合数据关系属性映射
	 * @param strName
	 * @param bTryMode
	 * @return
	 */
	IPSDERAggDataDEFieldMap getPSDERAggDataDEFieldMapByMajorField(String strName, boolean bTryMode);
	
}
