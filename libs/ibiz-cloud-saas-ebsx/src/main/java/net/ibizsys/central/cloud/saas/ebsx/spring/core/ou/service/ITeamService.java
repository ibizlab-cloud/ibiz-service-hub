package net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.TeamDTO;
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
 * 组
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAM/.ibizmodel.index
 */
public interface ITeamService extends IDEService<TeamDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/ou/PSDATAENTITIES/Team.json";

  /**
   * 属性: 组标识
   */
  String FIELD_TEAMID = "TEAMID";
  /**
   * 属性: 组名称
   */
  String FIELD_TEAMNAME = "TEAMNAME";
  /**
   * 属性: 备注
   */
  String FIELD_MEMO = "MEMO";
  /**
   * 属性: 区属
   */
  String FIELD_DOMAINS = "DOMAINS";
  /**
   * 属性: 保留
   */
  String FIELD_RESERVER = "RESERVER";
  /**
   * 属性: 保留3
   */
  String FIELD_RESERVER3 = "RESERVER3";
  /**
   * 属性: 保留2
   */
  String FIELD_RESERVER2 = "RESERVER2";
  /**
   * 属性: 保留18
   */
  String FIELD_RESERVER18 = "RESERVER18";
  /**
   * 属性: 保留17
   */
  String FIELD_RESERVER17 = "RESERVER17";
  /**
   * 属性: 保留20
   */
  String FIELD_RESERVER20 = "RESERVER20";
  /**
   * 属性: 保留15
   */
  String FIELD_RESERVER15 = "RESERVER15";
  /**
   * 属性: 保留19
   */
  String FIELD_RESERVER19 = "RESERVER19";
  /**
   * 属性: 保留14
   */
  String FIELD_RESERVER14 = "RESERVER14";
  /**
   * 属性: 保留12
   */
  String FIELD_RESERVER12 = "RESERVER12";
  /**
   * 属性: 保留16
   */
  String FIELD_RESERVER16 = "RESERVER16";
  /**
   * 属性: 保留13
   */
  String FIELD_RESERVER13 = "RESERVER13";
  /**
   * 属性: 保留9
   */
  String FIELD_RESERVER9 = "RESERVER9";
  /**
   * 属性: 保留10
   */
  String FIELD_RESERVER10 = "RESERVER10";
  /**
   * 属性: 保留7
   */
  String FIELD_RESERVER7 = "RESERVER7";
  /**
   * 属性: 保留8
   */
  String FIELD_RESERVER8 = "RESERVER8";
  /**
   * 属性: 保留11
   */
  String FIELD_RESERVER11 = "RESERVER11";
  /**
   * 属性: 保留6
   */
  String FIELD_RESERVER6 = "RESERVER6";
  /**
   * 属性: 保留4
   */
  String FIELD_RESERVER4 = "RESERVER4";
  /**
   * 属性: 保留5
   */
  String FIELD_RESERVER5 = "RESERVER5";
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
            case "TeamDTO":
                return new TeamDTO();
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
                this.create((TeamDTO) args[0]);
                return null;
            case "update" :
                this.update((TeamDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((TeamDTO) args[0]);
            case "checkkey" :
                return this.checkKey((TeamDTO) args[0]);
            case "save" :
                this.save((TeamDTO) args[0]);
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
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAM/psdeactions/Create.ibizmodel.yaml
     */
    default void create(TeamDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAM/psdeactions/Update.ibizmodel.yaml
     */
    default void update(TeamDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAM/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAM/psdeactions/Get.ibizmodel.yaml
     */
    default TeamDTO get(String key) throws Throwable {
        return (TeamDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAM/psdeactions/GetDraft.ibizmodel.yaml
     */
    default TeamDTO getDraft(TeamDTO dto) throws Throwable {
        return (TeamDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAM/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(TeamDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAM/psdeactions/Save.ibizmodel.yaml
     */
    default void save(TeamDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAM/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAM/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<TeamDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<TeamDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAM/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<TeamDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<TeamDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_TEAM/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<TeamDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<TeamDTO>) obj;
    }

}

