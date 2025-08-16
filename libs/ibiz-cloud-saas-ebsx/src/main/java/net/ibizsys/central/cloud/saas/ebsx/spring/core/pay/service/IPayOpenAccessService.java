package net.ibizsys.central.cloud.saas.ebsx.spring.core.pay.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.pay.dto.PayOpenAccessDTO;
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
 * 支付平台
 * 
 * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/.ibizmodel.index
 */
public interface IPayOpenAccessService extends IDEService<PayOpenAccessDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/pay/PSDATAENTITIES/PayOpenAccess.json";

  /**
   * 属性: 开放应用
   */
  String FIELD_ACCESSID = "ACCESSID";
  /**
   * 属性: 应用名称
   */
  String FIELD_ACCESSNAME = "ACCESSNAME";
  /**
   * 属性: 开放平台类型
   */
  String FIELD_OPEN_TYPE = "OPEN_TYPE";
  /**
   * 属性: AccessKey(AppId)
   */
  String FIELD_ACCESS_KEY = "ACCESS_KEY";
  /**
   * 属性: SecretKey(AppSecret)
   */
  String FIELD_SECRET_KEY = "SECRET_KEY";
  /**
   * 属性: RegionId
   */
  String FIELD_REGION_ID = "REGION_ID";
  /**
   * 属性: 管理账号token
   */
  String FIELD_ACCESS_TOKEN = "ACCESS_TOKEN";
  /**
   * 属性: 管理账号token过期时间
   */
  String FIELD_EXPIRES_TIME = "EXPIRES_TIME";
  /**
   * 属性: 是否禁用
   */
  String FIELD_DISABLED = "DISABLED";
  /**
   * 属性: RedirectURI
   */
  String FIELD_REDIRECT_URI = "REDIRECT_URI";
  /**
   * 属性: NotifyUrl
   */
  String FIELD_NOTIFY_URL = "NOTIFY_URL";
  /**
   * 属性: AGENT_ID
   */
  String FIELD_AGENT_ID = "AGENT_ID";
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
            case "PayOpenAccessDTO":
                return new PayOpenAccessDTO();
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
                this.create((PayOpenAccessDTO) args[0]);
                return null;
            case "update" :
                this.update((PayOpenAccessDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((PayOpenAccessDTO) args[0]);
            case "checkkey" :
                return this.checkKey((PayOpenAccessDTO) args[0]);
            case "save" :
                this.save((PayOpenAccessDTO) args[0]);
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
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdeactions/Create.ibizmodel.yaml
     */
    default void create(PayOpenAccessDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdeactions/Update.ibizmodel.yaml
     */
    default void update(PayOpenAccessDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdeactions/Get.ibizmodel.yaml
     */
    default PayOpenAccessDTO get(String key) throws Throwable {
        return (PayOpenAccessDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdeactions/GetDraft.ibizmodel.yaml
     */
    default PayOpenAccessDTO getDraft(PayOpenAccessDTO dto) throws Throwable {
        return (PayOpenAccessDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(PayOpenAccessDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdeactions/Save.ibizmodel.yaml
     */
    default void save(PayOpenAccessDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<PayOpenAccessDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<PayOpenAccessDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<PayOpenAccessDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<PayOpenAccessDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<PayOpenAccessDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<PayOpenAccessDTO>) obj;
    }

}

