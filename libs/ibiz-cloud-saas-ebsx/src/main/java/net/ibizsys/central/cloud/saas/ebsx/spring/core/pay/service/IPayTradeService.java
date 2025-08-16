package net.ibizsys.central.cloud.saas.ebsx.spring.core.pay.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.pay.dto.PayTradeDTO;
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
 * 支付交易
 * 
 * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/.ibizmodel.index
 */
public interface IPayTradeService extends IDEService<PayTradeDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/pay/PSDATAENTITIES/PayTrade.json";

  /**
   * 属性: 订单标题
   */
  String FIELD_SUBJECT = "SUBJECT";
  /**
   * 属性: 订单金额
   */
  String FIELD_TOTALAMOUNT = "TOTALAMOUNT";
  /**
   * 属性: 交易名称
   */
  String FIELD_TRADENAME = "TRADENAME";
  /**
   * 属性: 支付类型
   */
  String FIELD_TRADETYPE = "TRADETYPE";
  /**
   * 属性: 支付状态
   */
  String FIELD_TRADESTATUS = "TRADESTATUS";
  /**
   * 属性: 订单号
   */
  String FIELD_OUTTRADENO = "OUTTRADENO";
  /**
   * 属性: 交易标识
   */
  String FIELD_TRADEID = "TRADEID";
  /**
   * 属性: AccessKey(AppId)
   */
  String FIELD_APPID = "APPID";
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
            case "PayTradeDTO":
                return new PayTradeDTO();
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
                this.create((PayTradeDTO) args[0]);
                return null;
            case "update" :
                this.update((PayTradeDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((PayTradeDTO) args[0]);
            case "checkkey" :
                return this.checkKey((PayTradeDTO) args[0]);
            case "save" :
                this.save((PayTradeDTO) args[0]);
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
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdeactions/Create.ibizmodel.yaml
     */
    default void create(PayTradeDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdeactions/Update.ibizmodel.yaml
     */
    default void update(PayTradeDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdeactions/Get.ibizmodel.yaml
     */
    default PayTradeDTO get(String key) throws Throwable {
        return (PayTradeDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdeactions/GetDraft.ibizmodel.yaml
     */
    default PayTradeDTO getDraft(PayTradeDTO dto) throws Throwable {
        return (PayTradeDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(PayTradeDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdeactions/Save.ibizmodel.yaml
     */
    default void save(PayTradeDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<PayTradeDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<PayTradeDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<PayTradeDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<PayTradeDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<PayTradeDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<PayTradeDTO>) obj;
    }

}

