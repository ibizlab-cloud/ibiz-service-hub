package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFHistoryDTO;
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
 * 历史
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/.ibizmodel.index
 */
public interface IWFHistoryService extends IDEService<WFHistoryDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/workflow/PSDATAENTITIES/WFHistory.json";

  /**
   * 属性: 标识
   */
  String FIELD_HISTID = "HISTID";
  /**
   * 属性: 操作者标识
   */
  String FIELD_AUTHOR = "AUTHOR";
  /**
   * 属性: 操作者
   */
  String FIELD_AUTHORNAME = "AUTHORNAME";
  /**
   * 属性: 意见
   */
  String FIELD_MESSAGE = "MESSAGE";
  /**
   * 属性: 时间
   */
  String FIELD_ACTIONTIME = "ACTIONTIME";
  /**
   * 属性: 意见类型
   */
  String FIELD_ACTIONTYPE = "ACTIONTYPE";
  /**
   * 属性: 任务标识
   */
  String FIELD_TASKID = "TASKID";
  /**
   * 属性: 实例标识
   */
  String FIELD_INSTANCEID = "INSTANCEID";
  /**
   * 属性: 业务键值
   */
  String FIELD_BUSINESSKEY = "BUSINESSKEY";
  /**
   * 属性: 租户系统标识
   */
  String FIELD_DCSYSTEMID = "DCSYSTEMID";
  /**
   * 属性: 步骤标识
   */
  String FIELD_TASKDEFKEY = "TASKDEFKEY";
  /**
   * 属性: 流程实例标识
   */
  String FIELD_REALINSTID = "REALINSTID";
  /**
   * 属性: 流程定义标识
   */
  String FIELD_PROCESSDEFKEY = "PROCESSDEFKEY";
  /**
   * 属性: 应用标识
   */
  String FIELD_APPID = "APPID";
  /**
   * 属性: 实体
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
            case "WFHistoryDTO":
                return new WFHistoryDTO();
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
                this.create((WFHistoryDTO) args[0]);
                return null;
            case "update" :
                this.update((WFHistoryDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((WFHistoryDTO) args[0]);
            case "checkkey" :
                return this.checkKey((WFHistoryDTO) args[0]);
            case "save" :
                this.save((WFHistoryDTO) args[0]);
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
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdeactions/Create.ibizmodel.yaml
     */
    default void create(WFHistoryDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdeactions/Update.ibizmodel.yaml
     */
    default void update(WFHistoryDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdeactions/Get.ibizmodel.yaml
     */
    default WFHistoryDTO get(String key) throws Throwable {
        return (WFHistoryDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdeactions/GetDraft.ibizmodel.yaml
     */
    default WFHistoryDTO getDraft(WFHistoryDTO dto) throws Throwable {
        return (WFHistoryDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(WFHistoryDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdeactions/Save.ibizmodel.yaml
     */
    default void save(WFHistoryDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<WFHistoryDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<WFHistoryDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<WFHistoryDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<WFHistoryDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_HISTORY/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<WFHistoryDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<WFHistoryDTO>) obj;
    }

}

