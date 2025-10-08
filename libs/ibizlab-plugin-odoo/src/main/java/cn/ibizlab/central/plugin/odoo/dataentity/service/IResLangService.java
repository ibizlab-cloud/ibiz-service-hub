package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResLangDTO;

/**
 * 实体[RES_LANG]服务对象接口
 * 
 */
@Qualifier(OdooModels.RES_LANG)
public interface IResLangService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ResLangDTO, net.ibizsys.central.util.ISearchContextDTO>{



}