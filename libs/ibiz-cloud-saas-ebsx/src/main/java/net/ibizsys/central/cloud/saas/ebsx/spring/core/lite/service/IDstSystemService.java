package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.DstSystemDTO;
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
 * 系统
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/.ibizmodel.index
 */
public interface IDstSystemService extends IDEService<DstSystemDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/lite/PSDATAENTITIES/DstSystem.json";

  /**
   * 属性: 系统标识
   */
  String FIELD_PSSYSTEMID = "PSSYSTEMID";
  /**
   * 属性: 系统名称
   */
  String FIELD_PSSYSTEMNAME = "PSSYSTEMNAME";
  /**
   * 属性: 结构
   */
  String FIELD_SYSSTRUCTURE = "SYSSTRUCTURE";
  /**
   * 属性: 应用
   */
  String FIELD_APPS = "APPS";
  /**
   * 属性: 校验
   */
  String FIELD_MD5CHECK = "MD5CHECK";
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
   * 行为: initDefaultDataSource
   */
  String ACTION_INITDEFAULTDATASOURCE = "initDefaultDataSource";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 行为: 同步系统模型
   */
  String ACTION_SYNCSYSMODEL = "SyncSysModel";
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
            case "DstSystemDTO":
                return new DstSystemDTO();
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
                this.create((DstSystemDTO) args[0]);
                return null;
            case "update" :
                this.update((DstSystemDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((DstSystemDTO) args[0]);
            case "checkkey" :
                return this.checkKey((DstSystemDTO) args[0]);
            case "initdefaultdatasource" :
                this.initDefaultDataSource((DstSystemDTO) args[0]);
                return null;
            case "save" :
                this.save((DstSystemDTO) args[0]);
                return null;
            case "syncsysmodel" :
                this.syncSysModel((DstSystemDTO) args[0]);
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
     * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdeactions/Create.ibizmodel.yaml
     */
    default void create(DstSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdeactions/Update.ibizmodel.yaml
     */
    default void update(DstSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdeactions/Get.ibizmodel.yaml
     */
    default DstSystemDTO get(String key) throws Throwable {
        return (DstSystemDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdeactions/GetDraft.ibizmodel.yaml
     */
    default DstSystemDTO getDraft(DstSystemDTO dto) throws Throwable {
        return (DstSystemDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(DstSystemDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * initDefaultDataSource
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdeactions/initDefaultDataSource.ibizmodel.yaml
     */
    default void initDefaultDataSource(DstSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("initDefaultDataSource", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdeactions/Save.ibizmodel.yaml
     */
    default void save(DstSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 同步系统模型
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdeactions/SyncSysModel.ibizmodel.yaml
     */
    default void syncSysModel(DstSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("SyncSysModel", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<DstSystemDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<DstSystemDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<DstSystemDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<DstSystemDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<DstSystemDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<DstSystemDTO>) obj;
    }

}

