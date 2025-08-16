package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 单位机构
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/.ibizmodel.index
 */
public class Organization extends EntityBase {

  /**.
   * 单位标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 单位代码
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/ORGCODE/.ibizmodel.index
   */
  public final static String FIELD_ORGCODE = "orgcode";

  /**.
   * 名称
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/ORGNAME/.ibizmodel.index
   */
  public final static String FIELD_ORGNAME = "orgname";

  /**.
   * 上级单位
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/PORGID/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/minorpsders/DER1N_SYS_ORG_SYS_ORG_PORGID/.ibizmodel.index
   */
  public final static String FIELD_PARENTORGID = "parentorgid";

  /**.
   * 单位简称
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/SHORTNAME/.ibizmodel.index
   */
  public final static String FIELD_SHORTNAME = "shortname";

  /**.
   * 单位级别
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/ORGLEVEL/.ibizmodel.index
   */
  public final static String FIELD_ORGLEVEL = "orglevel";

  /**.
   * 排序
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/SHOWORDER/.ibizmodel.index
   */
  public final static String FIELD_SHOWORDER = "showorder";

  /**.
   * 上级单位
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/PORGNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/minorpsders/DER1N_SYS_ORG_SYS_ORG_PORGID/.ibizmodel.index
   */
  public final static String FIELD_PARENTORGNAME = "parentorgname";

  /**.
   * 区属
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/DOMAINS/.ibizmodel.index
   */
  public final static String FIELD_DOMAINS = "domains";

  /**.
   * 创建时间
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 最后修改时间
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 启用标志
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/ISVALID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISVALID = "isvalid";

  /**.
   * 支持Saas
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/SAASMODE/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_SAASMODE = "saasmode";

  /**.
   * 
   *
   */
  public final static String FIELD_DEPTS = "depts";


    /**
     * 设置「单位标识」
     *
     * @param val
    */
    @JsonIgnore
    public Organization setOrgId(String val) {
        this.set(FIELD_ORGID, val);
        return this;
    }

    /**
     * 获取「单位标识」值
     *
    */
    @JsonIgnore
    public String getOrgId() {
        return (String) this.get(FIELD_ORGID);
    }

