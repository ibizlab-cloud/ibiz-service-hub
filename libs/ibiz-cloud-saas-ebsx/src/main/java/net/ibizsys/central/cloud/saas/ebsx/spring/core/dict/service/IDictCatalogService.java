package net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.dto.DictCatalogDTO;
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
 * 字典
 * 
 * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/.ibizmodel.index
 */
public interface IDictCatalogService extends IDEService<DictCatalogDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/dict/PSDATAENTITIES/DictCatalog.json";

  /**
   * 属性: 标识
   */
  String FIELD_CID = "CID";
  /**
   * 属性: 代码
   */
  String FIELD_CCODE = "CCODE";
  /**
   * 属性: 名称
   */
  String FIELD_CNAME = "CNAME";
  /**
   * 属性: 分组
   */
  String FIELD_CGROUP = "CGROUP";
  /**
   * 属性: 备注
   */
  String FIELD_MEMO = "MEMO";
  /**
   * 属性: 是否有效
   */
  String FIELD_ENABLE = "ENABLE";
  /**
   * 属性: 最后修改时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 创建时间
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
            case "DictCatalogDTO":
                return new DictCatalogDTO();
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
                this.create((DictCatalogDTO) args[0]);
                return null;
            case "update" :
                this.update((DictCatalogDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((DictCatalogDTO) args[0]);
            case "checkkey" :
                return this.checkKey((DictCatalogDTO) args[0]);
            case "save" :
                this.save((DictCatalogDTO) args[0]);
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
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/psdeactions/Create.ibizmodel.yaml
     */
    default void create(DictCatalogDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/psdeactions/Update.ibizmodel.yaml
     */
    default void update(DictCatalogDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/psdeactions/Get.ibizmodel.yaml
     */
    default DictCatalogDTO get(String key) throws Throwable {
        return (DictCatalogDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/psdeactions/GetDraft.ibizmodel.yaml
     */
    default DictCatalogDTO getDraft(DictCatalogDTO dto) throws Throwable {
        return (DictCatalogDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(DictCatalogDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/psdeactions/Save.ibizmodel.yaml
     */
    default void save(DictCatalogDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<DictCatalogDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<DictCatalogDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<DictCatalogDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<DictCatalogDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/dict/psdataentities/DICT_CATALOG/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<DictCatalogDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<DictCatalogDTO>) obj;
    }

}

