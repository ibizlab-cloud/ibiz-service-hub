package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.IrModelRelationDTO;

/**
 * 实体[IR_MODEL_RELATION]服务对象接口
 * 
 */
@Qualifier(OdooModels.IR_MODEL_RELATION)
public interface IIrModelRelationService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<IrModelRelationDTO, net.ibizsys.central.util.ISearchContextDTO>{



}