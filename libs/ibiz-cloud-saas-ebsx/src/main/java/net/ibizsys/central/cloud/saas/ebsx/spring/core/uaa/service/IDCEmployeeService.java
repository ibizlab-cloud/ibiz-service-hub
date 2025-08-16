package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.DCEmployeeDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.DCEmployeeSimpleDTO;
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
 * 机构用户
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/.ibizmodel.index
 */
public interface IDCEmployeeService extends IDEService<DCEmployeeDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/uaa/PSDATAENTITIES/DCEmployee.json";

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
   * 属性: 业务编码
   */
  String FIELD_BCODE = "BCODE";
  /**
   * 属性: 昵称别名
   */
  String FIELD_NICKNAME = "NICKNAME";
  /**
   * 属性: 证件号码
   */
  String FIELD_CERTCODE = "CERTCODE";
  /**
   * 属性: 性别
   */
  String FIELD_SEX = "SEX";
  /**
   * 属性: 出生日期
   */
  String FIELD_BIRTHDAY = "BIRTHDAY";
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
   * 属性: 排序
   */
  String FIELD_SHOWORDER = "SHOWORDER";
  /**
   * 属性: 超级管理员
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
   * 属性: 消息类型
   */
  String FIELD_MSGTYPE = "MSGTYPE";
  /**
   * 属性: 租户
   */
  String FIELD_SRFDCID = "SRFDCID";
  /**
   * 属性: 钉钉用户标识
   */
  String FIELD_DDUSERID = "DDUSERID";
  /**
   * 属性: 人员状态
   */
  String FIELD_STATE = "STATE";
  /**
   * 属性: 主部门标识
   */
  String FIELD_MDEPTID = "MDEPTID";
  /**
   * 属性: 主部门名称
   */
  String FIELD_MDEPTNAME = "MDEPTNAME";
  /**
   * 属性: 主部门代码
   */
  String FIELD_MDEPTCODE = "MDEPTCODE";
  /**
   * 属性: 钉钉用户标识
   */
  String FIELD_DDUNIONID = "DDUNIONID";
  /**
   * 属性: UAA用户标识
   */
  String FIELD_UAAUSERID = "UAAUSERID";
  /**
   * 属性: 企业微信用户标识
   */
  String FIELD_WXWORKUSERID = "WXWORKUSERID";
  /**
   * 属性: 微信用户标识
   */
  String FIELD_WXWORKUNIONID = "WXWORKUNIONID";
  /**
   * 属性: 组织代码
   */
  String FIELD_ORGCODE = "ORGCODE";
  /**
   * 属性: 名称
   */
  String FIELD_ORGNAME = "ORGNAME";
  /**
   * 属性: 单位标识
   */
  String FIELD_ORGID = "ORGID";
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
   * 查询: 基础属性查询
   */
  String DATAQUERY_SIMPLE = "SIMPLE";
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
            case "DCEmployeeDTO":
                return new DCEmployeeDTO();
            case "DCEmployeeSimpleDTO":
                return new DCEmployeeSimpleDTO();
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
                this.create((DCEmployeeDTO) args[0]);
                return null;
            case "update" :
                this.update((DCEmployeeDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((DCEmployeeDTO) args[0]);
            case "checkkey" :
                return this.checkKey((DCEmployeeDTO) args[0]);
            case "save" :
                this.save((DCEmployeeDTO) args[0]);
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
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdeactions/Create.ibizmodel.yaml
     */
    default void create(DCEmployeeDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdeactions/Update.ibizmodel.yaml
     */
    default void update(DCEmployeeDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdeactions/Get.ibizmodel.yaml
     */
    default DCEmployeeDTO get(String key) throws Throwable {
        return (DCEmployeeDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdeactions/GetDraft.ibizmodel.yaml
     */
    default DCEmployeeDTO getDraft(DCEmployeeDTO dto) throws Throwable {
        return (DCEmployeeDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(DCEmployeeDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdeactions/Save.ibizmodel.yaml
     */
    default void save(DCEmployeeDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<DCEmployeeDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<DCEmployeeDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<DCEmployeeDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<DCEmployeeDTO>) obj;
    }


    /**
     * 基础属性查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdedataqueries/SIMPLE.ibizmodel.ui
     */
    default List<DCEmployeeSimpleDTO> selectSimple(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SIMPLE", dto);
        return (List<DCEmployeeSimpleDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<DCEmployeeDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<DCEmployeeDTO>) obj;
    }

}

