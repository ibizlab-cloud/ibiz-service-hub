package net.ibizsys.central.dataentity.der;

import net.ibizsys.model.PSModelEnums.DER1NRemoveActionType;
import net.ibizsys.model.dataentity.der.IPSDER1NBase;

/**
 * 1对多关系基础运行时基接口对象接口
 * @author lionlau
 *
 */
public interface IDER1NBaseRuntimeBase extends IDERRuntimeBase {

	/* (non-Javadoc)
	 * @see net.ibizsys.central.dataentity.der.IDERRuntimeBase#getPSDER()
	 */
	IPSDER1NBase getPSDER();
	
	
	/**
	 * 获取删除操作类型
	 * @return
	 */
	DER1NRemoveActionType getRemoveActionType();
	
	
}
