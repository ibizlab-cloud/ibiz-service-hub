package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.DynaInstDTO;
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
 * 动态实例
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/.ibizmodel.index
 */
public interface IDynaInstService extends IDEService<DynaInstDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/uaa/PSDATAENTITIES/DynaInst.json";

  /**
   * 属性: 备注
   */
  String FIELD_MEMO = "MEMO";
  /**
   * 属性: 启用标志
   */
  String FIELD_ISVALID = "ISVALID";
  /**
   * 属性: 真实实例标识
   */
  String FIELD_REALDYNAINSTID = "REALDYNAINSTID";
  /**
   * 属性: 动态实例标识
   */
  String FIELD_DYNAINSTID = "DYNAINSTID";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 动态实例名称
   */
  String FIELD_DYNAINSTNAME = "DYNAINSTNAME";
  /**
   * 属性: 建立时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 预置实例
   */
  String FIELD_INTERNALINST = "INTERNALINST";
  /**
   * 属性: 默认实例
   */
  String FIELD_DEFAULTINST = "DEFAULTINST";
  /**
   * 属性: 已安装实例数据
   */
  String FIELD_INSTALLDYNAINST = "INSTALLDYNAINST";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 系统标识
   */
  String FIELD_SYSTEMID = "SYSTEMID";
  /**
   * 属性: 租户系统标识
   */
  String FIELD_DCSYSTEMID = "DCSYSTEMID";
  /**
   * 属性: 租户标识
   */
  String FIELD_SRFDCID = "SRFDCID";
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
   * 行为: 安装实例数据
   */
  String ACTION_INSTALLDYNAINST = "InstallDynaInst";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 查询: 数据查询
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 忽略租户
   */
  String DATAQUERY_IGNORECENTER = "IgnoreCenter";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: 数据集
   */
  String DATASET_DEFAULT = "DEFAULT";
  /**
   * 集合: 忽略租户
   */
  String DATASET_IGNORECENTER = "IgnoreCenter";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "DynaInstDTO":
                return new DynaInstDTO();
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
                this.create((DynaInstDTO) args[0]);
                return null;
            case "update" :
                this.update((DynaInstDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((DynaInstDTO) args[0]);
            case "checkkey" :
                return this.checkKey((DynaInstDTO) args[0]);
            case "installdynainst" :
                this.installDynaInst((DynaInstDTO) args[0]);
                return null;
            case "save" :
                this.save((DynaInstDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "default" :
               return this.fetchDefault((ISearchContextDTO) args[0]);
            case "ignorecenter" :
               return this.fetchIgnoreCenter((ISearchContextDTO) args[0]);
        }
        return this.getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
    } 

    /**
     * Create
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdeactions/Create.ibizmodel.yaml
     */
    default void create(DynaInstDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdeactions/Update.ibizmodel.yaml
     */
    default void update(DynaInstDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdeactions/Get.ibizmodel.yaml
     */
    default DynaInstDTO get(String key) throws Throwable {
        return (DynaInstDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdeactions/GetDraft.ibizmodel.yaml
     */
    default DynaInstDTO getDraft(DynaInstDTO dto) throws Throwable {
        return (DynaInstDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(DynaInstDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 安装实例数据
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdeactions/InstallDynaInst.ibizmodel.yaml
     */
    default void installDynaInst(DynaInstDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("InstallDynaInst", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdeactions/Save.ibizmodel.yaml
     */
    default void save(DynaInstDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<DynaInstDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<DynaInstDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }

    /**
     * 忽略租户
     * 包含数据查询：忽略租户
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdedatasets/IgnoreCenter.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdedataqueries/IgnoreCenter.ibizmodel.ui
     */
    default Page<DynaInstDTO> fetchIgnoreCenter(ISearchContextDTO dto) throws Throwable {
        return (Page<DynaInstDTO>) this.getDataEntityRuntime().fetchDataSet("IgnoreCenter", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<DynaInstDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<DynaInstDTO>) obj;
    }


    /**
     * 忽略租户
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdedataqueries/IgnoreCenter.ibizmodel.ui
     */
    default List<DynaInstDTO> selectIgnoreCenter(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("IgnoreCenter", dto);
        return (List<DynaInstDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DYNAINST/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<DynaInstDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<DynaInstDTO>) obj;
    }

}

