package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFInstanceDTO;
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
 * 流程实例
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/.ibizmodel.index
 */
public interface IWFInstanceService extends IDEService<WFInstanceDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/workflow/PSDATAENTITIES/WFInstance.json";

  /**
   * 属性: 实例标识
   */
  String FIELD_INSTANCEID = "INSTANCEID";
  /**
   * 属性: 实例名称
   */
  String FIELD_INSTANCENAME = "INSTANCENAME";
  /**
   * 属性: DefinitionKey
   */
  String FIELD_DEFINITIONKEY = "DEFINITIONKEY";
  /**
   * 属性: 流程定义名称
   */
  String FIELD_DEFINITIONNAME = "DEFINITIONNAME";
  /**
   * 属性: 业务键值
   */
  String FIELD_BUSINESSKEY = "BUSINESSKEY";
  /**
   * 属性: 启动时间
   */
  String FIELD_STARTTIME = "STARTTIME";
  /**
   * 属性: 结束时间
   */
  String FIELD_ENDTIME = "ENDTIME";
  /**
   * 属性: 发起人标识
   */
  String FIELD_STARTUSERID = "STARTUSERID";
  /**
   * 属性: 发起人
   */
  String FIELD_STARTUSERNAME = "STARTUSERNAME";
  /**
   * 属性: 流程实例标识
   */
  String FIELD_REALINSTID = "REALINSTID";
  /**
   * 属性: 参数
   */
  String FIELD_PARAM = "PARAM";
  /**
   * 属性: 参数2
   */
  String FIELD_PARAM2 = "PARAM2";
  /**
   * 属性: 流程状态
   */
  String FIELD_WFSTATE = "WFSTATE";
  /**
   * 属性: 当前流程步骤
   */
  String FIELD_CURSTEPNAME = "CURSTEPNAME";
  /**
   * 属性: 当前流程步骤
   */
  String FIELD_CURSTEPID = "CURSTEPID";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 创建时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 应用标识
   */
  String FIELD_APPID = "APPID";
  /**
   * 属性: 租户系统标识
   */
  String FIELD_DCSYSTEMID = "DCSYSTEMID";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 实体
   */
  String FIELD_ENTITYID = "ENTITYID";
  /**
   * 属性: 创建人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
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
   * 行为: 取消
   */
  String ACTION_CANCEL = "cancel";
  /**
   * 行为: CheckKey
   */
  String ACTION_CHECKKEY = "CheckKey";
  /**
   * 行为: 流程跳转
   */
  String ACTION_JUMP = "jump";
  /**
   * 行为: 重启流程
   */
  String ACTION_RESTART = "restart";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 查询: 我办结的
   */
  String DATAQUERY_CURUSERFINISH = "CurUserFinish";
  /**
   * 查询: 我发起的
   */
  String DATAQUERY_CURUSERSTARTED = "CurUserStarted";
  /**
   * 查询: 我未提交的
   */
  String DATAQUERY_CURUSERUNDO = "CurUserUndo";
  /**
   * 查询: DEFAULT
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: 我办结的
   */
  String DATASET_CURUSERFINISH = "CurUserFinish";
  /**
   * 集合: 我发起的
   */
  String DATASET_CURUSERSTARTED = "CurUserStarted";
  /**
   * 集合: 我未提交的
   */
  String DATASET_CURUSERUNDO = "CurUserUndo";
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
            case "WFInstanceDTO":
                return new WFInstanceDTO();
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
                this.create((WFInstanceDTO) args[0]);
                return null;
            case "update" :
                this.update((WFInstanceDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((WFInstanceDTO) args[0]);
            case "cancel" :
                this.cancel((WFInstanceDTO) args[0]);
                return null;
            case "checkkey" :
                return this.checkKey((WFInstanceDTO) args[0]);
            case "jump" :
                this.jump((WFInstanceDTO) args[0]);
                return null;
            case "restart" :
                this.restart((WFInstanceDTO) args[0]);
                return null;
            case "save" :
                this.save((WFInstanceDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "curuserfinish" :
               return this.fetchCurUserFinish((ISearchContextDTO) args[0]);
            case "curuserstarted" :
               return this.fetchCurUserStarted((ISearchContextDTO) args[0]);
            case "curuserundo" :
               return this.fetchCurUserUndo((ISearchContextDTO) args[0]);
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
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdeactions/Create.ibizmodel.yaml
     */
    default void create(WFInstanceDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdeactions/Update.ibizmodel.yaml
     */
    default void update(WFInstanceDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdeactions/Get.ibizmodel.yaml
     */
    default WFInstanceDTO get(String key) throws Throwable {
        return (WFInstanceDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdeactions/GetDraft.ibizmodel.yaml
     */
    default WFInstanceDTO getDraft(WFInstanceDTO dto) throws Throwable {
        return (WFInstanceDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * 取消
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdeactions/cancel.ibizmodel.yaml
     */
    default void cancel(WFInstanceDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("cancel", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(WFInstanceDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 流程跳转
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdeactions/jump.ibizmodel.yaml
     */
    default void jump(WFInstanceDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("jump", null, new Object[]{dto}, true);
    }

    /**
     * 重启流程
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdeactions/restart.ibizmodel.yaml
     */
    default void restart(WFInstanceDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("restart", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdeactions/Save.ibizmodel.yaml
     */
    default void save(WFInstanceDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 我办结的
     * 包含数据查询：我办结的
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdedatasets/CurUserFinish.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdedataqueries/CurUserFinish.ibizmodel.ui
     */
    default Page<WFInstanceDTO> fetchCurUserFinish(ISearchContextDTO dto) throws Throwable {
        return (Page<WFInstanceDTO>) this.getDataEntityRuntime().fetchDataSet("CurUserFinish", null, new Object[]{dto}, true);
    }

    /**
     * 我发起的
     * 包含数据查询：我发起的
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdedatasets/CurUserStarted.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdedataqueries/CurUserStarted.ibizmodel.ui
     */
    default Page<WFInstanceDTO> fetchCurUserStarted(ISearchContextDTO dto) throws Throwable {
        return (Page<WFInstanceDTO>) this.getDataEntityRuntime().fetchDataSet("CurUserStarted", null, new Object[]{dto}, true);
    }

    /**
     * 我未提交的
     * 包含数据查询：我未提交的
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdedatasets/CurUserUndo.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdedataqueries/CurUserUndo.ibizmodel.ui
     */
    default Page<WFInstanceDTO> fetchCurUserUndo(ISearchContextDTO dto) throws Throwable {
        return (Page<WFInstanceDTO>) this.getDataEntityRuntime().fetchDataSet("CurUserUndo", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<WFInstanceDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<WFInstanceDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 我办结的
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdedataqueries/CurUserFinish.ibizmodel.ui
     */
    default List<WFInstanceDTO> selectCurUserFinish(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("CurUserFinish", dto);
        return (List<WFInstanceDTO>) obj;
    }


    /**
     * 我发起的
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdedataqueries/CurUserStarted.ibizmodel.ui
     */
    default List<WFInstanceDTO> selectCurUserStarted(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("CurUserStarted", dto);
        return (List<WFInstanceDTO>) obj;
    }


    /**
     * 我未提交的
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdedataqueries/CurUserUndo.ibizmodel.ui
     */
    default List<WFInstanceDTO> selectCurUserUndo(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("CurUserUndo", dto);
        return (List<WFInstanceDTO>) obj;
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<WFInstanceDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<WFInstanceDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_INSTANCE/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<WFInstanceDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<WFInstanceDTO>) obj;
    }

}

