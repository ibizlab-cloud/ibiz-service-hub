package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.IrModelDataDTO;

/**
 * 实体[IR_MODEL_DATA]服务对象接口
 * 
 */
@Qualifier(OdooModels.IR_MODEL_DATA)
public interface IIrModelDataService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<IrModelDataDTO, net.ibizsys.central.util.ISearchContextDTO>{



}