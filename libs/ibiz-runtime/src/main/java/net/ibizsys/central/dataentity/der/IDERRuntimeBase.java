package net.ibizsys.central.dataentity.der;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.PSModelEnums.DERType;
import net.ibizsys.model.dataentity.der.IPSDERBase;

/**
 * 实体关系运行时基类
 * @author lionlau
 *
 */
public interface IDERRuntimeBase {

	/**
	 * 获取关系类型
	 * @return
	 */
	DERType getDERType();
	
	/**
	 * 获取关系从实体运行时对象
	 * @return
	 */
	IDataEntityRuntime getMinorDataEntityRuntime();
	
	
	
	/**
	 * 获取模型对象
	 * @return
	 */
	IPSDERBase getPSDER();
}
