package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.IrRuleDTO;

/**
 * 实体[IR_RULE]服务对象接口
 * 
 */
@Qualifier(OdooModels.IR_RULE)
public interface IIrRuleService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<IrRuleDTO, net.ibizsys.central.util.ISearchContextDTO>{

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
     * 查询: DEFAULT
     */
    String DATAQUERY_DEFAULT = "DEFAULT";
    /**
     * 查询: 默认（全部数据）
     */
    String DATAQUERY_VIEW = "VIEW";
    /**
     * 查询: 全局
     */
    String DATAQUERY_GLOBAL = "GLOBAL";
    /**
     * 集合: DEFAULT
     */
    String DATASET_DEFAULT = "DEFAULT";
    /**
     * 集合: 全局
     */
    String DATASET_GLOBAL = "GLOBAL";
    /**
     * 集合: 模型同步数据集
     */
    String DATASET_PSMODEL_SYNC = "PSMODEL_SYNC";


    /**
     * 集合: DEFAULT
     */
    Page<IrRuleDTO> fetchDefault(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 全局
     */
    Page<IrRuleDTO> fetchGlobal(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 模型同步数据集
     */
    Page<IrRuleDTO> fetchPsmodelSync(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
}