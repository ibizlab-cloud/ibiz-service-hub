package net.ibizsys.central.cloud.saas.ebsx.spring.core.disk.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.disk.dto.SDFileDTO;
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
 * 文件
 * 
 * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/.ibizmodel.index
 */
public interface ISDFileService extends IDEService<SDFileDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/disk/PSDATAENTITIES/SDFile.json";

  /**
   * 属性: 标识
   */
  String FIELD_FILEID = "FILEID";
  /**
   * 属性: 名称
   */
  String FIELD_FILENAME = "FILENAME";
  /**
   * 属性: 路径
   */
  String FIELD_FILEPATH = "FILEPATH";
  /**
   * 属性: 特定目录
   */
  String FIELD_FOLDER = "FOLDER";
  /**
   * 属性: 文件大小
   */
  String FIELD_FILESIZE = "FILESIZE";
  /**
   * 属性: 扩展名
   */
  String FIELD_FILEEXT = "FILEEXT";
  /**
   * 属性: 所属类型
   */
  String FIELD_OWNERTYPE = "OWNERTYPE";
  /**
   * 属性: 所属主体
   */
  String FIELD_OWNERID = "OWNERID";
  /**
   * 属性: 备注
   */
  String FIELD_MEMO = "MEMO";
  /**
   * 属性: 签名
   */
  String FIELD_DIGESTCODE = "DIGESTCODE";
  /**
   * 属性: 创建人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 保留
   */
  String FIELD_RESERVER = "RESERVER";
  /**
   * 属性: 保留4
   */
  String FIELD_RESERVER4 = "RESERVER4";
  /**
   * 属性: 保留2
   */
  String FIELD_RESERVER2 = "RESERVER2";
  /**
   * 属性: 保留3
   */
  String FIELD_RESERVER3 = "RESERVER3";
  /**
   * 属性: 保留6
   */
  String FIELD_RESERVER6 = "RESERVER6";
  /**
   * 属性: 保留7
   */
  String FIELD_RESERVER7 = "RESERVER7";
  /**
   * 属性: 保留5
   */
  String FIELD_RESERVER5 = "RESERVER5";
  /**
   * 属性: 保留8
   */
  String FIELD_RESERVER8 = "RESERVER8";
  /**
   * 属性: 创建日期
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 租户系统标识
   */
  String FIELD_DCSYSTEMID = "DCSYSTEMID";
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
   * 查询: DEFAULT
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
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
            case "SDFileDTO":
                return new SDFileDTO();
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
                this.create((SDFileDTO) args[0]);
                return null;
            case "update" :
                this.update((SDFileDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((SDFileDTO) args[0]);
            case "checkkey" :
                return this.checkKey((SDFileDTO) args[0]);
            case "save" :
                this.save((SDFileDTO) args[0]);
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
     * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdeactions/Create.ibizmodel.yaml
     */
    default void create(SDFileDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdeactions/Update.ibizmodel.yaml
     */
    default void update(SDFileDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdeactions/Get.ibizmodel.yaml
     */
    default SDFileDTO get(String key) throws Throwable {
        return (SDFileDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdeactions/GetDraft.ibizmodel.yaml
     */
    default SDFileDTO getDraft(SDFileDTO dto) throws Throwable {
        return (SDFileDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(SDFileDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdeactions/Save.ibizmodel.yaml
     */
    default void save(SDFileDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * DEFAULT
     * 包含数据查询：DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<SDFileDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<SDFileDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * DEFAULT
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<SDFileDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<SDFileDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/disk/psdataentities/SD_FILE/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<SDFileDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<SDFileDTO>) obj;
    }

}

