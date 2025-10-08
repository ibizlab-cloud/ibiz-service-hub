package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.MailBotDTO;

/**
 * 实体[MAIL_BOT]服务对象接口
 * 
 */
@Qualifier(OdooModels.MAIL_BOT)
public interface IMailBotService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<MailBotDTO, net.ibizsys.central.util.ISearchContextDTO>{



}