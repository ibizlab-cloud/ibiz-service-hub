package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ChangePasswordOwnDTO;

/**
 * 实体[CHANGE_PASSWORD_OWN]服务对象接口
 * 
 */
@Qualifier(OdooModels.CHANGE_PASSWORD_OWN)
public interface IChangePasswordOwnService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ChangePasswordOwnDTO, net.ibizsys.central.util.ISearchContextDTO>{



}