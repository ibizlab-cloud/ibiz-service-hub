package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.RoleDTO;
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
 * 系统角色
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/.ibizmodel.index
 */
public interface IRoleService extends IDEService<RoleDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/uaa/PSDATAENTITIES/Role.json";

  /**
   * 属性: 角色标识
   */
  String FIELD_SYS_ROLEID = "SYS_ROLEID";
  /**
   * 属性: 角色名称
   */
  String FIELD_SYS_ROLENAME = "SYS_ROLENAME";
  /**
   * 属性: 备注
   */
  String FIELD_MEMO = "MEMO";
  /**
   * 属性: 父角色标识
   */
  String FIELD_PROLEID = "PROLEID";
  /**
   * 属性: 父角色名称
   */
  String FIELD_PROLENAME = "PROLENAME";
  /**
   * 属性: 建立时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 授权全部用户
   */
  String FIELD_AUTHORIZEALL = "AUTHORIZEALL";
  /**
   * 属性: 系统标记
   */
  String FIELD_SYSTEMFLAG = "SYSTEMFLAG";
  /**
   * 属性: 全局标记
   */
  String FIELD_GLOBALFLAG = "GLOBALFLAG";
  /**
   * 属性: 用户模式
   */
  String FIELD_USERMODE = "USERMODE";
  /**
   * 属性: 角色标识
   */
  String FIELD_ROLETAG = "ROLETAG";
  /**
   * 属性: 系统
   */
  String FIELD_DCSYSTEMNAME = "DCSYSTEMNAME";
  /**
   * 属性: 租户系统标识
   */
  String FIELD_DCSYSTEMID = "DCSYSTEMID";
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
   * 行为: 角色去重查询
   */
  String ACTION_NOREPEAT = "NoRepeat";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 查询: 按系统查询
   */
  String DATAQUERY_BYDCSYSTEM = "ByDCSystem";
  /**
   * 查询: 数据查询2
   */
  String DATAQUERY_CHECKROLEAUTH = "CheckRoleAuth";
  /**
   * 查询: DEFAULT
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 数据查询
   */
  String DATAQUERY_NOREPEAT = "NOREPEAT";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: 按系统查询
   */
  String DATASET_BYDCSYSTEM = "ByDCSystem";
  /**
   * 集合: 验证应用是否全部授权
   */
  String DATASET_CHECKAUTHORIZEALL = "CHECKAUTHORIZEALL";
  /**
   * 集合: DEFAULT
   */
  String DATASET_DEFAULT = "DEFAULT";
  /**
   * 集合: 数据查询
   */
  String DATASET_NOREPEAT = "NOREPEAT";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "RoleDTO":
                return new RoleDTO();
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
                this.create((RoleDTO) args[0]);
                return null;
            case "update" :
                this.update((RoleDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((RoleDTO) args[0]);
            case "checkkey" :
                return this.checkKey((RoleDTO) args[0]);
            case "norepeat" :
                this.noRepeat((RoleDTO) args[0]);
                return null;
            case "save" :
                this.save((RoleDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "bydcsystem" :
               return this.fetchByDCSystem((ISearchContextDTO) args[0]);
            case "checkauthorizeall" :
               return this.fetchCheckAuthorizeall((ISearchContextDTO) args[0]);
            case "default" :
               return this.fetchDefault((ISearchContextDTO) args[0]);
            case "norepeat" :
               return this.fetchNoRepeat((ISearchContextDTO) args[0]);
        }
        return this.getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
    } 

    /**
     * Create
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdeactions/Create.ibizmodel.yaml
     */
    default void create(RoleDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdeactions/Update.ibizmodel.yaml
     */
    default void update(RoleDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdeactions/Get.ibizmodel.yaml
     */
    default RoleDTO get(String key) throws Throwable {
        return (RoleDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdeactions/GetDraft.ibizmodel.yaml
     */
    default RoleDTO getDraft(RoleDTO dto) throws Throwable {
        return (RoleDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(RoleDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 角色去重查询
     * 去除父子关系
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdeactions/NoRepeat.ibizmodel.yaml
     */
    default void noRepeat(RoleDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("NoRepeat", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdeactions/Save.ibizmodel.yaml
     */
    default void save(RoleDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 按系统查询
     * 包含数据查询：按系统查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdedatasets/ByDCSystem.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdedataqueries/ByDCSystem.ibizmodel.ui
     */
    default Page<RoleDTO> fetchByDCSystem(ISearchContextDTO dto) throws Throwable {
        return (Page<RoleDTO>) this.getDataEntityRuntime().fetchDataSet("ByDCSystem", null, new Object[]{dto}, true);
    }

    /**
     * 验证应用是否全部授权
     * 包含数据查询：数据查询2
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdedatasets/CHECKAUTHORIZEALL.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdedataqueries/CheckRoleAuth.ibizmodel.ui
     */
    default Page<RoleDTO> fetchCheckAuthorizeall(ISearchContextDTO dto) throws Throwable {
        return (Page<RoleDTO>) this.getDataEntityRuntime().fetchDataSet("CHECKAUTHORIZEALL", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<RoleDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<RoleDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }

    /**
     * 数据查询
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdedatasets/NOREPEAT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdedataqueries/NOREPEAT.ibizmodel.ui
     */
    default Page<RoleDTO> fetchNoRepeat(ISearchContextDTO dto) throws Throwable {
        return (Page<RoleDTO>) this.getDataEntityRuntime().fetchDataSet("NOREPEAT", null, new Object[]{dto}, true);
    }


    /**
     * 按系统查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdedataqueries/ByDCSystem.ibizmodel.ui
     */
    default List<RoleDTO> selectByDCSystem(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("ByDCSystem", dto);
        return (List<RoleDTO>) obj;
    }


    /**
     * 数据查询2
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdedataqueries/CheckRoleAuth.ibizmodel.ui
     */
    default List<RoleDTO> selectCheckRoleAuth(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("CheckRoleAuth", dto);
        return (List<RoleDTO>) obj;
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<RoleDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<RoleDTO>) obj;
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdedataqueries/NOREPEAT.ibizmodel.ui
     */
    default List<RoleDTO> selectNoRepeat(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("NOREPEAT", dto);
        return (List<RoleDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<RoleDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<RoleDTO>) obj;
    }

}

