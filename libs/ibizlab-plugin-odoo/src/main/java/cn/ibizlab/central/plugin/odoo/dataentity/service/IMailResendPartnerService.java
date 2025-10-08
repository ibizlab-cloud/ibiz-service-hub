package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.MailResendPartnerDTO;

/**
 * 实体[MAIL_RESEND_PARTNER]服务对象接口
 * 
 */
@Qualifier(OdooModels.MAIL_RESEND_PARTNER)
public interface IMailResendPartnerService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<MailResendPartnerDTO, net.ibizsys.central.util.ISearchContextDTO>{



}