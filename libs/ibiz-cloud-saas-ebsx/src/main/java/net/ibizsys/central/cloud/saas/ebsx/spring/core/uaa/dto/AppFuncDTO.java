package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 应用功能
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/.ibizmodel.index
 */
public class AppFuncDTO extends EntityDTO {

  /**.
   * 资源标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/PERMISSIONTAG/.ibizmodel.index
   */
  public final static String FIELD_PERMISSIONTAG = "permissiontag";

  /**.
   * 排序
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/SHOWORDER/.ibizmodel.index
   */
  public final static String FIELD_SHOWORDER = "showorder";

  /**.
   * 应用类别
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.AppCategory} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/APPCATEGORY/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/AppCategory.ibizmodel.yaml
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/minorpsders/DER1N_SYS_PSSYSAPPFUNC_SYS_PSSYSTEMAPP_PSSYSTEMAPPID/.ibizmodel.index
   */
  public final static String FIELD_APPCATEGORY = "appcategory";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 实例标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/DYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_DYNAINSTID = "dynainstid";

  /**.
   * 图标
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/ICON/.ibizmodel.index
   */
  public final static String FIELD_ICON = "icon";

  /**.
   * 图标样式
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/ICONCSS/.ibizmodel.index
   */
  public final static String FIELD_ICONCSS = "iconcss";

  /**.
   * 是否默认功能
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/ISDEFAULT/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISDEFAULT = "isdefault";

  /**.
   * 是否定制
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/ISPERSONAL/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISPERSONAL = "ispersonal";

  /**.
   * 是否移动端应用
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/MOBILEAPP/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/minorpsders/DER1N_SYS_PSSYSAPPFUNC_SYS_PSSYSTEMAPP_PSSYSTEMAPPID/.ibizmodel.index
   */
  public final static String FIELD_MOBILEAPP = "mobileapp";

  /**.
   * 应用功能标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/PSSYSAPPFUNCID/.ibizmodel.index
   */
  public final static String FIELD_PSSYSAPPFUNCID = "pssysappfuncid";

  /**.
   * 系统功能名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/PSSYSAPPFUNCNAME/.ibizmodel.index
   */
  public final static String FIELD_PSSYSAPPFUNCNAME = "pssysappfuncname";

  /**.
   * 系统应用标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/PSSYSTEMAPPID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/minorpsders/DER1N_SYS_PSSYSAPPFUNC_SYS_PSSYSTEMAPP_PSSYSTEMAPPID/.ibizmodel.index
   */
  public final static String FIELD_PSSYSTEMAPPID = "pssystemappid";

  /**.
   * 系统应用名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/PSSYSTEMAPPNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/minorpsders/DER1N_SYS_PSSYSAPPFUNC_SYS_PSSYSTEMAPP_PSSYSTEMAPPID/.ibizmodel.index
   */
  public final static String FIELD_PSSYSTEMAPPNAME = "pssystemappname";

  /**.
   * 应用设置
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/SETTING/.ibizmodel.index
   */
  public final static String FIELD_SETTING = "setting";

  /**.
   * 租户
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/SRFDCID/.ibizmodel.index
   */
  public final static String FIELD_SRFDCID = "srfdcid";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/minorpsders/DER1N_SYS_PSSYSAPPFUNC_SYS_PSSYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 提示
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/TIP/.ibizmodel.index
   */
  public final static String FIELD_TIP = "tip";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";

  /**.
   * 地址
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/URL/.ibizmodel.index
   */
  public final static String FIELD_URL = "url";

  /**.
   * 视图路径参数
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PSSYSAPPFUNC/psdefields/VIEWPATHPARAMS/.ibizmodel.index
   */
  public final static String FIELD_VIEWPATHPARAMS = "viewpathparams";


    /**
     * 设置「资源标识」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setPermissionTag(String val) {
        this._set(FIELD_PERMISSIONTAG, val);
        return this;
    }

    /**
     * 获取「资源标识」值
     *
    */
    @JsonIgnore
    public String getPermissionTag() {
        return (String) this._get(FIELD_PERMISSIONTAG);
    }

