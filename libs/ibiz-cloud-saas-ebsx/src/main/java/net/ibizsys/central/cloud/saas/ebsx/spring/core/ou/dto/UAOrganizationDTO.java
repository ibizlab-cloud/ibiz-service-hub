package net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 单位机构_界面辅助
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/.ibizmodel.index
 */
public class UAOrganizationDTO extends EntityDTO {

  /**.
   * 单位标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/psdefields/ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 名称
   *
   * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/psdefields/ORGNAME/.ibizmodel.index
   */
  public final static String FIELD_ORGNAME = "orgname";

  /**.
   * 上级单位
   *
   * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/psdefields/PORGID/.ibizmodel.index
   */
  public final static String FIELD_PARENTORGID = "parentorgid";

  /**.
   * 单位简称
   *
   * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/psdefields/SHORTNAME/.ibizmodel.index
   */
  public final static String FIELD_SHORTNAME = "shortname";

  /**.
   * 排序
   *
   * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/psdefields/SHOWORDER/.ibizmodel.index
   */
  public final static String FIELD_SHOWORDER = "showorder";

  /**.
   * 租户
   *
   * @see ibizmos:/psmodules/ou/psdataentities/UA_ORG/psdefields/SRFDCID/.ibizmodel.index
   */
  public final static String FIELD_SRFDCID = "srfdcid";


    /**
     * 设置「单位标识」
     *
     * @param val
    */
    @JsonIgnore
    public UAOrganizationDTO setOrgId(String val) {
        this._set(FIELD_ORGID, val);
        return this;
    }

    /**
     * 获取「单位标识」值
     *
    */
    @JsonIgnore
    public String getOrgId() {
        return (String) this._get(FIELD_ORGID);
    }

    /**
     * 判断 「单位标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgId() {
        return this._contains(FIELD_ORGID);
    }

    /**
     * 重置 「单位标识」
     *
    */
    @JsonIgnore
    public UAOrganizationDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public UAOrganizationDTO setOrgName(String val) {
        this._set(FIELD_ORGNAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
    */
    @JsonIgnore
    public String getOrgName() {
        return (String) this._get(FIELD_ORGNAME);
    }

    /**
     * 判断 「名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgName() {
        return this._contains(FIELD_ORGNAME);
    }

    /**
     * 重置 「名称」
     *
    */
    @JsonIgnore
    public UAOrganizationDTO resetOrgName() {
        this._reset(FIELD_ORGNAME);
        return this;
    }

    /**
     * 设置「上级单位」
     *
     * @param val
    */
    @JsonIgnore
    public UAOrganizationDTO setParentOrgId(String val) {
        this._set(FIELD_PARENTORGID, val);
        return this;
    }

    /**
     * 获取「上级单位」值
     *
    */
    @JsonIgnore
    public String getParentOrgId() {
        return (String) this._get(FIELD_PARENTORGID);
    }

    /**
     * 判断 「上级单位」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParentOrgId() {
        return this._contains(FIELD_PARENTORGID);
    }

    /**
     * 重置 「上级单位」
     *
    */
    @JsonIgnore
    public UAOrganizationDTO resetParentOrgId() {
        this._reset(FIELD_PARENTORGID);
        return this;
    }

    /**
     * 设置「单位简称」
     *
     * @param val
    */
    @JsonIgnore
    public UAOrganizationDTO setShortName(String val) {
        this._set(FIELD_SHORTNAME, val);
        return this;
    }

    /**
     * 获取「单位简称」值
     *
    */
    @JsonIgnore
    public String getShortName() {
        return (String) this._get(FIELD_SHORTNAME);
    }

    /**
     * 判断 「单位简称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsShortName() {
        return this._contains(FIELD_SHORTNAME);
    }

    /**
     * 重置 「单位简称」
     *
    */
    @JsonIgnore
    public UAOrganizationDTO resetShortName() {
        this._reset(FIELD_SHORTNAME);
        return this;
    }

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public UAOrganizationDTO setShowOrder(Integer val) {
        this._set(FIELD_SHOWORDER, val);
        return this;
    }

    /**
     * 获取「排序」值
     *
    */
    @JsonIgnore
    public Integer getShowOrder() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_SHOWORDER),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「排序」是否有值
     *
    */
    @JsonIgnore
    public boolean containsShowOrder() {
        return this._contains(FIELD_SHOWORDER);
    }

    /**
     * 重置 「排序」
     *
    */
    @JsonIgnore
    public UAOrganizationDTO resetShowOrder() {
        this._reset(FIELD_SHOWORDER);
        return this;
    }

    /**
     * 设置「租户」
     *
     * @param val
    */
    @JsonIgnore
    public UAOrganizationDTO setSrfdcid(String val) {
        this._set(FIELD_SRFDCID, val);
        return this;
    }

    /**
     * 获取「租户」值
     *
    */
    @JsonIgnore
    public String getSrfdcid() {
        return (String) this._get(FIELD_SRFDCID);
    }

    /**
     * 判断 「租户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSrfdcid() {
        return this._contains(FIELD_SRFDCID);
    }

    /**
     * 重置 「租户」
     *
    */
    @JsonIgnore
    public UAOrganizationDTO resetSrfdcid() {
        this._reset(FIELD_SRFDCID);
        return this;
    }


}
