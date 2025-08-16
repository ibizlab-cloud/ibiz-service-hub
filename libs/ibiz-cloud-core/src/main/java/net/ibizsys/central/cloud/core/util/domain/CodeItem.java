package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 字典项
 * 
 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/.ibizmodel.index
 */
public class CodeItem extends EntityBase {

	/**
	 * . 标识
	 *
	 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/VKEY/.ibizmodel.index
	 */
	public final static String FIELD_VALUEKEY = "valuekey";

	/**
	 * . 目录代码
	 *
	 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/CID/.ibizmodel.index
	 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/minorpsders/DER1N_DICT_OPTION_DICT_CATALOG_CID/.ibizmodel.index
	 */
	public final static String FIELD_CATALOGID = "catalogid";

	/**
	 * . 目录
	 *
	 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/CNAME/.ibizmodel.index
	 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/minorpsders/DER1N_DICT_OPTION_DICT_CATALOG_CID/.ibizmodel.index
	 */
	public final static String FIELD_CATALOGNAME = "catalogname";

	/**
	 * . 代码值
	 *
	 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/VAL/.ibizmodel.index
	 */
	public final static String FIELD_VALUE = "value";

	/**
	 * . 名称
	 *
	 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/TEXT/.ibizmodel.index
	 */
	public final static String FIELD_TEXT = "text";

	/**
	 * . 父代码值
	 *
	 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/PVAL/.ibizmodel.index
	 */
	public final static String FIELD_PVALUE = "pvalue";

	/**
	 * . 过滤项
	 *
	 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/VFILTER/.ibizmodel.index
	 */
	public final static String FIELD_FILTER = "filter";

	/**
	 * . 栏目样式
	 *
	 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/CLS/.ibizmodel.index
	 */
	public final static String FIELD_CLS = "cls";

	/**
	 * . 图标
	 *
	 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/ICONCLS/.ibizmodel.index
	 */
	public final static String FIELD_ICONCLASS = "iconclass";
	
	
	/**
	 * . 图标路径
	 *
	 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/ICONURL/.ibizmodel.index
	 */
	public final static String FIELD_ICONURL = "iconurl";
	

	/**
	 * . 是否禁用
	 * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo}
	 *
	 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/DISABLED/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
	 */
	public final static String FIELD_DISABLED = "disabled";

	/**
	 * . 过期/失效
	 * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo}
	 *
	 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/EXPIRED/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
	 */
	public final static String FIELD_EXPIRED = "expired";

	/**
	 * . 排序
	 *
	 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/SHOWORDER/.ibizmodel.index
	 */
	public final static String FIELD_SHOWORDER = "showorder";

	/**
	 * . 扩展
	 *
	 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/EXTENSION/.ibizmodel.index
	 */
	public final static String FIELD_EXTENSION = "extension";

	/**
	 * . 最后修改时间
	 *
	 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/UPDATEDATE/.ibizmodel.index
	 */
	public final static String FIELD_UPDATEDATE = "updatedate";

	/**
	 * . 创建时间
	 *
	 * @see ibizmos:/psmodules/dict/psdataentities/DICT_OPTION/psdefields/CREATEDATE/.ibizmodel.index
	 */
	public final static String FIELD_CREATEDATE = "createdate";

	public final static String FIELD_COLOR = "color";

	public final static String FIELD_BKCOLOR = "bkcolor";

	/**
	 * 设置「标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CodeItem setValueKey(String val) {
		this.set(FIELD_VALUEKEY, val);
		return this;
	}

	/**
	 * 获取「标识」值
	 *
	 */
	@JsonIgnore
	public String getValueKey() {
		return (String) this.get(FIELD_VALUEKEY);
	}

	/**
	 * 判断 「标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsValueKey() {
		return this.contains(FIELD_VALUEKEY);
	}

	/**
	 * 重置 「标识」
	 *
	 */
	@JsonIgnore
	public CodeItem resetValueKey() {
		this.reset(FIELD_VALUEKEY);
		return this;
	}

	/**
	 * 设置「目录代码」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CodeItem setCatalogId(String val) {
		this.set(FIELD_CATALOGID, val);
		return this;
	}

	/**
	 * 获取「目录代码」值
	 *
	 */
	@JsonIgnore
	public String getCatalogId() {
		return (String) this.get(FIELD_CATALOGID);
	}

	/**
	 * 判断 「目录代码」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsCatalogId() {
		return this.contains(FIELD_CATALOGID);
	}

	/**
	 * 重置 「目录代码」
	 *
	 */
	@JsonIgnore
	public CodeItem resetCatalogId() {
		this.reset(FIELD_CATALOGID);
		return this;
	}

	/**
	 * 设置「目录」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CodeItem setCatalogName(String val) {
		this.set(FIELD_CATALOGNAME, val);
		return this;
	}

	/**
	 * 获取「目录」值
	 *
	 */
	@JsonIgnore
	public String getCatalogName() {
		return (String) this.get(FIELD_CATALOGNAME);
	}

