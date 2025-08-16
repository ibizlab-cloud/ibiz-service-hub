package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFGROUPDETAIL 过滤器对象
 */
public class PSDEFGroupDetailFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEFGroupDetailFilter(){
    
    }      

    /**
     * 设置属性[默认值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupDetailFilter defaultvaluetype__eq(String value){
        this.setFieldCond("defaultvaluetype", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("dvt", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupDetailFilter lnpslanresid__eq(String value){
        this.setFieldCond("lnpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupDetailFilter lnpslanresname__eq(String value){
        this.setFieldCond("lnpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupDetailFilter lnpslanresname__like(String value){
        this.setFieldCond("lnpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupDetailFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupDetailFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupDetailFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[成员名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupDetailFilter psdefgroupdetailname__like(String value){
        this.setFieldCond("psdefgroupdetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupDetailFilter psdefgroupid__eq(String value){
        this.setFieldCond("psdefgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupDetailFilter psdefgroupname__eq(String value){
        this.setFieldCond("psdefgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupDetailFilter psdefgroupname__like(String value){
        this.setFieldCond("psdefgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupDetailFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupDetailFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupDetailFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupDetailFilter pssysvalueruleid__eq(String value){
        this.setFieldCond("pssysvalueruleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupDetailFilter pssysvaluerulename__eq(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupDetailFilter pssysvaluerulename__like(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFGroupDetailFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
