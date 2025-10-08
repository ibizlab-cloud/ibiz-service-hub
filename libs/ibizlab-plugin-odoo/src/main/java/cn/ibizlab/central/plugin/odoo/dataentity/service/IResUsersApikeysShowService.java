package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResUsersApikeysShowDTO;

/**
 * 实体[RES_USERS_APIKEYS_SHOW]服务对象接口
 * 
 */
@Qualifier(OdooModels.RES_USERS_APIKEYS_SHOW)
public interface IResUsersApikeysShowService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ResUsersApikeysShowDTO, net.ibizsys.central.util.ISearchContextDTO>{



}