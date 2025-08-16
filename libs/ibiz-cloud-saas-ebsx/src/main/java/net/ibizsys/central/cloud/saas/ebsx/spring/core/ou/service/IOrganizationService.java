package net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.OrganizationDTO;
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
 * 单位机构
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/.ibizmodel.index
 */
public interface IOrganizationService extends IDEService<OrganizationDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/ou/PSDATAENTITIES/Organization.json";

  /**
   * 属性: 单位标识
   */
  String FIELD_ORGID = "ORGID";
  /**
   * 属性: 单位代码
   */
  String FIELD_ORGCODE = "ORGCODE";
  /**
   * 属性: 名称
   */
  String FIELD_ORGNAME = "ORGNAME";
  /**
   * 属性: 上级单位
   */
  String FIELD_PORGID = "PORGID";
  /**
   * 属性: 单位简称
   */
  String FIELD_SHORTNAME = "SHORTNAME";
  /**
   * 属性: 单位级别
   */
  String FIELD_ORGLEVEL = "ORGLEVEL";
  /**
   * 属性: 排序
   */
  String FIELD_SHOWORDER = "SHOWORDER";
  /**
   * 属性: 上级单位
   */
  String FIELD_PORGNAME = "PORGNAME";
  /**
   * 属性: 区属
   */
  String FIELD_DOMAINS = "DOMAINS";
  /**
   * 属性: 逻辑有效
   */
  String FIELD_ENABLE = "ENABLE";
  /**
   * 属性: 创建时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 保留4
   */
  String FIELD_RESERVER4 = "RESERVER4";
  /**
   * 属性: 保留6
   */
  String FIELD_RESERVER6 = "RESERVER6";
  /**
   * 属性: 保留5
   */
  String FIELD_RESERVER5 = "RESERVER5";
  /**
   * 属性: 保留8
   */
  String FIELD_RESERVER8 = "RESERVER8";
  /**
   * 属性: 保留7
   */
  String FIELD_RESERVER7 = "RESERVER7";
  /**
   * 属性: 保留11
   */
  String FIELD_RESERVER11 = "RESERVER11";
  /**
   * 属性: 保留13
   */
  String FIELD_RESERVER13 = "RESERVER13";
  /**
   * 属性: 保留10
   */
  String FIELD_RESERVER10 = "RESERVER10";
  /**
   * 属性: 保留9
   */
  String FIELD_RESERVER9 = "RESERVER9";
  /**
   * 属性: 保留12
   */
  String FIELD_RESERVER12 = "RESERVER12";
  /**
   * 属性: 保留16
   */
  String FIELD_RESERVER16 = "RESERVER16";
  /**
   * 属性: 保留19
   */
  String FIELD_RESERVER19 = "RESERVER19";
  /**
   * 属性: 保留15
   */
  String FIELD_RESERVER15 = "RESERVER15";
  /**
   * 属性: 保留14
   */
  String FIELD_RESERVER14 = "RESERVER14";
  /**
   * 属性: 保留17
   */
  String FIELD_RESERVER17 = "RESERVER17";
  /**
   * 属性: 保留18
   */
  String FIELD_RESERVER18 = "RESERVER18";
  /**
   * 属性: 保留20
   */
  String FIELD_RESERVER20 = "RESERVER20";
  /**
   * 属性: 保留2
   */
  String FIELD_RESERVER2 = "RESERVER2";
  /**
   * 属性: 保留
   */
  String FIELD_RESERVER = "RESERVER";
  /**
   * 属性: 保留3
   */
  String FIELD_RESERVER3 = "RESERVER3";
  /**
   * 属性: 支持Saas
   */
  String FIELD_SAASMODE = "SAASMODE";
  /**
   * 属性: 启用标志
   */
  String FIELD_ISVALID = "ISVALID";
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
   * 查询: 当前人员单位（只读）
   */
  String DATAQUERY_CURUSERORG = "CurUserOrg";
  /**
   * 查询: DEFAULT
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 根组织
   */
  String DATAQUERY_ROOTORG = "RootOrg";
  /**
   * 查询: 数据查询
   */
  String DATAQUERY_ROOTORG2 = "RootOrg2";
  /**
   * 查询: 三级树（orgLevel>2）
   */
  String DATAQUERY_THIRDTREE = "ThirdTree";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: 当前人员单位（只读）
   */
  String DATASET_CURUSERORG = "CurUserOrg";
  /**
   * 集合: DEFAULT
   */
  String DATASET_DEFAULT = "DEFAULT";
  /**
   * 集合: 根组织
   */
  String DATASET_ROOTORG = "RootOrg";
  /**
   * 集合: 租户系统专用根组织
   */
  String DATASET_ROOTORG2 = "RootOrg2";
  /**
   * 集合: 三级树（orgLevel>2）
   */
  String DATASET_THIRDTREE = "ThirdTree";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "OrganizationDTO":
                return new OrganizationDTO();
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
                this.create((OrganizationDTO) args[0]);
                return null;
            case "update" :
                this.update((OrganizationDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((OrganizationDTO) args[0]);
            case "checkkey" :
                return this.checkKey((OrganizationDTO) args[0]);
            case "save" :
                this.save((OrganizationDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "curuserorg" :
               return this.fetchCurUserOrg((ISearchContextDTO) args[0]);
            case "default" :
               return this.fetchDefault((ISearchContextDTO) args[0]);
            case "rootorg" :
               return this.fetchRootOrg((ISearchContextDTO) args[0]);
            case "rootorg2" :
               return this.fetchRootOrg2((ISearchContextDTO) args[0]);
            case "thirdtree" :
               return this.fetchThirdTree((ISearchContextDTO) args[0]);
        }
        return this.getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
    } 

    /**
     * Create
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdeactions/Create.ibizmodel.yaml
     */
    default void create(OrganizationDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdeactions/Update.ibizmodel.yaml
     */
    default void update(OrganizationDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdeactions/Get.ibizmodel.yaml
     */
    default OrganizationDTO get(String key) throws Throwable {
        return (OrganizationDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdeactions/GetDraft.ibizmodel.yaml
     */
    default OrganizationDTO getDraft(OrganizationDTO dto) throws Throwable {
        return (OrganizationDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(OrganizationDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdeactions/Save.ibizmodel.yaml
     */
    default void save(OrganizationDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 当前人员单位（只读）
     * 包含数据查询：当前人员单位（只读）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdedatasets/CurUserOrg.ibizmodel.yaml
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdedataqueries/CurUserOrg.ibizmodel.ui
     */
    default Page<OrganizationDTO> fetchCurUserOrg(ISearchContextDTO dto) throws Throwable {
        return (Page<OrganizationDTO>) this.getDataEntityRuntime().fetchDataSet("CurUserOrg", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<OrganizationDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<OrganizationDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }

    /**
     * 根组织
     * 包含数据查询：根组织
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdedatasets/RootOrg.ibizmodel.yaml
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdedataqueries/RootOrg.ibizmodel.ui
     */
    default Page<OrganizationDTO> fetchRootOrg(ISearchContextDTO dto) throws Throwable {
        return (Page<OrganizationDTO>) this.getDataEntityRuntime().fetchDataSet("RootOrg", null, new Object[]{dto}, true);
    }

    /**
     * 租户系统专用根组织
     * 租户系统专用根组织
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdedatasets/RootOrg2.ibizmodel.yaml
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdedataqueries/RootOrg2.ibizmodel.ui
     */
    default Page<OrganizationDTO> fetchRootOrg2(ISearchContextDTO dto) throws Throwable {
        return (Page<OrganizationDTO>) this.getDataEntityRuntime().fetchDataSet("RootOrg2", null, new Object[]{dto}, true);
    }

    /**
     * 三级树（orgLevel>2）
     * 包含数据查询：三级树（orgLevel>2）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdedatasets/ThirdTree.ibizmodel.yaml
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdedataqueries/ThirdTree.ibizmodel.ui
     */
    default Page<OrganizationDTO> fetchThirdTree(ISearchContextDTO dto) throws Throwable {
        return (Page<OrganizationDTO>) this.getDataEntityRuntime().fetchDataSet("ThirdTree", null, new Object[]{dto}, true);
    }


    /**
     * 当前人员单位（只读）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdedataqueries/CurUserOrg.ibizmodel.ui
     */
    default List<OrganizationDTO> selectCurUserOrg(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("CurUserOrg", dto);
        return (List<OrganizationDTO>) obj;
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<OrganizationDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<OrganizationDTO>) obj;
    }


    /**
     * 根组织
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdedataqueries/RootOrg.ibizmodel.ui
     */
    default List<OrganizationDTO> selectRootOrg(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("RootOrg", dto);
        return (List<OrganizationDTO>) obj;
    }


    /**
     * 数据查询
     * 租户系统专用根组织
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdedataqueries/RootOrg2.ibizmodel.ui
     */
    default List<OrganizationDTO> selectRootOrg2(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("RootOrg2", dto);
        return (List<OrganizationDTO>) obj;
    }


    /**
     * 三级树（orgLevel>2）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdedataqueries/ThirdTree.ibizmodel.ui
     */
    default List<OrganizationDTO> selectThirdTree(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("ThirdTree", dto);
        return (List<OrganizationDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<OrganizationDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<OrganizationDTO>) obj;
    }

}

