package net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.UAOrganizationDTO;
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
 * 单位机构_界面辅助
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/.ibizmodel.index
 */
public interface IUAOrganizationService extends IDEService<UAOrganizationDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/ou/PSDATAENTITIES/UAOrganization.json";

  /**
   * 属性: 单位标识
   */
  String FIELD_ORGID = "ORGID";
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
   * 属性: 排序
   */
  String FIELD_SHOWORDER = "SHOWORDER";
  /**
   * 属性: 逻辑有效
   */
  String FIELD_ENABLE = "ENABLE";
  /**
   * 属性: 租户
   */
  String FIELD_SRFDCID = "SRFDCID";
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
            case "UAOrganizationDTO":
                return new UAOrganizationDTO();
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
                this.create((UAOrganizationDTO) args[0]);
                return null;
            case "update" :
                this.update((UAOrganizationDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((UAOrganizationDTO) args[0]);
            case "checkkey" :
                return this.checkKey((UAOrganizationDTO) args[0]);
            case "save" :
                this.save((UAOrganizationDTO) args[0]);
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
     * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/psdeactions/Create.ibizmodel.yaml
     */
    default void create(UAOrganizationDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/psdeactions/Update.ibizmodel.yaml
     */
    default void update(UAOrganizationDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/psdeactions/Get.ibizmodel.yaml
     */
    default UAOrganizationDTO get(String key) throws Throwable {
        return (UAOrganizationDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/psdeactions/GetDraft.ibizmodel.yaml
     */
    default UAOrganizationDTO getDraft(UAOrganizationDTO dto) throws Throwable {
        return (UAOrganizationDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(UAOrganizationDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/psdeactions/Save.ibizmodel.yaml
     */
    default void save(UAOrganizationDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<UAOrganizationDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<UAOrganizationDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<UAOrganizationDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<UAOrganizationDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<UAOrganizationDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<UAOrganizationDTO>) obj;
    }

}

