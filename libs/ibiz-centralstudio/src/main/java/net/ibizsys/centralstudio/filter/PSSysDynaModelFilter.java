package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDYNAMODEL 过滤器对象
 */
public class PSSysDynaModelFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysDynaModelFilter(){
    
    }      

    /**
     * 设置属性[模型格式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter dynamodelfmt__eq(String value){
        this.setFieldCond("dynamodelfmt", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模型用途]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter dynamodelusage__eq(String value){
        this.setFieldCond("dynamodelusage", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模型标记]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter modeltag__like(String value){
        this.setFieldCond("modeltag", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[父模型对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter ppssysdynamodelid__eq(String value){
        this.setFieldCond("ppssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父模型对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter ppssysdynamodelname__eq(String value){
        this.setFieldCond("ppssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父模型对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter ppssysdynamodelname__like(String value){
        this.setFieldCond("ppssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[模型分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter pssysdynamodelcatid__eq(String value){
        this.setFieldCond("pssysdynamodelcatid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模型分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter pssysdynamodelcatname__eq(String value){
        this.setFieldCond("pssysdynamodelcatname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模型分类]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter pssysdynamodelcatname__like(String value){
        this.setFieldCond("pssysdynamodelcatname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态模型对象名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
