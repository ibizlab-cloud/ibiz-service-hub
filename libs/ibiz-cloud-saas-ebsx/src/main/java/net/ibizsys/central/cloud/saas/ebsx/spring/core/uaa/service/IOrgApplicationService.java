package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.OrgApplicationDTO;
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
 * 组织系统应用
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/.ibizmodel.index
 */
public interface IOrgApplicationService extends IDEService<OrgApplicationDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/uaa/PSDATAENTITIES/OrgApplication.json";

  /**
   * 属性: AccessKey(AppId)
   */
  String FIELD_ACCESS_KEY = "ACCESS_KEY";
  /**
   * 属性: SecretKey(AppSecret)
   */
  String FIELD_SECRET_KEY = "SECRET_KEY";
  /**
   * 属性: RegionId
   */
  String FIELD_REGION_ID = "REGION_ID";
  /**
   * 属性: 管理账号token
   */
  String FIELD_ACCESS_TOKEN = "ACCESS_TOKEN";
  /**
   * 属性: 管理账号token过期时间
   */
  String FIELD_EXPIRES_TIME = "EXPIRES_TIME";
  /**
   * 属性: 组织系统应用标识
   */
  String FIELD_ORGSYSTEMAPPID = "ORGSYSTEMAPPID";
  /**
   * 属性: 组织系统名称
   */
  String FIELD_ORGSYSTEMAPPNAME = "ORGSYSTEMAPPNAME";
  /**
   * 属性: 租户
   */
  String FIELD_SRFDCID = "SRFDCID";
  /**
   * 属性: 系统标识
   */
  String FIELD_SYSTEMID = "SYSTEMID";
  /**
   * 属性: 租户系统标识
   */
  String FIELD_DCSYSTEMID = "DCSYSTEMID";
  /**
   * 属性: 组织标识
   */
  String FIELD_ORGID = "ORGID";
  /**
   * 属性: 组织系统标识
   */
  String FIELD_ORGSYSTEMID = "ORGSYSTEMID";
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
            case "OrgApplicationDTO":
                return new OrgApplicationDTO();
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
                this.create((OrgApplicationDTO) args[0]);
                return null;
            case "update" :
                this.update((OrgApplicationDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((OrgApplicationDTO) args[0]);
            case "checkkey" :
                return this.checkKey((OrgApplicationDTO) args[0]);
            case "save" :
                this.save((OrgApplicationDTO) args[0]);
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
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdeactions/Create.ibizmodel.yaml
     */
    default void create(OrgApplicationDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdeactions/Update.ibizmodel.yaml
     */
    default void update(OrgApplicationDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdeactions/Get.ibizmodel.yaml
     */
    default OrgApplicationDTO get(String key) throws Throwable {
        return (OrgApplicationDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdeactions/GetDraft.ibizmodel.yaml
     */
    default OrgApplicationDTO getDraft(OrgApplicationDTO dto) throws Throwable {
        return (OrgApplicationDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(OrgApplicationDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdeactions/Save.ibizmodel.yaml
     */
    default void save(OrgApplicationDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<OrgApplicationDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<OrgApplicationDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<OrgApplicationDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<OrgApplicationDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<OrgApplicationDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<OrgApplicationDTO>) obj;
    }

}

