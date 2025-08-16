package net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 单位机构
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/.ibizmodel.index
 */
public class OrganizationDTO extends EntityDTO {

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
   * 更新时间
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 保留
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER/.ibizmodel.index
   */
  public final static String FIELD_RESERVER = "reserver";

  /**.
   * 保留10
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER10/.ibizmodel.index
   */
  public final static String FIELD_RESERVER10 = "reserver10";

  /**.
   * 保留11
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER11/.ibizmodel.index
   */
  public final static String FIELD_RESERVER11 = "reserver11";

  /**.
   * 保留12
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER12/.ibizmodel.index
   */
  public final static String FIELD_RESERVER12 = "reserver12";

  /**.
   * 保留13
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER13/.ibizmodel.index
   */
  public final static String FIELD_RESERVER13 = "reserver13";

  /**.
   * 保留14
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER14/.ibizmodel.index
   */
  public final static String FIELD_RESERVER14 = "reserver14";

  /**.
   * 保留15
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER15/.ibizmodel.index
   */
  public final static String FIELD_RESERVER15 = "reserver15";

  /**.
   * 保留16
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER16/.ibizmodel.index
   */
  public final static String FIELD_RESERVER16 = "reserver16";

  /**.
   * 保留17
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER17/.ibizmodel.index
   */
  public final static String FIELD_RESERVER17 = "reserver17";

  /**.
   * 保留18
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER18/.ibizmodel.index
   */
  public final static String FIELD_RESERVER18 = "reserver18";

  /**.
   * 保留19
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER19/.ibizmodel.index
   */
  public final static String FIELD_RESERVER19 = "reserver19";

  /**.
   * 保留2
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER2/.ibizmodel.index
   */
  public final static String FIELD_RESERVER2 = "reserver2";

  /**.
   * 保留20
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER20/.ibizmodel.index
   */
  public final static String FIELD_RESERVER20 = "reserver20";

  /**.
   * 保留3
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER3/.ibizmodel.index
   */
  public final static String FIELD_RESERVER3 = "reserver3";

  /**.
   * 保留4
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER4/.ibizmodel.index
   */
  public final static String FIELD_RESERVER4 = "reserver4";

  /**.
   * 保留5
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER5/.ibizmodel.index
   */
  public final static String FIELD_RESERVER5 = "reserver5";

  /**.
   * 保留6
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER6/.ibizmodel.index
   */
  public final static String FIELD_RESERVER6 = "reserver6";

  /**.
   * 保留7
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER7/.ibizmodel.index
   */
  public final static String FIELD_RESERVER7 = "reserver7";

  /**.
   * 保留8
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER8/.ibizmodel.index
   */
  public final static String FIELD_RESERVER8 = "reserver8";

