package net.ibizsys.central.cloud.saas.ebsx.spring.core.rep.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.rep.dto.ReportDTO;
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
 * 报表
 * 
 * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/.ibizmodel.index
 */
public interface IReportService extends IDEService<ReportDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/rep/PSDATAENTITIES/Report.json";

  /**
   * 属性: 建立时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 报表标识
   */
  String FIELD_REPORTID = "REPORTID";
  /**
   * 属性: 报表名称
   */
  String FIELD_REPORTNAME = "REPORTNAME";
  /**
   * 属性: 动态实例标识
   */
  String FIELD_DYNAINSTID = "DYNAINSTID";
  /**
   * 属性: 系统标识
   */
  String FIELD_SYSTEMID = "SYSTEMID";
  /**
   * 属性: 报表编号
   */
  String FIELD_REPORTCODE = "REPORTCODE";
  /**
   * 属性: 资源标识
   */
  String FIELD_RESOURCEID = "RESOURCEID";
  /**
   * 属性: 配置
   */
  String FIELD_CONF = "CONF";
  /**
   * 属性: 数据源
   */
  String FIELD_DSLINK = "DSLINK";
  /**
   * 属性: 报表类型
   */
  String FIELD_REPORTTYPE = "REPORTTYPE";
  /**
   * 属性: 租户系统标识
   */
  String FIELD_DCSYSTEMID = "DCSYSTEMID";
  /**
   * 属性: 系统名称
   */
  String FIELD_DCSYSTEMNAME = "DCSYSTEMNAME";
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
   * 行为: 行为
   */
  String ACTION_FINDREPORT = "FindReport";
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
            case "ReportDTO":
                return new ReportDTO();
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
                this.create((ReportDTO) args[0]);
                return null;
            case "update" :
                this.update((ReportDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((ReportDTO) args[0]);
            case "checkkey" :
                return this.checkKey((ReportDTO) args[0]);
            case "findreport" :
                this.findReport((ReportDTO) args[0]);
                return null;
            case "save" :
                this.save((ReportDTO) args[0]);
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
     * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdeactions/Create.ibizmodel.yaml
     */
    default void create(ReportDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdeactions/Update.ibizmodel.yaml
     */
    default void update(ReportDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdeactions/Get.ibizmodel.yaml
     */
    default ReportDTO get(String key) throws Throwable {
        return (ReportDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdeactions/GetDraft.ibizmodel.yaml
     */
    default ReportDTO getDraft(ReportDTO dto) throws Throwable {
        return (ReportDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(ReportDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 行为
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdeactions/FindReport.ibizmodel.yaml
     */
    default void findReport(ReportDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("FindReport", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdeactions/Save.ibizmodel.yaml
     */
    default void save(ReportDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<ReportDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<ReportDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<ReportDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<ReportDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/rep/psdataentities/REP_REPORT/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<ReportDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<ReportDTO>) obj;
    }

}

