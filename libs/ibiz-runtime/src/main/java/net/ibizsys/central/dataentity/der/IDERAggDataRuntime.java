package net.ibizsys.central.dataentity.der;

import java.util.List;

import net.ibizsys.model.dataentity.der.IPSDERAggData;

/**
 * 实体聚合数据关系运行时对象接口
 * @author lionlau
 *
 */
public interface IDERAggDataRuntime extends IDERRuntime {

	/**
	 * 获取实体聚合数据关系
	 * @return
	 */
	IPSDERAggData getPSDERAggData();
	
	
	List<IDERAggDataDEFMapRuntime> getDERAggDataDEFMapRuntimes();


	IDERAggDataDEFMapRuntime getDERAggDataDEFMapRuntimeByMajorField(String strFieldName, boolean bTryMode);

	
	IDERAggDataDEFMapRuntime getDERAggDataDEFMapRuntime(String strFieldName, boolean bTryMode);
}
