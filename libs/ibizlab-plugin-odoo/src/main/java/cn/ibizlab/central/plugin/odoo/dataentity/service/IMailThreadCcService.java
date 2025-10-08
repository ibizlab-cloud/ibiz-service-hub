package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.MailThreadCcDTO;

/**
 * 实体[MAIL_THREAD_CC]服务对象接口
 * 
 */
@Qualifier(OdooModels.MAIL_THREAD_CC)
public interface IMailThreadCcService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<MailThreadCcDTO, net.ibizsys.central.util.ISearchContextDTO>{



}