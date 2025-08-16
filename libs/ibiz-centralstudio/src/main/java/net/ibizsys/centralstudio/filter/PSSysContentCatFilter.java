package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSCONTENTCAT 过滤器对象
 */
public class PSSysContentCatFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysContentCatFilter(){
    
    }      

    /**
     * 设置属性[分类标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter cattag__eq(String value){
        this.setFieldCond("cattag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分类标记]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter cattag__like(String value){
        this.setFieldCond("cattag", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分类标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter cattag2__eq(String value){
        this.setFieldCond("cattag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分类标记2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter cattag2__like(String value){
        this.setFieldCond("cattag2", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[父分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter ppssyscontentcatid__eq(String value){
        this.setFieldCond("ppssyscontentcatid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter ppssyscontentcatname__eq(String value){
        this.setFieldCond("ppssyscontentcatname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父分类]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter ppssyscontentcatname__like(String value){
        this.setFieldCond("ppssyscontentcatname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统内容分类名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter pssyscontentcatname__like(String value){
        this.setFieldCond("pssyscontentcatname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
