package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResGroupsDTO;

/**
 * 实体[RES_GROUPS]服务对象接口
 * 
 */
@Qualifier(OdooModels.RES_GROUPS)
public interface IResGroupsService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ResGroupsDTO, net.ibizsys.central.util.ISearchContextDTO>{

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
     * 查询: 当前用户权限组
     */
    String DATAQUERY_CUR_USER_REF = "CUR_USER_REF";
    /**
     * 查询: 用户归属组
     */
    String DATAQUERY_USER_REF = "USER_REF";
    /**
     * 查询: 包含嵌套数据
     */
    String DATAQUERY_WITH_NESTED = "WITH_NESTED";
    /**
     * 集合: DEFAULT
     */
    String DATASET_DEFAULT = "DEFAULT";
    /**
     * 集合: 当前用户权限组
     */
    String DATASET_CUR_USER_REF = "CUR_USER_REF";
    /**
     * 集合: 模型同步数据集
     */
    String DATASET_PSMODEL_SYNC = "PSMODEL_SYNC";
    /**
     * 集合: 用户归属组
     */
    String DATASET_USER_REF = "USER_REF";
    /**
     * 集合: 包含嵌套数据
     */
    String DATASET_WITH_NESTED = "WITH_NESTED";


    /**
     * 集合: DEFAULT
     */
    Page<ResGroupsDTO> fetchDefault(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 当前用户权限组
     */
    Page<ResGroupsDTO> fetchCurUserRef(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 模型同步数据集
     */
    Page<ResGroupsDTO> fetchPsmodelSync(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 用户归属组
     */
    Page<ResGroupsDTO> fetchUserRef(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 包含嵌套数据
     */
    Page<ResGroupsDTO> fetchWithNested(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
}