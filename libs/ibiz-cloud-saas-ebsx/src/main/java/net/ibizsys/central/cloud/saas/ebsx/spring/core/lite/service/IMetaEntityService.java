package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaEntityDTO;
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
 * 实体
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/.ibizmodel.index
 */
public interface IMetaEntityService extends IDEService<MetaEntityDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/lite/PSDATAENTITIES/MetaEntity.json";

  /**
   * 属性: 标识
   */
  String FIELD_ENTITYID = "ENTITYID";
  /**
   * 属性: 实体名
   */
  String FIELD_ENTITYNAME = "ENTITYNAME";
  /**
   * 属性: 逻辑名称
   */
  String FIELD_LOGICNAME = "LOGICNAME";
  /**
   * 属性: 代码名称
   */
  String FIELD_CODENAME = "CODENAME";
  /**
   * 属性: 表名称
   */
  String FIELD_TABLENAME = "TABLENAME";
  /**
   * 属性: 系统标识
   */
  String FIELD_SYSTEMID = "SYSTEMID";
  /**
   * 属性: 系统
   */
  String FIELD_SYSTEMNAME = "SYSTEMNAME";
  /**
   * 属性: 数据源标识
   */
  String FIELD_DSID = "DSID";
  /**
   * 属性: 数据源
   */
  String FIELD_DSNAME = "DSNAME";
  /**
   * 属性: 模块标识
   */
  String FIELD_MODULEID = "MODULEID";
  /**
   * 属性: 模块
   */
  String FIELD_MODULENAME = "MODULENAME";
  /**
   * 属性: 扩展参数
   */
  String FIELD_EXTPARAMS = "EXTPARAMS";
  /**
   * 属性: 排序
   */
  String FIELD_SHOWORDER = "SHOWORDER";
  /**
   * 属性: 创建时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 最后修改时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 租户系统标识
   */
  String FIELD_DCSYSTEMID = "DCSYSTEMID";
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
   * 行为: GetDefaultModel
   */
  String ACTION_GETDEFAULTMODEL = "GetDefaultModel";
  /**
   * 行为: 行为
   */
  String ACTION_INITMODELS = "initModels";
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
            case "MetaEntityDTO":
                return new MetaEntityDTO();
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
                this.create((MetaEntityDTO) args[0]);
                return null;
            case "update" :
                this.update((MetaEntityDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((MetaEntityDTO) args[0]);
            case "checkkey" :
                return this.checkKey((MetaEntityDTO) args[0]);
            case "getdefaultmodel" :
                return this.getDefaultModel((String) args[0]);
            case "initmodels" :
                this.initModels((MetaEntityDTO) args[0]);
                return null;
            case "save" :
                this.save((MetaEntityDTO) args[0]);
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
     * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdeactions/Create.ibizmodel.yaml
     */
    default void create(MetaEntityDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdeactions/Update.ibizmodel.yaml
     */
    default void update(MetaEntityDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdeactions/Get.ibizmodel.yaml
     */
    default MetaEntityDTO get(String key) throws Throwable {
        return (MetaEntityDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdeactions/GetDraft.ibizmodel.yaml
     */
    default MetaEntityDTO getDraft(MetaEntityDTO dto) throws Throwable {
        return (MetaEntityDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(MetaEntityDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * GetDefaultModel
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdeactions/GetDefaultModel.ibizmodel.yaml
     */
    default MetaEntityDTO getDefaultModel(String key) throws Throwable {
        return (MetaEntityDTO) this.getDataEntityRuntime().executeAction("GetDefaultModel", null, new Object[]{key}, true);
    }

    /**
     * 行为
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdeactions/initModels.ibizmodel.yaml
     */
    default void initModels(MetaEntityDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("initModels", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdeactions/Save.ibizmodel.yaml
     */
    default void save(MetaEntityDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<MetaEntityDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<MetaEntityDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<MetaEntityDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<MetaEntityDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/META_ENTITY/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<MetaEntityDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<MetaEntityDTO>) obj;
    }

}

