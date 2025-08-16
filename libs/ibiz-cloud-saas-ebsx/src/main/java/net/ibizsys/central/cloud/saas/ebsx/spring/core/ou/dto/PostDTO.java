package net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 岗位
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/.ibizmodel.index
 */
public class PostDTO extends EntityDTO {

  /**.
   * 岗位标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/POSTID/.ibizmodel.index
   */
  public final static String FIELD_POSTID = "postid";

  /**.
   * 岗位编码
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/POSTCODE/.ibizmodel.index
   */
  public final static String FIELD_POSTCODE = "postcode";

  /**.
   * 岗位名称
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/POSTNAME/.ibizmodel.index
   */
  public final static String FIELD_POSTNAME = "postname";

  /**.
   * 区属
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/DOMAINS/.ibizmodel.index
   */
  public final static String FIELD_DOMAINS = "domains";

  /**.
   * 备注
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/MEMO/.ibizmodel.index
   */
  public final static String FIELD_MEMO = "memo";

  /**.
   * 保留
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER/.ibizmodel.index
   */
  public final static String FIELD_RESERVER = "reserver";

  /**.
   * 保留10
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER10/.ibizmodel.index
   */
  public final static String FIELD_RESERVER10 = "reserver10";

  /**.
   * 保留11
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER11/.ibizmodel.index
   */
  public final static String FIELD_RESERVER11 = "reserver11";

  /**.
   * 保留12
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER12/.ibizmodel.index
   */
  public final static String FIELD_RESERVER12 = "reserver12";

  /**.
   * 保留13
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER13/.ibizmodel.index
   */
  public final static String FIELD_RESERVER13 = "reserver13";

  /**.
   * 保留14
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER14/.ibizmodel.index
   */
  public final static String FIELD_RESERVER14 = "reserver14";

  /**.
   * 保留15
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER15/.ibizmodel.index
   */
  public final static String FIELD_RESERVER15 = "reserver15";

  /**.
   * 保留16
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER16/.ibizmodel.index
   */
  public final static String FIELD_RESERVER16 = "reserver16";

  /**.
   * 保留17
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER17/.ibizmodel.index
   */
  public final static String FIELD_RESERVER17 = "reserver17";

  /**.
   * 保留18
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER18/.ibizmodel.index
   */
  public final static String FIELD_RESERVER18 = "reserver18";

  /**.
   * 保留19
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER19/.ibizmodel.index
   */
  public final static String FIELD_RESERVER19 = "reserver19";

  /**.
   * 保留2
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER2/.ibizmodel.index
   */
  public final static String FIELD_RESERVER2 = "reserver2";

  /**.
   * 保留20
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER20/.ibizmodel.index
   */
  public final static String FIELD_RESERVER20 = "reserver20";

  /**.
   * 保留3
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER3/.ibizmodel.index
   */
  public final static String FIELD_RESERVER3 = "reserver3";

  /**.
   * 保留4
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER4/.ibizmodel.index
   */
  public final static String FIELD_RESERVER4 = "reserver4";

  /**.
   * 保留5
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER5/.ibizmodel.index
   */
  public final static String FIELD_RESERVER5 = "reserver5";

  /**.
   * 保留6
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER6/.ibizmodel.index
   */
  public final static String FIELD_RESERVER6 = "reserver6";

  /**.
   * 保留7
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER7/.ibizmodel.index
   */
  public final static String FIELD_RESERVER7 = "reserver7";

  /**.
   * 保留8
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER8/.ibizmodel.index
   */
  public final static String FIELD_RESERVER8 = "reserver8";

  /**.
   * 保留9
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/psdefields/RESERVER9/.ibizmodel.index
   */
  public final static String FIELD_RESERVER9 = "reserver9";


    /**
     * 设置「岗位标识」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setPostId(String val) {
        this._set(FIELD_POSTID, val);
        return this;
    }

    /**
     * 获取「岗位标识」值
     *
    */
    @JsonIgnore
    public String getPostId() {
        return (String) this._get(FIELD_POSTID);
    }

    /**
     * 判断 「岗位标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPostId() {
        return this._contains(FIELD_POSTID);
    }

    /**
     * 重置 「岗位标识」
     *
    */
    @JsonIgnore
    public PostDTO resetPostId() {
        this._reset(FIELD_POSTID);
        return this;
    }

    /**
     * 设置「岗位编码」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setPostCode(String val) {
        this._set(FIELD_POSTCODE, val);
        return this;
    }

    /**
     * 获取「岗位编码」值
     *
    */
    @JsonIgnore
    public String getPostCode() {
        return (String) this._get(FIELD_POSTCODE);
    }

    /**
     * 判断 「岗位编码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPostCode() {
        return this._contains(FIELD_POSTCODE);
    }

    /**
     * 重置 「岗位编码」
     *
    */
    @JsonIgnore
    public PostDTO resetPostCode() {
        this._reset(FIELD_POSTCODE);
        return this;
    }

