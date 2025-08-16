package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSCONTENTCAT 过滤器对象
 */
public class PSSysContentCatFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysContentCatFilter(){
    
    }      

    /**
     * 设置属性[分类标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter cattag__eq(String value){
        this.setFieldCond("cattag", EQ, value);
        return this;
    }

    /**
     * 设置属性[分类标记]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter cattag__like(String value){
        this.setFieldCond("cattag", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分类标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter cattag2__eq(String value){
        this.setFieldCond("cattag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[分类标记2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter cattag2__like(String value){
        this.setFieldCond("cattag2", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[父分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter ppssyscontentcatid__eq(String value){
        this.setFieldCond("ppssyscontentcatid", EQ, value);
        return this;
    }

    /**
     * 设置属性[父分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter ppssyscontentcatname__eq(String value){
        this.setFieldCond("ppssyscontentcatname", EQ, value);
        return this;
    }

    /**
     * 设置属性[父分类]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter ppssyscontentcatname__like(String value){
        this.setFieldCond("ppssyscontentcatname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统内容分类名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter pssyscontentcatname__eq(String value){
        this.setFieldCond("pssyscontentcatname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统内容分类名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter pssyscontentcatname__like(String value){
        this.setFieldCond("pssyscontentcatname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysContentCatFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