	/**
	 * 判断 「目录」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsCatalogName() {
		return this.contains(FIELD_CATALOGNAME);
	}

	/**
	 * 重置 「目录」
	 *
	 */
	@JsonIgnore
	public CodeItem resetCatalogName() {
		this.reset(FIELD_CATALOGNAME);
		return this;
	}

	/**
	 * 设置「代码值」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CodeItem setValue(String val) {
		this.set(FIELD_VALUE, val);
		this.set("id", val);
		return this;
	}

	/**
	 * 获取「代码值」值
	 *
	 */
	@JsonIgnore
	public String getValue() {
		return (String) this.get(FIELD_VALUE);
	}

	/**
	 * 判断 「代码值」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsValue() {
		return this.contains(FIELD_VALUE);
	}

	/**
	 * 重置 「代码值」
	 *
	 */
	@JsonIgnore
	public CodeItem resetValue() {
		this.reset(FIELD_VALUE);
		return this;
	}

	/**
	 * 设置「名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CodeItem setText(String val) {
		this.set(FIELD_TEXT, val);
		this.set("label", val);
		return this;
	}

	/**
	 * 获取「名称」值
	 *
	 */
	@JsonIgnore
	public String getText() {
		return (String) this.get(FIELD_TEXT);
	}

	/**
	 * 判断 「名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsText() {
		return this.contains(FIELD_TEXT);
	}

	/**
	 * 重置 「名称」
	 *
	 */
	@JsonIgnore
	public CodeItem resetText() {
		this.reset(FIELD_TEXT);
		return this;
	}

	/**
	 * 设置「父代码值」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CodeItem setPValue(String val) {
		this.set(FIELD_PVALUE, val);
		return this;
	}

	/**
	 * 获取「父代码值」值
	 *
	 */
	@JsonIgnore
	public String getPValue() {
		return (String) this.get(FIELD_PVALUE);
	}

	/**
	 * 判断 「父代码值」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsPValue() {
		return this.contains(FIELD_PVALUE);
	}

	/**
	 * 重置 「父代码值」
	 *
	 */
	@JsonIgnore
	public CodeItem resetPValue() {
		this.reset(FIELD_PVALUE);
		return this;
	}

	/**
	 * 设置「过滤项」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CodeItem setFilter(String val) {
		this.set(FIELD_FILTER, val);
		return this;
	}

	/**
	 * 获取「过滤项」值
	 *
	 */
	@JsonIgnore
	public String getFilter() {
		return (String) this.get(FIELD_FILTER);
	}

	/**
	 * 判断 「过滤项」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsFilter() {
		return this.contains(FIELD_FILTER);
	}

	/**
	 * 重置 「过滤项」
	 *
	 */
	@JsonIgnore
	public CodeItem resetFilter() {
		this.reset(FIELD_FILTER);
		return this;
	}

	/**
	 * 设置「栏目样式」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CodeItem setCls(String val) {
		this.set(FIELD_CLS, val);
		return this;
	}

	/**
	 * 获取「栏目样式」值
	 *
	 */
	@JsonIgnore
	public String getCls() {
		return (String) this.get(FIELD_CLS);
	}

	/**
	 * 判断 「栏目样式」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsCls() {
		return this.contains(FIELD_CLS);
	}

	/**
	 * 重置 「栏目样式」
	 *
	 */
	@JsonIgnore
	public CodeItem resetCls() {
		this.reset(FIELD_CLS);
		return this;
	}

	/**
	 * 设置「图标」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CodeItem setIconClass(String val) {
		this.set(FIELD_ICONCLASS, val);
		return this;
	}

	/**
	 * 获取「图标」值
	 *
	 */
	@JsonIgnore
	public String getIconClass() {
		return (String) this.get(FIELD_ICONCLASS);
	}

	/**
	 * 判断 「图标」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsIconClass() {
		return this.contains(FIELD_ICONCLASS);
	}

	/**
	 * 重置 「图标」
	 *
	 */
	@JsonIgnore
	public CodeItem resetIconClass() {
		this.reset(FIELD_ICONCLASS);
		return this;
	}

