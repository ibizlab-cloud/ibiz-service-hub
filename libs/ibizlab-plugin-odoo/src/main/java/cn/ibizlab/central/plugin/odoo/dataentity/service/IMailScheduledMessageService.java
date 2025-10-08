package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.MailScheduledMessageDTO;

/**
 * 实体[MAIL_SCHEDULED_MESSAGE]服务对象接口
 * 
 */
@Qualifier(OdooModels.MAIL_SCHEDULED_MESSAGE)
public interface IMailScheduledMessageService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<MailScheduledMessageDTO, net.ibizsys.central.util.ISearchContextDTO>{



}