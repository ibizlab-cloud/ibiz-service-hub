package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.UserAuthDTO;
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
 * 账号绑定
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/.ibizmodel.index
 */
public interface IUserAuthService extends IDEService<UserAuthDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/uaa/PSDATAENTITIES/UserAuth.json";

  /**
   * 属性: 标识
   */
  String FIELD_AUTHID = "AUTHID";
  /**
   * 属性: 认证类型
   */
  String FIELD_IDENTITY_TYPE = "IDENTITY_TYPE";
  /**
   * 属性: 认证标识
   */
  String FIELD_IDENTIFIER = "IDENTIFIER";
  /**
   * 属性: 凭据
   */
  String FIELD_CREDENTIAL = "CREDENTIAL";
  /**
   * 属性: 员工姓名
   */
  String FIELD_EMPNAME = "EMPNAME";
  /**
   * 属性: 用户名称
   */
  String FIELD_USERNAME = "USERNAME";
  /**
   * 属性: 用户标识
   */
  String FIELD_USERID = "USERID";
  /**
   * 属性: 员工标识
   */
  String FIELD_EMPID = "EMPID";
  /**
   * 属性: 开放用户标识
   */
  String FIELD_OPENUSERID = "OPENUSERID";
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
   * 行为: 自动生成
   */
  String ACTION_AUTO = "Auto";
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
            case "UserAuthDTO":
                return new UserAuthDTO();
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
                this.create((UserAuthDTO) args[0]);
                return null;
            case "update" :
                this.update((UserAuthDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((UserAuthDTO) args[0]);
            case "auto" :
                this.auto((UserAuthDTO) args[0]);
                return null;
            case "checkkey" :
                return this.checkKey((UserAuthDTO) args[0]);
            case "save" :
                this.save((UserAuthDTO) args[0]);
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
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdeactions/Create.ibizmodel.yaml
     */
    default void create(UserAuthDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdeactions/Update.ibizmodel.yaml
     */
    default void update(UserAuthDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdeactions/Get.ibizmodel.yaml
     */
    default UserAuthDTO get(String key) throws Throwable {
        return (UserAuthDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdeactions/GetDraft.ibizmodel.yaml
     */
    default UserAuthDTO getDraft(UserAuthDTO dto) throws Throwable {
        return (UserAuthDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * 自动生成
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdeactions/Auto.ibizmodel.yaml
     */
    default void auto(UserAuthDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Auto", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(UserAuthDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdeactions/Save.ibizmodel.yaml
     */
    default void save(UserAuthDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<UserAuthDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<UserAuthDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<UserAuthDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<UserAuthDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_AUTH/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<UserAuthDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<UserAuthDTO>) obj;
    }

}

