package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 员工绑定
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMPBIND/.ibizmodel.index
 */
public class EmpBind extends EntityBase {

  /**.
   * 用户标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMPBIND/psdefields/USERID/.ibizmodel.index
   */
  public final static String FIELD_USERID = "userid";

  /**.
   * 姓名
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMPBIND/psdefields/PERSONNAME/.ibizmodel.index
   */
  public final static String FIELD_PERSONNAME = "personname";

  /**.
   * 钉钉用户标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMPBIND/psdefields/DDUNIONID/.ibizmodel.index
   */
  public final static String FIELD_DDUNIONID = "ddunionid";

  /**.
   * 钉钉用户标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMPBIND/psdefields/DDUSERID/.ibizmodel.index
   */
  public final static String FIELD_DDUSERID = "dduserid";

  /**.
   * UAA用户标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMPBIND/psdefields/UAAUSERID/.ibizmodel.index
   */
  public final static String FIELD_UAAUSERID = "uaauserid";

  /**.
   * 微信用户标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMPBIND/psdefields/WXWORKUNIONID/.ibizmodel.index
   */
  public final static String FIELD_WXWORKUNIONID = "wxworkunionid";

  /**.
   * 企业微信用户标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMPBIND/psdefields/WXWORKUSERID/.ibizmodel.index
   */
  public final static String FIELD_WXWORKUSERID = "wxworkuserid";


    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public EmpBind setUserId(String val) {
        this.set(FIELD_USERID, val);
        return this;
    }

    /**
     * 获取「用户标识」值
     *
    */
    @JsonIgnore
    public String getUserId() {
        return (String) this.get(FIELD_USERID);
    }

    /**
     * 判断 「用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserId() {
        return this.contains(FIELD_USERID);
    }

    /**
     * 重置 「用户标识」
     *
    */
    @JsonIgnore
    public EmpBind resetUserId() {
        this.reset(FIELD_USERID);
        return this;
    }

    /**
     * 设置「姓名」
     *
     * @param val
    */
    @JsonIgnore
    public EmpBind setPersonName(String val) {
        this.set(FIELD_PERSONNAME, val);
        return this;
    }

    /**
     * 获取「姓名」值
     *
    */
    @JsonIgnore
    public String getPersonName() {
        return (String) this.get(FIELD_PERSONNAME);
    }

    /**
     * 判断 「姓名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPersonName() {
        return this.contains(FIELD_PERSONNAME);
    }

    /**
     * 重置 「姓名」
     *
    */
    @JsonIgnore
    public EmpBind resetPersonName() {
        this.reset(FIELD_PERSONNAME);
        return this;
    }

    /**
     * 设置「钉钉用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public EmpBind setDDUnionId(String val) {
        this.set(FIELD_DDUNIONID, val);
        return this;
    }

    /**
     * 获取「钉钉用户标识」值
     *
    */
    @JsonIgnore
    public String getDDUnionId() {
        return (String) this.get(FIELD_DDUNIONID);
    }

    /**
     * 判断 「钉钉用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDDUnionId() {
        return this.contains(FIELD_DDUNIONID);
    }

    /**
     * 重置 「钉钉用户标识」
     *
    */
    @JsonIgnore
    public EmpBind resetDDUnionId() {
        this.reset(FIELD_DDUNIONID);
        return this;
    }

    /**
     * 设置「钉钉用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public EmpBind setDDUserId(String val) {
        this.set(FIELD_DDUSERID, val);
        return this;
    }

    /**
     * 获取「钉钉用户标识」值
     *
    */
    @JsonIgnore
    public String getDDUserId() {
        return (String) this.get(FIELD_DDUSERID);
    }

    /**
     * 判断 「钉钉用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDDUserId() {
        return this.contains(FIELD_DDUSERID);
    }

    /**
     * 重置 「钉钉用户标识」
     *
    */
    @JsonIgnore
    public EmpBind resetDDUserId() {
        this.reset(FIELD_DDUSERID);
        return this;
    }

    /**
     * 设置「UAA用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public EmpBind setUAAUserId(String val) {
        this.set(FIELD_UAAUSERID, val);
        return this;
    }

    /**
     * 获取「UAA用户标识」值
     *
    */
    @JsonIgnore
    public String getUAAUserId() {
        return (String) this.get(FIELD_UAAUSERID);
    }

    /**
     * 判断 「UAA用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUAAUserId() {
        return this.contains(FIELD_UAAUSERID);
    }

    /**
     * 重置 「UAA用户标识」
     *
    */
    @JsonIgnore
    public EmpBind resetUAAUserId() {
        this.reset(FIELD_UAAUSERID);
        return this;
    }

    /**
     * 设置「微信用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public EmpBind setWXWorkUnionId(String val) {
        this.set(FIELD_WXWORKUNIONID, val);
        return this;
    }

    /**
     * 获取「微信用户标识」值
     *
    */
    @JsonIgnore
    public String getWXWorkUnionId() {
        return (String) this.get(FIELD_WXWORKUNIONID);
    }

    /**
     * 判断 「微信用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsWXWorkUnionId() {
        return this.contains(FIELD_WXWORKUNIONID);
    }

    /**
     * 重置 「微信用户标识」
     *
    */
    @JsonIgnore
    public EmpBind resetWXWorkUnionId() {
        this.reset(FIELD_WXWORKUNIONID);
        return this;
    }

    /**
     * 设置「企业微信用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public EmpBind setWXWorkUserId(String val) {
        this.set(FIELD_WXWORKUSERID, val);
        return this;
    }

    /**
     * 获取「企业微信用户标识」值
     *
    */
    @JsonIgnore
    public String getWXWorkUserId() {
        return (String) this.get(FIELD_WXWORKUSERID);
    }

    /**
     * 判断 「企业微信用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsWXWorkUserId() {
        return this.contains(FIELD_WXWORKUSERID);
    }

    /**
     * 重置 「企业微信用户标识」
     *
    */
    @JsonIgnore
    public EmpBind resetWXWorkUserId() {
        this.reset(FIELD_WXWORKUSERID);
        return this;
    }


}
