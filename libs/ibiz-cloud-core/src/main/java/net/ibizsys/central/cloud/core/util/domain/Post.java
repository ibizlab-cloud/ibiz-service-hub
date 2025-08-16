package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 岗位
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/SYS_POST/.ibizmodel.index
 */
public class Post extends EntityBase {

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


    /**
     * 设置「岗位标识」
     *
     * @param val
    */
    @JsonIgnore
    public Post setPostId(String val) {
        this.set(FIELD_POSTID, val);
        return this;
    }

    /**
     * 获取「岗位标识」值
     *
    */
    @JsonIgnore
    public String getPostId() {
        return (String) this.get(FIELD_POSTID);
    }

    /**
     * 判断 「岗位标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPostId() {
        return this.contains(FIELD_POSTID);
    }

    /**
     * 重置 「岗位标识」
     *
    */
    @JsonIgnore
    public Post resetPostId() {
        this.reset(FIELD_POSTID);
        return this;
    }

    /**
     * 设置「岗位编码」
     *
     * @param val
    */
    @JsonIgnore
    public Post setPostCode(String val) {
        this.set(FIELD_POSTCODE, val);
        return this;
    }

    /**
     * 获取「岗位编码」值
     *
    */
    @JsonIgnore
    public String getPostCode() {
        return (String) this.get(FIELD_POSTCODE);
    }

    /**
     * 判断 「岗位编码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPostCode() {
        return this.contains(FIELD_POSTCODE);
    }

    /**
     * 重置 「岗位编码」
     *
    */
    @JsonIgnore
    public Post resetPostCode() {
        this.reset(FIELD_POSTCODE);
        return this;
    }

    /**
     * 设置「岗位名称」
     *
     * @param val
    */
    @JsonIgnore
    public Post setPostName(String val) {
        this.set(FIELD_POSTNAME, val);
        return this;
    }

    /**
     * 获取「岗位名称」值
     *
    */
    @JsonIgnore
    public String getPostName() {
        return (String) this.get(FIELD_POSTNAME);
    }

    /**
     * 判断 「岗位名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPostName() {
        return this.contains(FIELD_POSTNAME);
    }

    /**
     * 重置 「岗位名称」
     *
    */
    @JsonIgnore
    public Post resetPostName() {
        this.reset(FIELD_POSTNAME);
        return this;
    }

    /**
     * 设置「区属」
     *
     * @param val
    */
    @JsonIgnore
    public Post setDomains(String val) {
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
    public Post resetDomains() {
        this.reset(FIELD_DOMAINS);
        return this;
    }

    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public Post setMemo(String val) {
        this.set(FIELD_MEMO, val);
        return this;
    }

    /**
     * 获取「备注」值
     *
    */
    @JsonIgnore
    public String getMemo() {
        return (String) this.get(FIELD_MEMO);
    }

    /**
     * 判断 「备注」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMemo() {
        return this.contains(FIELD_MEMO);
    }

    /**
     * 重置 「备注」
     *
    */
    @JsonIgnore
    public Post resetMemo() {
        this.reset(FIELD_MEMO);
        return this;
    }


}
