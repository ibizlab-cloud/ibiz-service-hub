package net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.TeamMemberDTO;
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
 * 组成员
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/.ibizmodel.index
 */
public interface ITeamMemberService extends IDEService<TeamMemberDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/ou/PSDATAENTITIES/TeamMember.json";

  /**
   * 属性: 组成员标识
   */
  String FIELD_TEAMMEMBERID = "TEAMMEMBERID";
  /**
   * 属性: 组标识
   */
  String FIELD_TEAMID = "TEAMID";
  /**
   * 属性: 组名称
   */
  String FIELD_TEAMNAME = "TEAMNAME";
  /**
   * 属性: 用户标识
   */
  String FIELD_USERID = "USERID";
  /**
   * 属性: 姓名
   */
  String FIELD_PERSONNAME = "PERSONNAME";
  /**
   * 属性: 岗位标识
   */
  String FIELD_POSTID = "POSTID";
  /**
   * 属性: 岗位
   */
  String FIELD_POSTNAME = "POSTNAME";
  /**
   * 属性: 区属
   */
  String FIELD_DOMAINS = "DOMAINS";
  /**
   * 属性: 登录名
   */
  String FIELD_USERNAME = "USERNAME";
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
   * 查询: DEFAULT
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: DEFAULT
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
            case "TeamMemberDTO":
                return new TeamMemberDTO();
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
                this.create((TeamMemberDTO) args[0]);
                return null;
            case "update" :
                this.update((TeamMemberDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((TeamMemberDTO) args[0]);
            case "checkkey" :
                return this.checkKey((TeamMemberDTO) args[0]);
            case "save" :
                this.save((TeamMemberDTO) args[0]);
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
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdeactions/Create.ibizmodel.yaml
     */
    default void create(TeamMemberDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdeactions/Update.ibizmodel.yaml
     */
    default void update(TeamMemberDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdeactions/Get.ibizmodel.yaml
     */
    default TeamMemberDTO get(String key) throws Throwable {
        return (TeamMemberDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdeactions/GetDraft.ibizmodel.yaml
     */
    default TeamMemberDTO getDraft(TeamMemberDTO dto) throws Throwable {
        return (TeamMemberDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(TeamMemberDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdeactions/Save.ibizmodel.yaml
     */
    default void save(TeamMemberDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<TeamMemberDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<TeamMemberDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<TeamMemberDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<TeamMemberDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAMMEMBER/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<TeamMemberDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<TeamMemberDTO>) obj;
    }

}

