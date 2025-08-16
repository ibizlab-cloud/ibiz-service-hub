package net.ibizsys.central.dataentity.der;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.der.IPSDERCustom;

public abstract class DERCustomRuntimeBaseBase extends DERRuntimeBaseBase implements IDERCustomRuntimeBase {

	public DERCustomRuntimeBaseBase(IDataEntityRuntime minorDataEntityRuntime, IPSDERCustom iPSDERBase) {
		super(minorDataEntityRuntime, iPSDERBase);
		
	}
	
	@Override
	public IPSDERCustom getPSDER() {
		return (IPSDERCustom)super.getPSDER();
	}

}
