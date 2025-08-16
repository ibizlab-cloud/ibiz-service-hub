package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFModelDTO;
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
 * 流程模型
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/.ibizmodel.index
 */
public interface IWFModelService extends IDEService<WFModelDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/workflow/PSDATAENTITIES/WFModel.json";

  /**
   * 属性: ID
   */
  String FIELD_MODELID = "MODELID";
  /**
   * 属性: 名称
   */
  String FIELD_MODELNAME = "MODELNAME";
  /**
   * 属性: 工作流用户组
   */
  String FIELD_REFGROUP = "REFGROUP";
  /**
   * 属性: 启用标识
   */
  String FIELD_ISVALID = "ISVALID";
  /**
   * 属性: BPMN
   */
  String FIELD_BPMNFILE = "BPMNFILE";
  /**
   * 属性: 移动应用
   */
  String FIELD_MOBAPPS = "MOBAPPS";
  /**
   * 属性: 工作流实体
   */
  String FIELD_REFDATAENTITY = "REFDATAENTITY";
  /**
   * 属性: PC应用
   */
  String FIELD_WEBAPPS = "WEBAPPS";
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
            case "WFModelDTO":
                return new WFModelDTO();
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
                this.create((WFModelDTO) args[0]);
                return null;
            case "update" :
                this.update((WFModelDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((WFModelDTO) args[0]);
            case "checkkey" :
                return this.checkKey((WFModelDTO) args[0]);
            case "save" :
                this.save((WFModelDTO) args[0]);
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
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdeactions/Create.ibizmodel.yaml
     */
    default void create(WFModelDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdeactions/Update.ibizmodel.yaml
     */
    default void update(WFModelDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdeactions/Get.ibizmodel.yaml
     */
    default WFModelDTO get(String key) throws Throwable {
        return (WFModelDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdeactions/GetDraft.ibizmodel.yaml
     */
    default WFModelDTO getDraft(WFModelDTO dto) throws Throwable {
        return (WFModelDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(WFModelDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdeactions/Save.ibizmodel.yaml
     */
    default void save(WFModelDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<WFModelDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<WFModelDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<WFModelDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<WFModelDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_MODEL/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<WFModelDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<WFModelDTO>) obj;
    }

}

