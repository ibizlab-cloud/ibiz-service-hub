package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFMemberDTO;
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
 * 成员
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/.ibizmodel.index
 */
public interface IWFMemberService extends IDEService<WFMemberDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/workflow/PSDATAENTITIES/WFMember.json";

  /**
   * 属性: 组成员标识
   */
  String FIELD_MEMBERID = "MEMBERID";
  /**
   * 属性: 组成员名称
   */
  String FIELD_MEMBERNAME = "MEMBERNAME";
  /**
   * 属性: 组标识
   */
  String FIELD_GROUPID = "GROUPID";
  /**
   * 属性: 用户组
   */
  String FIELD_GROUPNAME = "GROUPNAME";
  /**
   * 属性: 单位
   */
  String FIELD_ORGID = "ORGID";
  /**
   * 属性: 业务编码
   */
  String FIELD_BCODE = "BCODE";
  /**
   * 属性: 删除标识
   */
  String FIELD_ENABLE = "ENABLE";
  /**
   * 属性: 单位
   */
  String FIELD_ORGNAME = "ORGNAME";
  /**
   * 属性: 用户
   */
  String FIELD_PERSONNAME = "PERSONNAME";
  /**
   * 属性: 部门
   */
  String FIELD_MDEPTID = "MDEPTID";
  /**
   * 属性: 部门
   */
  String FIELD_MDEPTNAME = "MDEPTNAME";
  /**
   * 属性: 组标识
   */
  String FIELD_GROUPCODE = "GROUPCODE";
  /**
   * 属性: 排序
   */
  String FIELD_SHOWORDER = "SHOWORDER";
  /**
   * 属性: 用户标识
   */
  String FIELD_USERID = "USERID";
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
   * 行为: 查询部门人员
   */
  String ACTION_SELECTMULTIDEPTUSER = "SelectMultiDeptUser";
  /**
   * 查询: DEFAULT
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 排除数据
   */
  String DATAQUERY_EXCLUDE = "EXCLUDE";
  /**
   * 查询: 查询多部门成员
   */
  String DATAQUERY_MULTIDEPTUSER = "MultiDeptUser";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: DEFAULT
   */
  String DATASET_DEFAULT = "DEFAULT";
  /**
   * 集合: 排除数据
   */
  String DATASET_EXCLUDE = "EXCLUDE";
  /**
   * 集合: 查询多部门成员
   */
  String DATASET_MULTIDEPTUSER = "MultiDeptUser";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "WFMemberDTO":
                return new WFMemberDTO();
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
                this.create((WFMemberDTO) args[0]);
                return null;
            case "update" :
                this.update((WFMemberDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((WFMemberDTO) args[0]);
            case "checkkey" :
                return this.checkKey((WFMemberDTO) args[0]);
            case "save" :
                this.save((WFMemberDTO) args[0]);
                return null;
            case "selectmultideptuser" :
                this.selectMultiDeptUser((WFMemberDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "default" :
               return this.fetchDefault((ISearchContextDTO) args[0]);
            case "exclude" :
               return this.fetchExclude((ISearchContextDTO) args[0]);
            case "multideptuser" :
               return this.fetchMultiDeptUser((ISearchContextDTO) args[0]);
        }
        return this.getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
    } 

    /**
     * Create
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdeactions/Create.ibizmodel.yaml
     */
    default void create(WFMemberDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdeactions/Update.ibizmodel.yaml
     */
    default void update(WFMemberDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdeactions/Get.ibizmodel.yaml
     */
    default WFMemberDTO get(String key) throws Throwable {
        return (WFMemberDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdeactions/GetDraft.ibizmodel.yaml
     */
    default WFMemberDTO getDraft(WFMemberDTO dto) throws Throwable {
        return (WFMemberDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(WFMemberDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdeactions/Save.ibizmodel.yaml
     */
    default void save(WFMemberDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 查询部门人员
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdeactions/SelectMultiDeptUser.ibizmodel.yaml
     */
    default void selectMultiDeptUser(WFMemberDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("SelectMultiDeptUser", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<WFMemberDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<WFMemberDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }

    /**
     * 排除数据
     * 包含数据查询：排除数据
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdedatasets/EXCLUDE.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdedataqueries/EXCLUDE.ibizmodel.ui
     */
    default Page<WFMemberDTO> fetchExclude(ISearchContextDTO dto) throws Throwable {
        return (Page<WFMemberDTO>) this.getDataEntityRuntime().fetchDataSet("EXCLUDE", null, new Object[]{dto}, true);
    }

    /**
     * 查询多部门成员
     * 包含数据查询：查询多部门成员
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdedatasets/MultiDeptUser.ibizmodel.yaml
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdedataqueries/MultiDeptUser.ibizmodel.ui
     */
    default Page<WFMemberDTO> fetchMultiDeptUser(ISearchContextDTO dto) throws Throwable {
        return (Page<WFMemberDTO>) this.getDataEntityRuntime().fetchDataSet("MultiDeptUser", null, new Object[]{dto}, true);
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<WFMemberDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<WFMemberDTO>) obj;
    }


    /**
     * 排除数据
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdedataqueries/EXCLUDE.ibizmodel.ui
     */
    default List<WFMemberDTO> selectExclude(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("EXCLUDE", dto);
        return (List<WFMemberDTO>) obj;
    }


    /**
     * 查询多部门成员
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdedataqueries/MultiDeptUser.ibizmodel.ui
     */
    default List<WFMemberDTO> selectMultiDeptUser(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("MultiDeptUser", dto);
        return (List<WFMemberDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/workflow/psdataentities/WF_GROUP_MEMBER/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<WFMemberDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<WFMemberDTO>) obj;
    }

}

