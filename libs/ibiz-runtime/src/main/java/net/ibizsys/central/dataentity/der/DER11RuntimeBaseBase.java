package net.ibizsys.central.dataentity.der;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.der.IPSDER11;

public abstract class DER11RuntimeBaseBase extends DER1NRuntimeBaseBase implements IDER11RuntimeBase {

	public DER11RuntimeBaseBase(IDataEntityRuntime minorDataEntityRuntime, IPSDER11 iPSDERBase) {
		super(minorDataEntityRuntime, iPSDERBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IPSDER11 getPSDER() {
		return (IPSDER11)super.getPSDER();
	}

	
}
