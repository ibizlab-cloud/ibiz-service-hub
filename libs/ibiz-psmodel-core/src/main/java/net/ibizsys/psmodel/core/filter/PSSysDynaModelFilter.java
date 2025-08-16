package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDYNAMODEL 过滤器对象
 */
public class PSSysDynaModelFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysDynaModelFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[模型格式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter dynamodelfmt__eq(String value){
        this.setFieldCond("dynamodelfmt", EQ, value);
        return this;
    }

    /**
     * 设置属性[模型用途]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter dynamodelusage__eq(String value){
        this.setFieldCond("dynamodelusage", EQ, value);
        return this;
    }

    /**
     * 设置属性[模型标记]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter modeltag__like(String value){
        this.setFieldCond("modeltag", LIKE, value);
        return this;
    }

    /**
     * 设置属性[父模型对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter ppssysdynamodelid__eq(String value){
        this.setFieldCond("ppssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[父模型对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter ppssysdynamodelname__eq(String value){
        this.setFieldCond("ppssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[父模型对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter ppssysdynamodelname__like(String value){
        this.setFieldCond("ppssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[模型分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter pssysdynamodelcatid__eq(String value){
        this.setFieldCond("pssysdynamodelcatid", EQ, value);
        return this;
    }

    /**
     * 设置属性[模型分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter pssysdynamodelcatname__eq(String value){
        this.setFieldCond("pssysdynamodelcatname", EQ, value);
        return this;
    }

    /**
     * 设置属性[模型分类]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter pssysdynamodelcatname__like(String value){
        this.setFieldCond("pssysdynamodelcatname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态模型对象名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态模型对象名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
