package net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.EmployeeDTO;
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
 * 人员
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/.ibizmodel.index
 */
public interface IEmployeeService extends IDEService<EmployeeDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/ou/PSDATAENTITIES/Employee.json";

  /**
   * 属性: 用户标识
   */
  String FIELD_USERID = "USERID";
  /**
   * 属性: 用户全局名
   */
  String FIELD_USERNAME = "USERNAME";
  /**
   * 属性: 姓名
   */
  String FIELD_PERSONNAME = "PERSONNAME";
  /**
   * 属性: 用户工号
   */
  String FIELD_USERCODE = "USERCODE";
  /**
   * 属性: 登录名
   */
  String FIELD_LOGINNAME = "LOGINNAME";
  /**
   * 属性: 密码
   */
  String FIELD_PASSWORD = "PASSWORD";
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
   * 属性: 证件号码
   */
  String FIELD_CERTCODE = "CERTCODE";
  /**
   * 属性: 手机号
   */
  String FIELD_PHONE = "PHONE";
  /**
   * 属性: 出生日期
   */
  String FIELD_BIRTHDAY = "BIRTHDAY";
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
   * 属性: ip地址
   */
  String FIELD_IPADDR = "IPADDR";
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
   * 属性: 保留3
   */
  String FIELD_RESERVER3 = "RESERVER3";
  /**
   * 属性: 保留2
   */
  String FIELD_RESERVER2 = "RESERVER2";
  /**
   * 属性: 保留
   */
  String FIELD_RESERVER = "RESERVER";
  /**
   * 属性: 保留20
   */
  String FIELD_RESERVER20 = "RESERVER20";
  /**
   * 属性: 保留19
   */
  String FIELD_RESERVER19 = "RESERVER19";
  /**
   * 属性: 保留17
   */
  String FIELD_RESERVER17 = "RESERVER17";
  /**
   * 属性: 保留18
   */
  String FIELD_RESERVER18 = "RESERVER18";
  /**
   * 属性: 保留15
   */
  String FIELD_RESERVER15 = "RESERVER15";
  /**
   * 属性: 保留14
   */
  String FIELD_RESERVER14 = "RESERVER14";
  /**
   * 属性: 保留16
   */
  String FIELD_RESERVER16 = "RESERVER16";
  /**
   * 属性: 保留12
   */
  String FIELD_RESERVER12 = "RESERVER12";
  /**
   * 属性: 保留13
   */
  String FIELD_RESERVER13 = "RESERVER13";
  /**
   * 属性: 保留11
   */
  String FIELD_RESERVER11 = "RESERVER11";
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
   * 属性: 保留5
   */
  String FIELD_RESERVER5 = "RESERVER5";
  /**
   * 属性: 保留6
   */
  String FIELD_RESERVER6 = "RESERVER6";
  /**
   * 属性: 保留4
   */
  String FIELD_RESERVER4 = "RESERVER4";
  /**
   * 属性: 排序
   */
  String FIELD_SHOWORDER = "SHOWORDER";
  /**
   * 属性: 管理员
   */
  String FIELD_SUPERUSER = "SUPERUSER";
  /**
   * 属性: 逻辑有效
   */
  String FIELD_ENABLE = "ENABLE";
  /**
   * 属性: 创建时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 最后修改时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 来源开放用户标记
   */
  String FIELD_FROMOPENUSERTAG = "FROMOPENUSERTAG";
  /**
   * 属性: 钉钉用户标识
   */
  String FIELD_DDUSERID = "DDUSERID";
  /**
   * 属性: 人员状态
   */
  String FIELD_STATE = "STATE";
  /**
   * 属性: 消息类型
   */
  String FIELD_MSGTYPE = "MSGTYPE";
  /**
   * 属性: 企业微信用户标识
   */
  String FIELD_WXWORKUSERID = "WXWORKUSERID";
  /**
   * 属性: UAA用户标识
   */
  String FIELD_UAAUSERID = "UAAUSERID";
  /**
   * 属性: 微信用户标识
   */
  String FIELD_WXWORKUNIONID = "WXWORKUNIONID";
  /**
   * 属性: 钉钉用户标识
   */
  String FIELD_DDUNIONID = "DDUNIONID";
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
   * 行为: 初始化密码
   */
  String ACTION_INITPWD = "InitPwd";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 行为: 行为
   */
  String ACTION_TEST = "Test";
  /**
   * 查询: 当前用户
   */
  String DATAQUERY_CURUSER = "CurUser";
  /**
   * 查询: DEFAULT
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 忽略租户查询
   */
  String DATAQUERY_IGNORECENTER = "IgnoreCenter";
  /**
   * 查询: 系统授权用户查询
   */
  String DATAQUERY_SYSTEMAUTH = "SystemAuth";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 查询: 流程选择用户查询
   */
  String DATAQUERY_WFSELECT = "WFSelect";
  /**
   * 集合: 当前用户
   */
  String DATASET_CURUSER = "CurUser";
  /**
   * 集合: DEFAULT
   */
  String DATASET_DEFAULT = "DEFAULT";
  /**
   * 集合: 忽略租户
   */
  String DATASET_IGNORECENTER = "IgnoreCenter";
  /**
   * 集合: 系统授权用户查询
   */
  String DATASET_SYSTEMAUTH = "SystemAuth";
  /**
   * 集合: 流程选择用户查询
   */
  String DATASET_WFSELECT = "WFSelect";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "EmployeeDTO":
                return new EmployeeDTO();
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
                this.create((EmployeeDTO) args[0]);
                return null;
            case "update" :
                this.update((EmployeeDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((EmployeeDTO) args[0]);
            case "changepwd" :
                this.changePwd((EmployeeDTO) args[0]);
                return null;
            case "checkkey" :
                return this.checkKey((EmployeeDTO) args[0]);
            case "initpwd" :
                this.initPwd((EmployeeDTO) args[0]);
                return null;
            case "save" :
                this.save((List<EmployeeDTO>) args[0]);
                return null;
            case "test" :
                this.test((EmployeeDTO) args[0]);
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
            case "ignorecenter" :
               return this.fetchIgnoreCenter((ISearchContextDTO) args[0]);
            case "systemauth" :
               return this.fetchSystemAuth((ISearchContextDTO) args[0]);
            case "wfselect" :
               return this.fetchWFSelect((ISearchContextDTO) args[0]);
        }
        return this.getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
    } 

    /**
     * Create
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdeactions/Create.ibizmodel.yaml
     */
    default void create(EmployeeDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdeactions/Update.ibizmodel.yaml
     */
    default void update(EmployeeDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdeactions/Get.ibizmodel.yaml
     */
    default EmployeeDTO get(String key) throws Throwable {
        return (EmployeeDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdeactions/GetDraft.ibizmodel.yaml
     */
    default EmployeeDTO getDraft(EmployeeDTO dto) throws Throwable {
        return (EmployeeDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * 初始化密码
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdeactions/ChangePwd.ibizmodel.yaml
     */
    default void changePwd(EmployeeDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("ChangePwd", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(EmployeeDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 初始化密码
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdeactions/InitPwd.ibizmodel.yaml
     */
    default void initPwd(EmployeeDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("InitPwd", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdeactions/Save.ibizmodel.yaml
     */
    default void save(List<EmployeeDTO> dtos) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dtos}, true);
    }

    /**
     * 行为
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdeactions/Test.ibizmodel.yaml
     */
    default void test(EmployeeDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Test", null, new Object[]{dto}, true);
    }

    /**
     * 当前用户
     * 包含数据查询：当前用户
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdedatasets/CurUser.ibizmodel.yaml
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdedataqueries/CurUser.ibizmodel.ui
     */
    default Page<EmployeeDTO> fetchCurUser(ISearchContextDTO dto) throws Throwable {
        return (Page<EmployeeDTO>) this.getDataEntityRuntime().fetchDataSet("CurUser", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<EmployeeDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<EmployeeDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }

    /**
     * 忽略租户
     * 包含数据查询：忽略租户查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdedatasets/IgnoreCenter.ibizmodel.yaml
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdedataqueries/IgnoreCenter.ibizmodel.ui
     */
    default Page<EmployeeDTO> fetchIgnoreCenter(ISearchContextDTO dto) throws Throwable {
        return (Page<EmployeeDTO>) this.getDataEntityRuntime().fetchDataSet("IgnoreCenter", null, new Object[]{dto}, true);
    }

    /**
     * 系统授权用户查询
     * 包含数据查询：系统授权用户查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdedatasets/SystemAuth.ibizmodel.yaml
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdedataqueries/SystemAuth.ibizmodel.ui
     */
    default Page<EmployeeDTO> fetchSystemAuth(ISearchContextDTO dto) throws Throwable {
        return (Page<EmployeeDTO>) this.getDataEntityRuntime().fetchDataSet("SystemAuth", null, new Object[]{dto}, true);
    }

    /**
     * 流程选择用户查询
     * 用户选择编辑器使用（Get请求方式）
     * 包含数据查询：流程选择用户查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdedatasets/WFSelect.ibizmodel.yaml
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdedataqueries/WFSelect.ibizmodel.ui
     */
    default Page<EmployeeDTO> fetchWFSelect(ISearchContextDTO dto) throws Throwable {
        return (Page<EmployeeDTO>) this.getDataEntityRuntime().fetchDataSet("WFSelect", null, new Object[]{dto}, true);
    }


    /**
     * 当前用户
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdedataqueries/CurUser.ibizmodel.ui
     */
    default List<EmployeeDTO> selectCurUser(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("CurUser", dto);
        return (List<EmployeeDTO>) obj;
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<EmployeeDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<EmployeeDTO>) obj;
    }


    /**
     * 忽略租户查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdedataqueries/IgnoreCenter.ibizmodel.ui
     */
    default List<EmployeeDTO> selectIgnoreCenter(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("IgnoreCenter", dto);
        return (List<EmployeeDTO>) obj;
    }


    /**
     * 系统授权用户查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdedataqueries/SystemAuth.ibizmodel.ui
     */
    default List<EmployeeDTO> selectSystemAuth(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SystemAuth", dto);
        return (List<EmployeeDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<EmployeeDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<EmployeeDTO>) obj;
    }


    /**
     * 流程选择用户查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdedataqueries/WFSelect.ibizmodel.ui
     */
    default List<EmployeeDTO> selectWFSelect(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("WFSelect", dto);
        return (List<EmployeeDTO>) obj;
    }

}

