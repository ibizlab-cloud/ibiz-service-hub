package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSTESTMODULE 过滤器对象
 */
public class PSSysTestModuleFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysTestModuleFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestModuleFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[模块类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestModuleFilter moduletype__eq(String value){
        this.setFieldCond("moduletype", EQ, value);
        return this;
    }

    /**
     * 设置属性[测试模块名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestModuleFilter pssystestmodulename__eq(String value){
        this.setFieldCond("pssystestmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[测试模块名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestModuleFilter pssystestmodulename__like(String value){
        this.setFieldCond("pssystestmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[测试项目]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestModuleFilter pssystestprjid__eq(String value){
        this.setFieldCond("pssystestprjid", EQ, value);
        return this;
    }

    /**
     * 设置属性[测试项目]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestModuleFilter pssystestprjname__eq(String value){
        this.setFieldCond("pssystestprjname", EQ, value);
        return this;
    }

    /**
     * 设置属性[测试项目]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestModuleFilter pssystestprjname__like(String value){
        this.setFieldCond("pssystestprjname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestModuleFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestModuleFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestModuleFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestModuleFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestModuleFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
