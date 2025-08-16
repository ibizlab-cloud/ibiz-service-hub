package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 开放平台用户
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/.ibizmodel.index
 */
public class OpenUserDTO extends EntityDTO {

  /**.
   * AccessKey
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/ACCESS_KEY/.ibizmodel.index
   */
  public final static String FIELD_ACCESSKEY = "accesskey";

  /**.
   * SecretKey
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/SECRET_KEY/.ibizmodel.index
   */
  public final static String FIELD_SECRETKEY = "secretkey";

  /**.
   * 开放平台应用
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/ACCESSID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/minorpsders/DER1N_SYS_OPEN_USER_SYS_OPEN_ACCESS_ACCESSID/.ibizmodel.index
   */
  public final static String FIELD_ACCESSID = "accessid";

  /**.
   * 开放平台应用
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/ACCESSNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/minorpsders/DER1N_SYS_OPEN_USER_SYS_OPEN_ACCESS_ACCESSID/.ibizmodel.index
   */
  public final static String FIELD_ACCESSNAME = "accessname";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 所属部门信息
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/DEPTS/.ibizmodel.index
   */
  public final static String FIELD_DEPTS = "depts";

  /**.
   * 绑定状态
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/ISBINDING/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISBINDING = "isbinding";

  /**.
   * 手机号
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/MOBILE/.ibizmodel.index
   */
  public final static String FIELD_MOBILE = "mobile";

  /**.
   * 开放平台类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.OpenAccessType} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/OPEN_TYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/pscodelists/OpenAccessType.ibizmodel.yaml
   */
  public final static String FIELD_OPENTYPE = "opentype";

  /**.
   * 用户代码
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/OPENUSERCODE/.ibizmodel.index
   */
  public final static String FIELD_OPENUSERCODE = "openusercode";

  /**.
   * 开放用户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/OPENUSERID/.ibizmodel.index
   */
  public final static String FIELD_OPENUSERID = "openuserid";

  /**.
   * 用户名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/OPENUSERNAME/.ibizmodel.index
   */
  public final static String FIELD_OPENUSERNAME = "openusername";

  /**.
   * 单位标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/ORGID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/minorpsders/DER1N_SYS_OPEN_USER_SYS_OPEN_ACCESS_ACCESSID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 实际用户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/REALID/.ibizmodel.index
   */
  public final static String FIELD_REALID = "realid";

  /**.
   * 系统用户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/SYSUSERID/.ibizmodel.index
   */
  public final static String FIELD_SYSUSERID = "sysuserid";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";

  /**.
   * 用户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/USERID/.ibizmodel.index
   */
  public final static String FIELD_USERID = "userid";


    /**
     * 设置「AccessKey」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setAccessKey(String val) {
        this._set(FIELD_ACCESSKEY, val);
        return this;
    }

    /**
     * 获取「AccessKey」值
     *
    */
    @JsonIgnore
    public String getAccessKey() {
        return (String) this._get(FIELD_ACCESSKEY);
    }

    /**
     * 判断 「AccessKey」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAccessKey() {
        return this._contains(FIELD_ACCESSKEY);
    }

    /**
     * 重置 「AccessKey」
     *
    */
    @JsonIgnore
    public OpenUserDTO resetAccessKey() {
        this._reset(FIELD_ACCESSKEY);
        return this;
    }

    /**
     * 设置「SecretKey」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setSecretKey(String val) {
        this._set(FIELD_SECRETKEY, val);
        return this;
    }

    /**
     * 获取「SecretKey」值
     *
    */
    @JsonIgnore
    public String getSecretKey() {
        return (String) this._get(FIELD_SECRETKEY);
    }

    /**
     * 判断 「SecretKey」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSecretKey() {
        return this._contains(FIELD_SECRETKEY);
    }

    /**
     * 重置 「SecretKey」
     *
    */
    @JsonIgnore
    public OpenUserDTO resetSecretKey() {
        this._reset(FIELD_SECRETKEY);
        return this;
    }

