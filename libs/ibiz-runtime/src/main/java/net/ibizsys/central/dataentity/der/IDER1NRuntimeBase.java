package net.ibizsys.central.dataentity.der;

import net.ibizsys.model.dataentity.der.IPSDER1N;

/**
 * 1对多关系运行时基接口对象接口
 * @author lionlau
 *
 */
public interface IDER1NRuntimeBase extends IDER1NBaseRuntimeBase {

	
	/* (non-Javadoc)
	 * @see net.ibizsys.central.dataentity.der.IDERRuntimeBase#getPSDER()
	 */
	IPSDER1N getPSDER();
}
