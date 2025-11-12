package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.FetchmailServerDTO;

/**
 * 实体[FETCHMAIL_SERVER]服务对象接口
 * 
 */
@Qualifier(OdooModels.FETCHMAIL_SERVER)
public interface IFetchmailServerService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<FetchmailServerDTO, net.ibizsys.central.util.ISearchContextDTO>{

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
     * 行为: fetch_mail
     */
    String ACTION_FETCH_MAIL = "FETCH_MAIL";
    /**
     * 行为: 重置确认
     */
    String ACTION_SET_DRAFT = "SET_DRAFT";
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
     * 行为: fetch_mail
     */
    void fetchMail(FetchmailServerDTO dto) throws Throwable;
    /**
     * 行为: 重置确认
     */
    void setDraft(FetchmailServerDTO dto) throws Throwable;

    /**
     * 集合: DEFAULT
     */
    Page<FetchmailServerDTO> fetchDefault(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
}