    /**
     * 判断 「单位标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgId() {
        return this.contains(FIELD_ORGID);
    }

    /**
     * 重置 「单位标识」
     *
    */
    @JsonIgnore
    public Organization resetOrgId() {
        this.reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「单位代码」
     *
     * @param val
    */
    @JsonIgnore
    public Organization setOrgCode(String val) {
        this.set(FIELD_ORGCODE, val);
        return this;
    }

    /**
     * 获取「单位代码」值
     *
    */
    @JsonIgnore
    public String getOrgCode() {
        return (String) this.get(FIELD_ORGCODE);
    }

    /**
     * 判断 「单位代码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgCode() {
        return this.contains(FIELD_ORGCODE);
    }

    /**
     * 重置 「单位代码」
     *
    */
    @JsonIgnore
    public Organization resetOrgCode() {
        this.reset(FIELD_ORGCODE);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public Organization setOrgName(String val) {
        this.set(FIELD_ORGNAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
    */
    @JsonIgnore
    public String getOrgName() {
        return (String) this.get(FIELD_ORGNAME);
    }

    /**
     * 判断 「名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgName() {
        return this.contains(FIELD_ORGNAME);
    }

    /**
     * 重置 「名称」
     *
    */
    @JsonIgnore
    public Organization resetOrgName() {
        this.reset(FIELD_ORGNAME);
        return this;
    }

    /**
     * 设置「上级单位」
     *
     * @param val
    */
    @JsonIgnore
    public Organization setParentOrgId(String val) {
        this.set(FIELD_PARENTORGID, val);
        return this;
    }

    /**
     * 获取「上级单位」值
     *
    */
    @JsonIgnore
    public String getParentOrgId() {
        return (String) this.get(FIELD_PARENTORGID);
    }

    /**
     * 判断 「上级单位」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParentOrgId() {
        return this.contains(FIELD_PARENTORGID);
    }

    /**
     * 重置 「上级单位」
     *
    */
    @JsonIgnore
    public Organization resetParentOrgId() {
        this.reset(FIELD_PARENTORGID);
        return this;
    }

    /**
     * 设置「单位简称」
     *
     * @param val
    */
    @JsonIgnore
    public Organization setShortName(String val) {
        this.set(FIELD_SHORTNAME, val);
        return this;
    }

    /**
     * 获取「单位简称」值
     *
    */
    @JsonIgnore
    public String getShortName() {
        return (String) this.get(FIELD_SHORTNAME);
    }

    /**
     * 判断 「单位简称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsShortName() {
        return this.contains(FIELD_SHORTNAME);
    }

    /**
     * 重置 「单位简称」
     *
    */
    @JsonIgnore
    public Organization resetShortName() {
        this.reset(FIELD_SHORTNAME);
        return this;
    }

    /**
     * 设置「单位级别」
     *
     * @param val
    */
    @JsonIgnore
    public Organization setOrgLevel(Integer val) {
        this.set(FIELD_ORGLEVEL, val);
        return this;
    }

    /**
     * 获取「单位级别」值
     *
    */
    @JsonIgnore
    public Integer getOrgLevel() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_ORGLEVEL),null);
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
        return this.contains(FIELD_ORGLEVEL);
    }

    /**
     * 重置 「单位级别」
     *
    */
    @JsonIgnore
    public Organization resetOrgLevel() {
        this.reset(FIELD_ORGLEVEL);
        return this;
    }

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public Organization setShowOrder(Integer val) {
        this.set(FIELD_SHOWORDER, val);
        return this;
    }

    /**
     * 获取「排序」值
     *
    */
    @JsonIgnore
    public Integer getShowOrder() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_SHOWORDER),null);
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
        return this.contains(FIELD_SHOWORDER);
    }

    /**
     * 重置 「排序」
     *
    */
    @JsonIgnore
    public Organization resetShowOrder() {
        this.reset(FIELD_SHOWORDER);
        return this;
    }

    /**
     * 设置「上级单位」
     *
     * @param val
    */
    @JsonIgnore
    public Organization setParentOrgName(String val) {
        this.set(FIELD_PARENTORGNAME, val);
        return this;
    }

    /**
     * 获取「上级单位」值
     *
    */
    @JsonIgnore
    public String getParentOrgName() {
        return (String) this.get(FIELD_PARENTORGNAME);
    }

    /**
     * 判断 「上级单位」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParentOrgName() {
        return this.contains(FIELD_PARENTORGNAME);
    }

    /**
     * 重置 「上级单位」
     *
    */
    @JsonIgnore
    public Organization resetParentOrgName() {
        this.reset(FIELD_PARENTORGNAME);
        return this;
    }

    /**
     * 设置「区属」
     *
     * @param val
    */
    @JsonIgnore
    public Organization setDomains(String val) {
        this.set(FIELD_DOMAINS, val);
        return this;
    }

    /**
     * 获取「区属」值
     *
    */
    @JsonIgnore
    public String getDomains() {
        return (String) this.get(FIELD_DOMAINS);
    }

    /**
     * 判断 「区属」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDomains() {
        return this.contains(FIELD_DOMAINS);
    }

    /**
     * 重置 「区属」
     *
    */
    @JsonIgnore
    public Organization resetDomains() {
        this.reset(FIELD_DOMAINS);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public Organization setCreateDate(Timestamp val) {
        this.set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「创建时间」值
     *
    */
    @JsonIgnore
    public Timestamp getCreateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this.get(FIELD_CREATEDATE),null);
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
        return this.contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「创建时间」
     *
    */
    @JsonIgnore
    public Organization resetCreateDate() {
        this.reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「最后修改时间」
     *
     * @param val
    */
    @JsonIgnore
    public Organization setUpdateDate(Timestamp val) {
        this.set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「最后修改时间」值
     *
    */
    @JsonIgnore
    public Timestamp getUpdateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this.get(FIELD_UPDATEDATE),null);
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
        return this.contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「最后修改时间」
     *
    */
    @JsonIgnore
    public Organization resetUpdateDate() {
        this.reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「启用标志」
     *
     * @param val
    */
    @JsonIgnore
    public Organization setIsValid(Integer val) {
        this.set(FIELD_ISVALID, val);
        return this;
    }

    /**
     * 获取「启用标志」值
     *
    */
    @JsonIgnore
    public Integer getIsValid() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_ISVALID),null);
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
        return this.contains(FIELD_ISVALID);
    }

    /**
     * 重置 「启用标志」
     *
    */
    @JsonIgnore
    public Organization resetIsValid() {
        this.reset(FIELD_ISVALID);
        return this;
    }

    /**
     * 设置「支持Saas」
     *
     * @param val
    */
    @JsonIgnore
    public Organization setSaaSMode(Integer val) {
        this.set(FIELD_SAASMODE, val);
        return this;
    }

    /**
     * 获取「支持Saas」值
     *
    */
    @JsonIgnore
    public Integer getSaaSMode() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_SAASMODE),null);
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
        return this.contains(FIELD_SAASMODE);
    }

    /**
     * 重置 「支持Saas」
     *
    */
    @JsonIgnore
    public Organization resetSaaSMode() {
        this.reset(FIELD_SAASMODE);
        return this;
    }

    


}
