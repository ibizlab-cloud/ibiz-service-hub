package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.PermissionActionDTO;
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
 * 权限操作
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/.ibizmodel.index
 */
public interface IPermissionActionService extends IDEService<PermissionActionDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/uaa/PSDATAENTITIES/PermissionAction.json";

  /**
   * 属性: 操作标识
   */
  String FIELD_SYS_PERMISSION_ACTIONID = "SYS_PERMISSION_ACTIONID";
  /**
   * 属性: 操作名称
   */
  String FIELD_SYS_PERMISSION_ACTIONNAME = "SYS_PERMISSION_ACTIONNAME";
  /**
   * 属性: 业务数据范围
   */
  String FIELD_BSCOPE = "BSCOPE";
  /**
   * 属性: 系统标记
   */
  String FIELD_SYSTEMFLAG = "SYSTEMFLAG";
  /**
   * 属性: 操作标识
   */
  String FIELD_OPPRIV = "OPPRIV";
  /**
   * 属性: 资源名称
   */
  String FIELD_SYS_PERMISSIONNAME = "SYS_PERMISSIONNAME";
  /**
   * 属性: 资源标识
   */
  String FIELD_SYS_PERMISSIONID = "SYS_PERMISSIONID";
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
   * 查询: 当前机构系统
   */
  String DATAQUERY_CURDCSYSTEM = "CurDCSystem";
  /**
   * 查询: 数据查询
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
            case "PermissionActionDTO":
                return new PermissionActionDTO();
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
                this.create((PermissionActionDTO) args[0]);
                return null;
            case "update" :
                this.update((PermissionActionDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((PermissionActionDTO) args[0]);
            case "checkkey" :
                return this.checkKey((PermissionActionDTO) args[0]);
            case "save" :
                this.save((PermissionActionDTO) args[0]);
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
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdeactions/Create.ibizmodel.yaml
     */
    default void create(PermissionActionDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdeactions/Update.ibizmodel.yaml
     */
    default void update(PermissionActionDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdeactions/Get.ibizmodel.yaml
     */
    default PermissionActionDTO get(String key) throws Throwable {
        return (PermissionActionDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdeactions/GetDraft.ibizmodel.yaml
     */
    default PermissionActionDTO getDraft(PermissionActionDTO dto) throws Throwable {
        return (PermissionActionDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(PermissionActionDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdeactions/Save.ibizmodel.yaml
     */
    default void save(PermissionActionDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 权限相关查询
     * 包含数据查询：权限相关查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdedatasets/Authority.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdedataqueries/Authority.ibizmodel.ui
     */
    default Page<PermissionActionDTO> fetchAuthority(ISearchContextDTO dto) throws Throwable {
        return (Page<PermissionActionDTO>) this.getDataEntityRuntime().fetchDataSet("Authority", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<PermissionActionDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<PermissionActionDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 权限相关查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdedataqueries/Authority.ibizmodel.ui
     */
    default List<PermissionActionDTO> selectAuthority(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("Authority", dto);
        return (List<PermissionActionDTO>) obj;
    }


    /**
     * 当前机构系统
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdedataqueries/CurDCSystem.ibizmodel.ui
     */
    default List<PermissionActionDTO> selectCurDCSystem(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("CurDCSystem", dto);
        return (List<PermissionActionDTO>) obj;
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<PermissionActionDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<PermissionActionDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<PermissionActionDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<PermissionActionDTO>) obj;
    }

}

