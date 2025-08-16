package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPMODULE 过滤器对象
 */
public class PSAppModuleFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSAppModuleFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppModuleFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图主菜单方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppModuleFilter mainmenuside__eq(String value){
        this.setFieldCond("mainmenuside", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppModuleFilter psappmenuid__eq(String value){
        this.setFieldCond("psappmenuid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppModuleFilter psappmenuname__eq(String value){
        this.setFieldCond("psappmenuname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppModuleFilter psappmenuname__like(String value){
        this.setFieldCond("psappmenuname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用模块名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppModuleFilter psappmodulename__eq(String value){
        this.setFieldCond("psappmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用模块名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppModuleFilter psappmodulename__like(String value){
        this.setFieldCond("psappmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppModuleFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppModuleFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppModuleFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppModuleFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppModuleFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppModuleFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppModuleFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppModuleFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppModuleFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppModuleFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppModuleFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
