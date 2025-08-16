package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.ApplicationDTO;
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
 * 部署应用
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/.ibizmodel.index
 */
public interface IApplicationService extends IDEService<ApplicationDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/uaa/PSDATAENTITIES/Application.json";

  /**
   * 属性: 排序
   */
  String FIELD_SHOWORDER = "SHOWORDER";
  /**
   * 属性: 是否定制
   */
  String FIELD_ISPERSONAL = "ISPERSONAL";
  /**
   * 属性: 是否移动应用
   */
  String FIELD_MOBILEAPP = "MOBILEAPP";
  /**
   * 属性: 应用类别
   */
  String FIELD_APPCATEGORY = "APPCATEGORY";
  /**
   * 属性: 建立时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 视图路径格式
   */
  String FIELD_VIEWPATHFORMAT = "VIEWPATHFORMAT";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 应用设置
   */
  String FIELD_SETTING = "SETTING";
  /**
   * 属性: 提示
   */
  String FIELD_TIP = "TIP";
  /**
   * 属性: 图标
   */
  String FIELD_ICON = "ICON";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 系统应用标识
   */
  String FIELD_PSSYSTEMAPPID = "PSSYSTEMAPPID";
  /**
   * 属性: 地址
   */
  String FIELD_URL = "URL";
  /**
   * 属性: 服务名
   */
  String FIELD_SERVICEID = "SERVICEID";
  /**
   * 属性: 首页名称
   */
  String FIELD_INDEXCODENAME = "INDEXCODENAME";
  /**
   * 属性: 系统应用名称
   */
  String FIELD_PSSYSTEMAPPNAME = "PSSYSTEMAPPNAME";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 应用代码名称
   */
  String FIELD_CODENAME = "CODENAME";
  /**
   * 属性: 图标样式
   */
  String FIELD_ICONCSS = "ICONCSS";
  /**
   * 属性: 系统标识
   */
  String FIELD_SYSTEMID = "SYSTEMID";
  /**
   * 属性: 应用部署工作流
   */
  String FIELD_APPWFS = "APPWFS";
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
   * 行为: 获取应用打开地址
   */
  String ACTION_GETAPPURL = "GetAppUrl";
  /**
   * 行为: 移动端获取应用打开地址
   */
  String ACTION_GETAPPURLMOB = "GetAppUrlMob";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 行为: 设置常用应用
   */
  String ACTION_SETAPPSETTING = "SetAppSetting";
  /**
   * 行为: 移动端设置常用应用
   */
  String ACTION_SETAPPSETTINGMOB = "SetAppSettingMob";
  /**
   * 查询: 全部应用
   */
  String DATAQUERY_ALLAPP = "AllApp";
  /**
   * 查询: 全部应用
   */
  String DATAQUERY_ALL = "All";
  /**
   * 查询: 授权应用
   */
  String DATAQUERY_BYROLE = "ByRole";
  /**
   * 查询: 数据查询
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 获取用户角色
   */
  String DATAQUERY_GETROLE = "GetRole";
  /**
   * 查询: 人员常用应用
   */
  String DATAQUERY_PERSONAPP = "PersonApp";
  /**
   * 查询: 移动端常用应用
   */
  String DATAQUERY_PERSONAPPMOB = "PersonAppMob";
  /**
   * 查询: 人员常用应用配置
   */
  String DATAQUERY_PERSONAPPSETTING = "PersonAppSetting";
  /**
   * 查询: 移动端常用应用配置
   */
  String DATAQUERY_PERSONAPPSETTINGMOB = "PersonAppSettingMob";
  /**
   * 查询: 全部应用
   */
  String DATAQUERY_SUPERUSERAPP = "SuperUserApp";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: 数据集
   */
  String DATASET_DEFAULT = "DEFAULT";
  /**
   * 集合: 单位应用
   */
  String DATASET_ORGAPP = "OrgApp";
  /**
   * 集合: 人员常用应用
   */
  String DATASET_PERSONAPP = "PersonApp";
  /**
   * 集合: 移动端常用应用
   */
  String DATASET_PERSONAPPMOB = "PersonAppMob";
  /**
   * 集合: 人员常用应用配置
   */
  String DATASET_PERSONAPPSETTING = "PersonAppSetting";
  /**
   * 集合: 移动端常用应用配置
   */
  String DATASET_PERSONAPPSETTINGMOB = "PersonAppSettingMob";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "ApplicationDTO":
                return new ApplicationDTO();
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
                this.create((ApplicationDTO) args[0]);
                return null;
            case "update" :
                this.update((ApplicationDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((ApplicationDTO) args[0]);
            case "checkkey" :
                return this.checkKey((ApplicationDTO) args[0]);
            case "getappurl" :
                return this.getAppUrl((String) args[0]);
            case "getappurlmob" :
                return this.getAppUrlMob((String) args[0]);
            case "save" :
                this.save((ApplicationDTO) args[0]);
                return null;
            case "setappsetting" :
                this.setAppSetting((ApplicationDTO) args[0]);
                return null;
            case "setappsettingmob" :
                this.setAppSettingMob((ApplicationDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "default" :
               return this.fetchDefault((ISearchContextDTO) args[0]);
            case "orgapp" :
               return this.fetchOrgApp((ISearchContextDTO) args[0]);
            case "personapp" :
               return this.fetchPersonApp((ISearchContextDTO) args[0]);
            case "personappmob" :
               return this.fetchPersonAppMob((ISearchContextDTO) args[0]);
            case "personappsetting" :
               return this.fetchPersonAppSetting((ISearchContextDTO) args[0]);
            case "personappsettingmob" :
               return this.fetchPersonAppSettingMob((ISearchContextDTO) args[0]);
        }
        return this.getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
    } 

    /**
     * Create
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdeactions/Create.ibizmodel.yaml
     */
    default void create(ApplicationDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdeactions/Update.ibizmodel.yaml
     */
    default void update(ApplicationDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdeactions/Get.ibizmodel.yaml
     */
    default ApplicationDTO get(String key) throws Throwable {
        return (ApplicationDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdeactions/GetDraft.ibizmodel.yaml
     */
    default ApplicationDTO getDraft(ApplicationDTO dto) throws Throwable {
        return (ApplicationDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(ApplicationDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 获取应用打开地址
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdeactions/GetAppUrl.ibizmodel.yaml
     */
    default ApplicationDTO getAppUrl(String key) throws Throwable {
        return (ApplicationDTO) this.getDataEntityRuntime().executeAction("GetAppUrl", null, new Object[]{key}, true);
    }

    /**
     * 移动端获取应用打开地址
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdeactions/GetAppUrlMob.ibizmodel.yaml
     */
    default ApplicationDTO getAppUrlMob(String key) throws Throwable {
        return (ApplicationDTO) this.getDataEntityRuntime().executeAction("GetAppUrlMob", null, new Object[]{key}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdeactions/Save.ibizmodel.yaml
     */
    default void save(ApplicationDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 设置常用应用
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdeactions/SetAppSetting.ibizmodel.yaml
     */
    default void setAppSetting(ApplicationDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("SetAppSetting", null, new Object[]{dto}, true);
    }

    /**
     * 移动端设置常用应用
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdeactions/SetAppSettingMob.ibizmodel.yaml
     */
    default void setAppSettingMob(ApplicationDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("SetAppSettingMob", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<ApplicationDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<ApplicationDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }

    /**
     * 单位应用
     * 包含数据查询：全部应用、授权应用、全部应用
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedatasets/OrgApp.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/All.ibizmodel.ui
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/ByRole.ibizmodel.ui
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/SuperUserApp.ibizmodel.ui
     */
    default Page<ApplicationDTO> fetchOrgApp(ISearchContextDTO dto) throws Throwable {
        return (Page<ApplicationDTO>) this.getDataEntityRuntime().fetchDataSet("OrgApp", null, new Object[]{dto}, true);
    }

    /**
     * 人员常用应用
     * 包含数据查询：人员常用应用
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedatasets/PersonApp.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/PersonApp.ibizmodel.ui
     */
    default Page<ApplicationDTO> fetchPersonApp(ISearchContextDTO dto) throws Throwable {
        return (Page<ApplicationDTO>) this.getDataEntityRuntime().fetchDataSet("PersonApp", null, new Object[]{dto}, true);
    }

    /**
     * 移动端常用应用
     * 包含数据查询：移动端常用应用
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedatasets/PersonAppMob.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/PersonAppMob.ibizmodel.ui
     */
    default Page<ApplicationDTO> fetchPersonAppMob(ISearchContextDTO dto) throws Throwable {
        return (Page<ApplicationDTO>) this.getDataEntityRuntime().fetchDataSet("PersonAppMob", null, new Object[]{dto}, true);
    }

    /**
     * 人员常用应用配置
     * 包含数据查询：人员常用应用配置
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedatasets/PersonAppSetting.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/PersonAppSetting.ibizmodel.ui
     */
    default Page<ApplicationDTO> fetchPersonAppSetting(ISearchContextDTO dto) throws Throwable {
        return (Page<ApplicationDTO>) this.getDataEntityRuntime().fetchDataSet("PersonAppSetting", null, new Object[]{dto}, true);
    }

    /**
     * 移动端常用应用配置
     * 包含数据查询：移动端常用应用配置
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedatasets/PersonAppSettingMob.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/PersonAppSettingMob.ibizmodel.ui
     */
    default Page<ApplicationDTO> fetchPersonAppSettingMob(ISearchContextDTO dto) throws Throwable {
        return (Page<ApplicationDTO>) this.getDataEntityRuntime().fetchDataSet("PersonAppSettingMob", null, new Object[]{dto}, true);
    }


    /**
     * 全部应用
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/AllApp.ibizmodel.ui
     */
    default List<ApplicationDTO> selectAllApp(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("AllApp", dto);
        return (List<ApplicationDTO>) obj;
    }


    /**
     * 全部应用
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/All.ibizmodel.ui
     */
    default List<ApplicationDTO> selectAllApps(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("All", dto);
        return (List<ApplicationDTO>) obj;
    }


    /**
     * 授权应用
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/ByRole.ibizmodel.ui
     */
    default List<ApplicationDTO> selectByRole(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("ByRole", dto);
        return (List<ApplicationDTO>) obj;
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<ApplicationDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<ApplicationDTO>) obj;
    }


    /**
     * 获取用户角色
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/GetRole.ibizmodel.ui
     */
    default List<ApplicationDTO> selectGetRole(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("GetRole", dto);
        return (List<ApplicationDTO>) obj;
    }


    /**
     * 人员常用应用
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/PersonApp.ibizmodel.ui
     */
    default List<ApplicationDTO> selectPersonApp(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("PersonApp", dto);
        return (List<ApplicationDTO>) obj;
    }


    /**
     * 移动端常用应用
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/PersonAppMob.ibizmodel.ui
     */
    default List<ApplicationDTO> selectPersonAppMob(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("PersonAppMob", dto);
        return (List<ApplicationDTO>) obj;
    }


    /**
     * 人员常用应用配置
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/PersonAppSetting.ibizmodel.ui
     */
    default List<ApplicationDTO> selectPersonAppSetting(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("PersonAppSetting", dto);
        return (List<ApplicationDTO>) obj;
    }


    /**
     * 移动端常用应用配置
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/PersonAppSettingMob.ibizmodel.ui
     */
    default List<ApplicationDTO> selectPersonAppSettingMob(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("PersonAppSettingMob", dto);
        return (List<ApplicationDTO>) obj;
    }


    /**
     * 全部应用
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/SuperUserApp.ibizmodel.ui
     */
    default List<ApplicationDTO> selectSuperUserApp(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SuperUserApp", dto);
        return (List<ApplicationDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEMAPP/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<ApplicationDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<ApplicationDTO>) obj;
    }

}

