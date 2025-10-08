package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.MailCannedResponseDTO;

/**
 * 实体[MAIL_CANNED_RESPONSE]服务对象接口
 * 
 */
@Qualifier(OdooModels.MAIL_CANNED_RESPONSE)
public interface IMailCannedResponseService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<MailCannedResponseDTO, net.ibizsys.central.util.ISearchContextDTO>{



}