package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.IrAttachmentDTO;

/**
 * 实体[IR_ATTACHMENT]服务对象接口
 * 
 */
@Qualifier(OdooModels.IR_ATTACHMENT)
public interface IIrAttachmentService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<IrAttachmentDTO, net.ibizsys.central.util.ISearchContextDTO>{

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
     * 查询: 常规
     */
    String DATAQUERY_COMMON = "COMMON";
    /**
     * 查询: 常规
     */
    String DATAQUERY_COMMON_BY_MODEL = "COMMON_BY_MODEL";
    /**
     * 集合: DEFAULT
     */
    String DATASET_DEFAULT = "DEFAULT";
    /**
     * 集合: 常规
     */
    String DATASET_COMMON = "COMMON";
    /**
     * 集合: 常规
     */
    String DATASET_COMMON_BY_MODEL = "COMMON_BY_MODEL";


    /**
     * 集合: DEFAULT
     */
    Page<IrAttachmentDTO> fetchDefault(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 常规
     */
    Page<IrAttachmentDTO> fetchCommon(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 常规
     */
    Page<IrAttachmentDTO> fetchCommonByModel(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
}