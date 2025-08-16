package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSCONTENT 过滤器对象
 */
public class PSSysContentFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysContentFilter(){
    
    }      

    /**
     * 设置属性[内容标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter contenttag__eq(String value){
        this.setFieldCond("contenttag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容标记]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter contenttag__like(String value){
        this.setFieldCond("contenttag", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter contenttag2__eq(String value){
        this.setFieldCond("contenttag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容标记2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter contenttag2__like(String value){
        this.setFieldCond("contenttag2", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter contenttag3__eq(String value){
        this.setFieldCond("contenttag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容标记3]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter contenttag3__like(String value){
        this.setFieldCond("contenttag3", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter contenttag4__eq(String value){
        this.setFieldCond("contenttag4", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容标记4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter contenttag4__like(String value){
        this.setFieldCond("contenttag4", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter contenttype__eq(String value){
        this.setFieldCond("contenttype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统内容分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssyscontentcatid__eq(String value){
        this.setFieldCond("pssyscontentcatid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统内容分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssyscontentcatname__eq(String value){
        this.setFieldCond("pssyscontentcatname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统内容分类]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssyscontentcatname__like(String value){
        this.setFieldCond("pssyscontentcatname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统内容名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssyscontentname__like(String value){
        this.setFieldCond("pssyscontentname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
