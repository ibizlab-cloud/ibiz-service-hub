package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaDataSetDTO;
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
 * 数据集
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/.ibizmodel.index
 */
public interface IMetaDataSetService extends IDEService<MetaDataSetDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/lite/PSDATAENTITIES/MetaDataSet.json";

  /**
   * 属性: 标识
   */
  String FIELD_DATASETID = "DATASETID";
  /**
   * 属性: 名称
   */
  String FIELD_DATASETNAME = "DATASETNAME";
  /**
   * 属性: 实体标识
   */
  String FIELD_ENTITYID = "ENTITYID";
  /**
   * 属性: 实体
   */
  String FIELD_ENTITYNAME = "ENTITYNAME";
  /**
   * 属性: 代码名称
   */
  String FIELD_CODENAME = "CODENAME";
  /**
   * 属性: 代码
   */
  String FIELD_DSCODE = "DSCODE";
  /**
   * 属性: 模型
   */
  String FIELD_DSMODEL = "DSMODEL";
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
            case "MetaDataSetDTO":
                return new MetaDataSetDTO();
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
                this.create((MetaDataSetDTO) args[0]);
                return null;
            case "update" :
                this.update((MetaDataSetDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((MetaDataSetDTO) args[0]);
            case "checkkey" :
                return this.checkKey((MetaDataSetDTO) args[0]);
            case "save" :
                this.save((MetaDataSetDTO) args[0]);
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
     * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/psdeactions/Create.ibizmodel.yaml
     */
    default void create(MetaDataSetDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/psdeactions/Update.ibizmodel.yaml
     */
    default void update(MetaDataSetDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/psdeactions/Get.ibizmodel.yaml
     */
    default MetaDataSetDTO get(String key) throws Throwable {
        return (MetaDataSetDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/psdeactions/GetDraft.ibizmodel.yaml
     */
    default MetaDataSetDTO getDraft(MetaDataSetDTO dto) throws Throwable {
        return (MetaDataSetDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(MetaDataSetDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/psdeactions/Save.ibizmodel.yaml
     */
    default void save(MetaDataSetDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<MetaDataSetDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<MetaDataSetDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<MetaDataSetDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<MetaDataSetDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<MetaDataSetDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<MetaDataSetDTO>) obj;
    }

}

