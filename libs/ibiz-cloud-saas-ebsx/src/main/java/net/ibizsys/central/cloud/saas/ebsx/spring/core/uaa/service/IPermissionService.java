package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.PermissionDTO;
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
 * 权限/资源
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/.ibizmodel.index
 */
public interface IPermissionService extends IDEService<PermissionDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/uaa/PSDATAENTITIES/Permission.json";

  /**
   * 属性: 资源标识
   */
  String FIELD_SYS_PERMISSIONID = "SYS_PERMISSIONID";
  /**
   * 属性: 资源名称
   */
  String FIELD_SYS_PERMISSIONNAME = "SYS_PERMISSIONNAME";
  /**
   * 属性: 权限类别
   */
  String FIELD_PERMISSIONTYPE = "PERMISSIONTYPE";
  /**
   * 属性: 权限标识
   */
  String FIELD_PERMISSIONTAG = "PERMISSIONTAG";
  /**
   * 属性: 系统
   */
  String FIELD_PSSYSTEMID = "PSSYSTEMID";
  /**
   * 属性: 建立时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 启用机构范围
   */
  String FIELD_ENABLEORGDR = "ENABLEORGDR";
  /**
   * 属性: 实例标识
   */
  String FIELD_DYNAINSTID = "DYNAINSTID";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 业务数据范围
   */
  String FIELD_BSCOPE = "BSCOPE";
  /**
   * 属性: 机构数据范围
   */
  String FIELD_ORGDR = "ORGDR";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 启用部门范围
   */
  String FIELD_ENABLEDEPTDR = "ENABLEDEPTDR";
  /**
   * 属性: 部门业务代码
   */
  String FIELD_DEPTBC = "DEPTBC";
  /**
   * 属性: 部门数据范围
   */
  String FIELD_DEPTDR = "DEPTDR";
  /**
   * 属性: 系统标记
   */
  String FIELD_SYSTEMFLAG = "SYSTEMFLAG";
  /**
   * 属性: 启用部门代码
   */
  String FIELD_ENABLEDEPTBC = "ENABLEDEPTBC";
  /**
   * 属性: 实体名
   */
  String FIELD_ENTITYNAME = "ENTITYNAME";
  /**
   * 属性: 系统
   */
  String FIELD_DCSYSTEMNAME = "DCSYSTEMNAME";
  /**
   * 属性: 权限名称
   */
  String FIELD_PSYS_PERMISSIONNAME = "PSYS_PERMISSIONNAME";
  /**
   * 属性: 租户系统标识
   */
  String FIELD_DCSYSTEMID = "DCSYSTEMID";
  /**
   * 属性: 资源标识
   */
  String FIELD_PSYS_PERMISSIONID = "PSYS_PERMISSIONID";
  /**
   * 属性: 标识
   */
  String FIELD_ENTITYID = "ENTITYID";
  /**
   * 属性: 全部数据
   */
  String FIELD_ISALLDATA = "ISALLDATA";
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
   * 查询: 权限相关查询
   */
  String DATAQUERY_AUTHORITY = "Authority";
  /**
   * 查询: DEFAULT
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: 权限相关查询
   */
  String DATASET_AUTHORITY = "Authority";
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
            case "PermissionDTO":
                return new PermissionDTO();
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
                this.create((PermissionDTO) args[0]);
                return null;
            case "update" :
                this.update((PermissionDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((PermissionDTO) args[0]);
            case "checkkey" :
                return this.checkKey((PermissionDTO) args[0]);
            case "save" :
                this.save((PermissionDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "authority" :
               return this.fetchAuthority((ISearchContextDTO) args[0]);
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
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdeactions/Create.ibizmodel.yaml
     */
    default void create(PermissionDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdeactions/Update.ibizmodel.yaml
     */
    default void update(PermissionDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdeactions/Get.ibizmodel.yaml
     */
    default PermissionDTO get(String key) throws Throwable {
        return (PermissionDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdeactions/GetDraft.ibizmodel.yaml
     */
    default PermissionDTO getDraft(PermissionDTO dto) throws Throwable {
        return (PermissionDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(PermissionDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdeactions/Save.ibizmodel.yaml
     */
    default void save(PermissionDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 权限相关查询
     * 包含数据查询：权限相关查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdedatasets/Authority.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdedataqueries/Authority.ibizmodel.ui
     */
    default Page<PermissionDTO> fetchAuthority(ISearchContextDTO dto) throws Throwable {
        return (Page<PermissionDTO>) this.getDataEntityRuntime().fetchDataSet("Authority", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<PermissionDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<PermissionDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 权限相关查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdedataqueries/Authority.ibizmodel.ui
     */
    default List<PermissionDTO> selectAuthority(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("Authority", dto);
        return (List<PermissionDTO>) obj;
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<PermissionDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<PermissionDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<PermissionDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<PermissionDTO>) obj;
    }

}

