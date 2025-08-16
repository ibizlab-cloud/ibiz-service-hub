package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaRelationshipDTO;
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
 * 实体关系
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/.ibizmodel.index
 */
public interface IMetaRelationshipService extends IDEService<MetaRelationshipDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/lite/PSDATAENTITIES/MetaRelationship.json";

  /**
   * 属性: 关系标识
   */
  String FIELD_RELATIONID = "RELATIONID";
  /**
   * 属性: 关系名称
   */
  String FIELD_RELATIONNAME = "RELATIONNAME";
  /**
   * 属性: 类型
   */
  String FIELD_RELTYPE = "RELTYPE";
  /**
   * 属性: 代码名称
   */
  String FIELD_CODENAME = "CODENAME";
  /**
   * 属性: 实体标识
   */
  String FIELD_ENTITYID = "ENTITYID";
  /**
   * 属性: 实体名称
   */
  String FIELD_ENTITYNAME = "ENTITYNAME";
  /**
   * 属性: 引用实体标识
   */
  String FIELD_REFENTITYID = "REFENTITYID";
  /**
   * 属性: 引用实体名称
   */
  String FIELD_REFENTITYNAME = "REFENTITYNAME";
  /**
   * 属性: 嵌套代码名称
   */
  String FIELD_NESTEDNAME = "NESTEDNAME";
  /**
   * 属性: 系统
   */
  String FIELD_SYSTEMID = "SYSTEMID";
  /**
   * 属性: Lookup
   */
  String FIELD_LOOKUP = "LOOKUP";
  /**
   * 属性: 创建时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 最后修改时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
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
   * 行为: 行为
   */
  String ACTION_INITMODEL = "initModel";
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
            case "MetaRelationshipDTO":
                return new MetaRelationshipDTO();
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
                this.create((MetaRelationshipDTO) args[0]);
                return null;
            case "update" :
                this.update((MetaRelationshipDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((MetaRelationshipDTO) args[0]);
            case "checkkey" :
                return this.checkKey((MetaRelationshipDTO) args[0]);
            case "initmodel" :
                this.initModel((MetaRelationshipDTO) args[0]);
                return null;
            case "save" :
                this.save((MetaRelationshipDTO) args[0]);
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
     * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdeactions/Create.ibizmodel.yaml
     */
    default void create(MetaRelationshipDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdeactions/Update.ibizmodel.yaml
     */
    default void update(MetaRelationshipDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdeactions/Get.ibizmodel.yaml
     */
    default MetaRelationshipDTO get(String key) throws Throwable {
        return (MetaRelationshipDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdeactions/GetDraft.ibizmodel.yaml
     */
    default MetaRelationshipDTO getDraft(MetaRelationshipDTO dto) throws Throwable {
        return (MetaRelationshipDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(MetaRelationshipDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 行为
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdeactions/initModel.ibizmodel.yaml
     */
    default void initModel(MetaRelationshipDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("initModel", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdeactions/Save.ibizmodel.yaml
     */
    default void save(MetaRelationshipDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<MetaRelationshipDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<MetaRelationshipDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<MetaRelationshipDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<MetaRelationshipDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<MetaRelationshipDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<MetaRelationshipDTO>) obj;
    }

}

