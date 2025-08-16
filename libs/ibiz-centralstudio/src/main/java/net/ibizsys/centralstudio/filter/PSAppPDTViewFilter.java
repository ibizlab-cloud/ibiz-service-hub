package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPPDTVIEW 过滤器对象
 */
public class PSAppPDTViewFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppPDTViewFilter(){
    
    }      

    /**
     * 设置属性[预置视图名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter psapppdtviewname__like(String value){
        this.setFieldCond("psapppdtviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter psappviewid__eq(String value){
        this.setFieldCond("psappviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter psappviewname__eq(String value){
        this.setFieldCond("psappviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter psappviewname__like(String value){
        this.setFieldCond("psappviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统预置视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter pssyspdtviewid__eq(String value){
        this.setFieldCond("pssyspdtviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统预置视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter pssyspdtviewname__eq(String value){
        this.setFieldCond("pssyspdtviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统预置视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter pssyspdtviewname__like(String value){
        this.setFieldCond("pssyspdtviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
