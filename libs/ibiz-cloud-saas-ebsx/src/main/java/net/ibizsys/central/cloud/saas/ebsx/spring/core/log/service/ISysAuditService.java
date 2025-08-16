package net.ibizsys.central.cloud.saas.ebsx.spring.core.log.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.log.dto.SysAuditDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.log.dto.SysAuditSimpleDTO;
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
 * 系统审计
 * 
 * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/.ibizmodel.index
 */
public interface ISysAuditService extends IDEService<SysAuditDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/log/PSDATAENTITIES/SysAudit.json";

  /**
   * 属性: 日志级别
   */
  String FIELD_LOGLEVEL = "LOGLEVEL";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 审计时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 系统审计标识
   */
  String FIELD_SYSAUDITID = "SYSAUDITID";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 审计类别
   */
  String FIELD_AUDITCAT = "AUDITCAT";
  /**
   * 属性: 访问地址
   */
  String FIELD_ADDRESS = "ADDRESS";
  /**
   * 属性: 审计名称
   */
  String FIELD_SYSAUDITNAME = "SYSAUDITNAME";
  /**
   * 属性: 审计信息
   */
  String FIELD_AUDITINFO = "AUDITINFO";
  /**
   * 属性: 操作人
   */
  String FIELD_OPPERSONNAME = "OPPERSONNAME";
  /**
   * 属性: 操作人
   */
  String FIELD_OPPERSONID = "OPPERSONID";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 租户
   */
  String FIELD_SRFDCID = "SRFDCID";
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
            case "SysAuditDTO":
                return new SysAuditDTO();
            case "SysAuditSimpleDTO":
                return new SysAuditSimpleDTO();
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
                this.create((SysAuditDTO) args[0]);
                return null;
            case "update" :
                this.update((SysAuditDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((SysAuditDTO) args[0]);
            case "checkkey" :
                return this.checkKey((SysAuditDTO) args[0]);
            case "save" :
                this.save((SysAuditDTO) args[0]);
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
     * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdeactions/Create.ibizmodel.yaml
     */
    default void create(SysAuditDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdeactions/Update.ibizmodel.yaml
     */
    default void update(SysAuditDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdeactions/Get.ibizmodel.yaml
     */
    default SysAuditDTO get(String key) throws Throwable {
        return (SysAuditDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdeactions/GetDraft.ibizmodel.yaml
     */
    default SysAuditDTO getDraft(SysAuditDTO dto) throws Throwable {
        return (SysAuditDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(SysAuditDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdeactions/Save.ibizmodel.yaml
     */
    default void save(SysAuditDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<SysAuditDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<SysAuditDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<SysAuditDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<SysAuditDTO>) obj;
    }


    /**
     * 基础属性查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdedataqueries/SIMPLE.ibizmodel.ui
     */
    default List<SysAuditSimpleDTO> selectSimple(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SIMPLE", dto);
        return (List<SysAuditSimpleDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<SysAuditDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<SysAuditDTO>) obj;
    }

}

