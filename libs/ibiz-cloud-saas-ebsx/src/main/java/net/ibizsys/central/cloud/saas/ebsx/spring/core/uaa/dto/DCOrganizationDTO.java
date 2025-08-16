package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 组织
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_ORG/.ibizmodel.index
 */
public class DCOrganizationDTO extends EntityDTO {

  /**.
   * 单位标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_ORG/psdefields/ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 单位代码
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_ORG/psdefields/ORGCODE/.ibizmodel.index
   */
  public final static String FIELD_ORGCODE = "orgcode";

  /**.
   * 名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_ORG/psdefields/ORGNAME/.ibizmodel.index
   */
  public final static String FIELD_ORGNAME = "orgname";

  /**.
   * 单位简称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_ORG/psdefields/SHORTNAME/.ibizmodel.index
   */
  public final static String FIELD_SHORTNAME = "shortname";

  /**.
   * 单位级别
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_ORG/psdefields/ORGLEVEL/.ibizmodel.index
   */
  public final static String FIELD_ORGLEVEL = "orglevel";

  /**.
   * 排序
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_ORG/psdefields/SHOWORDER/.ibizmodel.index
   */
  public final static String FIELD_SHOWORDER = "showorder";

  /**.
   * 区属
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_ORG/psdefields/DOMAINS/.ibizmodel.index
   */
  public final static String FIELD_DOMAINS = "domains";

  /**.
   * 创建时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_ORG/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 最后修改时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_ORG/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 启用标志
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_ORG/psdefields/ISVALID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISVALID = "isvalid";

  /**.
   * 支持Saas
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_ORG/psdefields/SAASMODE/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_SAASMODE = "saasmode";

  /**.
   * 租户
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_ORG/psdefields/SRFDCID/.ibizmodel.index
   */
  public final static String FIELD_SRFDCID = "srfdcid";


    /**
     * 设置「单位标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrganizationDTO setOrgId(String val) {
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
    public DCOrganizationDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「单位代码」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrganizationDTO setOrgCode(String val) {
        this._set(FIELD_ORGCODE, val);
        return this;
    }

    /**
     * 获取「单位代码」值
     *
    */
    @JsonIgnore
    public String getOrgCode() {
        return (String) this._get(FIELD_ORGCODE);
    }

    /**
     * 判断 「单位代码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgCode() {
        return this._contains(FIELD_ORGCODE);
    }

    /**
     * 重置 「单位代码」
     *
    */
    @JsonIgnore
    public DCOrganizationDTO resetOrgCode() {
        this._reset(FIELD_ORGCODE);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrganizationDTO setOrgName(String val) {
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
    public DCOrganizationDTO resetOrgName() {
        this._reset(FIELD_ORGNAME);
        return this;
    }

    /**
     * 设置「单位简称」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrganizationDTO setShortName(String val) {
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
    public DCOrganizationDTO resetShortName() {
        this._reset(FIELD_SHORTNAME);
        return this;
    }

    /**
     * 设置「单位级别」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrganizationDTO setOrgLevel(Integer val) {
        this._set(FIELD_ORGLEVEL, val);
        return this;
    }

    /**
     * 获取「单位级别」值
     *
    */
    @JsonIgnore
    public Integer getOrgLevel() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ORGLEVEL),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「单位级别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgLevel() {
        return this._contains(FIELD_ORGLEVEL);
    }

    /**
     * 重置 「单位级别」
     *
    */
    @JsonIgnore
    public DCOrganizationDTO resetOrgLevel() {
        this._reset(FIELD_ORGLEVEL);
        return this;
    }

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrganizationDTO setShowOrder(Integer val) {
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
    public DCOrganizationDTO resetShowOrder() {
        this._reset(FIELD_SHOWORDER);
        return this;
    }

    /**
     * 设置「区属」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrganizationDTO setDomains(String val) {
        this._set(FIELD_DOMAINS, val);
        return this;
    }

    /**
     * 获取「区属」值
     *
    */
    @JsonIgnore
    public String getDomains() {
        return (String) this._get(FIELD_DOMAINS);
    }

    /**
     * 判断 「区属」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDomains() {
        return this._contains(FIELD_DOMAINS);
    }

    /**
     * 重置 「区属」
     *
    */
    @JsonIgnore
    public DCOrganizationDTO resetDomains() {
        this._reset(FIELD_DOMAINS);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrganizationDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「创建时间」值
     *
    */
    @JsonIgnore
    public Timestamp getCreateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_CREATEDATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「创建时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「创建时间」
     *
    */
    @JsonIgnore
    public DCOrganizationDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「最后修改时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrganizationDTO setUpdateDate(Timestamp val) {
        this._set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「最后修改时间」值
     *
    */
    @JsonIgnore
    public Timestamp getUpdateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_UPDATEDATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「最后修改时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateDate() {
        return this._contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「最后修改时间」
     *
    */
    @JsonIgnore
    public DCOrganizationDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「启用标志」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrganizationDTO setIsValid(Integer val) {
        this._set(FIELD_ISVALID, val);
        return this;
    }

    /**
     * 获取「启用标志」值
     *
    */
    @JsonIgnore
    public Integer getIsValid() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ISVALID),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「启用标志」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIsValid() {
        return this._contains(FIELD_ISVALID);
    }

    /**
     * 重置 「启用标志」
     *
    */
    @JsonIgnore
    public DCOrganizationDTO resetIsValid() {
        this._reset(FIELD_ISVALID);
        return this;
    }

    /**
     * 设置「支持Saas」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrganizationDTO setSaaSMode(Integer val) {
        this._set(FIELD_SAASMODE, val);
        return this;
    }

    /**
     * 获取「支持Saas」值
     *
    */
    @JsonIgnore
    public Integer getSaaSMode() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_SAASMODE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「支持Saas」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSaaSMode() {
        return this._contains(FIELD_SAASMODE);
    }

    /**
     * 重置 「支持Saas」
     *
    */
    @JsonIgnore
    public DCOrganizationDTO resetSaaSMode() {
        this._reset(FIELD_SAASMODE);
        return this;
    }

    /**
     * 设置「租户」
     *
     * @param val
    */
    @JsonIgnore
    public DCOrganizationDTO setSrfdcid(String val) {
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
    public DCOrganizationDTO resetSrfdcid() {
        this._reset(FIELD_SRFDCID);
        return this;
    }


}
