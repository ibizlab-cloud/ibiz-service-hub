package net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.CarbonCopyHisDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.CarbonCopyHisSimpleDTO;
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
 * 抄送历史
 * 
 * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/.ibizmodel.index
 */
public interface ICarbonCopyHisService extends IDEService<CarbonCopyHisDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/notify/PSDATAENTITIES/CarbonCopyHis.json";

  /**
   * 属性: 连接地址
   */
  String FIELD_LINKURL = "LINKURL";
  /**
   * 属性: 业务数据标识
   */
  String FIELD_BIZKEY = "BIZKEY";
  /**
   * 属性: 长文本参数01
   */
  String FIELD_CLOBPARAM01 = "CLOBPARAM01";
  /**
   * 属性: 内容
   */
  String FIELD_CONTENT = "CONTENT";
  /**
   * 属性: 参数08
   */
  String FIELD_PARAM08 = "PARAM08";
  /**
   * 属性: 待办状态
   */
  String FIELD_TODOSTATE = "TODOSTATE";
  /**
   * 属性: 过期时间
   */
  String FIELD_DUEDATE = "DUEDATE";
  /**
   * 属性: 是否已读
   */
  String FIELD_ISREAD = "ISREAD";
  /**
   * 属性: 参数02
   */
  String FIELD_PARAM02 = "PARAM02";
  /**
   * 属性: 创建时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 待办标识
   */
  String FIELD_TODOID = "TODOID";
  /**
   * 属性: 处理时间
   */
  String FIELD_PROCESSDATE = "PROCESSDATE";
  /**
   * 属性: 参数05
   */
  String FIELD_PARAM05 = "PARAM05";
  /**
   * 属性: 长文本参数02
   */
  String FIELD_CLOBPARAM02 = "CLOBPARAM02";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 创建人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 参数03
   */
  String FIELD_PARAM03 = "PARAM03";
  /**
   * 属性: 待办类型
   */
  String FIELD_TODOTYPE = "TODOTYPE";
  /**
   * 属性: 参数06
   */
  String FIELD_PARAM06 = "PARAM06";
  /**
   * 属性: 待办用户标识
   */
  String FIELD_USERID = "USERID";
  /**
   * 属性: 参数04
   */
  String FIELD_PARAM04 = "PARAM04";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 业务对象
   */
  String FIELD_BIZTYPE = "BIZTYPE";
  /**
   * 属性: 参数01
   */
  String FIELD_PARAM01 = "PARAM01";
  /**
   * 属性: 参数07
   */
  String FIELD_PARAM07 = "PARAM07";
  /**
   * 属性: 组织机构标识
   */
  String FIELD_ORGID = "ORGID";
  /**
   * 属性: 标题
   */
  String FIELD_TITLE = "TITLE";
  /**
   * 属性: 租户系统
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
            case "CarbonCopyHisDTO":
                return new CarbonCopyHisDTO();
            case "CarbonCopyHisSimpleDTO":
                return new CarbonCopyHisSimpleDTO();
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
                this.create((CarbonCopyHisDTO) args[0]);
                return null;
            case "update" :
                this.update((CarbonCopyHisDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((CarbonCopyHisDTO) args[0]);
            case "checkkey" :
                return this.checkKey((CarbonCopyHisDTO) args[0]);
            case "save" :
                this.save((CarbonCopyHisDTO) args[0]);
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
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdeactions/Create.ibizmodel.yaml
     */
    default void create(CarbonCopyHisDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdeactions/Update.ibizmodel.yaml
     */
    default void update(CarbonCopyHisDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdeactions/Get.ibizmodel.yaml
     */
    default CarbonCopyHisDTO get(String key) throws Throwable {
        return (CarbonCopyHisDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdeactions/GetDraft.ibizmodel.yaml
     */
    default CarbonCopyHisDTO getDraft(CarbonCopyHisDTO dto) throws Throwable {
        return (CarbonCopyHisDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(CarbonCopyHisDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdeactions/Save.ibizmodel.yaml
     */
    default void save(CarbonCopyHisDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<CarbonCopyHisDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<CarbonCopyHisDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<CarbonCopyHisDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<CarbonCopyHisDTO>) obj;
    }


    /**
     * 基础属性查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdedataqueries/SIMPLE.ibizmodel.ui
     */
    default List<CarbonCopyHisSimpleDTO> selectSimple(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SIMPLE", dto);
        return (List<CarbonCopyHisSimpleDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<CarbonCopyHisDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<CarbonCopyHisDTO>) obj;
    }

}

