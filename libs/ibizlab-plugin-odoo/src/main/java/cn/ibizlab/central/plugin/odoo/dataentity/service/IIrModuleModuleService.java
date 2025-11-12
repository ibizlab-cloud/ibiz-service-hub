package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.IrModuleModuleDTO;

/**
 * 实体[IR_MODULE_MODULE]服务对象接口
 * 
 */
@Qualifier(OdooModels.IR_MODULE_MODULE)
public interface IIrModuleModuleService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<IrModuleModuleDTO, net.ibizsys.central.util.ISearchContextDTO>{

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
     * 查询: 已安装
     */
    String DATAQUERY_INSTALLED = "INSTALLED";
    /**
     * 查询: 已安装应用
     */
    String DATAQUERY_INSTALLED_APP = "INSTALLED_APP";
    /**
     * 集合: DEFAULT
     */
    String DATASET_DEFAULT = "DEFAULT";
    /**
     * 集合: 当前用户授权应用
     */
    String DATASET_CUR_USER_APP = "CUR_USER_APP";
    /**
     * 集合: 已安装应用
     */
    String DATASET_INSTALLED = "INSTALLED";
    /**
     * 集合: 已安装应用
     */
    String DATASET_INSTALLED_APP = "INSTALLED_APP";


    /**
     * 集合: DEFAULT
     */
    Page<IrModuleModuleDTO> fetchDefault(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 当前用户授权应用
     */
    Page<IrModuleModuleDTO> fetchCurUserApp(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 已安装应用
     */
    Page<IrModuleModuleDTO> fetchInstalled(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 已安装应用
     */
    Page<IrModuleModuleDTO> fetchInstalledApp(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
}