package net.ibizsys.central.cloud.saas.extension.runtime.dataentity.security;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.runtime.security.DataAccessActions;
import net.ibizsys.runtime.security.IUserContext;

public class DataEntityAccessManager extends DataEntityAccessManagerBase {

	@Override
	protected boolean onTestDataAccessAction(IUserContext iUserContext, Object objKey, IEntityDTO inputEntityDTO, String strAccessAction) throws Exception {
		if (DataAccessActions.CREATE.equals(strAccessAction)) {
			return true;
		}
		
		return true;
		//return super.onTestDataAccessAction(iUserContext, objKey, inputEntityDTO, strAccessAction);
	}
}
