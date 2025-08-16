package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 应用功能
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/.ibizmodel.index
 */
public class AppFunc extends EntityBase {

  /**.
   * 资源标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/PERMISSIONTAG/.ibizmodel.index
   */
  public final static String FIELD_PERMISSIONTAG = "permissiontag";

  /**.
   * 排序
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/SHOWORDER/.ibizmodel.index
   */
  public final static String FIELD_SHOWORDER = "showorder";

  /**.
   * 应用类别
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.AppCategory} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/APPCATEGORY/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/AppCategory.ibizmodel.yaml
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/minorpsders/DER1N_SYS_APPFUNC_SYS_APPLICATION_APPLICATIONID/.ibizmodel.index
   */
  public final static String FIELD_APPCATEGORY = "appcategory";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 实例标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/DYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_DYNAINSTID = "dynainstid";

  /**.
   * 图标
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/ICON/.ibizmodel.index
   */
  public final static String FIELD_ICON = "icon";

  /**.
   * 图标样式
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/ICONCSS/.ibizmodel.index
   */
  public final static String FIELD_ICONCSS = "iconcss";

  /**.
   * 是否默认功能
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/ISDEFAULT/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISDEFAULT = "isdefault";

  /**.
   * 是否定制
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/ISPERSONAL/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISPERSONAL = "ispersonal";

  /**.
   * 是否移动端应用
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/MOBILEAPP/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/minorpsders/DER1N_SYS_APPFUNC_SYS_APPLICATION_APPLICATIONID/.ibizmodel.index
   */
  public final static String FIELD_MOBILEAPP = "mobileapp";

  /**.
   * 应用功能标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/APPFUNCID/.ibizmodel.index
   */
  public final static String FIELD_APPFUNCID = "appfuncid";

  /**.
   * 系统功能名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/APPFUNCNAME/.ibizmodel.index
   */
  public final static String FIELD_APPFUNCNAME = "appfuncname";

  /**.
   * 系统应用标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/APPLICATIONID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/minorpsders/DER1N_SYS_APPFUNC_SYS_APPLICATION_APPLICATIONID/.ibizmodel.index
   */
  public final static String FIELD_APPLICATIONID = "applicationid";

  /**.
   * 系统应用名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/APPLICATIONNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/minorpsders/DER1N_SYS_APPFUNC_SYS_APPLICATION_APPLICATIONID/.ibizmodel.index
   */
  public final static String FIELD_APPLICATIONNAME = "applicationname";

  /**.
   * 应用设置
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/SETTING/.ibizmodel.index
   */
  public final static String FIELD_SETTING = "setting";

  /**.
   * 租户
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/SRFDCID/.ibizmodel.index
   */
  public final static String FIELD_SRFDCID = "srfdcid";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/minorpsders/DER1N_SYS_APPFUNC_SYS_PSSYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 提示
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/TIP/.ibizmodel.index
   */
  public final static String FIELD_TIP = "tip";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";

  /**.
   * 地址
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/URL/.ibizmodel.index
   */
  public final static String FIELD_URL = "url";

  /**.
   * 视图路径参数
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APPFUNC/psdefields/VIEWPATHPARAMS/.ibizmodel.index
   */
  public final static String FIELD_VIEWPATHPARAMS = "viewpathparams";


    /**
     * 设置「资源标识」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setPermissionTag(String val) {
        this.set(FIELD_PERMISSIONTAG, val);
        return this;
    }

    /**
     * 获取「资源标识」值
     *
    */
    @JsonIgnore
    public String getPermissionTag() {
        return (String) this.get(FIELD_PERMISSIONTAG);
    }

    /**
     * 判断 「资源标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPermissionTag() {
        return this.contains(FIELD_PERMISSIONTAG);
    }

    /**
     * 重置 「资源标识」
     *
    */
    @JsonIgnore
    public AppFunc resetPermissionTag() {
        this.reset(FIELD_PERMISSIONTAG);
        return this;
    }

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setShowOrder(Integer val) {
        this.set(FIELD_SHOWORDER, val);
        return this;
    }

