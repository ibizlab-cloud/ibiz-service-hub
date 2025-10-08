package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.DiscussChannelDTO;

/**
 * 实体[DISCUSS_CHANNEL]服务对象接口
 * 
 */
@Qualifier(OdooModels.DISCUSS_CHANNEL)
public interface IDiscussChannelService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<DiscussChannelDTO, net.ibizsys.central.util.ISearchContextDTO>{

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
     * 行为: 退出频道
     */
    String ACTION_ACTION_UNFOLLOW = "ACTION_UNFOLLOW";
    /**
     * 行为: 邀请成员
     */
    String ACTION_ADD_MEMBERS = "ADD_MEMBERS";
    /**
     * 行为: 加入频道
     */
    String ACTION_CHANNEL_JOIN = "CHANNEL_JOIN";
    /**
     * 行为: 加入频道
     */
    String ACTION_JOIN_CHANNEL = "JOIN_CHANNEL";
    /**
     * 行为: 设置置顶消息
     */
    String ACTION_SET_MESSAGE_PIN = "SET_MESSAGE_PIN";
    /**
     * 查询: DEFAULT
     */
    String DATAQUERY_DEFAULT = "DEFAULT";
    /**
     * 查询: 默认（全部数据）
     */
    String DATAQUERY_VIEW = "VIEW";
    /**
     * 查询: 当前用户加入公共频道
     */
    String DATAQUERY_CUR_USER_PUBLIC = "CUR_USER_PUBLIC";
    /**
     * 查询: 群聊和私人频道查询
     */
    String DATAQUERY_GROUP_PRIVATE = "GROUP_PRIVATE";
    /**
     * 查询: 公共频道查询
     */
    String DATAQUERY_PUBLIC = "PUBLIC";
    /**
     * 集合: DEFAULT
     */
    String DATASET_DEFAULT = "DEFAULT";
    /**
     * 集合: 当前用户加入公共频道
     */
    String DATASET_CUR_USER_PUBLIC = "CUR_USER_PUBLIC";
    /**
     * 集合: 群聊和私人频道查询
     */
    String DATASET_GROUP_PRIVATE = "GROUP_PRIVATE";
    /**
     * 集合: 公共频道查询
     */
    String DATASET_PUBLIC = "PUBLIC";

    /**
     * 行为: 退出频道
     */
    void actionUnfollow(DiscussChannelDTO dto) throws Throwable;
    /**
     * 行为: 邀请成员
     */
    void addMembers(DiscussChannelDTO dto) throws Throwable;
    /**
     * 行为: 加入频道
     */
    void channelJoin(DiscussChannelDTO dto) throws Throwable;
    /**
     * 行为: 加入频道
     */
    void joinChannel(DiscussChannelDTO dto) throws Throwable;
    /**
     * 行为: 设置置顶消息
     */
    void setMessagePin(DiscussChannelDTO dto) throws Throwable;

    /**
     * 集合: DEFAULT
     */
    Page<DiscussChannelDTO> fetchDefault(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 当前用户加入公共频道
     */
    Page<DiscussChannelDTO> fetchCurUserPublic(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 群聊和私人频道查询
     */
    Page<DiscussChannelDTO> fetchGroupPrivate(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 公共频道查询
     */
    Page<DiscussChannelDTO> fetchPublic(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
}