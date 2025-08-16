package net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.MsgBodyDTO;
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
 * 消息
 * 
 * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/.ibizmodel.index
 */
public interface IMsgBodyService extends IDEService<MsgBodyDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/notify/PSDATAENTITIES/MsgBody.json";

  /**
   * 属性: 是否出错
   */
  String FIELD_ISERROR = "ISERROR";
  /**
   * 属性: 是否发送
   */
  String FIELD_ISSEND = "ISSEND";
  /**
   * 属性: 消息标识
   */
  String FIELD_MSGID = "MSGID";
  /**
   * 属性: 目标用户
   */
  String FIELD_TOUSERS = "TOUSERS";
  /**
   * 属性: 消息链接(PC)
   */
  String FIELD_MSGLINK_PC = "MSGLINK_PC";
  /**
   * 属性: 消息链接
   */
  String FIELD_MSGLINK = "MSGLINK";
  /**
   * 属性: 消息标题
   */
  String FIELD_SUBJECT = "SUBJECT";
  /**
   * 属性: 消息内容
   */
  String FIELD_CONTENT = "CONTENT";
  /**
   * 属性: 消息类型
   */
  String FIELD_MSGTYPE = "MSGTYPE";
  /**
   * 属性: 消息名称
   */
  String FIELD_MSGNAME = "MSGNAME";
  /**
   * 属性: 消息模板标识
   */
  String FIELD_TEMPLATEID = "TEMPLATEID";
  /**
   * 属性: 错误信息
   */
  String FIELD_ERRORINFO = "ERRORINFO";
  /**
   * 属性: 用户数据
   */
  String FIELD_USERDATA = "USERDATA";
  /**
   * 属性: 用户数据2
   */
  String FIELD_USERDATA2 = "USERDATA2";
  /**
   * 属性: 消息模板参数
   */
  String FIELD_TEMPLPARAMS = "TEMPLPARAMS";
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
   * 查询: 数据查询
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
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
            case "MsgBodyDTO":
                return new MsgBodyDTO();
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
                this.create((MsgBodyDTO) args[0]);
                return null;
            case "update" :
                this.update((MsgBodyDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((MsgBodyDTO) args[0]);
            case "checkkey" :
                return this.checkKey((MsgBodyDTO) args[0]);
            case "save" :
                this.save((MsgBodyDTO) args[0]);
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
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdeactions/Create.ibizmodel.yaml
     */
    default void create(MsgBodyDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdeactions/Update.ibizmodel.yaml
     */
    default void update(MsgBodyDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdeactions/Get.ibizmodel.yaml
     */
    default MsgBodyDTO get(String key) throws Throwable {
        return (MsgBodyDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdeactions/GetDraft.ibizmodel.yaml
     */
    default MsgBodyDTO getDraft(MsgBodyDTO dto) throws Throwable {
        return (MsgBodyDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(MsgBodyDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdeactions/Save.ibizmodel.yaml
     */
    default void save(MsgBodyDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<MsgBodyDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<MsgBodyDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<MsgBodyDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<MsgBodyDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_BODY/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<MsgBodyDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<MsgBodyDTO>) obj;
    }

}

