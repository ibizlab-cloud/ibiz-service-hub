package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.MailFollowersDTO;

/**
 * 实体[MAIL_FOLLOWERS]服务对象接口
 * 
 */
@Qualifier(OdooModels.MAIL_FOLLOWERS)
public interface IMailFollowersService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<MailFollowersDTO, net.ibizsys.central.util.ISearchContextDTO>{

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
     * 查询: 消息提醒
     */
    String DATAQUERY_MAIL_MESSAGE_NOTIFY = "MAIL_MESSAGE_NOTIFY";
    /**
     * 集合: DEFAULT
     */
    String DATASET_DEFAULT = "DEFAULT";
    /**
     * 集合: 常规
     */
    String DATASET_COMMON = "COMMON";
    /**
     * 集合: 评论提醒
     */
    String DATASET_MAIL_MESSAGE_ATTENTION = "MAIL_MESSAGE_ATTENTION";


    /**
     * 集合: DEFAULT
     */
    Page<MailFollowersDTO> fetchDefault(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 常规
     */
    Page<MailFollowersDTO> fetchCommon(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 评论提醒
     */
    Page<MailFollowersDTO> fetchMailMessageAttention(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
}