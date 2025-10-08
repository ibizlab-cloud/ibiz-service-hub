package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.IrModelFieldsSelectionDTO;

/**
 * 实体[IR_MODEL_FIELDS_SELECTION]服务对象接口
 * 
 */
@Qualifier(OdooModels.IR_MODEL_FIELDS_SELECTION)
public interface IIrModelFieldsSelectionService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<IrModelFieldsSelectionDTO, net.ibizsys.central.util.ISearchContextDTO>{



}