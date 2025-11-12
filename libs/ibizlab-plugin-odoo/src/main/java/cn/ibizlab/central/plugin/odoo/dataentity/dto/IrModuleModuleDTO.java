package cn.ibizlab.central.plugin.odoo.dataentity.dto;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.central.util.IEntityDTO;


public class IrModuleModuleDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 应用标识
     */
    public final static String FIELD_APP_ID = "app_id";

    /**
     * 属性: 排序值
     */
    public final static String FIELD_ORDER = "order";

    /**
     * 属性: 资源标识
     */
    public final static String FIELD_RES_CODE = "res_code";

    /**
     * 属性: 应用
     */
    public final static String FIELD_APPLICATION = "application";

    /**
     * 属性: 作者
     */
    public final static String FIELD_AUTHOR = "author";

    /**
     * 属性: 自动安装
     */
    public final static String FIELD_AUTO_INSTALL = "auto_install";

    /**
     * 属性: 类别
     */
    public final static String FIELD_CATEGORY_ID = "category_id";

    /**
     * 属性: 协作者
     */
    public final static String FIELD_CONTRIBUTORS = "contributors";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 演示数据
     */
    public final static String FIELD_DEMO = "demo";

    /**
     * 属性: 描述
     */
    public final static String FIELD_DESCRIPTION = "description";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 图标网址
     */
    public final static String FIELD_ICON = "icon";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 导入的模块
     */
    public final static String FIELD_IMPORTED = "imported";

    /**
     * 属性: 已安装版本
     */
    public final static String FIELD_LATEST_VERSION = "latest_version";

    /**
     * 属性: 许可证
     */
    public final static String FIELD_LICENSE = "license";

    /**
     * 属性: 维护者
     */
    public final static String FIELD_MAINTAINER = "maintainer";

    /**
     * 属性: 菜单
     */
    public final static String FIELD_MENUS_BY_MODULE = "menus_by_module";

    /**
     * 属性: 模块类型
     */
    public final static String FIELD_MODULE_TYPE = "module_type";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 出版版本
     */
    public final static String FIELD_PUBLISHED_VERSION = "published_version";

    /**
     * 属性: 报表
     */
    public final static String FIELD_REPORTS_BY_MODULE = "reports_by_module";

    /**
     * 属性: 序列
     */
    public final static String FIELD_SEQUENCE = "sequence";

    /**
     * 属性: 模块名
     */
    public final static String FIELD_SHORTDESC = "shortdesc";

    /**
     * 属性: 状态
     */
    public final static String FIELD_STATE = "state";

    /**
     * 属性: 摘要
     */
    public final static String FIELD_SUMMARY = "summary";

    /**
     * 属性: ERP 企业版专属模块
     */
    public final static String FIELD_TO_BUY = "to_buy";

    /**
     * 属性: URL
     */
    public final static String FIELD_URL = "url";

    /**
     * 属性: 视图
     */
    public final static String FIELD_VIEWS_BY_MODULE = "views_by_module";

    /**
     * 属性: 网站
     */
    public final static String FIELD_WEBSITE = "website";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「应用标识」
     * @param val
     */
    @JsonProperty(FIELD_APP_ID)
    public IrModuleModuleDTO setAppId(String val) {
        this._set(FIELD_APP_ID, val);
        return this;
    }

    /**
     * 获取「应用标识」值
     *
     */
    @JsonIgnore
    public String getAppId() {
        return DataTypeUtils.asString(this._get(FIELD_APP_ID), null);
    }

    /**
     * 判断 「应用标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAppId() {
        return this._contains(FIELD_APP_ID);
    }

    /**
     * 重置 「应用标识」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetAppId() {
        this._reset(FIELD_APP_ID);
        return this;
    }

    /**
     * 设置「排序值」
     * @param val
     */
    @JsonProperty(FIELD_ORDER)
    public IrModuleModuleDTO setOrder(Integer val) {
        this._set(FIELD_ORDER, val);
        return this;
    }

    /**
     * 获取「排序值」值
     *
     */
    @JsonIgnore
    public Integer getOrder() {
        return DataTypeUtils.asInteger(this._get(FIELD_ORDER), null);
    }

    /**
     * 判断 「排序值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOrder() {
        return this._contains(FIELD_ORDER);
    }

    /**
     * 重置 「排序值」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetOrder() {
        this._reset(FIELD_ORDER);
        return this;
    }

    /**
     * 设置「资源标识」
     * @param val
     */
    @JsonProperty(FIELD_RES_CODE)
    public IrModuleModuleDTO setResCode(String val) {
        this._set(FIELD_RES_CODE, val);
        return this;
    }

    /**
     * 获取「资源标识」值
     *
     */
    @JsonIgnore
    public String getResCode() {
        return DataTypeUtils.asString(this._get(FIELD_RES_CODE), null);
    }

    /**
     * 判断 「资源标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResCode() {
        return this._contains(FIELD_RES_CODE);
    }

    /**
     * 重置 「资源标识」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetResCode() {
        this._reset(FIELD_RES_CODE);
        return this;
    }

    /**
     * 设置「应用」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_APPLICATION)
    public IrModuleModuleDTO setApplication(Integer val) {
        this._set(FIELD_APPLICATION, val);
        return this;
    }

    /**
     * 获取「应用」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getApplication() {
        return DataTypeUtils.asInteger(this._get(FIELD_APPLICATION), null);
    }

    /**
     * 判断 「应用」是否有值
     *
     */
    @JsonIgnore
    public boolean containsApplication() {
        return this._contains(FIELD_APPLICATION);
    }

    /**
     * 重置 「应用」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetApplication() {
        this._reset(FIELD_APPLICATION);
        return this;
    }

    /**
     * 设置「作者」
     * @param val
     */
    @JsonProperty(FIELD_AUTHOR)
    public IrModuleModuleDTO setAuthor(String val) {
        this._set(FIELD_AUTHOR, val);
        return this;
    }

    /**
     * 获取「作者」值
     *
     */
    @JsonIgnore
    public String getAuthor() {
        return DataTypeUtils.asString(this._get(FIELD_AUTHOR), null);
    }

    /**
     * 判断 「作者」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAuthor() {
        return this._contains(FIELD_AUTHOR);
    }

    /**
     * 重置 「作者」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetAuthor() {
        this._reset(FIELD_AUTHOR);
        return this;
    }

    /**
     * 设置「自动安装」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_AUTO_INSTALL)
    public IrModuleModuleDTO setAutoInstall(Integer val) {
        this._set(FIELD_AUTO_INSTALL, val);
        return this;
    }

    /**
     * 获取「自动安装」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAutoInstall() {
        return DataTypeUtils.asInteger(this._get(FIELD_AUTO_INSTALL), null);
    }

    /**
     * 判断 「自动安装」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAutoInstall() {
        return this._contains(FIELD_AUTO_INSTALL);
    }

    /**
     * 重置 「自动安装」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetAutoInstall() {
        this._reset(FIELD_AUTO_INSTALL);
        return this;
    }

    /**
     * 设置「类别」
     * @param val
     */
    @JsonProperty(FIELD_CATEGORY_ID)
    public IrModuleModuleDTO setCategoryId(String val) {
        this._set(FIELD_CATEGORY_ID, val);
        return this;
    }

    /**
     * 获取「类别」值
     *
     */
    @JsonIgnore
    public String getCategoryId() {
        return DataTypeUtils.asString(this._get(FIELD_CATEGORY_ID), null);
    }

    /**
     * 判断 「类别」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCategoryId() {
        return this._contains(FIELD_CATEGORY_ID);
    }

    /**
     * 重置 「类别」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetCategoryId() {
        this._reset(FIELD_CATEGORY_ID);
        return this;
    }

    /**
     * 设置「协作者」
     * @param val
     */
    @JsonProperty(FIELD_CONTRIBUTORS)
    public IrModuleModuleDTO setContributors(String val) {
        this._set(FIELD_CONTRIBUTORS, val);
        return this;
    }

    /**
     * 获取「协作者」值
     *
     */
    @JsonIgnore
    public String getContributors() {
        return DataTypeUtils.asString(this._get(FIELD_CONTRIBUTORS), null);
    }

    /**
     * 判断 「协作者」是否有值
     *
     */
    @JsonIgnore
    public boolean containsContributors() {
        return this._contains(FIELD_CONTRIBUTORS);
    }

    /**
     * 重置 「协作者」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetContributors() {
        this._reset(FIELD_CONTRIBUTORS);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public IrModuleModuleDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATE_DATE, val);
        return this;
    }

    /**
     * 获取「建立时间」值
     *
     */
    @JsonIgnore
    public Timestamp getCreateDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_CREATE_DATE), null);
    }

    /**
     * 判断 「建立时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATE_DATE);
    }

    /**
     * 重置 「建立时间」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public IrModuleModuleDTO setCreateUid(String val) {
        this._set(FIELD_CREATE_UID, val);
        return this;
    }

    /**
     * 获取「建立人」值
     * 代码表[云系统操作者]
     *
     */
    @JsonIgnore
    public String getCreateUid() {
        return DataTypeUtils.asString(this._get(FIELD_CREATE_UID), null);
    }

    /**
     * 判断 「建立人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateUid() {
        return this._contains(FIELD_CREATE_UID);
    }

    /**
     * 重置 「建立人」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「演示数据」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_DEMO)
    public IrModuleModuleDTO setDemo(Integer val) {
        this._set(FIELD_DEMO, val);
        return this;
    }

    /**
     * 获取「演示数据」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getDemo() {
        return DataTypeUtils.asInteger(this._get(FIELD_DEMO), null);
    }

    /**
     * 判断 「演示数据」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDemo() {
        return this._contains(FIELD_DEMO);
    }

    /**
     * 重置 「演示数据」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetDemo() {
        this._reset(FIELD_DEMO);
        return this;
    }

    /**
     * 设置「描述」
     * @param val
     */
    @JsonProperty(FIELD_DESCRIPTION)
    public IrModuleModuleDTO setDescription(String val) {
        this._set(FIELD_DESCRIPTION, val);
        return this;
    }

    /**
     * 获取「描述」值
     *
     */
    @JsonIgnore
    public String getDescription() {
        return DataTypeUtils.asString(this._get(FIELD_DESCRIPTION), null);
    }

    /**
     * 判断 「描述」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDescription() {
        return this._contains(FIELD_DESCRIPTION);
    }

    /**
     * 重置 「描述」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetDescription() {
        this._reset(FIELD_DESCRIPTION);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public IrModuleModuleDTO setDisplayName(String val) {
        this._set(FIELD_DISPLAY_NAME, val);
        return this;
    }

    /**
     * 获取「显示名称」值
     *
     */
    @JsonIgnore
    public String getDisplayName() {
        return DataTypeUtils.asString(this._get(FIELD_DISPLAY_NAME), null);
    }

    /**
     * 判断 「显示名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDisplayName() {
        return this._contains(FIELD_DISPLAY_NAME);
    }

    /**
     * 重置 「显示名称」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「图标网址」
     * @param val
     */
    @JsonProperty(FIELD_ICON)
    public IrModuleModuleDTO setIcon(String val) {
        this._set(FIELD_ICON, val);
        return this;
    }

    /**
     * 获取「图标网址」值
     *
     */
    @JsonIgnore
    public String getIcon() {
        return DataTypeUtils.asString(this._get(FIELD_ICON), null);
    }

    /**
     * 判断 「图标网址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIcon() {
        return this._contains(FIELD_ICON);
    }

    /**
     * 重置 「图标网址」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetIcon() {
        this._reset(FIELD_ICON);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public IrModuleModuleDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
     */
    @JsonIgnore
    public String getId() {
        return DataTypeUtils.asString(this._get(FIELD_ID), null);
    }

    /**
     * 判断 「标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「标识」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「导入的模块」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IMPORTED)
    public IrModuleModuleDTO setImported(Integer val) {
        this._set(FIELD_IMPORTED, val);
        return this;
    }

    /**
     * 获取「导入的模块」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getImported() {
        return DataTypeUtils.asInteger(this._get(FIELD_IMPORTED), null);
    }

    /**
     * 判断 「导入的模块」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImported() {
        return this._contains(FIELD_IMPORTED);
    }

    /**
     * 重置 「导入的模块」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetImported() {
        this._reset(FIELD_IMPORTED);
        return this;
    }

    /**
     * 设置「已安装版本」
     * @param val
     */
    @JsonProperty(FIELD_LATEST_VERSION)
    public IrModuleModuleDTO setLatestVersion(String val) {
        this._set(FIELD_LATEST_VERSION, val);
        return this;
    }

    /**
     * 获取「已安装版本」值
     *
     */
    @JsonIgnore
    public String getLatestVersion() {
        return DataTypeUtils.asString(this._get(FIELD_LATEST_VERSION), null);
    }

    /**
     * 判断 「已安装版本」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLatestVersion() {
        return this._contains(FIELD_LATEST_VERSION);
    }

    /**
     * 重置 「已安装版本」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetLatestVersion() {
        this._reset(FIELD_LATEST_VERSION);
        return this;
    }

    /**
     * 设置「许可证」
     * 代码表[许可证]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_module_module_license
     * @param val
     */
    @JsonProperty(FIELD_LICENSE)
    public IrModuleModuleDTO setLicense(String val) {
        this._set(FIELD_LICENSE, val);
        return this;
    }

    /**
     * 获取「许可证」值
     * 代码表[许可证]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_module_module_license
     *
     */
    @JsonIgnore
    public String getLicense() {
        return DataTypeUtils.asString(this._get(FIELD_LICENSE), null);
    }

    /**
     * 判断 「许可证」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLicense() {
        return this._contains(FIELD_LICENSE);
    }

    /**
     * 重置 「许可证」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetLicense() {
        this._reset(FIELD_LICENSE);
        return this;
    }

    /**
     * 设置「维护者」
     * @param val
     */
    @JsonProperty(FIELD_MAINTAINER)
    public IrModuleModuleDTO setMaintainer(String val) {
        this._set(FIELD_MAINTAINER, val);
        return this;
    }

    /**
     * 获取「维护者」值
     *
     */
    @JsonIgnore
    public String getMaintainer() {
        return DataTypeUtils.asString(this._get(FIELD_MAINTAINER), null);
    }

    /**
     * 判断 「维护者」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMaintainer() {
        return this._contains(FIELD_MAINTAINER);
    }

    /**
     * 重置 「维护者」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetMaintainer() {
        this._reset(FIELD_MAINTAINER);
        return this;
    }

    /**
     * 设置「菜单」
     * @param val
     */
    @JsonProperty(FIELD_MENUS_BY_MODULE)
    public IrModuleModuleDTO setMenusByModule(String val) {
        this._set(FIELD_MENUS_BY_MODULE, val);
        return this;
    }

    /**
     * 获取「菜单」值
     *
     */
    @JsonIgnore
    public String getMenusByModule() {
        return DataTypeUtils.asString(this._get(FIELD_MENUS_BY_MODULE), null);
    }

    /**
     * 判断 「菜单」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMenusByModule() {
        return this._contains(FIELD_MENUS_BY_MODULE);
    }

    /**
     * 重置 「菜单」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetMenusByModule() {
        this._reset(FIELD_MENUS_BY_MODULE);
        return this;
    }

    /**
     * 设置「模块类型」
     * 代码表[模块类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_module_module_module_type
     * @param val
     */
    @JsonProperty(FIELD_MODULE_TYPE)
    public IrModuleModuleDTO setModuleType(String val) {
        this._set(FIELD_MODULE_TYPE, val);
        return this;
    }

    /**
     * 获取「模块类型」值
     * 代码表[模块类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_module_module_module_type
     *
     */
    @JsonIgnore
    public String getModuleType() {
        return DataTypeUtils.asString(this._get(FIELD_MODULE_TYPE), null);
    }

    /**
     * 判断 「模块类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleType() {
        return this._contains(FIELD_MODULE_TYPE);
    }

    /**
     * 重置 「模块类型」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetModuleType() {
        this._reset(FIELD_MODULE_TYPE);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public IrModuleModuleDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getName() {
        return DataTypeUtils.asString(this._get(FIELD_NAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「出版版本」
     * @param val
     */
    @JsonProperty(FIELD_PUBLISHED_VERSION)
    public IrModuleModuleDTO setPublishedVersion(String val) {
        this._set(FIELD_PUBLISHED_VERSION, val);
        return this;
    }

    /**
     * 获取「出版版本」值
     *
     */
    @JsonIgnore
    public String getPublishedVersion() {
        return DataTypeUtils.asString(this._get(FIELD_PUBLISHED_VERSION), null);
    }

    /**
     * 判断 「出版版本」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPublishedVersion() {
        return this._contains(FIELD_PUBLISHED_VERSION);
    }

    /**
     * 重置 「出版版本」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetPublishedVersion() {
        this._reset(FIELD_PUBLISHED_VERSION);
        return this;
    }

    /**
     * 设置「报表」
     * @param val
     */
    @JsonProperty(FIELD_REPORTS_BY_MODULE)
    public IrModuleModuleDTO setReportsByModule(String val) {
        this._set(FIELD_REPORTS_BY_MODULE, val);
        return this;
    }

    /**
     * 获取「报表」值
     *
     */
    @JsonIgnore
    public String getReportsByModule() {
        return DataTypeUtils.asString(this._get(FIELD_REPORTS_BY_MODULE), null);
    }

    /**
     * 判断 「报表」是否有值
     *
     */
    @JsonIgnore
    public boolean containsReportsByModule() {
        return this._contains(FIELD_REPORTS_BY_MODULE);
    }

    /**
     * 重置 「报表」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetReportsByModule() {
        this._reset(FIELD_REPORTS_BY_MODULE);
        return this;
    }

    /**
     * 设置「序列」
     * @param val
     */
    @JsonProperty(FIELD_SEQUENCE)
    public IrModuleModuleDTO setSequence(Integer val) {
        this._set(FIELD_SEQUENCE, val);
        return this;
    }

    /**
     * 获取「序列」值
     *
     */
    @JsonIgnore
    public Integer getSequence() {
        return DataTypeUtils.asInteger(this._get(FIELD_SEQUENCE), null);
    }

    /**
     * 判断 「序列」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSequence() {
        return this._contains(FIELD_SEQUENCE);
    }

    /**
     * 重置 「序列」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetSequence() {
        this._reset(FIELD_SEQUENCE);
        return this;
    }

    /**
     * 设置「模块名」
     * @param val
     */
    @JsonProperty(FIELD_SHORTDESC)
    public IrModuleModuleDTO setShortdesc(String val) {
        this._set(FIELD_SHORTDESC, val);
        return this;
    }

    /**
     * 获取「模块名」值
     *
     */
    @JsonIgnore
    public String getShortdesc() {
        return DataTypeUtils.asString(this._get(FIELD_SHORTDESC), null);
    }

    /**
     * 判断 「模块名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsShortdesc() {
        return this._contains(FIELD_SHORTDESC);
    }

    /**
     * 重置 「模块名」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetShortdesc() {
        this._reset(FIELD_SHORTDESC);
        return this;
    }

    /**
     * 设置「状态」
     * 代码表[状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_module_module_state
     * @param val
     */
    @JsonProperty(FIELD_STATE)
    public IrModuleModuleDTO setState(String val) {
        this._set(FIELD_STATE, val);
        return this;
    }

    /**
     * 获取「状态」值
     * 代码表[状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_module_module_state
     *
     */
    @JsonIgnore
    public String getState() {
        return DataTypeUtils.asString(this._get(FIELD_STATE), null);
    }

    /**
     * 判断 「状态」是否有值
     *
     */
    @JsonIgnore
    public boolean containsState() {
        return this._contains(FIELD_STATE);
    }

    /**
     * 重置 「状态」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetState() {
        this._reset(FIELD_STATE);
        return this;
    }

    /**
     * 设置「摘要」
     * @param val
     */
    @JsonProperty(FIELD_SUMMARY)
    public IrModuleModuleDTO setSummary(String val) {
        this._set(FIELD_SUMMARY, val);
        return this;
    }

    /**
     * 获取「摘要」值
     *
     */
    @JsonIgnore
    public String getSummary() {
        return DataTypeUtils.asString(this._get(FIELD_SUMMARY), null);
    }

    /**
     * 判断 「摘要」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSummary() {
        return this._contains(FIELD_SUMMARY);
    }

    /**
     * 重置 「摘要」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetSummary() {
        this._reset(FIELD_SUMMARY);
        return this;
    }

    /**
     * 设置「ERP 企业版专属模块」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_TO_BUY)
    public IrModuleModuleDTO setToBuy(Integer val) {
        this._set(FIELD_TO_BUY, val);
        return this;
    }

    /**
     * 获取「ERP 企业版专属模块」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getToBuy() {
        return DataTypeUtils.asInteger(this._get(FIELD_TO_BUY), null);
    }

    /**
     * 判断 「ERP 企业版专属模块」是否有值
     *
     */
    @JsonIgnore
    public boolean containsToBuy() {
        return this._contains(FIELD_TO_BUY);
    }

    /**
     * 重置 「ERP 企业版专属模块」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetToBuy() {
        this._reset(FIELD_TO_BUY);
        return this;
    }

    /**
     * 设置「URL」
     * @param val
     */
    @JsonProperty(FIELD_URL)
    public IrModuleModuleDTO setUrl(String val) {
        this._set(FIELD_URL, val);
        return this;
    }

    /**
     * 获取「URL」值
     *
     */
    @JsonIgnore
    public String getUrl() {
        return DataTypeUtils.asString(this._get(FIELD_URL), null);
    }

    /**
     * 判断 「URL」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUrl() {
        return this._contains(FIELD_URL);
    }

    /**
     * 重置 「URL」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetUrl() {
        this._reset(FIELD_URL);
        return this;
    }

    /**
     * 设置「视图」
     * @param val
     */
    @JsonProperty(FIELD_VIEWS_BY_MODULE)
    public IrModuleModuleDTO setViewsByModule(String val) {
        this._set(FIELD_VIEWS_BY_MODULE, val);
        return this;
    }

    /**
     * 获取「视图」值
     *
     */
    @JsonIgnore
    public String getViewsByModule() {
        return DataTypeUtils.asString(this._get(FIELD_VIEWS_BY_MODULE), null);
    }

    /**
     * 判断 「视图」是否有值
     *
     */
    @JsonIgnore
    public boolean containsViewsByModule() {
        return this._contains(FIELD_VIEWS_BY_MODULE);
    }

    /**
     * 重置 「视图」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetViewsByModule() {
        this._reset(FIELD_VIEWS_BY_MODULE);
        return this;
    }

    /**
     * 设置「网站」
     * @param val
     */
    @JsonProperty(FIELD_WEBSITE)
    public IrModuleModuleDTO setWebsite(String val) {
        this._set(FIELD_WEBSITE, val);
        return this;
    }

    /**
     * 获取「网站」值
     *
     */
    @JsonIgnore
    public String getWebsite() {
        return DataTypeUtils.asString(this._get(FIELD_WEBSITE), null);
    }

    /**
     * 判断 「网站」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWebsite() {
        return this._contains(FIELD_WEBSITE);
    }

    /**
     * 重置 「网站」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetWebsite() {
        this._reset(FIELD_WEBSITE);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public IrModuleModuleDTO setWriteDate(Timestamp val) {
        this._set(FIELD_WRITE_DATE, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
     */
    @JsonIgnore
    public Timestamp getWriteDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_WRITE_DATE), null);
    }

    /**
     * 判断 「更新时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWriteDate() {
        return this._contains(FIELD_WRITE_DATE);
    }

    /**
     * 重置 「更新时间」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public IrModuleModuleDTO setWriteUid(String val) {
        this._set(FIELD_WRITE_UID, val);
        return this;
    }

    /**
     * 获取「更新人」值
     * 代码表[云系统操作者]
     *
     */
    @JsonIgnore
    public String getWriteUid() {
        return DataTypeUtils.asString(this._get(FIELD_WRITE_UID), null);
    }

    /**
     * 判断 「更新人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWriteUid() {
        return this._contains(FIELD_WRITE_UID);
    }

    /**
     * 重置 「更新人」
     *
     */
    @JsonIgnore
    public IrModuleModuleDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