    /**
     * 设置「岗位名称」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setPostName(String val) {
        this._set(FIELD_POSTNAME, val);
        return this;
    }

    /**
     * 获取「岗位名称」值
     *
    */
    @JsonIgnore
    public String getPostName() {
        return (String) this._get(FIELD_POSTNAME);
    }

    /**
     * 判断 「岗位名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPostName() {
        return this._contains(FIELD_POSTNAME);
    }

    /**
     * 重置 「岗位名称」
     *
    */
    @JsonIgnore
    public PostDTO resetPostName() {
        this._reset(FIELD_POSTNAME);
        return this;
    }

    /**
     * 设置「区属」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setDomains(String val) {
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
    public PostDTO resetDomains() {
        this._reset(FIELD_DOMAINS);
        return this;
    }

    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setMemo(String val) {
        this._set(FIELD_MEMO, val);
        return this;
    }

    /**
     * 获取「备注」值
     *
    */
    @JsonIgnore
    public String getMemo() {
        return (String) this._get(FIELD_MEMO);
    }

    /**
     * 判断 「备注」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMemo() {
        return this._contains(FIELD_MEMO);
    }

    /**
     * 重置 「备注」
     *
    */
    @JsonIgnore
    public PostDTO resetMemo() {
        this._reset(FIELD_MEMO);
        return this;
    }

    /**
     * 设置「保留」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver(String val) {
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
    public PostDTO resetReserver() {
        this._reset(FIELD_RESERVER);
        return this;
    }

    /**
     * 设置「保留10」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver10(String val) {
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
    public PostDTO resetReserver10() {
        this._reset(FIELD_RESERVER10);
        return this;
    }

    /**
     * 设置「保留11」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver11(Integer val) {
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
    public PostDTO resetReserver11() {
        this._reset(FIELD_RESERVER11);
        return this;
    }

    /**
     * 设置「保留12」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver12(Integer val) {
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
    public PostDTO resetReserver12() {
        this._reset(FIELD_RESERVER12);
        return this;
    }

    /**
     * 设置「保留13」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver13(Integer val) {
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
    public PostDTO resetReserver13() {
        this._reset(FIELD_RESERVER13);
        return this;
    }

    /**
     * 设置「保留14」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver14(Integer val) {
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
    public PostDTO resetReserver14() {
        this._reset(FIELD_RESERVER14);
        return this;
    }

    /**
     * 设置「保留15」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver15(BigDecimal val) {
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
    public PostDTO resetReserver15() {
        this._reset(FIELD_RESERVER15);
        return this;
    }

    /**
     * 设置「保留16」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver16(BigDecimal val) {
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
    public PostDTO resetReserver16() {
        this._reset(FIELD_RESERVER16);
        return this;
    }

    /**
     * 设置「保留17」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver17(BigDecimal val) {
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
    public PostDTO resetReserver17() {
        this._reset(FIELD_RESERVER17);
        return this;
    }

    /**
     * 设置「保留18」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver18(BigDecimal val) {
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
    public PostDTO resetReserver18() {
        this._reset(FIELD_RESERVER18);
        return this;
    }

    /**
     * 设置「保留19」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver19(Timestamp val) {
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
    public PostDTO resetReserver19() {
        this._reset(FIELD_RESERVER19);
        return this;
    }

    /**
     * 设置「保留2」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver2(String val) {
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
    public PostDTO resetReserver2() {
        this._reset(FIELD_RESERVER2);
        return this;
    }

    /**
     * 设置「保留20」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver20(Timestamp val) {
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
    public PostDTO resetReserver20() {
        this._reset(FIELD_RESERVER20);
        return this;
    }

    /**
     * 设置「保留3」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver3(String val) {
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
    public PostDTO resetReserver3() {
        this._reset(FIELD_RESERVER3);
        return this;
    }

    /**
     * 设置「保留4」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver4(String val) {
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
    public PostDTO resetReserver4() {
        this._reset(FIELD_RESERVER4);
        return this;
    }

    /**
     * 设置「保留5」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver5(String val) {
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
    public PostDTO resetReserver5() {
        this._reset(FIELD_RESERVER5);
        return this;
    }

    /**
     * 设置「保留6」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver6(String val) {
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
    public PostDTO resetReserver6() {
        this._reset(FIELD_RESERVER6);
        return this;
    }

    /**
     * 设置「保留7」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver7(String val) {
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
    public PostDTO resetReserver7() {
        this._reset(FIELD_RESERVER7);
        return this;
    }

    /**
     * 设置「保留8」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver8(String val) {
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
    public PostDTO resetReserver8() {
        this._reset(FIELD_RESERVER8);
        return this;
    }

    /**
     * 设置「保留9」
     *
     * @param val
    */
    @JsonIgnore
    public PostDTO setReserver9(String val) {
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
    public PostDTO resetReserver9() {
        this._reset(FIELD_RESERVER9);
        return this;
    }


}