    /**
     * 设置「开放平台应用」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setAccessId(String val) {
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
    public OpenUserDTO resetAccessId() {
        this._reset(FIELD_ACCESSID);
        return this;
    }

    /**
     * 设置「开放平台应用」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setAccessName(String val) {
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
    public OpenUserDTO resetAccessName() {
        this._reset(FIELD_ACCESSNAME);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「建立时间」值
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
     * 判断 「建立时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「建立时间」
     *
    */
    @JsonIgnore
    public OpenUserDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setCreateMan(String val) {
        this._set(FIELD_CREATEMAN, val);
        return this;
    }

    /**
     * 获取「建立人」值
     *
    */
    @JsonIgnore
    public String getCreateMan() {
        return (String) this._get(FIELD_CREATEMAN);
    }

    /**
     * 判断 「建立人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateMan() {
        return this._contains(FIELD_CREATEMAN);
    }

    /**
     * 重置 「建立人」
     *
    */
    @JsonIgnore
    public OpenUserDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「所属部门信息」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setDepts(String val) {
        this._set(FIELD_DEPTS, val);
        return this;
    }

    /**
     * 获取「所属部门信息」值
     *
    */
    @JsonIgnore
    public String getDepts() {
        return (String) this._get(FIELD_DEPTS);
    }

    /**
     * 判断 「所属部门信息」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDepts() {
        return this._contains(FIELD_DEPTS);
    }

    /**
     * 重置 「所属部门信息」
     *
    */
    @JsonIgnore
    public OpenUserDTO resetDepts() {
        this._reset(FIELD_DEPTS);
        return this;
    }

