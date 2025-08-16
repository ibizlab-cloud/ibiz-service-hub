package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.AuthLogDTO;
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
 * 认证日志
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/.ibizmodel.index
 */
public interface IAuthLogService extends IDEService<AuthLogDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/uaa/PSDATAENTITIES/AuthLog.json";

  /**
   * 属性: 标识
   */
  String FIELD_LOGID = "LOGID";
  /**
   * 属性: 用户全局名
   */
  String FIELD_USERNAME = "USERNAME";
  /**
   * 属性: 用户全局标识
   */
  String FIELD_USERID = "USERID";
  /**
   * 属性: 用户名称
   */
  String FIELD_PERSONNAME = "PERSONNAME";
  /**
   * 属性: 域
   */
  String FIELD_DOMAINS = "DOMAINS";
  /**
   * 属性: 认证时间
   */
  String FIELD_AUTHTIME = "AUTHTIME";
  /**
   * 属性: IP地址
   */
  String FIELD_IPADDR = "IPADDR";
  /**
   * 属性: MAC地址
   */
  String FIELD_MACADDR = "MACADDR";
  /**
   * 属性: 客户端
   */
  String FIELD_USERAGENT = "USERAGENT";
  /**
   * 属性: 认证方式
   */
  String FIELD_AUTHAGENT = "AUTHAGENT";
  /**
   * 属性: 认证结果
   */
  String FIELD_AUTHCODE = "AUTHCODE";
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
   * 查询: 当前用户
   */
  String DATAQUERY_CURUSER = "CurUser";
  /**
   * 查询: DEFAULT
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: 当前用户
   */
  String DATASET_CURUSER = "CurUser";
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
            case "AuthLogDTO":
                return new AuthLogDTO();
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
                this.create((AuthLogDTO) args[0]);
                return null;
            case "update" :
                this.update((AuthLogDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((AuthLogDTO) args[0]);
            case "checkkey" :
                return this.checkKey((AuthLogDTO) args[0]);
            case "save" :
                this.save((AuthLogDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "curuser" :
               return this.fetchCurUser((ISearchContextDTO) args[0]);
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
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdeactions/Create.ibizmodel.yaml
     */
    default void create(AuthLogDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdeactions/Update.ibizmodel.yaml
     */
    default void update(AuthLogDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdeactions/Get.ibizmodel.yaml
     */
    default AuthLogDTO get(String key) throws Throwable {
        return (AuthLogDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdeactions/GetDraft.ibizmodel.yaml
     */
    default AuthLogDTO getDraft(AuthLogDTO dto) throws Throwable {
        return (AuthLogDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(AuthLogDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdeactions/Save.ibizmodel.yaml
     */
    default void save(AuthLogDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 当前用户
     * 包含数据查询：当前用户
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdedatasets/CurUser.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdedataqueries/CurUser.ibizmodel.ui
     */
    default Page<AuthLogDTO> fetchCurUser(ISearchContextDTO dto) throws Throwable {
        return (Page<AuthLogDTO>) this.getDataEntityRuntime().fetchDataSet("CurUser", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<AuthLogDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<AuthLogDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 当前用户
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdedataqueries/CurUser.ibizmodel.ui
     */
    default List<AuthLogDTO> selectCurUser(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("CurUser", dto);
        return (List<AuthLogDTO>) obj;
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<AuthLogDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<AuthLogDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<AuthLogDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<AuthLogDTO>) obj;
    }

}