  /**.
   * 保留9
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_ORG/psdefields/RESERVER9/.ibizmodel.index
   */
  public final static String FIELD_RESERVER9 = "reserver9";

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
    public OrganizationDTO setOrgId(String val) {
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
    public OrganizationDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「单位代码」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setOrgCode(String val) {
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
    public OrganizationDTO resetOrgCode() {
        this._reset(FIELD_ORGCODE);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setOrgName(String val) {
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
    public OrganizationDTO resetOrgName() {
        this._reset(FIELD_ORGNAME);
        return this;
    }

    /**
     * 设置「上级单位」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setParentOrgId(String val) {
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
    public OrganizationDTO resetParentOrgId() {
        this._reset(FIELD_PARENTORGID);
        return this;
    }

    /**
     * 设置「单位简称」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setShortName(String val) {
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
    public OrganizationDTO resetShortName() {
        this._reset(FIELD_SHORTNAME);
        return this;
    }

    /**
     * 设置「单位级别」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setOrgLevel(Integer val) {
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
    public OrganizationDTO resetOrgLevel() {
        this._reset(FIELD_ORGLEVEL);
        return this;
    }

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setShowOrder(Integer val) {
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
    public OrganizationDTO resetShowOrder() {
        this._reset(FIELD_SHOWORDER);
        return this;
    }

    /**
     * 设置「上级单位」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setParentOrgName(String val) {
        this._set(FIELD_PARENTORGNAME, val);
        return this;
    }

    /**
     * 获取「上级单位」值
     *
    */
    @JsonIgnore
    public String getParentOrgName() {
        return (String) this._get(FIELD_PARENTORGNAME);
    }

    /**
     * 判断 「上级单位」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParentOrgName() {
        return this._contains(FIELD_PARENTORGNAME);
    }

    /**
     * 重置 「上级单位」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetParentOrgName() {
        this._reset(FIELD_PARENTORGNAME);
        return this;
    }

    /**
     * 设置「区属」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setDomains(String val) {
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
    public OrganizationDTO resetDomains() {
        this._reset(FIELD_DOMAINS);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setCreateDate(Timestamp val) {
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
    public OrganizationDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setUpdateDate(Timestamp val) {
        this._set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「更新时间」值
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
     * 判断 「更新时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateDate() {
        return this._contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「更新时间」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「保留」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver(String val) {
        this._set(FIELD_RESERVER, val);
        return this;
    }

    /**
     * 获取「保留」值
     *
    */
    @JsonIgnore
    public String getReserver() {
        return (String) this._get(FIELD_RESERVER);
    }

    /**
     * 判断 「保留」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver() {
        return this._contains(FIELD_RESERVER);
    }

    /**
     * 重置 「保留」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver() {
        this._reset(FIELD_RESERVER);
        return this;
    }

    /**
     * 设置「保留10」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver10(String val) {
        this._set(FIELD_RESERVER10, val);
        return this;
    }

    /**
     * 获取「保留10」值
     *
    */
    @JsonIgnore
    public String getReserver10() {
        return (String) this._get(FIELD_RESERVER10);
    }

    /**
     * 判断 「保留10」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver10() {
        return this._contains(FIELD_RESERVER10);
    }

    /**
     * 重置 「保留10」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver10() {
        this._reset(FIELD_RESERVER10);
        return this;
    }

    /**
     * 设置「保留11」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver11(Integer val) {
        this._set(FIELD_RESERVER11, val);
        return this;
    }

    /**
     * 获取「保留11」值
     *
    */
    @JsonIgnore
    public Integer getReserver11() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_RESERVER11),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「保留11」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver11() {
        return this._contains(FIELD_RESERVER11);
    }

    /**
     * 重置 「保留11」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver11() {
        this._reset(FIELD_RESERVER11);
        return this;
    }

    /**
     * 设置「保留12」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver12(Integer val) {
        this._set(FIELD_RESERVER12, val);
        return this;
    }

    /**
     * 获取「保留12」值
     *
    */
    @JsonIgnore
    public Integer getReserver12() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_RESERVER12),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「保留12」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver12() {
        return this._contains(FIELD_RESERVER12);
    }

    /**
     * 重置 「保留12」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver12() {
        this._reset(FIELD_RESERVER12);
        return this;
    }

    /**
     * 设置「保留13」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver13(Integer val) {
        this._set(FIELD_RESERVER13, val);
        return this;
    }

    /**
     * 获取「保留13」值
     *
    */
    @JsonIgnore
    public Integer getReserver13() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_RESERVER13),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「保留13」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver13() {
        return this._contains(FIELD_RESERVER13);
    }

    /**
     * 重置 「保留13」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver13() {
        this._reset(FIELD_RESERVER13);
        return this;
    }

    /**
     * 设置「保留14」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver14(Integer val) {
        this._set(FIELD_RESERVER14, val);
        return this;
    }

    /**
     * 获取「保留14」值
     *
    */
    @JsonIgnore
    public Integer getReserver14() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_RESERVER14),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「保留14」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver14() {
        return this._contains(FIELD_RESERVER14);
    }

