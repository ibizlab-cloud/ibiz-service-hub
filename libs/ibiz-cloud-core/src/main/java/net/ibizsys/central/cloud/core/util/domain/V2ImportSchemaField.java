package net.ibizsys.central.cloud.core.util.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 导入主题相关属性
 * @author lionlau
 *
 */
public class V2ImportSchemaField extends EntityBase{

	 /**
     * 属性: 导入模式属性标识
     */
    public final static String FIELD_ID="id";

    /**
     * 属性: 导入属性
     */
    public final static String FIELD_NAME="name";

    /**
     * 属性: 导入标题
     */
    public final static String FIELD_CAPTION="caption";

    /**
     * 属性: 导入模式标识
     */
    public final static String FIELD_IMPORT_SCHEMA_ID="import_schema_id";

    /**
     * 属性: 代码表映射
     */
    public final static String FIELD_CODE_LIST_MAPPINGS="code_list_mappings";

    /**
     * 属性: 导入格式化
     */
    public final static String FIELD_IMPORT_FORMAT="import_format";

    /**
     * 属性: 索引位置
     */
    public final static String FIELD_INDEX="index";

    /**
     * 设置「导入模式属性标识」
     * @param val
     */
    @JsonIgnore
    public V2ImportSchemaField setId(String val) {
        this.set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「导入模式属性标识」值
     *
     */
    @JsonIgnore
    public String getId() {
        return DataTypeUtils.asString(this.get(FIELD_ID), null);
    }

    /**
     * 判断 「导入模式属性标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsId() {
        return this.contains(FIELD_ID);
    }

    /**
     * 重置 「导入模式属性标识」
     *
     */
    @JsonIgnore
    public V2ImportSchemaField resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「导入属性」
     * @param val
     */
    @JsonIgnore
    public V2ImportSchemaField setName(String val) {
        this.set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「导入属性」值
     *
     */
    @JsonIgnore
    public String getName() {
        return DataTypeUtils.asString(this.get(FIELD_NAME), null);
    }

    /**
     * 判断 「导入属性」是否有值
     *
     */
    @JsonIgnore
    public boolean containsName() {
        return this.contains(FIELD_NAME);
    }

    /**
     * 重置 「导入属性」
     *
     */
    @JsonIgnore
    public V2ImportSchemaField resetName() {
        this.reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「导入标题」
     * @param val
     */
    @JsonIgnore
    public V2ImportSchemaField setCaption(String val) {
        this.set(FIELD_CAPTION, val);
        return this;
    }

    /**
     * 获取「导入标题」值
     *
     */
    @JsonIgnore
    public String getCaption() {
        return DataTypeUtils.asString(this.get(FIELD_CAPTION), null);
    }

    /**
     * 判断 「导入标题」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCaption() {
        return this.contains(FIELD_CAPTION);
    }

    /**
     * 重置 「导入标题」
     *
     */
    @JsonIgnore
    public V2ImportSchemaField resetCaption() {
        this.reset(FIELD_CAPTION);
        return this;
    }

    /**
     * 设置「导入模式标识」
     * @param val
     */
    @JsonIgnore
    public V2ImportSchemaField setImportSchemaId(String val) {
        this.set(FIELD_IMPORT_SCHEMA_ID, val);
        return this;
    }

    /**
     * 获取「导入模式标识」值
     *
     */
    @JsonIgnore
    public String getImportSchemaId() {
        return DataTypeUtils.asString(this.get(FIELD_IMPORT_SCHEMA_ID), null);
    }

    /**
     * 判断 「导入模式标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImportSchemaId() {
        return this.contains(FIELD_IMPORT_SCHEMA_ID);
    }

    /**
     * 重置 「导入模式标识」
     *
     */
    @JsonIgnore
    public V2ImportSchemaField resetImportSchemaId() {
        this.reset(FIELD_IMPORT_SCHEMA_ID);
        return this;
    }

    /**
     * 设置「代码表映射」
     * @param val
     */
    @JsonIgnore
    public V2ImportSchemaField setCodeListMappings(List<IEntityDTO> val) {
        this.set(FIELD_CODE_LIST_MAPPINGS, val);
        return this;
    }

    /**
     * 获取「代码表映射」值
     *
     */
    @JsonIgnore
    public List<IEntityDTO> getCodeListMappings() {
        return (List<IEntityDTO>) this.get(FIELD_CODE_LIST_MAPPINGS);
    }

    /**
     * 判断 「代码表映射」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCodeListMappings() {
        return this.contains(FIELD_CODE_LIST_MAPPINGS);
    }

    /**
     * 重置 「代码表映射」
     *
     */
    @JsonIgnore
    public V2ImportSchemaField resetCodeListMappings() {
        this.reset(FIELD_CODE_LIST_MAPPINGS);
        return this;
    }

    /**
     * 设置「导入格式化」
     * @param val
     */
    @JsonIgnore
    public V2ImportSchemaField setImportFormat(String val) {
        this.set(FIELD_IMPORT_FORMAT, val);
        return this;
    }

    /**
     * 获取「导入格式化」值
     *
     */
    @JsonIgnore
    public String getImportFormat() {
        return DataTypeUtils.asString(this.get(FIELD_IMPORT_FORMAT), null);
    }

    /**
     * 判断 「导入格式化」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImportFormat() {
        return this.contains(FIELD_IMPORT_FORMAT);
    }

    /**
     * 重置 「导入格式化」
     *
     */
    @JsonIgnore
    public V2ImportSchemaField resetImportFormat() {
        this.reset(FIELD_IMPORT_FORMAT);
        return this;
    }

    /**
     * 设置「索引位置」
     * @param val
     */
    @JsonIgnore
    public V2ImportSchemaField setIndex(Integer val) {
        this.set(FIELD_INDEX, val);
        return this;
    }

    /**
     * 获取「索引位置」值
     *
     */
    @JsonIgnore
    public Integer getIndex() {
        return DataTypeUtils.asInteger(this.get(FIELD_INDEX), null);
    }

    /**
     * 判断 「索引位置」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIndex() {
        return this.contains(FIELD_INDEX);
    }

    /**
     * 重置 「索引位置」
     *
     */
    @JsonIgnore
    public V2ImportSchemaField resetIndex() {
        this.reset(FIELD_INDEX);
        return this;
    }

}
