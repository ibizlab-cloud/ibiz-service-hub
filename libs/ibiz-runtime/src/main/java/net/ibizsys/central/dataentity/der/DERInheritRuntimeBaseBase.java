package net.ibizsys.central.dataentity.der;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.der.IPSDERInherit;

public abstract class DERInheritRuntimeBaseBase extends DERRuntimeBaseBase implements IDERInheritRuntimeBase {

	public DERInheritRuntimeBaseBase(IDataEntityRuntime minorDataEntityRuntime, IPSDERInherit iPSDERBase) {
		super(minorDataEntityRuntime, iPSDERBase);
		
	}
	
	@Override
	public IPSDERInherit getPSDER() {
		return (IPSDERInherit)super.getPSDER();
	}

}
