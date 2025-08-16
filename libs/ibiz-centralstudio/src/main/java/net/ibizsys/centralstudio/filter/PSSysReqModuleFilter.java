package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSREQMODULE 过滤器对象
 */
public class PSSysReqModuleFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysReqModuleFilter(){
    
    }      

    /**
     * 设置属性[AI构建模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter aibuildmode__eq(Integer value){
        this.setFieldCond("aibuildmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[AI构建模式]过滤操作[IN]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter aibuildmode__in(Integer value){
        this.setFieldCond("aibuildmode", Conditions.IN, value);
        return this;
    }

    /**
     * 设置属性[AI构建状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter aibuildstate__eq(Integer value){
        this.setFieldCond("aibuildstate", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[AI构建状态]过滤操作[IN]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter aibuildstate__in(Integer value){
        this.setFieldCond("aibuildstate", Conditions.IN, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[模块编号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter modulesn__eq(String value){
        this.setFieldCond("modulesn", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模块编号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter modulesn__like(String value){
        this.setFieldCond("modulesn", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[模块标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter moduletag__eq(String value){
        this.setFieldCond("moduletag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模块标记]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter moduletag__like(String value){
        this.setFieldCond("moduletag", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[模块标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter moduletag2__eq(String value){
        this.setFieldCond("moduletag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模块标记2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter moduletag2__like(String value){
        this.setFieldCond("moduletag2", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[模块标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter moduletag3__eq(String value){
        this.setFieldCond("moduletag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模块标记3]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter moduletag3__like(String value){
        this.setFieldCond("moduletag3", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[模块标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter moduletag4__eq(String value){
        this.setFieldCond("moduletag4", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模块标记4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter moduletag4__like(String value){
        this.setFieldCond("moduletag4", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[模块类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter moduletype__eq(String value){
        this.setFieldCond("moduletype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父需求模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter ppssysreqmoduleid__eq(String value){
        this.setFieldCond("ppssysreqmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父需求模块]过滤操作[ISNOTNULL]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter ppssysreqmoduleid__isnotnull(String value){
        this.setFieldCond("ppssysreqmoduleid", Conditions.ISNOTNULL, value);
        return this;
    }

    /**
     * 设置属性[父需求模块]过滤操作[ISNULL]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter ppssysreqmoduleid__isnull(String value){
        this.setFieldCond("ppssysreqmoduleid", Conditions.ISNULL, value);
        return this;
    }

    /**
     * 设置属性[父需求模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter ppssysreqmodulename__eq(String value){
        this.setFieldCond("ppssysreqmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父需求模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter ppssysreqmodulename__like(String value){
        this.setFieldCond("ppssysreqmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发产品]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter psdevprdid__eq(String value){
        this.setFieldCond("psdevprdid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发产品]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter psdevprdname__eq(String value){
        this.setFieldCond("psdevprdname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发产品]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter psdevprdname__like(String value){
        this.setFieldCond("psdevprdname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发产品版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter psdevprdverid__eq(String value){
        this.setFieldCond("psdevprdverid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发产品版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter psdevprdvername__eq(String value){
        this.setFieldCond("psdevprdvername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发产品版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter psdevprdvername__like(String value){
        this.setFieldCond("psdevprdvername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统需求模块名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssysreqmodulename__eq(String value){
        this.setFieldCond("pssysreqmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统需求模块名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssysreqmodulename__like(String value){
        this.setFieldCond("pssysreqmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssysusecaseid__eq(String value){
        this.setFieldCond("pssysusecaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssysusecasename__eq(String value){
        this.setFieldCond("pssysusecasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统用例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter pssysusecasename__like(String value){
        this.setFieldCond("pssysusecasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqModuleFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

}
