package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResPartnerIndustryDTO;

/**
 * 实体[RES_PARTNER_INDUSTRY]服务对象接口
 * 
 */
@Qualifier(OdooModels.RES_PARTNER_INDUSTRY)
public interface IResPartnerIndustryService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ResPartnerIndustryDTO, net.ibizsys.central.util.ISearchContextDTO>{



}