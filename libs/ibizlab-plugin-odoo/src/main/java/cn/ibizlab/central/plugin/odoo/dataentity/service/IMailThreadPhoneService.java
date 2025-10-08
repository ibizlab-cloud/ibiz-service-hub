package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.MailThreadPhoneDTO;

/**
 * 实体[MAIL_THREAD_PHONE]服务对象接口
 * 
 */
@Qualifier(OdooModels.MAIL_THREAD_PHONE)
public interface IMailThreadPhoneService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<MailThreadPhoneDTO, net.ibizsys.central.util.ISearchContextDTO>{



}