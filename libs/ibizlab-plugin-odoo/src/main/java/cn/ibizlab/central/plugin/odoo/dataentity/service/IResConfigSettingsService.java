package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResConfigSettingsDTO;

/**
 * 实体[RES_CONFIG_SETTINGS]服务对象接口
 * 
 */
@Qualifier(OdooModels.RES_CONFIG_SETTINGS)
public interface IResConfigSettingsService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ResConfigSettingsDTO, net.ibizsys.central.util.ISearchContextDTO>{

    /**
     * 行为: Create
     */
    String ACTION_CREATE = "CREATE";
    /**
     * 行为: CreateTemp
     */
    String ACTION_CREATETEMP = "CREATETEMP";
    /**
     * 行为: CreateTempMajor
     */
    String ACTION_CREATETEMPMAJOR = "CREATETEMPMAJOR";
    /**
     * 行为: Update
     */
    String ACTION_UPDATE = "UPDATE";
    /**
     * 行为: UpdateTemp
     */
    String ACTION_UPDATETEMP = "UPDATETEMP";
    /**
     * 行为: UpdateTempMajor
     */
    String ACTION_UPDATETEMPMAJOR = "UPDATETEMPMAJOR";
    /**
     * 行为: Remove
     */
    String ACTION_REMOVE = "REMOVE";
    /**
     * 行为: RemoveTemp
     */
    String ACTION_REMOVETEMP = "REMOVETEMP";
    /**
     * 行为: RemoveTempMajor
     */
    String ACTION_REMOVETEMPMAJOR = "REMOVETEMPMAJOR";
    /**
     * 行为: Get
     */
    String ACTION_GET = "GET";
    /**
     * 行为: GetTemp
     */
    String ACTION_GETTEMP = "GETTEMP";
    /**
     * 行为: GetTempMajor
     */
    String ACTION_GETTEMPMAJOR = "GETTEMPMAJOR";
    /**
     * 行为: GetDraft
     */
    String ACTION_GETDRAFT = "GETDRAFT";
    /**
     * 行为: GetDraftTemp
     */
    String ACTION_GETDRAFTTEMP = "GETDRAFTTEMP";
    /**
     * 行为: GetDraftTempMajor
     */
    String ACTION_GETDRAFTTEMPMAJOR = "GETDRAFTTEMPMAJOR";
    /**
     * 行为: CheckKey
     */
    String ACTION_CHECKKEY = "CHECKKEY";
    /**
     * 行为: Save
     */
    String ACTION_SAVE = "SAVE";
    /**
     * 行为: 默认提取固定标识属性值
     */
    String ACTION_DEFAULT_GET = "DEFAULT_GET";
    /**
     * 行为: 获取配置值
     */
    String ACTION_GET_VALUES = "GET_VALUES";
    /**
     * 行为: nothing
     */
    String ACTION_NOTHING = "NOTHING";
    /**
     * 行为: 设置配置值
     */
    String ACTION_SET_VALUES = "SET_VALUES";
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
     * 行为: 默认提取固定标识属性值
     */
    void defaultGet(ResConfigSettingsDTO dto) throws Throwable;
    /**
     * 行为: 获取配置值
     */
    ResConfigSettingsDTO getValues(String key) throws Throwable;
    /**
     * 行为: 设置配置值
     */
    void setValues(ResConfigSettingsDTO dto) throws Throwable;

    /**
     * 集合: DEFAULT
     */
    Page<ResConfigSettingsDTO> fetchDefault(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
}