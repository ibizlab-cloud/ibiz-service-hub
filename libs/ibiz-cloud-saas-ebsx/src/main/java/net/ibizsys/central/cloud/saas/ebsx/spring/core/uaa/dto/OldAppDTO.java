package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 旧应用
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APP/.ibizmodel.index
 */
public class OldAppDTO extends EntityDTO {

  /**.
   * 应用标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APP/psdefields/APPID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 应用名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APP/psdefields/APPNAME/.ibizmodel.index
   */
  public final static String FIELD_LABEL = "label";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APP/psdefields/PSSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APP/minorpsders/DER1N_SYS_APP_SYS_PSSYSTEM_PSSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 全称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APP/psdefields/FULLNAME/.ibizmodel.index
   */
  public final static String FIELD_FULLNAME = "fullname";

  /**.
   * 类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.AppType} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APP/psdefields/APPTYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/AppType.ibizmodel.yaml
   */
  public final static String FIELD_TYPE = "type";

  /**.
   * 分组
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APP/psdefields/APPGROUP/.ibizmodel.index
   */
  public final static String FIELD_GROUP = "group";

  /**.
   * 图标
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APP/psdefields/ICON/.ibizmodel.index
   */
  public final static String FIELD_ICON = "icon";

  /**.
   * 可见
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APP/psdefields/VISABLED/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_VISABLED = "visabled";

  /**.
   * 地址
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APP/psdefields/ADDR/.ibizmodel.index
   */
  public final static String FIELD_ADDR = "addr";


    /**
     * 设置「应用标识」
     *
     * @param val
    */
    @JsonIgnore
    public OldAppDTO setId(String val) {
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
    public OldAppDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「应用名」
     *
     * @param val
    */
    @JsonIgnore
    public OldAppDTO setLabel(String val) {
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
    public OldAppDTO resetLabel() {
        this._reset(FIELD_LABEL);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public OldAppDTO setSystemId(String val) {
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
    public OldAppDTO resetSystemId() {
        this._reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「全称」
     *
     * @param val
    */
    @JsonIgnore
    public OldAppDTO setFullName(String val) {
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
    public OldAppDTO resetFullName() {
        this._reset(FIELD_FULLNAME);
        return this;
    }

    /**
     * 设置「类型」
     *
     * @param val
    */
    @JsonIgnore
    public OldAppDTO setType(String val) {
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
    public OldAppDTO resetType() {
        this._reset(FIELD_TYPE);
        return this;
    }

    /**
     * 设置「分组」
     *
     * @param val
    */
    @JsonIgnore
    public OldAppDTO setGroup(String val) {
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
    public OldAppDTO resetGroup() {
        this._reset(FIELD_GROUP);
        return this;
    }

    /**
     * 设置「图标」
     *
     * @param val
    */
    @JsonIgnore
    public OldAppDTO setIcon(String val) {
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
    public OldAppDTO resetIcon() {
        this._reset(FIELD_ICON);
        return this;
    }

    /**
     * 设置「可见」
     *
     * @param val
    */
    @JsonIgnore
    public OldAppDTO setVisabled(Integer val) {
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
    public OldAppDTO resetVisabled() {
        this._reset(FIELD_VISABLED);
        return this;
    }

    /**
     * 设置「地址」
     *
     * @param val
    */
    @JsonIgnore
    public OldAppDTO setAddr(String val) {
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
    public OldAppDTO resetAddr() {
        this._reset(FIELD_ADDR);
        return this;
    }


}
