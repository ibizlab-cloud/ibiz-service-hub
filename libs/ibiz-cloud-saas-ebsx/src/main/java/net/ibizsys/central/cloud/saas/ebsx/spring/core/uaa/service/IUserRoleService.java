package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.UserRoleDTO;
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
 * 用户角色关系
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/.ibizmodel.index
 */
public interface IUserRoleService extends IDEService<UserRoleDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/uaa/PSDATAENTITIES/UserRole.json";

  /**
   * 属性: 用户角色关系标识
   */
  String FIELD_SYS_USER_ROLEID = "SYS_USER_ROLEID";
  /**
   * 属性: 角色
   */
  String FIELD_SYS_ROLEID = "SYS_ROLEID";
  /**
   * 属性: 角色名称
   */
  String FIELD_SYS_ROLENAME = "SYS_ROLENAME";
  /**
   * 属性: 用户标识
   */
  String FIELD_USERID = "USERID";
  /**
   * 属性: 用户名称
   */
  String FIELD_PERSONNAME = "PERSONNAME";
  /**
   * 属性: 登录名
   */
  String FIELD_LOGINNAME = "LOGINNAME";
  /**
   * 属性: 单位标识
   */
  String FIELD_ORGID = "ORGID";
  /**
   * 属性: 单位
   */
  String FIELD_ORGNAME = "ORGNAME";
  /**
   * 属性: 主部门标识
   */
  String FIELD_MDEPTID = "MDEPTID";
  /**
   * 属性: 主部门
   */
  String FIELD_MDEPTNAME = "MDEPTNAME";
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
  String FIELD_UPDATEMANNAME = "UPDATEMANNAME";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 创建人
   */
  String FIELD_CREATEMANNAME = "CREATEMANNAME";
  /**
   * 属性: 启用标志
   */
  String FIELD_ISVALID = "ISVALID";
  /**
   * 属性: 角色标识
   */
  String FIELD_ROLETAG = "ROLETAG";
  /**
   * 属性: 用户模式
   */
  String FIELD_USERMODE = "USERMODE";
  /**
   * 属性: 全局标记
   */
  String FIELD_GLOBALFLAG = "GLOBALFLAG";
  /**
   * 属性: 系统
   */
  String FIELD_DCSYSTEMNAME = "DCSYSTEMNAME";
  /**
   * 属性: 系统
   */
  String FIELD_DCSYSTEMID = "DCSYSTEMID";
  /**
   * 属性: 排序
   */
  String FIELD_SHOWORDER = "SHOWORDER";
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
   * 行为: 查询用户角色
   */
  String ACTION_FINDROLE = "FindRole";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 查询: 授权系统
   */
  String DATAQUERY_ACCESSDCSYSTEM = "AccessDCSystem";
  /**
   * 查询: 系统分配用户
   */
  String DATAQUERY_BYDCSYSTEM = "ByDCSystem";
  /**
   * 查询: DEFAULT
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 排除数据
   */
  String DATAQUERY_EXCLUDE = "EXCLUDE";
  /**
   * 查询: 查询用户模型
   */
  String DATAQUERY_GETUSERMODE = "GetUsermode";
  /**
   * 查询: 授权系统（全局）
   */
  String DATAQUERY_GLOBALACCESSDCSYSTEM = "GlobalAccessDCSystem";
  /**
   * 查询: 查询多部门成员
   */
  String DATAQUERY_MULTIDEPTUSER = "MultiDeptUser";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: 授权系统
   */
  String DATASET_ACCESSDCSYSTEM = "AccessDCSystem";
  /**
   * 集合: 系统分配用户
   */
  String DATASET_BYDCSYSTEM = "ByDCSystem";
  /**
   * 集合: DEFAULT
   */
  String DATASET_DEFAULT = "DEFAULT";
  /**
   * 集合: 排除数据
   */
  String DATASET_EXCLUDE = "EXCLUDE";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "UserRoleDTO":
                return new UserRoleDTO();
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
                this.create((UserRoleDTO) args[0]);
                return null;
            case "update" :
                this.update((List<UserRoleDTO>) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((UserRoleDTO) args[0]);
            case "checkkey" :
                return this.checkKey((UserRoleDTO) args[0]);
            case "findrole" :
                this.findRole((UserRoleDTO) args[0]);
                return null;
            case "save" :
                this.save((UserRoleDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "accessdcsystem" :
               return this.fetchAccessDCSystem((ISearchContextDTO) args[0]);
            case "bydcsystem" :
               return this.fetchByDCSystem((ISearchContextDTO) args[0]);
            case "default" :
               return this.fetchDefault((ISearchContextDTO) args[0]);
            case "exclude" :
               return this.fetchExclude((ISearchContextDTO) args[0]);
        }
        return this.getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
    } 

    /**
     * Create
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdeactions/Create.ibizmodel.yaml
     */
    default void create(UserRoleDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdeactions/Update.ibizmodel.yaml
     */
    default void update(List<UserRoleDTO> dtos) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dtos}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdeactions/Get.ibizmodel.yaml
     */
    default UserRoleDTO get(String key) throws Throwable {
        return (UserRoleDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdeactions/GetDraft.ibizmodel.yaml
     */
    default UserRoleDTO getDraft(UserRoleDTO dto) throws Throwable {
        return (UserRoleDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(UserRoleDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 查询用户角色
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdeactions/FindRole.ibizmodel.yaml
     */
    default void findRole(UserRoleDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("FindRole", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdeactions/Save.ibizmodel.yaml
     */
    default void save(UserRoleDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 授权系统
     * 包含数据查询：授权系统、授权系统（全局）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdedatasets/AccessDCSystem.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdedataqueries/AccessDCSystem.ibizmodel.ui
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdedataqueries/GlobalAccessDCSystem.ibizmodel.ui
     */
    default Page<UserRoleDTO> fetchAccessDCSystem(ISearchContextDTO dto) throws Throwable {
        return (Page<UserRoleDTO>) this.getDataEntityRuntime().fetchDataSet("AccessDCSystem", null, new Object[]{dto}, true);
    }

    /**
     * 系统分配用户
     * 包含数据查询：系统分配用户
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdedatasets/ByDCSystem.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdedataqueries/ByDCSystem.ibizmodel.ui
     */
    default Page<UserRoleDTO> fetchByDCSystem(ISearchContextDTO dto) throws Throwable {
        return (Page<UserRoleDTO>) this.getDataEntityRuntime().fetchDataSet("ByDCSystem", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<UserRoleDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<UserRoleDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }

    /**
     * 排除数据
     * 包含数据查询：排除数据
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdedatasets/EXCLUDE.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdedataqueries/EXCLUDE.ibizmodel.ui
     */
    default Page<UserRoleDTO> fetchExclude(ISearchContextDTO dto) throws Throwable {
        return (Page<UserRoleDTO>) this.getDataEntityRuntime().fetchDataSet("EXCLUDE", null, new Object[]{dto}, true);
    }


    /**
     * 授权系统
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdedataqueries/AccessDCSystem.ibizmodel.ui
     */
    default List<UserRoleDTO> selectAccessDCSystem(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("AccessDCSystem", dto);
        return (List<UserRoleDTO>) obj;
    }


    /**
     * 系统分配用户
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdedataqueries/ByDCSystem.ibizmodel.ui
     */
    default List<UserRoleDTO> selectByDCSystem(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("ByDCSystem", dto);
        return (List<UserRoleDTO>) obj;
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<UserRoleDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<UserRoleDTO>) obj;
    }


    /**
     * 排除数据
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdedataqueries/EXCLUDE.ibizmodel.ui
     */
    default List<UserRoleDTO> selectExclude(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("EXCLUDE", dto);
        return (List<UserRoleDTO>) obj;
    }


    /**
     * 查询用户模型
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdedataqueries/GetUsermode.ibizmodel.ui
     */
    default List<UserRoleDTO> selectGetUsermode(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("GetUsermode", dto);
        return (List<UserRoleDTO>) obj;
    }


    /**
     * 授权系统（全局）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdedataqueries/GlobalAccessDCSystem.ibizmodel.ui
     */
    default List<UserRoleDTO> selectGlobalAccessDCSystem(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("GlobalAccessDCSystem", dto);
        return (List<UserRoleDTO>) obj;
    }


    /**
     * 查询多部门成员
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdedataqueries/MultiDeptUser.ibizmodel.ui
     */
    default List<UserRoleDTO> selectMultiDeptUser(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("MultiDeptUser", dto);
        return (List<UserRoleDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<UserRoleDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<UserRoleDTO>) obj;
    }

}

