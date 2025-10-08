package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResUsersIdentitycheckDTO;

/**
 * 实体[RES_USERS_IDENTITYCHECK]服务对象接口
 * 
 */
@Qualifier(OdooModels.RES_USERS_IDENTITYCHECK)
public interface IResUsersIdentitycheckService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ResUsersIdentitycheckDTO, net.ibizsys.central.util.ISearchContextDTO>{



}