	/**
	 * 设置「是否禁用」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CodeItem setDisabled(Boolean val) {
		this.set(FIELD_DISABLED, val);
		return this;
	}

	/**
	 * 获取「是否禁用」值
	 *
	 */
	@JsonIgnore
	public Boolean getDisabled() {
		try {
			return DataTypeUtils.getBooleanValue(this.get(FIELD_DISABLED), false);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「是否禁用」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDisabled() {
		return this.contains(FIELD_DISABLED);
	}

	/**
	 * 重置 「是否禁用」
	 *
	 */
	@JsonIgnore
	public CodeItem resetDisabled() {
		this.reset(FIELD_DISABLED);
		return this;
	}

	/**
	 * 设置「过期/失效」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CodeItem setExpired(Integer val) {
		this.set(FIELD_EXPIRED, val);
		return this;
	}

	/**
	 * 获取「过期/失效」值
	 *
	 */
	@JsonIgnore
	public Integer getExpired() {
		try {
			return DataTypeUtils.getIntegerValue(this.get(FIELD_EXPIRED), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「过期/失效」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsExpired() {
		return this.contains(FIELD_EXPIRED);
	}

	/**
	 * 重置 「过期/失效」
	 *
	 */
	@JsonIgnore
	public CodeItem resetExpired() {
		this.reset(FIELD_EXPIRED);
		return this;
	}

	/**
	 * 设置「排序」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CodeItem setShowOrder(Integer val) {
		this.set(FIELD_SHOWORDER, val);
		return this;
	}

	/**
	 * 获取「排序」值
	 *
	 */
	@JsonIgnore
	public Integer getShowOrder() {
		try {
			return DataTypeUtils.getIntegerValue(this.get(FIELD_SHOWORDER), null);
		} catch (Exception e) {
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
	public CodeItem resetShowOrder() {
		this.reset(FIELD_SHOWORDER);
		return this;
	}

	/**
	 * 设置「扩展」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CodeItem setExtension(String val) {
		this.set(FIELD_EXTENSION, val);
		return this;
	}

	/**
	 * 获取「扩展」值
	 *
	 */
	@JsonIgnore
	public String getExtension() {
		return (String) this.get(FIELD_EXTENSION);
	}

	/**
	 * 判断 「扩展」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsExtension() {
		return this.contains(FIELD_EXTENSION);
	}

	/**
	 * 重置 「扩展」
	 *
	 */
	@JsonIgnore
	public CodeItem resetExtension() {
		this.reset(FIELD_EXTENSION);
		return this;
	}

	/**
	 * 设置「最后修改时间」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CodeItem setUpdateDate(Timestamp val) {
		this.set(FIELD_UPDATEDATE, val);
		return this;
	}

	/**
	 * 获取「最后修改时间」值
	 *
	 */
	@JsonIgnore
	public Timestamp getUpdateDate() {
		try {
			return DataTypeUtils.getDateTimeValue(this.get(FIELD_UPDATEDATE), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「最后修改时间」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsUpdateDate() {
		return this.contains(FIELD_UPDATEDATE);
	}

	/**
	 * 重置 「最后修改时间」
	 *
	 */
	@JsonIgnore
	public CodeItem resetUpdateDate() {
		this.reset(FIELD_UPDATEDATE);
		return this;
	}

	/**
	 * 设置「创建时间」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CodeItem setCreateDate(Timestamp val) {
		this.set(FIELD_CREATEDATE, val);
		return this;
	}

	/**
	 * 获取「创建时间」值
	 *
	 */
	@JsonIgnore
	public Timestamp getCreateDate() {
		try {
			return DataTypeUtils.getDateTimeValue(this.get(FIELD_CREATEDATE), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「创建时间」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsCreateDate() {
		return this.contains(FIELD_CREATEDATE);
	}

	/**
	 * 重置 「创建时间」
	 *
	 */
	@JsonIgnore
	public CodeItem resetCreateDate() {
		this.reset(FIELD_CREATEDATE);
		return this;
	}
	
	
	
	/**
	 * 设置「栏目颜色」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CodeItem setColor(String val) {
		this.set(FIELD_COLOR, val);
		return this;
	}

	/**
	 * 获取「栏目颜色」值
	 *
	 */
	@JsonIgnore
	public String getColor() {
		return (String) this.get(FIELD_COLOR);
	}

	/**
	 * 判断 「栏目颜色」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsColor() {
		return this.contains(FIELD_COLOR);
	}

	/**
	 * 重置 「栏目颜色」
	 *
	 */
	@JsonIgnore
	public CodeItem resetColor() {
		this.reset(FIELD_COLOR);
		return this;
	}
	
	
	/**
	 * 设置「背景颜色」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CodeItem setBKColor(String val) {
		this.set(FIELD_BKCOLOR, val);
		return this;
	}

	/**
	 * 获取「背景颜色」值
	 *
	 */
	@JsonIgnore
	public String getBKColor() {
		return (String) this.get(FIELD_BKCOLOR);
	}

	/**
	 * 判断 「背景颜色」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsBKColor() {
		return this.contains(FIELD_BKCOLOR);
	}

	/**
	 * 重置 「背景颜色」
	 *
	 */
	@JsonIgnore
	public CodeItem resetBKColor() {
		this.reset(FIELD_BKCOLOR);
		return this;
	}
	
	/**
	 * 设置「图标」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CodeItem setIconUrl(String val) {
		this.set(FIELD_ICONURL, val);
		return this;
	}

	/**
	 * 获取「图标」值
	 *
	 */
	@JsonIgnore
	public String getIconUrl() {
		return (String) this.get(FIELD_ICONURL);
	}

	/**
	 * 判断 「图标」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsIconUrl() {
		return this.contains(FIELD_ICONURL);
	}

	/**
	 * 重置 「图标」
	 *
	 */
	@JsonIgnore
	public CodeItem resetIconUrl() {
		this.reset(FIELD_ICONURL);
		return this;
	}
}
