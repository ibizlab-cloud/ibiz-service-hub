package net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 系统公告
 * 
 * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/.ibizmodel.index
 */
public class BulletinDTO extends EntityDTO {

  /**.
   * 备注
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdefields/MEMO/.ibizmodel.index
   */
  public final static String FIELD_MEMO = "memo";

  /**.
   * 排序
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdefields/SHOWORDER/.ibizmodel.index
   */
  public final static String FIELD_SHOWORDER = "showorder";

  /**.
   * 附件
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdefields/ATTS/.ibizmodel.index
   */
  public final static String FIELD_ATTS = "atts";

  /**.
   * 用户标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdefields/AUTHORID/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/minorpsders/DER1N_SYS_BULLETIN_SYS_USER_AUTHORID/.ibizmodel.index
   */
  public final static String FIELD_AUTHORID = "authorid";

  /**.
   * 开始时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdefields/BEGINTIME/.ibizmodel.index
   */
  public final static String FIELD_BEGINTIME = "begintime";

  /**.
   * 公告内容
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdefields/CONTENT/.ibizmodel.index
   */
  public final static String FIELD_CONTENT = "content";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 结束时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdefields/ENDTIME/.ibizmodel.index
   */
  public final static String FIELD_ENDTIME = "endtime";

  /**.
   * 是否置顶
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdefields/ISTOP/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISTOP = "istop";

  /**.
   * 系统公告标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdefields/NOTICEID/.ibizmodel.index
   */
  public final static String FIELD_NOTICEID = "noticeid";

  /**.
   * 公告标题
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdefields/NOTICENAME/.ibizmodel.index
   */
  public final static String FIELD_NOTICENAME = "noticename";

  /**.
   * 单位标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdefields/ORGID/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/minorpsders/DER1N_SYS_BULLETIN_SYS_ORG_ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 名称
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdefields/ORGNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/minorpsders/DER1N_SYS_BULLETIN_SYS_ORG_ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGNAME = "orgname";

  /**.
   * 发布标记
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdefields/PUBFLAG/.ibizmodel.index
   */
  public final static String FIELD_PUBFLAG = "pubflag";

