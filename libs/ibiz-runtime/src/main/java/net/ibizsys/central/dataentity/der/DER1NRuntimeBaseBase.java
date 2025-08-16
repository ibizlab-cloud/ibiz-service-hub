package net.ibizsys.central.dataentity.der;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.PSModelEnums.DER1NRemoveActionType;
import net.ibizsys.model.dataentity.der.IPSDER1N;

public abstract class DER1NRuntimeBaseBase extends DERRuntimeBaseBase implements IDER1NRuntimeBase {

	private final DER1NRemoveActionType der1NRemoveActionType;
	public DER1NRuntimeBaseBase(IDataEntityRuntime minorDataEntityRuntime, IPSDER1N iPSDERBase) {
		super(minorDataEntityRuntime, iPSDERBase);
		this.der1NRemoveActionType = DER1NRemoveActionType.from(iPSDERBase.getRemoveActionType());
	}

	@Override
	public IPSDER1N getPSDER() {
		return (IPSDER1N)super.getPSDER();
	}

	@Override
	public DER1NRemoveActionType getRemoveActionType() {
		return this.der1NRemoveActionType;
	}
	
}
