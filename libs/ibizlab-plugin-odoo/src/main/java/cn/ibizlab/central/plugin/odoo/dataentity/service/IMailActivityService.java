package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.MailActivityDTO;

/**
 * 实体[MAIL_ACTIVITY]服务对象接口
 * 
 */
@Qualifier(OdooModels.MAIL_ACTIVITY)
public interface IMailActivityService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<MailActivityDTO, net.ibizsys.central.util.ISearchContextDTO>{

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
     * 行为: 完成活动
     */
    String ACTION_ACTION_DONE = "ACTION_DONE";
    /**
     * 行为: 延迟活动
     */
    String ACTION_ACTION_SNOOZE = "ACTION_SNOOZE";
    /**
     * 查询: DEFAULT
     */
    String DATAQUERY_DEFAULT = "DEFAULT";
    /**
     * 查询: 默认（全部数据）
     */
    String DATAQUERY_VIEW = "VIEW";
    /**
     * 查询: 未完成
     */
    String DATAQUERY_UN_FINISHED = "UN_FINISHED";
    /**
     * 集合: DEFAULT
     */
    String DATASET_DEFAULT = "DEFAULT";
    /**
     * 集合: 未完成
     */
    String DATASET_UN_FINISHED = "UN_FINISHED";

    /**
     * 行为: 完成活动
     */
    void actionDone(MailActivityDTO dto) throws Throwable;
    /**
     * 行为: 延迟活动
     */
    void actionSnooze(MailActivityDTO dto) throws Throwable;

    /**
     * 集合: DEFAULT
     */
    Page<MailActivityDTO> fetchDefault(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 未完成
     */
    Page<MailActivityDTO> fetchUnFinished(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
}