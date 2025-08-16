package net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.DepartmentDTO;
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
 * 部门
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/.ibizmodel.index
 */
public interface IDepartmentService extends IDEService<DepartmentDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/ou/PSDATAENTITIES/Department.json";

  /**
   * 属性: 部门标识
   */
  String FIELD_DEPTID = "DEPTID";
  /**
   * 属性: 部门代码
   */
  String FIELD_DEPTCODE = "DEPTCODE";
  /**
   * 属性: 部门名称
   */
  String FIELD_DEPTNAME = "DEPTNAME";
  /**
   * 属性: 单位
   */
  String FIELD_ORGID = "ORGID";
  /**
   * 属性: 上级部门
   */
  String FIELD_PDEPTID = "PDEPTID";
  /**
   * 属性: 部门简称
   */
  String FIELD_SHORTNAME = "SHORTNAME";
  /**
   * 属性: 部门级别
   */
  String FIELD_DEPTLEVEL = "DEPTLEVEL";
  /**
   * 属性: 区属
   */
  String FIELD_DOMAINS = "DOMAINS";
  /**
   * 属性: 排序
   */
  String FIELD_SHOWORDER = "SHOWORDER";
  /**
   * 属性: 业务编码
   */
  String FIELD_BCODE = "BCODE";
  /**
   * 属性: 分管领导标识
   */
  String FIELD_LEADERID = "LEADERID";
  /**
   * 属性: 分管领导
   */
  String FIELD_LEADERNAME = "LEADERNAME";
  /**
   * 属性: 逻辑有效
   */
  String FIELD_ENABLE = "ENABLE";
  /**
   * 属性: 单位
   */
  String FIELD_ORGNAME = "ORGNAME";
  /**
   * 属性: 上级部门
   */
  String FIELD_PDEPTNAME = "PDEPTNAME";
  /**
   * 属性: 创建时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 保留
   */
  String FIELD_RESERVER = "RESERVER";
  /**
   * 属性: 保留3
   */
  String FIELD_RESERVER3 = "RESERVER3";
  /**
   * 属性: 保留2
   */
  String FIELD_RESERVER2 = "RESERVER2";
  /**
   * 属性: 保留18
   */
  String FIELD_RESERVER18 = "RESERVER18";
  /**
   * 属性: 保留14
   */
  String FIELD_RESERVER14 = "RESERVER14";
  /**
   * 属性: 保留20
   */
  String FIELD_RESERVER20 = "RESERVER20";
  /**
   * 属性: 保留17
   */
  String FIELD_RESERVER17 = "RESERVER17";
  /**
   * 属性: 保留15
   */
  String FIELD_RESERVER15 = "RESERVER15";
  /**
   * 属性: 保留19
   */
  String FIELD_RESERVER19 = "RESERVER19";
  /**
   * 属性: 保留16
   */
  String FIELD_RESERVER16 = "RESERVER16";
  /**
   * 属性: 保留12
   */
  String FIELD_RESERVER12 = "RESERVER12";
  /**
   * 属性: 保留9
   */
  String FIELD_RESERVER9 = "RESERVER9";
  /**
   * 属性: 保留10
   */
  String FIELD_RESERVER10 = "RESERVER10";
  /**
   * 属性: 保留8
   */
  String FIELD_RESERVER8 = "RESERVER8";
  /**
   * 属性: 保留7
   */
  String FIELD_RESERVER7 = "RESERVER7";
  /**
   * 属性: 保留13
   */
  String FIELD_RESERVER13 = "RESERVER13";
  /**
   * 属性: 保留6
   */
  String FIELD_RESERVER6 = "RESERVER6";
  /**
   * 属性: 保留5
   */
  String FIELD_RESERVER5 = "RESERVER5";
  /**
   * 属性: 保留11
   */
  String FIELD_RESERVER11 = "RESERVER11";
  /**
   * 属性: 保留4
   */
  String FIELD_RESERVER4 = "RESERVER4";
  /**
   * 属性: 部门领导
   */
  String FIELD_DEPTLEADER = "DEPTLEADER";
  /**
   * 属性: 企业微信部门标识
   */
  String FIELD_WXWORKDEPTID = "WXWORKDEPTID";
  /**
   * 属性: 钉钉部门标识
   */
  String FIELD_DDDEPTID = "DDDEPTID";
  /**
   * 属性: 部门领导标识
   */
  String FIELD_DEPTLEADERID = "DEPTLEADERID";
  /**
   * 属性: 部门全称
   */
  String FIELD_DEPTFULLNAME = "DEPTFULLNAME";
  /**
   * 属性: 启用标志
   */
  String FIELD_ISVALID = "ISVALID";
  /**
   * 属性: 组织代码
   */
  String FIELD_ORGCODE = "ORGCODE";
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
   * 查询: 当前人员部门
   */
  String DATAQUERY_CURUSERDEPT = "CurUserDept";
  /**
   * 查询: DEFAULT
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 排除条件
   */
  String DATAQUERY_EXCLUDE = "EXCLUDE";
  /**
   * 查询: 部门领导部门
   */
  String DATAQUERY_LEADERDEPT = "LeaderDept";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: 当前人员部门
   */
  String DATASET_CURUSERDEPT = "CurUserDept";
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
            case "DepartmentDTO":
                return new DepartmentDTO();
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
                this.create((DepartmentDTO) args[0]);
                return null;
            case "update" :
                this.update((DepartmentDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((DepartmentDTO) args[0]);
            case "checkkey" :
                return this.checkKey((DepartmentDTO) args[0]);
            case "save" :
                this.save((List<DepartmentDTO>) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "curuserdept" :
               return this.fetchCurUserDept((ISearchContextDTO) args[0]);
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
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdeactions/Create.ibizmodel.yaml
     */
    default void create(DepartmentDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdeactions/Update.ibizmodel.yaml
     */
    default void update(DepartmentDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdeactions/Get.ibizmodel.yaml
     */
    default DepartmentDTO get(String key) throws Throwable {
        return (DepartmentDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdeactions/GetDraft.ibizmodel.yaml
     */
    default DepartmentDTO getDraft(DepartmentDTO dto) throws Throwable {
        return (DepartmentDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(DepartmentDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdeactions/Save.ibizmodel.yaml
     */
    default void save(List<DepartmentDTO> dtos) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dtos}, true);
    }

    /**
     * 当前人员部门
     * 包含数据查询：当前人员部门
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdedatasets/CurUserDept.ibizmodel.yaml
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdedataqueries/CurUserDept.ibizmodel.ui
     */
    default Page<DepartmentDTO> fetchCurUserDept(ISearchContextDTO dto) throws Throwable {
        return (Page<DepartmentDTO>) this.getDataEntityRuntime().fetchDataSet("CurUserDept", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<DepartmentDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<DepartmentDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }

    /**
     * 排除数据
     * 包含数据查询：排除条件
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdedatasets/EXCLUDE.ibizmodel.yaml
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdedataqueries/EXCLUDE.ibizmodel.ui
     */
    default Page<DepartmentDTO> fetchExclude(ISearchContextDTO dto) throws Throwable {
        return (Page<DepartmentDTO>) this.getDataEntityRuntime().fetchDataSet("EXCLUDE", null, new Object[]{dto}, true);
    }


    /**
     * 当前人员部门
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdedataqueries/CurUserDept.ibizmodel.ui
     */
    default List<DepartmentDTO> selectCurUserDept(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("CurUserDept", dto);
        return (List<DepartmentDTO>) obj;
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<DepartmentDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<DepartmentDTO>) obj;
    }


    /**
     * 排除条件
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdedataqueries/EXCLUDE.ibizmodel.ui
     */
    default List<DepartmentDTO> selectExclude(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("EXCLUDE", dto);
        return (List<DepartmentDTO>) obj;
    }


    /**
     * 部门领导部门
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdedataqueries/LeaderDept.ibizmodel.ui
     */
    default List<DepartmentDTO> selectLeaderDept(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("LeaderDept", dto);
        return (List<DepartmentDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPT/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<DepartmentDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<DepartmentDTO>) obj;
    }

}

