package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResCountryStateDTO;

/**
 * 实体[RES_COUNTRY_STATE]服务对象接口
 * 
 */
@Qualifier(OdooModels.RES_COUNTRY_STATE)
public interface IResCountryStateService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ResCountryStateDTO, net.ibizsys.central.util.ISearchContextDTO>{



}