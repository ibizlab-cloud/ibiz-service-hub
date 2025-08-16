package net.ibizsys.central.cloud.saas.ebsx.spring.core.operationmgr.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.operationmgr.dto.DataAuditDTO;
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
 * 访问日志
 * 
 * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/.ibizmodel.index
 */
public interface IDataAuditService extends IDEService<DataAuditDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/OperationMgr/PSDATAENTITIES/DataAudit.json";

  /**
   * 属性: 对象类型
   */
  String FIELD_OBJECTTYPE = "OBJECTTYPE";
  /**
   * 属性: 审计明细
   */
  String FIELD_AUDITINFO = "AUDITINFO";
  /**
   * 属性: 建立时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 访问日志标识
   */
  String FIELD_DATAAUDITID = "DATAAUDITID";
  /**
   * 属性: 文件类型
   */
  String FIELD_AUDITTYPE = "AUDITTYPE";
  /**
   * 属性: 访问日志名称
   */
  String FIELD_DATAAUDITNAME = "DATAAUDITNAME";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 对象编号
   */
  String FIELD_OBJECTID = "OBJECTID";
  /**
   * 属性: 操作人
   */
  String FIELD_OPPERSONNAME = "OPPERSONNAME";
  /**
   * 属性: 操作人
   */
  String FIELD_OPPERSONID = "OPPERSONID";
  /**
   * 属性: 访问地址
   */
  String FIELD_IPADDRESS = "IPADDRESS";
  /**
   * 属性: 访问标识
   */
  String FIELD_SESSIONID = "SESSIONID";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
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
            case "DataAuditDTO":
                return new DataAuditDTO();
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
                this.create((DataAuditDTO) args[0]);
                return null;
            case "update" :
                this.update((DataAuditDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((DataAuditDTO) args[0]);
            case "checkkey" :
                return this.checkKey((DataAuditDTO) args[0]);
            case "save" :
                this.save((DataAuditDTO) args[0]);
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
     * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdeactions/Create.ibizmodel.yaml
     */
    default void create(DataAuditDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdeactions/Update.ibizmodel.yaml
     */
    default void update(DataAuditDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdeactions/Get.ibizmodel.yaml
     */
    default DataAuditDTO get(String key) throws Throwable {
        return (DataAuditDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdeactions/GetDraft.ibizmodel.yaml
     */
    default DataAuditDTO getDraft(DataAuditDTO dto) throws Throwable {
        return (DataAuditDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(DataAuditDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdeactions/Save.ibizmodel.yaml
     */
    default void save(DataAuditDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<DataAuditDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<DataAuditDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<DataAuditDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<DataAuditDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<DataAuditDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<DataAuditDTO>) obj;
    }

}

