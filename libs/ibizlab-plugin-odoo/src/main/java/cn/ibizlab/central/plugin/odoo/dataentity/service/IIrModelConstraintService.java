package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.IrModelConstraintDTO;

/**
 * 实体[IR_MODEL_CONSTRAINT]服务对象接口
 * 
 */
@Qualifier(OdooModels.IR_MODEL_CONSTRAINT)
public interface IIrModelConstraintService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<IrModelConstraintDTO, net.ibizsys.central.util.ISearchContextDTO>{



}