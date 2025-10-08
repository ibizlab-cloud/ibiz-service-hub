package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.MailThreadBlacklistDTO;

/**
 * 实体[MAIL_THREAD_BLACKLIST]服务对象接口
 * 
 */
@Qualifier(OdooModels.MAIL_THREAD_BLACKLIST)
public interface IMailThreadBlacklistService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<MailThreadBlacklistDTO, net.ibizsys.central.util.ISearchContextDTO>{



}