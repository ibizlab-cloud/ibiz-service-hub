package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.IrCronProgressDTO;

/**
 * 实体[IR_CRON_PROGRESS]服务对象接口
 * 
 */
@Qualifier(OdooModels.IR_CRON_PROGRESS)
public interface IIrCronProgressService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<IrCronProgressDTO, net.ibizsys.central.util.ISearchContextDTO>{



}