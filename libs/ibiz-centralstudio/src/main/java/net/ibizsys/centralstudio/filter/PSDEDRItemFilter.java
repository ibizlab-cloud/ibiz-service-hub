package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDRITEM 过滤器对象
 */
public class PSDEDRItemFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDRItemFilter(){
    
    }      

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[计数显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter countermode__eq(Integer value){
        this.setFieldCond("countermode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系项类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter dritemtype__eq(String value){
        this.setFieldCond("dritemtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[启用模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter enablemode__eq(String value){
        this.setFieldCond("enablemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系附属实体标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter minorpsdeid__eq(String value){
        this.setFieldCond("minorpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系分组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter psdedrgroupid__eq(String value){
        this.setFieldCond("psdedrgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系分组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter psdedrgroupname__eq(String value){
        this.setFieldCond("psdedrgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系分组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter psdedrgroupname__like(String value){
        this.setFieldCond("psdedrgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系界面名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter psdedritemname__eq(String value){
        this.setFieldCond("psdedritemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系界面名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter psdedritemname__like(String value){
        this.setFieldCond("psdedritemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter psdeopprivid__eq(String value){
        this.setFieldCond("psdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter psdeopprivname__eq(String value){
        this.setFieldCond("psdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter psdeopprivname__like(String value){
        this.setFieldCond("psdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter psderid__eq(String value){
        this.setFieldCond("psderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter psdername__eq(String value){
        this.setFieldCond("psdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter psdername__like(String value){
        this.setFieldCond("psdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系数据展现视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系数据展现视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系数据展现视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系项显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系项显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系项显示图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[判断启用实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter testpsdeactionid__eq(String value){
        this.setFieldCond("testpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[判断启用实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter testpsdeactionname__eq(String value){
        this.setFieldCond("testpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[判断启用实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter testpsdeactionname__like(String value){
        this.setFieldCond("testpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter tippslanresid__eq(String value){
        this.setFieldCond("tippslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter tippslanresname__eq(String value){
        this.setFieldCond("tippslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter tippslanresname__like(String value){
        this.setFieldCond("tippslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDRItemFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
