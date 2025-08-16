package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaModuleDTO;
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
 * 模块
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/.ibizmodel.index
 */
public interface IMetaModuleService extends IDEService<MetaModuleDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/lite/PSDATAENTITIES/MetaModule.json";

  /**
   * 属性: 模块标识
   */
  String FIELD_MODULEID = "MODULEID";
  /**
   * 属性: 模块名称
   */
  String FIELD_MODULENAME = "MODULENAME";
  /**
   * 属性: 代码名称
   */
  String FIELD_CODENAME = "CODENAME";
  /**
   * 属性: 系统标识
   */
  String FIELD_SYSTEMID = "SYSTEMID";
  /**
   * 属性: 排序
   */
  String FIELD_SHOWORDER = "SHOWORDER";
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
            case "MetaModuleDTO":
                return new MetaModuleDTO();
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
                this.create((MetaModuleDTO) args[0]);
                return null;
            case "update" :
                this.update((MetaModuleDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((MetaModuleDTO) args[0]);
            case "checkkey" :
                return this.checkKey((MetaModuleDTO) args[0]);
            case "save" :
                this.save((MetaModuleDTO) args[0]);
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
     * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/psdeactions/Create.ibizmodel.yaml
     */
    default void create(MetaModuleDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/psdeactions/Update.ibizmodel.yaml
     */
    default void update(MetaModuleDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/psdeactions/Get.ibizmodel.yaml
     */
    default MetaModuleDTO get(String key) throws Throwable {
        return (MetaModuleDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/psdeactions/GetDraft.ibizmodel.yaml
     */
    default MetaModuleDTO getDraft(MetaModuleDTO dto) throws Throwable {
        return (MetaModuleDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(MetaModuleDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/psdeactions/Save.ibizmodel.yaml
     */
    default void save(MetaModuleDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<MetaModuleDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<MetaModuleDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<MetaModuleDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<MetaModuleDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_MODULE/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<MetaModuleDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<MetaModuleDTO>) obj;
    }

}

