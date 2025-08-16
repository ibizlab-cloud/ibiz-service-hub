package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFTaskWayDTO;
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
 * 操作路径
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/.ibizmodel.index
 */
public interface IWFTaskWayService extends IDEService<WFTaskWayDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/workflow/PSDATAENTITIES/WFTaskWay.json";

  /**
   * 属性: 路径标识
   */
  String FIELD_WAYID = "WAYID";
  /**
   * 属性: 路径标识
   */
  String FIELD_WAYNAME = "WAYNAME";
  /**
   * 属性: 任务标识
   */
  String FIELD_TASKID = "TASKID";
  /**
   * 属性: TaskDefinitionKey
   */
  String FIELD_TASKDEFINITIONKEY = "TASKDEFINITIONKEY";
  /**
   * 属性: 实例标识
   */
  String FIELD_INSTANCEID = "INSTANCEID";
  /**
   * 属性: DefinitionKey
   */
  String FIELD_DEFINITIONKEY = "DEFINITIONKEY";
  /**
   * 属性: 业务键值
   */
  String FIELD_BUSINESSKEY = "BUSINESSKEY";
  /**
   * 属性: 引用视图
   */
  String FIELD_REFVIEWKEY = "REFVIEWKEY";
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
            case "WFTaskWayDTO":
                return new WFTaskWayDTO();
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
                this.create((WFTaskWayDTO) args[0]);
                return null;
            case "update" :
                this.update((WFTaskWayDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((WFTaskWayDTO) args[0]);
            case "checkkey" :
                return this.checkKey((WFTaskWayDTO) args[0]);
            case "save" :
                this.save((WFTaskWayDTO) args[0]);
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
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdeactions/Create.ibizmodel.yaml
     */
    default void create(WFTaskWayDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdeactions/Update.ibizmodel.yaml
     */
    default void update(WFTaskWayDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdeactions/Get.ibizmodel.yaml
     */
    default WFTaskWayDTO get(String key) throws Throwable {
        return (WFTaskWayDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdeactions/GetDraft.ibizmodel.yaml
     */
    default WFTaskWayDTO getDraft(WFTaskWayDTO dto) throws Throwable {
        return (WFTaskWayDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(WFTaskWayDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdeactions/Save.ibizmodel.yaml
     */
    default void save(WFTaskWayDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<WFTaskWayDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<WFTaskWayDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<WFTaskWayDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<WFTaskWayDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK_WAY/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<WFTaskWayDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<WFTaskWayDTO>) obj;
    }

}

