package net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto.DCJobsInfoDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto.DCJobsInfoSimpleDTO;
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
 * 系统作业
 * 
 * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/.ibizmodel.index
 */
public interface IDCJobsInfoService extends IDEService<DCJobsInfoDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/center/PSDATAENTITIES/DCJobsInfo.json";

  /**
   * 属性: 主键ID
   */
  String FIELD_ID = "ID";
  /**
   * 属性: 实例标识（真实）
   */
  String FIELD_TENANT_ID = "TENANT_ID";
  /**
   * 属性: 任务执行CRON
   */
  String FIELD_CRON = "CRON";
  /**
   * 属性: 执行器任务器
   */
  String FIELD_HANDLER = "HANDLER";
  /**
   * 属性: 执行器任务参数
   */
  String FIELD_PARAM = "PARAM";
  /**
   * 属性: 任务执行超时时间（秒）
   */
  String FIELD_TIMEOUT = "TIMEOUT";
  /**
   * 属性: 失败重试次数
   */
  String FIELD_FAIL_RETRY_COUNT = "FAIL_RETRY_COUNT";
  /**
   * 属性: 上次调度时间
   */
  String FIELD_LAST_TIME = "LAST_TIME";
  /**
   * 属性: 下次调度时间
   */
  String FIELD_NEXT_TIME = "NEXT_TIME";
  /**
   * 属性: 所有者
   */
  String FIELD_AUTHOR = "AUTHOR";
  /**
   * 属性: 备注
   */
  String FIELD_REMARK = "REMARK";
  /**
   * 属性: 状态
   */
  String FIELD_STATUS = "STATUS";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATE_TIME = "UPDATE_TIME";
  /**
   * 属性: 创建时间
   */
  String FIELD_CREATE_TIME = "CREATE_TIME";
  /**
   * 属性: 动态实例标识
   */
  String FIELD_SYSDYNAINSTID = "SYSDYNAINSTID";
  /**
   * 属性: 预定义类型
   */
  String FIELD_PREDEFINEDTYPE = "PREDEFINEDTYPE";
  /**
   * 属性: 任务类型
   */
  String FIELD_TASKTYPE = "TASKTYPE";
  /**
   * 属性: 系统
   */
  String FIELD_APPNAME = "APPNAME";
  /**
   * 属性: 租户系统标识
   */
  String FIELD_APP = "APP";
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
   * 行为: 执行
   */
  String ACTION_EXECUTE = "Execute";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 行为: 开始
   */
  String ACTION_START = "Start";
  /**
   * 行为: 停止
   */
  String ACTION_STOP = "Stop";
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
            case "DCJobsInfoDTO":
                return new DCJobsInfoDTO();
            case "DCJobsInfoSimpleDTO":
                return new DCJobsInfoSimpleDTO();
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
                this.create((DCJobsInfoDTO) args[0]);
                return null;
            case "update" :
                this.update((DCJobsInfoDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((DCJobsInfoDTO) args[0]);
            case "checkkey" :
                return this.checkKey((DCJobsInfoDTO) args[0]);
            case "execute" :
                this.execute((DCJobsInfoDTO) args[0]);
                return null;
            case "save" :
                this.save((DCJobsInfoDTO) args[0]);
                return null;
            case "start" :
                this.start((DCJobsInfoDTO) args[0]);
                return null;
            case "stop" :
                this.stop((DCJobsInfoDTO) args[0]);
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
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdeactions/Create.ibizmodel.yaml
     */
    default void create(DCJobsInfoDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdeactions/Update.ibizmodel.yaml
     */
    default void update(DCJobsInfoDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdeactions/Get.ibizmodel.yaml
     */
    default DCJobsInfoDTO get(String key) throws Throwable {
        return (DCJobsInfoDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdeactions/GetDraft.ibizmodel.yaml
     */
    default DCJobsInfoDTO getDraft(DCJobsInfoDTO dto) throws Throwable {
        return (DCJobsInfoDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(DCJobsInfoDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 执行
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdeactions/Execute.ibizmodel.yaml
     */
    default void execute(DCJobsInfoDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Execute", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdeactions/Save.ibizmodel.yaml
     */
    default void save(DCJobsInfoDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 开始
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdeactions/Start.ibizmodel.yaml
     */
    default void start(DCJobsInfoDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Start", null, new Object[]{dto}, true);
    }

    /**
     * 停止
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdeactions/Stop.ibizmodel.yaml
     */
    default void stop(DCJobsInfoDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Stop", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<DCJobsInfoDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<DCJobsInfoDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<DCJobsInfoDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<DCJobsInfoDTO>) obj;
    }


    /**
     * 基础属性查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdedataqueries/SIMPLE.ibizmodel.ui
     */
    default List<DCJobsInfoSimpleDTO> selectSimple(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SIMPLE", dto);
        return (List<DCJobsInfoSimpleDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_INFO/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<DCJobsInfoDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<DCJobsInfoDTO>) obj;
    }

}

