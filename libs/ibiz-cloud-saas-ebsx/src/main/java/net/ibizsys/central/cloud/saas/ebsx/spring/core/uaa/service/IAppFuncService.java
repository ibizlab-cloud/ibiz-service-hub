package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.AppFuncDEFGroupDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.AppFuncDTO;
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
 * 应用功能
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/.ibizmodel.index
 */
public interface IAppFuncService extends IDEService<AppFuncDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/uaa/PSDATAENTITIES/AppFunc.json";

  /**
   * 属性: 资源标识
   */
  String FIELD_PERMISSIONTAG = "PERMISSIONTAG";
  /**
   * 属性: 排序
   */
  String FIELD_SHOWORDER = "SHOWORDER";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 租户
   */
  String FIELD_SRFDCID = "SRFDCID";
  /**
   * 属性: 提示
   */
  String FIELD_TIP = "TIP";
  /**
   * 属性: 应用设置
   */
  String FIELD_SETTING = "SETTING";
  /**
   * 属性: 实例标识
   */
  String FIELD_DYNAINSTID = "DYNAINSTID";
  /**
   * 属性: 图标样式
   */
  String FIELD_ICONCSS = "ICONCSS";
  /**
   * 属性: 应用功能标识
   */
  String FIELD_PSSYSAPPFUNCID = "PSSYSAPPFUNCID";
  /**
   * 属性: 建立时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 地址
   */
  String FIELD_URL = "URL";
  /**
   * 属性: 视图路径参数
   */
  String FIELD_VIEWPATHPARAMS = "VIEWPATHPARAMS";
  /**
   * 属性: 是否定制
   */
  String FIELD_ISPERSONAL = "ISPERSONAL";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 图标
   */
  String FIELD_ICON = "ICON";
  /**
   * 属性: 系统功能名称
   */
  String FIELD_PSSYSAPPFUNCNAME = "PSSYSAPPFUNCNAME";
  /**
   * 属性: 是否默认功能
   */
  String FIELD_ISDEFAULT = "ISDEFAULT";
  /**
   * 属性: 系统应用名称
   */
  String FIELD_PSSYSTEMAPPNAME = "PSSYSTEMAPPNAME";
  /**
   * 属性: 应用类别
   */
  String FIELD_APPCATEGORY = "APPCATEGORY";
  /**
   * 属性: 是否移动端应用
   */
  String FIELD_MOBILEAPP = "MOBILEAPP";
  /**
   * 属性: 系统应用标识
   */
  String FIELD_PSSYSTEMAPPID = "PSSYSTEMAPPID";
  /**
   * 属性: 系统标识
   */
  String FIELD_SYSTEMID = "SYSTEMID";
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
   * 行为: 获取快捷操作打开地址
   */
  String ACTION_GETFUNCURL = "GetFuncUrl";
  /**
   * 行为: 移动端获取快捷操作打开地址
   */
  String ACTION_GETFUNCURLMOB = "GetFuncUrlMob";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 行为: 设置快捷操作
   */
  String ACTION_SETFUNCSETTING = "SetFuncSetting";
  /**
   * 行为: 移动端设置快捷操作
   */
  String ACTION_SETFUNCSETTINGMOB = "SetFuncSettingMob";
  /**
   * 查询: 用户所有应用
   */
  String DATAQUERY_ALLAPPFUNC = "AllAppFunc";
  /**
   * 查询: 无权限应用功能
   */
  String DATAQUERY_APPFUNC = "AppFunc";
  /**
   * 查询: 统一资源控制功能
   */
  String DATAQUERY_APPFUNC_UNIRES = "AppFunc_UniRes";
  /**
   * 查询: 无权限应用功能
   */
  String DATAQUERY_BYROLEAPPFUNC = "ByRoleAppFunc";
  /**
   * 查询: 数据查询
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 用户快捷操作
   */
  String DATAQUERY_PERSONFUNC = "PersonFunc";
  /**
   * 查询: 移动端用户快捷操作
   */
  String DATAQUERY_PERSONFUNCMOB = "PersonFuncMob";
  /**
   * 查询: 用户快捷操作配置
   */
  String DATAQUERY_PERSONFUNCSETTING = "PersonFuncSetting";
  /**
   * 查询: 移动端用户快捷操作配置
   */
  String DATAQUERY_PERSONFUNCSETTINGMOB = "PersonFuncSettingMob";
  /**
   * 查询: 超级用户应用功能
   */
  String DATAQUERY_SUPERUSERFUNC = "SuperUserFunc";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: 用户应用功能
   */
  String DATASET_CURUSERFUNC = "CurUserFunc";
  /**
   * 集合: 数据集
   */
  String DATASET_DEFAULT = "DEFAULT";
  /**
   * 集合: 单位应用功能
   */
  String DATASET_ORGAPPFUNC = "OrgAppFunc";
  /**
   * 集合: 用户快捷操作
   */
  String DATASET_PERSONFUNC = "PersonFunc";
  /**
   * 集合: 移动端用户快捷操作
   */
  String DATASET_PERSONFUNCMOB = "PersonFuncMob";
  /**
   * 集合: 用户快捷操作配置
   */
  String DATASET_PERSONFUNCSETTING = "PersonFuncSetting";
  /**
   * 集合: 移动端用户快捷操作配置
   */
  String DATASET_PERSONFUNCSETTINGMOB = "PersonFuncSettingMob";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "AppFuncDEFGroupDTO":
                return new AppFuncDEFGroupDTO();
            case "AppFuncDTO":
                return new AppFuncDTO();
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
                this.create((AppFuncDTO) args[0]);
                return null;
            case "update" :
                this.update((AppFuncDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((AppFuncDTO) args[0]);
            case "checkkey" :
                return this.checkKey((AppFuncDTO) args[0]);
            case "getfuncurl" :
                return this.getFuncUrl((String) args[0]);
            case "getfuncurlmob" :
                return this.getFuncUrlMob((String) args[0]);
            case "save" :
                this.save((AppFuncDTO) args[0]);
                return null;
            case "setfuncsetting" :
                this.setFuncSetting((AppFuncDTO) args[0]);
                return null;
            case "setfuncsettingmob" :
                this.setFuncSettingMob((AppFuncDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "curuserfunc" :
               return this.fetchCurUserFunc((ISearchContextDTO) args[0]);
            case "default" :
               return this.fetchDefault((ISearchContextDTO) args[0]);
            case "orgappfunc" :
               return this.fetchOrgAppFunc((ISearchContextDTO) args[0]);
            case "personfunc" :
               return this.fetchPersonFunc((ISearchContextDTO) args[0]);
            case "personfuncmob" :
               return this.fetchPersonFuncMob((ISearchContextDTO) args[0]);
            case "personfuncsetting" :
               return this.fetchPersonFuncSetting((ISearchContextDTO) args[0]);
            case "personfuncsettingmob" :
               return this.fetchPersonFuncSettingMob((ISearchContextDTO) args[0]);
        }
        return this.getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
    } 

    /**
     * Create
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdeactions/Create.ibizmodel.yaml
     */
    default void create(AppFuncDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdeactions/Update.ibizmodel.yaml
     */
    default void update(AppFuncDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdeactions/Get.ibizmodel.yaml
     */
    default AppFuncDTO get(String key) throws Throwable {
        return (AppFuncDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdeactions/GetDraft.ibizmodel.yaml
     */
    default AppFuncDTO getDraft(AppFuncDTO dto) throws Throwable {
        return (AppFuncDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(AppFuncDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 获取快捷操作打开地址
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdeactions/GetFuncUrl.ibizmodel.yaml
     */
    default AppFuncDTO getFuncUrl(String key) throws Throwable {
        return (AppFuncDTO) this.getDataEntityRuntime().executeAction("GetFuncUrl", null, new Object[]{key}, true);
    }

    /**
     * 移动端获取快捷操作打开地址
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdeactions/GetFuncUrlMob.ibizmodel.yaml
     */
    default AppFuncDTO getFuncUrlMob(String key) throws Throwable {
        return (AppFuncDTO) this.getDataEntityRuntime().executeAction("GetFuncUrlMob", null, new Object[]{key}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdeactions/Save.ibizmodel.yaml
     */
    default void save(AppFuncDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 设置快捷操作
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdeactions/SetFuncSetting.ibizmodel.yaml
     */
    default void setFuncSetting(AppFuncDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("SetFuncSetting", null, new Object[]{dto}, true);
    }

    /**
     * 移动端设置快捷操作
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdeactions/SetFuncSettingMob.ibizmodel.yaml
     */
    default void setFuncSettingMob(AppFuncDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("SetFuncSettingMob", null, new Object[]{dto}, true);
    }

    /**
     * 用户应用功能
     * 包含数据查询：无权限应用功能、统一资源控制功能、无权限应用功能、超级用户应用功能
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedatasets/CurUserFunc.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/AppFunc.ibizmodel.ui
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/AppFunc_UniRes.ibizmodel.ui
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/ByRoleAppFunc.ibizmodel.ui
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/SuperUserFunc.ibizmodel.ui
     */
    default Page<AppFuncDEFGroupDTO> fetchCurUserFunc(ISearchContextDTO dto) throws Throwable {
        return (Page<AppFuncDEFGroupDTO>) this.getDataEntityRuntime().fetchDataSet("CurUserFunc", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<AppFuncDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<AppFuncDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }

    /**
     * 单位应用功能
     * 包含数据查询：统一资源控制功能
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedatasets/OrgAppFunc.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/AppFunc_UniRes.ibizmodel.ui
     */
    default Page<AppFuncDEFGroupDTO> fetchOrgAppFunc(ISearchContextDTO dto) throws Throwable {
        return (Page<AppFuncDEFGroupDTO>) this.getDataEntityRuntime().fetchDataSet("OrgAppFunc", null, new Object[]{dto}, true);
    }

    /**
     * 用户快捷操作
     * 包含数据查询：用户快捷操作
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedatasets/PersonFunc.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/PersonFunc.ibizmodel.ui
     */
    default Page<AppFuncDTO> fetchPersonFunc(ISearchContextDTO dto) throws Throwable {
        return (Page<AppFuncDTO>) this.getDataEntityRuntime().fetchDataSet("PersonFunc", null, new Object[]{dto}, true);
    }

    /**
     * 移动端用户快捷操作
     * 包含数据查询：移动端用户快捷操作
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedatasets/PersonFuncMob.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/PersonFuncMob.ibizmodel.ui
     */
    default Page<AppFuncDTO> fetchPersonFuncMob(ISearchContextDTO dto) throws Throwable {
        return (Page<AppFuncDTO>) this.getDataEntityRuntime().fetchDataSet("PersonFuncMob", null, new Object[]{dto}, true);
    }

    /**
     * 用户快捷操作配置
     * 包含数据查询：用户快捷操作配置
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedatasets/PersonFuncSetting.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/PersonFuncSetting.ibizmodel.ui
     */
    default Page<AppFuncDTO> fetchPersonFuncSetting(ISearchContextDTO dto) throws Throwable {
        return (Page<AppFuncDTO>) this.getDataEntityRuntime().fetchDataSet("PersonFuncSetting", null, new Object[]{dto}, true);
    }

    /**
     * 移动端用户快捷操作配置
     * 包含数据查询：移动端用户快捷操作配置
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedatasets/PersonFuncSettingMob.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/PersonFuncSettingMob.ibizmodel.ui
     */
    default Page<AppFuncDTO> fetchPersonFuncSettingMob(ISearchContextDTO dto) throws Throwable {
        return (Page<AppFuncDTO>) this.getDataEntityRuntime().fetchDataSet("PersonFuncSettingMob", null, new Object[]{dto}, true);
    }


    /**
     * 用户所有应用
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/AllAppFunc.ibizmodel.ui
     */
    default List<AppFuncDTO> selectAllAppFunc(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("AllAppFunc", dto);
        return (List<AppFuncDTO>) obj;
    }


    /**
     * 无权限应用功能
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/AppFunc.ibizmodel.ui
     */
    default List<AppFuncDEFGroupDTO> selectAppFunc(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("AppFunc", dto);
        return (List<AppFuncDEFGroupDTO>) obj;
    }


    /**
     * 统一资源控制功能
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/AppFunc_UniRes.ibizmodel.ui
     */
    default List<AppFuncDEFGroupDTO> selectAppFunc_UniRes(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("AppFunc_UniRes", dto);
        return (List<AppFuncDEFGroupDTO>) obj;
    }


    /**
     * 无权限应用功能
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/ByRoleAppFunc.ibizmodel.ui
     */
    default List<AppFuncDEFGroupDTO> selectByRoleAppFunc(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("ByRoleAppFunc", dto);
        return (List<AppFuncDEFGroupDTO>) obj;
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<AppFuncDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<AppFuncDTO>) obj;
    }


    /**
     * 用户快捷操作
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/PersonFunc.ibizmodel.ui
     */
    default List<AppFuncDTO> selectPersonFunc(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("PersonFunc", dto);
        return (List<AppFuncDTO>) obj;
    }


    /**
     * 移动端用户快捷操作
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/PersonFuncMob.ibizmodel.ui
     */
    default List<AppFuncDTO> selectPersonFuncMob(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("PersonFuncMob", dto);
        return (List<AppFuncDTO>) obj;
    }


    /**
     * 用户快捷操作配置
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/PersonFuncSetting.ibizmodel.ui
     */
    default List<AppFuncDTO> selectPersonFuncSetting(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("PersonFuncSetting", dto);
        return (List<AppFuncDTO>) obj;
    }


    /**
     * 移动端用户快捷操作配置
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/PersonFuncSettingMob.ibizmodel.ui
     */
    default List<AppFuncDTO> selectPersonFuncSettingMob(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("PersonFuncSettingMob", dto);
        return (List<AppFuncDTO>) obj;
    }


    /**
     * 超级用户应用功能
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/SuperUserFunc.ibizmodel.ui
     */
    default List<AppFuncDEFGroupDTO> selectSuperUserFunc(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SuperUserFunc", dto);
        return (List<AppFuncDEFGroupDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<AppFuncDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<AppFuncDTO>) obj;
    }

}

