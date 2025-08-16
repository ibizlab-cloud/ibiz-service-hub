package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFDefinitionNodeDTO;
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
 * 流程定义节点
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/.ibizmodel.index
 */
public interface IWFDefinitionNodeService extends IDEService<WFDefinitionNodeDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/workflow/PSDATAENTITIES/WFDefinitionNode.json";

  /**
   * 属性: 节点标识
   */
  String FIELD_NODEID = "NODEID";
  /**
   * 属性: 节点名称
   */
  String FIELD_NODENAME = "NODENAME";
  /**
   * 属性: DefinitionKey
   */
  String FIELD_DEFINITIONKEY = "DEFINITIONKEY";
  /**
   * 属性: 流程定义名称
   */
  String FIELD_DEFINITIONNAME = "DEFINITIONNAME";
  /**
   * 属性: 版本
   */
  String FIELD_VERSION = "VERSION";
  /**
   * 属性: 数量
   */
  String FIELD_CNT = "CNT";
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
   * 行为: 获取流程定义节点
   */
  String ACTION_GETWFDEFINITIONNODES = "getWFDefinitionNodes";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 查询: DEFAULT
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 查询流程实例的节点信息
   */
  String DATAQUERY_QUERYBYINSTID = "QUERYBYINSTID";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: DEFAULT
   */
  String DATASET_DEFAULT = "DEFAULT";
  /**
   * 集合: 查询流程实例下的节点信息
   */
  String DATASET_QUERYBYINSTID = "QUERYBYINSTID";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "WFDefinitionNodeDTO":
                return new WFDefinitionNodeDTO();
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
                this.create((WFDefinitionNodeDTO) args[0]);
                return null;
            case "update" :
                this.update((WFDefinitionNodeDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((WFDefinitionNodeDTO) args[0]);
            case "checkkey" :
                return this.checkKey((WFDefinitionNodeDTO) args[0]);
            case "getwfdefinitionnodes" :
                return this.getWFDefinitionNodes((String) args[0]);
            case "save" :
                this.save((WFDefinitionNodeDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "default" :
               return this.fetchDefault((ISearchContextDTO) args[0]);
            case "querybyinstid" :
               return this.fetchQueryByInstId((ISearchContextDTO) args[0]);
        }
        return this.getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
    } 

    /**
     * Create
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdeactions/Create.ibizmodel.yaml
     */
    default void create(WFDefinitionNodeDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdeactions/Update.ibizmodel.yaml
     */
    default void update(WFDefinitionNodeDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdeactions/Get.ibizmodel.yaml
     */
    default WFDefinitionNodeDTO get(String key) throws Throwable {
        return (WFDefinitionNodeDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdeactions/GetDraft.ibizmodel.yaml
     */
    default WFDefinitionNodeDTO getDraft(WFDefinitionNodeDTO dto) throws Throwable {
        return (WFDefinitionNodeDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(WFDefinitionNodeDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 获取流程定义节点
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdeactions/getWFDefinitionNodes.ibizmodel.yaml
     */
    default WFDefinitionNodeDTO getWFDefinitionNodes(String key) throws Throwable {
        return (WFDefinitionNodeDTO) this.getDataEntityRuntime().executeAction("getWFDefinitionNodes", null, new Object[]{key}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdeactions/Save.ibizmodel.yaml
     */
    default void save(WFDefinitionNodeDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<WFDefinitionNodeDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<WFDefinitionNodeDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }

    /**
     * 查询流程实例下的节点信息
     * 查询流程实例下的节点信息
     * 包含数据查询：查询流程实例的节点信息
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdedatasets/QUERYBYINSTID.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdedataqueries/QUERYBYINSTID.ibizmodel.ui
     */
    default Page<WFDefinitionNodeDTO> fetchQueryByInstId(ISearchContextDTO dto) throws Throwable {
        return (Page<WFDefinitionNodeDTO>) this.getDataEntityRuntime().fetchDataSet("QUERYBYINSTID", null, new Object[]{dto}, true);
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<WFDefinitionNodeDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<WFDefinitionNodeDTO>) obj;
    }


    /**
     * 查询流程实例的节点信息
     * 查询流程实例的节点信息
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdedataqueries/QUERYBYINSTID.ibizmodel.ui
     */
    default List<WFDefinitionNodeDTO> selectQueryByInstId(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("QUERYBYINSTID", dto);
        return (List<WFDefinitionNodeDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_DEFINITION_NODE/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<WFDefinitionNodeDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<WFDefinitionNodeDTO>) obj;
    }

}

