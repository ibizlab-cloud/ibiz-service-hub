package net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto.DCCenterDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto.DCCenterSimpleDTO;
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
 * 机构中心
 * 
 * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/.ibizmodel.index
 */
public interface IDCCenterService extends IDEService<DCCenterDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/center/PSDATAENTITIES/DCCenter.json";

  /**
   * 属性: 第三方插件服务地址
   */
  String FIELD_TPPROOTURL = "TPPROOTURL";
  /**
   * 属性: 门户地址
   */
  String FIELD_PORTALURL = "PORTALURL";
  /**
   * 属性: 域名
   */
  String FIELD_DOMAINS = "DOMAINS";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 租户标识
   */
  String FIELD_CENTERID = "CENTERID";
  /**
   * 属性: 建立时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 租户名称
   */
  String FIELD_CENTERNAME = "CENTERNAME";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 到期时间
   */
  String FIELD_EXPIRATIONDATE = "EXPIRATIONDATE";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
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
   * 行为: 初始化
   */
  String ACTION_INIT = "Init";
  /**
   * 行为: 初始化默认开放平台访问
   */
  String ACTION_INITDEFAULTOPENACCESS = "InitDefaultOpenAccess";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
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
            case "DCCenterDTO":
                return new DCCenterDTO();
            case "DCCenterSimpleDTO":
                return new DCCenterSimpleDTO();
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
                this.create((DCCenterDTO) args[0]);
                return null;
            case "update" :
                this.update((DCCenterDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((DCCenterDTO) args[0]);
            case "checkkey" :
                return this.checkKey((DCCenterDTO) args[0]);
            case "init" :
                this.init((DCCenterDTO) args[0]);
                return null;
            case "initdefaultopenaccess" :
                this.initDefaultOpenAccess((DCCenterDTO) args[0]);
                return null;
            case "save" :
                this.save((DCCenterDTO) args[0]);
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
     * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdeactions/Create.ibizmodel.yaml
     */
    default void create(DCCenterDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdeactions/Update.ibizmodel.yaml
     */
    default void update(DCCenterDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdeactions/Get.ibizmodel.yaml
     */
    default DCCenterDTO get(String key) throws Throwable {
        return (DCCenterDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdeactions/GetDraft.ibizmodel.yaml
     */
    default DCCenterDTO getDraft(DCCenterDTO dto) throws Throwable {
        return (DCCenterDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(DCCenterDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 初始化
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdeactions/Init.ibizmodel.yaml
     */
    default void init(DCCenterDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Init", null, new Object[]{dto}, true);
    }

    /**
     * 初始化默认开放平台访问
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdeactions/InitDefaultOpenAccess.ibizmodel.yaml
     */
    default void initDefaultOpenAccess(DCCenterDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("InitDefaultOpenAccess", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdeactions/Save.ibizmodel.yaml
     */
    default void save(DCCenterDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<DCCenterDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<DCCenterDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<DCCenterDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<DCCenterDTO>) obj;
    }


    /**
     * 基础属性查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdedataqueries/SIMPLE.ibizmodel.ui
     */
    default List<DCCenterSimpleDTO> selectSimple(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SIMPLE", dto);
        return (List<DCCenterSimpleDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<DCCenterDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<DCCenterDTO>) obj;
    }

}

