package net.ibizsys.central.cloud.saas.ebsx.spring.core.portal.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 门户备注
 * 
 * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/.ibizmodel.index
 */
public class PTNotesDTO extends EntityDTO {

  /**.
   * 备注
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdefields/MEMO/.ibizmodel.index
   */
  public final static String FIELD_MEMO = "memo";

  /**.
   * 开始时间
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdefields/BEGINTIME/.ibizmodel.index
   */
  public final static String FIELD_BEGINTIME = "begintime";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 结束时间
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdefields/ENDTIME/.ibizmodel.index
   */
  public final static String FIELD_ENDTIME = "endtime";

  /**.
   * 备忘录标识
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdefields/NOTESID/.ibizmodel.index
   */
  public final static String FIELD_NOTESID = "notesid";

  /**.
   * 标题
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdefields/NOTESNAME/.ibizmodel.index
   */
  public final static String FIELD_NOTESNAME = "notesname";

  /**.
   * 单位标识
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdefields/ORGID/.ibizmodel.index
   * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/minorpsders/DER1N_PT_NOTES_SYS_DC_ORG_ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 租户
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdefields/SRFDCID/.ibizmodel.index
   */
  public final static String FIELD_SRFDCID = "srfdcid";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";

  /**.
   * 用户标识
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_NOTES/psdefields/USERID/.ibizmodel.index
   */
  public final static String FIELD_USERID = "userid";


    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public PTNotesDTO setMemo(String val) {
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
    public PTNotesDTO resetMemo() {
        this._reset(FIELD_MEMO);
        return this;
    }

    /**
     * 设置「开始时间」
     *
     * @param val
    */
    @JsonIgnore
    public PTNotesDTO setBeginTime(Timestamp val) {
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
    public PTNotesDTO resetBeginTime() {
        this._reset(FIELD_BEGINTIME);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public PTNotesDTO setCreateDate(Timestamp val) {
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
    public PTNotesDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public PTNotesDTO setCreateMan(String val) {
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
    public PTNotesDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「结束时间」
     *
     * @param val
    */
    @JsonIgnore
    public PTNotesDTO setEndTime(Timestamp val) {
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
    public PTNotesDTO resetEndTime() {
        this._reset(FIELD_ENDTIME);
        return this;
    }

    /**
     * 设置「备忘录标识」
     *
     * @param val
    */
    @JsonIgnore
    public PTNotesDTO setNotesId(String val) {
        this._set(FIELD_NOTESID, val);
        return this;
    }

    /**
     * 获取「备忘录标识」值
     *
    */
    @JsonIgnore
    public String getNotesId() {
        return (String) this._get(FIELD_NOTESID);
    }

    /**
     * 判断 「备忘录标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsNotesId() {
        return this._contains(FIELD_NOTESID);
    }

    /**
     * 重置 「备忘录标识」
     *
    */
    @JsonIgnore
    public PTNotesDTO resetNotesId() {
        this._reset(FIELD_NOTESID);
        return this;
    }

    /**
     * 设置「标题」
     *
     * @param val
    */
    @JsonIgnore
    public PTNotesDTO setNotesName(String val) {
        this._set(FIELD_NOTESNAME, val);
        return this;
    }

    /**
     * 获取「标题」值
     *
    */
    @JsonIgnore
    public String getNotesName() {
        return (String) this._get(FIELD_NOTESNAME);
    }

    /**
     * 判断 「标题」是否有值
     *
    */
    @JsonIgnore
    public boolean containsNotesName() {
        return this._contains(FIELD_NOTESNAME);
    }

    /**
     * 重置 「标题」
     *
    */
    @JsonIgnore
    public PTNotesDTO resetNotesName() {
        this._reset(FIELD_NOTESNAME);
        return this;
    }

    /**
     * 设置「单位标识」
     *
     * @param val
    */
    @JsonIgnore
    public PTNotesDTO setOrgId(String val) {
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
    public PTNotesDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「租户」
     *
     * @param val
    */
    @JsonIgnore
    public PTNotesDTO setSrfdcid(String val) {
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
    public PTNotesDTO resetSrfdcid() {
        this._reset(FIELD_SRFDCID);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public PTNotesDTO setUpdateDate(Timestamp val) {
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
    public PTNotesDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public PTNotesDTO setUpdateMan(String val) {
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
    public PTNotesDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }

    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public PTNotesDTO setUserId(String val) {
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
    public PTNotesDTO resetUserId() {
        this._reset(FIELD_USERID);
        return this;
    }


}
