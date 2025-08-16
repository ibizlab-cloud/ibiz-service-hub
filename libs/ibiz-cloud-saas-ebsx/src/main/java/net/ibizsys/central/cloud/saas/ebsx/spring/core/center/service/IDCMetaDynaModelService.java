package net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto.DCMetaDynaModelDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto.DCMetaDynaModelSimpleDTO;
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
 * 模型版本
 * 
 * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/.ibizmodel.index
 */
public interface IDCMetaDynaModelService extends IDEService<DCMetaDynaModelDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/center/PSDATAENTITIES/DCMetaDynaModel.json";

  /**
   * 属性: 备注
   */
  String FIELD_MEMO = "MEMO";
  /**
   * 属性: 实例标识
   */
  String FIELD_REALDYNAINSTID = "REALDYNAINSTID";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 动态实例标记2（动态设计工具）
   */
  String FIELD_DYNAINSTTAG2 = "DYNAINSTTAG2";
  /**
   * 属性: 文件
   */
  String FIELD_MODELFILE = "MODELFILE";
  /**
   * 属性: 建立时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 配置标识
   */
  String FIELD_CONFIGID = "CONFIGID";
  /**
   * 属性: 动态实例标记（动态设计工具）
   */
  String FIELD_DYNAINSTTAG = "DYNAINSTTAG";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 状态
   */
  String FIELD_STATUS = "STATUS";
  /**
   * 属性: 实例版本激活标记
   */
  String FIELD_ACTIVETAG = "ACTIVETAG";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 配置名称
   */
  String FIELD_CONFIGNAME = "CONFIGNAME";
  /**
   * 属性: 动态实例标识（动态设计工具）
   */
  String FIELD_DYNAINSTID = "DYNAINSTID";
  /**
   * 属性: 动态实例标识（RT）
   */
  String FIELD_SYSDYNAINSTID = "SYSDYNAINSTID";
  /**
   * 属性: 配置标识
   */
  String FIELD_PDYNAINSTID = "PDYNAINSTID";
  /**
   * 属性: 动态实例名称
   */
  String FIELD_SYSDYNAINSTNAME = "SYSDYNAINSTNAME";
  /**
   * 属性: 预置实例
   */
  String FIELD_INTERNALINST = "INTERNALINST";
  /**
   * 属性: 系统标识
   */
  String FIELD_SYSTEMID = "SYSTEMID";
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
   * 行为: 清理模型版本目录
   */
  String ACTION_CLEANPUBLISHPATH = "CleanPublishPath";
  /**
   * 行为: 初始化副本实例
   */
  String ACTION_INIT = "init";
  /**
   * 行为: 发布模型
   */
  String ACTION_PUBLISH = "publish";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 行为: 同步模型
   */
  String ACTION_SYNCMODEL = "syncModel";
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
            case "DCMetaDynaModelDTO":
                return new DCMetaDynaModelDTO();
            case "DCMetaDynaModelSimpleDTO":
                return new DCMetaDynaModelSimpleDTO();
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
                this.create((DCMetaDynaModelDTO) args[0]);
                return null;
            case "update" :
                this.update((DCMetaDynaModelDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((DCMetaDynaModelDTO) args[0]);
            case "checkkey" :
                return this.checkKey((DCMetaDynaModelDTO) args[0]);
            case "cleanpublishpath" :
                this.cleanPublishPath((DCMetaDynaModelDTO) args[0]);
                return null;
            case "init" :
                this.init((DCMetaDynaModelDTO) args[0]);
                return null;
            case "publish" :
                this.publish((DCMetaDynaModelDTO) args[0]);
                return null;
            case "save" :
                this.save((DCMetaDynaModelDTO) args[0]);
                return null;
            case "syncmodel" :
                this.syncModel((DCMetaDynaModelDTO) args[0]);
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
     * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdeactions/Create.ibizmodel.yaml
     */
    default void create(DCMetaDynaModelDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdeactions/Update.ibizmodel.yaml
     */
    default void update(DCMetaDynaModelDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdeactions/Get.ibizmodel.yaml
     */
    default DCMetaDynaModelDTO get(String key) throws Throwable {
        return (DCMetaDynaModelDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdeactions/GetDraft.ibizmodel.yaml
     */
    default DCMetaDynaModelDTO getDraft(DCMetaDynaModelDTO dto) throws Throwable {
        return (DCMetaDynaModelDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(DCMetaDynaModelDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 清理模型版本目录
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdeactions/CleanPublishPath.ibizmodel.yaml
     */
    default void cleanPublishPath(DCMetaDynaModelDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("CleanPublishPath", null, new Object[]{dto}, true);
    }

    /**
     * 初始化副本实例
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdeactions/init.ibizmodel.yaml
     */
    default void init(DCMetaDynaModelDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("init", null, new Object[]{dto}, true);
    }

    /**
     * 发布模型
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdeactions/publish.ibizmodel.yaml
     */
    default void publish(DCMetaDynaModelDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("publish", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdeactions/Save.ibizmodel.yaml
     */
    default void save(DCMetaDynaModelDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 同步模型
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdeactions/syncModel.ibizmodel.yaml
     */
    default void syncModel(DCMetaDynaModelDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("syncModel", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<DCMetaDynaModelDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<DCMetaDynaModelDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<DCMetaDynaModelDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<DCMetaDynaModelDTO>) obj;
    }


    /**
     * 基础属性查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdedataqueries/SIMPLE.ibizmodel.ui
     */
    default List<DCMetaDynaModelSimpleDTO> selectSimple(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SIMPLE", dto);
        return (List<DCMetaDynaModelSimpleDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<DCMetaDynaModelDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<DCMetaDynaModelDTO>) obj;
    }

}

