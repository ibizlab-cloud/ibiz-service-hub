package net.ibizsys.central.cloud.saas.ebsx.spring.core.pay.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 支付交易
 * 
 * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/.ibizmodel.index
 */
public class PayTradeDTO extends EntityDTO {

  /**.
   * 开放平台应用
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdefields/ACCESSID/.ibizmodel.index
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/minorpsders/DER1N_PAY_TRADE_PAY_OPEN_ACCESS_ACCESSID/.ibizmodel.index
   */
  public final static String FIELD_ACCESSID = "accessid";

  /**.
   * 开放平台应用
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdefields/ACCESSNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/minorpsders/DER1N_PAY_TRADE_PAY_OPEN_ACCESS_ACCESSID/.ibizmodel.index
   */
  public final static String FIELD_ACCESSNAME = "accessname";

  /**.
   * AccessKey(AppId)
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdefields/APPID/.ibizmodel.index
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/minorpsders/DER1N_PAY_TRADE_PAY_OPEN_ACCESS_ACCESSID/.ibizmodel.index
   */
  public final static String FIELD_APP_ID = "app_id";

  /**.
   * 订单号
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdefields/OUTTRADENO/.ibizmodel.index
   */
  public final static String FIELD_OUT_TRADE_NO = "out_trade_no";

  /**.
   * 订单标题
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdefields/SUBJECT/.ibizmodel.index
   */
  public final static String FIELD_SUBJECT = "subject";

  /**.
   * 订单金额
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdefields/TOTALAMOUNT/.ibizmodel.index
   */
  public final static String FIELD_TOTAL_AMOUNT = "total_amount";

  /**.
   * 交易标识
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdefields/TRADEID/.ibizmodel.index
   */
  public final static String FIELD_TRADEID = "tradeid";

  /**.
   * 交易名称
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdefields/TRADENAME/.ibizmodel.index
   */
  public final static String FIELD_TRADE_NAME = "trade_name";

  /**.
   * 支付状态
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.TradeStatus} 
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdefields/TRADESTATUS/.ibizmodel.index
   * @see ibizmos:/psmodules/pay/pscodelists/TradeStatus.ibizmodel.yaml
   */
  public final static String FIELD_TRADE_STATUS = "trade_status";

  /**.
   * 支付类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.TradeType} 
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_TRADE/psdefields/TRADETYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/pay/pscodelists/TradeType.ibizmodel.yaml
   */
  public final static String FIELD_TRADE_TYPE = "trade_type";


    /**
     * 设置「开放平台应用」
     *
     * @param val
    */
    @JsonIgnore
    public PayTradeDTO setAccessId(String val) {
        this._set(FIELD_ACCESSID, val);
        return this;
    }

    /**
     * 获取「开放平台应用」值
     *
    */
    @JsonIgnore
    public String getAccessId() {
        return (String) this._get(FIELD_ACCESSID);
    }

    /**
     * 判断 「开放平台应用」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAccessId() {
        return this._contains(FIELD_ACCESSID);
    }

    /**
     * 重置 「开放平台应用」
     *
    */
    @JsonIgnore
    public PayTradeDTO resetAccessId() {
        this._reset(FIELD_ACCESSID);
        return this;
    }

    /**
     * 设置「开放平台应用」
     *
     * @param val
    */
    @JsonIgnore
    public PayTradeDTO setAccessName(String val) {
        this._set(FIELD_ACCESSNAME, val);
        return this;
    }

    /**
     * 获取「开放平台应用」值
     *
    */
    @JsonIgnore
    public String getAccessName() {
        return (String) this._get(FIELD_ACCESSNAME);
    }

    /**
     * 判断 「开放平台应用」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAccessName() {
        return this._contains(FIELD_ACCESSNAME);
    }

    /**
     * 重置 「开放平台应用」
     *
    */
    @JsonIgnore
    public PayTradeDTO resetAccessName() {
        this._reset(FIELD_ACCESSNAME);
        return this;
    }

    /**
     * 设置「AccessKey(AppId)」
     *
     * @param val
    */
    @JsonIgnore
    public PayTradeDTO setApp_id(String val) {
        this._set(FIELD_APP_ID, val);
        return this;
    }

    /**
     * 获取「AccessKey(AppId)」值
     *
    */
    @JsonIgnore
    public String getApp_id() {
        return (String) this._get(FIELD_APP_ID);
    }

    /**
     * 判断 「AccessKey(AppId)」是否有值
     *
    */
    @JsonIgnore
    public boolean containsApp_id() {
        return this._contains(FIELD_APP_ID);
    }

    /**
     * 重置 「AccessKey(AppId)」
     *
    */
    @JsonIgnore
    public PayTradeDTO resetApp_id() {
        this._reset(FIELD_APP_ID);
        return this;
    }

    /**
     * 设置「订单号」
     *
     * @param val
    */
    @JsonIgnore
    public PayTradeDTO setOut_trade_no(String val) {
        this._set(FIELD_OUT_TRADE_NO, val);
        return this;
    }

