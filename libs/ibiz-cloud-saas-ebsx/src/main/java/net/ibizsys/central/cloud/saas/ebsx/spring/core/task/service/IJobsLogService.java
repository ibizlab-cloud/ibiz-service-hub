package net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.task.dto.JobsLogDTO;
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
 * 任务调度日志
 * 
 * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/.ibizmodel.index
 */
public interface IJobsLogService extends IDEService<JobsLogDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/task/PSDATAENTITIES/JobsLog.json";

  /**
   * 属性: 主键ID
   */
  String FIELD_ID = "ID";
  /**
   * 属性: 任务ID
   */
  String FIELD_JOB_ID = "JOB_ID";
  /**
   * 属性: 执行地址
   */
  String FIELD_ADDRESS = "ADDRESS";
  /**
   * 属性: 执行器任务HANDLER
   */
  String FIELD_HANDLER = "HANDLER";
  /**
   * 属性: 执行器任务参数
   */
  String FIELD_PARAM = "PARAM";
  /**
   * 属性: 失败重试次数
   */
  String FIELD_FAIL_RETRY_COUNT = "FAIL_RETRY_COUNT";
  /**
   * 属性: 触发器调度返回码
   */
  String FIELD_TRIGGER_CODE = "TRIGGER_CODE";
  /**
   * 属性: 触发器调度类型
   */
  String FIELD_TRIGGER_TYPE = "TRIGGER_TYPE";
  /**
   * 属性: 触发器调度信息
   */
  String FIELD_TRIGGER_MSG = "TRIGGER_MSG";
  /**
   * 属性: 创建时间
   */
  String FIELD_CREATE_TIME = "CREATE_TIME";
  /**
   * 属性: 租户
   */
  String FIELD_SRFDCID = "SRFDCID";
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
            case "JobsLogDTO":
                return new JobsLogDTO();
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
                this.create((JobsLogDTO) args[0]);
                return null;
            case "update" :
                this.update((JobsLogDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((JobsLogDTO) args[0]);
            case "checkkey" :
                return this.checkKey((JobsLogDTO) args[0]);
            case "save" :
                this.save((JobsLogDTO) args[0]);
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
     * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdeactions/Create.ibizmodel.yaml
     */
    default void create(JobsLogDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdeactions/Update.ibizmodel.yaml
     */
    default void update(JobsLogDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdeactions/Get.ibizmodel.yaml
     */
    default JobsLogDTO get(String key) throws Throwable {
        return (JobsLogDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdeactions/GetDraft.ibizmodel.yaml
     */
    default JobsLogDTO getDraft(JobsLogDTO dto) throws Throwable {
        return (JobsLogDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(JobsLogDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdeactions/Save.ibizmodel.yaml
     */
    default void save(JobsLogDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<JobsLogDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<JobsLogDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<JobsLogDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<JobsLogDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/task/psdataentities/JOBS_LOG/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<JobsLogDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<JobsLogDTO>) obj;
    }

}

