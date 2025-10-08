package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResBankDTO;

/**
 * 实体[RES_BANK]服务对象接口
 * 
 */
@Qualifier(OdooModels.RES_BANK)
public interface IResBankService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ResBankDTO, net.ibizsys.central.util.ISearchContextDTO>{



}