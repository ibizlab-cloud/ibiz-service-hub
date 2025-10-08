package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ChangePasswordUserDTO;

/**
 * 实体[CHANGE_PASSWORD_USER]服务对象接口
 * 
 */
@Qualifier(OdooModels.CHANGE_PASSWORD_USER)
public interface IChangePasswordUserService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ChangePasswordUserDTO, net.ibizsys.central.util.ISearchContextDTO>{



}