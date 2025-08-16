package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.DstDataSourceDTO;
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
 * 数据源
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/.ibizmodel.index
 */
public interface IDstDataSourceService extends IDEService<DstDataSourceDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/lite/PSDATAENTITIES/DstDataSource.json";

  /**
   * 属性: 标识
   */
  String FIELD_DSID = "DSID";
  /**
   * 属性: 数据源名称
   */
  String FIELD_DSNAME = "DSNAME";
  /**
   * 属性: 类型
   */
  String FIELD_DSTYPE = "DSTYPE";
  /**
   * 属性: 配置
   */
  String FIELD_DSCFG = "DSCFG";
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
   * 行为: buildDS
   */
  String ACTION_BUILDDS = "buildDS";
  /**
   * 行为: CheckKey
   */
  String ACTION_CHECKKEY = "CheckKey";
  /**
   * 行为: 行为
   */
  String ACTION_INITDS = "InitDS";
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
            case "DstDataSourceDTO":
                return new DstDataSourceDTO();
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
                this.create((DstDataSourceDTO) args[0]);
                return null;
            case "update" :
                this.update((DstDataSourceDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((DstDataSourceDTO) args[0]);
            case "buildds" :
                this.buildDS((DstDataSourceDTO) args[0]);
                return null;
            case "checkkey" :
                return this.checkKey((DstDataSourceDTO) args[0]);
            case "initds" :
                this.initDS((DstDataSourceDTO) args[0]);
                return null;
            case "save" :
                this.save((DstDataSourceDTO) args[0]);
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
     * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/psdeactions/Create.ibizmodel.yaml
     */
    default void create(DstDataSourceDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/psdeactions/Update.ibizmodel.yaml
     */
    default void update(DstDataSourceDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/psdeactions/Get.ibizmodel.yaml
     */
    default DstDataSourceDTO get(String key) throws Throwable {
        return (DstDataSourceDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/psdeactions/GetDraft.ibizmodel.yaml
     */
    default DstDataSourceDTO getDraft(DstDataSourceDTO dto) throws Throwable {
        return (DstDataSourceDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * buildDS
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/psdeactions/buildDS.ibizmodel.yaml
     */
    default void buildDS(DstDataSourceDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("buildDS", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(DstDataSourceDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 行为
     * 将数据库结构同步到lite
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/psdeactions/InitDS.ibizmodel.yaml
     */
    default void initDS(DstDataSourceDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("InitDS", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/psdeactions/Save.ibizmodel.yaml
     */
    default void save(DstDataSourceDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<DstDataSourceDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<DstDataSourceDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<DstDataSourceDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<DstDataSourceDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<DstDataSourceDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<DstDataSourceDTO>) obj;
    }

}

