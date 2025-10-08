package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.MailComposerMixinDTO;

/**
 * 实体[MAIL_COMPOSER_MIXIN]服务对象接口
 * 
 */
@Qualifier(OdooModels.MAIL_COMPOSER_MIXIN)
public interface IMailComposerMixinService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<MailComposerMixinDTO, net.ibizsys.central.util.ISearchContextDTO>{



}