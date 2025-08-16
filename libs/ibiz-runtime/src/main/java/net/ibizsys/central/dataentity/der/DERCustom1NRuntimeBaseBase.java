package net.ibizsys.central.dataentity.der;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.PSModelEnums.DER1NRemoveActionType;
import net.ibizsys.model.dataentity.der.IPSDERCustom;

public abstract class DERCustom1NRuntimeBaseBase extends DERCustomRuntimeBaseBase implements IDER1NBaseRuntimeBase{

	private final DER1NRemoveActionType der1NRemoveActionType;
	public DERCustom1NRuntimeBaseBase(IDataEntityRuntime minorDataEntityRuntime, IPSDERCustom iPSDERBase) {
		super(minorDataEntityRuntime, iPSDERBase);
		this.der1NRemoveActionType = DER1NRemoveActionType.from(iPSDERBase.getRemoveActionType());
		
	}

	@Override
	public DER1NRemoveActionType getRemoveActionType() {
		return this.der1NRemoveActionType;
	}
}
