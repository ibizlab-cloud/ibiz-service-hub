package net.ibizsys.central.plugin.extension.dataentity.security;

import net.ibizsys.central.cloud.core.dataentity.security.DataEntityAccessManager;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.runtime.security.DataAccessActions;
import net.ibizsys.runtime.security.IUserContext;

public class PSModelDataEntityAccessManager extends DataEntityAccessManager {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PSModelDataEntityAccessManager.class);
	
	public final static String DATAACCESSACTION_MANAGE = "MANAGE";
	
	@Override
	protected boolean onTestDataAccessAction(IUserContext iUserContext, Object objKey, IEntityDTO inputEntityDTO, String strAccessAction) throws Exception {
		String strRealAccessAction = strAccessAction;
		if(!strRealAccessAction.equalsIgnoreCase(DataAccessActions.READ)) {
			strRealAccessAction = DATAACCESSACTION_MANAGE;
		}
		
		String strResCode = String.format("EXTENSION__%1$s_%2$s", strRealAccessAction, this.getDataEntityRuntime().getName()).toUpperCase();
		return this.getSystemAccessManager().testSysUniRes(iUserContext, strResCode);
//		return true;
	}
	
	@Override
	protected boolean onTestDataAccessAction(IUserContext iUserContext, IDataEntityRuntime parentDataEntityRuntime, String strParentKey, ISearchContextDTO iSearchContextDTO, String strAccessAction) throws Exception {
		String strRealAccessAction = strAccessAction;
		if(!strRealAccessAction.equalsIgnoreCase(DataAccessActions.READ)) {
			strRealAccessAction = DATAACCESSACTION_MANAGE;
		}
		
		String strResCode = String.format("EXTENSION__%1$s_%2$s", strRealAccessAction, this.getDataEntityRuntime().getName()).toUpperCase();
		return this.getSystemAccessManager().testSysUniRes(iUserContext, strResCode);
//		return true;
	}
}
