package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResCurrencyRateDTO;

/**
 * 实体[RES_CURRENCY_RATE]服务对象接口
 * 
 */
@Qualifier(OdooModels.RES_CURRENCY_RATE)
public interface IResCurrencyRateService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ResCurrencyRateDTO, net.ibizsys.central.util.ISearchContextDTO>{



}