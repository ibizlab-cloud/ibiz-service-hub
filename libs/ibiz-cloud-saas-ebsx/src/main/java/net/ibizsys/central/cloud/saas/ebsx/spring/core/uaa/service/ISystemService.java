package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.SystemDTO;
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
 * 部署系统
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/.ibizmodel.index
 */
public interface ISystemService extends IDEService<SystemDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/uaa/PSDATAENTITIES/System.json";

  /**
   * 属性: 系统标识
   */
  String FIELD_PSSYSTEMID = "PSSYSTEMID";
  /**
   * 属性: 系统名称
   */
  String FIELD_PSSYSTEMNAME = "PSSYSTEMNAME";
  /**
   * 属性: 结构
   */
  String FIELD_SYSSTRUCTURE = "SYSSTRUCTURE";
  /**
   * 属性: 应用
   */
  String FIELD_APPS = "APPS";
  /**
   * 属性: 校验
   */
  String FIELD_MD5CHECK = "MD5CHECK";
  /**
   * 属性: 排序
   */
  String FIELD_SHOWORDER = "SHOWORDER";
  /**
   * 属性: 系统模型（远程路径）
   */
  String FIELD_REMOTESYSMODELPATH = "REMOTESYSMODELPATH";
  /**
   * 属性: 系统模型（远程仓库）
   */
  String FIELD_REMOTESYSMODEL = "REMOTESYSMODEL";
  /**
   * 属性: 仓库分支
   */
  String FIELD_REMOTESYSMODELBRANCH = "REMOTESYSMODELBRANCH";
  /**
   * 属性: 回调系统标识
   */
  String FIELD_REALPSDEVSLNSYSID = "REALPSDEVSLNSYSID";
  /**
   * 属性: 系统模型
   */
  String FIELD_SYSMODEL = "SYSMODEL";
  /**
   * 属性: 远程密码
   */
  String FIELD_REMOTESYSMODELPWD = "REMOTESYSMODELPWD";
  /**
   * 属性: 远程账户
   */
  String FIELD_REMOTESYSMODELUSER = "REMOTESYSMODELUSER";
  /**
   * 属性: IP地址
   */
  String FIELD_IPADRESS = "IPADRESS";
  /**
   * 属性: 任务端口
   */
  String FIELD_JOBPORT = "JOBPORT";
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
   * 行为: 清理远程模型
   */
  String ACTION_CLEANREMOTEMODEL = "CleanRemoteModel";
  /**
   * 行为: PrepareApps
   */
  String ACTION_PREPAREAPPS = "PrepareApps";
  /**
   * 行为: PrepareApps
   */
  String ACTION_PUBLISH = "Publish";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 行为: SyncPermission
   */
  String ACTION_SYNCPERMISSION = "SyncPermission";
  /**
   * 行为: 获取远程模型
   */
  String ACTION_UPDATEREMOTEMODEL = "UpdateRemoteModel";
  /**
   * 查询: DEFAULT
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: Pick
   */
  String DATAQUERY_PICK = "Pick";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: DEFAULT
   */
  String DATASET_DEFAULT = "DEFAULT";
  /**
   * 集合: Pick
   */
  String DATASET_PICK = "Pick";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "SystemDTO":
                return new SystemDTO();
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
                this.create((SystemDTO) args[0]);
                return null;
            case "update" :
                this.update((SystemDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((SystemDTO) args[0]);
            case "checkkey" :
                return this.checkKey((SystemDTO) args[0]);
            case "cleanremotemodel" :
                this.cleanRemoteModel((SystemDTO) args[0]);
                return null;
            case "prepareapps" :
                this.prepareApps((SystemDTO) args[0]);
                return null;
            case "publish" :
                this.publish((SystemDTO) args[0]);
                return null;
            case "save" :
                this.save((SystemDTO) args[0]);
                return null;
            case "syncpermission" :
                this.syncPermission((SystemDTO) args[0]);
                return null;
            case "updateremotemodel" :
                this.updateRemoteModel((SystemDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "default" :
               return this.fetchDefault((ISearchContextDTO) args[0]);
            case "pick" :
               return this.fetchPick((ISearchContextDTO) args[0]);
        }
        return this.getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
    } 

    /**
     * Create
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdeactions/Create.ibizmodel.yaml
     */
    default void create(SystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdeactions/Update.ibizmodel.yaml
     */
    default void update(SystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdeactions/Get.ibizmodel.yaml
     */
    default SystemDTO get(String key) throws Throwable {
        return (SystemDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdeactions/GetDraft.ibizmodel.yaml
     */
    default SystemDTO getDraft(SystemDTO dto) throws Throwable {
        return (SystemDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(SystemDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 清理远程模型
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdeactions/CleanRemoteModel.ibizmodel.yaml
     */
    default void cleanRemoteModel(SystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("CleanRemoteModel", null, new Object[]{dto}, true);
    }

    /**
     * PrepareApps
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdeactions/PrepareApps.ibizmodel.yaml
     */
    default void prepareApps(SystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("PrepareApps", null, new Object[]{dto}, true);
    }

    /**
     * PrepareApps
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdeactions/Publish.ibizmodel.yaml
     */
    default void publish(SystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Publish", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdeactions/Save.ibizmodel.yaml
     */
    default void save(SystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * SyncPermission
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdeactions/SyncPermission.ibizmodel.yaml
     */
    default void syncPermission(SystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("SyncPermission", null, new Object[]{dto}, true);
    }

    /**
     * 获取远程模型
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdeactions/UpdateRemoteModel.ibizmodel.yaml
     */
    default void updateRemoteModel(SystemDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("UpdateRemoteModel", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<SystemDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<SystemDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }

    /**
     * Pick
     * 包含数据查询：Pick
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdedatasets/Pick.ibizmodel.yaml
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdedataqueries/Pick.ibizmodel.ui
     */
    default Page<SystemDTO> fetchPick(ISearchContextDTO dto) throws Throwable {
        return (Page<SystemDTO>) this.getDataEntityRuntime().fetchDataSet("Pick", null, new Object[]{dto}, true);
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<SystemDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<SystemDTO>) obj;
    }


    /**
     * Pick
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdedataqueries/Pick.ibizmodel.ui
     */
    default List<SystemDTO> selectPick(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("Pick", dto);
        return (List<SystemDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSTEM/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<SystemDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<SystemDTO>) obj;
    }

}

