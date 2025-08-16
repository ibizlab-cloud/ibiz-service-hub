package net.ibizsys.central.dataentity.der;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.der.IPSDERMultiInherit;

public abstract class DERMultiInheritRuntimeBaseBase extends DERRuntimeBaseBase implements IDERMultiInheritRuntimeBase {

	public DERMultiInheritRuntimeBaseBase(IDataEntityRuntime minorDataEntityRuntime, IPSDERMultiInherit iPSDERBase) {
		super(minorDataEntityRuntime, iPSDERBase);
		
	}
	
	@Override
	public IPSDERMultiInherit getPSDER() {
		return (IPSDERMultiInherit)super.getPSDER();
	}

}
