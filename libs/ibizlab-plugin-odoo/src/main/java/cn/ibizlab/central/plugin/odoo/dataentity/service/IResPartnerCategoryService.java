package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResPartnerCategoryDTO;

/**
 * 实体[RES_PARTNER_CATEGORY]服务对象接口
 * 
 */
@Qualifier(OdooModels.RES_PARTNER_CATEGORY)
public interface IResPartnerCategoryService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ResPartnerCategoryDTO, net.ibizsys.central.util.ISearchContextDTO>{



}