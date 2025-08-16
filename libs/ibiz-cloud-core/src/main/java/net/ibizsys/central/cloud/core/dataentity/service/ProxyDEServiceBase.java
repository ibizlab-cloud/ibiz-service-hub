package net.ibizsys.central.cloud.core.dataentity.service;

import net.ibizsys.central.dataentity.service.DEServiceBase;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;

public abstract class ProxyDEServiceBase<T extends IEntityDTO, F extends ISearchContextDTO> extends DEServiceBase<T, F> implements IProxyDEService<T, F> {

}
