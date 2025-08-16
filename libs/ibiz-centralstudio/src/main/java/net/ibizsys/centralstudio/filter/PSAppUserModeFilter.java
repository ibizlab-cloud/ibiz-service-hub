package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPUSERMODE 过滤器对象
 */
public class PSAppUserModeFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppUserModeFilter(){
    
    }      

    /**
     * 设置属性[应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter psappmenuid__eq(String value){
        this.setFieldCond("psappmenuid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter psappmenuname__eq(String value){
        this.setFieldCond("psappmenuname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter psappmenuname__like(String value){
        this.setFieldCond("psappmenuname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用用户模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter psappusermodename__like(String value){
        this.setFieldCond("psappusermodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter psappviewid__eq(String value){
        this.setFieldCond("psappviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter psappviewname__eq(String value){
        this.setFieldCond("psappviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter psappviewname__like(String value){
        this.setFieldCond("psappviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统用户模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter pssysusermodeid__eq(String value){
        this.setFieldCond("pssysusermodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统用户模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter pssysusermodename__eq(String value){
        this.setFieldCond("pssysusermodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统用户模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter pssysusermodename__like(String value){
        this.setFieldCond("pssysusermodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUserModeFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
