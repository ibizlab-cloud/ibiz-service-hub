package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPUTILPAGE 过滤器对象
 */
public class PSAppUtilPageFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppUtilPageFilter(){
    
    }      

    /**
     * 设置属性[功能页面]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter psapputilpagename__eq(String value){
        this.setFieldCond("psapputilpagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能页面]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter psapputilpagename__like(String value){
        this.setFieldCond("psapputilpagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[绑定应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter psappviewid__eq(String value){
        this.setFieldCond("psappviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[绑定应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter psappviewname__eq(String value){
        this.setFieldCond("psappviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[绑定应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter psappviewname__like(String value){
        this.setFieldCond("psappviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter targettype__eq(String value){
        this.setFieldCond("targettype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
