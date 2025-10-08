package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.MailAliasMixinDTO;

/**
 * 实体[MAIL_ALIAS_MIXIN]服务对象接口
 * 
 */
@Qualifier(OdooModels.MAIL_ALIAS_MIXIN)
public interface IMailAliasMixinService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<MailAliasMixinDTO, net.ibizsys.central.util.ISearchContextDTO>{



}