    /**
     * 判断 「资源标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPermissionTag() {
        return this._contains(FIELD_PERMISSIONTAG);
    }

    /**
     * 重置 「资源标识」
     *
    */
    @JsonIgnore
    public AppFuncDTO resetPermissionTag() {
        this._reset(FIELD_PERMISSIONTAG);
        return this;
    }

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setShowOrder(Integer val) {
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
    public AppFuncDTO resetShowOrder() {
        this._reset(FIELD_SHOWORDER);
        return this;
    }

    /**
     * 设置「应用类别」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setAppCategory(String val) {
        this._set(FIELD_APPCATEGORY, val);
        return this;
    }

    /**
     * 获取「应用类别」值
     *
    */
    @JsonIgnore
    public String getAppCategory() {
        return (String) this._get(FIELD_APPCATEGORY);
    }

    /**
     * 判断 「应用类别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAppCategory() {
        return this._contains(FIELD_APPCATEGORY);
    }

    /**
     * 重置 「应用类别」
     *
    */
    @JsonIgnore
    public AppFuncDTO resetAppCategory() {
        this._reset(FIELD_APPCATEGORY);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setCreateDate(Timestamp val) {
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
    public AppFuncDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setCreateMan(String val) {
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
    public AppFuncDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setDynaInstId(String val) {
        this._set(FIELD_DYNAINSTID, val);
        return this;
    }

    /**
     * 获取「实例标识」值
     *
    */
    @JsonIgnore
    public String getDynaInstId() {
        return (String) this._get(FIELD_DYNAINSTID);
    }

    /**
     * 判断 「实例标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDynaInstId() {
        return this._contains(FIELD_DYNAINSTID);
    }

    /**
     * 重置 「实例标识」
     *
    */
    @JsonIgnore
    public AppFuncDTO resetDynaInstId() {
        this._reset(FIELD_DYNAINSTID);
        return this;
    }

    /**
     * 设置「图标」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setIcon(String val) {
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
    public AppFuncDTO resetIcon() {
        this._reset(FIELD_ICON);
        return this;
    }

    /**
     * 设置「图标样式」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setIconCss(String val) {
        this._set(FIELD_ICONCSS, val);
        return this;
    }

    /**
     * 获取「图标样式」值
     *
    */
    @JsonIgnore
    public String getIconCss() {
        return (String) this._get(FIELD_ICONCSS);
    }

    /**
     * 判断 「图标样式」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIconCss() {
        return this._contains(FIELD_ICONCSS);
    }

    /**
     * 重置 「图标样式」
     *
    */
    @JsonIgnore
    public AppFuncDTO resetIconCss() {
        this._reset(FIELD_ICONCSS);
        return this;
    }

    /**
     * 设置「是否默认功能」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setIsDefault(Integer val) {
        this._set(FIELD_ISDEFAULT, val);
        return this;
    }

    /**
     * 获取「是否默认功能」值
     *
    */
    @JsonIgnore
    public Integer getIsDefault() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ISDEFAULT),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「是否默认功能」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIsDefault() {
        return this._contains(FIELD_ISDEFAULT);
    }

    /**
     * 重置 「是否默认功能」
     *
    */
    @JsonIgnore
    public AppFuncDTO resetIsDefault() {
        this._reset(FIELD_ISDEFAULT);
        return this;
    }

    /**
     * 设置「是否定制」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setIsPersonal(Integer val) {
        this._set(FIELD_ISPERSONAL, val);
        return this;
    }

    /**
     * 获取「是否定制」值
     *
    */
    @JsonIgnore
    public Integer getIsPersonal() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ISPERSONAL),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「是否定制」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIsPersonal() {
        return this._contains(FIELD_ISPERSONAL);
    }

    /**
     * 重置 「是否定制」
     *
    */
    @JsonIgnore
    public AppFuncDTO resetIsPersonal() {
        this._reset(FIELD_ISPERSONAL);
        return this;
    }

    /**
     * 设置「是否移动端应用」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setMobileApp(Integer val) {
        this._set(FIELD_MOBILEAPP, val);
        return this;
    }

    /**
     * 获取「是否移动端应用」值
     *
    */
    @JsonIgnore
    public Integer getMobileApp() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_MOBILEAPP),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「是否移动端应用」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMobileApp() {
        return this._contains(FIELD_MOBILEAPP);
    }

    /**
     * 重置 「是否移动端应用」
     *
    */
    @JsonIgnore
    public AppFuncDTO resetMobileApp() {
        this._reset(FIELD_MOBILEAPP);
        return this;
    }

    /**
     * 设置「应用功能标识」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setPSSysAppFuncId(String val) {
        this._set(FIELD_PSSYSAPPFUNCID, val);
        return this;
    }

    /**
     * 获取「应用功能标识」值
     *
    */
    @JsonIgnore
    public String getPSSysAppFuncId() {
        return (String) this._get(FIELD_PSSYSAPPFUNCID);
    }

    /**
     * 判断 「应用功能标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPSSysAppFuncId() {
        return this._contains(FIELD_PSSYSAPPFUNCID);
    }

    /**
     * 重置 「应用功能标识」
     *
    */
    @JsonIgnore
    public AppFuncDTO resetPSSysAppFuncId() {
        this._reset(FIELD_PSSYSAPPFUNCID);
        return this;
    }

    /**
     * 设置「系统功能名称」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setPSSysAppFuncName(String val) {
        this._set(FIELD_PSSYSAPPFUNCNAME, val);
        return this;
    }

    /**
     * 获取「系统功能名称」值
     *
    */
    @JsonIgnore
    public String getPSSysAppFuncName() {
        return (String) this._get(FIELD_PSSYSAPPFUNCNAME);
    }

    /**
     * 判断 「系统功能名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPSSysAppFuncName() {
        return this._contains(FIELD_PSSYSAPPFUNCNAME);
    }

    /**
     * 重置 「系统功能名称」
     *
    */
    @JsonIgnore
    public AppFuncDTO resetPSSysAppFuncName() {
        this._reset(FIELD_PSSYSAPPFUNCNAME);
        return this;
    }

    /**
     * 设置「系统应用标识」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setPSSystemAppId(String val) {
        this._set(FIELD_PSSYSTEMAPPID, val);
        return this;
    }

    /**
     * 获取「系统应用标识」值
     *
    */
    @JsonIgnore
    public String getPSSystemAppId() {
        return (String) this._get(FIELD_PSSYSTEMAPPID);
    }

    /**
     * 判断 「系统应用标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPSSystemAppId() {
        return this._contains(FIELD_PSSYSTEMAPPID);
    }

    /**
     * 重置 「系统应用标识」
     *
    */
    @JsonIgnore
    public AppFuncDTO resetPSSystemAppId() {
        this._reset(FIELD_PSSYSTEMAPPID);
        return this;
    }

    /**
     * 设置「系统应用名称」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setPSSystemAppName(String val) {
        this._set(FIELD_PSSYSTEMAPPNAME, val);
        return this;
    }

    /**
     * 获取「系统应用名称」值
     *
    */
    @JsonIgnore
    public String getPSSystemAppName() {
        return (String) this._get(FIELD_PSSYSTEMAPPNAME);
    }

    /**
     * 判断 「系统应用名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPSSystemAppName() {
        return this._contains(FIELD_PSSYSTEMAPPNAME);
    }

    /**
     * 重置 「系统应用名称」
     *
    */
    @JsonIgnore
    public AppFuncDTO resetPSSystemAppName() {
        this._reset(FIELD_PSSYSTEMAPPNAME);
        return this;
    }

    /**
     * 设置「应用设置」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setSetting(String val) {
        this._set(FIELD_SETTING, val);
        return this;
    }

    /**
     * 获取「应用设置」值
     *
    */
    @JsonIgnore
    public String getSetting() {
        return (String) this._get(FIELD_SETTING);
    }

    /**
     * 判断 「应用设置」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSetting() {
        return this._contains(FIELD_SETTING);
    }

    /**
     * 重置 「应用设置」
     *
    */
    @JsonIgnore
    public AppFuncDTO resetSetting() {
        this._reset(FIELD_SETTING);
        return this;
    }

    /**
     * 设置「租户」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setSrfdcid(String val) {
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
    public AppFuncDTO resetSrfdcid() {
        this._reset(FIELD_SRFDCID);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setSystemId(String val) {
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
    public AppFuncDTO resetSystemId() {
        this._reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「提示」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setTip(String val) {
        this._set(FIELD_TIP, val);
        return this;
    }

    /**
     * 获取「提示」值
     *
    */
    @JsonIgnore
    public String getTip() {
        return (String) this._get(FIELD_TIP);
    }

    /**
     * 判断 「提示」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTip() {
        return this._contains(FIELD_TIP);
    }

    /**
     * 重置 「提示」
     *
    */
    @JsonIgnore
    public AppFuncDTO resetTip() {
        this._reset(FIELD_TIP);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setUpdateDate(Timestamp val) {
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
    public AppFuncDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setUpdateMan(String val) {
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
    public AppFuncDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }

    /**
     * 设置「地址」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setUrl(String val) {
        this._set(FIELD_URL, val);
        return this;
    }

    /**
     * 获取「地址」值
     *
    */
    @JsonIgnore
    public String getUrl() {
        return (String) this._get(FIELD_URL);
    }

    /**
     * 判断 「地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUrl() {
        return this._contains(FIELD_URL);
    }

    /**
     * 重置 「地址」
     *
    */
    @JsonIgnore
    public AppFuncDTO resetUrl() {
        this._reset(FIELD_URL);
        return this;
    }

    /**
     * 设置「视图路径参数」
     *
     * @param val
    */
    @JsonIgnore
    public AppFuncDTO setViewPathParams(String val) {
        this._set(FIELD_VIEWPATHPARAMS, val);
        return this;
    }

    /**
     * 获取「视图路径参数」值
     *
    */
    @JsonIgnore
    public String getViewPathParams() {
        return (String) this._get(FIELD_VIEWPATHPARAMS);
    }

    /**
     * 判断 「视图路径参数」是否有值
     *
    */
    @JsonIgnore
    public boolean containsViewPathParams() {
        return this._contains(FIELD_VIEWPATHPARAMS);
    }

    /**
     * 重置 「视图路径参数」
     *
    */
    @JsonIgnore
    public AppFuncDTO resetViewPathParams() {
        this._reset(FIELD_VIEWPATHPARAMS);
        return this;
    }


}
