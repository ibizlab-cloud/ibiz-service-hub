package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.MailPushDeviceDTO;

/**
 * 实体[MAIL_PUSH_DEVICE]服务对象接口
 * 
 */
@Qualifier(OdooModels.MAIL_PUSH_DEVICE)
public interface IMailPushDeviceService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<MailPushDeviceDTO, net.ibizsys.central.util.ISearchContextDTO>{



}