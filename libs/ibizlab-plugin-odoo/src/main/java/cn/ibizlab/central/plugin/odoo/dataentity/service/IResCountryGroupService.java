package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResCountryGroupDTO;

/**
 * 实体[RES_COUNTRY_GROUP]服务对象接口
 * 
 */
@Qualifier(OdooModels.RES_COUNTRY_GROUP)
public interface IResCountryGroupService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ResCountryGroupDTO, net.ibizsys.central.util.ISearchContextDTO>{



}