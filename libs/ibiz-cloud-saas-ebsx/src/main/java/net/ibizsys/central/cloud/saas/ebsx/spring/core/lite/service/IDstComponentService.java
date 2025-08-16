package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.DstComponentDTO;
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
 * 组件
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/.ibizmodel.index
 */
public interface IDstComponentService extends IDEService<DstComponentDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/lite/PSDATAENTITIES/DstComponent.json";

  /**
   * 属性: 部件标识
   */
  String FIELD_CID = "CID";
  /**
   * 属性: 名称
   */
  String FIELD_CNAME = "CNAME";
  /**
   * 属性: 代码名称
   */
  String FIELD_CODENAME = "CODENAME";
  /**
   * 属性: 系统标识
   */
  String FIELD_SYSTEMID = "SYSTEMID";
  /**
   * 属性: 应用标识
   */
  String FIELD_APPID = "APPID";
  /**
   * 属性: 类型
   */
  String FIELD_CTYPE = "CTYPE";
  /**
   * 属性: 实体标识
   */
  String FIELD_ENTITYID = "ENTITYID";
  /**
   * 属性: 主实体
   */
  String FIELD_ENTITYNAME = "ENTITYNAME";
  /**
   * 属性: 配置
   */
  String FIELD_CFG = "CFG";
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
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 行为: Sync
   */
  String ACTION_SYNC = "Sync";
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
            case "DstComponentDTO":
                return new DstComponentDTO();
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
                this.create((DstComponentDTO) args[0]);
                return null;
            case "update" :
                this.update((DstComponentDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((DstComponentDTO) args[0]);
            case "checkkey" :
                return this.checkKey((DstComponentDTO) args[0]);
            case "save" :
                this.save((DstComponentDTO) args[0]);
                return null;
            case "sync" :
                this.sync((DstComponentDTO) args[0]);
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
     * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdeactions/Create.ibizmodel.yaml
     */
    default void create(DstComponentDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdeactions/Update.ibizmodel.yaml
     */
    default void update(DstComponentDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdeactions/Get.ibizmodel.yaml
     */
    default DstComponentDTO get(String key) throws Throwable {
        return (DstComponentDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdeactions/GetDraft.ibizmodel.yaml
     */
    default DstComponentDTO getDraft(DstComponentDTO dto) throws Throwable {
        return (DstComponentDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(DstComponentDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdeactions/Save.ibizmodel.yaml
     */
    default void save(DstComponentDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * Sync
     * 同步1
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdeactions/Sync.ibizmodel.yaml
     */
    default void sync(DstComponentDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Sync", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<DstComponentDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<DstComponentDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<DstComponentDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<DstComponentDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_COMPONENT/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<DstComponentDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<DstComponentDTO>) obj;
    }

}

