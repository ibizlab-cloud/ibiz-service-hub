package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResPartnerAutocompleteSyncDTO;

/**
 * 实体[RES_PARTNER_AUTOCOMPLETE_SYNC]服务对象接口
 * 
 */
@Qualifier(OdooModels.RES_PARTNER_AUTOCOMPLETE_SYNC)
public interface IResPartnerAutocompleteSyncService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ResPartnerAutocompleteSyncDTO, net.ibizsys.central.util.ISearchContextDTO>{



}