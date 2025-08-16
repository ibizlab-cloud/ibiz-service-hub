package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSREQITEM 过滤器对象
 */
public class PSSysReqItemFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysReqItemFilter(){
    
    }      

    /**
     * 设置属性[AI构建模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter aibuildmode__eq(Integer value){
        this.setFieldCond("aibuildmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI构建模式]过滤操作[IN]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter aibuildmode__in(Integer value){
        this.setFieldCond("aibuildmode", IN, value);
        return this;
    }

    /**
     * 设置属性[AI构建状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter aibuildstate__eq(Integer value){
        this.setFieldCond("aibuildstate", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI构建状态]过滤操作[IN]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter aibuildstate__in(Integer value){
        this.setFieldCond("aibuildstate", IN, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[项编号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter itemsn__eq(String value){
        this.setFieldCond("itemsn", EQ, value);
        return this;
    }

    /**
     * 设置属性[项编号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter itemsn__like(String value){
        this.setFieldCond("itemsn", LIKE, value);
        return this;
    }

    /**
     * 设置属性[项标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter itemtag__eq(String value){
        this.setFieldCond("itemtag", EQ, value);
        return this;
    }

    /**
     * 设置属性[项标记]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter itemtag__like(String value){
        this.setFieldCond("itemtag", LIKE, value);
        return this;
    }

    /**
     * 设置属性[项标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter itemtag2__eq(String value){
        this.setFieldCond("itemtag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[项标记2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter itemtag2__like(String value){
        this.setFieldCond("itemtag2", LIKE, value);
        return this;
    }

    /**
     * 设置属性[项标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter itemtag3__eq(String value){
        this.setFieldCond("itemtag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[项标记3]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter itemtag3__like(String value){
        this.setFieldCond("itemtag3", LIKE, value);
        return this;
    }

    /**
     * 设置属性[项标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter itemtag4__eq(String value){
        this.setFieldCond("itemtag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[项标记4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter itemtag4__like(String value){
        this.setFieldCond("itemtag4", LIKE, value);
        return this;
    }

    /**
     * 设置属性[项类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter itemtype__eq(String value){
        this.setFieldCond("itemtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[父需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter ppssysreqitemid__eq(String value){
        this.setFieldCond("ppssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[父需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter ppssysreqitemname__eq(String value){
        this.setFieldCond("ppssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[父需求项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter ppssysreqitemname__like(String value){
        this.setFieldCond("ppssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发产品]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter psdevprdid__eq(String value){
        this.setFieldCond("psdevprdid", EQ, value);
        return this;
    }

    /**
     * 设置属性[开发产品]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter psdevprdname__eq(String value){
        this.setFieldCond("psdevprdname", EQ, value);
        return this;
    }

    /**
     * 设置属性[开发产品]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter psdevprdname__like(String value){
        this.setFieldCond("psdevprdname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[产品规范]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter psdevprdspecid__eq(String value){
        this.setFieldCond("psdevprdspecid", EQ, value);
        return this;
    }

    /**
     * 设置属性[产品规范]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter psdevprdspecname__eq(String value){
        this.setFieldCond("psdevprdspecname", EQ, value);
        return this;
    }

    /**
     * 设置属性[产品规范]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter psdevprdspecname__like(String value){
        this.setFieldCond("psdevprdspecname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发产品主干]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter psdevprdverid__eq(String value){
        this.setFieldCond("psdevprdverid", EQ, value);
        return this;
    }

    /**
     * 设置属性[开发产品主干]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter psdevprdvername__eq(String value){
        this.setFieldCond("psdevprdvername", EQ, value);
        return this;
    }

    /**
     * 设置属性[开发产品主干]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter psdevprdvername__like(String value){
        this.setFieldCond("psdevprdvername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[需求模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter pssysreqmoduleid__eq(String value){
        this.setFieldCond("pssysreqmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[需求模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter pssysreqmodulename__eq(String value){
        this.setFieldCond("pssysreqmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[需求模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter pssysreqmodulename__like(String value){
        this.setFieldCond("pssysreqmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter pssysusecaseid__eq(String value){
        this.setFieldCond("pssysusecaseid", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercaseid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter pssysusecasename__eq(String value){
        this.setFieldCond("pssysusecasename", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercasename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统用例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter pssysusecasename__like(String value){
        this.setFieldCond("pssysusecasename", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercasename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[同步模型模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter syncmodelmode__eq(String value){
        this.setFieldCond("syncmodelmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
