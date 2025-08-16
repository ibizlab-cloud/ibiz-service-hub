package net.ibizsys.central.dataentity.der;

import net.ibizsys.model.dataentity.der.IPSDER11;

/**
 * 1对1关系运行时基接口对象接口
 * @author lionlau
 *
 */
public interface IDER11RuntimeBase extends IDER1NRuntimeBase {

	@Override
	IPSDER11 getPSDER();
}
