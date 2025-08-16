package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFTaskDTO;
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
 * 工作流任务
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/.ibizmodel.index
 */
public interface IWFTaskService extends IDEService<WFTaskDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/workflow/PSDATAENTITIES/WFTask.json";

  /**
   * 属性: 任务标识
   */
  String FIELD_TASKID = "TASKID";
  /**
   * 属性: 状态
   */
  String FIELD_TASKNAME = "TASKNAME";
  /**
   * 属性: DefinitionId
   */
  String FIELD_DEFINITIONID = "DEFINITIONID";
  /**
   * 属性: DefinitionKey
   */
  String FIELD_DEFINITIONKEY = "DEFINITIONKEY";
  /**
   * 属性: 流程
   */
  String FIELD_DEFINITIONNAME = "DEFINITIONNAME";
  /**
   * 属性: TaskDefinitionKey
   */
  String FIELD_TASKDEFINITIONKEY = "TASKDEFINITIONKEY";
  /**
   * 属性: 待办事项
   */
  String FIELD_DESCRIPTION = "DESCRIPTION";
  /**
   * 属性: 发起时间
   */
  String FIELD_CREATETIME = "CREATETIME";
  /**
   * 属性: 实例标识
   */
  String FIELD_INSTANCEID = "INSTANCEID";
  /**
   * 属性: 业务键值（含应用标识）
   */
  String FIELD_BUSINESSKEY2 = "BUSINESSKEY2";
  /**
   * 属性: 业务键值
   */
  String FIELD_BUSINESSKEY = "BUSINESSKEY";
  /**
   * 属性: 待办归属
   */
  String FIELD_ORGID = "ORGID";
  /**
   * 属性: 实体标识
   */
  String FIELD_ENTITYID = "ENTITYID";
  /**
   * 属性: 系统应用标识
   */
  String FIELD_SYSAPPID = "SYSAPPID";
  /**
   * 属性: 打开地址
   */
  String FIELD_URL = "URL";
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
   * 行为: 行为
   */
  String ACTION_GETWFTASKURL = "GetWFTaskUrl";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 查询: DEFAULT
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 已办任务
   */
  String DATAQUERY_DONETASK = "doneTask";
  /**
   * 查询: 办结任务
   */
  String DATAQUERY_FINISHTASK = "finishTask";
  /**
   * 查询: 待办任务
   */
  String DATAQUERY_TODOTASK = "todoTask";
  /**
   * 查询: 数据查询
   */
  String DATAQUERY_TOREADTASK = "toreadTask";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: DEFAULT
   */
  String DATASET_DEFAULT = "DEFAULT";
  /**
   * 集合: 已办任务
   */
  String DATASET_DONETASK = "doneTask";
  /**
   * 集合: 办结任务
   */
  String DATASET_FINISHTASK = "finishTask";
  /**
   * 集合: 待办任务
   */
  String DATASET_TODOTASK = "todoTask";
  /**
   * 集合: 待阅任务
   */
  String DATASET_TOREADTASK = "toreadTask";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "WFTaskDTO":
                return new WFTaskDTO();
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
                this.create((WFTaskDTO) args[0]);
                return null;
            case "update" :
                this.update((WFTaskDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((WFTaskDTO) args[0]);
            case "checkkey" :
                return this.checkKey((WFTaskDTO) args[0]);
            case "getwftaskurl" :
                return this.getWFTaskUrl((String) args[0]);
            case "save" :
                this.save((WFTaskDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "default" :
               return this.fetchDefault((ISearchContextDTO) args[0]);
            case "donetask" :
               return this.fetchDoneTask((ISearchContextDTO) args[0]);
            case "finishtask" :
               return this.fetchFinishTask((ISearchContextDTO) args[0]);
            case "todotask" :
               return this.fetchTodoTask((ISearchContextDTO) args[0]);
            case "toreadtask" :
               return this.fetchToreadTask((ISearchContextDTO) args[0]);
        }
        return this.getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
    } 

    /**
     * Create
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdeactions/Create.ibizmodel.yaml
     */
    default void create(WFTaskDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdeactions/Update.ibizmodel.yaml
     */
    default void update(WFTaskDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdeactions/Get.ibizmodel.yaml
     */
    default WFTaskDTO get(String key) throws Throwable {
        return (WFTaskDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdeactions/GetDraft.ibizmodel.yaml
     */
    default WFTaskDTO getDraft(WFTaskDTO dto) throws Throwable {
        return (WFTaskDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(WFTaskDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 行为
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdeactions/GetWFTaskUrl.ibizmodel.yaml
     */
    default WFTaskDTO getWFTaskUrl(String key) throws Throwable {
        return (WFTaskDTO) this.getDataEntityRuntime().executeAction("GetWFTaskUrl", null, new Object[]{key}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdeactions/Save.ibizmodel.yaml
     */
    default void save(WFTaskDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<WFTaskDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<WFTaskDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }

    /**
     * 已办任务
     * 包含数据查询：已办任务
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdedatasets/doneTask.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdedataqueries/doneTask.ibizmodel.ui
     */
    default Page<WFTaskDTO> fetchDoneTask(ISearchContextDTO dto) throws Throwable {
        return (Page<WFTaskDTO>) this.getDataEntityRuntime().fetchDataSet("doneTask", null, new Object[]{dto}, true);
    }

    /**
     * 办结任务
     * 包含数据查询：办结任务
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdedatasets/finishTask.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdedataqueries/finishTask.ibizmodel.ui
     */
    default Page<WFTaskDTO> fetchFinishTask(ISearchContextDTO dto) throws Throwable {
        return (Page<WFTaskDTO>) this.getDataEntityRuntime().fetchDataSet("finishTask", null, new Object[]{dto}, true);
    }

    /**
     * 待办任务
     * 包含数据查询：待办任务
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdedatasets/todoTask.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdedataqueries/todoTask.ibizmodel.ui
     */
    default Page<WFTaskDTO> fetchTodoTask(ISearchContextDTO dto) throws Throwable {
        return (Page<WFTaskDTO>) this.getDataEntityRuntime().fetchDataSet("todoTask", null, new Object[]{dto}, true);
    }

    /**
     * 待阅任务
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdedatasets/toreadTask.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdedataqueries/toreadTask.ibizmodel.ui
     */
    default Page<WFTaskDTO> fetchToreadTask(ISearchContextDTO dto) throws Throwable {
        return (Page<WFTaskDTO>) this.getDataEntityRuntime().fetchDataSet("toreadTask", null, new Object[]{dto}, true);
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<WFTaskDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<WFTaskDTO>) obj;
    }


    /**
     * 已办任务
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdedataqueries/doneTask.ibizmodel.ui
     */
    default List<WFTaskDTO> selectDoneTask(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("doneTask", dto);
        return (List<WFTaskDTO>) obj;
    }


    /**
     * 办结任务
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdedataqueries/finishTask.ibizmodel.ui
     */
    default List<WFTaskDTO> selectFinishTask(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("finishTask", dto);
        return (List<WFTaskDTO>) obj;
    }


    /**
     * 待办任务
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdedataqueries/todoTask.ibizmodel.ui
     */
    default List<WFTaskDTO> selectTodoTask(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("todoTask", dto);
        return (List<WFTaskDTO>) obj;
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdedataqueries/toreadTask.ibizmodel.ui
     */
    default List<WFTaskDTO> selectToreadTask(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("toreadTask", dto);
        return (List<WFTaskDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_TASK/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<WFTaskDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<WFTaskDTO>) obj;
    }

}

