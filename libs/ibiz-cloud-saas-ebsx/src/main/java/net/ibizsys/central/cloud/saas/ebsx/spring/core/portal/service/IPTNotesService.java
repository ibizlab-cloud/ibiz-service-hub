package net.ibizsys.central.cloud.saas.ebsx.spring.core.portal.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.portal.dto.PTNotesDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.portal.dto.PTNotesSimpleDTO;
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
 * 门户备注
 * 
 * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/.ibizmodel.index
 */
public interface IPTNotesService extends IDEService<PTNotesDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/portal/PSDATAENTITIES/PTNotes.json";

  /**
   * 属性: 备注
   */
  String FIELD_MEMO = "MEMO";
  /**
   * 属性: 用户标识
   */
  String FIELD_USERID = "USERID";
  /**
   * 属性: 标题
   */
  String FIELD_NOTESNAME = "NOTESNAME";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
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
   * 属性: 租户
   */
  String FIELD_SRFDCID = "SRFDCID";
  /**
   * 属性: 备忘录标识
   */
  String FIELD_NOTESID = "NOTESID";
  /**
   * 属性: 结束时间
   */
  String FIELD_ENDTIME = "ENDTIME";
  /**
   * 属性: 开始时间
   */
  String FIELD_BEGINTIME = "BEGINTIME";
  /**
   * 属性: 单位标识
   */
  String FIELD_ORGID = "ORGID";
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
   * 查询: 我的备注
   */
  String DATAQUERY_MYNOTES = "MyNotes";
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
  /**
   * 集合: 我的备注
   */
  String DATASET_MYNOTES = "MyNotes";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "PTNotesDTO":
                return new PTNotesDTO();
            case "PTNotesSimpleDTO":
                return new PTNotesSimpleDTO();
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
                this.create((PTNotesDTO) args[0]);
                return null;
            case "update" :
                this.update((PTNotesDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((PTNotesDTO) args[0]);
            case "checkkey" :
                return this.checkKey((PTNotesDTO) args[0]);
            case "save" :
                this.save((PTNotesDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "default" :
               return this.fetchDefault((ISearchContextDTO) args[0]);
            case "mynotes" :
               return this.fetchMyNotes((ISearchContextDTO) args[0]);
        }
        return this.getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
    } 

    /**
     * Create
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdeactions/Create.ibizmodel.yaml
     */
    default void create(PTNotesDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdeactions/Update.ibizmodel.yaml
     */
    default void update(PTNotesDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdeactions/Get.ibizmodel.yaml
     */
    default PTNotesDTO get(String key) throws Throwable {
        return (PTNotesDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdeactions/GetDraft.ibizmodel.yaml
     */
    default PTNotesDTO getDraft(PTNotesDTO dto) throws Throwable {
        return (PTNotesDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(PTNotesDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdeactions/Save.ibizmodel.yaml
     */
    default void save(PTNotesDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<PTNotesDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<PTNotesDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }

    /**
     * 我的备注
     * 包含数据查询：我的备注
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdedatasets/MyNotes.ibizmodel.yaml
     * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdedataqueries/MyNotes.ibizmodel.ui
     */
    default Page<PTNotesDTO> fetchMyNotes(ISearchContextDTO dto) throws Throwable {
        return (Page<PTNotesDTO>) this.getDataEntityRuntime().fetchDataSet("MyNotes", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<PTNotesDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<PTNotesDTO>) obj;
    }


    /**
     * 我的备注
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdedataqueries/MyNotes.ibizmodel.ui
     */
    default List<PTNotesDTO> selectMyNotes(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("MyNotes", dto);
        return (List<PTNotesDTO>) obj;
    }


    /**
     * 基础属性查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdedataqueries/SIMPLE.ibizmodel.ui
     */
    default List<PTNotesSimpleDTO> selectSimple(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SIMPLE", dto);
        return (List<PTNotesSimpleDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<PTNotesDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<PTNotesDTO>) obj;
    }

}

