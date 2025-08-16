package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPUSERMODE 过滤器对象
 */
public class PSAppUserModeFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSAppUserModeFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter psappmenuid__eq(String value){
        this.setFieldCond("psappmenuid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter psappmenuname__eq(String value){
        this.setFieldCond("psappmenuname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter psappmenuname__like(String value){
        this.setFieldCond("psappmenuname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用用户模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter psappusermodename__eq(String value){
        this.setFieldCond("psappusermodename", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用用户模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter psappusermodename__like(String value){
        this.setFieldCond("psappusermodename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter psappviewid__eq(String value){
        this.setFieldCond("psappviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter psappviewname__eq(String value){
        this.setFieldCond("psappviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter psappviewname__like(String value){
        this.setFieldCond("psappviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统用户模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter pssysusermodeid__eq(String value){
        this.setFieldCond("pssysusermodeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统用户模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter pssysusermodename__eq(String value){
        this.setFieldCond("pssysusermodename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统用户模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter pssysusermodename__like(String value){
        this.setFieldCond("pssysusermodename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
