package net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.MsgSendQueueDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.MsgSendQueueSimpleDTO;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Page;

/**
 * 消息发送队列
 * 
 * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE/.ibizmodel.index
 */
public interface IMsgSendQueueService extends IDEService<MsgSendQueueDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/notify/PSDATAENTITIES/MsgSendQueue.json";

  /**
   * 属性: URL
   */
  String FIELD_URL = "URL";
  /**
   * 属性: 移动端URL
   */
  String FIELD_MOBILEURL = "MOBILEURL";
  /**
   * 属性: 消息名称
   */
  String FIELD_MSGSENDQUEUENAME = "MSGSENDQUEUENAME";
  /**
   * 属性: 内容类型
   */
  String FIELD_CONTENTTYPE = "CONTENTTYPE";
  /**
   * 属性: 目标地址
   */
  String FIELD_DSTADDRESSES = "DSTADDRESSES";
  /**
   * 属性: 消息内容
   */
  String FIELD_CONTENT = "CONTENT";
  /**
   * 属性: 用户数据3
   */
  String FIELD_USERDATA3 = "USERDATA3";
  /**
   * 属性: 消息类型
   */
  String FIELD_MSGTYPE = "MSGTYPE";
  /**
   * 属性: 短消息内容
   */
  String FIELD_SMSCONTENT = "SMSCONTENT";
  /**
   * 属性: 消息标题
   */
  String FIELD_SUBJECT = "SUBJECT";
  /**
   * 属性: 钉钉消息内容
   */
  String FIELD_DDCONTENT = "DDCONTENT";
  /**
   * 属性: 系统
   */
  String FIELD_SYSTEMID = "SYSTEMID";
  /**
   * 属性: 处理时间
   */
  String FIELD_PROCESSTIME = "PROCESSTIME";
  /**
   * 属性: 计划发送时间
   */
  String FIELD_PLANSENDTIME = "PLANSENDTIME";
  /**
   * 属性: IM消息内容
   */
  String FIELD_IMCONTENT = "IMCONTENT";
  /**
   * 属性: 建立时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 用户数据
   */
  String FIELD_USERDATA = "USERDATA";
  /**
   * 属性: 错误信息
   */
  String FIELD_ERRORINFO = "ERRORINFO";
  /**
   * 属性: 文件附件3
   */
  String FIELD_FILEAT3 = "FILEAT3";
  /**
   * 属性: 重要程度
   */
  String FIELD_IMPORTANCEFLAG = "IMPORTANCEFLAG";
  /**
   * 属性: 用户数据4
   */
  String FIELD_USERDATA4 = "USERDATA4";
  /**
   * 属性: 全部地址
   */
  String FIELD_TOTALDSTADDRESSES = "TOTALDSTADDRESSES";
  /**
   * 属性: 文件附件
   */
  String FIELD_FILEAT = "FILEAT";
  /**
   * 属性: 消息发送队列标识
   */
  String FIELD_MSGSENDQUEUEID = "MSGSENDQUEUEID";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 是否发送
   */
  String FIELD_ISSEND = "ISSEND";
  /**
   * 属性: 文件附件4
   */
  String FIELD_FILEAT4 = "FILEAT4";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 微信消息内容
   */
  String FIELD_WXCONTENT = "WXCONTENT";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 文件附件2
   */
  String FIELD_FILEAT2 = "FILEAT2";
  /**
   * 属性: 发送者
   */
  String FIELD_SENDTAG = "SENDTAG";
  /**
   * 属性: 目标用户
   */
  String FIELD_DSTUSERS = "DSTUSERS";
  /**
   * 属性: 发送失败
   */
  String FIELD_ISERROR = "ISERROR";
  /**
   * 属性: 用户数据2
   */
  String FIELD_USERDATA2 = "USERDATA2";
  /**
   * 属性: 系统
   */
  String FIELD_DCSYSTEMNAME = "DCSYSTEMNAME";
  /**
   * 属性: 租户系统标识
   */
  String FIELD_DCSYSTEMID = "DCSYSTEMID";
  /**
   * 属性: 消息模板标记
   */
  String FIELD_TEMPLATEID = "TEMPLATEID";
  /**
   * 行为: Create
   */
  String ACTION_CREATE = "Create";
  /**
   * 行为: Update
   */
  String ACTION_UPDATE = "Update";
  /**
   * 行为: Remove
   */
  String ACTION_REMOVE = "Remove";
  /**
   * 行为: Get
   */
  String ACTION_GET = "Get";
  /**
   * 行为: GetDraft
   */
  String ACTION_GETDRAFT = "GetDraft";
  /**
   * 行为: CheckKey
   */
  String ACTION_CHECKKEY = "CheckKey";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 行为: 发送
   */
  String ACTION_SEND = "Send";
  /**
   * 查询: 数据查询
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 基础属性查询
   */
  String DATAQUERY_SIMPLE = "SIMPLE";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: 数据集
   */
  String DATASET_DEFAULT = "DEFAULT";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "MsgSendQueueDTO":
                return new MsgSendQueueDTO();
            case "MsgSendQueueSimpleDTO":
                return new MsgSendQueueSimpleDTO();
            default:
                return null;
        }
    }

    @Override
    default ISearchContextDTO createSearchContextDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        return new SearchContextDTO();
    }

    @Override
    default Object executeAction(String strActionName, IPSDEAction iPSDEAction, Object[] args) throws Throwable {
        switch (strActionName.toLowerCase()) {
            case "create" :
                this.create((MsgSendQueueDTO) args[0]);
                return null;
            case "update" :
                this.update((MsgSendQueueDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((MsgSendQueueDTO) args[0]);
            case "checkkey" :
                return this.checkKey((MsgSendQueueDTO) args[0]);
            case "save" :
                this.save((List<MsgSendQueueDTO>) args[0]);
                return null;
            case "send" :
                this.send((MsgSendQueueDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "default" :
               return this.fetchDefault((ISearchContextDTO) args[0]);
        }
        return this.getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
    } 

    /**
     * Create
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE/psdeactions/Create.ibizmodel.yaml
     */
    default void create(MsgSendQueueDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE/psdeactions/Update.ibizmodel.yaml
     */
    default void update(MsgSendQueueDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE/psdeactions/Get.ibizmodel.yaml
     */
    default MsgSendQueueDTO get(String key) throws Throwable {
        return (MsgSendQueueDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE/psdeactions/GetDraft.ibizmodel.yaml
     */
    default MsgSendQueueDTO getDraft(MsgSendQueueDTO dto) throws Throwable {
        return (MsgSendQueueDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(MsgSendQueueDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE/psdeactions/Save.ibizmodel.yaml
     */
    default void save(List<MsgSendQueueDTO> dtos) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dtos}, true);
    }

    /**
     * 发送
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE/psdeactions/Send.ibizmodel.yaml
     */
    default void send(MsgSendQueueDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Send", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<MsgSendQueueDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<MsgSendQueueDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<MsgSendQueueDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<MsgSendQueueDTO>) obj;
    }


    /**
     * 基础属性查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE/psdedataqueries/SIMPLE.ibizmodel.ui
     */
    default List<MsgSendQueueSimpleDTO> selectSimple(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SIMPLE", dto);
        return (List<MsgSendQueueSimpleDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_SEND_QUEUE/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<MsgSendQueueDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<MsgSendQueueDTO>) obj;
    }

}

