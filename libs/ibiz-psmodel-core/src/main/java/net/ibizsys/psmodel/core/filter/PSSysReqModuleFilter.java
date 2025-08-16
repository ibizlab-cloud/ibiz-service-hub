package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSREQMODULE 过滤器对象
 */
public class PSSysReqModuleFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysReqModuleFilter(){
    
    }      

    /**
     * 设置属性[AI构建模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter aibuildmode__eq(Integer value){
        this.setFieldCond("aibuildmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI构建模式]过滤操作[IN]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter aibuildmode__in(Integer value){
        this.setFieldCond("aibuildmode", IN, value);
        return this;
    }

    /**
     * 设置属性[AI构建状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter aibuildstate__eq(Integer value){
        this.setFieldCond("aibuildstate", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI构建状态]过滤操作[IN]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter aibuildstate__in(Integer value){
        this.setFieldCond("aibuildstate", IN, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[模块编号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter modulesn__eq(String value){
        this.setFieldCond("modulesn", EQ, value);
        return this;
    }

    /**
     * 设置属性[模块编号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter modulesn__like(String value){
        this.setFieldCond("modulesn", LIKE, value);
        return this;
    }

    /**
     * 设置属性[模块标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter moduletag__eq(String value){
        this.setFieldCond("moduletag", EQ, value);
        return this;
    }

    /**
     * 设置属性[模块标记]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter moduletag__like(String value){
        this.setFieldCond("moduletag", LIKE, value);
        return this;
    }

    /**
     * 设置属性[模块标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter moduletag2__eq(String value){
        this.setFieldCond("moduletag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[模块标记2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter moduletag2__like(String value){
        this.setFieldCond("moduletag2", LIKE, value);
        return this;
    }

    /**
     * 设置属性[模块标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter moduletag3__eq(String value){
        this.setFieldCond("moduletag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[模块标记3]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter moduletag3__like(String value){
        this.setFieldCond("moduletag3", LIKE, value);
        return this;
    }

    /**
     * 设置属性[模块标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter moduletag4__eq(String value){
        this.setFieldCond("moduletag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[模块标记4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter moduletag4__like(String value){
        this.setFieldCond("moduletag4", LIKE, value);
        return this;
    }

    /**
     * 设置属性[模块类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter moduletype__eq(String value){
        this.setFieldCond("moduletype", EQ, value);
        return this;
    }

    /**
     * 设置属性[父需求模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter ppssysreqmoduleid__eq(String value){
        this.setFieldCond("ppssysreqmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[父需求模块]过滤操作[ISNOTNULL]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter ppssysreqmoduleid__isnotnull(String value){
        this.setFieldCond("ppssysreqmoduleid", ISNOTNULL, value);
        return this;
    }

    /**
     * 设置属性[父需求模块]过滤操作[ISNULL]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter ppssysreqmoduleid__isnull(String value){
        this.setFieldCond("ppssysreqmoduleid", ISNULL, value);
        return this;
    }

    /**
     * 设置属性[父需求模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter ppssysreqmodulename__eq(String value){
        this.setFieldCond("ppssysreqmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[父需求模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter ppssysreqmodulename__like(String value){
        this.setFieldCond("ppssysreqmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发产品]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter psdevprdid__eq(String value){
        this.setFieldCond("psdevprdid", EQ, value);
        return this;
    }

    /**
     * 设置属性[开发产品]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter psdevprdname__eq(String value){
        this.setFieldCond("psdevprdname", EQ, value);
        return this;
    }

    /**
     * 设置属性[开发产品]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter psdevprdname__like(String value){
        this.setFieldCond("psdevprdname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发产品版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter psdevprdverid__eq(String value){
        this.setFieldCond("psdevprdverid", EQ, value);
        return this;
    }

    /**
     * 设置属性[开发产品版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter psdevprdvername__eq(String value){
        this.setFieldCond("psdevprdvername", EQ, value);
        return this;
    }

    /**
     * 设置属性[开发产品版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter psdevprdvername__like(String value){
        this.setFieldCond("psdevprdvername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssysactorid__eq(String value){
        this.setFieldCond("pssysactorid", EQ, value);
        return this;
    }

    /**
     * 设置属性[操作者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssysactorname__eq(String value){
        this.setFieldCond("pssysactorname", EQ, value);
        return this;
    }

    /**
     * 设置属性[操作者]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssysactorname__like(String value){
        this.setFieldCond("pssysactorname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统需求模块名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssysreqmodulename__eq(String value){
        this.setFieldCond("pssysreqmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统需求模块名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssysreqmodulename__like(String value){
        this.setFieldCond("pssysreqmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssysusecaseid__eq(String value){
        this.setFieldCond("pssysusecaseid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssysusecasename__eq(String value){
        this.setFieldCond("pssysusecasename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统用例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssysusecasename__like(String value){
        this.setFieldCond("pssysusecasename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
