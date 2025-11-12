package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResUsersDTO;

/**
 * 实体[RES_USERS]服务对象接口
 * 
 */
@Qualifier(OdooModels.RES_USERS)
public interface IResUsersService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ResUsersDTO, net.ibizsys.central.util.ISearchContextDTO>{

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
     * 行为: 修改密码
     */
    String ACTION_CHANGE_PASSWORD = "CHANGE_PASSWORD";
    /**
     * 行为: 当前登录人的user
     */
    String ACTION_CURRENT_USER = "CURRENT_USER";
    /**
     * 行为: 邀请新用户
     */
    String ACTION_INVITE_USERS = "INVITE_USERS";
    /**
     * 行为: 未登录用户
     */
    String ACTION_NON_LOGGED_IN_USERS = "NON_LOGGED_IN_USERS";
    /**
     * 行为: 用户计数器
     */
    String ACTION_USER_COUNTER = "USER_COUNTER";
    /**
     * 查询: DEFAULT
     */
    String DATAQUERY_DEFAULT = "DEFAULT";
    /**
     * 查询: 默认（全部数据）
     */
    String DATAQUERY_VIEW = "VIEW";
    /**
     * 查询: 未登录过的用户
     */
    String DATAQUERY_NON_LOGGED_IN_USERS = "NON_LOGGED_IN_USERS";
    /**
     * 查询: 简单查询
     */
    String DATAQUERY_SIMPLE = "SIMPLE";
    /**
     * 查询: 未被使用的用户
     */
    String DATAQUERY_UNUSE = "UNUSE";
    /**
     * 集合: DEFAULT
     */
    String DATASET_DEFAULT = "DEFAULT";
    /**
     * 集合: 未登录用户
     */
    String DATASET_NON_LOGGED_IN_USERS = "NON_LOGGED_IN_USERS";
    /**
     * 集合: 简单查询
     */
    String DATASET_SIMPLE = "SIMPLE";
    /**
     * 集合: 未被使用的用户
     */
    String DATASET_UNUSE = "UNUSE";

    /**
     * 行为: 修改密码
     */
    void changePassword(ResUsersDTO dto) throws Throwable;
    /**
     * 行为: 当前登录人的user
     */
    void currentUser(ResUsersDTO dto) throws Throwable;
    /**
     * 行为: 邀请新用户
     */
    void inviteUsers(ResUsersDTO dto) throws Throwable;
    /**
     * 行为: 未登录用户
     */
    void nonLoggedInUsers(ResUsersDTO dto) throws Throwable;
    
    /**
     * 集合: DEFAULT
     */
    Page<ResUsersDTO> fetchDefault(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 未登录用户
     */
    Page<ResUsersDTO> fetchNonLoggedInUsers(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 简单查询
     */
    Page<ResUsersDTO> fetchSimple(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 未被使用的用户
     */
    Page<ResUsersDTO> fetchUnuse(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
}