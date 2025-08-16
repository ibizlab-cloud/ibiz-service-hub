package net.ibizsys.central.cloud.core.dataentity;

import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;

public abstract class DataEntityRuntimeServiceBase<T extends IEntityDTO, F extends ISearchContextDTO, S extends IDEService<T, F>> extends DataEntityRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DataEntityRuntimeServiceBase.class);
	
	@Override
	public T createEntity() {
		// TODO Auto-generated method stub
		return (T)super.createEntity();
	}
	
	@Override
	public S getDEService() {
		return (S)super.getDEService();
	}
}
