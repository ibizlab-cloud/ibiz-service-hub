package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.DeptAuthDTO;
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
 * 部门绑定
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/.ibizmodel.index
 */
public interface IDeptAuthService extends IDEService<DeptAuthDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/uaa/PSDATAENTITIES/DeptAuth.json";

  /**
   * 属性: 部门名称
   */
  String FIELD_DEPTNAME = "DEPTNAME";
  /**
   * 属性: 系统部门标识
   */
  String FIELD_SYSDEPTID = "SYSDEPTID";
  /**
   * 属性: 部门标识
   */
  String FIELD_DEPTID = "DEPTID";
  /**
   * 属性: 部门绑定标识
   */
  String FIELD_DEPTAUTHID = "DEPTAUTHID";
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
   * 行为: 绑定
   */
  String ACTION_BIND = "Bind";
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
            case "DeptAuthDTO":
                return new DeptAuthDTO();
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
                this.create((DeptAuthDTO) args[0]);
                return null;
            case "update" :
                this.update((DeptAuthDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((DeptAuthDTO) args[0]);
            case "auto" :
                this.auto((DeptAuthDTO) args[0]);
                return null;
            case "bind" :
                this.bind((DeptAuthDTO) args[0]);
                return null;
            case "checkkey" :
                return this.checkKey((DeptAuthDTO) args[0]);
            case "save" :
                this.save((DeptAuthDTO) args[0]);
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
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/psdeactions/Create.ibizmodel.yaml
     */
    default void create(DeptAuthDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/psdeactions/Update.ibizmodel.yaml
     */
    default void update(DeptAuthDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/psdeactions/Get.ibizmodel.yaml
     */
    default DeptAuthDTO get(String key) throws Throwable {
        return (DeptAuthDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/psdeactions/GetDraft.ibizmodel.yaml
     */
    default DeptAuthDTO getDraft(DeptAuthDTO dto) throws Throwable {
        return (DeptAuthDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * 自动生成
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/psdeactions/Auto.ibizmodel.yaml
     */
    default void auto(DeptAuthDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Auto", null, new Object[]{dto}, true);
    }

    /**
     * 绑定
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/psdeactions/Bind.ibizmodel.yaml
     */
    default void bind(DeptAuthDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Bind", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(DeptAuthDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/psdeactions/Save.ibizmodel.yaml
     */
    default void save(DeptAuthDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<DeptAuthDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<DeptAuthDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<DeptAuthDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<DeptAuthDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<DeptAuthDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<DeptAuthDTO>) obj;
    }

}

