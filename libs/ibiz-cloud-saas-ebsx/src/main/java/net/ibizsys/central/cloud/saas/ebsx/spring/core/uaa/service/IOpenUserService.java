package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.OpenUserDTO;
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
 * 开放平台用户
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/.ibizmodel.index
 */
public interface IOpenUserService extends IDEService<OpenUserDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/uaa/PSDATAENTITIES/OpenUser.json";

  /**
   * 属性: AccessKey
   */
  String FIELD_ACCESS_KEY = "ACCESS_KEY";
  /**
   * 属性: SecretKey
   */
  String FIELD_SECRET_KEY = "SECRET_KEY";
  /**
   * 属性: 开放用户标识
   */
  String FIELD_OPENUSERID = "OPENUSERID";
  /**
   * 属性: 所属部门信息
   */
  String FIELD_DEPTS = "DEPTS";
  /**
   * 属性: 用户名称
   */
  String FIELD_OPENUSERNAME = "OPENUSERNAME";
  /**
   * 属性: 手机号
   */
  String FIELD_MOBILE = "MOBILE";
  /**
   * 属性: 绑定状态
   */
  String FIELD_ISBINDING = "ISBINDING";
  /**
   * 属性: 开放平台类型
   */
  String FIELD_OPEN_TYPE = "OPEN_TYPE";
  /**
   * 属性: 建立时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 实际用户标识
   */
  String FIELD_REALID = "REALID";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 用户代码
   */
  String FIELD_OPENUSERCODE = "OPENUSERCODE";
  /**
   * 属性: 用户标识
   */
  String FIELD_USERID = "USERID";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 系统用户标识
   */
  String FIELD_SYSUSERID = "SYSUSERID";
  /**
   * 属性: 单位标识
   */
  String FIELD_ORGID = "ORGID";
  /**
   * 属性: 开放平台应用
   */
  String FIELD_ACCESSNAME = "ACCESSNAME";
  /**
   * 属性: 开放平台应用
   */
  String FIELD_ACCESSID = "ACCESSID";
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
   * 行为: 绑定
   */
  String ACTION_BIND = "Bind";
  /**
   * 行为: 取消绑定
   */
  String ACTION_CANCELBIND = "CancelBind";
  /**
   * 行为: CheckKey
   */
  String ACTION_CHECKKEY = "CheckKey";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 行为: 同步数据
   */
  String ACTION_SYNCDATA = "SyncData";
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
            case "OpenUserDTO":
                return new OpenUserDTO();
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
                this.create((OpenUserDTO) args[0]);
                return null;
            case "update" :
                this.update((OpenUserDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((OpenUserDTO) args[0]);
            case "bind" :
                this.bind((OpenUserDTO) args[0]);
                return null;
            case "cancelbind" :
                this.cancelBind((OpenUserDTO) args[0]);
                return null;
            case "checkkey" :
                return this.checkKey((OpenUserDTO) args[0]);
            case "save" :
                this.save((OpenUserDTO) args[0]);
                return null;
            case "syncdata" :
                this.syncData((OpenUserDTO) args[0]);
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
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdeactions/Create.ibizmodel.yaml
     */
    default void create(OpenUserDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdeactions/Update.ibizmodel.yaml
     */
    default void update(OpenUserDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdeactions/Get.ibizmodel.yaml
     */
    default OpenUserDTO get(String key) throws Throwable {
        return (OpenUserDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdeactions/GetDraft.ibizmodel.yaml
     */
    default OpenUserDTO getDraft(OpenUserDTO dto) throws Throwable {
        return (OpenUserDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * 绑定
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdeactions/Bind.ibizmodel.yaml
     */
    default void bind(OpenUserDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Bind", null, new Object[]{dto}, true);
    }

    /**
     * 取消绑定
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdeactions/CancelBind.ibizmodel.yaml
     */
    default void cancelBind(OpenUserDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("CancelBind", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(OpenUserDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdeactions/Save.ibizmodel.yaml
     */
    default void save(OpenUserDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 同步数据
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdeactions/SyncData.ibizmodel.yaml
     */
    default void syncData(OpenUserDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("SyncData", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<OpenUserDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<OpenUserDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<OpenUserDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<OpenUserDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<OpenUserDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<OpenUserDTO>) obj;
    }

}

