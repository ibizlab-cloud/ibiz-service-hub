package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.DstConfigDTO;
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
 * 配置
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/.ibizmodel.index
 */
public interface IDstConfigService extends IDEService<DstConfigDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/lite/PSDATAENTITIES/DstConfig.json";

  /**
   * 属性: 标识
   */
  String FIELD_CFGID = "CFGID";
  /**
   * 属性: 系统标识
   */
  String FIELD_SYSTEMID = "SYSTEMID";
  /**
   * 属性: 配置类型
   */
  String FIELD_CFGTYPE = "CFGTYPE";
  /**
   * 属性: 引用类型
   */
  String FIELD_TARGETTYPE = "TARGETTYPE";
  /**
   * 属性: 用户标识
   */
  String FIELD_USERID = "USERID";
  /**
   * 属性: 配置内容
   */
  String FIELD_CFG = "CFG";
  /**
   * 属性: 更新时间
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
   * 行为: reset
   */
  String ACTION_RESET = "reset";
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
            case "DstConfigDTO":
                return new DstConfigDTO();
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
                this.create((DstConfigDTO) args[0]);
                return null;
            case "update" :
                this.update((DstConfigDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((DstConfigDTO) args[0]);
            case "checkkey" :
                return this.checkKey((DstConfigDTO) args[0]);
            case "reset" :
                this.reset((DstConfigDTO) args[0]);
                return null;
            case "save" :
                this.save((DstConfigDTO) args[0]);
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
     * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdeactions/Create.ibizmodel.yaml
     */
    default void create(DstConfigDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdeactions/Update.ibizmodel.yaml
     */
    default void update(DstConfigDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdeactions/Get.ibizmodel.yaml
     */
    default DstConfigDTO get(String key) throws Throwable {
        return (DstConfigDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdeactions/GetDraft.ibizmodel.yaml
     */
    default DstConfigDTO getDraft(DstConfigDTO dto) throws Throwable {
        return (DstConfigDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(DstConfigDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * reset
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdeactions/reset.ibizmodel.yaml
     */
    default void reset(DstConfigDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("reset", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdeactions/Save.ibizmodel.yaml
     */
    default void save(DstConfigDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<DstConfigDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<DstConfigDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<DstConfigDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<DstConfigDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_CONFIG/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<DstConfigDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<DstConfigDTO>) obj;
    }

}

