package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPPORTLET 过滤器对象
 */
public class PSAppPortletFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppPortletFilter(){
    
    }      

    /**
     * 设置属性[应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter psappdataentityid__eq(String value){
        this.setFieldCond("psappdataentityid", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter psappdataentityname__eq(String value){
        this.setFieldCond("psappdataentityname", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter psappdataentityname__like(String value){
        this.setFieldCond("psappdataentityname", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用门户部件名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter psappportletname__like(String value){
        this.setFieldCond("psappportletname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统门户部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter pssysportletid__eq(String value){
        this.setFieldCond("pssysportletid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统门户部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter pssysportletname__eq(String value){
        this.setFieldCond("pssysportletname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统门户部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter pssysportletname__like(String value){
        this.setFieldCond("pssysportletname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