    /**
     * 设置「绑定状态」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setIsBinding(Integer val) {
        this._set(FIELD_ISBINDING, val);
        return this;
    }

    /**
     * 获取「绑定状态」值
     *
    */
    @JsonIgnore
    public Integer getIsBinding() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ISBINDING),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「绑定状态」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIsBinding() {
        return this._contains(FIELD_ISBINDING);
    }

    /**
     * 重置 「绑定状态」
     *
    */
    @JsonIgnore
    public OpenUserDTO resetIsBinding() {
        this._reset(FIELD_ISBINDING);
        return this;
    }

    /**
     * 设置「手机号」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setMobile(String val) {
        this._set(FIELD_MOBILE, val);
        return this;
    }

    /**
     * 获取「手机号」值
     *
    */
    @JsonIgnore
    public String getMobile() {
        return (String) this._get(FIELD_MOBILE);
    }

    /**
     * 判断 「手机号」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMobile() {
        return this._contains(FIELD_MOBILE);
    }

    /**
     * 重置 「手机号」
     *
    */
    @JsonIgnore
    public OpenUserDTO resetMobile() {
        this._reset(FIELD_MOBILE);
        return this;
    }

    /**
     * 设置「开放平台类型」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setOpenType(String val) {
        this._set(FIELD_OPENTYPE, val);
        return this;
    }

    /**
     * 获取「开放平台类型」值
     *
    */
    @JsonIgnore
    public String getOpenType() {
        return (String) this._get(FIELD_OPENTYPE);
    }

    /**
     * 判断 「开放平台类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOpenType() {
        return this._contains(FIELD_OPENTYPE);
    }

    /**
     * 重置 「开放平台类型」
     *
    */
    @JsonIgnore
    public OpenUserDTO resetOpenType() {
        this._reset(FIELD_OPENTYPE);
        return this;
    }

    /**
     * 设置「用户代码」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setOpenUserCode(String val) {
        this._set(FIELD_OPENUSERCODE, val);
        return this;
    }

    /**
     * 获取「用户代码」值
     *
    */
    @JsonIgnore
    public String getOpenUserCode() {
        return (String) this._get(FIELD_OPENUSERCODE);
    }

    /**
     * 判断 「用户代码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOpenUserCode() {
        return this._contains(FIELD_OPENUSERCODE);
    }

    /**
     * 重置 「用户代码」
     *
    */
    @JsonIgnore
    public OpenUserDTO resetOpenUserCode() {
        this._reset(FIELD_OPENUSERCODE);
        return this;
    }

    /**
     * 设置「开放用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setOpenUserId(String val) {
        this._set(FIELD_OPENUSERID, val);
        return this;
    }

    /**
     * 获取「开放用户标识」值
     *
    */
    @JsonIgnore
    public String getOpenUserId() {
        return (String) this._get(FIELD_OPENUSERID);
    }

    /**
     * 判断 「开放用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOpenUserId() {
        return this._contains(FIELD_OPENUSERID);
    }

    /**
     * 重置 「开放用户标识」
     *
    */
    @JsonIgnore
    public OpenUserDTO resetOpenUserId() {
        this._reset(FIELD_OPENUSERID);
        return this;
    }

    /**
     * 设置「用户名称」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setOpenUserName(String val) {
        this._set(FIELD_OPENUSERNAME, val);
        return this;
    }

    /**
     * 获取「用户名称」值
     *
    */
    @JsonIgnore
    public String getOpenUserName() {
        return (String) this._get(FIELD_OPENUSERNAME);
    }

    /**
     * 判断 「用户名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOpenUserName() {
        return this._contains(FIELD_OPENUSERNAME);
    }

    /**
     * 重置 「用户名称」
     *
    */
    @JsonIgnore
    public OpenUserDTO resetOpenUserName() {
        this._reset(FIELD_OPENUSERNAME);
        return this;
    }

    /**
     * 设置「单位标识」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setOrgId(String val) {
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
    public OpenUserDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「实际用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setRealId(String val) {
        this._set(FIELD_REALID, val);
        return this;
    }

    /**
     * 获取「实际用户标识」值
     *
    */
    @JsonIgnore
    public String getRealId() {
        return (String) this._get(FIELD_REALID);
    }

    /**
     * 判断 「实际用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRealId() {
        return this._contains(FIELD_REALID);
    }

    /**
     * 重置 「实际用户标识」
     *
    */
    @JsonIgnore
    public OpenUserDTO resetRealId() {
        this._reset(FIELD_REALID);
        return this;
    }

    /**
     * 设置「系统用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setSysUserId(String val) {
        this._set(FIELD_SYSUSERID, val);
        return this;
    }

    /**
     * 获取「系统用户标识」值
     *
    */
    @JsonIgnore
    public String getSysUserId() {
        return (String) this._get(FIELD_SYSUSERID);
    }

    /**
     * 判断 「系统用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysUserId() {
        return this._contains(FIELD_SYSUSERID);
    }

    /**
     * 重置 「系统用户标识」
     *
    */
    @JsonIgnore
    public OpenUserDTO resetSysUserId() {
        this._reset(FIELD_SYSUSERID);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setUpdateDate(Timestamp val) {
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
    public OpenUserDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setUpdateMan(String val) {
        this._set(FIELD_UPDATEMAN, val);
        return this;
    }

    /**
     * 获取「更新人」值
     *
    */
    @JsonIgnore
    public String getUpdateMan() {
        return (String) this._get(FIELD_UPDATEMAN);
    }

    /**
     * 判断 「更新人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateMan() {
        return this._contains(FIELD_UPDATEMAN);
    }

    /**
     * 重置 「更新人」
     *
    */
    @JsonIgnore
    public OpenUserDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }

    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public OpenUserDTO setUserId(String val) {
        this._set(FIELD_USERID, val);
        return this;
    }

    /**
     * 获取「用户标识」值
     *
    */
    @JsonIgnore
    public String getUserId() {
        return (String) this._get(FIELD_USERID);
    }

    /**
     * 判断 「用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserId() {
        return this._contains(FIELD_USERID);
    }

    /**
     * 重置 「用户标识」
     *
    */
    @JsonIgnore
    public OpenUserDTO resetUserId() {
        this._reset(FIELD_USERID);
        return this;
    }


}
