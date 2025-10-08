package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResPartnerTitleDTO;

/**
 * 实体[RES_PARTNER_TITLE]服务对象接口
 * 
 */
@Qualifier(OdooModels.RES_PARTNER_TITLE)
public interface IResPartnerTitleService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ResPartnerTitleDTO, net.ibizsys.central.util.ISearchContextDTO>{



}