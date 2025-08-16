package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 应用
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/DST_APP/.ibizmodel.index
 */
public class DstAppDTO extends EntityDTO {

  /**.
   * 应用标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_APP/psdefields/APPID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 应用名
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_APP/psdefields/APPNAME/.ibizmodel.index
   */
  public final static String FIELD_LABEL = "label";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_APP/psdefields/PSSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_APP/minorpsders/DER1N_DST_APP_DST_SYSTEM_PSSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 全称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_APP/psdefields/FULLNAME/.ibizmodel.index
   */
  public final static String FIELD_FULLNAME = "fullname";

  /**.
   * 类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.AppType} 
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_APP/psdefields/APPTYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/AppType.ibizmodel.yaml
   */
  public final static String FIELD_TYPE = "type";

  /**.
   * 分组
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_APP/psdefields/APPGROUP/.ibizmodel.index
   */
  public final static String FIELD_GROUP = "group";

  /**.
   * 图标
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_APP/psdefields/ICON/.ibizmodel.index
   */
  public final static String FIELD_ICON = "icon";

  /**.
   * 可见
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_APP/psdefields/VISABLED/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_VISABLED = "visabled";

  /**.
   * 地址
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_APP/psdefields/ADDR/.ibizmodel.index
   */
  public final static String FIELD_ADDR = "addr";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_APP/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_APP/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_APP/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_APP/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「应用标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstAppDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「应用标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this._get(FIELD_ID);
    }

    /**
     * 判断 「应用标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「应用标识」
     *
    */
    @JsonIgnore
    public DstAppDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「应用名」
     *
     * @param val
    */
    @JsonIgnore
    public DstAppDTO setLabel(String val) {
        this._set(FIELD_LABEL, val);
        return this;
    }

    /**
     * 获取「应用名」值
     *
    */
    @JsonIgnore
    public String getLabel() {
        return (String) this._get(FIELD_LABEL);
    }

    /**
     * 判断 「应用名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLabel() {
        return this._contains(FIELD_LABEL);
    }

    /**
     * 重置 「应用名」
     *
    */
    @JsonIgnore
    public DstAppDTO resetLabel() {
        this._reset(FIELD_LABEL);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstAppDTO setSystemId(String val) {
        this._set(FIELD_SYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统标识」值
     *
    */
    @JsonIgnore
    public String getSystemId() {
        return (String) this._get(FIELD_SYSTEMID);
    }

    /**
     * 判断 「系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSystemId() {
        return this._contains(FIELD_SYSTEMID);
    }

    /**
     * 重置 「系统标识」
     *
    */
    @JsonIgnore
    public DstAppDTO resetSystemId() {
        this._reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「全称」
     *
     * @param val
    */
    @JsonIgnore
    public DstAppDTO setFullName(String val) {
        this._set(FIELD_FULLNAME, val);
        return this;
    }

    /**
     * 获取「全称」值
     *
    */
    @JsonIgnore
    public String getFullName() {
        return (String) this._get(FIELD_FULLNAME);
    }

    /**
     * 判断 「全称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFullName() {
        return this._contains(FIELD_FULLNAME);
    }

    /**
     * 重置 「全称」
     *
    */
    @JsonIgnore
    public DstAppDTO resetFullName() {
        this._reset(FIELD_FULLNAME);
        return this;
    }

    /**
     * 设置「类型」
     *
     * @param val
    */
    @JsonIgnore
    public DstAppDTO setType(String val) {
        this._set(FIELD_TYPE, val);
        return this;
    }

    /**
     * 获取「类型」值
     *
    */
    @JsonIgnore
    public String getType() {
        return (String) this._get(FIELD_TYPE);
    }

    /**
     * 判断 「类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsType() {
        return this._contains(FIELD_TYPE);
    }

    /**
     * 重置 「类型」
     *
    */
    @JsonIgnore
    public DstAppDTO resetType() {
        this._reset(FIELD_TYPE);
        return this;
    }

    /**
     * 设置「分组」
     *
     * @param val
    */
    @JsonIgnore
    public DstAppDTO setGroup(String val) {
        this._set(FIELD_GROUP, val);
        return this;
    }

    /**
     * 获取「分组」值
     *
    */
    @JsonIgnore
    public String getGroup() {
        return (String) this._get(FIELD_GROUP);
    }

    /**
     * 判断 「分组」是否有值
     *
    */
    @JsonIgnore
    public boolean containsGroup() {
        return this._contains(FIELD_GROUP);
    }

    /**
     * 重置 「分组」
     *
    */
    @JsonIgnore
    public DstAppDTO resetGroup() {
        this._reset(FIELD_GROUP);
        return this;
    }

    /**
     * 设置「图标」
     *
     * @param val
    */
    @JsonIgnore
    public DstAppDTO setIcon(String val) {
        this._set(FIELD_ICON, val);
        return this;
    }

    /**
     * 获取「图标」值
     *
    */
    @JsonIgnore
    public String getIcon() {
        return (String) this._get(FIELD_ICON);
    }

    /**
     * 判断 「图标」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIcon() {
        return this._contains(FIELD_ICON);
    }

    /**
     * 重置 「图标」
     *
    */
    @JsonIgnore
    public DstAppDTO resetIcon() {
        this._reset(FIELD_ICON);
        return this;
    }

    /**
     * 设置「可见」
     *
     * @param val
    */
    @JsonIgnore
    public DstAppDTO setVisabled(Integer val) {
        this._set(FIELD_VISABLED, val);
        return this;
    }

    /**
     * 获取「可见」值
     *
    */
    @JsonIgnore
    public Integer getVisabled() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_VISABLED),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「可见」是否有值
     *
    */
    @JsonIgnore
    public boolean containsVisabled() {
        return this._contains(FIELD_VISABLED);
    }

    /**
     * 重置 「可见」
     *
    */
    @JsonIgnore
    public DstAppDTO resetVisabled() {
        this._reset(FIELD_VISABLED);
        return this;
    }

    /**
     * 设置「地址」
     *
     * @param val
    */
    @JsonIgnore
    public DstAppDTO setAddr(String val) {
        this._set(FIELD_ADDR, val);
        return this;
    }

    /**
     * 获取「地址」值
     *
    */
    @JsonIgnore
    public String getAddr() {
        return (String) this._get(FIELD_ADDR);
    }

    /**
     * 判断 「地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAddr() {
        return this._contains(FIELD_ADDR);
    }

    /**
     * 重置 「地址」
     *
    */
    @JsonIgnore
    public DstAppDTO resetAddr() {
        this._reset(FIELD_ADDR);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public DstAppDTO setCreateDate(Timestamp val) {
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
    public DstAppDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public DstAppDTO setCreateMan(String val) {
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
    public DstAppDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public DstAppDTO setUpdateDate(Timestamp val) {
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
    public DstAppDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public DstAppDTO setUpdateMan(String val) {
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
    public DstAppDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