  /**.
   * 发布时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdefields/PUBLISHDATE/.ibizmodel.index
   */
  public final static String FIELD_PUBLISHDATE = "publishdate";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_BULLETIN/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public BulletinDTO setMemo(String val) {
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
    public BulletinDTO resetMemo() {
        this._reset(FIELD_MEMO);
        return this;
    }

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public BulletinDTO setShowOrder(Integer val) {
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
    public BulletinDTO resetShowOrder() {
        this._reset(FIELD_SHOWORDER);
        return this;
    }

    /**
     * 设置「附件」
     *
     * @param val
    */
    @JsonIgnore
    public BulletinDTO setAtts(String val) {
        this._set(FIELD_ATTS, val);
        return this;
    }

    /**
     * 获取「附件」值
     *
    */
    @JsonIgnore
    public String getAtts() {
        return (String) this._get(FIELD_ATTS);
    }

    /**
     * 判断 「附件」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAtts() {
        return this._contains(FIELD_ATTS);
    }

    /**
     * 重置 「附件」
     *
    */
    @JsonIgnore
    public BulletinDTO resetAtts() {
        this._reset(FIELD_ATTS);
        return this;
    }

    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public BulletinDTO setAuthorid(String val) {
        this._set(FIELD_AUTHORID, val);
        return this;
    }

    /**
     * 获取「用户标识」值
     *
    */
    @JsonIgnore
    public String getAuthorid() {
        return (String) this._get(FIELD_AUTHORID);
    }

    /**
     * 判断 「用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAuthorid() {
        return this._contains(FIELD_AUTHORID);
    }

    /**
     * 重置 「用户标识」
     *
    */
    @JsonIgnore
    public BulletinDTO resetAuthorid() {
        this._reset(FIELD_AUTHORID);
        return this;
    }

    /**
     * 设置「开始时间」
     *
     * @param val
    */
    @JsonIgnore
    public BulletinDTO setBeginTime(Timestamp val) {
        this._set(FIELD_BEGINTIME, val);
        return this;
    }

    /**
     * 获取「开始时间」值
     *
    */
    @JsonIgnore
    public Timestamp getBeginTime() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_BEGINTIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「开始时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsBeginTime() {
        return this._contains(FIELD_BEGINTIME);
    }

    /**
     * 重置 「开始时间」
     *
    */
    @JsonIgnore
    public BulletinDTO resetBeginTime() {
        this._reset(FIELD_BEGINTIME);
        return this;
    }

    /**
     * 设置「公告内容」
     *
     * @param val
    */
    @JsonIgnore
    public BulletinDTO setContent(String val) {
        this._set(FIELD_CONTENT, val);
        return this;
    }

    /**
     * 获取「公告内容」值
     *
    */
    @JsonIgnore
    public String getContent() {
        return (String) this._get(FIELD_CONTENT);
    }

    /**
     * 判断 「公告内容」是否有值
     *
    */
    @JsonIgnore
    public boolean containsContent() {
        return this._contains(FIELD_CONTENT);
    }

    /**
     * 重置 「公告内容」
     *
    */
    @JsonIgnore
    public BulletinDTO resetContent() {
        this._reset(FIELD_CONTENT);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public BulletinDTO setCreateDate(Timestamp val) {
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
    public BulletinDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public BulletinDTO setCreateMan(String val) {
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
    public BulletinDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「结束时间」
     *
     * @param val
    */
    @JsonIgnore
    public BulletinDTO setEndTime(Timestamp val) {
        this._set(FIELD_ENDTIME, val);
        return this;
    }

    /**
     * 获取「结束时间」值
     *
    */
    @JsonIgnore
    public Timestamp getEndTime() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_ENDTIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「结束时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEndTime() {
        return this._contains(FIELD_ENDTIME);
    }

    /**
     * 重置 「结束时间」
     *
    */
    @JsonIgnore
    public BulletinDTO resetEndTime() {
        this._reset(FIELD_ENDTIME);
        return this;
    }

    /**
     * 设置「是否置顶」
     *
     * @param val
    */
    @JsonIgnore
    public BulletinDTO setIsTop(Integer val) {
        this._set(FIELD_ISTOP, val);
        return this;
    }

    /**
     * 获取「是否置顶」值
     *
    */
    @JsonIgnore
    public Integer getIsTop() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ISTOP),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「是否置顶」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIsTop() {
        return this._contains(FIELD_ISTOP);
    }

    /**
     * 重置 「是否置顶」
     *
    */
    @JsonIgnore
    public BulletinDTO resetIsTop() {
        this._reset(FIELD_ISTOP);
        return this;
    }

    /**
     * 设置「系统公告标识」
     *
     * @param val
    */
    @JsonIgnore
    public BulletinDTO setNoticeId(String val) {
        this._set(FIELD_NOTICEID, val);
        return this;
    }

    /**
     * 获取「系统公告标识」值
     *
    */
    @JsonIgnore
    public String getNoticeId() {
        return (String) this._get(FIELD_NOTICEID);
    }

    /**
     * 判断 「系统公告标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsNoticeId() {
        return this._contains(FIELD_NOTICEID);
    }

    /**
     * 重置 「系统公告标识」
     *
    */
    @JsonIgnore
    public BulletinDTO resetNoticeId() {
        this._reset(FIELD_NOTICEID);
        return this;
    }

    /**
     * 设置「公告标题」
     *
     * @param val
    */
    @JsonIgnore
    public BulletinDTO setNoticeName(String val) {
        this._set(FIELD_NOTICENAME, val);
        return this;
    }

    /**
     * 获取「公告标题」值
     *
    */
    @JsonIgnore
    public String getNoticeName() {
        return (String) this._get(FIELD_NOTICENAME);
    }

    /**
     * 判断 「公告标题」是否有值
     *
    */
    @JsonIgnore
    public boolean containsNoticeName() {
        return this._contains(FIELD_NOTICENAME);
    }

    /**
     * 重置 「公告标题」
     *
    */
    @JsonIgnore
    public BulletinDTO resetNoticeName() {
        this._reset(FIELD_NOTICENAME);
        return this;
    }

    /**
     * 设置「单位标识」
     *
     * @param val
    */
    @JsonIgnore
    public BulletinDTO setOrgId(String val) {
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
    public BulletinDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public BulletinDTO setOrgName(String val) {
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
    public BulletinDTO resetOrgName() {
        this._reset(FIELD_ORGNAME);
        return this;
    }

    /**
     * 设置「发布标记」
     *
     * @param val
    */
    @JsonIgnore
    public BulletinDTO setPubFlag(Integer val) {
        this._set(FIELD_PUBFLAG, val);
        return this;
    }

    /**
     * 获取「发布标记」值
     *
    */
    @JsonIgnore
    public Integer getPubFlag() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_PUBFLAG),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「发布标记」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPubFlag() {
        return this._contains(FIELD_PUBFLAG);
    }

    /**
     * 重置 「发布标记」
     *
    */
    @JsonIgnore
    public BulletinDTO resetPubFlag() {
        this._reset(FIELD_PUBFLAG);
        return this;
    }

    /**
     * 设置「发布时间」
     *
     * @param val
    */
    @JsonIgnore
    public BulletinDTO setPublishDate(Timestamp val) {
        this._set(FIELD_PUBLISHDATE, val);
        return this;
    }

    /**
     * 获取「发布时间」值
     *
    */
    @JsonIgnore
    public Timestamp getPublishDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_PUBLISHDATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「发布时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPublishDate() {
        return this._contains(FIELD_PUBLISHDATE);
    }

    /**
     * 重置 「发布时间」
     *
    */
    @JsonIgnore
    public BulletinDTO resetPublishDate() {
        this._reset(FIELD_PUBLISHDATE);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public BulletinDTO setUpdateDate(Timestamp val) {
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
    public BulletinDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public BulletinDTO setUpdateMan(String val) {
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
    public BulletinDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
