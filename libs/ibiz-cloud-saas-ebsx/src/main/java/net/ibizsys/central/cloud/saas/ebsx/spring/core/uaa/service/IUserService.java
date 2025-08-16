package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.UserDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.UserSimpleDTO;
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
 * 系统用户
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/.ibizmodel.index
 */
public interface IUserService extends IDEService<UserDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/uaa/PSDATAENTITIES/User.json";

  /**
   * 属性: 用户标识
   */
  String FIELD_USERID = "USERID";
  /**
   * 属性: 用户全局名
   */
  String FIELD_USERNAME = "USERNAME";
  /**
   * 属性: 用户姓名
   */
  String FIELD_PERSONNAME = "PERSONNAME";
  /**
   * 属性: 用户工号
   */
  String FIELD_USERCODE = "USERCODE";
  /**
   * 属性: 密码
   */
  String FIELD_PASSWORD = "PASSWORD";
  /**
   * 属性: 登录名
   */
  String FIELD_LOGINNAME = "LOGINNAME";
  /**
   * 属性: 区属
   */
  String FIELD_DOMAINS = "DOMAINS";
  /**
   * 属性: 主部门
   */
  String FIELD_MDEPTID = "MDEPTID";
  /**
   * 属性: 主部门代码
   */
  String FIELD_MDEPTCODE = "MDEPTCODE";
  /**
   * 属性: 主部门名称
   */
  String FIELD_MDEPTNAME = "MDEPTNAME";
  /**
   * 属性: 业务编码
   */
  String FIELD_BCODE = "BCODE";
  /**
   * 属性: 岗位标识
   */
  String FIELD_POSTID = "POSTID";
  /**
   * 属性: 岗位代码
   */
  String FIELD_POSTCODE = "POSTCODE";
  /**
   * 属性: 岗位名称
   */
  String FIELD_POSTNAME = "POSTNAME";
  /**
   * 属性: 单位
   */
  String FIELD_ORGID = "ORGID";
  /**
   * 属性: 单位代码
   */
  String FIELD_ORGCODE = "ORGCODE";
  /**
   * 属性: 单位名称
   */
  String FIELD_ORGNAME = "ORGNAME";
  /**
   * 属性: 昵称别名
   */
  String FIELD_NICKNAME = "NICKNAME";
  /**
   * 属性: 性别
   */
  String FIELD_SEX = "SEX";
  /**
   * 属性: 出生日期
   */
  String FIELD_BIRTHDAY = "BIRTHDAY";
  /**
   * 属性: 证件号码
   */
  String FIELD_CERTCODE = "CERTCODE";
  /**
   * 属性: 联系方式
   */
  String FIELD_PHONE = "PHONE";
  /**
   * 属性: 邮件
   */
  String FIELD_EMAIL = "EMAIL";
  /**
   * 属性: 社交账号
   */
  String FIELD_AVATAR = "AVATAR";
  /**
   * 属性: 地址
   */
  String FIELD_ADDR = "ADDR";
  /**
   * 属性: 照片
   */
  String FIELD_USERICON = "USERICON";
  /**
   * 属性: 样式
   */
  String FIELD_THEME = "THEME";
  /**
   * 属性: 语言
   */
  String FIELD_LANG = "LANG";
  /**
   * 属性: 字号
   */
  String FIELD_FONTSIZE = "FONTSIZE";
  /**
   * 属性: 备注
   */
  String FIELD_MEMO = "MEMO";
  /**
   * 属性: 保留
   */
  String FIELD_RESERVER = "RESERVER";
  /**
   * 属性: 超级管理员
   */
  String FIELD_SUPERUSER = "SUPERUSER";
  /**
   * 属性: 接口授权
   */
  String FIELD_APIUSER = "APIUSER";
  /**
   * 属性: 人员状态
   */
  String FIELD_STATE = "STATE";
  /**
   * 属性: 密码修改时间
   */
  String FIELD_PWDCHGTIME = "PWDCHGTIME";
  /**
   * 属性: 钉钉用户标识
   */
  String FIELD_DDUSERID = "DDUSERID";
  /**
   * 属性: 企业微信用户标识
   */
  String FIELD_WXWORKID = "WXWORKID";
  /**
   * 属性: 微信用户标识
   */
  String FIELD_WXUSERID = "WXUSERID";
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
   * 行为: 初始化密码
   */
  String ACTION_CHANGEPWD = "ChangePwd";
  /**
   * 行为: CheckKey
   */
  String ACTION_CHECKKEY = "CheckKey";
  /**
   * 行为: 删除用户信息
   */
  String ACTION_DELETESYSUSER = "deleteSysUser";
  /**
   * 行为: getIgnoreCenter
   */
  String ACTION_GETIGNORECENTER = "getIgnoreCenter";
  /**
   * 行为: 初始化密码
   */
  String ACTION_INITPWD = "InitPwd";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 行为: 保存用户信息
   */
  String ACTION_SAVESYSUSER = "saveSysUser";
  /**
   * 查询: DEFAULT
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 基础属性查询
   */
  String DATAQUERY_SIMPLE = "SIMPLE";
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
            case "UserDTO":
                return new UserDTO();
            case "UserSimpleDTO":
                return new UserSimpleDTO();
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
                this.create((UserDTO) args[0]);
                return null;
            case "update" :
                this.update((UserDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((UserDTO) args[0]);
            case "changepwd" :
                this.changePwd((UserDTO) args[0]);
                return null;
            case "checkkey" :
                return this.checkKey((UserDTO) args[0]);
            case "deletesysuser" :
                this.deleteSysUser((UserDTO) args[0]);
                return null;
            case "getignorecenter" :
                return this.getIgnoreCenter((String) args[0]);
            case "initpwd" :
                this.initPwd((UserDTO) args[0]);
                return null;
            case "save" :
                this.save((UserDTO) args[0]);
                return null;
            case "savesysuser" :
                this.saveSysUser((UserDTO) args[0]);
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
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdeactions/Create.ibizmodel.yaml
     */
    default void create(UserDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdeactions/Update.ibizmodel.yaml
     */
    default void update(UserDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdeactions/Get.ibizmodel.yaml
     */
    default UserDTO get(String key) throws Throwable {
        return (UserDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdeactions/GetDraft.ibizmodel.yaml
     */
    default UserDTO getDraft(UserDTO dto) throws Throwable {
        return (UserDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * 初始化密码
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdeactions/ChangePwd.ibizmodel.yaml
     */
    default void changePwd(UserDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("ChangePwd", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(UserDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 删除用户信息
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdelogics/deleteSysUser.ibizmodel.index
     */
    default void deleteSysUser(UserDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("deleteSysUser", null, new Object[]{dto}, true);
    }

    /**
     * getIgnoreCenter
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdeactions/getIgnoreCenter.ibizmodel.yaml
     */
    default UserDTO getIgnoreCenter(String key) throws Throwable {
        return (UserDTO) this.getDataEntityRuntime().executeAction("getIgnoreCenter", null, new Object[]{key}, true);
    }

    /**
     * 初始化密码
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdeactions/InitPwd.ibizmodel.yaml
     */
    default void initPwd(UserDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("InitPwd", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdeactions/Save.ibizmodel.yaml
     */
    default void save(UserDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 保存用户信息
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdelogics/saveSysUser.ibizmodel.index
     */
    default void saveSysUser(UserDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("saveSysUser", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<UserDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<UserDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<UserDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<UserDTO>) obj;
    }


    /**
     * 基础属性查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdedataqueries/SIMPLE.ibizmodel.ui
     */
    default List<UserSimpleDTO> selectSimple(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SIMPLE", dto);
        return (List<UserSimpleDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<UserDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<UserDTO>) obj;
    }

}

