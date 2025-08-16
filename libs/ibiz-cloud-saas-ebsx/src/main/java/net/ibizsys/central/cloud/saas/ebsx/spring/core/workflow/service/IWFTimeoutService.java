package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFTimeoutDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFTimeoutSimpleDTO;
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
 * 工作流超时策略
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/.ibizmodel.index
 */
public interface IWFTimeoutService extends IDEService<WFTimeoutDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/workflow/PSDATAENTITIES/WFTimeout.json";

  /**
   * 属性: 租户系统标识
   */
  String FIELD_DCSYSTEMID = "DCSYSTEMID";
  /**
   * 属性: 工作流任务标识
   */
  String FIELD_TASKID = "TASKID";
  /**
   * 属性: 业务数据主键
   */
  String FIELD_BUSINESSKEY = "BUSINESSKEY";
  /**
   * 属性: 主键标识
   */
  String FIELD_ID = "ID";
  /**
   * 属性: 任务到期时间
   */
  String FIELD_DUEDATE = "DUEDATE";
  /**
   * 属性: 业务数据名称
   */
  String FIELD_MAJORTEXT = "MAJORTEXT";
  /**
   * 属性: 组织机构标识
   */
  String FIELD_ORGID = "ORGID";
  /**
   * 属性: 组织部门标识
   */
  String FIELD_DEPTID = "DEPTID";
  /**
   * 属性: 实体标识
   */
  String FIELD_ENTITYID = "ENTITYID";
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
            case "WFTimeoutDTO":
                return new WFTimeoutDTO();
            case "WFTimeoutSimpleDTO":
                return new WFTimeoutSimpleDTO();
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
                this.create((WFTimeoutDTO) args[0]);
                return null;
            case "update" :
                this.update((WFTimeoutDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((WFTimeoutDTO) args[0]);
            case "checkkey" :
                return this.checkKey((WFTimeoutDTO) args[0]);
            case "save" :
                this.save((WFTimeoutDTO) args[0]);
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
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdeactions/Create.ibizmodel.yaml
     */
    default void create(WFTimeoutDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdeactions/Update.ibizmodel.yaml
     */
    default void update(WFTimeoutDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdeactions/Get.ibizmodel.yaml
     */
    default WFTimeoutDTO get(String key) throws Throwable {
        return (WFTimeoutDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdeactions/GetDraft.ibizmodel.yaml
     */
    default WFTimeoutDTO getDraft(WFTimeoutDTO dto) throws Throwable {
        return (WFTimeoutDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(WFTimeoutDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdeactions/Save.ibizmodel.yaml
     */
    default void save(WFTimeoutDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<WFTimeoutDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<WFTimeoutDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<WFTimeoutDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<WFTimeoutDTO>) obj;
    }


    /**
     * 基础属性查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdedataqueries/SIMPLE.ibizmodel.ui
     */
    default List<WFTimeoutSimpleDTO> selectSimple(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SIMPLE", dto);
        return (List<WFTimeoutSimpleDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TIMEOUT/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<WFTimeoutDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<WFTimeoutDTO>) obj;
    }

}

