package net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto.DCJobsRegistryDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto.DCJobsRegistrySimpleDTO;
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
 * 系统作业登记
 * 
 * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/.ibizmodel.index
 */
public interface IDCJobsRegistryService extends IDEService<DCJobsRegistryDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/center/PSDATAENTITIES/DCJobsRegistry.json";

  /**
   * 属性: 主键ID
   */
  String FIELD_ID = "ID";
  /**
   * 属性: 执行地址
   */
  String FIELD_ADDRESS = "ADDRESS";
  /**
   * 属性: 状态
   */
  String FIELD_STATUS = "STATUS";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATE_TIME = "UPDATE_TIME";
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
            case "DCJobsRegistryDTO":
                return new DCJobsRegistryDTO();
            case "DCJobsRegistrySimpleDTO":
                return new DCJobsRegistrySimpleDTO();
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
                this.create((DCJobsRegistryDTO) args[0]);
                return null;
            case "update" :
                this.update((DCJobsRegistryDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((DCJobsRegistryDTO) args[0]);
            case "checkkey" :
                return this.checkKey((DCJobsRegistryDTO) args[0]);
            case "save" :
                this.save((DCJobsRegistryDTO) args[0]);
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
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdeactions/Create.ibizmodel.yaml
     */
    default void create(DCJobsRegistryDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdeactions/Update.ibizmodel.yaml
     */
    default void update(DCJobsRegistryDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdeactions/Get.ibizmodel.yaml
     */
    default DCJobsRegistryDTO get(String key) throws Throwable {
        return (DCJobsRegistryDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdeactions/GetDraft.ibizmodel.yaml
     */
    default DCJobsRegistryDTO getDraft(DCJobsRegistryDTO dto) throws Throwable {
        return (DCJobsRegistryDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(DCJobsRegistryDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdeactions/Save.ibizmodel.yaml
     */
    default void save(DCJobsRegistryDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<DCJobsRegistryDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<DCJobsRegistryDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<DCJobsRegistryDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<DCJobsRegistryDTO>) obj;
    }


    /**
     * 基础属性查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdedataqueries/SIMPLE.ibizmodel.ui
     */
    default List<DCJobsRegistrySimpleDTO> selectSimple(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SIMPLE", dto);
        return (List<DCJobsRegistrySimpleDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_JOBS_REGISTRY/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<DCJobsRegistryDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<DCJobsRegistryDTO>) obj;
    }

}

