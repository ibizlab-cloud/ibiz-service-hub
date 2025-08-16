package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSCONTENT 过滤器对象
 */
public class PSSysContentFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysContentFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter contenttag__eq(String value){
        this.setFieldCond("contenttag", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容标记]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter contenttag__like(String value){
        this.setFieldCond("contenttag", LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter contenttag2__eq(String value){
        this.setFieldCond("contenttag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容标记2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter contenttag2__like(String value){
        this.setFieldCond("contenttag2", LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter contenttag3__eq(String value){
        this.setFieldCond("contenttag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容标记3]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter contenttag3__like(String value){
        this.setFieldCond("contenttag3", LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter contenttag4__eq(String value){
        this.setFieldCond("contenttag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容标记4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter contenttag4__like(String value){
        this.setFieldCond("contenttag4", LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter contenttype__eq(String value){
        this.setFieldCond("contenttype", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统内容分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssyscontentcatid__eq(String value){
        this.setFieldCond("pssyscontentcatid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统内容分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssyscontentcatname__eq(String value){
        this.setFieldCond("pssyscontentcatname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统内容分类]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssyscontentcatname__like(String value){
        this.setFieldCond("pssyscontentcatname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统内容名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssyscontentname__eq(String value){
        this.setFieldCond("pssyscontentname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统内容名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssyscontentname__like(String value){
        this.setFieldCond("pssyscontentname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
