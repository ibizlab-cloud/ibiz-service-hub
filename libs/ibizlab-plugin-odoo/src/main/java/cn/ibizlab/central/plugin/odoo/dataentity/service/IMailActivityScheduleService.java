package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.MailActivityScheduleDTO;

/**
 * 实体[MAIL_ACTIVITY_SCHEDULE]服务对象接口
 * 
 */
@Qualifier(OdooModels.MAIL_ACTIVITY_SCHEDULE)
public interface IMailActivityScheduleService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<MailActivityScheduleDTO, net.ibizsys.central.util.ISearchContextDTO>{

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
     * 行为: 安排
     */
    String ACTION_ACTION_SCHEDULE_ACTIVITIES = "ACTION_SCHEDULE_ACTIVITIES";
    /**
     * 行为: nothing
     */
    String ACTION_NOTHING = "NOTHING";
    /**
     * 行为: 安排并标记完成
     */
    String ACTION_SCHEDULE_ACTIVITIES_DONE = "SCHEDULE_ACTIVITIES_DONE";
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
     * 行为: 安排
     */
    void actionScheduleActivities(MailActivityScheduleDTO dto) throws Throwable;
    /**
     * 行为: 安排并标记完成
     */
    void scheduleActivitiesDone(MailActivityScheduleDTO dto) throws Throwable;

    /**
     * 集合: DEFAULT
     */
    Page<MailActivityScheduleDTO> fetchDefault(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
}