    /**
     * 重置 「保留14」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver14() {
        this._reset(FIELD_RESERVER14);
        return this;
    }

    /**
     * 设置「保留15」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver15(BigDecimal val) {
        this._set(FIELD_RESERVER15, val);
        return this;
    }

    /**
     * 获取「保留15」值
     *
    */
    @JsonIgnore
    public BigDecimal getReserver15() {
        try{
            return DataTypeUtils.getBigDecimalValue(this._get(FIELD_RESERVER15),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「保留15」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver15() {
        return this._contains(FIELD_RESERVER15);
    }

    /**
     * 重置 「保留15」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver15() {
        this._reset(FIELD_RESERVER15);
        return this;
    }

    /**
     * 设置「保留16」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver16(BigDecimal val) {
        this._set(FIELD_RESERVER16, val);
        return this;
    }

    /**
     * 获取「保留16」值
     *
    */
    @JsonIgnore
    public BigDecimal getReserver16() {
        try{
            return DataTypeUtils.getBigDecimalValue(this._get(FIELD_RESERVER16),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「保留16」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver16() {
        return this._contains(FIELD_RESERVER16);
    }

    /**
     * 重置 「保留16」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver16() {
        this._reset(FIELD_RESERVER16);
        return this;
    }

    /**
     * 设置「保留17」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver17(BigDecimal val) {
        this._set(FIELD_RESERVER17, val);
        return this;
    }

    /**
     * 获取「保留17」值
     *
    */
    @JsonIgnore
    public BigDecimal getReserver17() {
        try{
            return DataTypeUtils.getBigDecimalValue(this._get(FIELD_RESERVER17),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「保留17」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver17() {
        return this._contains(FIELD_RESERVER17);
    }

    /**
     * 重置 「保留17」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver17() {
        this._reset(FIELD_RESERVER17);
        return this;
    }

    /**
     * 设置「保留18」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver18(BigDecimal val) {
        this._set(FIELD_RESERVER18, val);
        return this;
    }

    /**
     * 获取「保留18」值
     *
    */
    @JsonIgnore
    public BigDecimal getReserver18() {
        try{
            return DataTypeUtils.getBigDecimalValue(this._get(FIELD_RESERVER18),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「保留18」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver18() {
        return this._contains(FIELD_RESERVER18);
    }

    /**
     * 重置 「保留18」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver18() {
        this._reset(FIELD_RESERVER18);
        return this;
    }

    /**
     * 设置「保留19」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver19(Timestamp val) {
        this._set(FIELD_RESERVER19, val);
        return this;
    }

    /**
     * 获取「保留19」值
     *
    */
    @JsonIgnore
    public Timestamp getReserver19() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_RESERVER19),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「保留19」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver19() {
        return this._contains(FIELD_RESERVER19);
    }

    /**
     * 重置 「保留19」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver19() {
        this._reset(FIELD_RESERVER19);
        return this;
    }

    /**
     * 设置「保留2」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver2(String val) {
        this._set(FIELD_RESERVER2, val);
        return this;
    }

    /**
     * 获取「保留2」值
     *
    */
    @JsonIgnore
    public String getReserver2() {
        return (String) this._get(FIELD_RESERVER2);
    }

    /**
     * 判断 「保留2」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver2() {
        return this._contains(FIELD_RESERVER2);
    }

    /**
     * 重置 「保留2」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver2() {
        this._reset(FIELD_RESERVER2);
        return this;
    }

    /**
     * 设置「保留20」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver20(Timestamp val) {
        this._set(FIELD_RESERVER20, val);
        return this;
    }

    /**
     * 获取「保留20」值
     *
    */
    @JsonIgnore
    public Timestamp getReserver20() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_RESERVER20),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「保留20」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver20() {
        return this._contains(FIELD_RESERVER20);
    }

    /**
     * 重置 「保留20」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver20() {
        this._reset(FIELD_RESERVER20);
        return this;
    }

    /**
     * 设置「保留3」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver3(String val) {
        this._set(FIELD_RESERVER3, val);
        return this;
    }

    /**
     * 获取「保留3」值
     *
    */
    @JsonIgnore
    public String getReserver3() {
        return (String) this._get(FIELD_RESERVER3);
    }

    /**
     * 判断 「保留3」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver3() {
        return this._contains(FIELD_RESERVER3);
    }

    /**
     * 重置 「保留3」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver3() {
        this._reset(FIELD_RESERVER3);
        return this;
    }

    /**
     * 设置「保留4」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver4(String val) {
        this._set(FIELD_RESERVER4, val);
        return this;
    }

    /**
     * 获取「保留4」值
     *
    */
    @JsonIgnore
    public String getReserver4() {
        return (String) this._get(FIELD_RESERVER4);
    }

    /**
     * 判断 「保留4」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver4() {
        return this._contains(FIELD_RESERVER4);
    }

    /**
     * 重置 「保留4」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver4() {
        this._reset(FIELD_RESERVER4);
        return this;
    }

    /**
     * 设置「保留5」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver5(String val) {
        this._set(FIELD_RESERVER5, val);
        return this;
    }

    /**
     * 获取「保留5」值
     *
    */
    @JsonIgnore
    public String getReserver5() {
        return (String) this._get(FIELD_RESERVER5);
    }

    /**
     * 判断 「保留5」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver5() {
        return this._contains(FIELD_RESERVER5);
    }

    /**
     * 重置 「保留5」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver5() {
        this._reset(FIELD_RESERVER5);
        return this;
    }

    /**
     * 设置「保留6」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver6(String val) {
        this._set(FIELD_RESERVER6, val);
        return this;
    }

    /**
     * 获取「保留6」值
     *
    */
    @JsonIgnore
    public String getReserver6() {
        return (String) this._get(FIELD_RESERVER6);
    }

    /**
     * 判断 「保留6」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver6() {
        return this._contains(FIELD_RESERVER6);
    }

    /**
     * 重置 「保留6」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver6() {
        this._reset(FIELD_RESERVER6);
        return this;
    }

    /**
     * 设置「保留7」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver7(String val) {
        this._set(FIELD_RESERVER7, val);
        return this;
    }

    /**
     * 获取「保留7」值
     *
    */
    @JsonIgnore
    public String getReserver7() {
        return (String) this._get(FIELD_RESERVER7);
    }

    /**
     * 判断 「保留7」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver7() {
        return this._contains(FIELD_RESERVER7);
    }

    /**
     * 重置 「保留7」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver7() {
        this._reset(FIELD_RESERVER7);
        return this;
    }

    /**
     * 设置「保留8」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver8(String val) {
        this._set(FIELD_RESERVER8, val);
        return this;
    }

    /**
     * 获取「保留8」值
     *
    */
    @JsonIgnore
    public String getReserver8() {
        return (String) this._get(FIELD_RESERVER8);
    }

    /**
     * 判断 「保留8」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver8() {
        return this._contains(FIELD_RESERVER8);
    }

    /**
     * 重置 「保留8」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver8() {
        this._reset(FIELD_RESERVER8);
        return this;
    }

    /**
     * 设置「保留9」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setReserver9(String val) {
        this._set(FIELD_RESERVER9, val);
        return this;
    }

    /**
     * 获取「保留9」值
     *
    */
    @JsonIgnore
    public String getReserver9() {
        return (String) this._get(FIELD_RESERVER9);
    }

    /**
     * 判断 「保留9」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver9() {
        return this._contains(FIELD_RESERVER9);
    }

    /**
     * 重置 「保留9」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetReserver9() {
        this._reset(FIELD_RESERVER9);
        return this;
    }

    /**
     * 设置「启用标志」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setIsValid(Integer val) {
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
    public OrganizationDTO resetIsValid() {
        this._reset(FIELD_ISVALID);
        return this;
    }

    /**
     * 设置「支持Saas」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setSaaSMode(Integer val) {
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
    public OrganizationDTO resetSaaSMode() {
        this._reset(FIELD_SAASMODE);
        return this;
    }

    /**
     * 设置「」
     *
     * @param val
    */
    @JsonIgnore
    public OrganizationDTO setDepts(List<net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.DepartmentDTO> val) {
        this._set(FIELD_DEPTS, val);
        return this;
    }

    /**
     * 获取「」值
     *
    */
    @JsonIgnore
    public List<net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.DepartmentDTO> getDepts() {
        return (List<net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.DepartmentDTO>) this._get(FIELD_DEPTS);
    }

    /**
     * 判断 「」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDepts() {
        return this._contains(FIELD_DEPTS);
    }

    /**
     * 重置 「」
     *
    */
    @JsonIgnore
    public OrganizationDTO resetDepts() {
        this._reset(FIELD_DEPTS);
        return this;
    }


}
