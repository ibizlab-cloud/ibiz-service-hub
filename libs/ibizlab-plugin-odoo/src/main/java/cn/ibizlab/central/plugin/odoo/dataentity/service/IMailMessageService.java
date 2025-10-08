package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.MailMessageDTO;

/**
 * 实体[MAIL_MESSAGE]服务对象接口
 * 
 */
@Qualifier(OdooModels.MAIL_MESSAGE)
public interface IMailMessageService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<MailMessageDTO, net.ibizsys.central.util.ISearchContextDTO>{

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
     * 行为: 添加收藏
     */
    String ACTION_ADD_FAVORITE = "ADD_FAVORITE";
    /**
     * 行为: 删除评论
     */
    String ACTION_DELETE = "DELETE";
    /**
     * 行为: 置顶
     */
    String ACTION_PIN = "PIN";
    /**
     * 行为: 移除所有收藏
     */
    String ACTION_REMOVE_ALL_FAVORITES = "REMOVE_ALL_FAVORITES";
    /**
     * 行为: 移除收藏
     */
    String ACTION_REMOVE_FAVORITE = "REMOVE_FAVORITE";
    /**
     * 行为: 取消置顶
     */
    String ACTION_UNPIN = "UNPIN";
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
     * 查询: 常规(全部)
     */
    String DATAQUERY_COMMON_ALL = "COMMON_ALL";
    /**
     * 查询: 当前用户
     */
    String DATAQUERY_CUR_USER = "CUR_USER";
    /**
     * 查询: 置顶消息
     */
    String DATAQUERY_PINNED = "PINNED";
    /**
     * 集合: DEFAULT
     */
    String DATASET_DEFAULT = "DEFAULT";
    /**
     * 集合: 常规
     */
    String DATASET_COMMON = "COMMON";
    /**
     * 集合: 常规(全部)
     */
    String DATASET_COMMON_ALL = "COMMON_ALL";
    /**
     * 集合: 当前用户消息
     */
    String DATASET_CUR_USER = "CUR_USER";
    /**
     * 集合: 置顶消息
     */
    String DATASET_PINNED = "PINNED";

    /**
     * 行为: 添加收藏
     */
    void addFavorite(MailMessageDTO dto) throws Throwable;
    /**
     * 行为: 删除评论
     */
    void delete(MailMessageDTO dto) throws Throwable;
    /**
     * 行为: 置顶
     */
    void pin(MailMessageDTO dto) throws Throwable;
    /**
     * 行为: 移除所有收藏
     */
    void removeAllFavorites(MailMessageDTO dto) throws Throwable;
    /**
     * 行为: 移除收藏
     */
    void removeFavorite(MailMessageDTO dto) throws Throwable;
    /**
     * 行为: 取消置顶
     */
    void unpin(MailMessageDTO dto) throws Throwable;

    /**
     * 集合: DEFAULT
     */
    Page<MailMessageDTO> fetchDefault(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 常规
     */
    Page<MailMessageDTO> fetchCommon(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 常规(全部)
     */
    Page<MailMessageDTO> fetchCommonAll(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 当前用户消息
     */
    Page<MailMessageDTO> fetchCurUser(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 置顶消息
     */
    Page<MailMessageDTO> fetchPinned(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
}