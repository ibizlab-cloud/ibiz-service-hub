package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResPartnerDTO;

/**
 * 实体[RES_PARTNER]服务对象接口
 * 
 */
@Qualifier(OdooModels.RES_PARTNER)
public interface IResPartnerService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<ResPartnerDTO, net.ibizsys.central.util.ISearchContextDTO>{

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
     * 查询: 频道可邀请的联系人
     */
    String DATAQUERY_CHANNEL_INVITE = "CHANNEL_INVITE";
    /**
     * 查询: 公司联系人
     */
    String DATAQUERY_IS_COMPANY = "IS_COMPANY";
    /**
     * 集合: DEFAULT
     */
    String DATASET_DEFAULT = "DEFAULT";
    /**
     * 集合: 频道可邀请的联系人
     */
    String DATASET_CHANNEL_INVITE = "CHANNEL_INVITE";
    /**
     * 集合: 公司联系人
     */
    String DATASET_IS_COMPANY = "IS_COMPANY";

    /**
     * 行为: 用户计数器
     */
    void userCounter(ResPartnerDTO dto) throws Throwable;

    /**
     * 集合: DEFAULT
     */
    Page<ResPartnerDTO> fetchDefault(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 频道可邀请的联系人
     */
    Page<ResPartnerDTO> fetchChannelInvite(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 公司联系人
     */
    Page<ResPartnerDTO> fetchIsCompany(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
}