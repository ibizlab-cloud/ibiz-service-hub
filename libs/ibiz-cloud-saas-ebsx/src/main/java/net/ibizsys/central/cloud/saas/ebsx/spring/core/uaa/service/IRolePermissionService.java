package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.RolePermissionAuditDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.RolePermissionDTO;
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
 * 角色权限关系
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/.ibizmodel.index
 */
public interface IRolePermissionService extends IDEService<RolePermissionDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/uaa/PSDATAENTITIES/RolePermission.json";

  /**
   * 属性: 角色权限关系表标识
   */
  String FIELD_SYS_ROLE_PERMISSIONID = "SYS_ROLE_PERMISSIONID";
  /**
   * 属性: 角色表标识
   */
  String FIELD_SYS_ROLEID = "SYS_ROLEID";
  /**
   * 属性: 角色名称
   */
  String FIELD_SYS_ROLENAME = "SYS_ROLENAME";
  /**
   * 属性: 权限表标识
   */
  String FIELD_SYS_PERMISSIONID = "SYS_PERMISSIONID";
  /**
   * 属性: 权限名称
   */
  String FIELD_SYS_PERMISSIONNAME = "SYS_PERMISSIONNAME";
  /**
   * 属性: 实体名
   */
  String FIELD_ENTITYNAME = "ENTITYNAME";
  /**
   * 属性: 权限类型
   */
  String FIELD_PERMISSIONTYPE = "PERMISSIONTYPE";
  /**
   * 属性: 权限标识
   */
  String FIELD_PERMISSIONTAG = "PERMISSIONTAG";
  /**
   * 属性: 系统
   */
  String FIELD_DCSYSTEMNAME = "DCSYSTEMNAME";
  /**
   * 属性: 建立时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 系统标记
   */
  String FIELD_SYSTEMFLAG = "SYSTEMFLAG";
  /**
   * 属性: 启用标志
   */
  String FIELD_ISVALID = "ISVALID";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 系统
   */
  String FIELD_PSSYSTEMID = "PSSYSTEMID";
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
   * 查询: 审计属性查询
   */
  String DATAQUERY_AUDIT = "AUDIT";
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
            case "RolePermissionAuditDTO":
                return new RolePermissionAuditDTO();
            case "RolePermissionDTO":
                return new RolePermissionDTO();
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
                this.create((RolePermissionDTO) args[0]);
                return null;
            case "update" :
                this.update((List<RolePermissionDTO>) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((RolePermissionDTO) args[0]);
            case "checkkey" :
                return this.checkKey((RolePermissionDTO) args[0]);
            case "save" :
                this.save((RolePermissionDTO) args[0]);
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
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdeactions/Create.ibizmodel.yaml
     */
    default void create(RolePermissionDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdeactions/Update.ibizmodel.yaml
     */
    default void update(List<RolePermissionDTO> dtos) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dtos}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdeactions/Get.ibizmodel.yaml
     */
    default RolePermissionDTO get(String key) throws Throwable {
        return (RolePermissionDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdeactions/GetDraft.ibizmodel.yaml
     */
    default RolePermissionDTO getDraft(RolePermissionDTO dto) throws Throwable {
        return (RolePermissionDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(RolePermissionDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdeactions/Save.ibizmodel.yaml
     */
    default void save(RolePermissionDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<RolePermissionDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<RolePermissionDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 审计属性查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdedataqueries/AUDIT.ibizmodel.ui
     */
    default List<RolePermissionAuditDTO> selectAudit(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("AUDIT", dto);
        return (List<RolePermissionAuditDTO>) obj;
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<RolePermissionDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<RolePermissionDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<RolePermissionDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<RolePermissionDTO>) obj;
    }

}

