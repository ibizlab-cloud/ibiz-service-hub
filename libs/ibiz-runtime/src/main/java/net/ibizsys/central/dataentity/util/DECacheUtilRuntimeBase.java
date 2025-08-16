package net.ibizsys.central.dataentity.util;

import org.springframework.data.domain.Page;

import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;

public abstract class DECacheUtilRuntimeBase extends DEUtilRuntimeBase implements IDECacheUtilRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DECacheUtilRuntimeBase.class);

	@Override
	public boolean isEnableAction(String strActionName, IPSDEAction iPSDEAction, Object[] args) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object executeAction(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEnableDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Page fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	
}
