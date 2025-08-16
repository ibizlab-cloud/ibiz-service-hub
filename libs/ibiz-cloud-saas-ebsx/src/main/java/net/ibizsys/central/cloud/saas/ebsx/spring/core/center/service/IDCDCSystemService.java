package net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto.DCDCSystemDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto.DCDCSystemSimpleDTO;
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
 * 系统
 * 
 * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/.ibizmodel.index
 */
public interface IDCDCSystemService extends IDEService<DCDCSystemDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/center/PSDATAENTITIES/DCDCSystem.json";

  /**
   * 属性: 备注
   */
  String FIELD_MEMO = "MEMO";
  /**
   * 属性: 租户系统标识
   */
  String FIELD_DCSYSTEMID = "DCSYSTEMID";
  /**
   * 属性: 系统名称
   */
  String FIELD_DCSYSTEMNAME = "DCSYSTEMNAME";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 系统权限
   */
  String FIELD_SYSPERMISSION = "SYSPERMISSION";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 建立时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 系统名称
   */
  String FIELD_SYSTEMNAME = "SYSTEMNAME";
  /**
   * 属性: 系统标识
   */
  String FIELD_SYSTEMID = "SYSTEMID";
  /**
   * 属性: 开放平台应用
   */
  String FIELD_ACCESSID = "ACCESSID";
  /**
   * 属性: 开放平台应用
   */
  String FIELD_ACCESSNAME = "ACCESSNAME";
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
   * 行为: 初始化测试项目
   */
  String ACTION_INITTESTPROJECTS = "InitTestProjects";
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
   * 行为: 运行模型测试项目
   */
  String ACTION_RUNMODELTESTPROJECT = "RunModelTestProject";
  /**
   * 行为: 运行单元测试项目
   */
  String ACTION_RUNUNITTESTPROJECT = "RunUnitTestProject";
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
            case "DCDCSystemDTO":
                return new DCDCSystemDTO();
            case "DCDCSystemSimpleDTO":
                return new DCDCSystemSimpleDTO();
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
                this.create((DCDCSystemDTO) args[0]);
                return null;
            case "update" :
                this.update((DCDCSystemDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((DCDCSystemDTO) args[0]);
            case "checkkey" :
                return this.checkKey((DCDCSystemDTO) args[0]);
            case "executetestcases" :
                this.executeTestCases((DCDCSystemDTO) args[0]);
                return null;
            case "fixmodel" :
                this.fixModel((DCDCSystemDTO) args[0]);
                return null;
            case "inittestprojects" :
                this.initTestProjects((DCDCSystemDTO) args[0]);
                return null;
            case "installbasedata" :
                this.installBaseData((DCDCSystemDTO) args[0]);
                return null;
            case "installsampledata" :
                this.installSampleData((DCDCSystemDTO) args[0]);
                return null;
            case "installtestdata" :
                this.installTestData((DCDCSystemDTO) args[0]);
                return null;
            case "publish" :
                this.publish((DCDCSystemDTO) args[0]);
                return null;
            case "runmodeltestproject" :
                this.runModelTestProject((DCDCSystemDTO) args[0]);
                return null;
            case "rununittestproject" :
                this.runUnitTestProject((DCDCSystemDTO) args[0]);
                return null;
            case "save" :
                this.save((DCDCSystemDTO) args[0]);
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
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdeactions/Create.ibizmodel.yaml
     */
    default void create(DCDCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdeactions/Update.ibizmodel.yaml
     */
    default void update(DCDCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdeactions/Get.ibizmodel.yaml
     */
    default DCDCSystemDTO get(String key) throws Throwable {
        return (DCDCSystemDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdeactions/GetDraft.ibizmodel.yaml
     */
    default DCDCSystemDTO getDraft(DCDCSystemDTO dto) throws Throwable {
        return (DCDCSystemDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(DCDCSystemDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 执行测试用例
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdeactions/ExecuteTestCases.ibizmodel.yaml
     */
    default void executeTestCases(DCDCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("ExecuteTestCases", null, new Object[]{dto}, true);
    }

    /**
     * 修复相关模型
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdeactions/FixModel.ibizmodel.yaml
     */
    default void fixModel(DCDCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("FixModel", null, new Object[]{dto}, true);
    }

    /**
     * 初始化测试项目
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdeactions/InitTestProjects.ibizmodel.yaml
     */
    default void initTestProjects(DCDCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("InitTestProjects", null, new Object[]{dto}, true);
    }

    /**
     * 安装基础数据
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdeactions/InstallBaseData.ibizmodel.yaml
     */
    default void installBaseData(DCDCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("InstallBaseData", null, new Object[]{dto}, true);
    }

    /**
     * 安装示例数据
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdeactions/InstallSampleData.ibizmodel.yaml
     */
    default void installSampleData(DCDCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("InstallSampleData", null, new Object[]{dto}, true);
    }

    /**
     * 安装测试数据
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdeactions/InstallTestData.ibizmodel.yaml
     */
    default void installTestData(DCDCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("InstallTestData", null, new Object[]{dto}, true);
    }

    /**
     * 发布配置
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdeactions/Publish.ibizmodel.yaml
     */
    default void publish(DCDCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Publish", null, new Object[]{dto}, true);
    }

    /**
     * 运行模型测试项目
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdeactions/RunModelTestProject.ibizmodel.yaml
     */
    default void runModelTestProject(DCDCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("RunModelTestProject", null, new Object[]{dto}, true);
    }

    /**
     * 运行单元测试项目
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdeactions/RunUnitTestProject.ibizmodel.yaml
     */
    default void runUnitTestProject(DCDCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("RunUnitTestProject", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdeactions/Save.ibizmodel.yaml
     */
    default void save(DCDCSystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<DCDCSystemDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<DCDCSystemDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<DCDCSystemDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<DCDCSystemDTO>) obj;
    }


    /**
     * 基础属性查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdedataqueries/SIMPLE.ibizmodel.ui
     */
    default List<DCDCSystemSimpleDTO> selectSimple(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SIMPLE", dto);
        return (List<DCDCSystemSimpleDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/center/psdataentities/DC_DC_SYSTEM/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<DCDCSystemDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<DCDCSystemDTO>) obj;
    }

}