    /**
     * 获取「订单号」值
     *
    */
    @JsonIgnore
    public String getOut_trade_no() {
        return (String) this._get(FIELD_OUT_TRADE_NO);
    }

    /**
     * 判断 「订单号」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOut_trade_no() {
        return this._contains(FIELD_OUT_TRADE_NO);
    }

    /**
     * 重置 「订单号」
     *
    */
    @JsonIgnore
    public PayTradeDTO resetOut_trade_no() {
        this._reset(FIELD_OUT_TRADE_NO);
        return this;
    }

    /**
     * 设置「订单标题」
     *
     * @param val
    */
    @JsonIgnore
    public PayTradeDTO setSubject(String val) {
        this._set(FIELD_SUBJECT, val);
        return this;
    }

    /**
     * 获取「订单标题」值
     *
    */
    @JsonIgnore
    public String getSubject() {
        return (String) this._get(FIELD_SUBJECT);
    }

    /**
     * 判断 「订单标题」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSubject() {
        return this._contains(FIELD_SUBJECT);
    }

    /**
     * 重置 「订单标题」
     *
    */
    @JsonIgnore
    public PayTradeDTO resetSubject() {
        this._reset(FIELD_SUBJECT);
        return this;
    }

    /**
     * 设置「订单金额」
     *
     * @param val
    */
    @JsonIgnore
    public PayTradeDTO setTotal_amount(String val) {
        this._set(FIELD_TOTAL_AMOUNT, val);
        return this;
    }

    /**
     * 获取「订单金额」值
     *
    */
    @JsonIgnore
    public String getTotal_amount() {
        return (String) this._get(FIELD_TOTAL_AMOUNT);
    }

    /**
     * 判断 「订单金额」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTotal_amount() {
        return this._contains(FIELD_TOTAL_AMOUNT);
    }

    /**
     * 重置 「订单金额」
     *
    */
    @JsonIgnore
    public PayTradeDTO resetTotal_amount() {
        this._reset(FIELD_TOTAL_AMOUNT);
        return this;
    }

    /**
     * 设置「交易标识」
     *
     * @param val
    */
    @JsonIgnore
    public PayTradeDTO setTradeId(String val) {
        this._set(FIELD_TRADEID, val);
        return this;
    }

    /**
     * 获取「交易标识」值
     *
    */
    @JsonIgnore
    public String getTradeId() {
        return (String) this._get(FIELD_TRADEID);
    }

    /**
     * 判断 「交易标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTradeId() {
        return this._contains(FIELD_TRADEID);
    }

    /**
     * 重置 「交易标识」
     *
    */
    @JsonIgnore
    public PayTradeDTO resetTradeId() {
        this._reset(FIELD_TRADEID);
        return this;
    }

    /**
     * 设置「交易名称」
     *
     * @param val
    */
    @JsonIgnore
    public PayTradeDTO setTrade_name(String val) {
        this._set(FIELD_TRADE_NAME, val);
        return this;
    }

    /**
     * 获取「交易名称」值
     *
    */
    @JsonIgnore
    public String getTrade_name() {
        return (String) this._get(FIELD_TRADE_NAME);
    }

    /**
     * 判断 「交易名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTrade_name() {
        return this._contains(FIELD_TRADE_NAME);
    }

    /**
     * 重置 「交易名称」
     *
    */
    @JsonIgnore
    public PayTradeDTO resetTrade_name() {
        this._reset(FIELD_TRADE_NAME);
        return this;
    }

    /**
     * 设置「支付状态」
     *
     * @param val
    */
    @JsonIgnore
    public PayTradeDTO setTrade_status(String val) {
        this._set(FIELD_TRADE_STATUS, val);
        return this;
    }

    /**
     * 获取「支付状态」值
     *
    */
    @JsonIgnore
    public String getTrade_status() {
        return (String) this._get(FIELD_TRADE_STATUS);
    }

    /**
     * 判断 「支付状态」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTrade_status() {
        return this._contains(FIELD_TRADE_STATUS);
    }

    /**
     * 重置 「支付状态」
     *
    */
    @JsonIgnore
    public PayTradeDTO resetTrade_status() {
        this._reset(FIELD_TRADE_STATUS);
        return this;
    }

    /**
     * 设置「支付类型」
     *
     * @param val
    */
    @JsonIgnore
    public PayTradeDTO setTrade_type(String val) {
        this._set(FIELD_TRADE_TYPE, val);
        return this;
    }

    /**
     * 获取「支付类型」值
     *
    */
    @JsonIgnore
    public String getTrade_type() {
        return (String) this._get(FIELD_TRADE_TYPE);
    }

    /**
     * 判断 「支付类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTrade_type() {
        return this._contains(FIELD_TRADE_TYPE);
    }

    /**
     * 重置 「支付类型」
     *
    */
    @JsonIgnore
    public PayTradeDTO resetTrade_type() {
        this._reset(FIELD_TRADE_TYPE);
        return this;
    }


}
