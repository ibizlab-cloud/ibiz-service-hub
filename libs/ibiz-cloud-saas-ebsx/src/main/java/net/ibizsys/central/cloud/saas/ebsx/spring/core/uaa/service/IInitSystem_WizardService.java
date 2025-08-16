package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.InitSystem_WizardDTO;
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
 * 系统初始化向导
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/.ibizmodel.index
 */
public interface IInitSystem_WizardService extends IDEService<InitSystem_WizardDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/uaa/PSDATAENTITIES/InitSystem_Wizard.json";

  /**
   * 属性: 租户系统初始化向导标识
   */
  String FIELD_SYS_INITSYSTEM_WIZARDID = "SYS_INITSYSTEM_WIZARDID";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 租户系统
   */
  String FIELD_DCSYSTEMID = "DCSYSTEMID";
  /**
   * 属性: 租户系统初始化向导名称
   */
  String FIELD_SYS_INITSYSTEM_WIZARDNAME = "SYS_INITSYSTEM_WIZARDNAME";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 租户标识
   */
  String FIELD_CENTERID = "CENTERID";
  /**
   * 属性: 建立时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 系统
   */
  String FIELD_SYSTEMNAME = "SYSTEMNAME";
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
   * 行为: 安装租户系统
   */
  String ACTION_INSTALL = "INSTALL";
  /**
   * 行为: 安装实例模型
   */
  String ACTION_INSTALL2 = "INSTALL2";
  /**
   * 行为: 安装实例模型（一键发布回调）
   */
  String ACTION_INSTALL3 = "INSTALL3";
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
            case "InitSystem_WizardDTO":
                return new InitSystem_WizardDTO();
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
                this.create((InitSystem_WizardDTO) args[0]);
                return null;
            case "update" :
                this.update((InitSystem_WizardDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((InitSystem_WizardDTO) args[0]);
            case "checkkey" :
                return this.checkKey((InitSystem_WizardDTO) args[0]);
            case "install" :
                this.install((InitSystem_WizardDTO) args[0]);
                return null;
            case "install2" :
                this.install2((InitSystem_WizardDTO) args[0]);
                return null;
            case "install3" :
                this.install3((InitSystem_WizardDTO) args[0]);
                return null;
            case "save" :
                this.save((InitSystem_WizardDTO) args[0]);
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
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdeactions/Create.ibizmodel.yaml
     */
    default void create(InitSystem_WizardDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdeactions/Update.ibizmodel.yaml
     */
    default void update(InitSystem_WizardDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdeactions/Get.ibizmodel.yaml
     */
    default InitSystem_WizardDTO get(String key) throws Throwable {
        return (InitSystem_WizardDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdeactions/GetDraft.ibizmodel.yaml
     */
    default InitSystem_WizardDTO getDraft(InitSystem_WizardDTO dto) throws Throwable {
        return (InitSystem_WizardDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(InitSystem_WizardDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 安装租户系统
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdeactions/INSTALL.ibizmodel.yaml
     */
    default void install(InitSystem_WizardDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("INSTALL", null, new Object[]{dto}, true);
    }

    /**
     * 安装实例模型
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdeactions/INSTALL2.ibizmodel.yaml
     */
    default void install2(InitSystem_WizardDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("INSTALL2", null, new Object[]{dto}, true);
    }

    /**
     * 安装实例模型（一键发布回调）
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdeactions/INSTALL3.ibizmodel.yaml
     */
    default void install3(InitSystem_WizardDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("INSTALL3", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdeactions/Save.ibizmodel.yaml
     */
    default void save(InitSystem_WizardDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<InitSystem_WizardDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<InitSystem_WizardDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<InitSystem_WizardDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<InitSystem_WizardDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<InitSystem_WizardDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<InitSystem_WizardDTO>) obj;
    }

}

