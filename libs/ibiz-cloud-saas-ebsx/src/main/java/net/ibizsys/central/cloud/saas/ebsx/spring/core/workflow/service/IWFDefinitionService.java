package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFDefinitionDTO;
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
 * 流程定义
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/.ibizmodel.index
 */
public interface IWFDefinitionService extends IDEService<WFDefinitionDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/workflow/PSDATAENTITIES/WFDefinition.json";

  /**
   * 属性: 流程标识
   */
  String FIELD_DEFINITIONKEY = "DEFINITIONKEY";
  /**
   * 属性: 流程名称
   */
  String FIELD_DEFINITIONNAME = "DEFINITIONNAME";
  /**
   * 属性: 模型版本
   */
  String FIELD_MODELVERSION = "MODELVERSION";
  /**
   * 属性: 模型是否启用
   */
  String FIELD_MODELENABLE = "MODELENABLE";
  /**
   * 属性: 系统标识
   */
  String FIELD_PSSYSTEMID = "PSSYSTEMID";
  /**
   * 属性: 校验
   */
  String FIELD_MD5CHECK = "MD5CHECK";
  /**
   * 属性: BPMN
   */
  String FIELD_BPMNFILE = "BPMNFILE";
  /**
   * 属性: 流程图
   */
  String FIELD_PROCESSDIAGRAM = "PROCESSDIAGRAM";
  /**
   * 属性: DeployKey
   */
  String FIELD_DEPLOYKEY = "DEPLOYKEY";
  /**
   * 属性: WebServiceIds
   */
  String FIELD_WEBSERVICEIDS = "WEBSERVICEIDS";
  /**
   * 属性: MobileServiceIds
   */
  String FIELD_MOBILESERVICEIDS = "MOBILESERVICEIDS";
  /**
   * 属性: 动态模型标识
   */
  String FIELD_DYNAMODELID = "DYNAMODELID";
  /**
   * 属性: 租户系统标识
   */
  String FIELD_DCSYSTEMID = "DCSYSTEMID";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 建立时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
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
   * 查询: 数据查询
   */
  String DATAQUERY_IGNORECENTER = "IgnoreCenter";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: DEFAULT
   */
  String DATASET_DEFAULT = "DEFAULT";
  /**
   * 集合: 数据集
   */
  String DATASET_IGNORECENTER = "IgnoreCenter";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "WFDefinitionDTO":
                return new WFDefinitionDTO();
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
                this.create((WFDefinitionDTO) args[0]);
                return null;
            case "update" :
                this.update((WFDefinitionDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((WFDefinitionDTO) args[0]);
            case "checkkey" :
                return this.checkKey((WFDefinitionDTO) args[0]);
            case "save" :
                this.save((WFDefinitionDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "default" :
               return this.fetchDefault((ISearchContextDTO) args[0]);
            case "ignorecenter" :
               return this.fetchIgnoreCenter((ISearchContextDTO) args[0]);
        }
        return this.getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
    } 

    /**
     * Create
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdeactions/Create.ibizmodel.yaml
     */
    default void create(WFDefinitionDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdeactions/Update.ibizmodel.yaml
     */
    default void update(WFDefinitionDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdeactions/Get.ibizmodel.yaml
     */
    default WFDefinitionDTO get(String key) throws Throwable {
        return (WFDefinitionDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdeactions/GetDraft.ibizmodel.yaml
     */
    default WFDefinitionDTO getDraft(WFDefinitionDTO dto) throws Throwable {
        return (WFDefinitionDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(WFDefinitionDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdeactions/Save.ibizmodel.yaml
     */
    default void save(WFDefinitionDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<WFDefinitionDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<WFDefinitionDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdedatasets/IgnoreCenter.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdedataqueries/IgnoreCenter.ibizmodel.ui
     */
    default Page<WFDefinitionDTO> fetchIgnoreCenter(ISearchContextDTO dto) throws Throwable {
        return (Page<WFDefinitionDTO>) this.getDataEntityRuntime().fetchDataSet("IgnoreCenter", null, new Object[]{dto}, true);
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<WFDefinitionDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<WFDefinitionDTO>) obj;
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdedataqueries/IgnoreCenter.ibizmodel.ui
     */
    default List<WFDefinitionDTO> selectIgnoreCenter(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("IgnoreCenter", dto);
        return (List<WFDefinitionDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<WFDefinitionDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<WFDefinitionDTO>) obj;
    }

}

