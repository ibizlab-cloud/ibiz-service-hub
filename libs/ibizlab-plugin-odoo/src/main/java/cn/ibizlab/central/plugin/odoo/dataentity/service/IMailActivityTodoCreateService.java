package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.MailActivityTodoCreateDTO;

/**
 * 实体[MAIL_ACTIVITY_TODO_CREATE]服务对象接口
 * 
 */
@Qualifier(OdooModels.MAIL_ACTIVITY_TODO_CREATE)
public interface IMailActivityTodoCreateService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<MailActivityTodoCreateDTO, net.ibizsys.central.util.ISearchContextDTO>{



}