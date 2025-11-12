package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.IrModelDTO;

/**
 * 实体[IR_MODEL]服务对象接口
 * 
 */
@Qualifier(OdooModels.IR_MODEL)
public interface IIrModelService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<IrModelDTO, net.ibizsys.central.util.ISearchContextDTO>{

    /**
     * 行为: Create
     */
    String ACTION_CREATE = "CREATE";
    /**
     * 行为: Update
     */
    String ACTION_UPDATE = "UPDATE";
    /**
     * 行为: Remove
     */
    String ACTION_REMOVE = "REMOVE";
    /**
     * 行为: Get
     */
    String ACTION_GET = "GET";
    /**
     * 行为: GetDraft
     */
    String ACTION_GETDRAFT = "GETDRAFT";
    /**
     * 行为: CheckKey
     */
    String ACTION_CHECKKEY = "CHECKKEY";
    /**
     * 行为: Save
     */
    String ACTION_SAVE = "SAVE";
    /**
     * 行为: 计算模型主页
     */
    String ACTION_CALC_MODEL_MAIN_VIEW = "CALC_MODEL_MAIN_VIEW";
    /**
     * 查询: DEFAULT
     */
    String DATAQUERY_DEFAULT = "DEFAULT";
    /**
     * 查询: 默认（全部数据）
     */
    String DATAQUERY_VIEW = "VIEW";
    /**
     * 集合: DEFAULT
     */
    String DATASET_DEFAULT = "DEFAULT";

    /**
     * 行为: 计算模型主页
     */
    void calcModelMainView(IrModelDTO dto) throws Throwable;

    /**
     * 集合: DEFAULT
     */
    Page<IrModelDTO> fetchDefault(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
}