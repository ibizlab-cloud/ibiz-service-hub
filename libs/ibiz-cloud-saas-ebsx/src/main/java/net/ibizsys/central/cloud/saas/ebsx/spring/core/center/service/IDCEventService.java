package net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto.DCEventDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto.DCEventSimpleDTO;
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
 * 系统事件
 * 
 * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/.ibizmodel.index
 */
public interface IDCEventService extends IDEService<DCEventDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/center/PSDATAENTITIES/DCEvent.json";

  /**
   * 属性: 详细信息
   */
  String FIELD_EVENTINFO = "EVENTINFO";
  /**
   * 属性: 操作人
   */
  String FIELD_OPPERSONID = "OPPERSONID";
  /**
   * 属性: 事件时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 事件标识
   */
  String FIELD_SYSEVENTID = "SYSEVENTID";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 日志级别
   */
  String FIELD_LOGLEVEL = "LOGLEVEL";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 事件名称
   */
  String FIELD_SYSEVENTNAME = "SYSEVENTNAME";
  /**
   * 属性: 事件类别
   */
  String FIELD_EVENTCAT = "EVENTCAT";
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
            case "DCEventDTO":
                return new DCEventDTO();
            case "DCEventSimpleDTO":
                return new DCEventSimpleDTO();
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
                this.create((DCEventDTO) args[0]);
                return null;
            case "update" :
                this.update((DCEventDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((DCEventDTO) args[0]);
            case "checkkey" :
                return this.checkKey((DCEventDTO) args[0]);
            case "save" :
                this.save((DCEventDTO) args[0]);
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
     * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdeactions/Create.ibizmodel.yaml
     */
    default void create(DCEventDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdeactions/Update.ibizmodel.yaml
     */
    default void update(DCEventDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdeactions/Get.ibizmodel.yaml
     */
    default DCEventDTO get(String key) throws Throwable {
        return (DCEventDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdeactions/GetDraft.ibizmodel.yaml
     */
    default DCEventDTO getDraft(DCEventDTO dto) throws Throwable {
        return (DCEventDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(DCEventDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdeactions/Save.ibizmodel.yaml
     */
    default void save(DCEventDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<DCEventDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<DCEventDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<DCEventDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<DCEventDTO>) obj;
    }


    /**
     * 基础属性查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdedataqueries/SIMPLE.ibizmodel.ui
     */
    default List<DCEventSimpleDTO> selectSimple(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SIMPLE", dto);
        return (List<DCEventSimpleDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<DCEventDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<DCEventDTO>) obj;
    }

}

