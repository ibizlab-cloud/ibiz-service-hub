package net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.BulletinDTO;
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
 * 系统公告
 * 
 * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/.ibizmodel.index
 */
public interface IBulletinService extends IDEService<BulletinDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/notify/PSDATAENTITIES/Bulletin.json";

  /**
   * 属性: 备注
   */
  String FIELD_MEMO = "MEMO";
  /**
   * 属性: 排序
   */
  String FIELD_SHOWORDER = "SHOWORDER";
  /**
   * 属性: 建立人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 开始时间
   */
  String FIELD_BEGINTIME = "BEGINTIME";
  /**
   * 属性: 是否置顶
   */
  String FIELD_ISTOP = "ISTOP";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 公告内容
   */
  String FIELD_CONTENT = "CONTENT";
  /**
   * 属性: 结束时间
   */
  String FIELD_ENDTIME = "ENDTIME";
  /**
   * 属性: 发布时间
   */
  String FIELD_PUBLISHDATE = "PUBLISHDATE";
  /**
   * 属性: 附件
   */
  String FIELD_ATTS = "ATTS";
  /**
   * 属性: 建立时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 公告标题
   */
  String FIELD_NOTICENAME = "NOTICENAME";
  /**
   * 属性: 系统公告标识
   */
  String FIELD_NOTICEID = "NOTICEID";
  /**
   * 属性: 发布标记
   */
  String FIELD_PUBFLAG = "PUBFLAG";
  /**
   * 属性: 名称
   */
  String FIELD_ORGNAME = "ORGNAME";
  /**
   * 属性: 单位标识
   */
  String FIELD_ORGID = "ORGID";
  /**
   * 属性: 用户标识
   */
  String FIELD_AUTHORID = "AUTHORID";
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
   * 行为: 发布
   */
  String ACTION_PUBLISH = "Publish";
  /**
   * 行为: 撤回
   */
  String ACTION_RETRACT = "Retract";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 查询: 数据查询
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 单位公告
   */
  String DATAQUERY_ORGBULLETIN = "OrgBulletin";
  /**
   * 查询: 已发布公告
   */
  String DATAQUERY_PUBLISH = "Publish";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: 数据集
   */
  String DATASET_DEFAULT = "DEFAULT";
  /**
   * 集合: 单位公告
   */
  String DATASET_ORGBULLETIN = "OrgBulletin";
  /**
   * 集合: 已发布公告
   */
  String DATASET_PUBLISH = "Publish";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "BulletinDTO":
                return new BulletinDTO();
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
                this.create((BulletinDTO) args[0]);
                return null;
            case "update" :
                this.update((BulletinDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((BulletinDTO) args[0]);
            case "checkkey" :
                return this.checkKey((BulletinDTO) args[0]);
            case "publish" :
                this.publish((BulletinDTO) args[0]);
                return null;
            case "retract" :
                this.retract((BulletinDTO) args[0]);
                return null;
            case "save" :
                this.save((BulletinDTO) args[0]);
                return null;
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "default" :
               return this.fetchDefault((ISearchContextDTO) args[0]);
            case "orgbulletin" :
               return this.fetchOrgBulletin((ISearchContextDTO) args[0]);
            case "publish" :
               return this.fetchPublish((ISearchContextDTO) args[0]);
        }
        return this.getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
    } 

    /**
     * Create
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdeactions/Create.ibizmodel.yaml
     */
    default void create(BulletinDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdeactions/Update.ibizmodel.yaml
     */
    default void update(BulletinDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdeactions/Get.ibizmodel.yaml
     */
    default BulletinDTO get(String key) throws Throwable {
        return (BulletinDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdeactions/GetDraft.ibizmodel.yaml
     */
    default BulletinDTO getDraft(BulletinDTO dto) throws Throwable {
        return (BulletinDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(BulletinDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 发布
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdeactions/Publish.ibizmodel.yaml
     */
    default void publish(BulletinDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Publish", null, new Object[]{dto}, true);
    }

    /**
     * 撤回
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdelogics/Retract.ibizmodel.index
     */
    default void retract(BulletinDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Retract", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdeactions/Save.ibizmodel.yaml
     */
    default void save(BulletinDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<BulletinDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<BulletinDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }

    /**
     * 单位公告
     * 包含数据查询：单位公告
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdedatasets/OrgBulletin.ibizmodel.yaml
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdedataqueries/OrgBulletin.ibizmodel.ui
     */
    default Page<BulletinDTO> fetchOrgBulletin(ISearchContextDTO dto) throws Throwable {
        return (Page<BulletinDTO>) this.getDataEntityRuntime().fetchDataSet("OrgBulletin", null, new Object[]{dto}, true);
    }

    /**
     * 已发布公告
     * 包含数据查询：已发布公告
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdedatasets/Publish.ibizmodel.yaml
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdedataqueries/Publish.ibizmodel.ui
     */
    default Page<BulletinDTO> fetchPublish(ISearchContextDTO dto) throws Throwable {
        return (Page<BulletinDTO>) this.getDataEntityRuntime().fetchDataSet("Publish", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<BulletinDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<BulletinDTO>) obj;
    }


    /**
     * 单位公告
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdedataqueries/OrgBulletin.ibizmodel.ui
     */
    default List<BulletinDTO> selectOrgBulletin(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("OrgBulletin", dto);
        return (List<BulletinDTO>) obj;
    }


    /**
     * 已发布公告
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdedataqueries/Publish.ibizmodel.ui
     */
    default List<BulletinDTO> selectPublish(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("Publish", dto);
        return (List<BulletinDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<BulletinDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<BulletinDTO>) obj;
    }

}

