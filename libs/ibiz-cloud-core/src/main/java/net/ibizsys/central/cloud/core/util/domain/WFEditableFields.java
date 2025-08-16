package net.ibizsys.central.cloud.core.util.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 工作流支持编辑的属性
 * 
 * 
 */
public class WFEditableFields extends WFEntityBase {

 
  public final static String FIELD_EDITMODE = "editMode";

 
  public final static String FIELD_FIELDMAP = "fieldMap";

  

	/**
	 * 不默认转化大小属性，兼容旧版本
	 */
	@Override
	protected boolean isLowerCaseName() {
		return false;
	}
	

    /**
     * 设置「模式」
     *
     * @param val
    */
    @JsonIgnore
    public WFEditableFields setEditMode(String val) {
        this.set(FIELD_EDITMODE, val);
        return this;
    }

    /**
     * 获取「模式」值
     *
    */
    @JsonIgnore
    public String getEditMode() {
        return (String) this.get(FIELD_EDITMODE);
    }

    /**
     * 判断 「模式」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEditMode() {
        return this.contains(FIELD_EDITMODE);
    }

    /**
     * 重置 「模式」
     *
    */
    @JsonIgnore
    public WFEditableFields resetEditMode() {
        this.reset(FIELD_EDITMODE);
        return this;
    }

    /**
     * 设置「属性列表」
     *
     * @param val
    */
    //@JsonIgnore
    @JsonProperty(FIELD_FIELDMAP)
    public WFEditableFields setFieldMap(List<String> val) {
        this.set(FIELD_FIELDMAP, val);
        return this;
    }

    /**
     * 获取「属性列表」值
     *
    */
    @JsonIgnore
    public List<String> getFieldMap() {
        return (List<String>) this.get(FIELD_FIELDMAP);
    }

    /**
     * 判断 「属性列表」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFieldMap() {
        return this.contains(FIELD_FIELDMAP);
    }

    /**
     * 重置 「属性列表」
     *
    */
    @JsonIgnore
    public WFEditableFields resetFieldMap() {
        this.reset(FIELD_FIELDMAP);
        return this;
    }

}
