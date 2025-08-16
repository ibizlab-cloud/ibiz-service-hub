package net.ibizsys.central.cloud.saas.ebsx.spring.core.log.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.log.dto.SysPODTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.log.dto.SysPOSimpleDTO;
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
 * 系统优化日志
 * 
 * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/.ibizmodel.index
 */
public interface ISysPOService extends IDEService<SysPODTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/log/PSDATAENTITIES/SysPO.json";

  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 租户
   */
  String FIELD_SRFDCID = "SRFDCID";
  /**
   * 属性: 时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 优化信息
   */
  String FIELD_POINFO = "POINFO";
  /**
   * 属性: 日志级别
   */
  String FIELD_LOGLEVEL = "LOGLEVEL";
  /**
   * 属性: 优化类别
   */
  String FIELD_POCAT = "POCAT";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 优化时间（ms）
   */
  String FIELD_TIME = "TIME";
  /**
   * 属性: 优化标识
   */
  String FIELD_SYSPOID = "SYSPOID";
  /**
   * 属性: 操作
   */
  String FIELD_ACTION = "ACTION";
  /**
   * 属性: 优化名称
   */
  String FIELD_SYSPONAME = "SYSPONAME";
  /**
   * 属性: 实体
   */
  String FIELD_DENAME = "DENAME";
  /**
   * 属性: 系统
   */
  String FIELD_DCSYSTEMNAME = "DCSYSTEMNAME";
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
            case "SysPODTO":
                return new SysPODTO();
            case "SysPOSimpleDTO":
                return new SysPOSimpleDTO();
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
                this.create((SysPODTO) args[0]);
                return null;
            case "update" :
                this.update((SysPODTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((SysPODTO) args[0]);
            case "checkkey" :
                return this.checkKey((SysPODTO) args[0]);
            case "save" :
                this.save((SysPODTO) args[0]);
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
     * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdeactions/Create.ibizmodel.yaml
     */
    default void create(SysPODTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdeactions/Update.ibizmodel.yaml
     */
    default void update(SysPODTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdeactions/Get.ibizmodel.yaml
     */
    default SysPODTO get(String key) throws Throwable {
        return (SysPODTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdeactions/GetDraft.ibizmodel.yaml
     */
    default SysPODTO getDraft(SysPODTO dto) throws Throwable {
        return (SysPODTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(SysPODTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdeactions/Save.ibizmodel.yaml
     */
    default void save(SysPODTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<SysPODTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<SysPODTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<SysPODTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<SysPODTO>) obj;
    }


    /**
     * 基础属性查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdedataqueries/SIMPLE.ibizmodel.ui
     */
    default List<SysPOSimpleDTO> selectSimple(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SIMPLE", dto);
        return (List<SysPOSimpleDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<SysPODTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<SysPODTO>) obj;
    }

}

