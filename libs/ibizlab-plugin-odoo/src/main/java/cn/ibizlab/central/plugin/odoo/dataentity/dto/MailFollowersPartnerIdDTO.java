package cn.ibizlab.central.plugin.odoo.dataentity.dto;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.central.util.IEntityDTO;


public class MailFollowersPartnerIdDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 相关的业务伙伴
     */
    public final static String FIELD_PARTNER_ID = "partner_id";

    /**
     * 设置「相关的业务伙伴」
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_ID)
    public MailFollowersPartnerIdDTO setPartnerId(String val) {
        this._set(FIELD_PARTNER_ID, val);
        return this;
    }

    /**
     * 获取「相关的业务伙伴」值
     *
     */
    @JsonIgnore
    public String getPartnerId() {
        return DataTypeUtils.asString(this._get(FIELD_PARTNER_ID), null);
    }

    /**
     * 判断 「相关的业务伙伴」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerId() {
        return this._contains(FIELD_PARTNER_ID);
    }

    /**
     * 重置 「相关的业务伙伴」
     *
     */
    @JsonIgnore
    public MailFollowersPartnerIdDTO resetPartnerId() {
        this._reset(FIELD_PARTNER_ID);
        return this;
    }

}
