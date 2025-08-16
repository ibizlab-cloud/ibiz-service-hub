package net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.MsgAccountDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.MsgAccountSimpleDTO;
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
 * 消息账户
 * 
 * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/.ibizmodel.index
 */
public interface IMsgAccountService extends IDEService<MsgAccountDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/notify/PSDATAENTITIES/MsgAccount.json";

  /**
   * 属性: 邮箱
   */
  String FIELD_EMAIL = "EMAIL";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 手机号
   */
  String FIELD_PHONE = "PHONE";
  /**
   * 属性: 消息账户标识
   */
  String FIELD_MSGACCOUNTID = "MSGACCOUNTID";
  /**
   * 属性: 钉钉账户
   */
  String FIELD_DDACCOUNTID = "DDACCOUNTID";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 消息账户
   */
  String FIELD_MSGACCOUNTNAME = "MSGACCOUNTNAME";
  /**
   * 属性: 微信账户
   */
  String FIELD_WXACCOUNTID = "WXACCOUNTID";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 建立时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 人员
   */
  String FIELD_EMPNAME = "EMPNAME";
  /**
   * 属性: 用户工号
   */
  String FIELD_USERCODE = "USERCODE";
  /**
   * 属性: 人员
   */
  String FIELD_EMPID = "EMPID";
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
            case "MsgAccountDTO":
                return new MsgAccountDTO();
            case "MsgAccountSimpleDTO":
                return new MsgAccountSimpleDTO();
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
                this.create((MsgAccountDTO) args[0]);
                return null;
            case "update" :
                this.update((MsgAccountDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((MsgAccountDTO) args[0]);
            case "checkkey" :
                return this.checkKey((MsgAccountDTO) args[0]);
            case "save" :
                this.save((List<MsgAccountDTO>) args[0]);
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
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdeactions/Create.ibizmodel.yaml
     */
    default void create(MsgAccountDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdeactions/Update.ibizmodel.yaml
     */
    default void update(MsgAccountDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdeactions/Get.ibizmodel.yaml
     */
    default MsgAccountDTO get(String key) throws Throwable {
        return (MsgAccountDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdeactions/GetDraft.ibizmodel.yaml
     */
    default MsgAccountDTO getDraft(MsgAccountDTO dto) throws Throwable {
        return (MsgAccountDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(MsgAccountDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdeactions/Save.ibizmodel.yaml
     */
    default void save(List<MsgAccountDTO> dtos) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dtos}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<MsgAccountDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<MsgAccountDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<MsgAccountDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<MsgAccountDTO>) obj;
    }


    /**
     * 基础属性查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdedataqueries/SIMPLE.ibizmodel.ui
     */
    default List<MsgAccountSimpleDTO> selectSimple(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SIMPLE", dto);
        return (List<MsgAccountSimpleDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_ACCOUNT/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<MsgAccountDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<MsgAccountDTO>) obj;
    }

}

