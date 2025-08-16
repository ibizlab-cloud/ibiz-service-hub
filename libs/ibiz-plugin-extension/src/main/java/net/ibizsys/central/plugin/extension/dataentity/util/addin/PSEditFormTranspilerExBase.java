package net.ibizsys.central.plugin.extension.dataentity.util.addin;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.control.form.IPSDEEditForm;

public abstract class PSEditFormTranspilerExBase extends PSModelTranspilerExBase {

	@Override
	protected Class<? extends IPSModelObject> getPSModelObjectCls() {
		return IPSDEEditForm.class;
	}

}
