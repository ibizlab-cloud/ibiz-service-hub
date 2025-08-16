package net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.MsgOpenAccessDTO;
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
 * 接入开放平台
 * 
 * @see ibizmos:/psmodules/notify/psdataentities/MSG_OPEN_ACCESS/.ibizmodel.index
 */
public interface IMsgOpenAccessService extends IDEService<MsgOpenAccessDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/notify/PSDATAENTITIES/MsgOpenAccess.json";

  /**
   * 属性: 开放应用
   */
  String FIELD_ACCESSID = "ACCESSID";
  /**
   * 属性: 应用名称
   */
  String FIELD_ACCESSNAME = "ACCESSNAME";
  /**
   * 属性: 开放平台类型
   */
  String FIELD_OPEN_TYPE = "OPEN_TYPE";
  /**
   * 属性: AccessKey(AppId)
   */
  String FIELD_ACCESS_KEY = "ACCESS_KEY";
  /**
   * 属性: SecretKey(AppSecret)
   */
  String FIELD_SECRET_KEY = "SECRET_KEY";
  /**
   * 属性: RegionId（CorpId)
   */
  String FIELD_REGION_ID = "REGION_ID";
  /**
   * 属性: 管理账号token
   */
  String FIELD_ACCESS_TOKEN = "ACCESS_TOKEN";
  /**
   * 属性: 管理账号token过期时间
   */
  String FIELD_EXPIRES_TIME = "EXPIRES_TIME";
  /**
   * 属性: 是否禁用
   */
  String FIELD_DISABLED = "DISABLED";
  /**
   * 属性: RedirectURI
   */
  String FIELD_REDIRECT_URI = "REDIRECT_URI";
  /**
   * 属性: NotifyUrl
   */
  String FIELD_NOTIFY_URL = "NOTIFY_URL";
  /**
   * 属性: AGENT_ID
   */
  String FIELD_AGENT_ID = "AGENT_ID";
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

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "MsgOpenAccessDTO":
                return new MsgOpenAccessDTO();
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
                this.create((MsgOpenAccessDTO) args[0]);
                return null;
            case "update" :
                this.update((MsgOpenAccessDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((MsgOpenAccessDTO) args[0]);
            case "checkkey" :
                return this.checkKey((MsgOpenAccessDTO) args[0]);
            case "save" :
                this.save((MsgOpenAccessDTO) args[0]);
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
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_OPEN_ACCESS/psdeactions/Create.ibizmodel.yaml
     */
    default void create(MsgOpenAccessDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_OPEN_ACCESS/psdeactions/Update.ibizmodel.yaml
     */
    default void update(MsgOpenAccessDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_OPEN_ACCESS/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_OPEN_ACCESS/psdeactions/Get.ibizmodel.yaml
     */
    default MsgOpenAccessDTO get(String key) throws Throwable {
        return (MsgOpenAccessDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_OPEN_ACCESS/psdeactions/GetDraft.ibizmodel.yaml
     */
    default MsgOpenAccessDTO getDraft(MsgOpenAccessDTO dto) throws Throwable {
        return (MsgOpenAccessDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_OPEN_ACCESS/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(MsgOpenAccessDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_OPEN_ACCESS/psdeactions/Save.ibizmodel.yaml
     */
    default void save(MsgOpenAccessDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_OPEN_ACCESS/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_OPEN_ACCESS/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<MsgOpenAccessDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<MsgOpenAccessDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_OPEN_ACCESS/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<MsgOpenAccessDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<MsgOpenAccessDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/MSG_OPEN_ACCESS/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<MsgOpenAccessDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<MsgOpenAccessDTO>) obj;
    }

}

