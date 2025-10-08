package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ChangeProductionQtyDTO;

/**
 * 实体[CHANGE_PRODUCTION_QTY]服务对象接口
 * 
 */
@Qualifier(OdooModels.CHANGE_PRODUCTION_QTY)
public interface IChangeProductionQtyService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ChangeProductionQtyDTO, net.ibizsys.central.util.ISearchContextDTO>{



}