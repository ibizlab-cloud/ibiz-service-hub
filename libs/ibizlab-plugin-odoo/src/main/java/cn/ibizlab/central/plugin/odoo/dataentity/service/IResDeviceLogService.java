package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResDeviceLogDTO;

/**
 * 实体[RES_DEVICE_LOG]服务对象接口
 * 
 */
@Qualifier(OdooModels.RES_DEVICE_LOG)
public interface IResDeviceLogService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ResDeviceLogDTO, net.ibizsys.central.util.ISearchContextDTO>{



}