    /**
     * 获取「排序」值
     *
    */
    @JsonIgnore
    public Integer getShowOrder() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_SHOWORDER),null);
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
        return this.contains(FIELD_SHOWORDER);
    }

    /**
     * 重置 「排序」
     *
    */
    @JsonIgnore
    public AppFunc resetShowOrder() {
        this.reset(FIELD_SHOWORDER);
        return this;
    }

    /**
     * 设置「应用类别」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setAppCategory(String val) {
        this.set(FIELD_APPCATEGORY, val);
        return this;
    }

    /**
     * 获取「应用类别」值
     *
    */
    @JsonIgnore
    public String getAppCategory() {
        return (String) this.get(FIELD_APPCATEGORY);
    }

    /**
     * 判断 「应用类别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAppCategory() {
        return this.contains(FIELD_APPCATEGORY);
    }

    /**
     * 重置 「应用类别」
     *
    */
    @JsonIgnore
    public AppFunc resetAppCategory() {
        this.reset(FIELD_APPCATEGORY);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setCreateDate(Timestamp val) {
        this.set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「建立时间」值
     *
    */
    @JsonIgnore
    public Timestamp getCreateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this.get(FIELD_CREATEDATE),null);
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
        return this.contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「建立时间」
     *
    */
    @JsonIgnore
    public AppFunc resetCreateDate() {
        this.reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setCreateMan(String val) {
        this.set(FIELD_CREATEMAN, val);
        return this;
    }

    /**
     * 获取「建立人」值
     *
    */
    @JsonIgnore
    public String getCreateMan() {
        return (String) this.get(FIELD_CREATEMAN);
    }

    /**
     * 判断 「建立人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateMan() {
        return this.contains(FIELD_CREATEMAN);
    }

    /**
     * 重置 「建立人」
     *
    */
    @JsonIgnore
    public AppFunc resetCreateMan() {
        this.reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setDynaInstId(String val) {
        this.set(FIELD_DYNAINSTID, val);
        return this;
    }

    /**
     * 获取「实例标识」值
     *
    */
    @JsonIgnore
    public String getDynaInstId() {
        return (String) this.get(FIELD_DYNAINSTID);
    }

    /**
     * 判断 「实例标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDynaInstId() {
        return this.contains(FIELD_DYNAINSTID);
    }

    /**
     * 重置 「实例标识」
     *
    */
    @JsonIgnore
    public AppFunc resetDynaInstId() {
        this.reset(FIELD_DYNAINSTID);
        return this;
    }

    /**
     * 设置「图标」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setIcon(String val) {
        this.set(FIELD_ICON, val);
        return this;
    }

    /**
     * 获取「图标」值
     *
    */
    @JsonIgnore
    public String getIcon() {
        return (String) this.get(FIELD_ICON);
    }

    /**
     * 判断 「图标」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIcon() {
        return this.contains(FIELD_ICON);
    }

    /**
     * 重置 「图标」
     *
    */
    @JsonIgnore
    public AppFunc resetIcon() {
        this.reset(FIELD_ICON);
        return this;
    }

    /**
     * 设置「图标样式」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setIconCss(String val) {
        this.set(FIELD_ICONCSS, val);
        return this;
    }

    /**
     * 获取「图标样式」值
     *
    */
    @JsonIgnore
    public String getIconCss() {
        return (String) this.get(FIELD_ICONCSS);
    }

    /**
     * 判断 「图标样式」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIconCss() {
        return this.contains(FIELD_ICONCSS);
    }

    /**
     * 重置 「图标样式」
     *
    */
    @JsonIgnore
    public AppFunc resetIconCss() {
        this.reset(FIELD_ICONCSS);
        return this;
    }

    /**
     * 设置「是否默认功能」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setIsDefault(Integer val) {
        this.set(FIELD_ISDEFAULT, val);
        return this;
    }

    /**
     * 获取「是否默认功能」值
     *
    */
    @JsonIgnore
    public Integer getIsDefault() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_ISDEFAULT),null);
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
        return this.contains(FIELD_ISDEFAULT);
    }

    /**
     * 重置 「是否默认功能」
     *
    */
    @JsonIgnore
    public AppFunc resetIsDefault() {
        this.reset(FIELD_ISDEFAULT);
        return this;
    }

    /**
     * 设置「是否定制」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setIsPersonal(Integer val) {
        this.set(FIELD_ISPERSONAL, val);
        return this;
    }

    /**
     * 获取「是否定制」值
     *
    */
    @JsonIgnore
    public Integer getIsPersonal() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_ISPERSONAL),null);
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
        return this.contains(FIELD_ISPERSONAL);
    }

    /**
     * 重置 「是否定制」
     *
    */
    @JsonIgnore
    public AppFunc resetIsPersonal() {
        this.reset(FIELD_ISPERSONAL);
        return this;
    }

    /**
     * 设置「是否移动端应用」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setMobileApp(Integer val) {
        this.set(FIELD_MOBILEAPP, val);
        return this;
    }

    /**
     * 获取「是否移动端应用」值
     *
    */
    @JsonIgnore
    public Integer getMobileApp() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_MOBILEAPP),null);
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
        return this.contains(FIELD_MOBILEAPP);
    }

    /**
     * 重置 「是否移动端应用」
     *
    */
    @JsonIgnore
    public AppFunc resetMobileApp() {
        this.reset(FIELD_MOBILEAPP);
        return this;
    }

    /**
     * 设置「应用功能标识」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setAppFuncId(String val) {
        this.set(FIELD_APPFUNCID, val);
        return this;
    }

    /**
     * 获取「应用功能标识」值
     *
    */
    @JsonIgnore
    public String getAppFuncId() {
        return (String) this.get(FIELD_APPFUNCID);
    }

    /**
     * 判断 「应用功能标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAppFuncId() {
        return this.contains(FIELD_APPFUNCID);
    }

    /**
     * 重置 「应用功能标识」
     *
    */
    @JsonIgnore
    public AppFunc resetAppFuncId() {
        this.reset(FIELD_APPFUNCID);
        return this;
    }

    /**
     * 设置「系统功能名称」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setAppFuncName(String val) {
        this.set(FIELD_APPFUNCNAME, val);
        return this;
    }

    /**
     * 获取「系统功能名称」值
     *
    */
    @JsonIgnore
    public String getAppFuncName() {
        return (String) this.get(FIELD_APPFUNCNAME);
    }

    /**
     * 判断 「系统功能名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAppFuncName() {
        return this.contains(FIELD_APPFUNCNAME);
    }

    /**
     * 重置 「系统功能名称」
     *
    */
    @JsonIgnore
    public AppFunc resetAppFuncName() {
        this.reset(FIELD_APPFUNCNAME);
        return this;
    }

    /**
     * 设置「系统应用标识」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setApplicationId(String val) {
        this.set(FIELD_APPLICATIONID, val);
        return this;
    }

    /**
     * 获取「系统应用标识」值
     *
    */
    @JsonIgnore
    public String getApplicationId() {
        return (String) this.get(FIELD_APPLICATIONID);
    }

    /**
     * 判断 「系统应用标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsApplicationId() {
        return this.contains(FIELD_APPLICATIONID);
    }

    /**
     * 重置 「系统应用标识」
     *
    */
    @JsonIgnore
    public AppFunc resetApplicationId() {
        this.reset(FIELD_APPLICATIONID);
        return this;
    }

    /**
     * 设置「系统应用名称」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setApplicationName(String val) {
        this.set(FIELD_APPLICATIONNAME, val);
        return this;
    }

    /**
     * 获取「系统应用名称」值
     *
    */
    @JsonIgnore
    public String getApplicationName() {
        return (String) this.get(FIELD_APPLICATIONNAME);
    }

    /**
     * 判断 「系统应用名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsApplicationName() {
        return this.contains(FIELD_APPLICATIONNAME);
    }

    /**
     * 重置 「系统应用名称」
     *
    */
    @JsonIgnore
    public AppFunc resetApplicationName() {
        this.reset(FIELD_APPLICATIONNAME);
        return this;
    }

    /**
     * 设置「应用设置」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setSetting(String val) {
        this.set(FIELD_SETTING, val);
        return this;
    }

    /**
     * 获取「应用设置」值
     *
    */
    @JsonIgnore
    public String getSetting() {
        return (String) this.get(FIELD_SETTING);
    }

    /**
     * 判断 「应用设置」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSetting() {
        return this.contains(FIELD_SETTING);
    }

    /**
     * 重置 「应用设置」
     *
    */
    @JsonIgnore
    public AppFunc resetSetting() {
        this.reset(FIELD_SETTING);
        return this;
    }

    /**
     * 设置「租户」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setSrfdcid(String val) {
        this.set(FIELD_SRFDCID, val);
        return this;
    }

    /**
     * 获取「租户」值
     *
    */
    @JsonIgnore
    public String getSrfdcid() {
        return (String) this.get(FIELD_SRFDCID);
    }

    /**
     * 判断 「租户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSrfdcid() {
        return this.contains(FIELD_SRFDCID);
    }

    /**
     * 重置 「租户」
     *
    */
    @JsonIgnore
    public AppFunc resetSrfdcid() {
        this.reset(FIELD_SRFDCID);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setSystemId(String val) {
        this.set(FIELD_SYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统标识」值
     *
    */
    @JsonIgnore
    public String getSystemId() {
        return (String) this.get(FIELD_SYSTEMID);
    }

    /**
     * 判断 「系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSystemId() {
        return this.contains(FIELD_SYSTEMID);
    }

    /**
     * 重置 「系统标识」
     *
    */
    @JsonIgnore
    public AppFunc resetSystemId() {
        this.reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「提示」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setTip(String val) {
        this.set(FIELD_TIP, val);
        return this;
    }

    /**
     * 获取「提示」值
     *
    */
    @JsonIgnore
    public String getTip() {
        return (String) this.get(FIELD_TIP);
    }

    /**
     * 判断 「提示」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTip() {
        return this.contains(FIELD_TIP);
    }

    /**
     * 重置 「提示」
     *
    */
    @JsonIgnore
    public AppFunc resetTip() {
        this.reset(FIELD_TIP);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setUpdateDate(Timestamp val) {
        this.set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
    */
    @JsonIgnore
    public Timestamp getUpdateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this.get(FIELD_UPDATEDATE),null);
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
        return this.contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「更新时间」
     *
    */
    @JsonIgnore
    public AppFunc resetUpdateDate() {
        this.reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setUpdateMan(String val) {
        this.set(FIELD_UPDATEMAN, val);
        return this;
    }

    /**
     * 获取「更新人」值
     *
    */
    @JsonIgnore
    public String getUpdateMan() {
        return (String) this.get(FIELD_UPDATEMAN);
    }

    /**
     * 判断 「更新人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateMan() {
        return this.contains(FIELD_UPDATEMAN);
    }

    /**
     * 重置 「更新人」
     *
    */
    @JsonIgnore
    public AppFunc resetUpdateMan() {
        this.reset(FIELD_UPDATEMAN);
        return this;
    }

    /**
     * 设置「地址」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setUrl(String val) {
        this.set(FIELD_URL, val);
        return this;
    }

    /**
     * 获取「地址」值
     *
    */
    @JsonIgnore
    public String getUrl() {
        return (String) this.get(FIELD_URL);
    }

    /**
     * 判断 「地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUrl() {
        return this.contains(FIELD_URL);
    }

    /**
     * 重置 「地址」
     *
    */
    @JsonIgnore
    public AppFunc resetUrl() {
        this.reset(FIELD_URL);
        return this;
    }

    /**
     * 设置「视图路径参数」
     *
     * @param val
    */
    @JsonIgnore
    public AppFunc setViewPathParams(String val) {
        this.set(FIELD_VIEWPATHPARAMS, val);
        return this;
    }

    /**
     * 获取「视图路径参数」值
     *
    */
    @JsonIgnore
    public String getViewPathParams() {
        return (String) this.get(FIELD_VIEWPATHPARAMS);
    }

    /**
     * 判断 「视图路径参数」是否有值
     *
    */
    @JsonIgnore
    public boolean containsViewPathParams() {
        return this.contains(FIELD_VIEWPATHPARAMS);
    }

    /**
     * 重置 「视图路径参数」
     *
    */
    @JsonIgnore
    public AppFunc resetViewPathParams() {
        this.reset(FIELD_VIEWPATHPARAMS);
        return this;
    }


}
