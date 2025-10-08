package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResourceCalendarLeavesDTO;

/**
 * 实体[RESOURCE_CALENDAR_LEAVES]服务对象接口
 * 
 */
@Qualifier(OdooModels.RESOURCE_CALENDAR_LEAVES)
public interface IResourceCalendarLeavesService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ResourceCalendarLeavesDTO, net.ibizsys.central.util.ISearchContextDTO>{

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
     * 查询: 公共节假日
     */
    String DATAQUERY_PUBLIC = "PUBLIC";
    /**
     * 集合: DEFAULT
     */
    String DATASET_DEFAULT = "DEFAULT";
    /**
     * 集合: 公共节假日
     */
    String DATASET_PUBLIC = "PUBLIC";


    /**
     * 集合: DEFAULT
     */
    Page<ResourceCalendarLeavesDTO> fetchDefault(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 公共节假日
     */
    Page<ResourceCalendarLeavesDTO> fetchPublic(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
}