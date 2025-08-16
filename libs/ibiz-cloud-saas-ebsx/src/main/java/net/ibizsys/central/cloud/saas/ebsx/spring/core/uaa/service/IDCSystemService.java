package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.DCSystemDTO;
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
 * 机构系统
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/.ibizmodel.index
 */
public interface IDCSystemService extends IDEService<DCSystemDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/uaa/PSDATAENTITIES/DCSystem.json";

  /**
   * 属性: 备注
   */
  String FIELD_MEMO = "MEMO";
  /**
   * 属性: 系统
   */
  String FIELD_DCSYSTEMNAME = "DCSYSTEMNAME";
  /**
   * 属性: 系统权限
   */
  String FIELD_SYSPERMISSION = "SYSPERMISSION";
  /**
   * 属性: 租户系统标识
   */
  String FIELD_DCSYSTEMID = "DCSYSTEMID";
  /**
   * 属性: 建立时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 系统名称
   */
  String FIELD_SYSTEMNAME = "SYSTEMNAME";
  /**
   * 属性: 系统标识（回调）
   */
  String FIELD_REALPSDEVSLNSYSID = "REALPSDEVSLNSYSID";
  /**
   * 属性: 租户
   */
  String FIELD_SRFDCNAME = "SRFDCNAME";
  /**
   * 属性: 系统标识
   */
  String FIELD_SYSTEMID = "SYSTEMID";
  /**
   * 属性: 租户
   */
  String FIELD_SRFDCID = "SRFDCID";
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
   * 行为: CheckKey
   */
  String ACTION_CHECKKEY = "CheckKey";
  /**
   * 行为: 执行测试用例
   */
  String ACTION_EXECUTETESTCASES = "ExecuteTestCases";
  /**
   * 行为: 修复相关模型
   */
  String ACTION_FIXMODEL = "FixModel";
  /**
   * 行为: 安装基础数据
   */
  String ACTION_INSTALLBASEDATA = "InstallBaseData";
  /**
   * 行为: 安装示例数据
   */
  String ACTION_INSTALLSAMPLEDATA = "InstallSampleData";
  /**
   * 行为: 安装测试数据
   */
  String ACTION_INSTALLTESTDATA = "InstallTestData";
  /**
   * 行为: 发布配置
   */
  String ACTION_PUBLISH = "Publish";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 查询: 数据查询
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 忽略租户
   */
  String DATAQUERY_IGNORECENTER = "IgnoreCenter";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: 数据集
   */
  String DATASET_DEFAULT = "DEFAULT";
  /**
   * 集合: 忽略租户
   */
  String DATASET_IGNORECENTER = "IgnoreCenter";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "DCSystemDTO":
                return new DCSystemDTO();
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
                this.create((DCSystemDTO) args[0]);
                return null;
            case "update" :
                this.update((DCSystemDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((DCSystemDTO) args[0]);
            case "checkkey" :
                return this.checkKey((DCSystemDTO) args[0]);
            case "executetestcases" :
                this.executeTestCases((DCSystemDTO) args[0]);
                return null;
            case "fixmodel" :
                this.fixModel((DCSystemDTO) args[0]);
                return null;
            case "installbasedata" :
                this.installBaseData((DCSystemDTO) args[0]);
                return null;
            case "installsampledata" :
                this.installSampleData((DCSystemDTO) args[0]);
                return null;
            case "installtestdata" :
                this.installTestData((DCSystemDTO) args[0]);
                return null;
            case "publish" :
                this.publish((DCSystemDTO) args[0]);
                return null;
            case "save" :
                this.save((DCSystemDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "default" :
               return this.fetchDefault((ISearchContextDTO) args[0]);
            case "ignorecenter" :
               return this.fetchIgnoreCenter((ISearchContextDTO) args[0]);
        }
        return this.getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
    } 

    /**
     * Create
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdeactions/Create.ibizmodel.yaml
     */
    default void create(DCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdeactions/Update.ibizmodel.yaml
     */
    default void update(DCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdeactions/Get.ibizmodel.yaml
     */
    default DCSystemDTO get(String key) throws Throwable {
        return (DCSystemDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdeactions/GetDraft.ibizmodel.yaml
     */
    default DCSystemDTO getDraft(DCSystemDTO dto) throws Throwable {
        return (DCSystemDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(DCSystemDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 执行测试用例
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdeactions/ExecuteTestCases.ibizmodel.yaml
     */
    default void executeTestCases(DCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("ExecuteTestCases", null, new Object[]{dto}, true);
    }

    /**
     * 修复相关模型
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdeactions/FixModel.ibizmodel.yaml
     */
    default void fixModel(DCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("FixModel", null, new Object[]{dto}, true);
    }

    /**
     * 安装基础数据
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdeactions/InstallBaseData.ibizmodel.yaml
     */
    default void installBaseData(DCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("InstallBaseData", null, new Object[]{dto}, true);
    }

    /**
     * 安装示例数据
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdeactions/InstallSampleData.ibizmodel.yaml
     */
    default void installSampleData(DCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("InstallSampleData", null, new Object[]{dto}, true);
    }

    /**
     * 安装测试数据
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdeactions/InstallTestData.ibizmodel.yaml
     */
    default void installTestData(DCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("InstallTestData", null, new Object[]{dto}, true);
    }

    /**
     * 发布配置
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdeactions/Publish.ibizmodel.yaml
     */
    default void publish(DCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Publish", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdeactions/Save.ibizmodel.yaml
     */
    default void save(DCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<DCSystemDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<DCSystemDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }

    /**
     * 忽略租户
     * 包含数据查询：忽略租户
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdedatasets/IgnoreCenter.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdedataqueries/IgnoreCenter.ibizmodel.ui
     */
    default Page<DCSystemDTO> fetchIgnoreCenter(ISearchContextDTO dto) throws Throwable {
        return (Page<DCSystemDTO>) this.getDataEntityRuntime().fetchDataSet("IgnoreCenter", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<DCSystemDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<DCSystemDTO>) obj;
    }


    /**
     * 忽略租户
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdedataqueries/IgnoreCenter.ibizmodel.ui
     */
    default List<DCSystemDTO> selectIgnoreCenter(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("IgnoreCenter", dto);
        return (List<DCSystemDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<DCSystemDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<DCSystemDTO>) obj;
    }

}

