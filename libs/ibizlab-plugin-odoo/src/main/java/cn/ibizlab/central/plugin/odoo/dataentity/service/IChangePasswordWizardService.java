package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ChangePasswordWizardDTO;

/**
 * 实体[CHANGE_PASSWORD_WIZARD]服务对象接口
 * 
 */
@Qualifier(OdooModels.CHANGE_PASSWORD_WIZARD)
public interface IChangePasswordWizardService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ChangePasswordWizardDTO, net.ibizsys.central.util.ISearchContextDTO>{



}