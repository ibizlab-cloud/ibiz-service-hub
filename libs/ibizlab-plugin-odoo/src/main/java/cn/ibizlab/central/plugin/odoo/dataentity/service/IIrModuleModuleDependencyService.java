package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.IrModuleModuleDependencyDTO;

/**
 * 实体[IR_MODULE_MODULE_DEPENDENCY]服务对象接口
 * 
 */
@Qualifier(OdooModels.IR_MODULE_MODULE_DEPENDENCY)
public interface IIrModuleModuleDependencyService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<IrModuleModuleDependencyDTO, net.ibizsys.central.util.ISearchContextDTO>{



}