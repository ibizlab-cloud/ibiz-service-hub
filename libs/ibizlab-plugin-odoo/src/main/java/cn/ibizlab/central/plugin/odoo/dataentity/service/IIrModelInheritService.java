package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.IrModelInheritDTO;

/**
 * 实体[IR_MODEL_INHERIT]服务对象接口
 * 
 */
@Qualifier(OdooModels.IR_MODEL_INHERIT)
public interface IIrModelInheritService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<IrModelInheritDTO, net.ibizsys.central.util.ISearchContextDTO>{



}