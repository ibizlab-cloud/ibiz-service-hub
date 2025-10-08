package cn.ibizlab.central.plugin.odoo.dataentity.service;

import net.ibizsys.central.cloud.core.dataentity.service.IProxyDEService;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;

public interface IOdooDEService <T extends IEntityDTO, F extends ISearchContextDTO> extends IProxyDEService<T, F>{

}
